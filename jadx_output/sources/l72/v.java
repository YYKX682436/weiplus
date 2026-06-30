package l72;

/* loaded from: classes11.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f316865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f316867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316868g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI f316869h;

    public v(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI, int i17, int i18, com.tencent.mm.modelbase.m1 m1Var, java.lang.String str) {
        this.f316869h = faceAgreementUI;
        this.f316865d = i17;
        this.f316866e = i18;
        this.f316867f = m1Var;
        this.f316868g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f316866e;
        com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI = this.f316869h;
        int i18 = this.f316865d;
        if (i18 != 0 || i17 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 72L, 1L, false);
            faceAgreementUI.f100206r = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceAgreementUIError", "[cgi-ret]net ret error, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f316868g);
            com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI.T6(faceAgreementUI);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("err_msg", "fail");
            intent.putExtra("err_code", 90110);
            vz2.c.h(90110);
            faceAgreementUI.setResult(1, intent);
            faceAgreementUI.finish();
            return;
        }
        com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI.T6(faceAgreementUI);
        com.tencent.mm.modelbase.m1 m1Var = this.f316867f;
        int i19 = ((j72.d) m1Var).f298046e.f382219f;
        java.lang.String str = ((j72.d) m1Var).f298046e.f382220g;
        faceAgreementUI.f100200i = ((j72.d) m1Var).f298046e.f382221h;
        faceAgreementUI.f100201m = ((j72.d) m1Var).f298046e.f382222i;
        faceAgreementUI.f100202n = ((j72.d) m1Var).f298046e.f382223m;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[cgi-ret]contractRet:%s  tip:%s url:%s contractTitle:%s contractDesc:%s", java.lang.Integer.valueOf(i19), str, faceAgreementUI.f100200i, faceAgreementUI.f100201m, faceAgreementUI.f100202n);
        if (i19 == 1) {
            faceAgreementUI.f100206r = false;
            faceAgreementUI.f100196e.setEnabled(true);
        } else if (android.text.TextUtils.isEmpty(faceAgreementUI.f100200i)) {
            faceAgreementUI.f100206r = false;
            faceAgreementUI.f100197f.setVisibility(4);
            faceAgreementUI.f100196e.setEnabled(true);
        } else {
            faceAgreementUI.f100206r = true;
            k72.u.B.f304768z = true;
        }
        if (faceAgreementUI.f100206r) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 62L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 61L, 1L, false);
        }
        faceAgreementUI.f100198g.setText(str);
    }
}
