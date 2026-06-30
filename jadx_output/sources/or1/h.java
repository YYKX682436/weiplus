package or1;

/* loaded from: classes8.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI f347500d;

    public h(com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI bizSearchDetailPageUI) {
        this.f347500d = bizSearchDetailPageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f347500d.finish();
        return true;
    }
}
