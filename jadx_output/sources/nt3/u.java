package nt3;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nt3.a0 a0Var) {
        super(0);
        this.f339810d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f339810d.f339722m, "onDecodeEnd, encodeFrameCount:" + this.f339810d.I + ", drawFrameCount:" + this.f339810d.f339709J);
        this.f339810d.K = true;
        nt3.a0.e(this.f339810d);
        return jz5.f0.f302826a;
    }
}
