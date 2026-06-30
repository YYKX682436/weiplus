package eg4;

/* loaded from: classes4.dex */
public class a2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI f252671d;

    public a2(com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI fMessageConversationUI) {
        this.f252671d = fMessageConversationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f252671d.finish();
        return true;
    }
}
