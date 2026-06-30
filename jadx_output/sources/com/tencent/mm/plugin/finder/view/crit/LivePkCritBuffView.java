package com.tencent.mm.plugin.finder.view.crit;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B#\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010*\u001a\u00020\u001f¢\u0006\u0004\b(\u0010+R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n \u0003*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0015\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007R#\u0010\u0018\u001a\n \u0003*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0011R#\u0010\u001b\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u001a\u0010\fR#\u0010\u001e\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007R\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0005\u001a\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "f", "Ljz5/g;", "getBuffingView", "()Landroid/view/View;", "buffingView", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "g", "getBuffingTxtView", "()Lcom/tencent/mm/ui/widget/MMNeat7extView;", "buffingTxtView", "Landroid/widget/TextView;", "h", "getBuffingTimeView", "()Landroid/widget/TextView;", "buffingTimeView", "i", "getBuffingArrow", "buffingArrow", "m", "getBuffComputingView", "buffComputingView", "n", "getBuffResultView", "buffResultView", "o", "getLightView", "lightView", "", "p", "getLIGHT_WIDTH", "()I", "LIGHT_WIDTH", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LivePkCritBuffView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f131819d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f131820e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g buffingView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g buffingTxtView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g buffingTimeView;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g buffingArrow;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g buffComputingView;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g buffResultView;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g lightView;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g LIGHT_WIDTH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePkCritBuffView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131819d = "LivePkCritBuffView";
        this.buffingView = jz5.h.b(new ax2.v(this));
        this.buffingTxtView = jz5.h.b(new ax2.u(this));
        this.buffingTimeView = jz5.h.b(new ax2.t(this));
        this.buffingArrow = jz5.h.b(new ax2.s(this));
        this.buffComputingView = jz5.h.b(new ax2.q(this));
        this.buffResultView = jz5.h.b(new ax2.r(this));
        this.lightView = jz5.h.b(new ax2.w(this));
        this.LIGHT_WIDTH = jz5.h.b(ax2.p.f15080d);
        c();
    }

    private final android.widget.TextView getBuffComputingView() {
        return (android.widget.TextView) this.buffComputingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.widget.MMNeat7extView getBuffResultView() {
        return (com.tencent.mm.ui.widget.MMNeat7extView) this.buffResultView.getValue();
    }

    private final android.view.View getBuffingArrow() {
        return (android.view.View) this.buffingArrow.getValue();
    }

    private final android.widget.TextView getBuffingTimeView() {
        return (android.widget.TextView) this.buffingTimeView.getValue();
    }

    private final com.tencent.mm.ui.widget.MMNeat7extView getBuffingTxtView() {
        return (com.tencent.mm.ui.widget.MMNeat7extView) this.buffingTxtView.getValue();
    }

    private final android.view.View getBuffingView() {
        return (android.view.View) this.buffingView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getLightView() {
        return (android.view.View) this.lightView.getValue();
    }

    public final void c() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.awz, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131820e = inflate;
    }

    public final void d(int i17) {
        com.tencent.mars.xlog.Log.i(this.f131819d, "[updateBuffDone] rewardTotal:" + i17);
        android.view.View buffingView = getBuffingView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(buffingView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateBuffDone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        buffingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(buffingView, "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateBuffDone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getBuffComputingView().setVisibility(8);
        getBuffResultView().setVisibility(0);
        getBuffResultView().setMaxLines(1);
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        getBuffResultView().b(valueOf);
        float o17 = ((ks5.c) getBuffResultView().i(Integer.MAX_VALUE, Integer.MAX_VALUE)).o(0);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.e4i, valueOf);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        getBuffResultView().b(string);
        ks5.a i18 = getBuffResultView().i(Integer.MAX_VALUE, Integer.MAX_VALUE);
        int L = r26.n0.L(string, valueOf, 0, false, 6, null);
        int length = valueOf.length() + L;
        float f17 = ((ks5.c) i18).f(L);
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        if (L >= 0 && length <= string.length()) {
            spannableString.setSpan(new bx2.a(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#FFFFFF"))), L, length, 33);
        }
        getBuffResultView().b(spannableString);
        getBuffResultView().post(new ax2.x(this, f17, o17));
    }

    public final void e(float f17) {
        com.tencent.mars.xlog.Log.i(this.f131819d, "[updateProcessing] rewardTotal:" + f17);
        android.view.View buffingView = getBuffingView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(buffingView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateBuffing", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        buffingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(buffingView, "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateBuffing", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getBuffComputingView().setVisibility(8);
        getBuffResultView().setVisibility(8);
        getBuffingTxtView().setMaxLines(1);
        int i17 = (int) f17;
        java.lang.String valueOf = ((float) i17) == f17 ? java.lang.String.valueOf(i17) : java.lang.String.valueOf(f17);
        getBuffingTxtView().b(valueOf);
        float o17 = ((ks5.c) getBuffingTxtView().i(Integer.MAX_VALUE, Integer.MAX_VALUE)).o(0);
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.e4j, valueOf);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        getBuffingTxtView().b(string);
        ks5.a i18 = getBuffingTxtView().i(Integer.MAX_VALUE, Integer.MAX_VALUE);
        int L = r26.n0.L(string, valueOf, 0, false, 6, null);
        int length = valueOf.length() + L;
        int paddingLeft = (int) (getBuffingView().getPaddingLeft() + ((ks5.c) i18).f(L) + ((o17 / 2) - (getLIGHT_WIDTH() / 2)));
        android.view.View lightView = getLightView();
        android.view.ViewGroup.LayoutParams layoutParams = getLightView().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            android.view.View lightView2 = getLightView();
            kotlin.jvm.internal.o.f(lightView2, "<get-lightView>(...)");
            android.view.ViewGroup.LayoutParams layoutParams2 = lightView2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i19 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            android.view.View lightView3 = getLightView();
            kotlin.jvm.internal.o.f(lightView3, "<get-lightView>(...)");
            android.view.ViewGroup.LayoutParams layoutParams3 = lightView3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i27 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
            android.view.View lightView4 = getLightView();
            kotlin.jvm.internal.o.f(lightView4, "<get-lightView>(...)");
            android.view.ViewGroup.LayoutParams layoutParams4 = lightView4.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            marginLayoutParams.setMargins(paddingLeft, i19, i27, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        }
        lightView.setLayoutParams(layoutParams);
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        if (L >= 0 && length <= string.length()) {
            spannableString.setSpan(new bx2.a(java.lang.Integer.valueOf(android.graphics.Color.parseColor("#FFFFFF"))), L, length, 33);
        }
        getBuffingTxtView().b(spannableString);
    }

    public final void f(int i17) {
        android.view.View buffingArrow = getBuffingArrow();
        int i18 = zl2.r4.f473950a.w1() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(buffingArrow, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateBuffingLeftTime", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        buffingArrow.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(buffingArrow, "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateBuffingLeftTime", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getBuffingTimeView().setText(getContext().getString(com.tencent.mm.R.string.e4m, java.lang.Integer.valueOf(i17)));
    }

    public final void g() {
        android.view.View buffingView = getBuffingView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(buffingView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        buffingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(buffingView, "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getBuffComputingView().setVisibility(0);
        getBuffResultView().setVisibility(8);
        android.view.View lightView = getLightView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(lightView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        lightView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(lightView, "com/tencent/mm/plugin/finder/view/crit/LivePkCritBuffView", "updateComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final int getLIGHT_WIDTH() {
        return ((java.lang.Number) this.LIGHT_WIDTH.getValue()).intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePkCritBuffView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131819d = "LivePkCritBuffView";
        this.buffingView = jz5.h.b(new ax2.v(this));
        this.buffingTxtView = jz5.h.b(new ax2.u(this));
        this.buffingTimeView = jz5.h.b(new ax2.t(this));
        this.buffingArrow = jz5.h.b(new ax2.s(this));
        this.buffComputingView = jz5.h.b(new ax2.q(this));
        this.buffResultView = jz5.h.b(new ax2.r(this));
        this.lightView = jz5.h.b(new ax2.w(this));
        this.LIGHT_WIDTH = jz5.h.b(ax2.p.f15080d);
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePkCritBuffView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131819d = "LivePkCritBuffView";
        this.buffingView = jz5.h.b(new ax2.v(this));
        this.buffingTxtView = jz5.h.b(new ax2.u(this));
        this.buffingTimeView = jz5.h.b(new ax2.t(this));
        this.buffingArrow = jz5.h.b(new ax2.s(this));
        this.buffComputingView = jz5.h.b(new ax2.q(this));
        this.buffResultView = jz5.h.b(new ax2.r(this));
        this.lightView = jz5.h.b(new ax2.w(this));
        this.LIGHT_WIDTH = jz5.h.b(ax2.p.f15080d);
        c();
    }
}
