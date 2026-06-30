package r16;

/* loaded from: classes16.dex */
public final class u implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r16.p f368670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o06.d f368671e;

    public u(r16.p pVar, o06.d dVar) {
        this.f368670d = pVar;
        this.f368671e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.d second = (o06.d) obj;
        r16.o oVar = (r16.o) this.f368670d;
        oVar.getClass();
        o06.d first = this.f368671e;
        kotlin.jvm.internal.o.g(first, "first");
        kotlin.jvm.internal.o.g(second, "second");
        oVar.c(first, second);
        return jz5.f0.f302826a;
    }
}
