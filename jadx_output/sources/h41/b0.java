package h41;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f278760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.ArrayList arrayList) {
        super(1);
        this.f278760d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f278760d.add(it.getString("chat_id"));
        return jz5.f0.f302826a;
    }
}
