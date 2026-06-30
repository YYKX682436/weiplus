package hb5;

/* loaded from: classes11.dex */
public class y0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280268d;

    public y0(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI) {
        this.f280268d = bizChatroomInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f280268d.finish();
        return true;
    }
}
