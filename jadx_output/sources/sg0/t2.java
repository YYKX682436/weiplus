package sg0;

/* loaded from: classes10.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f407815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(java.util.List list) {
        super(1);
        this.f407815d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bw5.q3 q3Var = new bw5.q3();
        q3Var.d(it.optString("key"));
        q3Var.e(it.optString("textValue"));
        q3Var.f31914e = it.optInt("uintValue");
        q3Var.f31916g[2] = true;
        this.f407815d.add(q3Var);
        return jz5.f0.f302826a;
    }
}
