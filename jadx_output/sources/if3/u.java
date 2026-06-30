package if3;

/* loaded from: classes.dex */
public class u extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f291205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f291206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(if3.v vVar, int i17, r35.m3 m3Var, java.lang.String str, java.lang.ref.WeakReference weakReference, long j17) {
        super(i17, m3Var);
        this.f291204e = str;
        this.f291205f = weakReference;
        this.f291206g = j17;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", this.f291204e);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("mass_send_sys_msg_tips", "view_clk", hashMap, 31081);
        boolean x17 = c01.z1.x();
        java.lang.ref.WeakReference weakReference = this.f291205f;
        if (x17) {
            android.content.Context context = (android.content.Context) weakReference.get();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = ((android.content.Context) weakReference.get()).getString(com.tencent.mm.R.string.m6f);
            e4Var.c();
            return;
        }
        android.content.Intent intent = new android.content.Intent((android.content.Context) weakReference.get(), (java.lang.Class<?>) com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.class);
        long j17 = this.f291206g;
        intent.putExtra("INTENT_POSITION_MASS_INFO", java.lang.String.valueOf(j17));
        android.content.Context context2 = (android.content.Context) weakReference.get();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/masssend/model/HandleMasSendTipClickListener$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/masssend/model/HandleMasSendTipClickListener$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.HandleMasSendTipClickListener", "onClickImp:" + j17, null);
    }
}
