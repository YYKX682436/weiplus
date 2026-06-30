package lo0;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f320044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.util.Map map) {
        super(1);
        this.f320044d = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject badgeObj = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(badgeObj, "badgeObj");
        try {
            lo0.b bVar = new lo0.b(badgeObj);
            this.f320044d.put(bVar.f319960a, bVar);
        } catch (lo0.u unused) {
        }
        return jz5.f0.f302826a;
    }
}
