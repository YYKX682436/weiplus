package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class x3 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124341d;

    public x3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        this.f124341d = f4Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("FinderProfileEduUIC", "profileSettingCallback, " + ret.getInteger(1));
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f124341d;
        if (integer != 0) {
            android.widget.CheckBox W6 = f4Var.W6();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.app.Activity context = f4Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(context), false, 2, null);
            W6.setChecked(((j37 != null ? j37.field_extFlag : 0) & 262144) != 0);
            db5.t7.makeText(f4Var.getActivity(), f4Var.getString(com.tencent.mm.R.string.f9b), 0).show();
        }
        az2.f fVar = f4Var.f123687h;
        if (fVar != null) {
            fVar.b();
        }
    }
}
