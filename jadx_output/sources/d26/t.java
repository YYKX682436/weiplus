package d26;

/* loaded from: classes16.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.l implements yz5.l {
    public t(java.lang.Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(d26.h.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g26.l p07 = (g26.l) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return new d26.h((d26.x) this.receiver, p07);
    }
}
