package dr4;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dr4.c0 c0Var) {
        super(0);
        this.f242768d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.c0 c0Var = this.f242768d;
        c0Var.f242605h = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "stop set pauseRender");
        c0Var.f242608k = true;
        return jz5.f0.f302826a;
    }
}
