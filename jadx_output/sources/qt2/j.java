package qt2;

/* loaded from: classes2.dex */
public abstract class j extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f366587d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f366588e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f366589f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f366590g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.video.FinderVideoLayout f366591h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f366592i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f366593m;

    /* renamed from: n, reason: collision with root package name */
    public float f366594n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f366595o;

    /* renamed from: p, reason: collision with root package name */
    public int f366596p;

    /* renamed from: q, reason: collision with root package name */
    public int f366597q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f366587d = "FinderShareGuideBaseUIC";
        this.f366594n = 1.0f;
        this.f366596p = -1;
        this.f366597q = -1;
    }

    public static /* synthetic */ void P6(qt2.j jVar, int i17, long j17, float f17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissLayout");
        }
        if ((i18 & 4) != 0) {
            f17 = 0.0f;
        }
        jVar.O6(i17, j17, f17);
    }

    public void O6(int i17, long j17, float f17) {
        android.view.View view;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationYBy2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationYBy3;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator animate4;
        android.view.ViewPropertyAnimator translationYBy4;
        android.view.ViewPropertyAnimator duration4;
        android.view.ViewPropertyAnimator animate5;
        android.view.ViewPropertyAnimator translationYBy5;
        android.view.ViewPropertyAnimator duration5;
        android.view.ViewPropertyAnimator animate6;
        android.view.ViewPropertyAnimator translationYBy6;
        android.view.ViewPropertyAnimator duration6;
        android.view.ViewPropertyAnimator listener2;
        android.view.View view2;
        android.view.View findViewById;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        float f18 = i17;
        boolean z17 = false;
        if (this.f366597q != 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
            android.view.View view7 = null;
            androidx.recyclerview.widget.k3 p07 = recyclerView != null ? recyclerView.p0(getIndex()) : null;
            android.view.View findViewById2 = (p07 == null || (view6 = p07.itemView) == null) ? null : view6.findViewById(com.tencent.mm.R.id.f484486ee3);
            android.view.View findViewById3 = (p07 == null || (view5 = p07.itemView) == null) ? null : view5.findViewById(com.tencent.mm.R.id.g1y);
            android.view.View findViewById4 = (p07 == null || (view4 = p07.itemView) == null) ? null : view4.findViewById(com.tencent.mm.R.id.dq6);
            android.widget.ImageView imageView = (p07 == null || (view3 = p07.itemView) == null) ? null : (android.widget.ImageView) view3.findViewById(com.tencent.mm.R.id.r2o);
            if (p07 != null && (view2 = p07.itemView) != null && (findViewById = view2.findViewById(com.tencent.mm.R.id.tcv)) != null) {
                findViewById.setTag(java.lang.Boolean.FALSE);
                view7 = findViewById;
            }
            if (findViewById2 != null && (animate6 = findViewById2.animate()) != null && (translationYBy6 = animate6.translationYBy(f18)) != null && (duration6 = translationYBy6.setDuration(j17)) != null && (listener2 = duration6.setListener(new qt2.g(this))) != null) {
                listener2.start();
            }
            float f19 = f17 > 0.0f ? f17 + f18 : f18;
            if (findViewById3 != null && (animate5 = findViewById3.animate()) != null && (translationYBy5 = animate5.translationYBy(f19)) != null && (duration5 = translationYBy5.setDuration(j17)) != null) {
                duration5.start();
            }
            if (view7 != null && (animate4 = view7.animate()) != null && (translationYBy4 = animate4.translationYBy(f19)) != null && (duration4 = translationYBy4.setDuration(j17)) != null) {
                duration4.start();
            }
            if (findViewById4 != null && (animate3 = findViewById4.animate()) != null && (translationYBy3 = animate3.translationYBy(f19)) != null && (duration3 = translationYBy3.setDuration(j17)) != null) {
                duration3.start();
            }
            if (imageView != null && (animate2 = imageView.animate()) != null && (translationYBy2 = animate2.translationYBy(f19)) != null && (duration2 = translationYBy2.setDuration(j17)) != null && (listener = duration2.setListener(new qt2.h(this, p07))) != null) {
                listener.start();
            }
            this.f366597q = 0;
        }
        android.view.View view8 = this.f366588e;
        if (view8 != null && view8.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17 || (view = this.f366588e) == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (translationYBy = alpha.translationYBy(f18)) == null || (duration = translationYBy.setDuration(j17)) == null) {
            return;
        }
        duration.start();
    }

    public abstract int Q6();

    public void R6(java.util.List feeds) {
        kotlin.jvm.internal.o.g(feeds, "feeds");
        this.f366595o = feeds;
    }

    public void S6(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.k3 p07;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f366590g = recyclerView;
        recyclerView.i(new qt2.f(this));
        int Q6 = Q6();
        if (Q6 <= 0) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f366590g;
        android.view.View view = (recyclerView2 == null || (p07 = recyclerView2.p0(getIndex())) == null) ? null : p07.itemView;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(Q6) : null;
        this.f366588e = viewStub != null ? viewStub.inflate() : null;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = view != null ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) view.findViewById(com.tencent.mm.R.id.e_k) : null;
        this.f366591h = finderVideoLayout;
        if (finderVideoLayout == null) {
            if (view != null) {
            }
            if (view != null) {
            }
        }
        this.f366592i = (android.view.ViewGroup) getActivity().findViewById(com.tencent.mm.R.id.f484486ee3);
        this.f366593m = view != null ? (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) view.findViewById(com.tencent.mm.R.id.ghd) : null;
    }

    public final boolean T6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((qt2.u) pf5.z.f353948a.a(activity).a(qt2.u.class)).f366616i;
    }

    public void U6() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4 = this.f366588e;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onDismiss", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
        android.view.View view5 = null;
        androidx.recyclerview.widget.k3 p07 = recyclerView != null ? recyclerView.p0(getIndex()) : null;
        android.view.View findViewById = (p07 == null || (view3 = p07.itemView) == null) ? null : view3.findViewById(com.tencent.mm.R.id.f484486ee3);
        android.view.View findViewById2 = (p07 == null || (view2 = p07.itemView) == null) ? null : view2.findViewById(com.tencent.mm.R.id.g1y);
        if (p07 != null && (view = p07.itemView) != null) {
            view5 = view.findViewById(com.tencent.mm.R.id.dq6);
        }
        if (findViewById != null) {
            findViewById.setTranslationY(0.0f);
        }
        if (findViewById2 != null) {
            findViewById2.setTranslationY(0.0f);
        }
        if (view5 == null) {
            return;
        }
        view5.setTranslationY(0.0f);
    }

    public void V6(float f17) {
        android.view.View view = this.f366588e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuideBaseUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void W6(float f17, long j17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationYBy2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationYBy3;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator animate4;
        android.view.ViewPropertyAnimator translationYBy4;
        android.view.ViewPropertyAnimator duration4;
        android.view.ViewPropertyAnimator translationYBy5;
        android.view.ViewPropertyAnimator duration5;
        android.view.View view;
        android.view.View findViewById;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f366590g;
        android.view.View view6 = null;
        androidx.recyclerview.widget.k3 p07 = recyclerView != null ? recyclerView.p0(getIndex()) : null;
        android.view.View findViewById2 = (p07 == null || (view5 = p07.itemView) == null) ? null : view5.findViewById(com.tencent.mm.R.id.f484486ee3);
        android.view.View findViewById3 = (p07 == null || (view4 = p07.itemView) == null) ? null : view4.findViewById(com.tencent.mm.R.id.g1y);
        android.view.View findViewById4 = (p07 == null || (view3 = p07.itemView) == null) ? null : view3.findViewById(com.tencent.mm.R.id.dq6);
        android.widget.ImageView imageView = (p07 == null || (view2 = p07.itemView) == null) ? null : (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.r2o);
        if (p07 != null && (view = p07.itemView) != null && (findViewById = view.findViewById(com.tencent.mm.R.id.tcv)) != null) {
            findViewById.setTag(java.lang.Boolean.TRUE);
            view6 = findViewById;
        }
        if (findViewById2 != null) {
            findViewById2.setTranslationY(findViewById2.getTranslationY() + f17);
            android.view.ViewPropertyAnimator animate5 = findViewById2.animate();
            if (animate5 != null && (translationYBy5 = animate5.translationYBy(-f17)) != null && (duration5 = translationYBy5.setDuration(j17)) != null) {
                duration5.start();
            }
        }
        if (findViewById3 != null && (animate4 = findViewById3.animate()) != null && (translationYBy4 = animate4.translationYBy(-f17)) != null && (duration4 = translationYBy4.setDuration(j17)) != null) {
            duration4.start();
        }
        if (findViewById4 != null && (animate3 = findViewById4.animate()) != null && (translationYBy3 = animate3.translationYBy(-f17)) != null && (duration3 = translationYBy3.setDuration(j17)) != null) {
            duration3.start();
        }
        if (view6 != null && (animate2 = view6.animate()) != null && (translationYBy2 = animate2.translationYBy(-f17)) != null && (duration2 = translationYBy2.setDuration(j17)) != null) {
            duration2.start();
        }
        if (imageView != null && (animate = imageView.animate()) != null && (translationYBy = animate.translationYBy(-f17)) != null && (duration = translationYBy.setDuration(j17)) != null && (listener = duration.setListener(new qt2.i(this, p07))) != null) {
            listener.start();
        }
        this.f366597q = 1;
    }

    public abstract boolean X6();

    public void Y6() {
    }

    public int getIndex() {
        return 0;
    }

    public java.lang.String getTag() {
        return this.f366587d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f366587d = "FinderShareGuideBaseUIC";
        this.f366594n = 1.0f;
        this.f366596p = -1;
        this.f366597q = -1;
    }
}
