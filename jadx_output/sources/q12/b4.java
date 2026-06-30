package q12;

/* loaded from: classes8.dex */
public class b4 implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiFeatureService", "received onSceneEnd when account was not ready, errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof z12.y) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ui(i17, i18);
        }
    }
}
