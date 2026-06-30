package g72;

/* loaded from: classes.dex */
public class e0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI f269230d;

    public e0(com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI settingsFacePrintManagerUI) {
        this.f269230d = settingsFacePrintManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f269230d.finish();
        return true;
    }
}
