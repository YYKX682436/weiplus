package y1;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f458745a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f458746b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f458747c;

    public j(yz5.a value, yz5.a maxValue, boolean z17) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(maxValue, "maxValue");
        this.f458745a = value;
        this.f458746b = maxValue;
        this.f458747c = z17;
    }

    public java.lang.String toString() {
        return "ScrollAxisRange(value=" + ((java.lang.Number) this.f458745a.invoke()).floatValue() + ", maxValue=" + ((java.lang.Number) this.f458746b.invoke()).floatValue() + ", reverseScrolling=" + this.f458747c + ')';
    }
}
