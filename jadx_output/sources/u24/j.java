package u24;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final u24.j f424125a = new u24.j();

    public final a24.t a(java.util.List items) {
        java.lang.Object obj;
        java.util.List list;
        kotlin.jvm.internal.o.g(items, "items");
        int d17 = kz5.b1.d(kz5.d0.q(items, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            a24.i iVar = (a24.i) it.next();
            linkedHashMap.put(iVar.a7(), new a24.t(null, iVar, null, 4, null));
        }
        int d18 = kz5.b1.d(kz5.d0.q(items, 10));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d18 >= 16 ? d18 : 16);
        for (java.lang.Object obj2 : items) {
            linkedHashMap2.put(((a24.i) obj2).getClass(), obj2);
        }
        java.util.Iterator it6 = items.iterator();
        a24.t tVar = null;
        while (it6.hasNext()) {
            a24.i iVar2 = (a24.i) it6.next();
            a24.t tVar2 = (a24.t) linkedHashMap.get(iVar2.a7());
            if (tVar2 != null) {
                a24.i iVar3 = (a24.i) linkedHashMap2.get(iVar2.e7());
                java.lang.String a76 = iVar3 != null ? iVar3.a7() : null;
                if (kotlin.jvm.internal.o.b(tVar2.f906b.getClass(), com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain.class)) {
                    tVar2.f905a = null;
                    obj = jz5.f0.f302826a;
                } else {
                    a24.t tVar3 = (a24.t) linkedHashMap.get(a76);
                    tVar2.f905a = tVar3;
                    if (tVar3 == null || (list = tVar3.f907c) == null) {
                        tVar2 = tVar;
                        obj = null;
                    } else {
                        java.lang.Object valueOf = java.lang.Boolean.valueOf(list.add(tVar2));
                        tVar2 = tVar;
                        obj = valueOf;
                    }
                }
                if (obj == null) {
                    tVar = tVar2;
                } else {
                    tVar = tVar2;
                }
            }
            com.tencent.mars.xlog.Log.w("MircoMsg.NodeUtil", "nodeMap[item.key] is null");
        }
        if (tVar == null) {
            int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
                throw new java.lang.IllegalArgumentException("checkTree: node is null");
            }
            com.tencent.mars.xlog.Log.e("MircoMsg.NodeUtil", "checkTree: node is null");
        }
        return tVar;
    }
}
