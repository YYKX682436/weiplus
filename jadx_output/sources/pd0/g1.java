package pd0;

/* loaded from: classes11.dex */
public class g1 implements en1.l {
    @Override // en1.l
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] type 1 report triggered, autoauth: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).h(new od0.p(), "SIRWorker");
        } else {
            od0.r.Ai(540999680, null);
        }
        fo3.s sVar = fo3.s.INSTANCE;
        java.lang.String Sf = sVar.Sf("ce_login_id");
        if (android.text.TextUtils.isEmpty(Sf) || z17) {
            return;
        }
        sVar.c2(Sf, 2);
    }

    @Override // en1.l
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] type 2 report triggered.");
        od0.r.Ai(540999681, null);
        fo3.s sVar = fo3.s.INSTANCE;
        java.lang.String Sf = sVar.Sf("ce_reg");
        if (android.text.TextUtils.isEmpty(Sf)) {
            return;
        }
        sVar.c2(Sf, 1);
    }
}
