package ra3;

/* loaded from: classes.dex */
public class e implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_flutter_game_enable, 0);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("result", Ni == 1);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
