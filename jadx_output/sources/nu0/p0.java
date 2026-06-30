package nu0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f340060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f340061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, nu0.q0 q0Var) {
        super(1);
        this.f340060d = i17;
        this.f340061e = q0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateSnapshotInternal] index:");
        int i17 = this.f340060d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("ImageControlUIC", sb6.toString());
        nu0.q0 q0Var = this.f340061e;
        ((java.util.ArrayList) q0Var.f340077t).remove(i17);
        ((java.util.ArrayList) q0Var.f340077t).add(i17, path);
        nu0.q0.W6(q0Var);
        return jz5.f0.f302826a;
    }
}
