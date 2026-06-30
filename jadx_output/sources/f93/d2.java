package f93;

/* loaded from: classes11.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.e2 f260310d;

    public d2(f93.e2 e2Var) {
        this.f260310d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "can not drag.");
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260310d.f260327b;
        contactLabelManagerUI.I = false;
        contactLabelManagerUI.A.notifyDataSetChanged();
    }
}
