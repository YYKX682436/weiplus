package vu0;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f440081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(vu0.o0 o0Var, java.lang.String str) {
        super(1);
        this.f440081d = o0Var;
        this.f440082e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        wu0.d dVar = this.f440081d.f440133f;
        dVar.getClass();
        java.lang.String groupID = this.f440082e;
        kotlin.jvm.internal.o.g(groupID, "groupID");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = dVar.f449655b;
        wu0.b bVar = (wu0.b) concurrentHashMap.get(groupID);
        concurrentHashMap.put(groupID, bVar != null ? wu0.b.a(bVar, floatValue, 0.0f, false, 6, null) : new wu0.b(floatValue, 0.0f, false, 4, null));
        dVar.a();
        return jz5.f0.f302826a;
    }
}
