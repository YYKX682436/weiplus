package ep2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep2.k f255718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f255720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f255721g;

    public i(ep2.k kVar, java.lang.String str, java.lang.Object obj, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f255718d = kVar;
        this.f255719e = str;
        this.f255720f = obj;
        this.f255721g = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert$bindLive$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String valueOf = java.lang.String.valueOf(this.f255718d.f255724m);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        ml2.u1 u1Var = ml2.u1.f328040e;
        a4Var.b(valueOf, b17, "square_card_friend_like_word", this.f255719e);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        ((c61.p2) ybVar).Aj(this.f255720f, this.f255721g.getFeedObject());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert$bindLive$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
