package qz2;

/* loaded from: classes9.dex */
public class w implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI f367919d;

    public w(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI) {
        this.f367919d = fingerPrintAuthUI;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI = this.f367919d;
        if (i17 == 0) {
            fingerPrintAuthUI.f137013i.b(fingerPrintAuthUI, "0", 1);
            return;
        }
        if (i17 != -1) {
            if (i17 != -3) {
                int i18 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.f137007o;
                fingerPrintAuthUI.U6(str, i17);
                return;
            } else {
                fingerPrintAuthUI.f137010f = false;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = fingerPrintAuthUI.getString(com.tencent.mm.R.string.f_k);
                }
                db5.e1.C(fingerPrintAuthUI, str, "", fingerPrintAuthUI.getString(com.tencent.mm.R.string.f493629l14), fingerPrintAuthUI.getString(com.tencent.mm.R.string.kmf), false, new qz2.a0(fingerPrintAuthUI, i17), new qz2.b0(fingerPrintAuthUI, i17));
                return;
            }
        }
        int i19 = com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.f137007o;
        fingerPrintAuthUI.getClass();
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (currentTimeMillis - fingerPrintAuthUI.f137012h > 1) {
            fingerPrintAuthUI.f137012h = currentTimeMillis;
            fingerPrintAuthUI.f137008d.setText(com.tencent.mm.R.string.f_e);
            fingerPrintAuthUI.f137008d.setTextColor(fingerPrintAuthUI.getResources().getColor(com.tencent.mm.R.color.a2y));
            fingerPrintAuthUI.f137008d.setVisibility(4);
            if (fingerPrintAuthUI.f137011g == null) {
                fingerPrintAuthUI.f137011g = android.view.animation.AnimationUtils.loadAnimation(fingerPrintAuthUI.getContext(), com.tencent.mm.R.anim.f477791bk);
            }
            fingerPrintAuthUI.f137008d.startAnimation(fingerPrintAuthUI.f137011g);
            com.tencent.mm.sdk.platformtools.u3.i(new qz2.x(fingerPrintAuthUI), fingerPrintAuthUI.f137011g.getDuration());
        }
    }
}
