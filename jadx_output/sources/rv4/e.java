package rv4;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv4.k f400459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rv4.k kVar, java.util.List list) {
        super(2);
        this.f400459d = kVar;
        this.f400460e = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        org.json.JSONObject value = (org.json.JSONObject) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        if (kotlin.jvm.internal.o.b(pv4.a.d(value, "nickname"), this.f400459d.f400508f)) {
            this.f400460e.add(key);
        }
        return jz5.f0.f302826a;
    }
}
