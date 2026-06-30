package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.d2 f124994a = new com.tencent.mm.plugin.finder.report.d2();

    public static void e(com.tencent.mm.plugin.finder.report.d2 d2Var, android.content.Context context, java.lang.String viewId, java.lang.String eventId, int i17, java.util.Map map, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            eventId = "view_exp";
        }
        if ((i18 & 8) != 0) {
            i17 = 25496;
        }
        if ((i18 & 16) != 0) {
            map = null;
        }
        d2Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.util.Map a17 = d2Var.a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Hj(viewId, eventId, a17, i17);
    }

    public static /* synthetic */ void f(com.tencent.mm.plugin.finder.report.d2 d2Var, android.view.View view, java.lang.String str, java.lang.String str2, int i17, java.util.Map map, ly1.a aVar, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = "";
        }
        java.lang.String str3 = str;
        if ((i18 & 4) != 0) {
            str2 = "view_exp";
        }
        java.lang.String str4 = str2;
        if ((i18 & 8) != 0) {
            i17 = 25496;
        }
        d2Var.d(view, str3, str4, i17, (i18 & 16) != 0 ? null : map, (i18 & 32) != 0 ? null : aVar);
    }

    public static void g(com.tencent.mm.plugin.finder.report.d2 d2Var, android.content.Context context, java.lang.String eventId, boolean z17, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 8) != 0) {
            map = null;
        }
        d2Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.util.Map a17 = d2Var.a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).yj(eventId, null, a17, 1, z18);
    }

    public static /* synthetic */ void i(com.tencent.mm.plugin.finder.report.d2 d2Var, android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str2 = "view_exp";
        }
        java.lang.String str3 = str2;
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 16) != 0) {
            map = null;
        }
        d2Var.h(context, str, str3, z18, map);
    }

    public static /* synthetic */ void k(com.tencent.mm.plugin.finder.report.d2 d2Var, android.view.View view, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, ly1.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str2 = "view_exp";
        }
        java.lang.String str3 = str2;
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        d2Var.j(view, str, str3, z17, (i17 & 16) != 0 ? null : map, (i17 & 32) != 0 ? null : aVar);
    }

    public static /* synthetic */ void m(com.tencent.mm.plugin.finder.report.d2 d2Var, android.view.View view, java.lang.String str, int i17, int i18, java.util.Map map, ly1.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i17 = 40;
        }
        int i27 = i17;
        if ((i19 & 8) != 0) {
            i18 = 25496;
        }
        d2Var.l(view, str, i27, i18, (i19 & 16) != 0 ? null : map, (i19 & 32) != 0 ? null : aVar);
    }

    public final java.util.Map a(android.content.Context context, java.util.Map map) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), map);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final java.util.Map b(r45.qt2 qt2Var, java.util.Map map) {
        if (qt2Var == null) {
            return map;
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.getInteger(5))), new jz5.l("behaviour_session_id", qt2Var.getString(0)), new jz5.l("finder_context_id", qt2Var.getString(1)), new jz5.l("finder_tab_context_id", qt2Var.getString(2)), new jz5.l("extra_info", qt2Var.getString(11)), new jz5.l("enter_source_info", qt2Var.getString(12)));
        if (map != null) {
            l17.putAll(map);
        }
        return l17;
    }

    public final java.util.Map c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        return kz5.c1.l(new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))));
    }

    public final void d(android.view.View view, java.lang.String str, java.lang.String eventId, int i17, java.util.Map map, ly1.a aVar) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Map a17 = a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cy1.a aVar2 = (cy1.a) ((dy1.r) c17);
        aVar2.pk(view, str);
        aVar2.Ai(view, aVar);
        aVar2.Cj(eventId, view, a17, i17);
    }

    public final void h(android.content.Context context, java.lang.String viewId, java.lang.String eventId, boolean z17, java.util.Map map) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.util.Map a17 = a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Bj(viewId, eventId, a17, 1, z17);
    }

    public final void j(android.view.View view, java.lang.String viewId, java.lang.String eventId, boolean z17, java.util.Map map, ly1.a aVar) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Map a17 = a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cy1.a aVar2 = (cy1.a) ((dy1.r) c17);
        aVar2.pk(view, viewId);
        aVar2.Ai(view, aVar);
        aVar2.yj(eventId, view, a17, 1, z17);
    }

    public final void l(android.view.View view, java.lang.String viewId, int i17, int i18, java.util.Map map, ly1.a aVar) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Map a17 = a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cy1.a aVar2 = (cy1.a) ((dy1.r) c17);
        aVar2.pk(view, viewId);
        cy1.a aVar3 = (cy1.a) aVar2.ik(view, i17, i18);
        aVar3.gk(view, a17);
        aVar3.Ai(view, aVar);
    }

    public final void n(android.view.View view, java.lang.String viewId, int i17, int i18, boolean z17, boolean z18, java.util.Map map, ly1.a aVar) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Map a17 = a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cy1.a aVar2 = (cy1.a) ((dy1.r) c17);
        aVar2.pk(view, viewId);
        aVar2.Tj(view, i17, 1, z17);
        aVar2.gk(view, a17);
        aVar2.Ai(view, aVar);
        if (z18) {
            aVar2.ik(view, i17, i18);
        }
    }
}
