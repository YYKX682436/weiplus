package lo0;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f320088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320089e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.util.HashMap hashMap, java.util.List list) {
        super(1);
        this.f320088d = hashMap;
        this.f320089e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject groupObj = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(groupObj, "groupObj");
        try {
            lo0.m mVar = new lo0.m(groupObj, this.f320088d);
            if (!mVar.f320047c.isEmpty()) {
                this.f320089e.add(mVar);
            }
        } catch (lo0.u unused) {
        }
        return jz5.f0.f302826a;
    }
}
