package wu;

/* loaded from: classes8.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.z f449645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f449646e;

    public y(wu.z zVar, hu.b bVar) {
        this.f449645d = zVar;
        this.f449646e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailFinderFeedItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f449645d.o(view, this.f449646e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFinderFeedItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
