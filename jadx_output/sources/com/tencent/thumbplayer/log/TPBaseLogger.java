package com.tencent.thumbplayer.log;

/* loaded from: classes16.dex */
public class TPBaseLogger implements com.tencent.thumbplayer.log.ITPLogger {
    private com.tencent.thumbplayer.log.TPLoggerContext mTPLoggerContext;
    private java.lang.String mTag;

    public TPBaseLogger(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.mTPLoggerContext = tPLoggerContext;
        this.mTag = tPLoggerContext.getTag();
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void debug(java.lang.String str) {
        com.tencent.thumbplayer.utils.TPLogUtil.d(this.mTPLoggerContext.getTag(), str);
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void error(java.lang.String str) {
        com.tencent.thumbplayer.utils.TPLogUtil.e(this.mTPLoggerContext.getTag(), str);
    }

    public com.tencent.thumbplayer.log.TPLoggerContext getTPLoggerContext() {
        return this.mTPLoggerContext;
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public java.lang.String getTag() {
        return this.mTPLoggerContext.getTag();
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void info(java.lang.String str) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.mTPLoggerContext.getTag(), str);
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void printException(java.lang.Exception exc) {
        com.tencent.thumbplayer.utils.TPLogUtil.e(this.mTPLoggerContext.getTag(), exc);
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void updateContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        if (tPLoggerContext == null) {
            this.mTPLoggerContext = new com.tencent.thumbplayer.log.TPLoggerContext(this.mTag);
        } else {
            this.mTPLoggerContext = tPLoggerContext;
        }
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void updateTaskId(java.lang.String str) {
        this.mTPLoggerContext.setTaskId(str);
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void verbose(java.lang.String str) {
        com.tencent.thumbplayer.utils.TPLogUtil.v(this.mTPLoggerContext.getTag(), str);
    }

    @Override // com.tencent.thumbplayer.log.ITPLogger
    public void warn(java.lang.String str) {
        com.tencent.thumbplayer.utils.TPLogUtil.w(this.mTPLoggerContext.getTag(), str);
    }

    public TPBaseLogger(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext, java.lang.String str) {
        com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext2 = new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, str);
        this.mTPLoggerContext = tPLoggerContext2;
        this.mTag = tPLoggerContext2.getTag();
    }
}
