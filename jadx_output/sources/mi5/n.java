package mi5;

/* loaded from: classes9.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x05.k f326882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326883e;

    public n(x05.k kVar, java.lang.String str) {
        this.f326882d = kVar;
        this.f326883e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFinderLiveView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te5.t tVar = te5.t.f418749a;
        kotlin.jvm.internal.o.d(view);
        tVar.h(view, this.f326882d, this.f326883e);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFinderLiveView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
