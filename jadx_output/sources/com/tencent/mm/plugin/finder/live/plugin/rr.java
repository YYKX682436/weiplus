package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m3 f114178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(bm2.m3 m3Var, com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        super(1);
        this.f114178d = m3Var;
        this.f114179e = etVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        bm2.j3 j3Var = (bm2.j3) kz5.n0.a0(this.f114178d.f22097f, intValue);
        if (j3Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveInputPlugin", "cannot get fastCommentInfo at " + intValue);
        } else {
            boolean z17 = j3Var.f22006b == 0;
            com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114179e;
            if (z17) {
                etVar.getClass();
                if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227164o, new com.tencent.mm.plugin.finder.live.plugin.cr())) {
                    long a17 = c01.id.a();
                    if (a17 - etVar.f112462y0 > com.tencent.mm.plugin.finder.live.plugin.et.H1 || etVar.F1) {
                        etVar.f112462y0 = a17;
                        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: check permission and cache, currentTime:" + a17);
                        com.tencent.mm.plugin.finder.live.plugin.dr drVar = new com.tencent.mm.plugin.finder.live.plugin.dr(etVar);
                        com.tencent.mm.plugin.finder.live.plugin.fr frVar = new com.tencent.mm.plugin.finder.live.plugin.fr(etVar);
                        com.tencent.mm.plugin.finder.live.plugin.gr grVar = new com.tencent.mm.plugin.finder.live.plugin.gr(etVar);
                        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
                        if (!k0Var.N6()) {
                            drVar.invoke();
                        } else if (c01.id.a() - k0Var.Q6() < 300000) {
                            grVar.invoke();
                        } else {
                            frVar.invoke();
                        }
                        if (etVar.f112447l1 != null) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_room_fastcomment_event", etVar.K, null, 25561);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: too fast, currentTime:" + a17 + ", lastPoiSendTime:" + etVar.f112462y0);
                        android.content.Context context = etVar.R;
                        db5.t7.g(context, context.getString(com.tencent.mm.R.string.dlf));
                    }
                }
            } else {
                etVar.V1(j3Var, ((mm2.j2) etVar.P0(mm2.j2.class)).S6());
            }
            ((mm2.u0) etVar.P0(mm2.u0.class)).O6(j3Var.f22008d, j3Var.f22005a, j3Var.f22009e);
            if (((mm2.e0) etVar.P0(mm2.e0.class)).P6()) {
                com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "inBox, keep show keyboard");
            } else {
                etVar.D1(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
