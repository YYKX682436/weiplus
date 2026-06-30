package hr3;

/* loaded from: classes11.dex */
public class wg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f284161d;

    public wg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f284161d = sayHiWithSnsPermissionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f284161d;
        if (sayHiWithSnsPermissionUI.f153833x) {
            sayHiWithSnsPermissionUI.f153836y[1] = 1;
        }
        sayHiWithSnsPermissionUI.finish();
        sayHiWithSnsPermissionUI.h7(false);
        sayHiWithSnsPermissionUI.a7(2L);
        return true;
    }
}
