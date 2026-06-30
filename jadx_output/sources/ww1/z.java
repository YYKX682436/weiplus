package ww1;

/* loaded from: classes15.dex */
public class z implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.a0 f450367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.b0 f450368b;

    public z(ww1.c0 c0Var, long j17, ww1.a0 a0Var, ww1.b0 b0Var) {
        this.f450367a = a0Var;
        this.f450368b = b0Var;
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
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectPayerMsgAdapter", "getContact failed");
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f450367a.f450082f, this.f450368b.f450195d, null);
    }
}
