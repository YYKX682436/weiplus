package re;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f394270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(re.n nVar) {
        super(1);
        this.f394270d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        re.n nVar = this.f394270d;
        lifecycle.a(new re.c(nVar));
        re.d dVar = new re.d(nVar);
        u81.b bVar = u81.b.SUSPEND;
        android.util.ArrayMap arrayMap = lifecycle.f40828e;
        arrayMap.put(bVar, dVar);
        arrayMap.put(u81.b.FOREGROUND, new re.e(nVar));
        lifecycle.b(new re.f(nVar));
        return jz5.f0.f302826a;
    }
}
