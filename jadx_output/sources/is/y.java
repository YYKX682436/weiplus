package is;

/* loaded from: classes11.dex */
public class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f294380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ js.v0 f294382f;

    public y(is.i0 i0Var, android.app.Activity activity, java.lang.String str, js.v0 v0Var) {
        this.f294380d = activity;
        this.f294381e = str;
        this.f294382f = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.Activity activity = this.f294380d;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileVerifyUI.class);
        intent.putExtra("bindmcontact_mobile", this.f294381e);
        intent.putExtra("mobile_verify_purpose", 5);
        j45.l.x((com.tencent.mm.ui.MMFragmentActivity) activity, ".plugin.account.ui.MobileVerifyUI", intent, 1, new is.x(this));
    }
}
