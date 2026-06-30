package zs4;

/* loaded from: classes.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f475309f;

    public n(java.lang.String str, android.app.Activity activity, boolean z17) {
        this.f475307d = str;
        this.f475308e = activity;
        this.f475309f = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f475307d);
        intent.putExtra("showShare", false);
        android.app.Activity activity = this.f475308e;
        com.tencent.mm.wallet_core.ui.r1.T(activity, intent);
        dialogInterface.dismiss();
        if (this.f475309f) {
            activity.finish();
        }
    }
}
