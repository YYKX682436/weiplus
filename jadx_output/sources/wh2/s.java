package wh2;

/* loaded from: classes10.dex */
public final class s implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f445960e;

    public s(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f445959d = str;
        this.f445960e = qVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        wh2.u uVar = wh2.u.f445962a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSVGLoader", sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.field_retCode;
        kotlinx.coroutines.q qVar = this.f445960e;
        if (i18 == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("success, fileExist:");
            java.lang.String str = this.f445959d;
            sb7.append(com.tencent.mm.vfs.w6.j(str));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSVGLoader", sb7.toString());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new wh2.q(str)));
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSVGLoader", "failed, " + hVar.field_retCode);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new wh2.p(hVar.field_retCode)));
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
