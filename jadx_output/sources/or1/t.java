package or1;

/* loaded from: classes.dex */
public class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI f347574d;

    public t(com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI) {
        this.f347574d = brandServiceIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f347574d.finish();
        return true;
    }
}
