package zs4;

/* loaded from: classes8.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475306e;

    public m(boolean z17, android.app.Activity activity) {
        this.f475305d = z17;
        this.f475306e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
        dialogInterface.dismiss();
        if (this.f475305d) {
            this.f475306e.finish();
        }
    }
}
