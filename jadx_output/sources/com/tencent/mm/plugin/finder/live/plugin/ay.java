package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ay implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f111945d;

    public ay(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f111945d = tyVar;
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
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f111945d;
        int i18 = tyVar.f114492u;
        java.lang.String str2 = "";
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == i18) {
            com.tencent.mm.plugin.finder.live.plugin.ty.t1(tyVar, false);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = tyVar.W;
            if (k0Var != null) {
                k0Var.u();
            }
            if (tyVar.f114485p.getLiveRole() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                y4Var.T.f327672s++;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.b3[] b3VarArr = ml2.b3.f327214d;
                java.lang.String valueOf2 = java.lang.String.valueOf(2);
                r45.xn1 xn1Var = tyVar.V;
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
        int i19 = tyVar.f114493v;
        if (valueOf != null && valueOf.intValue() == i19) {
            com.tencent.mm.plugin.finder.live.plugin.ty.t1(tyVar, true);
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = tyVar.W;
            if (k0Var2 != null) {
                k0Var2.u();
            }
            if (tyVar.f114485p.getLiveRole() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var2 = ml2.j0.f327583i;
                y4Var2.T.f327673t++;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                ml2.b3[] b3VarArr2 = ml2.b3.f327214d;
                java.lang.String valueOf3 = java.lang.String.valueOf(3);
                r45.xn1 xn1Var2 = tyVar.V;
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
        int i27 = tyVar.f114494w;
        if (valueOf != null && valueOf.intValue() == i27) {
            com.tencent.mm.plugin.finder.live.plugin.zx zxVar = new com.tencent.mm.plugin.finder.live.plugin.zx(tyVar);
            if (tyVar.X == null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = new com.tencent.mm.ui.widget.dialog.k0(tyVar.R0().getContext(), 1, true);
                tyVar.X = k0Var3;
                k0Var3.U1 = true;
                android.view.ViewGroup viewGroup = tyVar.f365323d;
                android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.bqn, null);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.i77)).setText(viewGroup.getContext().getString(com.tencent.mm.R.string.e7m));
                com.tencent.mm.ui.widget.dialog.k0 k0Var4 = tyVar.X;
                if (k0Var4 != null) {
                    k0Var4.s(inflate, false);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var5 = tyVar.X;
                if (k0Var5 != null) {
                    k0Var5.p(com.tencent.mm.plugin.finder.live.plugin.kx.f113321d);
                }
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var6 = tyVar.X;
            if (k0Var6 != null) {
                k0Var6.t(true);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var7 = tyVar.X;
            if (k0Var7 != null) {
                k0Var7.o(null);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var8 = tyVar.X;
            if (k0Var8 != null) {
                k0Var8.f211872n = new com.tencent.mm.plugin.finder.live.plugin.lx(com.tencent.mm.R.color.f479323wd, tyVar, com.tencent.mm.R.string.e7k);
            }
            if (k0Var8 != null) {
                k0Var8.f211881s = new com.tencent.mm.plugin.finder.live.plugin.mx(tyVar, zxVar);
            }
            if (k0Var8 != null) {
                k0Var8.p(new com.tencent.mm.plugin.finder.live.plugin.nx(tyVar));
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var9 = tyVar.X;
            if (k0Var9 != null) {
                k0Var9.v();
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var10 = tyVar.W;
            if (k0Var10 != null) {
                k0Var10.u();
                return;
            }
            return;
        }
        int i28 = tyVar.f114495x;
        if (valueOf != null && valueOf.intValue() == i28) {
            r45.xn1 xn1Var3 = tyVar.V;
            if (xn1Var3 != null && (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) != null && (username2 = finderContact3.getUsername()) != null && (W0 = tyVar.W0()) != null) {
                android.content.Context context = tyVar.R0().getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((dk2.r4) W0).I(context, ((mm2.e1) ((mm2.c1) tyVar.P0(mm2.c1.class)).business(mm2.e1.class)).f328988r.getLong(0), username2, 0L, 62);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var11 = tyVar.W;
            if (k0Var11 != null) {
                k0Var11.u();
            }
            if (tyVar.f114485p.getLiveRole() == 1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var3 = ml2.j0.f327583i;
                y4Var3.T.f327669p++;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                ml2.b3[] b3VarArr3 = ml2.b3.f327214d;
                java.lang.String valueOf4 = java.lang.String.valueOf(4);
                r45.xn1 xn1Var4 = tyVar.V;
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
        int i29 = tyVar.f114498y;
        if (valueOf == null || valueOf.intValue() != i29) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var12 = tyVar.W;
            if (k0Var12 != null) {
                k0Var12.u();
                return;
            }
            return;
        }
        r45.xn1 xn1Var5 = tyVar.V;
        if (xn1Var5 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        if (str != null) {
            tyVar.getClass();
            if (str.length() != 0) {
                z17 = false;
            }
        }
        java.lang.String str3 = tyVar.f114488q;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str3, "goToFinderProfile finderUsername:" + str);
            return;
        }
        if (tyVar.f114485p.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327537u, "", 0);
        }
        boolean x07 = tyVar.x0();
        com.tencent.mars.xlog.Log.i(str3, "goToFinderProfile isLandscape:" + x07);
        if (x07) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(tyVar.f114490s, str);
            com.tencent.mm.plugin.finder.live.plugin.l.s1(tyVar, tyVar.f114489r, bundle, 0, 4, null);
            return;
        }
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context2 = tyVar.R0().getContext();
        gk2.e S0 = tyVar.S0();
        android.content.Context context3 = tyVar.R0().getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dk2.q4.j(q4Var, context2, S0, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).c(zy2.ra.class))).V6(), false, null, 96, null);
    }
}
