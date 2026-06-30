package k61;

/* loaded from: classes9.dex */
public class k implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.m f304501a;

    public k(k61.m mVar) {
        this.f304501a = mVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        k61.h hVar = this.f304501a.f304503a;
        map.put("launchScene", java.lang.Integer.valueOf(hVar.f255224n.a("enter_scene", 1)));
        km5.u.a(((km5.q) km5.u.e(map)).n(hVar.f304497o.f279180d));
        return null;
    }
}
