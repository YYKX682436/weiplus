package tl2;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f420264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f420265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tl2.u uVar, l81.b1 b1Var, android.content.Context context) {
        super(0);
        this.f420263d = uVar;
        this.f420264e = b1Var;
        this.f420265f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tl2.u uVar = this.f420263d;
        l81.b1 b1Var = this.f420264e;
        uVar.f420283p = b1Var;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f420265f, b1Var);
        return jz5.f0.f302826a;
    }
}
