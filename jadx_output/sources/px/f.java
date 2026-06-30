package px;

/* loaded from: classes.dex */
public final class f implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final px.f f358746d = new px.f();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        jz5.g gVar = px.g.f358747a;
        kotlin.jvm.internal.o.d(str);
        java.lang.String concat = "forward_clawbot_last_used_".concat(str);
        jz5.g gVar2 = px.g.f358747a;
        java.lang.Object value = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        long q17 = ((com.tencent.mm.sdk.platformtools.o4) value).q(concat, 0L);
        kotlin.jvm.internal.o.d(str2);
        java.lang.String concat2 = "forward_clawbot_last_used_".concat(str2);
        java.lang.Object value2 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        long q18 = ((com.tencent.mm.sdk.platformtools.o4) value2).q(concat2, 0L);
        if (q17 > 0 && q18 > 0) {
            return kotlin.jvm.internal.o.j(q18, q17);
        }
        if (q17 > 0) {
            return -1;
        }
        return q18 > 0 ? 1 : 0;
    }
}
