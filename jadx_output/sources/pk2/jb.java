package pk2;

/* loaded from: classes3.dex */
public final class jb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.kb f355894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355895e;

    public jb(pk2.kb kbVar, pk2.o9 o9Var) {
        this.f355894d = kbVar;
        this.f355895e = o9Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        pk2.o9 o9Var = this.f355895e;
        pk2.kb kbVar = this.f355894d;
        if (itemId == 1) {
            kbVar.E(o9Var);
        } else {
            if (itemId != 2) {
                return;
            }
            kbVar.D(o9Var);
        }
    }
}
