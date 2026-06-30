package zk5;

/* loaded from: classes14.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.websearch.WebSearchVoiceUI f473548d;

    public b(com.tencent.mm.ui.websearch.WebSearchVoiceUI webSearchVoiceUI) {
        this.f473548d = webSearchVoiceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f473548d.finish();
        return true;
    }
}
