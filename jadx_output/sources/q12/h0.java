package q12;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q12.k0 f359585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f359586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q12.k0 k0Var, com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f359585d = k0Var;
        this.f359586e = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        q12.k0 k0Var = this.f359585d;
        java.lang.Runnable runnable = k0Var.f359599e;
        pm0.v.C(runnable);
        k0Var.f359598d.add(this.f359586e);
        pm0.v.U(1000L, runnable);
        return jz5.f0.f302826a;
    }
}
