package wu;

/* loaded from: classes8.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.l0 f449588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f449589e;

    public k0(wu.l0 l0Var, hu.b bVar) {
        this.f449588d = l0Var;
        this.f449589e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailNoteItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f449588d.o(view, this.f449589e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailNoteItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
