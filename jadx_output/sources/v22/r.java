package v22;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f432860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f432861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v22.z zVar, boolean z17) {
        super(0);
        this.f432860d = zVar;
        this.f432861e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        v22.z zVar = this.f432860d;
        long j17 = zVar.f432884o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        zVar.f432883n = java.lang.System.currentTimeMillis() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMixer", "mix used " + zVar.f432883n + "ms, frame:" + zVar.f432879j);
        boolean z18 = this.f432861e;
        if (z18) {
            long j18 = zVar.f432883n;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markEmojiMixSucc, costTime:");
            sb6.append(j18);
            sb6.append(", removeBackground:");
            boolean z19 = zVar.f432874e;
            sb6.append(z19);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", sb6.toString());
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1012L, 21L, 1L);
            if (z19) {
                g0Var.C(1012L, 23L, 1L);
            } else {
                g0Var.C(1012L, 22L, 1L);
            }
            if (z19) {
                g0Var.C(1012L, 42L, j18);
            } else {
                g0Var.C(1012L, 39L, j18);
            }
        }
        yz5.l lVar = zVar.f432882m;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z18));
        }
        return jz5.f0.f302826a;
    }
}
