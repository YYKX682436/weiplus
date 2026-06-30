package d26;

/* loaded from: classes16.dex */
public final /* synthetic */ class r extends kotlin.jvm.internal.l implements yz5.l {
    public r(java.lang.Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "getValueClassPropertyType";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(d26.x.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g p07 = (n16.g) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return ((d26.x) this.receiver).v0(p07);
    }
}
