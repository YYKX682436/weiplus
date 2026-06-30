package com.tencent.mm.plugin.finder.view.crit;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R#\u0010\u000e\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R#\u0010\u0011\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R#\u0010\u0014\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007R#\u0010\u0019\u001a\n \u0003*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001c\u001a\n \u0003*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0018¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "f", "Ljz5/g;", "getLoadingView", "()Landroid/view/View;", "loadingView", "g", "getSuccessView", "successView", "h", "getFailView", "failView", "i", "getFailArrow", "failArrow", "m", "getSuccessArrow", "successArrow", "Landroid/widget/TextView;", "n", "getFailTextView", "()Landroid/widget/TextView;", "failTextView", "o", "getSuccessTextView", "successTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LivePkCritDoneView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f131846d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f131847e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadingView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g successView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g failView;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g failArrow;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g successArrow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g failTextView;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final jz5.g successTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePkCritDoneView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131846d = "Finder.LivePkCritDoneView";
        this.loadingView = jz5.h.b(new ax2.v0(this));
        this.successView = jz5.h.b(new ax2.y0(this));
        this.failView = jz5.h.b(new ax2.u0(this));
        this.failArrow = jz5.h.b(new ax2.s0(this));
        this.successArrow = jz5.h.b(new ax2.w0(this));
        this.failTextView = jz5.h.b(new ax2.t0(this));
        this.successTextView = jz5.h.b(new ax2.x0(this));
        b();
    }

    private final android.view.View getFailArrow() {
        return (android.view.View) this.failArrow.getValue();
    }

    private final android.widget.TextView getFailTextView() {
        return (android.widget.TextView) this.failTextView.getValue();
    }

    private final android.view.View getFailView() {
        return (android.view.View) this.failView.getValue();
    }

    private final android.view.View getLoadingView() {
        return (android.view.View) this.loadingView.getValue();
    }

    private final android.view.View getSuccessArrow() {
        return (android.view.View) this.successArrow.getValue();
    }

    private final android.widget.TextView getSuccessTextView() {
        return (android.widget.TextView) this.successTextView.getValue();
    }

    private final android.view.View getSuccessView() {
        return (android.view.View) this.successView.getValue();
    }

    public final android.text.SpannableString a(int i17, java.lang.String str) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.text.SpannableString("") : new android.text.SpannableString(getContext().getString(com.tencent.mm.R.string.f491752e46, str)) : new android.text.SpannableString(getContext().getString(com.tencent.mm.R.string.e4f, str)) : new android.text.SpannableString(getContext().getString(com.tencent.mm.R.string.e4a, str));
    }

    public final void b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488959ax0, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131847e = inflate;
    }

    public final void c(int i17, java.util.LinkedList linkedList) {
        int i18;
        r45.zh5 zh5Var;
        java.lang.Integer valueOf = (linkedList == null || (zh5Var = (r45.zh5) kz5.n0.Z(linkedList)) == null) ? null : java.lang.Integer.valueOf(zh5Var.getInteger(0));
        com.tencent.mars.xlog.Log.i(this.f131846d, "currentStage:" + i17 + ", type:" + valueOf);
        if (i17 == 3) {
            android.view.View loadingView = getLoadingView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View successView = getSuccessView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(successView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            successView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(successView, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View failView = getFailView();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(failView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            failView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(failView, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnComputing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 4) {
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                android.view.View loadingView2 = getLoadingView();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(loadingView2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadingView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(loadingView2, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View successView2 = getSuccessView();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(successView2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                successView2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(successView2, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View failView2 = getFailView();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(failView2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                failView2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(failView2, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View successArrow = getSuccessArrow();
                i18 = zl2.r4.f473950a.w1() ? 8 : 0;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(successArrow, arrayList7.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                successArrow.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(successArrow, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnSuccess", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.lang.String string = getContext().getString(com.tencent.mm.R.string.e4l);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                android.text.SpannableString a17 = a(intValue, string);
                if (a17.length() == 0) {
                    return;
                }
                int L = r26.n0.L(a17, string, 0, false, 6, null);
                int length = string.length() + L;
                if (L >= 0 && length <= a17.length()) {
                    a17.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#FFCF33")), L, length, 33);
                }
                getSuccessTextView().setText(a17);
                return;
            }
            return;
        }
        if (i17 == 5 && valueOf != null) {
            int intValue2 = valueOf.intValue();
            android.view.View loadingView3 = getLoadingView();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(loadingView3, arrayList8.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView3.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(loadingView3, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View successView3 = getSuccessView();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(successView3, arrayList9.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            successView3.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(successView3, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View failView3 = getFailView();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(failView3, arrayList10.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            failView3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(failView3, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View failArrow = getFailArrow();
            i18 = zl2.r4.f473950a.w1() ? 8 : 0;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(failArrow, arrayList11.toArray(), "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            failArrow.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(failArrow, "com/tencent/mm/plugin/finder/view/crit/LivePkCritDoneView", "refreshOnFailed", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.e4k);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.text.SpannableString a18 = a(intValue2, string2);
            if (a18.length() == 0) {
                return;
            }
            int L2 = r26.n0.L(a18, string2, 0, false, 6, null);
            int length2 = string2.length() + L2;
            if (L2 >= 0 && length2 <= a18.length()) {
                a18.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#FF6146")), L2, length2, 33);
            }
            getFailTextView().setText(a18);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePkCritDoneView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131846d = "Finder.LivePkCritDoneView";
        this.loadingView = jz5.h.b(new ax2.v0(this));
        this.successView = jz5.h.b(new ax2.y0(this));
        this.failView = jz5.h.b(new ax2.u0(this));
        this.failArrow = jz5.h.b(new ax2.s0(this));
        this.successArrow = jz5.h.b(new ax2.w0(this));
        this.failTextView = jz5.h.b(new ax2.t0(this));
        this.successTextView = jz5.h.b(new ax2.x0(this));
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePkCritDoneView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131846d = "Finder.LivePkCritDoneView";
        this.loadingView = jz5.h.b(new ax2.v0(this));
        this.successView = jz5.h.b(new ax2.y0(this));
        this.failView = jz5.h.b(new ax2.u0(this));
        this.failArrow = jz5.h.b(new ax2.s0(this));
        this.successArrow = jz5.h.b(new ax2.w0(this));
        this.failTextView = jz5.h.b(new ax2.t0(this));
        this.successTextView = jz5.h.b(new ax2.x0(this));
        b();
    }
}
