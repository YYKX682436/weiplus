package ni4;

/* loaded from: classes.dex */
public final class f implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ej4.j) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            ((ej4.j) m1Var).getClass();
            d17.q(4099, this);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.SquareItemConvert", "onSceneEnd NetSceneTextStatusLike ok");
            }
        }
    }
}
