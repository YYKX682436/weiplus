package i33;

/* loaded from: classes.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f288227d;

    public m1(yz5.a aVar) {
        this.f288227d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/IConfirmButtonUIC$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f288227d;
        java.lang.Boolean bool = aVar != null ? (java.lang.Boolean) aVar.invoke() : null;
        kotlin.jvm.internal.o.e(bool, "null cannot be cast to non-null type kotlin.Boolean");
        bool.booleanValue();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/IConfirmButtonUIC$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
