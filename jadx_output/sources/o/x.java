package o;

/* loaded from: classes15.dex */
public class x extends o.f implements android.view.MenuItem.OnActionExpandListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o.z f341827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o.z zVar, android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        super(onActionExpandListener);
        this.f341827e = zVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        return ((android.view.MenuItem.OnActionExpandListener) this.f341714d).onMenuItemActionCollapse(this.f341827e.c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        return ((android.view.MenuItem.OnActionExpandListener) this.f341714d).onMenuItemActionExpand(this.f341827e.c(menuItem));
    }
}
