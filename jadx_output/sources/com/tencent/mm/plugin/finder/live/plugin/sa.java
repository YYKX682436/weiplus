package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class sa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ua f114235d;

    public sa(com.tencent.mm.plugin.finder.live.plugin.ua uaVar) {
        this.f114235d = uaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ua uaVar = this.f114235d;
        android.view.ViewGroup.LayoutParams layoutParams = uaVar.f365323d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = uaVar.f114543p;
    }
}
