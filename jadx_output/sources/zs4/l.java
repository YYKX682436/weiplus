package zs4;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f475300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475303g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f475304h;

    public l(android.os.Bundle bundle, int i17, int i18, android.app.Activity activity, int i19) {
        this.f475300d = bundle;
        this.f475301e = i17;
        this.f475302f = i18;
        this.f475303g = activity;
        this.f475304h = i19;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
        android.os.Bundle bundle = this.f475300d;
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putInt("real_name_verify_mode", this.f475301e);
        int i18 = this.f475302f;
        bundle.putInt("entry_scene", i18);
        com.tencent.mm.wallet_core.a.j(this.f475303g, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, null);
        int i19 = this.f475304h;
        com.tencent.mm.wallet_core.ui.r1.r0(i19 == 1 ? 9 : i19 == 2 ? 12 : 0, 1, com.tencent.mm.sdk.platformtools.t8.i1(), i18);
        dialogInterface.dismiss();
    }
}
