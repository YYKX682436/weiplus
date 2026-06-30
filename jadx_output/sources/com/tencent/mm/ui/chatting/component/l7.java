package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.f0.class)
/* loaded from: classes10.dex */
public final class l7 extends com.tencent.mm.ui.chatting.component.a implements sb5.f0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.coroutines.LifecycleScope f199400e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.k7 f199401f;

    @Override // sb5.f0
    public com.tencent.mm.sdk.coroutines.LifecycleScope A() {
        return this.f199400e;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f199400e;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
        this.f199401f = null;
    }

    @Override // yn.d
    public void S(xm3.o0 pendingData) {
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        com.tencent.mm.ui.chatting.component.k7 k7Var = this.f199401f;
        if (k7Var != null) {
            java.util.List list = pendingData.f455366c;
            boolean z17 = !list.isEmpty();
            xm3.i iVar = xm3.i.f455327m;
            java.util.List list2 = pendingData.f455367d;
            boolean z18 = list2.contains(iVar) && list2.size() == 1;
            list.size();
            java.util.Objects.toString(list2);
            if (z18 || k7Var.f199350a) {
                return;
            }
            k7Var.f199350a = true;
            if (z17) {
            } else {
                ((jz5.n) k7Var.f199351b).getValue();
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f199400e = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ChattingScopeComponent", null, 1);
        this.f199401f = new com.tencent.mm.ui.chatting.component.k7(this);
    }
}
