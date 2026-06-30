package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f115033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(4);
        this.f115033d = x7Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View child = (android.view.View) obj2;
        ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(child, "child");
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f115033d;
        x7Var.Q = intValue;
        com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator finderLiveTextIndicator = x7Var.f115039s;
        android.widget.TextView textView = finderLiveTextIndicator.f116113e;
        android.widget.TextView textView2 = finderLiveTextIndicator.f116112d;
        if (intValue == 0) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(0.5f);
        } else {
            textView2.setAlpha(0.5f);
            textView.setAlpha(1.0f);
        }
        return jz5.f0.f302826a;
    }
}
