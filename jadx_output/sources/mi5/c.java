package mi5;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pb5.a f326804d;

    public c(pb5.a aVar) {
        this.f326804d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingContactCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pb5.a aVar = this.f326804d;
        com.tencent.mm.storage.f9 n17 = aVar.getLong(aVar.f43702d + 0) != 0 ? pt0.f0.f358209b1.n(aVar.getString(aVar.f43702d + 1), aVar.getLong(aVar.f43702d + 0)) : new com.tencent.mm.storage.f9();
        android.content.Context context = view.getContext();
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str2 = V1;
        m15.a j17 = aVar.j();
        if (j17 == null || (str = j17.toXml()) == null) {
            str = "";
        }
        com.tencent.mm.ui.chatting.viewitems.wg.a(context, str2, str, com.tencent.mm.storage.z3.R4(n17.Q0()), n17.A0() == 0, n17);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingContactCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
