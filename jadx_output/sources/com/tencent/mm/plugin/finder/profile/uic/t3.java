package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class t3 implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124223a;

    public t3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        this.f124223a = f4Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f124223a;
        if (f4Var.f123689m) {
            return;
        }
        com.tencent.mm.plugin.finder.profile.uic.f4.a7(f4Var, "cancel", 0, null, 0, null, 30, null);
    }
}
