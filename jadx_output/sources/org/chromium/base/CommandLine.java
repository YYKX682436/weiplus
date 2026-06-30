package org.chromium.base;

@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public abstract class CommandLine {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String SWITCH_PREFIX = "--";
    private static final java.lang.String SWITCH_TERMINATOR = "--";
    private static final java.lang.String SWITCH_VALUE_SEPARATOR = "=";
    private static final java.lang.String TAG = "CommandLine";
    private static final java.util.concurrent.atomic.AtomicReference<org.chromium.base.CommandLine> sCommandLine = new java.util.concurrent.atomic.AtomicReference<>();

    /* loaded from: classes13.dex */
    public static class JavaCommandLine extends org.chromium.base.CommandLine {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private java.util.ArrayList<java.lang.String> mArgs;
        private int mArgsBegin;
        private java.util.HashMap<java.lang.String, java.lang.String> mSwitches;

        public JavaCommandLine(java.lang.String[] strArr) {
            super();
            java.lang.String str;
            this.mSwitches = new java.util.HashMap<>();
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            this.mArgs = arrayList;
            this.mArgsBegin = 1;
            if (strArr == null || strArr.length == 0 || (str = strArr[0]) == null) {
                arrayList.add("");
            } else {
                arrayList.add(str);
                appendSwitchesInternal(strArr, 1);
            }
        }

        private void appendSwitchesInternal(java.lang.String[] strArr, int i17) {
            boolean z17 = true;
            for (java.lang.String str : strArr) {
                if (i17 > 0) {
                    i17--;
                } else {
                    if (str.equals("--")) {
                        z17 = false;
                    }
                    if (z17 && str.startsWith("--")) {
                        java.lang.String[] split = str.split(org.chromium.base.CommandLine.SWITCH_VALUE_SEPARATOR, 2);
                        appendSwitchWithValue(split[0].substring(2), split.length > 1 ? split[1] : null);
                    } else {
                        this.mArgs.add(str);
                    }
                }
            }
        }

        @Override // org.chromium.base.CommandLine
        public void appendSwitch(java.lang.String str) {
            appendSwitchWithValue(str, null);
        }

        @Override // org.chromium.base.CommandLine
        public void appendSwitchWithValue(java.lang.String str, java.lang.String str2) {
            this.mSwitches.put(str, str2 == null ? "" : str2);
            java.lang.String str3 = "--" + str;
            if (str2 != null && !str2.isEmpty()) {
                str3 = str3 + org.chromium.base.CommandLine.SWITCH_VALUE_SEPARATOR + str2;
            }
            java.util.ArrayList<java.lang.String> arrayList = this.mArgs;
            int i17 = this.mArgsBegin;
            this.mArgsBegin = i17 + 1;
            arrayList.add(i17, str3);
        }

        @Override // org.chromium.base.CommandLine
        public void appendSwitchesAndArguments(java.lang.String[] strArr) {
            appendSwitchesInternal(strArr, 0);
        }

        @Override // org.chromium.base.CommandLine
        public java.lang.String[] getCommandLineArguments() {
            java.util.ArrayList<java.lang.String> arrayList = this.mArgs;
            return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }

        @Override // org.chromium.base.CommandLine
        public java.lang.String getSwitchValue(java.lang.String str) {
            java.lang.String str2 = this.mSwitches.get(str);
            if (str2 == null || str2.isEmpty()) {
                return null;
            }
            return str2;
        }

        @Override // org.chromium.base.CommandLine
        public java.util.Map<java.lang.String, java.lang.String> getSwitches() {
            return new java.util.HashMap(this.mSwitches);
        }

        @Override // org.chromium.base.CommandLine
        public boolean hasSwitch(java.lang.String str) {
            return this.mSwitches.containsKey(str);
        }

        @Override // org.chromium.base.CommandLine
        public void removeSwitch(java.lang.String str) {
            this.mSwitches.remove(str);
            java.lang.String str2 = "--" + str;
            for (int i17 = this.mArgsBegin - 1; i17 > 0; i17--) {
                if (!this.mArgs.get(i17).equals(str2)) {
                    if (!this.mArgs.get(i17).startsWith(str2 + org.chromium.base.CommandLine.SWITCH_VALUE_SEPARATOR)) {
                    }
                }
                this.mArgsBegin--;
                this.mArgs.remove(i17);
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class NativeCommandLine extends org.chromium.base.CommandLine {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public NativeCommandLine(java.lang.String[] strArr) {
            super();
            org.chromium.base.CommandLineJni.get().init(strArr);
        }

        @Override // org.chromium.base.CommandLine
        public void appendSwitch(java.lang.String str) {
            org.chromium.base.CommandLineJni.get().appendSwitch(str);
        }

        @Override // org.chromium.base.CommandLine
        public void appendSwitchWithValue(java.lang.String str, java.lang.String str2) {
            org.chromium.base.CommandLine.Natives natives = org.chromium.base.CommandLineJni.get();
            if (str2 == null) {
                str2 = "";
            }
            natives.appendSwitchWithValue(str, str2);
        }

        @Override // org.chromium.base.CommandLine
        public void appendSwitchesAndArguments(java.lang.String[] strArr) {
            org.chromium.base.CommandLineJni.get().appendSwitchesAndArguments(strArr);
        }

        @Override // org.chromium.base.CommandLine
        public void destroy() {
            throw new java.lang.IllegalStateException("Can't destroy native command line after startup");
        }

        @Override // org.chromium.base.CommandLine
        public java.lang.String[] getCommandLineArguments() {
            return null;
        }

        @Override // org.chromium.base.CommandLine
        public java.lang.String getSwitchValue(java.lang.String str) {
            return org.chromium.base.CommandLineJni.get().getSwitchValue(str);
        }

        @Override // org.chromium.base.CommandLine
        public java.util.Map<java.lang.String, java.lang.String> getSwitches() {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String[] switchesFlattened = org.chromium.base.CommandLineJni.get().getSwitchesFlattened();
            for (int i17 = 0; i17 < switchesFlattened.length; i17 += 2) {
                hashMap.put(switchesFlattened[i17], switchesFlattened[i17 + 1]);
            }
            return hashMap;
        }

        @Override // org.chromium.base.CommandLine
        public boolean hasSwitch(java.lang.String str) {
            return org.chromium.base.CommandLineJni.get().hasSwitch(str);
        }

        @Override // org.chromium.base.CommandLine
        public boolean isNativeImplementation() {
            return true;
        }

        @Override // org.chromium.base.CommandLine
        public void removeSwitch(java.lang.String str) {
            org.chromium.base.CommandLineJni.get().removeSwitch(str);
        }
    }

    /* loaded from: classes13.dex */
    public interface Natives {
        void appendSwitch(java.lang.String str);

        void appendSwitchWithValue(java.lang.String str, java.lang.String str2);

        void appendSwitchesAndArguments(java.lang.String[] strArr);

        java.lang.String getSwitchValue(java.lang.String str);

        java.lang.String[] getSwitchesFlattened();

        boolean hasSwitch(java.lang.String str);

        void init(java.lang.String[] strArr);

        void removeSwitch(java.lang.String str);
    }

    private CommandLine() {
    }

    public static void enableNativeProxy() {
        sCommandLine.set(new org.chromium.base.CommandLine.NativeCommandLine(getJavaSwitchesOrNull()));
    }

    public static org.chromium.base.CommandLine getInstance() {
        return sCommandLine.get();
    }

    public static java.lang.String[] getJavaSwitchesOrNull() {
        org.chromium.base.CommandLine commandLine = sCommandLine.get();
        if (commandLine != null) {
            return commandLine.getCommandLineArguments();
        }
        return null;
    }

    public static void init(java.lang.String[] strArr) {
        setInstance(new org.chromium.base.CommandLine.JavaCommandLine(strArr));
    }

    public static void initFromFile(java.lang.String str) {
        char[] readFileAsUtf8 = readFileAsUtf8(str);
        java.lang.String[] strArr = readFileAsUtf8 == null ? null : tokenizeQuotedArguments(readFileAsUtf8);
        init(strArr);
        if (strArr != null) {
            org.chromium.base.Log.i(TAG, "COMMAND-LINE FLAGS: %s (from %s)", java.util.Arrays.toString(strArr), str);
        }
    }

    public static boolean isInitialized() {
        return sCommandLine.get() != null;
    }

    private static char[] readFileAsUtf8(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.io.FileReader fileReader = new java.io.FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                char[] copyOfRange = java.util.Arrays.copyOfRange(cArr, 0, fileReader.read(cArr));
                fileReader.close();
                return copyOfRange;
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static void resetForTesting() {
        setInstance(null);
    }

    private static void setInstance(org.chromium.base.CommandLine commandLine) {
        org.chromium.base.CommandLine andSet = sCommandLine.getAndSet(commandLine);
        if (andSet != null) {
            andSet.destroy();
        }
    }

    public static java.lang.String[] tokenizeQuotedArguments(char[] cArr) {
        if (cArr.length > 98304) {
            throw new java.lang.RuntimeException("Flags file too big: " + cArr.length);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = null;
        char c17 = 0;
        for (char c18 : cArr) {
            if ((c17 == 0 && (c18 == '\'' || c18 == '\"')) || c18 == c17) {
                if (sb6 == null || sb6.length() <= 0 || sb6.charAt(sb6.length() - 1) != '\\') {
                    c17 = c17 == 0 ? c18 : (char) 0;
                } else {
                    sb6.setCharAt(sb6.length() - 1, c18);
                }
            } else if (c17 != 0 || !java.lang.Character.isWhitespace(c18)) {
                if (sb6 == null) {
                    sb6 = new java.lang.StringBuilder();
                }
                sb6.append(c18);
            } else if (sb6 != null) {
                arrayList.add(sb6.toString());
                sb6 = null;
            }
        }
        if (sb6 != null) {
            if (c17 != 0) {
                org.chromium.base.Log.w(TAG, "Unterminated quoted string: %s", sb6);
            }
            arrayList.add(sb6.toString());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public abstract void appendSwitch(java.lang.String str);

    public abstract void appendSwitchWithValue(java.lang.String str, java.lang.String str2);

    public abstract void appendSwitchesAndArguments(java.lang.String[] strArr);

    public void destroy() {
    }

    public abstract java.lang.String[] getCommandLineArguments();

    public abstract java.lang.String getSwitchValue(java.lang.String str);

    public java.lang.String getSwitchValue(java.lang.String str, java.lang.String str2) {
        java.lang.String switchValue = getSwitchValue(str);
        return android.text.TextUtils.isEmpty(switchValue) ? str2 : switchValue;
    }

    public abstract java.util.Map getSwitches();

    public abstract boolean hasSwitch(java.lang.String str);

    public boolean isNativeImplementation() {
        return false;
    }

    public abstract void removeSwitch(java.lang.String str);
}
