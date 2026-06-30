package i93;

/* loaded from: classes11.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI f289754d;

    public l(com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI) {
        this.f289754d = labelSearchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f289754d.finish();
        return false;
    }
}
