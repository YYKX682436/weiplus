package zo1;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        super(0);
        this.f474780d = checkPackageContentUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474780d;
        java.lang.String[] stringArray = checkPackageContentUI.getResources().getStringArray(com.tencent.mm.R.array.f478018az);
        kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(checkPackageContentUI, com.tencent.mm.R.layout.f489536dx3, stringArray);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return arrayAdapter;
    }
}
