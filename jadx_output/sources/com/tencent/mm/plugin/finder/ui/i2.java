package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class i2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.m2 f129346d;

    public i2(com.tencent.mm.plugin.finder.ui.m2 m2Var) {
        this.f129346d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingPrivacyUI", "modInteractCallback, ret " + ret.getInteger(1));
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f129346d;
        if (integer != 0) {
            android.app.Activity activity = m2Var.f129494a;
            db5.t7.makeText(activity, activity.getString(com.tencent.mm.R.string.f9b), 0).show();
        } else {
            g92.b bVar = g92.b.f269769e;
            m92.c cVar = new m92.c(m2Var.f129497d);
            if (req.getInteger(27) != 0) {
                cVar.u0().set(48, java.lang.Integer.valueOf(req.getInteger(27)));
            } else if (req.getInteger(28) != 0) {
                cVar.u0().set(49, java.lang.Integer.valueOf(req.getInteger(28)));
            } else {
                cVar.u0().set(40, java.lang.Integer.valueOf(req.getInteger(23)));
            }
            bVar.C(cVar, m92.j.f324997o);
            m2Var.b();
            ((com.tencent.mm.ui.base.preference.h0) m2Var.f129495b).notifyDataSetChanged();
        }
        az2.f fVar = m2Var.f129498e;
        if (fVar != null) {
            fVar.b();
        }
    }
}
