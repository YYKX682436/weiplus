package wu;

/* loaded from: classes8.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.b1 f449540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f449541e;

    public a1(wu.b1 b1Var, hu.b bVar) {
        this.f449540d = b1Var;
        this.f449541e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f449540d.o(view, this.f449541e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailRecordItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
