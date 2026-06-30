package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes4.dex */
public class a implements com.tencent.qqmusic.mediaplayer.ILog {
    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void d(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void e(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e(str, str2);
    }

    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(str, str2);
    }

    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void w(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.w(str, str2);
    }

    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void e(java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, " throwable", new java.lang.Object[0]);
    }

    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, new java.lang.Object[0]);
    }

    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, new java.lang.Object[0]);
    }

    @Override // com.tencent.qqmusic.mediaplayer.ILog
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e(str, java.lang.String.format(str2, objArr));
    }
}
