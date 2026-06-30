package hr3;

/* loaded from: classes11.dex */
public class u5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI f284044d;

    public u5(com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI contactSocialInfoUI) {
        this.f284044d = contactSocialInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f284044d.finish();
        return true;
    }
}
