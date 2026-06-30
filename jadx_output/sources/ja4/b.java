package ja4;

/* loaded from: classes.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f298619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f298620e;

    public b(android.app.Dialog dialog, android.view.View view) {
        this.f298619d = dialog;
        this.f298620e = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onClick");
        android.app.Dialog dialog = this.f298619d;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        android.view.View view2 = this.f298620e;
        if (view2 != null) {
            view2.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$2");
    }
}
