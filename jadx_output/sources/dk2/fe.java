package dk2;

/* loaded from: classes3.dex */
public final class fe extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.fe f233465d = new dk2.fe();

    public fe() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.f(liveRoomControllerStore);
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if ((k0Var == null || k0Var.isDestroyed()) ? false : true) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
            if (k0Var2 != null) {
                qo0.c.a(k0Var2, qo0.b.f365405q4, null, 2, null);
            }
        } else {
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                efVar.p0(eVar, true, qo0.b.f365405q4, null, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0));
            }
        }
        efVar.Z();
        return jz5.f0.f302826a;
    }
}
