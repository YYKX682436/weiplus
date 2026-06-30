package rk4;

/* loaded from: classes11.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(bw5.ar0 ar0Var) {
        super(1);
        this.f396723d = ar0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.zq0 it = (bw5.zq0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bw5.zq0 zq0Var = new bw5.zq0();
        zq0Var.parseFrom(it.getData());
        zq0Var.c(1903);
        zq0Var.f36134d = this.f396723d.f25422d;
        zq0Var.f36141g2.put(1, java.lang.Boolean.TRUE);
        return zq0Var;
    }
}
