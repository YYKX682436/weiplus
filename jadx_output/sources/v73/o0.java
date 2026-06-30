package v73;

/* loaded from: classes9.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ax3 f433719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433720e;

    public o0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI, r45.ax3 ax3Var) {
        this.f433720e = honeyPayMainUI;
        this.f433719d = ax3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ax3 ax3Var = this.f433719d;
        java.lang.String str = ax3Var.f370336i;
        java.lang.String str2 = ax3Var.f370337m;
        int i17 = com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.f142334u;
        this.f433720e.W6(str, false, str2);
        yj0.a.h(this, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
