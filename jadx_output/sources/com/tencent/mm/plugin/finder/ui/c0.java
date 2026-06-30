package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f128968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f128969e;

    public c0(com.tencent.mm.ui.MMActivity mMActivity, yz5.l lVar) {
        this.f128968d = mMActivity;
        this.f128969e = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 3) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.r.f460525a.d(5, new java.util.LinkedList(), new java.util.LinkedList(), new com.tencent.mm.plugin.finder.ui.b0(this.f128968d, this.f128969e));
        }
    }
}
