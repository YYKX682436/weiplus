package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.f0.class)
/* loaded from: classes8.dex */
public final class sh extends com.tencent.mm.ui.chatting.component.a implements sb5.f0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.coroutines.LifecycleScope f199940e;

    @Override // sb5.f0
    public com.tencent.mm.sdk.coroutines.LifecycleScope A() {
        return this.f199940e;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f199940e;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f199940e = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.MvvmChatLoadScopeComponent", null, 1);
    }
}
