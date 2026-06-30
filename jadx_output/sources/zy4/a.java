package zy4;

/* loaded from: classes15.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabAppInfoUI f477673d;

    public a(com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI) {
        this.f477673d = welabAppInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.welab.ui.WelabAppInfoUI welabAppInfoUI = this.f477673d;
        welabAppInfoUI.hideVKB();
        welabAppInfoUI.finish();
        return true;
    }
}
