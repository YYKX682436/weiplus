package rv4;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f400520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.Map map) {
        super(2);
        this.f400520d = map;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        org.json.JSONObject value = (org.json.JSONObject) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        int a17 = com.tencent.mm.sdk.platformtools.b8.a(key);
        if (a17 > 0) {
            this.f400520d.put(key, new rv4.m(a17, value));
        }
        return jz5.f0.f302826a;
    }
}
