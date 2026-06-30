package im2;

/* loaded from: classes10.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f292257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(im2.g4 g4Var) {
        super(0);
        this.f292257d = g4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderLivePlayerFactory", "onFinderForeground:");
        im2.g4 g4Var = this.f292257d;
        g4Var.f292342e = true;
        pm0.v.X(new im2.d4("onFinderForeground", g4Var));
        return jz5.f0.f302826a;
    }
}
