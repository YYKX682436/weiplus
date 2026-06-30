package com.tencent.thumbplayer.log;

/* loaded from: classes16.dex */
public interface ITPLogger {
    void debug(java.lang.String str);

    void error(java.lang.String str);

    java.lang.String getTag();

    void info(java.lang.String str);

    void printException(java.lang.Exception exc);

    void updateContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext);

    void updateTaskId(java.lang.String str);

    void verbose(java.lang.String str);

    void warn(java.lang.String str);
}
