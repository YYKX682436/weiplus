package u06;

/* loaded from: classes16.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final u06.p f423525d = new u06.p();

    public p() {
        super(1);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.a(java.lang.reflect.Member.class);
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.reflect.Member p07 = (java.lang.reflect.Member) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        return java.lang.Boolean.valueOf(p07.isSynthetic());
    }
}
