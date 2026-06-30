package qw3;

/* loaded from: classes5.dex */
public class i0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f367167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tenpay.android.wechat.TenpaySecureEditText f367168e;

    public i0(qw3.k0 k0Var, android.widget.TextView textView, com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText) {
        this.f367167d = textView;
        this.f367168e = tenpaySecureEditText;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.widget.TextView textView = this.f367167d;
        if (textView != null) {
            sb6.append(((java.lang.Object) textView.getText()) + ",");
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f367168e;
        if (tenpaySecureEditText != null) {
            sb6.append(((java.lang.Object) tenpaySecureEditText.getText()) + ",");
        }
        return sb6.toString();
    }
}
