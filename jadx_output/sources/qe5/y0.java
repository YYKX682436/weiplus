package qe5;

/* loaded from: classes12.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f362220d;

    public y0(qe5.n1 n1Var) {
        this.f362220d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$FileReceiveStateHandler$handlePauseSend$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kd5.e T6 = this.f362220d.T6();
        com.tencent.mm.storage.f9 f9Var = T6 != null ? T6.f306877e : null;
        if (f9Var != null) {
            java.lang.String U1 = f9Var.U1();
            if (U1 == null) {
                U1 = "";
            }
            ot0.q v17 = ot0.q.v(U1);
            kotlin.jvm.internal.o.f(v17, "parse(...)");
            com.tencent.mm.pluginsdk.model.app.k0.A(f9Var, v17.n());
            d35.i iVar = d35.i.f226347a;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC$FileReceiveStateHandler$handlePauseSend$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
