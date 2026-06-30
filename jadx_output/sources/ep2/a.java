package ep2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f255696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f255697f;

    public a(java.lang.String str, java.lang.Object obj, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f255695d = str;
        this.f255696e = obj;
        this.f255697f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindLive$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        ml2.t1 t1Var = ml2.t1.f327942e;
        a4Var.b("94", b17, "square_card_friend_like_word", this.f255695d);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        ((c61.p2) ybVar).Aj(this.f255696e, this.f255697f.getFeedObject());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindLive$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
