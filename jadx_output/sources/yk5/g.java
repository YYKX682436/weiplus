package yk5;

/* loaded from: classes11.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.voicesearch.SearchConversationResultUI f462882d;

    public g(com.tencent.mm.ui.voicesearch.SearchConversationResultUI searchConversationResultUI) {
        this.f462882d = searchConversationResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f462882d.finish();
        return true;
    }
}
