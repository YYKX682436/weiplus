package f93;

/* loaded from: classes11.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.j3 f260349d;

    public h3(f93.j3 j3Var) {
        this.f260349d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        f93.j3 j3Var = this.f260349d;
        if (j3Var.f260365e.f143272J.size() > 0) {
            com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.a(j3Var.f260365e);
        } else {
            j3Var.f260365e.E.E();
            j3Var.f260365e.g7(f93.w3.Empty);
        }
        if (j3Var.f260364d && (n3Var = j3Var.f260365e.Z) != null) {
            n3Var.removeMessages(5002);
            j3Var.f260365e.Z.sendEmptyMessageDelayed(5003, 0L);
        }
        j3Var.f260365e.e7();
    }
}
