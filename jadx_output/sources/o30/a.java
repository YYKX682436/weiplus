package o30;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        h62.d.vj().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "scene[%d] errType[%d] errCode[%d] errMsg[%s]", java.lang.Integer.valueOf(m1Var.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }
}
