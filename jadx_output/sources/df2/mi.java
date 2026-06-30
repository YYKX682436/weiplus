package df2;

/* loaded from: classes3.dex */
public final class mi implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.wi f230781a;

    public mi(df2.wi wiVar) {
        this.f230781a = wiVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.n73 c76;
        r45.z53 z53Var;
        java.lang.String string;
        java.lang.String str;
        yg2.c securityDataScope;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        df2.wi wiVar = this.f230781a;
        com.tencent.mm.plugin.finder.live.view.k0 b76 = wiVar.b7();
        if (b76 != null && (securityDataScope = b76.getSecurityDataScope()) != null) {
            kotlinx.coroutines.z0.c(securityDataScope, null);
        }
        boolean z17 = true;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            wiVar.f231691n = ((r45.f01) fVar.f70618d).getBoolean(4);
            com.tencent.mars.xlog.Log.i(wiVar.f231690m, "not_pass_openid_to_game:" + ((r45.f01) fVar.f70618d).getBoolean(4));
            java.lang.String str2 = "";
            if (wiVar.d7().f329397t != 1) {
                r45.f01 f01Var = (r45.f01) fVar.f70618d;
                if (!(f01Var != null && f01Var.getInteger(2) == 1)) {
                    r45.f01 f01Var2 = (r45.f01) fVar.f70618d;
                    if (f01Var2 == null || (str = f01Var2.getString(1)) == null) {
                        str = "";
                    }
                    pm0.v.K(null, new df2.li(wiVar, str));
                    km2.g gVar = km2.g.f309100a;
                    c76 = wiVar.c7();
                    if (c76 != null && (z53Var = (r45.z53) c76.getCustom(1)) != null && (string = z53Var.getString(0)) != null) {
                        str2 = string;
                    }
                    gVar.a(str2);
                }
            }
            java.lang.String string2 = wiVar.O6().getResources().getString(com.tencent.mm.R.string.l4t);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            wiVar.h7(true, com.tencent.mm.R.string.l4u, string2);
            km2.g gVar2 = km2.g.f309100a;
            c76 = wiVar.c7();
            if (c76 != null) {
                str2 = string;
            }
            gVar2.a(str2);
        } else {
            int i17 = fVar.f70616b;
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            r45.f01 f01Var3 = (r45.f01) resp;
            if (i17 == -200196) {
                r45.m01 m01Var = (r45.m01) f01Var3.getCustom(3);
                if (m01Var != null) {
                    wiVar.f7(m01Var);
                }
            } else if (i17 == -200093) {
                java.lang.String string3 = wiVar.g7() ? wiVar.O6().getResources().getString(com.tencent.mm.R.string.l4w, wiVar.O6().getResources().getString(com.tencent.mm.R.string.l4y)) : wiVar.O6().getResources().getString(com.tencent.mm.R.string.l4w, wiVar.O6().getResources().getString(com.tencent.mm.R.string.l4v));
                kotlin.jvm.internal.o.d(string3);
                wiVar.h7(false, com.tencent.mm.R.string.gcu, string3);
            } else if (i17 != -200057) {
                z17 = false;
            } else {
                db5.e1.A(wiVar.O6(), wiVar.O6().getString(com.tencent.mm.R.string.l4s), "", wiVar.O6().getString(com.tencent.mm.R.string.f490507x1), "", df2.pi.f231069d, df2.qi.f231164d);
            }
            if (!z17) {
                db5.t7.makeText(wiVar.O6(), com.tencent.mm.R.string.dgq, 0).show();
            }
            android.content.Context O6 = wiVar.O6();
            pf5.z zVar = pf5.z.f353948a;
            if (!(O6 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) O6).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class)).a7();
        }
        return jz5.f0.f302826a;
    }
}
