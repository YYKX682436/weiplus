package zs4;

/* loaded from: classes8.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475279e;

    public c(boolean z17, android.app.Activity activity) {
        this.f475278d = z17;
        this.f475279e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
        dialogInterface.dismiss();
        if (this.f475278d) {
            this.f475279e.finish();
        }
    }
}
