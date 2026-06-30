package io.flutter;

/* loaded from: classes15.dex */
public class Log {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    private static io.flutter.Log.Delegate logDelegate = null;
    private static int logLevel = 3;

    /* loaded from: classes15.dex */
    public interface Delegate {
        void d(java.lang.String str, java.lang.String str2);

        void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void e(java.lang.String str, java.lang.String str2);

        void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void i(java.lang.String str, java.lang.String str2);

        void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void println(int i17, java.lang.String str, java.lang.String str2);

        void v(java.lang.String str, java.lang.String str2);

        void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void w(java.lang.String str, java.lang.String str2);

        void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);

        void wtf(java.lang.String str, java.lang.String str2);

        void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th6);
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        io.flutter.Log.Delegate delegate;
        if (logLevel <= 3 && (delegate = logDelegate) != null) {
            delegate.d(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        io.flutter.Log.Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.e(str, str2);
        }
    }

    public static java.lang.String getStackTraceString(java.lang.Throwable th6) {
        return android.util.Log.getStackTraceString(th6);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        io.flutter.Log.Delegate delegate;
        if (logLevel <= 4 && (delegate = logDelegate) != null) {
            delegate.i(str, str2);
        }
    }

    public static void println(int i17, java.lang.String str, java.lang.String str2) {
        io.flutter.Log.Delegate delegate;
        if (logLevel <= i17 && (delegate = logDelegate) != null) {
            delegate.println(i17, str, str2);
        }
    }

    public static void setLogDelegate(io.flutter.Log.Delegate delegate) {
        logDelegate = delegate;
    }

    public static void setLogLevel(int i17) {
        logLevel = i17;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        io.flutter.Log.Delegate delegate;
        if (logLevel <= 2 && (delegate = logDelegate) != null) {
            delegate.v(str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        io.flutter.Log.Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.w(str, str2);
        }
    }

    public static void wtf(java.lang.String str, java.lang.String str2) {
        io.flutter.Log.Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.wtf(str, str2);
        } else {
            android.util.Log.wtf(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.flutter.Log.Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.e(str, str2, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.flutter.Log.Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.w(str, str2, th6);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.flutter.Log.Delegate delegate;
        if (logLevel <= 3 && (delegate = logDelegate) != null) {
            delegate.d(str, str2, th6);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.flutter.Log.Delegate delegate;
        if (logLevel <= 4 && (delegate = logDelegate) != null) {
            delegate.i(str, str2, th6);
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.flutter.Log.Delegate delegate;
        if (logLevel <= 2 && (delegate = logDelegate) != null) {
            delegate.v(str, str2, th6);
        }
    }

    public static void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        io.flutter.Log.Delegate delegate = logDelegate;
        if (delegate != null) {
            delegate.wtf(str, str2, th6);
        } else {
            android.util.Log.wtf(str, str2, th6);
        }
    }
}
