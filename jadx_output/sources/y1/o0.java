package y1;

/* loaded from: classes14.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f458783a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f458784b;

    public o0(java.lang.String name, yz5.p mergePolicy) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(mergePolicy, "mergePolicy");
        this.f458783a = name;
        this.f458784b = mergePolicy;
    }

    public final void a(y1.p0 thisRef, f06.v property, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        ((y1.l) thisRef).g(this, obj);
    }

    public java.lang.String toString() {
        return "SemanticsPropertyKey: " + this.f458783a;
    }

    public /* synthetic */ o0(java.lang.String str, yz5.p pVar, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? y1.n0.f458782d : pVar);
    }
}
