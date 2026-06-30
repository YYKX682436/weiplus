package mi5;

/* loaded from: classes9.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe5.b f326800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f326802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v05.b f326803g;

    public b1(oe5.b bVar, com.tencent.mm.storage.f9 f9Var, bw5.o50 o50Var, v05.b bVar2) {
        this.f326800d = bVar;
        this.f326801e = f9Var;
        this.f326802f = o50Var;
        this.f326803g = bVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        bw5.o50 o50Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oe5.b bVar = this.f326800d;
        if (bVar.getBoolean(bVar.f43702d + 6)) {
            yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.storage.f9 f9Var = this.f326801e;
        if (f9Var != null && (o50Var = this.f326802f) != null) {
            if (bVar.getBoolean(bVar.f43702d + 6)) {
                yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                com.tencent.mm.ui.chatting.o6 o6Var = com.tencent.mm.ui.chatting.o6.f202065a;
                v05.b bVar2 = this.f326803g;
                o6Var.b(f9Var, o50Var, bVar2.getString(bVar2.f368365d + 0));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingListView$onUpdateViewModelNew$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
