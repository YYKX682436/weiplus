package n06;

/* loaded from: classes15.dex */
public final class i implements q06.c {

    /* renamed from: g, reason: collision with root package name */
    public static final n16.g f333983g;

    /* renamed from: h, reason: collision with root package name */
    public static final n16.b f333984h;

    /* renamed from: a, reason: collision with root package name */
    public final o06.v0 f333985a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f333986b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f333987c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f333981e = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(n06.i.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d, reason: collision with root package name */
    public static final n06.g f333980d = new n06.g(null);

    /* renamed from: f, reason: collision with root package name */
    public static final n16.c f333982f = l06.x.f314956k;

    static {
        n16.e eVar = l06.w.f314922d;
        n16.g g17 = eVar.g();
        kotlin.jvm.internal.o.f(g17, "shortName(...)");
        f333983g = g17;
        f333984h = n16.b.l(eVar.h());
    }

    public i(e26.c0 storageManager, o06.v0 moduleDescriptor, yz5.l computeContainingDeclaration, int i17, kotlin.jvm.internal.i iVar) {
        computeContainingDeclaration = (i17 & 4) != 0 ? n06.f.f333977d : computeContainingDeclaration;
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.o.g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f333985a = moduleDescriptor;
        this.f333986b = computeContainingDeclaration;
        this.f333987c = ((e26.u) storageManager).b(new n06.h(this, storageManager));
    }

    @Override // q06.c
    public boolean a(n16.c packageFqName, n16.g name) {
        kotlin.jvm.internal.o.g(packageFqName, "packageFqName");
        kotlin.jvm.internal.o.g(name, "name");
        return kotlin.jvm.internal.o.b(name, f333983g) && kotlin.jvm.internal.o.b(packageFqName, f333982f);
    }

    @Override // q06.c
    public java.util.Collection b(n16.c packageFqName) {
        kotlin.jvm.internal.o.g(packageFqName, "packageFqName");
        return kotlin.jvm.internal.o.b(packageFqName, f333982f) ? kz5.o1.c((r06.t) e26.b0.a(this.f333987c, this, f333981e[0])) : kz5.r0.f314002d;
    }

    @Override // q06.c
    public o06.g c(n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        if (kotlin.jvm.internal.o.b(classId, f333984h)) {
            return (r06.t) e26.b0.a(this.f333987c, this, f333981e[0]);
        }
        return null;
    }
}
