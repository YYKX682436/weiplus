package on2;

/* loaded from: classes3.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f347017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f347018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(boolean z17, on2.z2 z2Var, java.lang.String str) {
        super(0);
        this.f347017d = z17;
        this.f347018e = z2Var;
        this.f347019f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f347019f;
        on2.z2 z2Var = this.f347018e;
        boolean z17 = this.f347017d;
        if (z17) {
            z2Var.c7(str);
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "removeLotteryInfoFromList localLotteryInfo:" + z2Var.f347092m + " remove:" + pm0.v.d0(z2Var.f347091i, new on2.s2(str)) + ",saveId:" + z17 + '!');
        z2Var.Z6("remove", false);
        return jz5.f0.f302826a;
    }
}
