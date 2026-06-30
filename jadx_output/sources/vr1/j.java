package vr1;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vr1.o oVar) {
        super(0);
        this.f439572d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new xm3.t0(this.f439572d.P6(), new in5.s() { // from class: com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadRvUIC$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                xr1.n nVar = xr1.n.f456203e;
                return type == 1 ? new wr1.a() : new wr1.b();
            }
        }, true);
    }
}
