package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e10 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.f10 f112359d;

    public e10(com.tencent.mm.plugin.finder.live.plugin.f10 f10Var) {
        this.f112359d = f10Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = this.f112359d;
        java.lang.String str = f10Var.f112481q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("currentWidth = ");
        android.view.View view = f10Var.f112482r;
        sb6.append(view.getLayoutParams().width);
        sb6.append(", targetWidth:");
        sb6.append(num);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = intValue;
        view.setLayoutParams(layoutParams);
        view.invalidate();
    }
}
