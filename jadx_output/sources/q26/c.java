package q26;

/* loaded from: classes7.dex */
public final class c implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f359830a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f359831b;

    public c(q26.n source, yz5.l keySelector) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(keySelector, "keySelector");
        this.f359830a = source;
        this.f359831b = keySelector;
    }

    @Override // q26.n
    public java.util.Iterator iterator() {
        return new q26.b(this.f359830a.iterator(), this.f359831b);
    }
}
