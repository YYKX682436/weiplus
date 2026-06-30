package qp5;

/* loaded from: classes9.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f365836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365838f;

    public d0(android.widget.EditText editText, java.lang.String str, java.lang.String str2) {
        this.f365836d = editText;
        this.f365837e = str;
        this.f365838f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView.o(this.f365836d, this.f365837e, this.f365838f);
    }
}
