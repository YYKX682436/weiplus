package h06;

/* loaded from: classes16.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final h06.d f277940d = new h06.d();

    public d() {
        super(2);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(b26.s0.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        b26.s0 p07 = (b26.s0) obj;
        i16.j0 p17 = (i16.j0) obj2;
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        return p07.e(p17);
    }
}
