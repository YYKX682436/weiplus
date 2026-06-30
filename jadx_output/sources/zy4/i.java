package zy4;

/* loaded from: classes.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabMainUI f477682d;

    public i(com.tencent.mm.plugin.welab.ui.WelabMainUI welabMainUI) {
        this.f477682d = welabMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.welab.ui.WelabMainUI welabMainUI = this.f477682d;
        welabMainUI.hideVKB();
        welabMainUI.finish();
        return true;
    }
}
