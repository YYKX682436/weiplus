package zl2;

/* loaded from: classes4.dex */
public final class l0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f473866d;

    public l0(kotlinx.coroutines.q qVar) {
        this.f473866d = qVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar == null) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUploadUtil", "[uploadCryptoImage] upload end,field_retCode:" + hVar.field_retCode + ",field_fileUrl:" + hVar.field_fileUrl);
        int i18 = hVar.field_retCode;
        kotlinx.coroutines.q qVar = this.f473866d;
        if (i18 != 0 || com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_fileUrl)) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            return 0;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(hVar.field_fileUrl));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
