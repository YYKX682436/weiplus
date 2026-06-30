package lx;

/* loaded from: classes10.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f322026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f322027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, int i17) {
        super(1);
        this.f322026d = flutterBizPlugin;
        this.f322027e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((kotlin.Result) obj).getValue();
        com.tencent.mars.xlog.Log.i(this.f322026d.f65253d, "onBizFinderLiveInfoUpdate " + this.f322027e);
        return jz5.f0.f302826a;
    }
}
