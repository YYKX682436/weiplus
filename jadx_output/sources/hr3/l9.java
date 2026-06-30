package hr3;

/* loaded from: classes11.dex */
public class l9 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t9 f283754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f283755e;

    public l9(com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference, hr3.t9 t9Var, java.lang.CharSequence charSequence) {
        this.f283754d = t9Var;
        this.f283755e = charSequence;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f283754d.setText(this.f283755e);
    }
}
