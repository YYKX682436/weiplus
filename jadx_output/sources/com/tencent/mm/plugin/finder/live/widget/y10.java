package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y10 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z10 f120401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.p f120402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f120403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(com.tencent.mm.plugin.finder.live.widget.z10 z10Var, cm2.p pVar, int i17) {
        super(1);
        this.f120401d = z10Var;
        this.f120402e = pVar;
        this.f120403f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            r45.fr1 fr1Var = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            if (fr1Var != null) {
                com.tencent.mm.plugin.finder.live.widget.z10 z10Var = this.f120401d;
                ((mm2.c1) z10Var.f120494c.P0(mm2.c1.class)).Y8(fr1Var);
                ((mm2.c1) z10Var.f120494c.P0(mm2.c1.class)).o9(((r45.ps1) fVar.f70618d).getBoolean(3));
                this.f120402e.f43377h = fr1Var;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = z10Var.f120507p;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemChanged(this.f120403f);
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh gameteam fail: ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(' ');
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
