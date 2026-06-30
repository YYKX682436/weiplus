package wm1;

/* loaded from: classes9.dex */
public final class b implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f447213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f447214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f447215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm1.h f447216d;

    public b(bw5.o50 o50Var, android.app.Activity activity, int i17, wm1.h hVar) {
        this.f447213a = o50Var;
        this.f447214b = activity;
        this.f447215c = i17;
        this.f447216d = hVar;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        bw5.o50 o50Var = this.f447213a;
        java.lang.String k17 = il4.d.k(o50Var);
        if (k17 == null) {
            k17 = "";
        }
        wm1.h hVar = this.f447216d;
        hVar.getClass();
        r45.km6 km6Var = new r45.km6();
        km6Var.f378838d = o50Var.f30964n;
        km6Var.f378839e = il4.d.e(o50Var);
        java.lang.String c17 = o50Var.c();
        km6Var.f378840f = c17 != null ? c17 : "";
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.O0(o50Var.getName());
        gp0Var.m0(hVar.a(o50Var));
        gp0Var.h0(33);
        gp0Var.K0(o50Var.getUrl());
        gp0Var.o0(k17);
        gp0Var.x0(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioShareHelper", "favAlbum title: " + o50Var.getName() + ", categoryId: " + o50Var.c() + ", coverThumbPath: " + str + ", desc: " + gp0Var.f375408f);
        if (str == null || str.length() == 0) {
            gp0Var.z0(true);
        } else {
            gp0Var.B0(str);
        }
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.G = km6Var;
        gp0Var.J1 = hp0Var;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.lang.String name = o50Var.getName();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = name;
        c4Var.f6319e = hVar.a(o50Var);
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(36);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.i(o50Var.c());
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 33;
        c4Var.f6323i = this.f447214b;
        c4Var.f6327m = this.f447215c;
        pm0.v.X(new wm1.c(doFavoriteEvent));
    }
}
