package qg5;

/* loaded from: classes8.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.a4 f363223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f363224e;

    public v3(qg5.a4 a4Var, db5.g3 g3Var) {
        this.f363223d = a4Var;
        this.f363224e = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "User accepted TOS");
        qg5.a4 a4Var = this.f363223d;
        a4Var.f362911e = true;
        com.tencent.mm.ui.widget.dialog.a4 a4Var2 = this.f363224e.f212055d;
        if (a4Var2 != null) {
            a4Var2.dismiss();
        }
        yz5.a aVar = a4Var.f362908b;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
