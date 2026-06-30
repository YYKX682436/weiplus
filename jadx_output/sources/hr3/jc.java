package hr3;

/* loaded from: classes11.dex */
public class jc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ProfileSettingUI f283698d;

    public jc(com.tencent.mm.plugin.profile.ui.ProfileSettingUI profileSettingUI) {
        this.f283698d = profileSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f283698d.finish();
        return true;
    }
}
