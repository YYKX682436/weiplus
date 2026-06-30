package hr3;

/* loaded from: classes11.dex */
public class ei implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283533d;

    public ei(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f283533d = sayHiWithSnsPermissionUI3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283533d;
        if (sayHiWithSnsPermissionUI3.C) {
            sayHiWithSnsPermissionUI3.D[1] = 1;
        }
        sayHiWithSnsPermissionUI3.finish();
        ((ku5.t0) ku5.t0.f312615d).q(new hr3.ph(sayHiWithSnsPermissionUI3, false));
        sayHiWithSnsPermissionUI3.Z6(2L);
        return true;
    }
}
