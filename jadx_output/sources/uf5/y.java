package uf5;

/* loaded from: classes8.dex */
public class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI f427328d;

    public y(com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI commonSelectChatRoomUI) {
        this.f427328d = commonSelectChatRoomUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f427328d.finish();
        return false;
    }
}
