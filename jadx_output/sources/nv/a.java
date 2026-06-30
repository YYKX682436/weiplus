package nv;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            yn1.s sVar = (yn1.s) ((mv.v) i95.n0.c(mv.v.class));
            sVar.getClass();
            if (gm0.j1.a()) {
                java.lang.String k17 = gm0.j1.b().k();
                if (com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
                    return;
                }
                kotlin.jvm.internal.o.d(k17);
                sVar.Bi().B("LastActiveTimePrefix#".concat(k17), java.lang.System.currentTimeMillis());
                com.tencent.mm.sdk.platformtools.t8.K1(k17);
            }
        }
    }
}
