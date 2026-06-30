package tt1;

/* loaded from: classes3.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.base.CardBaseUI f421809d;

    public a(com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI) {
        this.f421809d = cardBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f421809d.finish();
        return true;
    }
}
