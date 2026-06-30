package or1;

/* loaded from: classes9.dex */
public class s0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f347567d;

    /* renamed from: e, reason: collision with root package name */
    public al5.y1 f347568e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f347569f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f347570g;

    public s0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView) {
        this.f347570g = new java.lang.ref.WeakReference(enterpriseBizContactListView);
    }

    public void finalize() {
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, this);
        super.finalize();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gi5 gi5Var;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.protobuf.f fVar2;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f347569f;
        if (u3Var != null && u3Var.isShowing()) {
            this.f347569f.dismiss();
        }
        if (i17 == 0 && i18 == 0 && m1Var.getType() == 1394) {
            r45.mi6 mi6Var = null;
            com.tencent.mm.modelbase.o oVar = ((er3.f) m1Var).f256031e;
            r45.li6 li6Var = (oVar == null || (fVar2 = oVar.f70710a.f70684a) == null) ? null : (r45.li6) fVar2;
            if (oVar != null && (fVar = oVar.f70711b.f70700a) != null) {
                mi6Var = (r45.mi6) fVar;
            }
            if (mi6Var == null || (gi5Var = mi6Var.f380551d) == null || gi5Var.f375288d != 0) {
                if (mi6Var == null || mi6Var.f380551d == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:resp == null", java.lang.Integer.valueOf(m1Var.getType()));
                    return;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:code:%s", java.lang.Integer.valueOf(m1Var.getType()), java.lang.Integer.valueOf(mi6Var.f380551d.f375288d));
                    return;
                }
            }
            if (li6Var.f379506e) {
                qk.o b17 = r01.z.b(li6Var.f379505d);
                b17.field_brandFlag |= 1;
                r45.ln4 ln4Var = new r45.ln4();
                ln4Var.f379659d = b17.field_brandFlag;
                ln4Var.f379660e = li6Var.f379505d;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(47, ln4Var));
                r01.q3.cj().update(b17, new java.lang.String[0]);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(b17.field_username);
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().u(b17.field_enterpriseFather) <= 0) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(b17.field_enterpriseFather);
                } else {
                    ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai().b(b17.field_enterpriseFather);
                }
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView = (com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView) this.f347570g.get();
                if (enterpriseBizContactListView == null) {
                    return;
                }
                enterpriseBizContactListView.i();
            }
        }
    }
}
