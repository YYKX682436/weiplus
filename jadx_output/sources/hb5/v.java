package hb5;

/* loaded from: classes11.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatFavUI f280262d;

    public v(com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI) {
        this.f280262d = bizChatFavUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f280262d.finish();
        return true;
    }
}
