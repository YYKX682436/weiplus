package h16;

/* loaded from: classes15.dex */
public class n implements g16.o0 {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f278245j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f278246k;

    /* renamed from: a, reason: collision with root package name */
    public int[] f278247a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f278248b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f278249c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f278250d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String[] f278251e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f278252f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f278253g = null;

    /* renamed from: h, reason: collision with root package name */
    public h16.b f278254h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String[] f278255i = null;

    static {
        try {
            f278245j = "true".equals(java.lang.System.getProperty("kotlin.ignore.old.metadata"));
        } catch (java.security.AccessControlException unused) {
            f278245j = false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        f278246k = hashMap;
        hashMap.put(n16.b.l(new n16.c("kotlin.jvm.internal.KotlinClass")), h16.b.f278222h);
        hashMap.put(n16.b.l(new n16.c("kotlin.jvm.internal.KotlinFileFacade")), h16.b.f278223i);
        hashMap.put(n16.b.l(new n16.c("kotlin.jvm.internal.KotlinMultifileClass")), h16.b.f278225n);
        hashMap.put(n16.b.l(new n16.c("kotlin.jvm.internal.KotlinMultifileClassPart")), h16.b.f278226o);
        hashMap.put(n16.b.l(new n16.c("kotlin.jvm.internal.KotlinSyntheticClass")), h16.b.f278224m);
    }

    public static /* synthetic */ void c(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = ya.b.SOURCE;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // g16.o0
    public void a() {
    }

    @Override // g16.o0
    public g16.m0 b(n16.b bVar, o06.x1 x1Var) {
        h16.b bVar2;
        if (bVar == null) {
            c(0);
            throw null;
        }
        if (x1Var == null) {
            c(1);
            throw null;
        }
        n16.c b17 = bVar.b();
        if (b17.equals(x06.p0.f451284a)) {
            return new h16.h(this, null);
        }
        if (b17.equals(x06.p0.f451298o)) {
            return new h16.j(this, null);
        }
        if (f278245j || this.f278254h != null || (bVar2 = (h16.b) ((java.util.HashMap) f278246k).get(bVar)) == null) {
            return null;
        }
        this.f278254h = bVar2;
        return new h16.m(this, null);
    }
}
