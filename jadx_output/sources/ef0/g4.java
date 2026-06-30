package ef0;

/* loaded from: classes11.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f252217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(bw5.lp0 lp0Var) {
        super(0);
        this.f252217d = lp0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.ting.TingLaterListenChannel tingLaterListenChannel = rk4.l3.f396814t;
        if (tingLaterListenChannel != null) {
            byte[] byteArray = this.f252217d.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            tingLaterListenChannel.addLaterListen(byteArray, ef0.f4.f252212d);
        }
        return jz5.f0.f302826a;
    }
}
