package g26;

/* loaded from: classes16.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.l implements yz5.p {
    public e0(java.lang.Object obj) {
        super(2, obj);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(g26.g0.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f26.o0 p07 = (f26.o0) obj;
        f26.o0 p17 = (f26.o0) obj2;
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        ((g26.g0) this.receiver).getClass();
        g26.u.f268014b.getClass();
        g26.v vVar = g26.t.f268013b;
        return java.lang.Boolean.valueOf(vVar.b(p07, p17) && !vVar.b(p17, p07));
    }
}
