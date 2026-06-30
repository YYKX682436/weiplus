package lz0;

/* loaded from: classes5.dex */
public final class b implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f322314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322315e;

    public b(kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f322314d = qVar;
        this.f322315e = str;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.errorCode == 0) {
            z17 = true;
        }
        kotlinx.coroutines.q qVar = this.f322314d;
        if (!z17) {
            ((kotlinx.coroutines.r) qVar).s("", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.vfs.q7.c("maas_template_cover") + '/');
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(this.f322315e.getBytes());
        kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
        sb6.append(b17);
        ((kotlinx.coroutines.r) qVar).s(sb6.toString(), null);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
