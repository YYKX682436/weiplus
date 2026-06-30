package os3;

/* loaded from: classes8.dex */
public class v4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348238d;

    public v4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348238d = readMailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f348238d.finish();
        return true;
    }
}
