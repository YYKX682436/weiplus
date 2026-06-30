package hr3;

/* loaded from: classes4.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI f284222d;

    public z(com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI bizBindWxaInfoUI) {
        this.f284222d = bizBindWxaInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f284222d.finish();
        return false;
    }
}
