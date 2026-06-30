package p61;

/* loaded from: classes5.dex */
public class o1 implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactUI f352332a;

    public o1(com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI) {
        this.f352332a = bindMContactUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI = this.f352332a;
        sb6.append((java.lang.Object) bindMContactUI.f72985e.getText());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString().trim())) {
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            bindMContactUI.f72985e.setText("");
            return true;
        }
        bindMContactUI.f72985e.setText((java.lang.CharSequence) null);
        android.widget.EditText editText = bindMContactUI.f72985e;
        throw null;
    }

    public java.lang.String toString() {
        return super.toString() + "|initView";
    }
}
