package ou0;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f348905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ou0.s f348906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.MovieTitleSegment f348907f;

    public r(yz5.a aVar, ou0.s sVar, com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment) {
        this.f348905d = aVar;
        this.f348906e = sVar;
        this.f348907f = movieTitleSegment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager$tryAddMovieMovieTitleTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f348905d.invoke();
        this.f348906e.a(true, this.f348907f);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/MovieTitleTipManager$tryAddMovieMovieTitleTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
