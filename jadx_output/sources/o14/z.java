package o14;

/* loaded from: classes8.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI f342326d;

    public z(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI) {
        this.f342326d = fixToolsUplogUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f342326d.finish();
        return true;
    }
}
