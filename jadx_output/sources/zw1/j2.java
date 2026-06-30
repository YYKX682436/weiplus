package zw1;

/* loaded from: classes4.dex */
public class j2 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zw1.k2 f476674a;

    public j2(zw1.k2 k2Var, long j17) {
        this.f476674a = k2Var;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            com.tencent.mm.modelavatar.g.f(str, 3);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.wi().i(str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectPayInfoPreference", "getContact failed");
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        zw1.k2 k2Var = this.f476674a;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(k2Var.N, k2Var.P, null);
    }
}
