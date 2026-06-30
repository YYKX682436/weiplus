package mi5;

/* loaded from: classes9.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe5.c f326817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326818e;

    public d1(oe5.c cVar, com.tencent.mm.storage.f9 f9Var) {
        this.f326817d = cVar;
        this.f326818e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ForwardTingMusicView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oe5.c cVar = this.f326817d;
        if (cVar.getBoolean(cVar.f43702d + 6)) {
            yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingMusicView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.chatting.o6 o6Var = com.tencent.mm.ui.chatting.o6.f202065a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        l15.c j18 = cVar.j();
        com.tencent.mm.storage.f9 f9Var = this.f326818e;
        if (j18 == null || (j17 = j18.toXml()) == null) {
            j17 = f9Var != null ? f9Var.j() : null;
        }
        o6Var.d(context, f9Var, ot0.q.v(j17));
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingMusicView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
