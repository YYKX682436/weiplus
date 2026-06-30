package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class x1 implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149443d;

    public x1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149443d = a2Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149443d;
        int i17 = a2Var.f149268d;
        if (i17 > 0) {
            a2Var.f149272h.a(i17, true);
        } else {
            a2Var.f149272h.a(0.0d, true);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
