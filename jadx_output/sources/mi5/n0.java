package mi5;

/* loaded from: classes9.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob5.a f326884d;

    public n0(ob5.a aVar) {
        this.f326884d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingPhotoAccountNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ob5.a aVar = this.f326884d;
        com.tencent.mm.storage.f9 n17 = aVar.getLong(aVar.f43702d + 0) != 0 ? pt0.f0.f358209b1.n(aVar.getString(aVar.f43702d + 1), aVar.getLong(aVar.f43702d + 0)) : new com.tencent.mm.storage.f9();
        ze5.q4 q4Var = ze5.r4.f472180a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str2 = V1;
        l15.c j17 = aVar.j();
        if (j17 == null || (str = j17.toXml()) == null) {
            str = "";
        }
        q4Var.d(context, str2, str, com.tencent.mm.storage.z3.R4(n17.Q0()), n17.A0() == 0, n17);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingPhotoAccountNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
