package e23;

/* loaded from: classes9.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f247005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f247006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a2 f247007f;

    public z1(e23.a2 a2Var, android.widget.LinearLayout linearLayout, android.content.Context context) {
        this.f247007f = a2Var;
        this.f247005d = linearLayout;
        this.f247006e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) this.f247005d.getTag()).intValue();
        e23.a2 a2Var = this.f247007f;
        if (a2Var.f246776b.f246798q.size() > intValue && intValue >= 0) {
            r45.vx5 vx5Var = (r45.vx5) a2Var.f246776b.f246798q.get(intValue);
            android.content.Context context = this.f247006e;
            if (context instanceof com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI) {
                com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI fTSWXPayNotifyUI = (com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI) context;
                fTSWXPayNotifyUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "jump to wxpay module, name: %s, controlinfo type: %s", vx5Var.f388646d, java.lang.Integer.valueOf(vx5Var.f388647e.f373147d));
                r45.e90 e90Var = vx5Var.f388647e;
                if (e90Var != null && e90Var.f373147d == 2 && e90Var.f373149f != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("key_not_goto_launcher_ui_when_back", true);
                    o05.l lVar = (o05.l) i95.n0.c(o05.l.class);
                    androidx.appcompat.app.AppCompatActivity context2 = fTSWXPayNotifyUI.getContext();
                    r45.yt5 yt5Var = vx5Var.f388647e.f373149f;
                    ((ps4.g) lVar).getClass();
                    com.tencent.mm.plugin.wallet_core.utils.z1.c(context2, yt5Var, bundle);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
