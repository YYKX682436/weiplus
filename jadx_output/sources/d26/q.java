package d26;

/* loaded from: classes16.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.l implements yz5.l {
    public q(java.lang.Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "simpleType";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(kotlin.jvm.internal.n.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        i16.l1 p07 = (i16.l1) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return ((b26.j1) this.receiver).d(p07, true);
    }
}
