package m11;

@j95.b
/* loaded from: classes12.dex */
public class b1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public m11.l0 f322659d;

    /* renamed from: e, reason: collision with root package name */
    public m11.g f322660e;

    /* renamed from: f, reason: collision with root package name */
    public m11.j f322661f = null;

    /* renamed from: g, reason: collision with root package name */
    public m11.l1 f322662g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f322663h = new m11.a1(this);

    /* renamed from: i, reason: collision with root package name */
    public n11.a f322664i = null;

    public static m11.b1 Ai() {
        return (m11.b1) i95.n0.c(m11.b1.class);
    }

    public static n11.a Bi() {
        gm0.j1.b().c();
        if (Ai().f322664i == null) {
            Ai().f322664i = n11.a.b();
        }
        return Ai().f322664i;
    }

    public static m11.l0 Di() {
        gm0.j1.b().c();
        if (Ai().f322659d == null) {
            Ai().f322659d = new m11.l0(gm0.j1.u().f273153f);
        }
        return Ai().f322659d;
    }

    public static m11.l1 Ni() {
        gm0.j1.b().c();
        if (Ai().f322662g == null) {
            Ai().f322662g = new m11.l1();
        }
        return Ai().f322662g;
    }

    public static m11.g wi() {
        gm0.j1.b().c();
        if (Ai().f322660e == null) {
            Ai().f322660e = new m11.g();
        }
        return Ai().f322660e;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        this.f322663h.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        this.f322663h.dead();
        m11.j jVar = this.f322661f;
        if (jVar != null) {
            com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "on detach");
            com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "cancel all net scene");
            jVar.f322718h = true;
            jVar.f(jVar.f322716f);
            while (true) {
                java.util.List list = jVar.f322714d;
                if (list.size() <= 0) {
                    break;
                } else {
                    jVar.f((m11.h) list.get(0));
                }
            }
            jVar.f322718h = false;
            jVar.i(-1);
            gm0.j1.n().f273288b.q(109, jVar);
        }
        m11.l1 l1Var = this.f322662g;
        if (l1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UrlImageCacheService", "detach");
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                ((java.util.LinkedList) l1Var.f322749a).clear();
                l1Var.f322751c = true;
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new m11.g1(l1Var));
            }
        }
        m11.l0 l0Var = Ai().f322659d;
        if (l0Var != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "clearCacheMap stack:%s", new com.tencent.mm.sdk.platformtools.z3());
            ((lt0.f) l0Var.f322738e).clear();
        }
        n11.a aVar = Ai().f322664i;
        if (aVar != null) {
            aVar.c();
        }
        ((java.util.HashMap) um.n.f428690a).put("local_cdn_img_cache", null);
        n11.a aVar2 = this.f322664i;
        if (aVar2 != null) {
            aVar2.c();
            this.f322664i = null;
        }
    }
}
