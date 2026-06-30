package ls4;

/* loaded from: classes8.dex */
public final class z implements com.tencent.midas.api.IAPMidasPayCallBack {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.e0 f321114a;

    public z(ls4.e0 e0Var) {
        this.f321114a = e0Var;
    }

    @Override // com.tencent.midas.api.IAPMidasPayCallBack
    public void MidasPayCallBack(com.tencent.midas.api.APMidasResponse aPMidasResponse) {
        ls4.e0 e0Var = this.f321114a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = e0Var.f321048b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        e0Var.f321048b = null;
        pr4.m mVar = e0Var.f321047a;
        if (aPMidasResponse == null) {
            mVar.f358038c.invoke(new pr4.n(pr4.p.f358041d));
            return;
        }
        com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "MidasPayCallBack: resultCode: " + aPMidasResponse.resultCode + ", resultMsg: " + aPMidasResponse.resultMsg);
        int i17 = aPMidasResponse.resultCode;
        if (i17 == 0) {
            mVar.f358038c.invoke(new pr4.n(pr4.p.f358043f));
        } else if (i17 != 2) {
            mVar.f358038c.invoke(new pr4.n(pr4.p.f358041d));
        } else {
            mVar.f358038c.invoke(new pr4.n(pr4.p.f358042e));
        }
    }

    @Override // com.tencent.midas.api.IAPMidasPayCallBack
    public void MidasPayNeedLogin() {
        com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "Midas pay need login");
        ls4.e0 e0Var = this.f321114a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = e0Var.f321048b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        e0Var.f321048b = null;
        e0Var.f321047a.f358038c.invoke(new pr4.n(pr4.p.f358041d));
    }
}
