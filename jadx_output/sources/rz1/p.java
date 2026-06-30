package rz1;

/* loaded from: classes.dex */
public class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.ScrollSampleUI f401794d;

    public p(com.tencent.mm.plugin.datareport.sample.ScrollSampleUI scrollSampleUI) {
        this.f401794d = scrollSampleUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f401794d.finish();
        return true;
    }
}
