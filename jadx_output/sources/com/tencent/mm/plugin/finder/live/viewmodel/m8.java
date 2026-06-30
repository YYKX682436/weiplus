package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class m8 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.s8 f117257d;

    public m8(com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var) {
        this.f117257d = s8Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC$initDescSpan$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.finder.live.viewmodel.s8 s8Var = this.f117257d;
        if (s8Var.f117408p == null) {
            s8Var.f117408p = new com.tencent.mm.plugin.finder.live.viewmodel.r4(s8Var.getContext(), null, 2, null);
        }
        com.tencent.mm.plugin.finder.live.viewmodel.r4 r4Var = s8Var.f117408p;
        if (r4Var != null) {
            r4Var.w();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC$initDescSpan$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f117257d.getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
