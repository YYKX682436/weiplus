package com.tencent.mm.plugin.finder.service;

/* loaded from: classes3.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.service.p3 f126174a = new com.tencent.mm.plugin.finder.service.p3();

    public void a(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        intent.setClass(context, com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiContainerUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/service/FinderPoiService", "openPoiHalfScreenDrawer", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/service/FinderPoiService", "openPoiHalfScreenDrawer", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void b(android.content.Context context, r45.f96 location, zy2.o9 fromType, int i17, java.lang.String str, zy2.r9 callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(fromType, "fromType");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("poiRedirectRequest: poiClassifyId = ");
        sb6.append(location.getString(5));
        sb6.append(", Longitude = ");
        boolean z17 = false;
        sb6.append(location.getFloat(0));
        sb6.append(", Latitude = ");
        sb6.append(location.getFloat(1));
        sb6.append(", fromType = ");
        sb6.append(fromType);
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiService", sb6.toString());
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.C4).getValue()).r()).booleanValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiService", "isGoToNewPage = " + booleanValue);
        if (!booleanValue) {
            callback.a(zy2.p9.f477528d);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_location", location.toByteArray());
        intent.putExtra("key_from_type", fromType);
        intent.putExtra("key_sns_feed_id", str);
        intent.putExtra("key_entrance_type", 0);
        if (fromType == zy2.o9.f477516d) {
            intent.putExtra("key_finder_teen_mode_scene", 3);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 11, 81, intent);
        com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer repairerConfigLocationPoiDrawer = new com.tencent.mm.repairer.config.global.RepairerConfigLocationPoiDrawer();
        if (j62.e.g().c(repairerConfigLocationPoiDrawer) == 1 || bm5.o1.f22719a.h(repairerConfigLocationPoiDrawer) == 1) {
            java.lang.String string = location.getString(5);
            if (string != null && r26.i0.y(string, "foursquare_", false)) {
                z17 = true;
            }
            if (!z17 && ((java.lang.Number) t70Var.b1().r()).intValue() != 0) {
                if (i17 == 14) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Tk(context, intent, location, 14);
                    return;
                } else {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Tk(context, intent, location, 7);
                    return;
                }
            }
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Uk(context, intent);
    }

    public void c(android.view.View view, boolean z17, boolean z18, java.lang.String viewId, java.util.Map map) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        int i17 = z17 ? 8 : 0;
        if (z18) {
            i17 |= 32;
        }
        if (z17 && view == null) {
            if (map != null) {
                map.put("view_id", viewId);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", view, map, 27051);
        } else {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, viewId);
            aVar.gk(view, map);
            aVar.ik(view, i17, 27051);
        }
    }
}
