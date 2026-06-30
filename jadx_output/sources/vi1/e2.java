package vi1;

/* loaded from: classes7.dex */
public final class e2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI f437298d;

    public e2(com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI phoneNumberManagerUI) {
        this.f437298d = phoneNumberManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI.D;
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI phoneNumberManagerUI = this.f437298d;
        phoneNumberManagerUI.U6(true);
        phoneNumberManagerUI.V6();
        return true;
    }
}
