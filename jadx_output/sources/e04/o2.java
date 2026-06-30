package e04;

/* loaded from: classes15.dex */
public final class o2 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public boolean f246037d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.view.r f246038e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.view.s f246039f;

    /* renamed from: g, reason: collision with root package name */
    public final e04.m2 f246040g;

    public o2(com.tencent.mm.plugin.scanner.view.s sVar, e04.m2 m2Var, com.tencent.mm.plugin.scanner.view.r rVar) {
        this.f246039f = sVar;
        this.f246040g = m2Var;
        this.f246038e = rVar;
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        boolean cancel = super.cancel();
        this.f246037d = true;
        e04.m2 m2Var = this.f246040g;
        if (m2Var != null) {
            m2Var.onDismiss();
        }
        return cancel;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new e04.n2(this));
    }
}
