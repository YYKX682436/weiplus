package z90;

/* loaded from: classes4.dex */
public class j implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (gm0.j1.a()) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(m1Var == null ? -1 : m1Var.getType());
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Integer.valueOf(i18);
            objArr[3] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv onIDKeyCallback onSceneEnd[%d][%d, %d, %s]", objArr);
            if (i17 == 0 && i18 == 0) {
                ((ku5.t0) ku5.t0.f312615d).g(new z90.i(this));
            }
        }
    }
}
