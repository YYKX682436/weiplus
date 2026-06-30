package jk3;

/* loaded from: classes8.dex */
public final class r implements jk3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk3.c f300104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f300105c;

    public r(jk3.v vVar, jk3.c cVar, int i17) {
        this.f300103a = vVar;
        this.f300104b = cVar;
        this.f300105c = i17;
    }

    @Override // jk3.g
    public void a() {
        jk3.v vVar = this.f300103a;
        vVar.getClass();
        if (!vVar.u()) {
            kk3.d dVar = vVar.f300112e;
            if (dVar != null) {
                kk3.d.f(dVar, 0, 1, null);
                return;
            }
            return;
        }
        android.graphics.Point Bi = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Bi();
        vVar.f300128u = !vVar.T();
        ak3.c cVar = vVar.f300111d;
        if (cVar != null) {
            jk3.c cVar2 = this.f300104b;
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                kk3.d dVar2 = vVar.f300112e;
                ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493669l73);
                if (cVar.c()) {
                    cVar.f(new ck3.o(dVar2, Bi, cVar, null, true, -1.0f, false, false));
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new ck3.p(dVar2));
                }
            } else if (ordinal != 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PageMultiTaskHelper", "animType warning animType: %s", cVar2);
            } else {
                kk3.d dVar3 = vVar.f300112e;
                ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493669l73);
                if (cVar.c()) {
                    cVar.f(new ck3.o(dVar3, Bi, cVar, null, true, -1.0f, false, true));
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new ck3.p(dVar3));
                }
            }
            jk3.v.N(vVar, this.f300105c);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "ballPosition: {" + java.lang.Integer.valueOf(Bi.x) + ' ' + java.lang.Integer.valueOf(Bi.y) + '}');
    }
}
