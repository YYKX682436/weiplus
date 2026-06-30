package wu;

/* loaded from: classes8.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.n1 f449598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.b f449599e;

    public m1(wu.n1 n1Var, hu.b bVar) {
        this.f449598d = n1Var;
        this.f449599e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailTingMusicItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f449598d.q(view, this.f449599e);
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailTingMusicItemConvert$onBindContainerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
