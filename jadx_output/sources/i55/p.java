package i55;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f288870a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f288871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f288872c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f288873d;

    /* renamed from: e, reason: collision with root package name */
    public final int f288874e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f288875f;

    public p(int i17, java.lang.String pageName, int i18, java.lang.String entryKey, int i19, java.util.Map map) {
        kotlin.jvm.internal.o.g(pageName, "pageName");
        kotlin.jvm.internal.o.g(entryKey, "entryKey");
        this.f288870a = i17;
        this.f288871b = pageName;
        this.f288872c = i18;
        this.f288873d = entryKey;
        this.f288874e = i19;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f288875f = linkedHashMap;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
    }

    public final void a(boolean z17) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(e55.e.f249667a.j());
        linkedHashMap.put("consume_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0));
        linkedHashMap.put("page_id", java.lang.Integer.valueOf(this.f288870a));
        linkedHashMap.put("page_name", this.f288871b);
        linkedHashMap.put("click_entry_key", this.f288873d);
        linkedHashMap.put("tab_info", this.f288875f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("red_dot_page_consume_check", linkedHashMap, this.f288874e);
    }
}
