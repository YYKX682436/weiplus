package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f201964d;

    public d(com.tencent.mm.ui.chatting.manager.e eVar, androidx.fragment.app.Fragment fragment) {
        this.f201964d = fragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.Fragment fragment = this.f201964d;
        if (fragment.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED) {
            com.tencent.mm.ui.chatting.manager.e.f201965b.remove(fragment);
        } else {
            fragment.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.ui.chatting.manager.ChattingOnResultExecutor$1$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public void onDestroy() {
                    com.tencent.mm.ui.chatting.manager.e.f201965b.remove(com.tencent.mm.ui.chatting.manager.d.this.f201964d);
                }
            });
        }
    }
}
