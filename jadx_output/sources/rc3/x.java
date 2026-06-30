package rc3;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f394107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rc3.w0 w0Var, boolean z17) {
        super(0);
        this.f394106d = w0Var;
        this.f394107e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jc3.f0 f0Var;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394106d.f394091i;
        if (mBBuildConfig != null && (f0Var = mBBuildConfig.f147831u) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSwitch: ");
            boolean z17 = this.f394107e;
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("MBInspectorImpl", sb6.toString());
            ym5.a1.f(new bf3.v((bf3.z) f0Var, z17));
        }
        return jz5.f0.f302826a;
    }
}
