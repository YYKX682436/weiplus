package q26;

/* loaded from: classes10.dex */
public final class m implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f359870a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f359871b;

    public m(yz5.a getInitialValue, yz5.l getNextValue) {
        kotlin.jvm.internal.o.g(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.o.g(getNextValue, "getNextValue");
        this.f359870a = getInitialValue;
        this.f359871b = getNextValue;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.l(this);
    }
}
