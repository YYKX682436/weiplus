package p05;

/* loaded from: classes3.dex */
public final class f2 implements com.tencent.tav.decoder.logger.ILog {
    @Override // com.tencent.tav.decoder.logger.ILog
    public void d(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void e(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.TAVKit:" + str, java.lang.String.valueOf(str2));
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TAVKit:" + str, str2);
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void v(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void w(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.w("MicroMsg.TAVKit:" + str, java.lang.String.valueOf(str2));
    }

    @Override // com.tencent.tav.decoder.logger.ILog
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TAVKit:" + str, th6, java.lang.String.valueOf(str2), new java.lang.Object[0]);
    }
}
