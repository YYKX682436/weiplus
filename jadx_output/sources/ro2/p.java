package ro2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398086g;

    public p(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f398083d = qeVar;
        this.f398084e = s0Var;
        this.f398085f = context;
        this.f398086g = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f398084e;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f398083d;
        ro2.r.c(qeVar, s0Var);
        ro2.t tVar = ro2.t.f398094e;
        android.content.Context context = this.f398085f;
        kotlin.jvm.internal.o.f(context, "$context");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f398086g;
        kotlin.jvm.internal.o.f(item, "$item");
        ro2.r.h(qeVar, tVar, context, item);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
