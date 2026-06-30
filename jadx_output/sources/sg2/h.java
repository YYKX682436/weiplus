package sg2;

/* loaded from: classes4.dex */
public final class h implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f407902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f407903f;

    public h(java.lang.String str, kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f407901d = str;
        this.f407902e = c0Var;
        this.f407903f = qVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadCdnRes cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        com.tencent.mars.xlog.Log.i("FinderGesturesFilesManager", sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.field_retCode;
        kotlinx.coroutines.q qVar = this.f407903f;
        kotlin.jvm.internal.c0 c0Var = this.f407902e;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("FinderGesturesFilesManager", "#downloadCdnRes success, fileExist:" + com.tencent.mm.vfs.w6.j(this.f407901d));
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderGesturesFilesManager", "#downloadCdnRes failed, " + hVar.field_retCode);
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
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
