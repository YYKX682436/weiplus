package hc2;

/* loaded from: classes2.dex */
public abstract class v0 {
    public static void a(android.view.View view, java.lang.String viewId, int i17, int i18, java.util.Map map, ly1.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = 40;
        }
        int i27 = i17;
        if ((i19 & 4) != 0) {
            i18 = 25496;
        }
        int i28 = i18;
        java.util.Map map2 = (i19 & 8) != 0 ? null : map;
        ly1.a aVar2 = (i19 & 16) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        com.tencent.mm.plugin.finder.report.d2.f124994a.l(view, viewId, i27, i28, map2, aVar2);
    }

    public static void b(android.view.View view, java.lang.String str, java.lang.String str2, int i17, java.util.Map map, ly1.a aVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            str = "";
        }
        java.lang.String str3 = str;
        if ((i18 & 2) != 0) {
            str2 = "view_exp";
        }
        java.lang.String eventId = str2;
        if ((i18 & 4) != 0) {
            i17 = 25496;
        }
        int i19 = i17;
        java.util.Map map2 = (i18 & 8) != 0 ? null : map;
        ly1.a aVar2 = (i18 & 16) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        com.tencent.mm.plugin.finder.report.d2.f124994a.d(view, str3, eventId, i19, map2, aVar2);
    }

    public static void c(android.content.Context context, iy1.c cVar, java.lang.String str, boolean z17, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 8) != 0) {
            map = null;
        }
        kotlin.jvm.internal.o.g(context, "<this>");
        if (cVar == null || str == null) {
            return;
        }
        java.util.Map a17 = com.tencent.mm.plugin.finder.report.d2.f124994a.a(context, map);
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Aj(cVar.f295859d, str, a17, 1, z18);
    }

    public static void d(android.view.View view, java.lang.String viewId, java.lang.String str, boolean z17, java.util.Map map, ly1.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "view_exp";
        }
        java.lang.String eventId = str;
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        java.util.Map map2 = (i17 & 8) != 0 ? null : map;
        ly1.a aVar2 = (i17 & 16) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        com.tencent.mm.plugin.finder.report.d2.f124994a.j(view, viewId, eventId, z18, map2, aVar2);
    }

    public static void e(android.view.View view, java.lang.String viewId, int i17, int i18, boolean z17, boolean z18, java.util.Map map, ly1.a aVar, int i19, java.lang.Object obj) {
        int i27 = (i19 & 2) != 0 ? 40 : i17;
        int i28 = (i19 & 4) != 0 ? 25496 : i18;
        boolean z19 = (i19 & 8) != 0 ? false : z17;
        boolean z27 = (i19 & 16) != 0 ? false : z18;
        java.util.Map map2 = (i19 & 32) != 0 ? null : map;
        ly1.a aVar2 = (i19 & 64) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        com.tencent.mm.plugin.finder.report.d2.f124994a.n(view, viewId, i27, i28, z19, z27, map2, aVar2);
    }
}
