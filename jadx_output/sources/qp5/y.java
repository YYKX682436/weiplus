package qp5;

/* loaded from: classes9.dex */
public abstract class y {
    public static void a(com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText, int i17, boolean z17) {
        if (tenpaySecureEditText == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FormatViewUtil", "hy: param error: no edit text view");
            return;
        }
        if (i17 == 1) {
            tenpaySecureEditText.setIsPasswordFormat(true, z17);
            return;
        }
        if (i17 == 2) {
            tenpaySecureEditText.setIsSecurityAnswerFormat(true);
            return;
        }
        if (i17 == 3) {
            tenpaySecureEditText.setIsCvvPaymentFormat(true);
            return;
        }
        if (i17 == 4) {
            tenpaySecureEditText.setIsCvv4PaymentFormat(true);
            return;
        }
        if (i17 == 5) {
            tenpaySecureEditText.setIsValidThru(true);
            return;
        }
        if (i17 == 6) {
            tenpaySecureEditText.setIsBankcardFormat(true);
            return;
        }
        if (i17 == 7) {
            tenpaySecureEditText.setIsMoneyAmountFormat(true);
        } else if (i17 == 8) {
            tenpaySecureEditText.setIsIdCardTailFormat(true);
        } else {
            tenpaySecureEditText.setIsCvv4PaymentFormat(false);
        }
    }

    public static void b(com.tencent.mm.ui.MMActivity mMActivity, int i17, int i18) {
        if (i17 == -1) {
            return;
        }
        mMActivity.addDialog(db5.e1.w(mMActivity, mMActivity.getResources().getString(i18), mMActivity.getResources().getString(com.tencent.mm.R.string.kmf), ((android.view.LayoutInflater) mMActivity.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null), new qp5.w()));
    }
}
