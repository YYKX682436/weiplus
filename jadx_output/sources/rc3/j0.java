package rc3;

/* loaded from: classes7.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(rc3.w0 w0Var, int i17) {
        super(0);
        this.f394011d = w0Var;
        this.f394012e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394011d.f394091i;
        jc3.r rVar = mBBuildConfig != null ? mBBuildConfig.f147829s : null;
        if (rVar == null) {
            java.lang.Object obj = mBBuildConfig != null ? mBBuildConfig.f147828r : null;
            jc3.h0 h0Var = obj instanceof jc3.h0 ? (jc3.h0) obj : null;
            if (h0Var != null) {
                h0Var.zf(this.f394012e);
            }
        } else if (rVar instanceof jc3.s) {
        }
        return jz5.f0.f302826a;
    }
}
