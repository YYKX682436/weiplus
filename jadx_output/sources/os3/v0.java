package os3;

/* loaded from: classes8.dex */
public class v0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI f348221d;

    public v0(com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI) {
        this.f348221d = compressPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f348221d.onKeyDown(4, null);
        return true;
    }
}
