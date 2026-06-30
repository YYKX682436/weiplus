package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class np implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.op f161370d;

    public np(com.tencent.mm.plugin.setting.ui.setting.op opVar) {
        this.f161370d = opVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f161370d.f161404d.f160781v != null) {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX, this.f161370d.f161404d.f160781v);
            com.tencent.mm.plugin.setting.ui.setting.dq dqVar = this.f161370d.f161404d.f160781v;
            dqVar.f160962i = 0;
            dqVar.f160960g = 0;
            dqVar.f160961h = 0;
            dqVar.f160963m.clear();
            dqVar.f160964n.clear();
            dqVar.b();
            com.tencent.mm.plugin.setting.ui.setting.gq gqVar = dqVar.f160958e;
            if (gqVar != null) {
                java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.B;
                ((com.tencent.mm.plugin.setting.ui.setting.mp) gqVar).f161339a.V6(true);
            }
            ((ku5.t0) ku5.t0.f312615d).g(dqVar);
        }
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.T6(this.f161370d.f161404d, false);
    }
}
