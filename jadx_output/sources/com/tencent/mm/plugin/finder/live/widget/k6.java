package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k6 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m6 f118817d;

    public k6(com.tencent.mm.plugin.finder.live.widget.m6 m6Var) {
        this.f118817d = m6Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.finder.live.widget.m6 m6Var = this.f118817d;
        fg2.a aVar = m6Var.f119045m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar.f261930e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        fg2.a aVar2 = m6Var.f119045m;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int measuredHeight = aVar2.f261930e.getMeasuredHeight();
        fg2.a aVar3 = m6Var.f119045m;
        if (aVar3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar3.f261928c.getLayoutParams().height = measuredHeight;
        fg2.a aVar4 = m6Var.f119045m;
        if (aVar4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar4.f261928c.requestLayout();
        fg2.a aVar5 = m6Var.f119045m;
        if (aVar5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar5.f261933h.setSwitchListener(new com.tencent.mm.plugin.finder.live.widget.e6(m6Var));
        fg2.a aVar6 = m6Var.f119045m;
        if (aVar6 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = aVar6.f261933h;
        kotlin.jvm.internal.o.d(mMSwitchBtn);
        ym5.a1.h(mMSwitchBtn, new com.tencent.mm.plugin.finder.live.widget.f6(m6Var));
        fg2.a aVar7 = m6Var.f119045m;
        if (aVar7 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar7.f261934i.setSwitchListener(new com.tencent.mm.plugin.finder.live.widget.g6(m6Var));
        fg2.a aVar8 = m6Var.f119045m;
        if (aVar8 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = aVar8.f261934i;
        kotlin.jvm.internal.o.d(mMSwitchBtn2);
        ym5.a1.h(mMSwitchBtn2, new com.tencent.mm.plugin.finder.live.widget.h6(m6Var));
        fg2.a aVar9 = m6Var.f119045m;
        if (aVar9 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        aVar9.f261935j.setSwitchListener(new com.tencent.mm.plugin.finder.live.widget.i6(m6Var));
        fg2.a aVar10 = m6Var.f119045m;
        if (aVar10 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = aVar10.f261935j;
        kotlin.jvm.internal.o.d(mMSwitchBtn3);
        ym5.a1.h(mMSwitchBtn3, new com.tencent.mm.plugin.finder.live.widget.j6(m6Var));
        com.tencent.mm.plugin.finder.live.widget.m6.y(m6Var);
    }
}
