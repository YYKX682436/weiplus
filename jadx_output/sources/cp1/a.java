package cp1;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BallAppForegroundListener", "onAppBackground, activity:%s", str);
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        if (!wVar.f53889n && gm0.j1.a() && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().B(false);
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().v0(false);
        }
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai() != null) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai().b(wVar.f53889n);
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BallAppForegroundListener", "onAppForeground, activity:%s", str);
        if (com.tencent.mm.app.w.INSTANCE.f53889n && gm0.j1.a() && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
            boolean V0 = com.tencent.mm.sdk.platformtools.t8.V0(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.BallAppForegroundListener", "onAppForeground isTopApplication: %b", java.lang.Boolean.valueOf(V0));
            if (V0) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().E0(true);
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().v0(true);
            }
        }
    }
}
