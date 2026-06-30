package qw3;

/* loaded from: classes.dex */
public class d1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tenpay.android.wechat.TenpaySecureEditText f367150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qw3.e1 f367151e;

    public d1(qw3.e1 e1Var, com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText) {
        this.f367151e = e1Var;
        this.f367150d = tenpaySecureEditText;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qw3.e1 e1Var = this.f367151e;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f367150d;
        return (tenpaySecureEditText == null || tenpaySecureEditText.getText().length() == 0) ? e1Var.getString(com.tencent.mm.R.string.aee) : java.lang.String.format(e1Var.getString(com.tencent.mm.R.string.aec), tenpaySecureEditText.getText());
    }
}
