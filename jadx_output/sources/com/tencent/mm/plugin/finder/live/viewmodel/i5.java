package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var) {
        super(2);
        this.f117143d = r5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk2.j9 j9Var;
        pk2.o9 o9Var;
        df2.ad adVar;
        com.tencent.mm.plugin.finder.live.viewmodel.c6 it = (com.tencent.mm.plugin.finder.live.viewmodel.c6) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOptionClick ");
        int i17 = it.f116973a;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", sb6.toString());
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117143d;
        if (i17 != 1) {
            java.lang.Integer num = null;
            if (i17 == 2) {
                r5Var.getClass();
                if2.b.Y6(r5Var, qo0.b.f365444z2, null, 2, null);
            } else if (i17 == 4) {
                df2.gq gqVar = (df2.gq) r5Var.controller(df2.gq.class);
                if (gqVar != null) {
                    gqVar.b7();
                }
            } else if (i17 == 5) {
                com.tencent.mm.plugin.finder.live.util.y.o(r5Var, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.h5(r5Var, null), 3, null);
            } else if (i17 != 6) {
                switch (i17) {
                    case 11:
                        android.content.Context O6 = r5Var.O6();
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(O6 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.tencent.mm.plugin.finder.live.viewmodel.s5 s5Var = (com.tencent.mm.plugin.finder.live.viewmodel.s5) zVar.a((androidx.appcompat.app.AppCompatActivity) O6).a(com.tencent.mm.plugin.finder.live.viewmodel.s5.class);
                        s5Var.getClass();
                        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                        if (k0Var != null && (adVar = (df2.ad) k0Var.getController(df2.ad.class)) != null) {
                            if2.d0 d0Var = adVar.f229707m;
                            if (d0Var != null) {
                                d0Var.d(8);
                            }
                            kotlinx.coroutines.r2 r2Var = adVar.f229708n;
                            if (r2Var != null) {
                                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                            }
                        }
                        if (booleanValue && (o9Var = s5Var.f117394d) != null) {
                            num = java.lang.Integer.valueOf(o9Var.f356091j0);
                        }
                        pk2.o9 o9Var2 = s5Var.f117394d;
                        if (o9Var2 != null && (j9Var = o9Var2.f356084g) != null) {
                            j9Var.a(num, booleanValue);
                        }
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327942e, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("type", "2");
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        zy2.zb zbVar = (zy2.zb) c18;
                        ml2.c1 c1Var = ml2.c1.f327325e;
                        zy2.zb.j5(zbVar, 31L, jSONObject.toString(), null, 4, null);
                        break;
                        break;
                    case 12:
                        r5Var.e7(0);
                        break;
                    case 13:
                        r5Var.d7(null);
                        break;
                    case 14:
                        com.tencent.mars.xlog.Log.i(r5Var.f117358m, "click MORE_INVITEE");
                        com.tencent.mm.plugin.finder.live.widget.e0.W(new com.tencent.mm.plugin.finder.live.widget.ga(r5Var.O6()), null, false, 0, 7, null);
                        break;
                }
            } else {
                r5Var.f7();
            }
        } else {
            r5Var.c7();
        }
        return jz5.f0.f302826a;
    }
}
