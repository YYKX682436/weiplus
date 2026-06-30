package h71;

/* loaded from: classes15.dex */
public class w implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e71.e f279412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h71.x f279413e;

    public w(h71.x xVar, e71.e eVar) {
        this.f279413e = xVar;
        this.f279412d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f279412d);
        com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference safeDeviceListPreference = this.f279413e.f279414d;
        safeDeviceListPreference.getClass();
        gm0.j1.d().q(362, safeDeviceListPreference);
    }
}
