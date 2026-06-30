package org.webrtc;

/* loaded from: classes15.dex */
public class Logging {
    private static final java.util.logging.Logger fallbackLogger = createFallbackLogger();
    private static org.webrtc.Loggable loggable;
    private static org.webrtc.Logging.Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    /* renamed from: org.webrtc.Logging$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity;

        static {
            int[] iArr = new int[org.webrtc.Logging.Severity.values().length];
            $SwitchMap$org$webrtc$Logging$Severity = iArr;
            try {
                iArr[org.webrtc.Logging.Severity.LS_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[org.webrtc.Logging.Severity.LS_WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[org.webrtc.Logging.Severity.LS_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes15.dex */
    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    @java.lang.Deprecated
    /* loaded from: classes5.dex */
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);

        public final int level;

        TraceLevel(int i17) {
            this.level = i17;
        }
    }

    private static java.util.logging.Logger createFallbackLogger() {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(java.util.logging.Level.ALL);
        return logger;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        log(org.webrtc.Logging.Severity.LS_INFO, str, str2);
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        log(org.webrtc.Logging.Severity.LS_ERROR, str, str2);
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(org.webrtc.Logging.Severity severity) {
        synchronized (org.webrtc.Logging.class) {
            if (loggable != null) {
                throw new java.lang.IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
            nativeEnableLogToDebugOutput(severity.ordinal());
            loggingEnabled = true;
        }
    }

    @java.lang.Deprecated
    public static void enableTracing(java.lang.String str, java.util.EnumSet<org.webrtc.Logging.TraceLevel> enumSet) {
    }

    private static java.lang.String getStackTraceString(java.lang.Throwable th6) {
        if (th6 == null) {
            return "";
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(org.webrtc.Loggable loggable2, org.webrtc.Logging.Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(org.webrtc.Logging.Severity severity, java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("Logging tag or message may not be null.");
        }
        if (loggable != null) {
            if (severity.ordinal() < loggableSeverity.ordinal()) {
                return;
            }
            loggable.onLogMessage(str2, severity, str);
        } else {
            if (loggingEnabled) {
                nativeLog(severity.ordinal(), str, str2);
                return;
            }
            int i17 = org.webrtc.Logging.AnonymousClass1.$SwitchMap$org$webrtc$Logging$Severity[severity.ordinal()];
            java.util.logging.Level level = i17 != 1 ? i17 != 2 ? i17 != 3 ? java.util.logging.Level.FINE : java.util.logging.Level.INFO : java.util.logging.Level.WARNING : java.util.logging.Level.SEVERE;
            fallbackLogger.log(level, str + ": " + str2);
        }
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i17);

    private static native void nativeLog(int i17, java.lang.String str, java.lang.String str2);

    public static void v(java.lang.String str, java.lang.String str2) {
        log(org.webrtc.Logging.Severity.LS_VERBOSE, str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        log(org.webrtc.Logging.Severity.LS_WARNING, str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        org.webrtc.Logging.Severity severity = org.webrtc.Logging.Severity.LS_ERROR;
        log(severity, str, str2);
        log(severity, str, th6.toString());
        log(severity, str, getStackTraceString(th6));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        org.webrtc.Logging.Severity severity = org.webrtc.Logging.Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th6.toString());
        log(severity, str, getStackTraceString(th6));
    }
}
