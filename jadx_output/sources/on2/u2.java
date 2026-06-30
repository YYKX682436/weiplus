package on2;

/* loaded from: classes3.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f347025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.z f347026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(on2.z2 z2Var, km2.z zVar) {
        super(0);
        this.f347025d = z2Var;
        this.f347026e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.z zVar = this.f347026e;
        on2.z2 z2Var = this.f347025d;
        z2Var.f347092m = zVar;
        z2Var.e7(null);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "replaceLocalLotteryInfo:" + z2Var.f347092m);
        return jz5.f0.f302826a;
    }
}
