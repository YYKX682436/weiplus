package fp;

/* loaded from: classes12.dex */
public abstract class k {
    public static int a() {
        return new java.lang.Throwable().getStackTrace()[1].getLineNumber();
    }

    public static java.lang.String b() {
        return new java.lang.Throwable().getStackTrace()[1].toString();
    }

    public static java.lang.String c() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        return stackTraceElement.getMethodName().substring(stackTraceElement.getMethodName().lastIndexOf(46) + 1) + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }
}
