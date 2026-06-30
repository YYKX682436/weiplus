package wu;

/* loaded from: classes9.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.u1 f449628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mvvm.MvvmView f449629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f449630f;

    public t1(wu.u1 u1Var, com.tencent.mm.mvvm.MvvmView mvvmView, hu.b bVar) {
        this.f449628d = u1Var;
        this.f449629e = mvvmView;
        this.f449630f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f449628d.o(this.f449629e, this.f449630f);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
