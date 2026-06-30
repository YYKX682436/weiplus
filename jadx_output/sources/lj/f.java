package lj;

/* loaded from: classes12.dex */
public abstract class f {
    public static java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : android.os.Looper.getMainLooper().getThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static int[] b(int i17) {
        int i18 = Integer.MIN_VALUE;
        int i19 = Integer.MAX_VALUE;
        try {
            java.lang.String[] split = oj.d.f(java.lang.String.format("/proc/%s/stat", java.lang.Integer.valueOf(i17))).trim().split(" ");
            if (split.length >= 19) {
                i18 = java.lang.Integer.parseInt(split[17].trim());
                i19 = java.lang.Integer.parseInt(split[18].trim());
            }
            return new int[]{i18, i19};
        } catch (java.lang.Exception unused) {
            return new int[]{i18, Integer.MAX_VALUE};
        }
    }

    public static java.lang.String c() {
        return d(new java.lang.Throwable().getStackTrace(), "", -1);
    }

    public static java.lang.String d(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str, int i17) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 3) {
            return "";
        }
        if (i17 < 0) {
            i17 = Integer.MAX_VALUE;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" \n");
        for (int i18 = 3; i18 < stackTraceElementArr.length - 3 && i18 < i17; i18++) {
            sb6.append(str);
            sb6.append("at ");
            sb6.append(stackTraceElementArr[i18].getClassName());
            sb6.append(":");
            sb6.append(stackTraceElementArr[i18].getMethodName());
            sb6.append("(" + stackTraceElementArr[i18].getLineNumber() + ")");
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static java.lang.String e(java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static boolean f(java.lang.String str) {
        return str == null || str.equals("");
    }
}
