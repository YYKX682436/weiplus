package fk4;

/* loaded from: classes10.dex */
public final class a implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk4.b f263593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo0.b f263595f;

    public a(fk4.b bVar, java.lang.String str, zo0.b bVar2) {
        this.f263593d = bVar;
        this.f263594e = str;
        this.f263595f = bVar2;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f263593d.getClass();
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
        sb6.append(", fileExist:");
        java.lang.String str = this.f263594e;
        sb6.append(com.tencent.mm.vfs.w6.j(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageDownloder", sb6.toString());
        zo0.b bVar = this.f263595f;
        if (hVar == null) {
            if (i17 == 0) {
                return 0;
            }
            bVar.a();
            return 0;
        }
        if (hVar.field_retCode != 0) {
            bVar.a();
            return 0;
        }
        bVar.b(new hp0.b(str, "", new hp0.a(str)));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
