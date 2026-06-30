package h71;

/* loaded from: classes15.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference f279414d;

    public x(com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference safeDeviceListPreference) {
        this.f279414d = safeDeviceListPreference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference safeDeviceListPreference = this.f279414d;
        safeDeviceListPreference.getClass();
        gm0.j1.d().a(362, safeDeviceListPreference);
        e71.e eVar = new e71.e(safeDeviceListPreference.M.field_uid);
        gm0.j1.d().g(eVar);
        android.content.Context context = safeDeviceListPreference.L;
        safeDeviceListPreference.P = db5.e1.Q(context, "", i65.a.r(context, com.tencent.mm.R.string.f490605zr), true, true, new h71.w(this, eVar));
    }
}
