package rc3;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub f394068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394069g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394070h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f394071i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f394072m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(rc3.w0 w0Var, int i17, com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub, int i18, int i19, int i27, int i28) {
        super(0);
        this.f394066d = w0Var;
        this.f394067e = i17;
        this.f394068f = mBSurfaceStub;
        this.f394069g = i18;
        this.f394070h = i19;
        this.f394071i = i27;
        this.f394072m = i28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jc3.g0 g0Var;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394066d.f394091i;
        if (mBBuildConfig != null && (g0Var = mBBuildConfig.f147828r) != null) {
            g0Var.P8(this.f394067e, this.f394068f, this.f394069g, this.f394070h, this.f394071i, this.f394072m);
        }
        return jz5.f0.f302826a;
    }
}
