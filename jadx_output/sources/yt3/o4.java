package yt3;

/* loaded from: classes10.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f465574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(yt3.r4 r4Var) {
        super(0);
        this.f465574d = r4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notice: configProvider is null  ");
        yt3.r4 r4Var = this.f465574d;
        sb6.append(r4Var.f465650h);
        sb6.append("  ");
        sb6.append(r4Var.f465649g);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.e("MicroMsg.RemuxPlugin", sb6.toString());
        return jz5.f0.f302826a;
    }
}
