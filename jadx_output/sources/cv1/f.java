package cv1;

/* loaded from: classes12.dex */
public class f implements en1.l {
    @Override // en1.l
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
    }

    @Override // en1.l
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        r45.zv4 zv4Var = ciVar.f342914a;
        if (zv4Var.f392390d != 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new cv1.e(zv4Var.C, zv4Var.H, zv4Var.I));
        }
    }
}
