package u06;

/* loaded from: classes16.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final u06.s f423528d = new u06.s();

    public s() {
        super(1);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(u06.d0.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.reflect.Field p07 = (java.lang.reflect.Field) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return new u06.d0(p07);
    }
}
