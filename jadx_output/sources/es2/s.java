package es2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f256402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(es2.h0 h0Var, long j17, java.lang.String str) {
        super(0);
        this.f256401d = h0Var;
        this.f256402e = j17;
        this.f256403f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        es2.h0 h0Var = this.f256401d;
        java.util.HashMap hashMap = h0Var.f256371d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j17 = this.f256402e;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((cs2.p) entry.getValue()).f222089f2 == j17) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it6 = linkedHashMap.values().iterator();
        while (it6.hasNext()) {
            java.lang.String field_mediaId = ((cs2.p) it6.next()).field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            h0Var.a(field_mediaId, false, this.f256403f);
        }
        return java.lang.Boolean.valueOf(pm0.v.d0(h0Var.f256372e, new es2.r(j17, h0Var)));
    }
}
