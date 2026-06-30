package go0;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f273800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(go0.f0 f0Var, boolean z17) {
        super(0);
        this.f273799d = f0Var;
        this.f273800e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f1 f1Var = this.f273799d.f273767p;
        if (f1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("renderBlendToScreen from ");
            sb6.append(f1Var.f273777z);
            sb6.append(" to ");
            boolean z17 = this.f273800e;
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveTexEditRenderer", sb6.toString());
            f1Var.f273777z = z17;
        }
        return jz5.f0.f302826a;
    }
}
