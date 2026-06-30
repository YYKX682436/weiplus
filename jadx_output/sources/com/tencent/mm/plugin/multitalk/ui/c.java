package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.h f150276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.GridLayout f150277e;

    public c(com.tencent.mm.plugin.multitalk.ui.h hVar, android.widget.GridLayout gridLayout) {
        this.f150276d = hVar;
        this.f150277e = gridLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredWidth = this.f150277e.getMeasuredWidth();
        com.tencent.mm.plugin.multitalk.ui.h hVar = this.f150276d;
        hVar.f150288z = measuredWidth;
        com.tencent.mm.plugin.multitalk.ui.h.x(hVar);
    }
}
