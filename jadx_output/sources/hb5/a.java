package hb5;

/* loaded from: classes5.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI f280146d;

    public a(com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI bizChatAtSomeoneUI) {
        this.f280146d = bizChatAtSomeoneUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI bizChatAtSomeoneUI = this.f280146d;
        bizChatAtSomeoneUI.setResult(0);
        bizChatAtSomeoneUI.finish();
        return true;
    }
}
