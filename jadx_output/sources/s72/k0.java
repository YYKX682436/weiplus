package s72;

/* loaded from: classes12.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s72.p0 f404077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(s72.p0 p0Var) {
        super(0);
        this.f404077d = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPinOnTopService", "All notes fetched, show banner");
        s72.p0 p0Var = this.f404077d;
        p0Var.f404128n = false;
        p0Var.a7();
        return jz5.f0.f302826a;
    }
}
