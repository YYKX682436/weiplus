package en5;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f255390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yz5.l lVar, java.util.ArrayList arrayList, int i17) {
        super(0);
        this.f255389d = lVar;
        this.f255390e = arrayList;
        this.f255391f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f255390e.get(this.f255391f);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        this.f255389d.invoke(obj);
        return jz5.f0.f302826a;
    }
}
