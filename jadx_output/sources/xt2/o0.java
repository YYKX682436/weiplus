package xt2;

/* loaded from: classes3.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.p0 f456916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(xt2.p0 p0Var) {
        super(0);
        this.f456916d = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) ((jz5.n) this.f456916d.f456937l).getValue(), true);
        b4Var.setLogging(false);
        return b4Var;
    }
}
