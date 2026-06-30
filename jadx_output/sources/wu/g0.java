package wu;

/* loaded from: classes8.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.h0 f449578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f449579e;

    public g0(wu.h0 h0Var, hu.b bVar) {
        this.f449578d = h0Var;
        this.f449579e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailImgItemConvert$onBindContainerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f449578d.o(view, this.f449579e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailImgItemConvert$onBindContainerView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
