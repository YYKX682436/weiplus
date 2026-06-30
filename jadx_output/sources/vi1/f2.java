package vi1;

/* loaded from: classes7.dex */
public final class f2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI f437319d;

    public f2(com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI phoneNumberManagerUI) {
        this.f437319d = phoneNumberManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f437319d.finish();
        return true;
    }
}
