package zh1;

/* loaded from: classes8.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f472927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.c1 f472928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f472929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f472930g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.ui.widget.dialog.k0 k0Var, zh1.c1 c1Var, android.content.Context context, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        super(0);
        this.f472927d = k0Var;
        this.f472928e = c1Var;
        this.f472929f = context;
        this.f472930g = appBrandOpenMaterialCollection;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new zh1.n0(this.f472927d, this.f472928e, this.f472929f, this.f472930g);
    }
}
