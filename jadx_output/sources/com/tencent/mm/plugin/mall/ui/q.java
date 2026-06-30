package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef3.a f148467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI f148468b;

    public q(com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI, ef3.a aVar) {
        this.f148468b = mallFunctionSettingsUI;
        this.f148467a = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        int i17 = fVar.f70615a;
        ef3.a aVar = this.f148467a;
        com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI = this.f148468b;
        if (i17 != 0 || fVar.f70616b != 0) {
            for (r45.y55 y55Var : aVar.f252404q) {
                y55Var.f390803e = y55Var.f390803e == 0 ? 1 : 0;
            }
            mallFunctionSettingsUI.f148234h.notifyDataSetChanged();
            at4.j0.b(fVar.f70616b, fVar.f70615a).a(mallFunctionSettingsUI.getContext(), true);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MallFunctionSettingsUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(((r45.af) fVar.f70618d).f369975d), ((r45.af) fVar.f70618d).f369976e);
        if (((r45.af) fVar.f70618d).f369975d == 0) {
            return null;
        }
        for (r45.y55 y55Var2 : aVar.f252404q) {
            y55Var2.f390803e = y55Var2.f390803e == 0 ? 1 : 0;
        }
        mallFunctionSettingsUI.f148234h.notifyDataSetChanged();
        r45.af afVar = (r45.af) fVar.f70618d;
        at4.j0.c(afVar.f369975d, afVar.f369976e).a(mallFunctionSettingsUI.getContext(), true);
        return null;
    }
}
