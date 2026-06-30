package ze5;

/* loaded from: classes9.dex */
public final class e9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471910e;

    public e9(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f471909d = dVar;
        this.f471910e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemScheduleMsgMvvm$createViewModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pj5.k kVar = pj5.k.f355386a;
        android.app.Activity g17 = this.f471909d.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        kVar.c(g17, this.f471910e);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemScheduleMsgMvvm$createViewModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
