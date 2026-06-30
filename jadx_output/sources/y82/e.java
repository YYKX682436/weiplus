package y82;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object obj;
        am.u9 u9Var = ((com.tencent.mm.autogen.events.FavInitConfirmDialogContentEvent) iEvent).f54238g;
        java.lang.Object obj2 = u9Var.f8064f;
        if (obj2 != null && (obj2 instanceof r35.i1) && (obj = u9Var.f8065g) != null && (obj instanceof android.content.Context)) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(u9Var.f8061c);
            java.lang.String str = u9Var.f8062d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((F != null && F.field_type == 18) || F.field_type == 14)) {
                try {
                    java.util.LinkedList linkedList = F.field_favProto.f370964f;
                    int i17 = F.field_type == 18 ? 1 : 0;
                    while (true) {
                        if (i17 >= linkedList.size()) {
                            break;
                        }
                        r45.gp0 gp0Var = (r45.gp0) linkedList.get(i17);
                        if (str.startsWith(gp0Var.T)) {
                            o72.r2 clone = F.clone();
                            clone.field_type = u9Var.f8063e;
                            clone.B1 = true;
                            clone.C1 = F;
                            clone.D1 = F.field_localId + "_" + gp0Var.T;
                            r45.bq0 a17 = q72.c.a(F.field_favProto);
                            clone.field_favProto = a17;
                            a17.f370964f = new java.util.LinkedList();
                            clone.field_favProto.f370964f.add(gp0Var);
                            clone.field_favProto.p(gp0Var.f375404d);
                            r45.hp0 hp0Var = gp0Var.J1;
                            if (hp0Var != null) {
                                int i18 = u9Var.f8063e;
                                if (i18 == 6) {
                                    clone.field_favProto.j(hp0Var.f376354e);
                                } else if (i18 == 5) {
                                    clone.field_favProto.r(hp0Var.f376355f);
                                }
                            }
                            F = clone;
                        } else {
                            i17++;
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.InitConfirmDialogContentListener", "FavInitConfirmDialogContentEvent callback : %s %s", e17.getClass().getSimpleName(), e17.getMessage());
                }
            }
            if (F == null && !com.tencent.mm.sdk.platformtools.t8.K0(u9Var.f8066h)) {
                F = o72.x1.B(u9Var.f8066h, 18);
            }
            o72.r2 r2Var = F;
            r35.i1 i1Var = (r35.i1) u9Var.f8064f;
            android.content.Context context = (android.content.Context) u9Var.f8065g;
            x82.k0.l(i1Var, context, r2Var);
            x82.k0.m(i1Var, context, u9Var.f8060b, r2Var, u9Var.f8059a, u9Var.f8067i);
        }
        u9Var.f8061c = 0L;
        u9Var.f8062d = "";
        u9Var.f8064f = null;
        u9Var.f8065g = null;
        return false;
    }
}
