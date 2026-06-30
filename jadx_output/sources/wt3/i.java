package wt3;

/* loaded from: classes10.dex */
public final class i implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.j f449424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449426f;

    public i(wt3.j jVar, java.lang.String str, java.lang.String str2) {
        this.f449424d = jVar;
        this.f449425e = str;
        this.f449426f = str2;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        wt3.j jVar = this.f449424d;
        java.lang.String str = jVar.f449429f;
        if (gVar != null) {
            gVar.toString();
        }
        if (hVar != null) {
            hVar.toString();
        }
        if (hVar != null) {
            if (hVar.field_retCode == 0) {
                java.lang.String str2 = jVar.f449429f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download success ");
                sb6.append(mediaId);
                sb6.append(' ');
                java.lang.String str3 = this.f449425e;
                sb6.append(str3);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                com.tencent.mm.vfs.w6.w(this.f449426f, str3);
                jVar.a(true, str3);
            } else {
                com.tencent.mars.xlog.Log.w(jVar.f449429f, "download fail sceneResult " + hVar.field_retCode);
                jVar.a(false, null);
            }
        } else if (i17 != 0) {
            com.tencent.mars.xlog.Log.w(jVar.f449429f, "download fail startRet " + i17);
            jVar.a(false, null);
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
