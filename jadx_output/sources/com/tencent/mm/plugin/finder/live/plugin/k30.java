package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k30 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r30 f113188d;

    public k30(com.tencent.mm.plugin.finder.live.plugin.r30 r30Var) {
        this.f113188d = r30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = this.f113188d;
        android.widget.RelativeLayout relativeLayout = r30Var.f114077q;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        android.content.Context context = r30Var.f114077q.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        layoutParams.width = com.tencent.mm.plugin.finder.view.x7.b(context);
        relativeLayout.setLayoutParams(layoutParams);
    }
}
