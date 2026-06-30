package xv0;

/* loaded from: classes5.dex */
public final class g extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.p f457383J;
    public yz5.a K;
    public yz5.a L;
    public android.view.ViewGroup M;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar N;
    public android.widget.TextView P;
    public android.view.ViewGroup Q;
    public android.view.View R;
    public android.view.View S;
    public xv0.a T;
    public java.util.List U;
    public final pp0.l0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
        this.V = (pp0.l0) i95.n0.c(pp0.l0.class);
    }

    public final void K() {
        boolean z17;
        android.view.View view = this.S;
        if (view == null) {
            return;
        }
        java.util.List list = this.U;
        if (list == null) {
            kotlin.jvm.internal.o.o("colorAdjItems");
            throw null;
        }
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                z17 = true;
                if (java.lang.Float.compare(((xv0.a) it.next()).f457373d, (float) 0) != 0) {
                    break;
                }
            }
        }
        z17 = false;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel", "updateResetButtonState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel", "updateResetButtonState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void L(float f17) {
        if (java.lang.Float.compare(f17, 0.0f) == 0) {
            android.widget.TextView textView = this.P;
            if (textView != null) {
                textView.setText("0");
                return;
            } else {
                kotlin.jvm.internal.o.o("intensityTv");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.P;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("intensityTv");
            throw null;
        }
        java.lang.String format = java.lang.String.format("%+d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (f17 * 100))}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        textView2.setText(format);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfw, bodyContainerLayout);
    }

    public final yz5.a getOnApplyToAllButtonClicked() {
        return this.K;
    }

    public final yz5.a getOnResetButtonClicked() {
        return this.L;
    }

    public final yz5.p getOnValueChangedCallback() {
        return this.f457383J;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.f492488ll1);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        super.p();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, this.R, null);
        yy0.m7 m7Var = (yy0.m7) this.V;
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.e3(m7Var, null), 3, null);
    }

    public final void setOnApplyToAllButtonClicked(yz5.a aVar) {
        this.K = aVar;
    }

    public final void setOnResetButtonClicked(yz5.a aVar) {
        this.L = aVar;
    }

    public final void setOnValueChangedCallback(yz5.p pVar) {
        this.f457383J = pVar;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q7k);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.M = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q7j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.N = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.q7l);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.P = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.q3x);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.Q = (android.view.ViewGroup) findViewById4;
        this.R = findViewById(com.tencent.mm.R.id.q3i);
        this.S = findViewById(com.tencent.mm.R.id.q3o);
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("seekbarContainer");
            throw null;
        }
        viewGroup.setVisibility(4);
        android.view.ViewGroup viewGroup2 = this.M;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("seekbarContainer");
            throw null;
        }
        viewGroup2.setEnabled(false);
        xv0.b[] values = xv0.b.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(values.length);
        for (xv0.b bVar : values) {
            int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479723df);
            int h18 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479671c8);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
            linearLayout.setTag(bVar);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(h17, -2);
            linearLayout.setOrientation(1);
            layoutParams.setMarginStart(h18);
            layoutParams.setMarginEnd(h18);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setGravity(1);
            android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
            imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h17, h17));
            imageView.setImageResource(bVar.f457376e);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.b4o);
            linearLayout.addView(imageView);
            android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479738dv);
            textView.setLayoutParams(layoutParams2);
            textView.setText(bVar.f457375d);
            textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.ac_));
            textView.setTextSize(1, 12.0f);
            linearLayout.addView(textView);
            android.widget.TextView textView2 = new android.widget.TextView(getContext());
            textView2.setTextColor(i65.a.d(textView2.getContext(), com.tencent.mm.R.color.ac9));
            textView2.setTextSize(1, 10.0f);
            textView2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(textView2);
            arrayList.add(new xv0.a(bVar, 0.0f, linearLayout, textView2));
        }
        this.U = arrayList;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xv0.a aVar = (xv0.a) it.next();
            android.view.ViewGroup viewGroup3 = this.Q;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("itemContainer");
                throw null;
            }
            viewGroup3.addView(aVar.f457371b);
            aVar.f457371b.setOnClickListener(new xv0.d(this, aVar));
            com.tencent.maas.moviecomposing.segments.Segment segment = getFocusedSegmentVM().f257167a;
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment != null) {
                int ordinal = aVar.f457370a.ordinal();
                if (ordinal == 0) {
                    aVar.a(clipSegment.p1());
                } else if (ordinal == 1) {
                    aVar.a(clipSegment.r1());
                } else if (ordinal == 2) {
                    aVar.a(clipSegment.t1());
                } else if (ordinal == 3) {
                    aVar.a(clipSegment.w1());
                } else if (ordinal == 4) {
                    aVar.a(clipSegment.y1());
                } else if (ordinal == 5) {
                    aVar.a(clipSegment.u1());
                }
            }
        }
        android.view.View view = this.R;
        if (view != null) {
            view.setOnClickListener(new xv0.e(this));
        }
        android.view.View view2 = this.S;
        if (view2 != null) {
            view2.setOnClickListener(new xv0.f(this));
        }
        K();
    }
}
