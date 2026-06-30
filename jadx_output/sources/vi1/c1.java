package vi1;

/* loaded from: classes7.dex */
public final class c1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI f437287d;

    public c1(com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI phoneNumberAddUI) {
        this.f437287d = phoneNumberAddUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f437287d.finish();
        return true;
    }
}
