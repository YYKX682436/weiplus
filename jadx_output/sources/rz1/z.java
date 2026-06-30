package rz1;

/* loaded from: classes.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.ViewLayoutSampleUI f401796d;

    public z(com.tencent.mm.plugin.datareport.sample.ViewLayoutSampleUI viewLayoutSampleUI) {
        this.f401796d = viewLayoutSampleUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f401796d.finish();
        return true;
    }
}
