package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class g4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f124559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124561c;

    public g4(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.m3 m3Var) {
        this.f124559a = u3Var;
        this.f124560b = s4Var;
        this.f124561c = m3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.j32 j32Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f124559a.dismiss();
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124560b;
            android.content.Context context = s4Var.f124748b;
            db5.t7.h(context, ((com.tencent.mm.ui.MMActivity) context).getResources().getString(com.tencent.mm.R.string.do6));
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) s4Var.f124754h.get(s4Var.f124747a);
            com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = this.f124561c;
            if (l2Var != null && (j32Var = l2Var.f123923l) != null) {
                java.util.LinkedList list = j32Var.getList(0);
                if (list != null) {
                    kz5.h0.B(list, new com.tencent.mm.plugin.finder.profile.widget.f4(m3Var));
                }
                j32Var.set(2, java.lang.Integer.valueOf(j32Var.getList(0).size()));
            }
            ((java.util.ArrayList) s4Var.f124760n).remove(m3Var);
            s4Var.e();
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string = m3Var.f124624a.getString(4);
            if (string == null) {
                string = "";
            }
            ((b92.d1) zbVar).pj(string);
        }
        return jz5.f0.f302826a;
    }
}
