package v04;

@j95.b(dependencies = {com.tencent.mm.plugin.messenger.foundation.h2.class})
/* loaded from: classes4.dex */
public class a extends i95.w implements w04.j {
    @Override // w04.j
    public void A9(int i17, java.lang.String str, int i18) {
        wi(i17, str, i18, null);
    }

    @Override // w04.j
    public void W8(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        byte[] bArr;
        r45.da7 da7Var = new r45.da7();
        da7Var.f372279d = i19;
        da7Var.f372280e = str2;
        try {
            bArr = da7Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClipBordReportImpl", "getExtInfo exp %s", e17.getMessage());
            bArr = null;
        }
        wi(i17, str, i18, bArr);
    }

    public void wi(int i17, java.lang.String str, int i18, byte[] bArr) {
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClipBordReportImpl", "operationInfo isNullOrNil");
            return;
        }
        if (gm0.j1.a()) {
            r45.r40 r40Var = new r45.r40();
            r40Var.f384517d = i17;
            r40Var.f384519f = i18;
            byte[] bytes = str.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c));
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            r40Var.f384518e = cu5Var;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(bArr);
                r40Var.f384520g = cu5Var2;
            }
            r45.s40 s40Var = new r45.s40();
            java.util.LinkedList linkedList = s40Var.f385492e;
            linkedList.add(r40Var);
            s40Var.f385491d = linkedList.size();
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(211, s40Var));
        }
    }

    @Override // w04.j
    public void xd(int i17, int i18, java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        r45.qm4 qm4Var = new r45.qm4();
        qm4Var.f384093d = str;
        qm4Var.f384094e = str2;
        try {
            bArr = qm4Var.toByteArray();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClipBordReportImpl", "getExtInfo exp %s", e17.getMessage());
            bArr = null;
        }
        wi(i17, "", i18, bArr);
    }
}
