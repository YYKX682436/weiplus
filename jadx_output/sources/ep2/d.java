package ep2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f255702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f255703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep2.e f255704f;

    public d(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, ep2.e eVar) {
        this.f255702d = baseFinderFeed;
        this.f255703e = s0Var;
        this.f255704f = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        in5.s0 s0Var = this.f255703e;
        long adapterPosition = s0Var.getAdapterPosition();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f255702d;
        ((ml2.j0) zbVar).tj(baseFinderFeed, adapterPosition, "94");
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (qe2.a.h(feedObject, context)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f255704f.f255708h.invoke(baseFinderFeed.getFeedObject(), baseFinderFeed.getFeedObject().getUserName());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
