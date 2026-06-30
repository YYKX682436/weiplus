package th5;

/* loaded from: classes4.dex */
public final class d1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f419362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419363g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f419364h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f419365i;

    public d1(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.c0 c0Var, java.lang.String str3, kotlinx.coroutines.q qVar, yz5.p pVar) {
        this.f419360d = str;
        this.f419361e = str2;
        this.f419362f = c0Var;
        this.f419363g = str3;
        this.f419364h = qVar;
        this.f419365i = pVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdnCallback mediaId=");
        sb6.append(mediaId);
        sb6.append(" startRet=");
        sb6.append(i17);
        sb6.append(" retCode=");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        sb6.append(" progress=");
        sb6.append(gVar);
        sb6.append(" scene=");
        java.lang.String str = this.f419360d;
        sb6.append(str.length() == 0 ? "-" : str);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoUrlDownloader", sb6.toString());
        if (gVar != null) {
            this.f419365i.invoke(java.lang.Long.valueOf(gVar.field_toltalLength), java.lang.Long.valueOf(gVar.field_finishedLength));
        }
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.field_retCode;
        kotlin.jvm.internal.c0 c0Var = this.f419362f;
        kotlinx.coroutines.q qVar = this.f419364h;
        java.lang.String str2 = this.f419361e;
        if (i18 == 0) {
            boolean j17 = com.tencent.mm.vfs.w6.j(str2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("downloadToPath cdn success fileExist=");
            sb7.append(j17);
            sb7.append(" scene=");
            sb7.append(str.length() == 0 ? "-" : str);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoUrlDownloader", sb7.toString());
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                if (j17) {
                    java.lang.String str3 = this.f419363g;
                    com.tencent.mm.vfs.w6.w(str2, str3);
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("downloadToPath ok=true scene=");
                    if (str.length() == 0) {
                        str = "-";
                    }
                    sb8.append(str);
                    sb8.append(" path=");
                    sb8.append(str3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoUrlDownloader", sb8.toString());
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                } else {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                }
            }
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("downloadToPath cdn failed retCode=");
            sb9.append(hVar.field_retCode);
            sb9.append(" scene=");
            if (str.length() == 0) {
                str = "-";
            }
            sb9.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoUrlDownloader", sb9.toString());
            com.tencent.mm.vfs.w6.h(str2);
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
