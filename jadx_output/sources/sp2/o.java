package sp2;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.p f411117d;

    public o(sp2.p pVar) {
        this.f411117d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sp2.p pVar = this.f411117d;
        yz5.a aVar = pVar.f411173e;
        if (aVar != null) {
            aVar.invoke();
        }
        ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) pVar.f411174f).getValue()).h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
