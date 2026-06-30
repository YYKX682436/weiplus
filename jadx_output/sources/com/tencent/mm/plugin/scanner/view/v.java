package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t f160000d;

    public v(com.tencent.mm.plugin.scanner.view.t tVar) {
        this.f160000d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.view.t tVar = this.f160000d;
        android.animation.AnimatorSet animatorSet = tVar.f159981b;
        tVar.f159981b = null;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
