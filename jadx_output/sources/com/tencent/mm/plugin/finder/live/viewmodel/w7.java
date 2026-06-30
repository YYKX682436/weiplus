package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class w7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117517d;

    public w7(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        this.f117517d = b8Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117517d;
        if (itemId == 1) {
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).mj(2);
            com.tencent.mm.plugin.finder.live.viewmodel.b8.g7(b8Var);
        } else {
            if (itemId != 2) {
                return;
            }
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).mj(3);
            com.tencent.mm.plugin.finder.live.viewmodel.b8.f7(b8Var, false, false);
        }
    }
}
