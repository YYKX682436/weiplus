package sc3;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding f406443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding, int i17) {
        super(1);
        this.f406443d = appBrandJsBridgeBinding;
        this.f406444e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lc3.a0 res = (lc3.a0) obj;
        kotlin.jvm.internal.o.g(res, "res");
        this.f406443d.invokeCallbackHandler(this.f406444e, res.a(), com.tencent.mm.plugin.appbrand.jsapi.jf.b(null));
        return jz5.f0.f302826a;
    }
}
