package zw1;

/* loaded from: classes15.dex */
public class z1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476865d;

    public z1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476865d = collectMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f476865d.finish();
        return true;
    }
}
