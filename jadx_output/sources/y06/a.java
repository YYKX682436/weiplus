package y06;

/* loaded from: classes15.dex */
public class a implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y06.b f458660d;

    public a(y06.b bVar) {
        this.f458660d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.d dVar = (o06.d) obj;
        if (dVar == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
        }
        this.f458660d.f458661a.a(dVar);
        return jz5.f0.f302826a;
    }
}
