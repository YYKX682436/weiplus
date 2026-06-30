package k23;

/* loaded from: classes12.dex */
public abstract class q extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final k23.d0 f303655d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f303656e;

    /* renamed from: f, reason: collision with root package name */
    public final em.i0 f303657f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f303658g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f303659h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f303660i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f303661m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f303662n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k23.d0 params, com.tencent.mm.ui.MMActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f303655d = params;
        this.f303656e = activity;
        com.tencent.mm.ui.id.b(getContext()).inflate(getLayoutId(), this);
        this.f303657f = new em.i0(this);
        this.f303658g = jz5.h.b(k23.o.f303635d);
        this.f303659h = jz5.h.b(new k23.l(this));
        this.f303660i = jz5.h.b(new k23.i(this));
        this.f303661m = jz5.h.b(new k23.d(this));
        this.f303662n = jz5.h.b(new k23.n(this));
    }

    private final java.util.List<android.animation.ValueAnimator> getEnterValueAnimation() {
        return (java.util.List) ((jz5.n) this.f303661m).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<android.animation.ValueAnimator> getEnterValueAnimationV1() {
        return (java.util.List) ((jz5.n) this.f303660i).getValue();
    }

    private final java.util.List<android.animation.ValueAnimator> getEnterValueAnimationV2() {
        return (java.util.List) ((jz5.n) this.f303659h).getValue();
    }

    private final java.util.List<android.animation.ValueAnimator> getHideValueAnimation() {
        return (java.util.List) ((jz5.n) this.f303662n).getValue();
    }

    public abstract void b(java.util.List list);

    public abstract void c();

    public final void d() {
        c();
        java.util.Iterator<T> it = getEnterValueAnimation().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).start();
        }
    }

    public final void e(yz5.a aVar) {
        f();
        int i17 = 0;
        for (java.lang.Object obj : getHideValueAnimation()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) obj;
            valueAnimator.removeAllListeners();
            if (i17 == 0) {
                valueAnimator.addListener(new k23.p(aVar));
            }
            valueAnimator.start();
            i17 = i18;
        }
    }

    public final void f() {
        java.util.Iterator<T> it = getEnterValueAnimation().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).cancel();
        }
        java.util.Iterator<T> it6 = getHideValueAnimation().iterator();
        while (it6.hasNext()) {
            ((android.animation.ValueAnimator) it6.next()).cancel();
        }
    }

    public final com.tencent.mm.ui.MMActivity getActivity() {
        return this.f303656e;
    }

    public abstract int getLayoutId();

    public final k23.d0 getParams() {
        return this.f303655d;
    }

    public final int getScreenHeight() {
        return ((java.lang.Number) ((jz5.n) this.f303658g).getValue()).intValue();
    }

    public final em.i0 getVb() {
        return this.f303657f;
    }

    public final void setRecognizedText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        em.i0 i0Var = this.f303657f;
        com.tencent.mm.ui.widget.MMTextView c17 = i0Var.c();
        c17.setText(text);
        int lineCount = c17.getLineCount();
        android.view.View view = i0Var.f254413a;
        if (lineCount == 0 || c17.getLineCount() <= c17.getHeight() / c17.getLineHeight()) {
            if (i0Var.f254419g == null) {
                i0Var.f254419g = view.findViewById(com.tencent.mm.R.id.f487282ve4);
            }
            android.view.View view2 = i0Var.f254419g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setGravity(48);
            return;
        }
        if (i0Var.f254419g == null) {
            i0Var.f254419g = view.findViewById(com.tencent.mm.R.id.f487282ve4);
        }
        android.view.View view3 = i0Var.f254419g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setGravity(80);
    }

    public final void setSemiCircleContainerHeight(int i17) {
        com.tencent.mars.xlog.Log.i("FTSFloatingRecognizingPanelView", "setSemiCircleContainerHeight(" + i17 + ')');
        em.i0 i0Var = this.f303657f;
        if (i0Var.f254420h == null) {
            i0Var.f254420h = (android.widget.FrameLayout) i0Var.f254413a.findViewById(com.tencent.mm.R.id.v37);
        }
        android.view.ViewGroup.LayoutParams layoutParams = i0Var.f254420h.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = i17;
        if (i0Var.f254420h == null) {
            i0Var.f254420h = (android.widget.FrameLayout) i0Var.f254413a.findViewById(com.tencent.mm.R.id.v37);
        }
        i0Var.f254420h.setLayoutParams(layoutParams2);
    }

    public final void setSoundWave(int i17) {
        this.f303657f.e().i(i17);
    }

    public final void setTips(boolean z17) {
        com.tencent.mm.ui.widget.MMTextView f17 = this.f303657f.f();
        if (z17) {
            f17.setTextColor(f17.getContext().getColor(com.tencent.mm.R.color.Red_100));
            f17.setText(f17.getContext().getString(com.tencent.mm.R.string.ozz));
        } else {
            f17.setTextColor(f17.getContext().getColor(com.tencent.mm.R.color.f478520a84));
            f17.setText(f17.getContext().getString(com.tencent.mm.R.string.ozy));
        }
    }
}
