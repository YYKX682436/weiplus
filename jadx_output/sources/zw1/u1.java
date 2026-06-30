package zw1;

/* loaded from: classes15.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f476813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vf5 f476814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476816g;

    public u1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, android.widget.Toast toast, r45.vf5 vf5Var, r45.o90 o90Var) {
        this.f476816g = collectMainUI;
        this.f476813d = toast;
        this.f476814e = vf5Var;
        this.f476815f = o90Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f476813d.cancel();
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476816g;
        r45.vf5 vf5Var = this.f476814e;
        if (vf5Var != null) {
            int i17 = com.tencent.mm.plugin.collect.ui.CollectMainUI.f96385e2;
            collectMainUI.r7(vf5Var);
        }
        r45.o90 o90Var = this.f476815f;
        if (o90Var != null) {
            int i18 = com.tencent.mm.plugin.collect.ui.CollectMainUI.f96385e2;
            collectMainUI.s7(o90Var);
        }
    }
}
