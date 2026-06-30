package g26;

/* loaded from: classes16.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.l implements yz5.l {
    public i(java.lang.Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(g26.j.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        i26.i p07 = (i26.i) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return ((g26.j) this.receiver).a(p07);
    }
}
