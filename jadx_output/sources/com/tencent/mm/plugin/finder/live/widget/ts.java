package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ts implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f119907e;

    public ts(com.tencent.mm.plugin.finder.live.widget.et etVar, r45.dz1 dz1Var) {
        this.f119906d = etVar;
        this.f119907e = dz1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1000) {
            com.tencent.mm.plugin.finder.live.widget.et etVar = this.f119906d;
            com.tencent.mm.plugin.finder.live.widget.et.h0(etVar).a();
            r45.dz1 dz1Var = this.f119907e;
            if (dz1Var.getInteger(7) == 1) {
                android.content.Context context = etVar.f118183e;
                db5.t7.g(context, context.getString(com.tencent.mm.R.string.lij));
            } else {
                kotlinx.coroutines.y0 y0Var = etVar.E;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.widget.ss(etVar, dz1Var, null), 2, null);
                }
            }
        }
    }
}
