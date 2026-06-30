package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class k1 implements com.tencent.mm.ui.tools.kd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.v0 f150027a;

    public k1(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
        this.f150027a = v0Var;
    }

    @Override // com.tencent.mm.ui.tools.kd
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f150027a;
        if (!v0Var.S.f301233b) {
            return false;
        }
        if (i17 != 25 && i17 != 24) {
            return false;
        }
        if (!v0Var.f150161d) {
            return true;
        }
        v0Var.X();
        return true;
    }
}
