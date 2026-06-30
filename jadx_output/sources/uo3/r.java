package uo3;

/* loaded from: classes9.dex */
public class r implements en1.l {
    @Override // en1.l
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("OfflineHandleAuthResponse", "autoAuth: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new uo3.q(this));
    }

    @Override // en1.l
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
