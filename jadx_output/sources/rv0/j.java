package rv0;

/* loaded from: classes5.dex */
public final class j extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel {
    public android.view.ViewGroup A;
    public androidx.appcompat.widget.LinearLayoutCompat B;
    public androidx.appcompat.widget.LinearLayoutCompat C;
    public android.view.View D;
    public android.widget.ImageView E;
    public android.widget.TextView F;
    public final int G;
    public boolean H;
    public ex0.a0 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f400052J;
    public final jz5.g K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.G = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 40);
        this.H = true;
        this.K = jz5.h.b(new rv0.g(context));
    }

    private final int getEditOperationMarginBottom() {
        return ((java.lang.Number) ((jz5.n) this.K).getValue()).intValue();
    }

    public final void B(int i17) {
        h(this.f400052J, "ClipPanel is not attached");
        android.view.View view = this.D;
        if (view == null) {
            kotlin.jvm.internal.o.o("volumeButton");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i17 + this.G;
        view.setLayoutParams(layoutParams2);
        I();
        H();
        E();
        K();
        D();
    }

    public final void C(android.view.View view, boolean z17) {
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void D() {
        boolean z17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null) {
            return;
        }
        ex0.r n17 = a0Var.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        int ordinal = fVar.f257169c.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = fVar.f257130f;
            if (elementSegment.k0() || elementSegment.j0()) {
                z17 = true;
                android.view.View findViewWithTag = getStorylineSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266938g);
                kotlin.jvm.internal.o.f(findViewWithTag, "findViewWithTag(...)");
                C(findViewWithTag, z17);
            }
        }
        z17 = false;
        android.view.View findViewWithTag2 = getStorylineSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266938g);
        kotlin.jvm.internal.o.f(findViewWithTag2, "findViewWithTag(...)");
        C(findViewWithTag2, z17);
    }

    public final void E() {
        ex0.v vVar;
        java.util.List list;
        ex0.a0 a0Var = this.I;
        ex0.r n17 = a0Var != null ? a0Var.n() : null;
        androidx.appcompat.widget.LinearLayoutCompat musicSegmentEditOptContainer$plugin_mj_template_release = getMusicSegmentEditOptContainer$plugin_mj_template_release();
        fv0.a aVar = fv0.a.f266936e;
        android.view.View findViewWithTag = musicSegmentEditOptContainer$plugin_mj_template_release.findViewWithTag(aVar);
        kotlin.jvm.internal.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, n17 != null);
        ex0.a0 a0Var2 = this.I;
        int size = (a0Var2 == null || (vVar = a0Var2.f257097g) == null || (list = vVar.f257177e) == null) ? 0 : ((java.util.ArrayList) list).size();
        android.view.View findViewWithTag2 = getStorylineSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(aVar);
        kotlin.jvm.internal.o.f(findViewWithTag2, "findViewWithTag(...)");
        C(findViewWithTag2, n17 != null && size > 1);
    }

    public final void F() {
        boolean z17;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        ex0.a0 a0Var = this.I;
        if (a0Var == null) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_mj_publisher_digizoom_enabled, 1) == 1) {
            ug.m mVar = ug.m.ImageClip;
            ex0.v vVar = a0Var.f257097g;
            vVar.getClass();
            java.util.List list = vVar.f257177e;
            if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    if (((ex0.r) it.next()).f257169c == mVar) {
                        z17 = true;
                        break;
                    }
                }
            }
        }
        z17 = false;
        if (!z17) {
            android.view.View findViewWithTag = getStorylineSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266954z);
            if (findViewWithTag != null) {
                getStorylineSegmentEditOptContainer$plugin_mj_template_release().removeView(findViewWithTag);
                return;
            }
            return;
        }
        int i17 = a0Var.B() ? com.tencent.mm.R.drawable.d5m : com.tencent.mm.R.drawable.d5l;
        androidx.appcompat.widget.LinearLayoutCompat storylineSegmentEditOptContainer$plugin_mj_template_release = getStorylineSegmentEditOptContainer$plugin_mj_template_release();
        fv0.a aVar = fv0.a.f266954z;
        if (storylineSegmentEditOptContainer$plugin_mj_template_release.findViewWithTag(aVar) != null) {
            androidx.appcompat.widget.LinearLayoutCompat storylineSegmentEditOptContainer$plugin_mj_template_release2 = getStorylineSegmentEditOptContainer$plugin_mj_template_release();
            kotlin.jvm.internal.o.g(storylineSegmentEditOptContainer$plugin_mj_template_release2, "<this>");
            android.view.View findViewWithTag2 = storylineSegmentEditOptContainer$plugin_mj_template_release2.findViewWithTag(aVar);
            if (findViewWithTag2 == null || (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewWithTag2.findViewWithTag("icon")) == null) {
                return;
            }
            weImageView.setImageResource(i17);
            return;
        }
        androidx.appcompat.widget.LinearLayoutCompat storylineSegmentEditOptContainer$plugin_mj_template_release3 = getStorylineSegmentEditOptContainer$plugin_mj_template_release();
        android.view.View a17 = by0.v.f36351a.a(this, aVar, com.tencent.mm.R.string.o8i, i17, 0, new rv0.p4(this));
        fv0.a aVar2 = fv0.a.f266935d;
        kotlin.jvm.internal.o.g(storylineSegmentEditOptContainer$plugin_mj_template_release3, "<this>");
        android.view.View findViewWithTag3 = storylineSegmentEditOptContainer$plugin_mj_template_release3.findViewWithTag(aVar2);
        if (findViewWithTag3 == null) {
            return;
        }
        storylineSegmentEditOptContainer$plugin_mj_template_release3.addView(a17, storylineSegmentEditOptContainer$plugin_mj_template_release3.indexOfChild(findViewWithTag3) + 1);
    }

    public final void G() {
        ex0.a0 a0Var = this.I;
        ex0.r n17 = a0Var != null ? a0Var.n() : null;
        if (n17 == null) {
            getMusicSegmentEditOptContainer$plugin_mj_template_release().setVisibility(8);
            getStorylineSegmentEditOptContainer$plugin_mj_template_release().setVisibility(8);
            return;
        }
        if (n17.f257169c == ug.m.Music) {
            getMusicSegmentEditOptContainer$plugin_mj_template_release().setVisibility(0);
            getStorylineSegmentEditOptContainer$plugin_mj_template_release().setVisibility(8);
        } else {
            getMusicSegmentEditOptContainer$plugin_mj_template_release().setVisibility(8);
            getStorylineSegmentEditOptContainer$plugin_mj_template_release().setVisibility(0);
        }
        I();
        H();
        E();
        K();
        D();
    }

    public final void H() {
        ex0.r n17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null || (n17 = a0Var.n()) == null) {
            return;
        }
        ug.m mVar = ug.m.Music;
        ug.m mVar2 = n17.f257169c;
        if (mVar2 == mVar) {
            return;
        }
        int ordinal = mVar2.ordinal();
        boolean z17 = ordinal == 2 || ordinal == 3;
        android.view.View findViewWithTag = getStorylineSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266943o);
        kotlin.jvm.internal.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, z17);
    }

    public final void I() {
        ex0.r n17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null || (n17 = a0Var.n()) == null) {
            return;
        }
        if (n17.f257169c == ug.m.Music) {
            return;
        }
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) a0Var.f257106p.getValue();
        boolean n18 = mJTime != null ? n17.n(mJTime) : false;
        android.view.View findViewWithTag = getStorylineSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266939h);
        kotlin.jvm.internal.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, n18);
    }

    public final void J(boolean z17) {
        if (this.f400052J) {
            if (z17) {
                android.widget.ImageView imageView = this.E;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("volumeIconView");
                    throw null;
                }
                imageView.setImageResource(com.tencent.mm.R.drawable.cng);
                android.widget.TextView textView = this.F;
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.lmv);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("volumeTextView");
                    throw null;
                }
            }
            android.widget.ImageView imageView2 = this.E;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("volumeIconView");
                throw null;
            }
            imageView2.setImageResource(com.tencent.mm.R.drawable.cm8);
            android.widget.TextView textView2 = this.F;
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.lmw);
            } else {
                kotlin.jvm.internal.o.o("volumeTextView");
                throw null;
            }
        }
    }

    public final void K() {
        ex0.r n17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null || (n17 = a0Var.n()) == null) {
            return;
        }
        android.view.View findViewWithTag = getStorylineSegmentEditOptContainer$plugin_mj_template_release().findViewWithTag(fv0.a.f266944p);
        kotlin.jvm.internal.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, n17.f257169c == ug.m.MovieClip);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.y(true);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfp, bodyContainerLayout);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q4p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.A = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q8s);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setMusicSegmentEditOptContainer$plugin_mj_template_release((androidx.appcompat.widget.LinearLayoutCompat) findViewById2);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qaj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setStorylineSegmentEditOptContainer$plugin_mj_template_release((androidx.appcompat.widget.LinearLayoutCompat) findViewById3);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.qbi);
        if (this.H) {
            weImageView.setVisibility(0);
            weImageView.setEnableColorFilter(false);
            weImageView.setOnClickListener(new rv0.h(this));
        } else {
            weImageView.setVisibility(8);
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.q3p);
        android.view.View findViewById5 = findViewById4.findViewById(com.tencent.mm.R.id.q3q);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.E = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = findViewById4.findViewById(com.tencent.mm.R.id.q3r);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.F = (android.widget.TextView) findViewById6;
        findViewById4.setOnClickListener(new rv0.i(this));
        this.D = findViewById4;
        getStorylineSegmentEditOptContainer$plugin_mj_template_release().removeAllViews();
        androidx.appcompat.widget.LinearLayoutCompat storylineSegmentEditOptContainer$plugin_mj_template_release = getStorylineSegmentEditOptContainer$plugin_mj_template_release();
        storylineSegmentEditOptContainer$plugin_mj_template_release.setVisibility(0);
        storylineSegmentEditOptContainer$plugin_mj_template_release.setOrientation(0);
        by0.v vVar = by0.v.f36351a;
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266953y, com.tencent.mm.R.string.mtp, com.tencent.mm.R.drawable.cwg, 0, new rv0.h4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266935d, com.tencent.mm.R.string.lkz, com.tencent.mm.R.drawable.cms, 0, new rv0.i4(this)));
        android.view.View view = new android.view.View(storylineSegmentEditOptContainer$plugin_mj_template_release.getContext());
        androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(-1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel_StorylineEditKt", "initStorylineEditOptContainer", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel_StorylineEditKt", "initStorylineEditOptContainer", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(view);
        fv0.a aVar = fv0.a.f266936e;
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, aVar, com.tencent.mm.R.string.ll8, com.tencent.mm.R.drawable.cmv, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.j4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266937f, com.tencent.mm.R.string.lla, com.tencent.mm.R.drawable.cmy, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.k4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266938g, com.tencent.mm.R.string.f492487ll0, com.tencent.mm.R.drawable.cmt, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.l4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266939h, com.tencent.mm.R.string.llc, com.tencent.mm.R.drawable.f481034cn0, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.m4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266940i, com.tencent.mm.R.string.ll9, com.tencent.mm.R.drawable.cmw, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.n4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266952x, com.tencent.mm.R.string.mtq, com.tencent.mm.R.drawable.cwh, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.o4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266941m, com.tencent.mm.R.string.f492488ll1, com.tencent.mm.R.drawable.cmu, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.d4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266943o, com.tencent.mm.R.string.llb, com.tencent.mm.R.drawable.cmz, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.e4(this)));
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, fv0.a.f266942n, com.tencent.mm.R.string.ll_, com.tencent.mm.R.drawable.cmx, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.f4(this)));
        fv0.a aVar2 = fv0.a.f266944p;
        storylineSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(storylineSegmentEditOptContainer$plugin_mj_template_release, aVar2, com.tencent.mm.R.string.lld, com.tencent.mm.R.drawable.f481036cn1, storylineSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.g4(this)));
        getMusicSegmentEditOptContainer$plugin_mj_template_release().removeAllViews();
        androidx.appcompat.widget.LinearLayoutCompat musicSegmentEditOptContainer$plugin_mj_template_release = getMusicSegmentEditOptContainer$plugin_mj_template_release();
        musicSegmentEditOptContainer$plugin_mj_template_release.setVisibility(8);
        musicSegmentEditOptContainer$plugin_mj_template_release.setOrientation(0);
        musicSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(musicSegmentEditOptContainer$plugin_mj_template_release, aVar, com.tencent.mm.R.string.ll8, com.tencent.mm.R.drawable.cmv, 0, new rv0.b4(this)));
        musicSegmentEditOptContainer$plugin_mj_template_release.addView(vVar.a(musicSegmentEditOptContainer$plugin_mj_template_release, aVar2, com.tencent.mm.R.string.lld, com.tencent.mm.R.drawable.f481036cn1, musicSegmentEditOptContainer$plugin_mj_template_release.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new rv0.c4(this)));
    }

    public final androidx.appcompat.widget.LinearLayoutCompat getMusicSegmentEditOptContainer$plugin_mj_template_release() {
        androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat = this.C;
        if (linearLayoutCompat != null) {
            return linearLayoutCompat;
        }
        kotlin.jvm.internal.o.o("musicSegmentEditOptContainer");
        throw null;
    }

    public final boolean getShouldShowAssetAddingEntry() {
        return this.H;
    }

    public final androidx.appcompat.widget.LinearLayoutCompat getStorylineSegmentEditOptContainer$plugin_mj_template_release() {
        androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat = this.B;
        if (linearLayoutCompat != null) {
            return linearLayoutCompat;
        }
        kotlin.jvm.internal.o.o("storylineSegmentEditOptContainer");
        throw null;
    }

    public final ex0.a0 getTimelineViewModel() {
        return this.I;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        this.f400052J = true;
        android.view.ViewGroup viewGroup = this.A;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("editOperationRootContainer");
            throw null;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, viewGroup, java.lang.Integer.valueOf(getEditOperationMarginBottom()));
        G();
    }

    public final void setMusicSegmentEditOptContainer$plugin_mj_template_release(androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat) {
        kotlin.jvm.internal.o.g(linearLayoutCompat, "<set-?>");
        this.C = linearLayoutCompat;
    }

    public final void setShouldShowAssetAddingEntry(boolean z17) {
        this.H = z17;
    }

    public final void setStorylineSegmentEditOptContainer$plugin_mj_template_release(androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat) {
        kotlin.jvm.internal.o.g(linearLayoutCompat, "<set-?>");
        this.B = linearLayoutCompat;
    }

    public final void setTimelineViewModel(ex0.a0 a0Var) {
        this.I = a0Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void t() {
        this.f400052J = false;
    }
}
