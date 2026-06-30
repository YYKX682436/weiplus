package r16;

/* loaded from: classes16.dex */
public class c implements g26.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f368649a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.b f368650b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.b f368651c;

    public c(boolean z17, o06.b bVar, o06.b bVar2) {
        this.f368649a = z17;
        this.f368650b = bVar;
        this.f368651c = bVar2;
    }

    @Override // g26.f
    public boolean a(f26.c2 c17, f26.c2 c27) {
        o06.b a17 = this.f368650b;
        kotlin.jvm.internal.o.g(a17, "$a");
        o06.b b17 = this.f368651c;
        kotlin.jvm.internal.o.g(b17, "$b");
        kotlin.jvm.internal.o.g(c17, "c1");
        kotlin.jvm.internal.o.g(c27, "c2");
        if (kotlin.jvm.internal.o.b(c17, c27)) {
            return true;
        }
        o06.j i17 = c17.i();
        o06.j i18 = c27.i();
        if (!(i17 instanceof o06.e2) || !(i18 instanceof o06.e2)) {
            return false;
        }
        return r16.f.f368656a.b((o06.e2) i17, (o06.e2) i18, this.f368649a, new r16.d(a17, b17));
    }
}
