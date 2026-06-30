package uv4;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f431461d;

    /* renamed from: a, reason: collision with root package name */
    public static final uv4.x f431458a = new uv4.x();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f431459b = kz5.z.D0(new java.lang.Integer[]{0, 10, 6});

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f431460c = jz5.h.b(uv4.r.f431450d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f431462e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f431463f = jz5.h.b(uv4.w.f431457d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f431464g = jz5.h.b(uv4.t.f431454d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f431465h = jz5.h.b(uv4.u.f431455d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f431466i = jz5.h.b(uv4.v.f431456d);

    public final void a() {
        java.lang.String str;
        try {
            java.util.List i17 = kz5.c0.i((uv4.p) ((jz5.n) f431463f).getValue(), (uv4.p) ((jz5.n) f431464g).getValue(), (uv4.p) ((jz5.n) f431465h).getValue());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : i17) {
                if (((uv4.p) obj).v("_udr").f431435a == 1) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: all templates already initialized, skip check");
                return;
            }
            f431461d = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: " + arrayList.size() + " template(s) need initialization");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                uv4.p pVar = (uv4.p) it.next();
                int i18 = pVar.f431417a;
                if (i18 == 0) {
                    str = "fts_template";
                } else if (i18 == 6) {
                    str = "tsc_template";
                } else if (i18 != 10) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getResourceName: unknown templateType=" + i18);
                    str = "";
                } else {
                    str = "esc_template";
                }
                if (str.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: skip template with empty resource name");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: checking resource '" + str + "' for project ilinkres_6362f858");
                    com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
                    com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
                    qVar.c("ilinkres_6362f858");
                    java.util.LinkedList linkedList = qVar.f217548e;
                    if (linkedList != null) {
                        linkedList.add(str);
                    }
                    ((com.tencent.mm.udr.a1) e0Var).Di(qVar, new uv4.s(str, e0Var, pVar));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchTemplateHolder", e17, "checkUDRResourcesIfNeeded", new java.lang.Object[0]);
        }
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) f431460c).getValue()).intValue();
    }

    public final uv4.g c(int i17, java.lang.Boolean bool) {
        if (f431459b.contains(java.lang.Integer.valueOf(i17))) {
            boolean z17 = true;
            if (b() < 1 && !kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "getTemplate: type=" + i17 + ", useUdr=" + z17 + ", template=" + (z17 ? "WebSearchTemplateByUDR" : "Original"));
            if (z17) {
                if (!f431461d) {
                    synchronized (f431462e) {
                        if (!f431461d) {
                            f431458a.a();
                        }
                    }
                }
                if (i17 == 0) {
                    return (uv4.p) ((jz5.n) f431463f).getValue();
                }
                if (i17 == 6) {
                    return (uv4.p) ((jz5.n) f431465h).getValue();
                }
                if (i17 != 10) {
                    return null;
                }
                return (uv4.p) ((jz5.n) f431464g).getValue();
            }
        }
        return (uv4.g) ((java.util.HashMap) ((jz5.n) f431466i).getValue()).get(java.lang.Integer.valueOf(i17));
    }
}
