package kf2;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f307277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.util.ArrayList arrayList) {
        super(1);
        this.f307277d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f307277d.add(new android.graphics.RectF(it.getInt("left"), it.getInt("top"), it.getInt("right"), it.getInt("bottom")));
        return jz5.f0.f302826a;
    }
}
