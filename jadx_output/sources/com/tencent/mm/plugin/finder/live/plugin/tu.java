package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tu implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f114477d;

    public tu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        this.f114477d = ivVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        java.lang.String username2;
        dk2.xf W0;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        java.lang.String username3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        java.lang.String username4;
        java.lang.String str = null;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f114477d;
        int i18 = ivVar.f113020v;
        java.lang.String str2 = "";
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == i18) {
            com.tencent.mm.plugin.finder.live.plugin.iv.t1(ivVar, false);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = ivVar.f113011l1;
            if (k0Var != null) {
                k0Var.u();
            }
            if (ivVar.f113015q.getLiveRole() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                y4Var.T.f327672s++;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.b3[] b3VarArr = ml2.b3.f327214d;
                java.lang.String valueOf2 = java.lang.String.valueOf(2);
                r45.xn1 xn1Var = ivVar.f113026y0;
                if (xn1Var != null && (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null && (username4 = finderContact5.getUsername()) != null) {
                    str2 = username4;
                }
                jSONObject.put(valueOf2, str2);
                ml2.z4 z4Var = ml2.z4.f328356i;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                if (y4Var.W) {
                    z4Var = ml2.z4.f328364n;
                }
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, z4Var, jSONObject.toString(), null, 4, null);
                return;
            }
            return;
        }
        int i19 = ivVar.f113021w;
        if (valueOf != null && valueOf.intValue() == i19) {
            com.tencent.mm.plugin.finder.live.plugin.iv.t1(ivVar, true);
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = ivVar.f113011l1;
            if (k0Var2 != null) {
                k0Var2.u();
            }
            if (ivVar.f113015q.getLiveRole() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var2 = ml2.j0.f327583i;
                y4Var2.T.f327673t++;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                ml2.b3[] b3VarArr2 = ml2.b3.f327214d;
                java.lang.String valueOf3 = java.lang.String.valueOf(3);
                r45.xn1 xn1Var2 = ivVar.f113026y0;
                if (xn1Var2 != null && (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null && (username3 = finderContact4.getUsername()) != null) {
                    str2 = username3;
                }
                jSONObject2.put(valueOf3, str2);
                ml2.z4 z4Var2 = ml2.z4.f328356i;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                if (y4Var2.W) {
                    z4Var2 = ml2.z4.f328364n;
                }
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb.y6((zy2.zb) c18, z4Var2, jSONObject2.toString(), null, 4, null);
                return;
            }
            return;
        }
        int i27 = ivVar.f113022x;
        if (valueOf != null && valueOf.intValue() == i27) {
            com.tencent.mm.plugin.finder.live.plugin.su suVar = new com.tencent.mm.plugin.finder.live.plugin.su(ivVar);
            if (ivVar.f113014p1 == null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = new com.tencent.mm.ui.widget.dialog.k0(ivVar.R0().getContext(), 1, true);
                ivVar.f113014p1 = k0Var3;
                k0Var3.U1 = true;
                android.view.ViewGroup viewGroup = ivVar.f365323d;
                android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.bqn, null);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.i77)).setText(viewGroup.getContext().getString(com.tencent.mm.R.string.e7m));
                com.tencent.mm.ui.widget.dialog.k0 k0Var4 = ivVar.f113014p1;
                if (k0Var4 != null) {
                    k0Var4.s(inflate, false);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var5 = ivVar.f113014p1;
                if (k0Var5 != null) {
                    k0Var5.p(com.tencent.mm.plugin.finder.live.plugin.xt.f115128d);
                }
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var6 = ivVar.f113014p1;
            if (k0Var6 != null) {
                k0Var6.t(true);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var7 = ivVar.f113014p1;
            if (k0Var7 != null) {
                k0Var7.o(null);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var8 = ivVar.f113014p1;
            if (k0Var8 != null) {
                k0Var8.f211872n = new com.tencent.mm.plugin.finder.live.plugin.yt(com.tencent.mm.R.color.f479323wd, ivVar, com.tencent.mm.R.string.e7k);
            }
            if (k0Var8 != null) {
                k0Var8.f211881s = new com.tencent.mm.plugin.finder.live.plugin.zt(ivVar, suVar);
            }
            if (k0Var8 != null) {
                k0Var8.p(new com.tencent.mm.plugin.finder.live.plugin.au(ivVar));
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var9 = ivVar.f113014p1;
            if (k0Var9 != null) {
                k0Var9.v();
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var10 = ivVar.f113011l1;
            if (k0Var10 != null) {
                k0Var10.u();
                return;
            }
            return;
        }
        int i28 = ivVar.f113025y;
        if (valueOf != null && valueOf.intValue() == i28) {
            r45.xn1 xn1Var3 = ivVar.f113026y0;
            if (xn1Var3 != null && (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) != null && (username2 = finderContact3.getUsername()) != null && (W0 = ivVar.W0()) != null) {
                android.content.Context context = ivVar.R0().getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((dk2.r4) W0).I(context, ((mm2.e1) ((mm2.c1) ivVar.P0(mm2.c1.class)).business(mm2.e1.class)).f328988r.getLong(0), username2, 0L, 62);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var11 = ivVar.f113011l1;
            if (k0Var11 != null) {
                k0Var11.u();
            }
            if (ivVar.f113015q.getLiveRole() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var3 = ml2.j0.f327583i;
                y4Var3.T.f327669p++;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                ml2.b3[] b3VarArr3 = ml2.b3.f327214d;
                java.lang.String valueOf4 = java.lang.String.valueOf(4);
                r45.xn1 xn1Var4 = ivVar.f113026y0;
                if (xn1Var4 != null && (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) != null && (username = finderContact2.getUsername()) != null) {
                    str2 = username;
                }
                jSONObject3.put(valueOf4, str2);
                ml2.z4 z4Var3 = ml2.z4.f328356i;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                if (y4Var3.W) {
                    z4Var3 = ml2.z4.f328364n;
                }
                i95.m c19 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                zy2.zb.y6((zy2.zb) c19, z4Var3, jSONObject3.toString(), null, 4, null);
                return;
            }
            return;
        }
        int i29 = ivVar.f113028z;
        if (valueOf == null || valueOf.intValue() != i29) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var12 = ivVar.f113011l1;
            if (k0Var12 != null) {
                k0Var12.u();
                return;
            }
            return;
        }
        r45.xn1 xn1Var5 = ivVar.f113026y0;
        if (xn1Var5 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        if (str != null) {
            ivVar.getClass();
            if (str.length() != 0) {
                z17 = false;
            }
        }
        java.lang.String str3 = ivVar.f113016r;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str3, "goToFinderProfile finderUsername:" + str);
            return;
        }
        if (ivVar.f113015q.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327537u, "", 0);
        }
        boolean x07 = ivVar.x0();
        com.tencent.mars.xlog.Log.i(str3, "goToFinderProfile isLandscape:" + x07);
        if (x07) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(ivVar.f113018t, str);
            com.tencent.mm.plugin.finder.live.plugin.l.s1(ivVar, ivVar.f113017s, bundle, 0, 4, null);
            return;
        }
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context2 = ivVar.R0().getContext();
        gk2.e S0 = ivVar.S0();
        android.content.Context context3 = ivVar.R0().getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dk2.q4.j(q4Var, context2, S0, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).c(zy2.ra.class))).V6(), false, null, 96, null);
    }
}
