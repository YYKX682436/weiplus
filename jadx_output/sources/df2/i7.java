package df2;

/* loaded from: classes3.dex */
public final class i7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230383d;

    public i7(df2.s8 s8Var) {
        this.f230383d = s8Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        df2.s8 s8Var = this.f230383d;
        if (itemId == s8Var.f231313x0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancelTaskManual] taskId:");
            r45.e84 e84Var = s8Var.f231307s;
            sb6.append(e84Var != null ? e84Var.getString(5) : null);
            com.tencent.mars.xlog.Log.i(s8Var.f231299m, sb6.toString());
            if (zl2.r4.f473950a.y1(s8Var.getStore().getLiveRoomData())) {
                com.tencent.mm.plugin.finder.live.util.y.o(s8Var, null, null, new df2.m7(s8Var, null), 3, null);
            }
        }
    }
}
