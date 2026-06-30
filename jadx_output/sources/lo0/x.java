package lo0;

/* loaded from: classes14.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f320090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.HashMap hashMap, java.util.List list) {
        super(1);
        this.f320090d = hashMap;
        this.f320091e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject groupObj = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(groupObj, "groupObj");
        try {
            this.f320091e.add(new lo0.j(groupObj, this.f320090d));
        } catch (lo0.u unused) {
        }
        return jz5.f0.f302826a;
    }
}
