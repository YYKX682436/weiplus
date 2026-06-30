package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class j2 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.m2 f129377d;

    public j2(com.tencent.mm.plugin.finder.ui.m2 m2Var) {
        this.f129377d = m2Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.FinderSettingPrivacyUI", "modNotRecommendInfo, ret " + ret.getInteger(1));
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.ui.m2 m2Var = this.f129377d;
        if (integer != 0) {
            android.app.Activity activity = m2Var.f129494a;
            db5.t7.makeText(activity, activity.getString(com.tencent.mm.R.string.f9b), 0).show();
        } else {
            if (req.getInteger(15) == 1 || req.getInteger(15) == 4) {
                g92.b bVar = g92.b.f269769e;
                m92.b j37 = g92.a.j3(bVar, m2Var.f129497d, false, 2, null);
                int i17 = j37 != null ? j37.field_extFlag : 0;
                m92.c cVar = new m92.c(m2Var.f129497d);
                cVar.field_extFlag = i17 | 1024;
                cVar.u0().set(38, (r45.pk2) req.getCustom(25));
                bVar.C(cVar, m92.j.f324997o);
            } else {
                g92.b bVar2 = g92.b.f269769e;
                m92.b j38 = g92.a.j3(bVar2, m2Var.f129497d, false, 2, null);
                int i18 = j38 != null ? j38.field_extFlag : 0;
                m92.c cVar2 = new m92.c(m2Var.f129497d);
                cVar2.field_extFlag = i18 & (-1025);
                cVar2.u0().set(38, (r45.pk2) req.getCustom(25));
                bVar2.C(cVar2, m92.j.f324997o);
            }
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) m2Var.f129495b).h("settings_recommend_info");
            if (h17 != null) {
                r45.pk2 pk2Var = (r45.pk2) req.getCustom(25);
                h17.H(m2Var.a(java.lang.Integer.valueOf(pk2Var != null ? pk2Var.getInteger(0) : 0)));
            }
            ((com.tencent.mm.ui.base.preference.h0) m2Var.f129495b).notifyDataSetChanged();
        }
        az2.f fVar = m2Var.f129498e;
        if (fVar != null) {
            fVar.b();
        }
    }
}
