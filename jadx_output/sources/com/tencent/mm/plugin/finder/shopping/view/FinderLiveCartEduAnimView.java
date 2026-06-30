package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveCartEduAnimView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f126280d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f126281e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f126282f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f126283g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f126284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCartEduAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e99, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f126280d = inflate;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.twf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126281e = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126282f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.u4r);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f126283g = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486222uo1);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f126284h = findViewById4;
        c();
    }

    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        android.view.View view = this.f126281e;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(200L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(200L);
        android.view.View view2 = this.f126283g;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        ofFloat3.setDuration(500L);
        android.view.View view3 = this.f126284h;
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(500L);
        ofFloat4.setStartDelay(200L);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
        ofFloat5.setDuration(200L);
        ofFloat5.setStartDelay(500L);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 1.0f, 0.0f);
        ofFloat6.setDuration(200L);
        ofFloat6.setStartDelay(700L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        animatorSet.addListener(new xt2.o(nVar));
        animatorSet.start();
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.shopping.view.FinderLiveCartEduAnimView.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c() {
        android.view.View view = this.f126280d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f126281e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f126281e;
        view3.setScaleX(1.0f);
        view3.setScaleY(1.0f);
        this.f126282f.setAlpha(0.0f);
        android.view.View view4 = this.f126283g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view5 = this.f126284h;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveCartEduAnimView", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveCartEduAnimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e99, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f126280d = inflate;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.twf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f126281e = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126282f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.u4r);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f126283g = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486222uo1);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f126284h = findViewById4;
        c();
    }
}
