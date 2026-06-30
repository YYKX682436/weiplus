package ps3;

/* loaded from: classes11.dex */
public final class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final ps3.d f358071d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f358072e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f358073f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f358074g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358075h;

    public b(ps3.m mVar, ps3.d dVar) {
        this.f358075h = mVar;
        this.f358071d = dVar;
    }

    public final void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        gm0.j1.d().q(30, this);
        ps3.d dVar = this.f358071d;
        if (dVar != null) {
            dVar.a(z17, z18, str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (scene.getType() != 30) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RadarAddContact", "not expected scene,  type = " + scene.getType());
            return;
        }
        ps3.m mVar = this.f358075h;
        if (((com.tencent.mm.pluginsdk.model.m3) ((ns.l) scene)).f189380g == 2) {
            if (i17 == 0 && i18 == 0) {
                a(false, true, this.f358074g, "");
                return;
            }
            if (i17 == 4 && i18 == -34) {
                str = mVar.f358103e.getString(com.tencent.mm.R.string.fbm);
            } else if (i17 == 4 && i18 == -94) {
                str = mVar.f358103e.getString(com.tencent.mm.R.string.fbp);
            } else if (i17 != 4 || ((i18 != -24 && i18 != -101) || str == null)) {
                str = mVar.f358103e.getString(com.tencent.mm.R.string.iil);
            }
            kotlin.jvm.internal.o.d(str);
            a(false, false, this.f358074g, str);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            a(true, false, this.f358074g, "");
            return;
        }
        if (i18 == -44) {
            ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
            android.content.Context context = mVar.f358103e;
            ((ms.a) kVar).getClass();
            new r35.e4(context, null).g(this.f358072e, this.f358073f);
            return;
        }
        if (i18 == -87) {
            a(false, false, this.f358074g, mVar.f358103e.getString(com.tencent.mm.R.string.f490953bc5));
            return;
        }
        if (i18 != -24 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            a(false, false, this.f358074g, (i17 == 4 && i18 == -22) ? mVar.f358103e.getString(com.tencent.mm.R.string.f489853dl) : mVar.f358103e.getString(com.tencent.mm.R.string.f489852dk));
            return;
        }
        java.lang.String str2 = this.f358074g;
        if (str == null) {
            str = "";
        }
        a(false, false, str2, str);
    }
}
