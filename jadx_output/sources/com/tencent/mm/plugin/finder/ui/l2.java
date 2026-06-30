package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class l2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.m2 f129452d;

    public l2(com.tencent.mm.plugin.finder.ui.m2 m2Var) {
        this.f129452d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f129452d;
        az2.f fVar = m2Var.f129498e;
        if (fVar != null) {
            fVar.b();
        }
        if (ret.getInteger(1) != 0) {
            android.app.Activity activity = m2Var.f129494a;
            db5.t7.makeText(activity, activity.getString(com.tencent.mm.R.string.f9b), 0).show();
        } else {
            g92.b bVar = g92.b.f269769e;
            m92.b j37 = g92.a.j3(bVar, m2Var.f129497d, false, 2, null);
            int i17 = j37 != null ? j37.field_extFlag : 0;
            int i18 = req.getInteger(15) == 1 ? i17 | 1024 : i17 & (-1025);
            m92.c cVar = new m92.c(m2Var.f129497d);
            cVar.field_extFlag = i18;
            bVar.C(cVar, m92.j.f324997o);
        }
        az2.f fVar2 = m2Var.f129498e;
        if (fVar2 != null) {
            fVar2.b();
        }
    }
}
