package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ac extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f133767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f133768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(0);
        this.f133767d = ncVar;
        this.f133768e = finderItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ay2.v vVar;
        com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar = this.f133767d;
        if (ncVar.f135303t == null) {
            ncVar.f135303t = new ay2.v(ncVar.getContext(), pm0.v.u(this.f133768e.getFeedObject().getId()));
        }
        ay2.v vVar2 = ncVar.f135303t;
        if (((vVar2 == null || vVar2.isShowing()) ? false : true) && (vVar = ncVar.f135303t) != null) {
            android.app.Activity activity = vVar.f15274d;
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                com.tencent.mm.plugin.finder.report.d2.i(com.tencent.mm.plugin.finder.report.d2.f124994a, vVar.f15274d, "eye_care_reminder", "view_exp", false, kz5.b1.e(new jz5.l("feed_id", vVar.f15275e)), 8, null);
                vVar.f15280m = ay2.r.f15266e;
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                vVar.f15279i.setText(activity.getString(com.tencent.mm.R.string.o2n, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127626bg).getValue()).r()).intValue())));
                vVar.show();
            }
        }
        return jz5.f0.f302826a;
    }
}
