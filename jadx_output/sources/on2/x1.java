package on2;

/* loaded from: classes3.dex */
public final class x1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f347066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f347067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f347069g;

    public x1(on2.a2 a2Var, r45.dz1 dz1Var, android.content.Context context, int i17) {
        this.f347066d = a2Var;
        this.f347067e = dz1Var;
        this.f347068f = context;
        this.f347069g = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        rl5.r popupMenu;
        if (menuItem.getItemId() == 1000) {
            on2.a2 a2Var = this.f347066d;
            popupMenu = a2Var.getPopupMenu();
            popupMenu.a();
            if (this.f347067e.getInteger(7) != 1) {
                kotlinx.coroutines.l.d(a2Var.getScope(), kotlinx.coroutines.q1.f310570c, null, new on2.w1(this.f347066d, this.f347068f, this.f347067e, this.f347069g, null), 2, null);
            } else {
                android.content.Context context = this.f347068f;
                db5.t7.g(context, context.getString(com.tencent.mm.R.string.lij));
            }
        }
    }
}
