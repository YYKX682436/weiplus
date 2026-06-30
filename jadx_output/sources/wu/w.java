package wu;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.x f449636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f449637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f449638f;

    public w(wu.x xVar, android.widget.FrameLayout frameLayout, hu.b bVar) {
        this.f449636d = xVar;
        this.f449637e = frameLayout;
        this.f449638f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f449637e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f449636d.r(context, this.f449638f);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailFileItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
