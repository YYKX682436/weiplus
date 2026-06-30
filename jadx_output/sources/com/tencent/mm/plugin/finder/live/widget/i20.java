package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f118627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f118628e;

    public i20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, android.view.ViewGroup viewGroup) {
        this.f118627d = e30Var;
        this.f118628e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.e30.t1(this.f118627d, this.f118628e, 1.0f);
    }
}
