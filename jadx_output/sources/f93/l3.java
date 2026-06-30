package f93;

/* loaded from: classes11.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.o3 f260381d;

    public l3(f93.o3 o3Var) {
        this.f260381d = o3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "can not drag.");
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260381d.f260414b;
        contactLabelSelectUI.T = false;
        contactLabelSelectUI.E.notifyDataSetChanged();
    }
}
