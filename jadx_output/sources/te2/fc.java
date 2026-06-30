package te2;

/* loaded from: classes2.dex */
public final class fc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f418024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f418025e;

    public fc(r45.h32 h32Var, yz5.a aVar) {
        this.f418024d = h32Var;
        this.f418025e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 4) {
            this.f418024d.set(1, 1);
            this.f418025e.invoke();
        }
    }
}
