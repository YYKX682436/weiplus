package os3;

/* loaded from: classes8.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f348217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.v3 f348218e;

    public u3(os3.v3 v3Var, android.os.Bundle bundle) {
        this.f348218e = v3Var;
        this.f348217d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f348217d;
        if (bundle != null) {
            os3.v3 v3Var = this.f348218e;
            v3Var.f348237d.B = bundle.getString("mail_app_download_url", "");
            v3Var.f348237d.K = bundle.getString("mail_app_enter_url", "");
            v3Var.f348237d.A = bundle.getBoolean("mail_app_show_recommend", false);
            com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = v3Var.f348237d;
            if (readMailUI.A) {
                return;
            }
            android.view.View view = readMailUI.f154941w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$13$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$13$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", "promote qq mail error:MailAppRecomend = %s", java.lang.Boolean.valueOf(v3Var.f348237d.A));
        }
    }
}
