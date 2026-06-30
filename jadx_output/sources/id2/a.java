package id2;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f290473d;

    public a(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f290473d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f290473d.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
