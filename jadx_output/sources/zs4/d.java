package zs4;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f475280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f475283g;

    public d(android.os.Bundle bundle, int i17, android.app.Activity activity, boolean z17) {
        this.f475280d = bundle;
        this.f475281e = i17;
        this.f475282f = activity;
        this.f475283g = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
        android.os.Bundle bundle = this.f475280d;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putInt("real_name_verify_mode", 0);
        int i18 = this.f475281e;
        bundle.putInt("entry_scene", i18);
        bundle.putBoolean("key_from_set_pwd", true);
        android.app.Activity activity = this.f475282f;
        com.tencent.mm.wallet_core.a.j(activity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
        com.tencent.mm.wallet_core.ui.r1.r0(19, 1, com.tencent.mm.sdk.platformtools.t8.i1(), i18);
        dialogInterface.dismiss();
        if (this.f475283g) {
            activity.finish();
        }
    }
}
