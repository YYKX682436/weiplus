package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f119917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f119918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f119919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.q63 f119920g;

    public tz(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.fr1 fr1Var, r45.xq1 xq1Var, r45.q63 q63Var) {
        this.f119917d = m10Var;
        this.f119918e = fr1Var;
        this.f119919f = xq1Var;
        this.f119920g = q63Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.z87 z87Var;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f119917d;
        m10Var.f118998J = true;
        r45.fr1 fr1Var = this.f119918e;
        r45.h41 h41Var = (r45.h41) fr1Var.getCustom(21);
        java.lang.String str = null;
        java.lang.String string = h41Var != null ? h41Var.getString(1) : null;
        if (string == null || string.length() == 0) {
            r45.xq1 xq1Var = this.f119919f;
            if (xq1Var != null) {
                str = xq1Var.getString(3);
            }
        } else {
            r45.h41 h41Var2 = (r45.h41) fr1Var.getCustom(21);
            if (h41Var2 != null) {
                str = h41Var2.getString(1);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.pz pzVar = com.tencent.mm.plugin.finder.live.widget.m10.R;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = m10Var.f119001c;
        android.content.Context context = m10Var.f118999a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.xq1 xq1Var2 = this.f119919f;
        r45.fr1 fr1Var2 = this.f119918e;
        java.lang.String string2 = fr1Var2.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
        boolean a17 = pzVar.a(fr1Var);
        java.lang.String str2 = (!pzVar.a(fr1Var) ? str == null : (z87Var = (r45.z87) fr1Var.getCustom(18)) == null || (str = z87Var.getString(4)) == null) ? str : "";
        android.content.Context context2 = m10Var.f118999a.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        r45.yq1 yq1Var = ((mm2.c1) m10Var.f119001c.P0(mm2.c1.class)).f328811g6;
        pzVar.b(lVar, context, xq1Var2, fr1Var2, string2, b3Var.g(a17, 7, str2, context2, yq1Var != null ? yq1Var.getInteger(5) : -1), new com.tencent.mm.plugin.finder.live.widget.sz(this.f119920g, m10Var), ((mm2.c1) m10Var.f119001c.P0(mm2.c1.class)).N2);
    }
}
