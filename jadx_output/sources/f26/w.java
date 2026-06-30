package f26;

/* loaded from: classes16.dex */
public abstract class w extends f26.q2 {

    /* renamed from: b, reason: collision with root package name */
    public final f26.q2 f259233b;

    public w(f26.q2 substitution) {
        kotlin.jvm.internal.o.g(substitution, "substitution");
        this.f259233b = substitution;
    }

    @Override // f26.q2
    public boolean a() {
        return this.f259233b.a();
    }

    @Override // f26.q2
    public p06.k c(p06.k annotations) {
        kotlin.jvm.internal.o.g(annotations, "annotations");
        return this.f259233b.c(annotations);
    }

    @Override // f26.q2
    public boolean e() {
        return this.f259233b.e();
    }

    @Override // f26.q2
    public f26.o0 f(f26.o0 topLevelType, f26.d3 position) {
        kotlin.jvm.internal.o.g(topLevelType, "topLevelType");
        kotlin.jvm.internal.o.g(position, "position");
        return this.f259233b.f(topLevelType, position);
    }
}
