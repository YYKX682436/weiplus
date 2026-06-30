package yw2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f466644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw2.n f466645e;

    public h(android.content.Context context, yw2.n nVar) {
        this.f466644d = context;
        this.f466645e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder$onBuildDrawerFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) c17;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("FROM_SOURCE", 2);
        com.tencent.mm.plugin.finder.storage.FinderItem feedObj = this.f466645e.k().getFeedObj();
        intent.putExtra("FEED_ID", feedObj != null ? feedObj.getId() : 0L);
        i0Var.mj(this.f466644d, intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder$onBuildDrawerFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
