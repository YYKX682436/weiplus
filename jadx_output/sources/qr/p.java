package qr;

/* loaded from: classes12.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.uu6 f366030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f366031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr.r f366032c;

    public p(qr.r rVar, r45.uu6 uu6Var, boolean z17) {
        this.f366032c = rVar;
        this.f366030a = uu6Var;
        this.f366031b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadCDN", "prepare callback: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        qr.r rVar = this.f366032c;
        if (i17 != 0 || i18 != 0) {
            rVar.c();
            return null;
        }
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        java.lang.String i19 = (fVar2 == null || (gVar = ((r45.yt6) fVar2).f391369d) == null) ? "" : gVar.i();
        r45.uu6 uu6Var = this.f366030a;
        boolean z17 = uu6Var == null ? false : uu6Var.f387653d;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_custom_add_from_album_userid_android, false)) {
            z17 = z17 || this.f366031b;
        }
        qr.s sVar = new qr.s();
        sVar.f366042a = i19;
        sVar.f366043b = z17;
        qr.r.e(rVar, sVar);
        return null;
    }
}
