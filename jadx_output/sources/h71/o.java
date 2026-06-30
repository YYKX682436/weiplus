package h71;

/* loaded from: classes15.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e71.f f279405d;

    public o(com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI, e71.f fVar) {
        this.f279405d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f279405d);
    }
}
