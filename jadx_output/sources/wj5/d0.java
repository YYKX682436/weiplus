package wj5;

/* loaded from: classes5.dex */
public final class d0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj5.n f446791d;

    public d0(xj5.n nVar) {
        this.f446791d = nVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            ak5.g0 g0Var = (ak5.g0) i95.n0.c(ak5.g0.class);
            xj5.n nVar = this.f446791d;
            java.lang.String t07 = nVar.f454915u.t0();
            kotlin.jvm.internal.o.f(t07, "getChatRoomName(...)");
            g0Var.wi(t07, nVar.f454915u.u0());
            nVar.f454897e = 3;
        }
    }
}
