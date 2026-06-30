package q26;

/* loaded from: classes7.dex */
public final class b extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Iterator f359826f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f359827g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f359828h;

    public b(java.util.Iterator source, yz5.l keySelector) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(keySelector, "keySelector");
        this.f359826f = source;
        this.f359827g = keySelector;
        this.f359828h = new java.util.HashSet();
    }

    @Override // kz5.c
    public void b() {
        java.lang.Object next;
        do {
            java.util.Iterator it = this.f359826f;
            if (!it.hasNext()) {
                this.f313962d = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f359828h.add(this.f359827g.invoke(next)));
        this.f313963e = next;
        this.f313962d = 1;
    }
}
