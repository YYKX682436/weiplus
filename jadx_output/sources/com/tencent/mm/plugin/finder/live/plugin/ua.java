package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class ua extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final int f114543p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (!x0()) {
            root.post(new com.tencent.mm.plugin.finder.live.plugin.ra(root, i17));
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        this.f114543p = ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public int T0() {
        return 4;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }
}
