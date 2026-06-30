package tl;

/* loaded from: classes12.dex */
public class k0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f420057d;

    public k0(tl.p0 p0Var) {
        this.f420057d = p0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (!this.f420057d.m() || this.f420057d.f420073f == null) {
            tl.p0 p0Var = this.f420057d;
            java.lang.String str = p0Var.f420072e;
            if (str == null) {
                java.util.HashMap hashMap = w21.x0.f442511a;
            } else {
                w21.w0 j17 = w21.x0.j(str);
                if (j17 != null && j17.f442492i == 1) {
                    j17.f442492i = 2;
                    j17.f442484a = 64;
                    java.util.HashMap hashMap2 = w21.x0.f442511a;
                    synchronized (hashMap2) {
                        hashMap2.put(str, new java.lang.ref.WeakReference(p0Var));
                    }
                    w21.x0.w(j17);
                }
            }
            w21.p0.Bi().e();
        } else {
            dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
            qi3.b0 b0Var = this.f420057d.f420073f;
            ((ig0.o) fVar).getClass();
            if (b0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgFeatureService", "startSync task is null");
            } else {
                if (!(b0Var instanceof qi3.c)) {
                    throw new java.lang.UnsupportedOperationException("startSync only support BaseSendMsgTask Type");
                }
                pu.t0 a17 = pu.t0.f358376i.a();
                qi3.c cVar = (qi3.c) b0Var;
                kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(1, 0, null, 6, null);
                cVar.f363678g = b17;
                v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) a17.f358378f).getValue(), null, new pu.r0(cVar, a17, null), 1, null);
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new ig0.l(b17, null), 1, null);
                }
            }
        }
        java.lang.String str2 = this.f420057d.f420072e;
        return false;
    }
}
