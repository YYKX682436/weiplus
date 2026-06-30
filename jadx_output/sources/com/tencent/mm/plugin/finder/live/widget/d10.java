package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d10 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f118039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(r45.fr1 fr1Var, com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        super(2);
        this.f118039d = fr1Var;
        this.f118040e = m10Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118040e;
        if (booleanValue) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            r45.fr1 fr1Var = this.f118039d;
            ml2.r0.Uj(r0Var, 22, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
            m10Var.C = -1;
            m10Var.p(fr1Var);
        } else {
            android.content.Context context = m10Var.f118999a.getContext();
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = m10Var.f118999a.getContext().getString(com.tencent.mm.R.string.dgq);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.g(context, str);
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
        if (y1Var != null) {
            y1Var.q();
        }
        return jz5.f0.f302826a;
    }
}
