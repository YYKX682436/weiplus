package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ta implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ua f114365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114366e;

    public ta(com.tencent.mm.plugin.finder.live.plugin.ua uaVar, int i17) {
        this.f114365d = uaVar;
        this.f114366e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f114365d.f365323d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f114366e;
    }
}
