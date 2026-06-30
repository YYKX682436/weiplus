package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class b0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f116916a;

    public b0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        this.f116916a = a1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.z53 z53Var;
        java.lang.String string;
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f116916a;
        android.app.Activity context = a1Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean z17 = true;
        kotlinx.coroutines.z0.e(((com.tencent.mm.plugin.finder.live.viewmodel.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class)).P6().getSecurityDataScope(), null, 1, null);
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            a1Var.A = ((r45.f01) fVar.f70618d).getBoolean(4);
            com.tencent.mars.xlog.Log.i(a1Var.f116871d, "not_pass_openid_to_game:" + ((r45.f01) fVar.f70618d).getBoolean(4));
            androidx.appcompat.app.AppCompatActivity activity = a1Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            java.lang.String str2 = "";
            if (a1Var.f116885u != 1) {
                r45.f01 f01Var = (r45.f01) fVar.f70618d;
                if (!(f01Var != null && f01Var.getInteger(2) == 1)) {
                    r45.f01 f01Var2 = (r45.f01) fVar.f70618d;
                    if (f01Var2 == null || (str = f01Var2.getString(1)) == null) {
                        str = "";
                    }
                    pm0.v.K(null, new com.tencent.mm.plugin.finder.live.viewmodel.a0(a1Var, str));
                    km2.g gVar = km2.g.f309100a;
                    z53Var = a1Var.f116887w;
                    if (z53Var != null && (string = z53Var.getString(0)) != null) {
                        str2 = string;
                    }
                    gVar.a(str2);
                }
            }
            java.lang.String string2 = a1Var.getResources().getString(com.tencent.mm.R.string.l4t);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            a1Var.X6(true, com.tencent.mm.R.string.l4u, string2);
            km2.g gVar2 = km2.g.f309100a;
            z53Var = a1Var.f116887w;
            if (z53Var != null) {
                str2 = string;
            }
            gVar2.a(str2);
        } else {
            a1Var.U6().setEnabled(true);
            int i17 = fVar.f70616b;
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            r45.f01 f01Var3 = (r45.f01) resp;
            if (i17 == -200196) {
                r45.m01 m01Var = (r45.m01) f01Var3.getCustom(3);
                if (m01Var != null) {
                    a1Var.V6(m01Var);
                }
            } else if (i17 == -200093) {
                java.lang.String string3 = a1Var.W6() ? a1Var.getResources().getString(com.tencent.mm.R.string.l4w, java.lang.Integer.valueOf(com.tencent.mm.R.string.l4y)) : a1Var.getResources().getString(com.tencent.mm.R.string.l4w, java.lang.Integer.valueOf(com.tencent.mm.R.string.l4v));
                kotlin.jvm.internal.o.d(string3);
                a1Var.X6(false, com.tencent.mm.R.string.gcu, string3);
            } else if (i17 != -200057) {
                z17 = false;
            } else {
                db5.e1.A(a1Var.getContext(), a1Var.getContext().getString(com.tencent.mm.R.string.l4s), "", a1Var.getContext().getString(com.tencent.mm.R.string.f490507x1), "", com.tencent.mm.plugin.finder.live.viewmodel.e0.f117053d, com.tencent.mm.plugin.finder.live.viewmodel.f0.f117085d);
            }
            if (!z17) {
                db5.t7.makeText(a1Var.getContext(), com.tencent.mm.R.string.dgq, 0).show();
            }
        }
        return jz5.f0.f302826a;
    }
}
