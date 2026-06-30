package i53;

/* loaded from: classes8.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.d3 f288526e;

    public b3(i53.d3 d3Var, java.lang.String str) {
        this.f288526e = d3Var;
        this.f288525d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        java.util.HashMap hashMap = new java.util.HashMap();
        i53.u z07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().z0(this.f288525d);
        i53.d3 d3Var = this.f288526e;
        if (z07 != null) {
            hashMap.put("type", java.lang.Integer.valueOf(i53.d3.a(d3Var, z07.field_mediaType)));
            if (i53.d3.a(d3Var, z07.field_mediaType) == 2) {
                hashMap.put("videoid", com.tencent.mm.vfs.w6.p(z07.field_filePath));
            }
        }
        i53.x D0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().D0(d3Var.f288547a);
        if (D0 != null) {
            hashMap.put("pushid", D0.field_taskId);
            i17 = D0.field_publishSource;
            i18 = D0.field_sourceSceneId;
        } else {
            i17 = 0;
            i18 = 0;
        }
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8764, 0, 20, i18, lj0.a.a(i17, hashMap));
    }
}
