package wu;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.k f449567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mvvm.MvvmView f449568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f449569f;

    public f(wu.k kVar, com.tencent.mm.mvvm.MvvmView mvvmView, hu.b bVar) {
        this.f449567d = kVar;
        this.f449568e = mvvmView;
        this.f449569f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailAskShareItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f449567d.o(this.f449568e, this.f449569f);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailAskShareItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
