package ts3;

/* loaded from: classes9.dex */
public class w implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421702d;

    public w(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421702d = readerAppUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f421702d.finish();
        return true;
    }
}
