package h71;

/* loaded from: classes15.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference f279415d;

    public z(com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference safeDeviceListPreference) {
        this.f279415d = safeDeviceListPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SafeDeviceListPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference safeDeviceListPreference = this.f279415d;
        android.content.Context context = safeDeviceListPreference.L;
        java.lang.String string = safeDeviceListPreference.M.field_online ? context.getString(com.tencent.mm.R.string.i7h) : context.getString(com.tencent.mm.R.string.i7g);
        android.content.Context context2 = safeDeviceListPreference.L;
        db5.e1.A(context, string, "", i65.a.r(context2, com.tencent.mm.R.string.i7i), i65.a.r(context2, com.tencent.mm.R.string.f490347sg), new h71.x(safeDeviceListPreference), new h71.y(safeDeviceListPreference)).f(-1).setTextColor(safeDeviceListPreference.f197770d.getResources().getColor(com.tencent.mm.R.color.f478532ac));
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SafeDeviceListPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
