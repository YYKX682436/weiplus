package qg5;

/* loaded from: classes8.dex */
public final class r4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.w4 f363164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f363165e;

    public r4(qg5.w4 w4Var, db5.g3 g3Var) {
        this.f363164d = w4Var;
        this.f363165e = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoForwardChatRecordsTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsTosDialog", "User accepted TOS");
        qg5.w4 w4Var = this.f363164d;
        w4Var.f363249e = true;
        com.tencent.mm.ui.widget.dialog.a4 a4Var = this.f363165e.f212055d;
        if (a4Var != null) {
            a4Var.dismiss();
        }
        yz5.a aVar = w4Var.f363246b;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoForwardChatRecordsTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
