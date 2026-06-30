package f85;

/* loaded from: classes10.dex */
public final class f implements f85.e {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f260232a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f260233b;

    public f(yz5.a getOldTime, yz5.a getNewTime) {
        kotlin.jvm.internal.o.g(getOldTime, "getOldTime");
        kotlin.jvm.internal.o.g(getNewTime, "getNewTime");
        this.f260232a = getOldTime;
        this.f260233b = getNewTime;
    }

    @Override // f85.e
    public boolean a() {
        long longValue = ((java.lang.Number) this.f260232a.invoke()).longValue();
        yz5.a aVar = this.f260233b;
        ((java.lang.Number) aVar.invoke()).longValue();
        return longValue == 0 || ((java.lang.Number) aVar.invoke()).longValue() > longValue;
    }
}
