package rc3;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(rc3.w0 w0Var, java.lang.String str) {
        super(0);
        this.f393950d = w0Var;
        this.f393951e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jc3.f0 f0Var;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f393950d.f394091i;
        if (mBBuildConfig != null && (f0Var = mBBuildConfig.f147831u) != null) {
            java.lang.String str = this.f393951e;
            kotlin.jvm.internal.o.g(str, "str");
            ym5.a1.f(new bf3.u((bf3.z) f0Var, str));
        }
        return jz5.f0.f302826a;
    }
}
