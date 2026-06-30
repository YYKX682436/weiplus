package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class h3 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f126069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l3 f126070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f126071c;

    public h3(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.finder.service.l3 l3Var, int i17) {
        this.f126069a = z2Var;
        this.f126070b = l3Var;
        this.f126071c = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) this.f126069a.f212058g.findViewById(com.tencent.mm.R.id.f485201gw0);
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        com.tencent.mm.plugin.finder.service.l3 l3Var = this.f126070b;
        l3Var.bj(false, this.f126071c, l3Var.f126139y ? 1 : 2);
    }
}
