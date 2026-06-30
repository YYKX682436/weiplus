package tw1;

/* loaded from: classes5.dex */
public class e implements com.tencent.mm.modelbase.u0 {
    public e(tw1.f fVar) {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(304, this);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCollect", "set sound fail!");
    }
}
