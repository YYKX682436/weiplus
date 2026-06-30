package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ge0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.le0 f112686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f112687e;

    public ge0(com.tencent.mm.plugin.finder.live.plugin.le0 le0Var, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f112686d = le0Var;
        this.f112687e = r60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = this.f112686d;
        android.view.ViewGroup.LayoutParams layoutParams = le0Var.f365323d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f112687e;
        if (r60Var.w0() == 0) {
            int i17 = pm0.v.t(r60Var.f365323d)[1];
            int height = pm0.v.t(le0Var.f365323d)[1] + le0Var.f365323d.getHeight();
            if (height > i17) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, height - i17);
            }
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 0);
        }
        le0Var.f365323d.setLayoutParams(marginLayoutParams);
    }
}
