package go0;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(go0.f0 f0Var, int i17) {
        super(0);
        this.f273747d = f0Var;
        this.f273748e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f1 f1Var = this.f273747d.f273767p;
        if (f1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMirrorMode mirrorMode:");
            int i17 = this.f273748e;
            sb6.append(i17);
            sb6.append(" mirror:");
            sb6.append(f1Var.f330959o);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveTexEditRenderer", sb6.toString());
            f1Var.Q = i17;
        }
        return jz5.f0.f302826a;
    }
}
