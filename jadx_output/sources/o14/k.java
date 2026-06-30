package o14;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f342283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f342284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI f342285f;

    public k(android.os.CancellationSignal cancellationSignal, com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI) {
        this.f342283d = cancellationSignal;
        this.f342284e = u3Var;
        this.f342285f = fixToolsFileListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b17 = v24.o.b(this.f342283d);
        ((ku5.t0) ku5.t0.f312615d).B(new o14.j(this.f342284e, b17, this.f342285f));
    }
}
