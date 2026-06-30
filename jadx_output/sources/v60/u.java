package v60;

@j95.b
/* loaded from: classes8.dex */
public class u extends i95.w implements w60.i, w60.j {
    public w60.k Ai(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, byte[] bArr) {
        return new com.tencent.mm.modelsimple.k0(str, str2, i17, i18, i19, bArr);
    }

    public w60.k wi(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, java.lang.String str3, int i28, byte[] bArr) {
        com.tencent.mm.modelsimple.k0 k0Var = new com.tencent.mm.modelsimple.k0(str, i18);
        r45.r83 r83Var = (r45.r83) k0Var.f71356e.f70710a.f70684a;
        r83Var.f384610d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        r83Var.f384615i = du5Var;
        r83Var.f384618o = i17;
        r83Var.f384619p = str2;
        r83Var.f384622s = i18;
        r83Var.f384626w = i19;
        r83Var.f384627x = i27;
        r83Var.f384628y = i28;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = str3;
        du5Var2.f372757e = true;
        r83Var.f384612f = du5Var2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        r83Var.B = cu5Var;
        com.tencent.mm.sdk.platformtools.t8.l(bArr);
        return k0Var;
    }
}
