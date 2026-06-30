package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.h f150278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f150279e;

    public d(com.tencent.mm.plugin.multitalk.ui.h hVar, android.view.View view) {
        this.f150278d = hVar;
        this.f150279e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.multitalk.ui.h hVar = this.f150278d;
        com.tencent.mm.plugin.multitalk.ui.a aVar = hVar.f150285w;
        if (aVar != null) {
            ((com.tencent.mm.plugin.multitalk.model.j1) aVar).f150019a.a();
        }
        android.view.View view = this.f150279e;
        if (view != null) {
            hVar.u(view);
        }
    }
}
