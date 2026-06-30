package tw0;

/* loaded from: classes4.dex */
public final class g implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f422433d;

    public g(kotlin.coroutines.Continuation continuation) {
        this.f422433d = continuation;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.toString()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i("RecommendTitleService", "on cdn callback  mediaId = %s, startRet = %d, sceneResult %s", objArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on cdn callback  progressInfo = ");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.field_status) : null);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("RecommendTitleService", sb6.toString());
        if (!(str == null || str.length() == 0) && i17 == 0 && hVar != null) {
            java.lang.String field_fileUrl = hVar.field_fileUrl;
            kotlin.jvm.internal.o.f(field_fileUrl, "field_fileUrl");
            if ((field_fileUrl.length() > 0) && hVar.field_retCode == 0) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f422433d.resumeWith(kotlin.Result.m521constructorimpl(hVar.field_fileUrl));
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
