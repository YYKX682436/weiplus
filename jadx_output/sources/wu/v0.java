package wu;

/* loaded from: classes.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.e2 f449633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f449634e;

    public v0(wu.e2 e2Var, hu.b bVar) {
        this.f449633d = e2Var;
        this.f449634e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailOtherItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f449633d.f449566b;
        kotlin.jvm.internal.o.d(view);
        pVar.invoke(view, this.f449634e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailOtherItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
