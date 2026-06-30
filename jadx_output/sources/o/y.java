package o;

/* loaded from: classes15.dex */
public class y extends o.f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o.z f341828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(o.z zVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super(onMenuItemClickListener);
        this.f341828e = zVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        return ((android.view.MenuItem.OnMenuItemClickListener) this.f341714d).onMenuItemClick(this.f341828e.c(menuItem));
    }
}
