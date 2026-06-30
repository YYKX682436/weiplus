package e04;

/* loaded from: classes7.dex */
public final class x2 extends ea5.l {
    public final java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        com.tencent.wechat.aff.udr.x Ui = e0Var != null ? ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_0753d60a", str) : null;
        if (Ui == null) {
            com.tencent.mars.xlog.Log.i("ScanUdrResourceFeatureService", "udr resouce for " + str + " null");
        } else {
            if (com.tencent.mm.vfs.w6.j(Ui.getPath())) {
                com.tencent.mars.xlog.Log.i("ScanUdrResourceFeatureService", "udr resouce for " + str + ", path exsit: " + Ui.getPath());
                return Ui.getPath();
            }
            com.tencent.mars.xlog.Log.i("ScanUdrResourceFeatureService", "udr resouce for " + str + ", path not exsit: " + Ui.getPath());
        }
        return null;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
        vVar.d("OverseaUser");
        vVar.e(4);
        arrayList.add(vVar);
        boolean a07 = c01.e2.a0();
        boolean[] zArr = vVar.f217584m;
        if (a07) {
            vVar.f217583i = "1";
            zArr[6] = true;
        } else {
            vVar.f217583i = "0";
            zArr[6] = true;
        }
        com.tencent.mars.xlog.Log.i("ScanUdrResourceFeatureService", "udr paramater OverseaUser: " + vVar + ".paramString");
        return arrayList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_0753d60a";
    }
}
