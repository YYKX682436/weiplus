package com.tencent.shadow.core.common;

/* loaded from: classes13.dex */
public interface Logger {
    void debug(java.lang.String str);

    void debug(java.lang.String str, java.lang.Object obj);

    void debug(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void debug(java.lang.String str, java.lang.Throwable th6);

    void debug(java.lang.String str, java.lang.Object... objArr);

    void error(java.lang.String str);

    void error(java.lang.String str, java.lang.Object obj);

    void error(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void error(java.lang.String str, java.lang.Throwable th6);

    void error(java.lang.String str, java.lang.Object... objArr);

    void flush();

    java.lang.String getName();

    void info(java.lang.String str);

    void info(java.lang.String str, java.lang.Object obj);

    void info(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void info(java.lang.String str, java.lang.Throwable th6);

    void info(java.lang.String str, java.lang.Object... objArr);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(java.lang.String str);

    void trace(java.lang.String str, java.lang.Object obj);

    void trace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void trace(java.lang.String str, java.lang.Throwable th6);

    void trace(java.lang.String str, java.lang.Object... objArr);

    void warn(java.lang.String str);

    void warn(java.lang.String str, java.lang.Object obj);

    void warn(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    void warn(java.lang.String str, java.lang.Throwable th6);

    void warn(java.lang.String str, java.lang.Object... objArr);
}
