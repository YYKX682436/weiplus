package dv4;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f244013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.util.List list) {
        super(1);
        this.f244013d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f244013d.add(new dv4.o((float) it.optDouble("x1", 0.0d), (float) it.optDouble("y1", 0.0d), (float) it.optDouble("x2", 0.0d), (float) it.optDouble("y2", 0.0d)));
        return jz5.f0.f302826a;
    }
}
