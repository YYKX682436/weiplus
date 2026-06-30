package gx0;

/* loaded from: classes5.dex */
public final class j6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276573d;

    public j6(gx0.w8 w8Var) {
        this.f276573d = w8Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        gx0.fd fdVar = (gx0.fd) obj;
        java.util.Objects.toString(fdVar);
        gx0.w8 w8Var = this.f276573d;
        android.content.res.Resources a17 = j65.q.a(w8Var.getContext());
        if ((fdVar == null ? -1 : gx0.i6.f276528a[fdVar.ordinal()]) != 1) {
            android.widget.ImageView imageView = w8Var.G;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("playButton");
                throw null;
            }
            imageView.setContentDescription(a17.getString(com.tencent.mm.R.string.mbu));
            android.widget.ImageView imageView2 = w8Var.G;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("playButton");
                throw null;
            }
            java.lang.ThreadLocal threadLocal = d3.q.f226108a;
            imageView2.setImageDrawable(d3.l.a(a17, com.tencent.mm.R.drawable.cn8, null));
            return;
        }
        android.widget.ImageView imageView3 = w8Var.G;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("playButton");
            throw null;
        }
        imageView3.setContentDescription(a17.getString(com.tencent.mm.R.string.mbt));
        android.widget.ImageView imageView4 = w8Var.G;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("playButton");
            throw null;
        }
        java.lang.ThreadLocal threadLocal2 = d3.q.f226108a;
        imageView4.setImageDrawable(d3.l.a(a17, com.tencent.mm.R.drawable.cll, null));
        if (w8Var.v7().f69344f.f68644d) {
            com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = w8Var.W6().l7();
            com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView rootView = w8Var.w7();
            gx0.s8 s8Var = new gx0.s8(w8Var);
            gx0.t8 t8Var = new gx0.t8(w8Var);
            gx0.u8 u8Var = new gx0.u8(w8Var);
            ou0.s sVar = w8Var.f277112J;
            sVar.getClass();
            kotlin.jvm.internal.o.g(rootView, "rootView");
            if (l76 != null) {
                java.lang.String P0 = l76.P0();
                kotlin.jvm.internal.o.f(P0, "getTitle(...)");
                if (!(P0.length() == 0)) {
                    return;
                }
            }
            if (sVar.f348908a == null) {
                android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.q8r);
                if (findViewById == null) {
                    sVar.f348908a = null;
                    return;
                }
                sVar.f348908a = new zu0.j(findViewById);
                s8Var.invoke();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager", "tryAddMovieMovieTitleTip", "(Lcom/tencent/maas/moviecomposing/segments/MovieTitleSegment;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager", "tryAddMovieMovieTitleTip", "(Lcom/tencent/maas/moviecomposing/segments/MovieTitleSegment;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setOnClickListener(new ou0.q(t8Var));
                rootView.findViewById(com.tencent.mm.R.id.q7t).setOnClickListener(new ou0.r(u8Var, sVar, l76));
            }
        }
    }
}
