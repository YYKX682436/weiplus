package u21;

/* loaded from: classes12.dex */
public class m implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        t21.p3 Zi = t21.o2.Zi();
        if (!Zi.f414865e || (n3Var = Zi.f414864d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoService", "onSceneEnd error!, handler or thread is null!");
        } else {
            n3Var.post(new t21.m3(Zi, m1Var, i17, i18));
        }
    }
}
