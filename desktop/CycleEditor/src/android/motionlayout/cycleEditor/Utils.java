/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.motionlayout.cycleEditor;

/**
 * Class to hold utils used across the app
 */
public class Utils {
    /**
     * Get file name and location where this method is called.
     * Formatting it such that it is clickable by Intellij
     * @return (filename:line_no)
     */
    public static String getLoc() {
        StackTraceElement s = new Throwable().getStackTrace()[1];
        return ".("+s.getFileName()+":"+s.getLineNumber()+") "+s.getMethodName()+"()";
    }
    public static void debug(String str) {
        StackTraceElement s = new Throwable().getStackTrace()[1];
        System.out.println( ".("+s.getFileName()+":"+s.getLineNumber()+") "+s.getMethodName()+"() " +str);
    }

}
