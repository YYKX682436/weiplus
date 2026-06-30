package fl1;

/* loaded from: classes7.dex */
public class e implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.f f263749d;

    public e(fl1.k kVar, fl1.f fVar) {
        this.f263749d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
        this.f263749d.a(3, null);
    }
}
