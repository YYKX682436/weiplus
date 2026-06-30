package rc3;

/* loaded from: classes7.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(rc3.w0 w0Var, int i17) {
        super(0);
        this.f394001d = w0Var;
        this.f394002e = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jz5.f0, java.lang.Object] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        hq0.k0 k0Var;
        hq0.j0 a17;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394001d.f394091i;
        jc3.r rVar = mBBuildConfig != null ? mBBuildConfig.f147829s : null;
        ?? r37 = jz5.f0.f302826a;
        int i17 = this.f394002e;
        if (rVar != null) {
            jc3.s sVar = rVar instanceof jc3.s ? (jc3.s) rVar : null;
            if (sVar != null) {
                dq0.a0 a0Var = (dq0.a0) sVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewSurfaceAvailable id[" + i17 + ']');
                hq0.i0 t17 = a0Var.t();
                if (t17 != null && (k0Var = t17.f282998m) != null && (a17 = k0Var.a(i17)) != null) {
                    a17.f283024m = true;
                    if (a17.f283023l) {
                        hq0.i0 t18 = a0Var.t();
                        fq0.x S0 = t18 != null ? t18.S0(i17) : null;
                        com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "firstFrame before available, redraw " + i17 + ' ' + S0);
                        if (S0 != null) {
                            S0.f();
                            r1 = r37;
                        }
                        if (r1 == null) {
                            a17.f283021j = true;
                        }
                    }
                    r1 = r37;
                }
                if (r1 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewSurfaceAvailable but canvas not found? " + i17);
                }
            }
        } else {
            java.lang.Object obj = mBBuildConfig != null ? mBBuildConfig.f147828r : null;
            r1 = obj instanceof jc3.h0 ? (jc3.h0) obj : null;
            if (r1 != null) {
                r1.v9(i17);
            }
        }
        return r37;
    }
}
