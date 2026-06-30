package mn2;

/* loaded from: classes10.dex */
public final class h0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.h3 f330012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo0.b f330013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330014f;

    public h0(mn2.h3 h3Var, zo0.b bVar, java.lang.String str) {
        this.f330012d = h3Var;
        this.f330013e = bVar;
        this.f330014f = str;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId ");
        sb6.append(mediaId);
        sb6.append(" startRet ");
        sb6.append(i17);
        sb6.append(" sceneResult ");
        sb6.append(hVar);
        sb6.append(" onlyCheckExist ");
        sb6.append(z17);
        sb6.append(" retCode ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : "");
        com.tencent.mars.xlog.Log.i("Finder.FinderCdnDownloader", sb6.toString());
        zo0.b bVar = this.f330013e;
        if (hVar != null) {
            if (this.f330012d == null) {
                return 0;
            }
            if (hVar.field_retCode != 0) {
                bVar.a();
            } else {
                java.lang.String str = this.f330014f;
                bVar.b(new hp0.b(str, "", new hp0.a(str)));
            }
        } else if (i17 != 0) {
            bVar.a();
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
