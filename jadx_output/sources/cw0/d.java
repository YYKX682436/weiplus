package cw0;

/* loaded from: classes5.dex */
public final class d extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel {
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout A;
    public androidx.appcompat.widget.LinearLayoutCompat B;
    public android.widget.HorizontalScrollView C;
    public android.view.View D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public final int H;
    public final int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 40);
        this.I = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480554ag2);
    }

    public final void B(android.view.View view, boolean z17) {
        float f17;
        if (z17) {
            rv0.a7 a7Var = rv0.b7.f399942d;
            f17 = 1.0f;
        } else {
            rv0.a7 a7Var2 = rv0.b7.f399942d;
            f17 = 0.3f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void C(double d17) {
        android.view.View view = this.F;
        if (view == null) {
            kotlin.jvm.internal.o.o("volumeButton");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = ((int) d17) + this.H;
        view.setLayoutParams(layoutParams2);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.y(true);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.djo, bodyContainerLayout);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486083qm5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setNarrationLayout$plugin_mj_template_release((com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qm6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setNarrationSegmentEditOptContainer$plugin_mj_template_release((androidx.appcompat.widget.LinearLayoutCompat) findViewById2);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qhv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.C = (android.widget.HorizontalScrollView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qr7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.D = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.qr6);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.E = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.q3p);
        findViewById6.setOnClickListener(new cw0.b(this));
        this.F = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f486084or);
        findViewById7.setOnClickListener(cw0.c.f222616d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.G = findViewById7;
        androidx.appcompat.widget.LinearLayoutCompat narrationSegmentEditOptContainer$plugin_mj_template_release = getNarrationSegmentEditOptContainer$plugin_mj_template_release();
        by0.v vVar = by0.v.f36351a;
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(narrationSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266947s, com.tencent.mm.R.string.lwo, com.tencent.mm.R.drawable.aqu, narrationSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new cw0.m0(this)));
        android.view.View view = new android.view.View(narrationSegmentEditOptContainer$plugin_mj_template_release.getContext());
        view.setTag(cw0.a.f222602d);
        androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(-1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(view);
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(narrationSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266936e, com.tencent.mm.R.string.ll8, com.tencent.mm.R.drawable.cmv, narrationSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new cw0.n0(this)));
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(narrationSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266948t, com.tencent.mm.R.string.lwn, com.tencent.mm.R.drawable.cpl, narrationSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new cw0.o0(this)));
        android.view.View a17 = vVar.a(narrationSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266939h, com.tencent.mm.R.string.llc, com.tencent.mm.R.drawable.f481034cn0, narrationSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new cw0.p0(this));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(a17);
        android.view.View view2 = new android.view.View(narrationSegmentEditOptContainer$plugin_mj_template_release.getContext());
        androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(view2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), view2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = view2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = view2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(-1);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(view2);
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(narrationSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266949u, com.tencent.mm.R.string.f492512hk, com.tencent.mm.R.drawable.f481035lr, narrationSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new cw0.q0(this)));
        narrationSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(narrationSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266950v, com.tencent.mm.R.string.f492513iu, com.tencent.mm.R.drawable.f481033n3, narrationSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new cw0.r0(this)));
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout getNarrationLayout$plugin_mj_template_release() {
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout mCVoiceInputLayout = this.A;
        if (mCVoiceInputLayout != null) {
            return mCVoiceInputLayout;
        }
        kotlin.jvm.internal.o.o("narrationLayout");
        throw null;
    }

    public final androidx.appcompat.widget.LinearLayoutCompat getNarrationSegmentEditOptContainer$plugin_mj_template_release() {
        androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat = this.B;
        if (linearLayoutCompat != null) {
            return linearLayoutCompat;
        }
        kotlin.jvm.internal.o.o("narrationSegmentEditOptContainer");
        throw null;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        android.widget.HorizontalScrollView horizontalScrollView = this.C;
        if (horizontalScrollView != null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, horizontalScrollView, java.lang.Integer.valueOf(this.I));
        } else {
            kotlin.jvm.internal.o.o("containerOfOptContainer");
            throw null;
        }
    }

    public final void setNarrationLayout$plugin_mj_template_release(com.tencent.mm.mj_publisher.finder.movie_composing.widgets.voice.MCVoiceInputLayout mCVoiceInputLayout) {
        kotlin.jvm.internal.o.g(mCVoiceInputLayout, "<set-?>");
        this.A = mCVoiceInputLayout;
    }

    public final void setNarrationSegmentEditOptContainer$plugin_mj_template_release(androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat) {
        kotlin.jvm.internal.o.g(linearLayoutCompat, "<set-?>");
        this.B = linearLayoutCompat;
    }
}
