package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class bo {
    public static void a(com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        int j17;
        if (f9Var != null && (j17 = c01.ia.j(f9Var)) > 0) {
            com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct messageSecurityInterceptStruct = new com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct();
            int i19 = (com.tencent.mm.storage.z3.R4(f9Var.Q0()) || com.tencent.mm.storage.z3.q4(f9Var.Q0())) ? 2 : 1;
            int i27 = f9Var.A0() != 1 ? 0 : 1;
            messageSecurityInterceptStruct.f59202f = f9Var.I0();
            messageSecurityInterceptStruct.f59200d = i19;
            messageSecurityInterceptStruct.f59201e = i27;
            messageSecurityInterceptStruct.f59205i = j17;
            messageSecurityInterceptStruct.f59203g = i17;
            messageSecurityInterceptStruct.f59204h = i18;
            messageSecurityInterceptStruct.k();
        }
    }

    public static java.lang.String b(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.getType() == 1107296305) {
            try {
                ot0.q v17 = ot0.q.v(f9Var.U1());
                if (v17 != null) {
                    return ((rt0.d) v17.y(rt0.d.class)).f399375b;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemText", e17, null, new java.lang.Object[0]);
            }
        }
        return f9Var.j();
    }

    public static android.os.Bundle c(com.tencent.mm.storage.f9 f9Var, yb5.d dVar, java.lang.String str) {
        rt0.c cVar;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("msgSvrId", f9Var.I0());
        java.lang.String d17 = te5.e2.d(f9Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            bundle.putBoolean("useChatTool", true);
            bundle.putString("weAppSourceUserName", d17);
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null && (cVar = (rt0.c) v17.y(rt0.c.class)) != null && cVar.f399374b == 3) {
            bundle.putBoolean("shareMiddlePage", true);
        }
        return bundle;
    }

    public static void d(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.z3 z3Var, com.tencent.mm.ui.chatting.viewitems.ao aoVar, yb5.d dVar) {
        if ((f9Var.r2() || f9Var.y2() || z3Var != null) && z3Var.M1 == f9Var.getMsgId()) {
            if (c01.id.c() - f9Var.getCreateTime() < rn.e.f397599e.longValue() && c01.e2.Z(dVar.x())) {
                f(aoVar.f203396s, 0);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1());
                aoVar.f203396s.setTag(f9Var);
                aoVar.f203396s.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.fn(dVar, aoVar));
                h(K0, aoVar, dVar);
                return;
            }
        }
        f(aoVar.f203396s, 8);
    }

    public static void e(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.q0 q0Var, wl5.v vVar) {
        android.app.Activity g17 = dVar.g();
        wl5.x xVar = aoVar.f203391n;
        if (xVar != null) {
            xVar.c();
        }
        aoVar.f203382e.getContentView().setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.TRUE);
        rl5.r rVar = new rl5.r(g17, aoVar.f203382e.getContentView());
        aoVar.f203390m = rVar;
        rVar.L = new com.tencent.mm.ui.chatting.viewitems.zm(dVar, aoVar);
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        rl5.r rVar2 = aoVar.f203390m;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f397355y = new com.tencent.mm.ui.chatting.viewitems.an(aoVar, dVar, f9Var, g17, isTeenMode);
        rVar2.f397354x = new com.tencent.mm.ui.chatting.viewitems.bn(aoVar, dVar, f9Var, g17);
        wl5.o oVar = new wl5.o(aoVar.f203382e.getContentView(), aoVar.f203390m, vVar, qn4.y.g() ? new com.tencent.mm.ui.chatting.viewitems.t0() : null, new com.tencent.mm.pluginsdk.ui.span.y(aoVar.f203382e.getContentView(), new com.tencent.mm.pluginsdk.ui.span.y0(g17)));
        oVar.f447123g = com.tencent.mm.R.color.a3y;
        oVar.f447124h = 18;
        oVar.f447122f = com.tencent.mm.R.color.f478860j6;
        wl5.x xVar2 = new wl5.x(oVar);
        aoVar.f203391n = xVar2;
        xVar2.f447159d = new com.tencent.mm.ui.chatting.viewitems.cn(aoVar);
        q0Var.f205294i = new com.tencent.mm.ui.chatting.viewitems.dn(aoVar);
        xVar2.Y = new com.tencent.mm.ui.chatting.viewitems.wn(xVar2);
    }

    public static void f(android.view.View view, int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_group_todo_disable, 0) == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase", "setTodoContainerVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static void g(android.content.Context context) {
        if (!fp.e0.g() || android.os.Build.VERSION.SDK_INT <= 32) {
            dp.a.makeText(context, com.tencent.mm.R.string.f490361st, 0).show();
        }
    }

    public static void h(boolean z17, com.tencent.mm.ui.chatting.viewitems.ao aoVar, yb5.d dVar) {
        if (aoVar == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = aoVar.f203396s;
        if (linearLayout != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            aoVar.f203396s.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).n0());
            marginLayoutParams.leftMargin = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).o0(i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479556yd));
            aoVar.f203396s.setLayoutParams(marginLayoutParams);
        }
        if (z17) {
            aoVar.f203397t.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.Link_100));
            aoVar.f203397t.setText(com.tencent.mm.R.string.ft_);
        } else {
            aoVar.f203397t.setTextColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.adg));
            aoVar.f203397t.setText(com.tencent.mm.R.string.ftb);
        }
    }

    public static java.lang.String i(android.content.Context context, java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (f9Var.G.contains("notify@all")) {
            str2 = "";
        } else {
            str2 = context.getString(com.tencent.mm.R.string.i5p) + "\n";
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.J0(), "msg", null);
        if (d17 == null || com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.xmlpuretext"), 1) != 0) {
            str3 = "";
        } else {
            str3 = "\n\n<a href='weixin://chatroomnotify/detail/" + f9Var.getMsgId() + "'>" + context.getString(com.tencent.mm.R.string.f490465vt) + "</a>";
        }
        return "" + ((java.lang.Object) str2) + str + str3;
    }
}
