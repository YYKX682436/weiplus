package wb5;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f444435d;

    public b(wb5.i iVar) {
        this.f444435d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wb5.i.T6(this.f444435d, 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/uic/SelectSendCardUIC$onCreate$1$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
