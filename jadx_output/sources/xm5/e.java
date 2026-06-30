package xm5;

/* loaded from: classes7.dex */
public class e {
    public java.lang.String toString() {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 3; i17 < stackTrace.length; i17++) {
            if (stackTrace[i17].getClassName().contains("com.tencent.mm") && !stackTrace[i17].getClassName().contains("sdk.platformtools.Log")) {
                sb6.append("[");
                sb6.append(stackTrace[i17].getClassName().substring(15));
                sb6.append(":");
                sb6.append(stackTrace[i17].getMethodName());
                sb6.append("(" + stackTrace[i17].getLineNumber() + ")]");
            }
        }
        return sb6.toString();
    }
}
