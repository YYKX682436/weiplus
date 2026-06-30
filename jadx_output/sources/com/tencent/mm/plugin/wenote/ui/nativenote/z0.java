package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class z0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.l1 f188316d;

    public z0(com.tencent.mm.plugin.wenote.ui.nativenote.l1 l1Var) {
        this.f188316d = l1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.wenote.ui.nativenote.l1 l1Var = this.f188316d;
            com.tencent.mm.ui.ee.f(l1Var.f188234d.getTaskId(), null);
            com.tencent.mm.ui.fj.f(l1Var.f188234d, true);
        }
    }
}
