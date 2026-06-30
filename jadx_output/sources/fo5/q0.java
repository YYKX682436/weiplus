package fo5;

/* loaded from: classes14.dex */
public final class q0 implements com.tencent.mm.ui.tools.kd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265068a;

    public q0(fo5.r0 r0Var) {
        this.f265068a = r0Var;
    }

    @Override // com.tencent.mm.ui.tools.kd
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        fo5.r0 r0Var = this.f265068a;
        if (!r0Var.r() || r0Var.A) {
            return false;
        }
        if (i17 != 24 && i17 != 25) {
            return false;
        }
        gp5.e eVar = r0Var.f265089h;
        if (!eVar.f274464e) {
            return true;
        }
        eVar.b();
        return true;
    }
}
