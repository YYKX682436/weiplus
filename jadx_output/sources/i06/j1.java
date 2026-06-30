package i06;

/* loaded from: classes15.dex */
public final /* synthetic */ class j1 extends kotlin.jvm.internal.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final i06.j1 f286666d = new i06.j1();

    public j1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(b26.s0.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        b26.s0 p07 = (b26.s0) obj;
        i16.u0 p17 = (i16.u0) obj2;
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        return p07.f(p17);
    }
}
