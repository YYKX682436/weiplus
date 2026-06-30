package nc5;

/* loaded from: classes10.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336199d;

    public f(nc5.o oVar) {
        this.f336199d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nc5.o oVar = this.f336199d;
        if (oVar.f336216d) {
            nc5.b bVar = nc5.b.f336189a;
            bVar.a(oVar.f336214b);
            nc5.b.f336191c = "";
            nc5.b.f336192d = oVar.f336220h;
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Vi(oVar.f336213a, bVar);
        } else {
            oVar.d();
        }
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(2);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
