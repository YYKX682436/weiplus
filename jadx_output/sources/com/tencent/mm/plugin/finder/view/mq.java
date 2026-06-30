package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class mq {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.mq f132673a = new com.tencent.mm.plugin.finder.view.mq();

    public static final void a(com.tencent.mm.plugin.finder.view.mq mqVar, gk2.e eVar, db5.g4 g4Var) {
        mqVar.getClass();
        if (pm0.v.z(((mm2.c1) eVar.a(mm2.c1.class)).Q1, 32768)) {
            com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowCreater", "addTopComment spam, flag:" + ((mm2.c1) eVar.a(mm2.c1.class)).Q1);
        } else if (g4Var.findItem(152) == null) {
            g4Var.h(152, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.daa), com.tencent.mm.R.raw.finder_live_icons_filled_top, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
        }
    }

    public static final boolean b(com.tencent.mm.plugin.finder.view.mq mqVar, gk2.e eVar, dk2.zf zfVar) {
        r45.a84 a84Var;
        boolean z17;
        mqVar.getClass();
        kotlinx.coroutines.flow.f3 f3Var = ((mm2.n0) eVar.a(mm2.n0.class)).f329271p;
        if (f3Var == null || (a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue()) == null) {
            return false;
        }
        java.lang.String a17 = zfVar.a();
        if (a17 == null) {
            a17 = "";
        }
        if (a17.length() == 0) {
            return false;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if ((e17.length() > 0) && kotlin.jvm.internal.o.b(a17, e17)) {
            return false;
        }
        java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
        if (!(str.length() > 0) || !kotlin.jvm.internal.o.b(a17, str)) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list = a84Var.getList(1);
            if (list == null) {
                return false;
            }
            if (!list.isEmpty()) {
                for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : list) {
                    if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, a17)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                return false;
            }
        }
        return true;
    }

    public final void c(gk2.e buContext, db5.g4 menu, java.lang.String username) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(username, "username");
        if (kotlin.jvm.internal.o.b(((mm2.c1) buContext.a(mm2.c1.class)).f328780b2.get(username), java.lang.Boolean.TRUE)) {
            menu.g(158, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.da6), com.tencent.mm.R.raw.icons_filled_comment);
        } else {
            menu.g(158, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491505da5), com.tencent.mm.R.raw.icons_filled_comment_off);
        }
    }

    public final void d(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        if (menu.findItem(155) == null) {
            menu.i(155, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491683dx2), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_copy, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
        }
    }

    public final void e(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        menu.i(171, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nsd), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.dot_3_circle_filled, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
    }

    public final void f(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        menu.i(170, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nsc), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_addsticker, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
    }

    public final void g(db5.g4 menu, dk2.zf msg) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (menu.findItem(165) == null && (msg instanceof dk2.cg)) {
            if (((dk2.cg) msg).o()) {
                menu.i(166, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491251ci5), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479048oc), com.tencent.mm.R.raw.icons_filled_call_good, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479048oc));
            } else {
                menu.i(165, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ci6), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_call_good, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
            }
        }
    }

    public final void h(db5.g4 menu, dk2.zf msg) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (menu.findItem(154) != null || kotlin.jvm.internal.o.b(msg.a(), c01.z1.r())) {
            return;
        }
        java.lang.String a17 = msg.a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (kotlin.jvm.internal.o.b(a17, xy2.c.e(context)) || kotlin.jvm.internal.o.b(msg.a(), c01.z1.k())) {
            return;
        }
        menu.i(154, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491470d61), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_reply, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
    }

    public final void i(gk2.e buContext, db5.g4 menu, dk2.zf msg) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (menu.findItem(156) != null || kotlin.jvm.internal.o.b(msg.a(), c01.z1.r())) {
            return;
        }
        java.lang.String a17 = msg.a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (kotlin.jvm.internal.o.b(a17, xy2.c.e(context)) || kotlin.jvm.internal.o.b(msg.a(), c01.z1.k()) || ((mm2.c1) buContext.a(mm2.c1.class)).T) {
            return;
        }
        if (((mm2.n0) buContext.a(mm2.n0.class)).f329273r) {
            return;
        }
        menu.i(156, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491699dy4), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_report_problem, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
    }

    public final void j(gk2.e buContext, db5.g4 menu, java.lang.String username) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(username, "username");
        if (kotlin.jvm.internal.o.b(((mm2.c1) buContext.a(mm2.c1.class)).f328785c2.get(username), java.lang.Boolean.TRUE)) {
            menu.g(be1.r0.CTRL_INDEX, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.da_), com.tencent.mm.R.raw.icons_filled_eyes_on_comment);
        } else {
            menu.g(be1.r0.CTRL_INDEX, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.da9), com.tencent.mm.R.raw.icons_filled_eyes_off_comment);
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.view.mq mqVar, db5.g4 g4Var) {
        mqVar.getClass();
        java.util.List list = g4Var.f228344d;
        kotlin.jvm.internal.o.d(list);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 >= 0) {
                android.view.MenuItem menuItem = (android.view.MenuItem) next;
                db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
                if (h4Var != null && i17 >= 4) {
                    if (i17 < 8) {
                        h4Var.D = true;
                    } else {
                        h4Var.E = true;
                    }
                }
                i17 = i18;
            } else {
                kz5.c0.p();
                throw null;
            }
        }
    }
}
