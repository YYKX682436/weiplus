package oh5;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f345497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.ArrayList arrayList) {
        super(1);
        this.f345497d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = it.getString("so");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String str = (java.lang.String) r26.n0.f0(string, new java.lang.String[]{"/"}, false, 0, 6, null).get(r1.size() - 1);
        java.lang.String string2 = it.getString("size");
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        long parseLong = java.lang.Long.parseLong(string2);
        java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) oh5.j.f345500a).get(str);
        if (parseLong > (l17 != null ? l17.longValue() : oh5.j.f345501b)) {
            this.f345497d.add(new oh5.p(str, parseLong));
        }
        return jz5.f0.f302826a;
    }
}
