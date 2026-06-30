package os3;

/* loaded from: classes8.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f348059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.e4 f348060e;

    public d4(os3.e4 e4Var, android.os.Bundle bundle) {
        this.f348060e = e4Var;
        this.f348059d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.e4 e4Var = this.f348060e;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = e4Var.f348070d;
        android.os.Bundle bundle = this.f348059d;
        readMailUI.F = bundle.getInt("download_status");
        float f17 = bundle.getFloat("download_progress");
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI2 = e4Var.f348070d;
        android.view.View view = readMailUI2.f154941w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        int i17 = 0;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$18$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$18$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (f17 == 1.0f) {
            readMailUI2.M.d();
            readMailUI2.V6();
            return;
        }
        readMailUI2.W6();
        int i18 = readMailUI2.H;
        if (i18 == 0) {
            readMailUI2.H = readMailUI2.f154941w.getWidth();
        } else {
            i17 = (int) (f17 * i18);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) readMailUI2.f154942x.getLayoutParams();
        layoutParams.width = i17;
        readMailUI2.f154942x.setLayoutParams(layoutParams);
        readMailUI2.M.c(500L, 500L);
    }
}
