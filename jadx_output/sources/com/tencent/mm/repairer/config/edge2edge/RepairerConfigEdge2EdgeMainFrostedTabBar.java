package com.tencent.mm.repairer.config.edge2edge;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/edge2edge/RepairerConfigEdge2EdgeMainFrostedTabBar;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigEdge2EdgeMainFrostedTabBar extends q55.i {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f192213a = jz5.h.b(t55.a.f415849d);

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Edge2Edge_LauncherUI_FrostedTabBar";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "Edge2Edge-首页-TabBar";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupEdge2Edge.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        int i18 = 1;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a()) && !com.tencent.mm.sdk.platformtools.v8.b(com.tencent.mm.sdk.platformtools.z.f193112h)) {
            i18 = 0;
        }
        return java.lang.Integer.valueOf(i18);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_edge2edge_launcherui_frosted_tabbar";
    }
}
