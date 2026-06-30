package cx;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f224366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cx.f0 f0Var, int i17, java.lang.String str) {
        super(0);
        this.f224366d = f0Var;
        this.f224367e = i17;
        this.f224368f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cx.f0 f0Var = this.f224366d;
        f0Var.Di(1);
        java.lang.String str = this.f224368f;
        int i17 = this.f224367e;
        if (i17 == 1) {
            cx.w0 w0Var = f0Var.f224422e;
            if (w0Var != null) {
                w0Var.G1(new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.mixedflow.event.MBJsEventOnAdServerInfo().f147881d, str);
            }
        } else if (i17 == 2) {
            com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.mixedflow.event.MBJsEventOnRecFeedsAdServerInfo mBJsEventOnRecFeedsAdServerInfo = new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.mixedflow.event.MBJsEventOnRecFeedsAdServerInfo();
            cl0.g gVar = new cl0.g();
            gVar.h("adInfo", str);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            mBJsEventOnRecFeedsAdServerInfo.f147882e = gVar2;
            cx.w0 w0Var2 = f0Var.f224422e;
            if (w0Var2 != null) {
                w0Var2.G1(mBJsEventOnRecFeedsAdServerInfo.f147881d, gVar2);
            }
        }
        return jz5.f0.f302826a;
    }
}
