package n06;

/* loaded from: classes16.dex */
public final class d0 extends b26.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e26.c0 storageManager, g16.k0 finder, o06.v0 moduleDescriptor, o06.c1 notFoundClasses, q06.b additionalClassPartsProvider, q06.f platformDependentDeclarationFilter, b26.s deserializationConfiguration, g26.u kotlinTypeChecker, x16.a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(finder, "finder");
        kotlin.jvm.internal.o.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.o.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.o.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        kotlin.jvm.internal.o.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.o.g(deserializationConfiguration, "deserializationConfiguration");
        kotlin.jvm.internal.o.g(kotlinTypeChecker, "kotlinTypeChecker");
        kotlin.jvm.internal.o.g(samConversionResolver, "samConversionResolver");
        b26.u uVar = new b26.u(this);
        c26.a aVar = c26.a.f38081q;
        b26.e eVar = new b26.e(moduleDescriptor, notFoundClasses, aVar);
        b26.i0 i0Var = b26.i0.f17447a;
        b26.c0 c0Var = b26.c0.f17422a;
        w06.b bVar = w06.b.f441945a;
        b26.d0 d0Var = b26.d0.f17424a;
        java.util.List i17 = kz5.c0.i(new m06.a(storageManager, moduleDescriptor), new n06.i(storageManager, moduleDescriptor, null, 4, null));
        int i18 = b26.p.f17479a;
        this.f17415d = new b26.q(storageManager, moduleDescriptor, deserializationConfiguration, uVar, eVar, this, i0Var, c0Var, bVar, d0Var, i17, notFoundClasses, b26.o.f17475a, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f919a, kotlinTypeChecker, samConversionResolver, null, b26.g0.f17440a, 262144, null);
    }

    @Override // b26.b
    public b26.v d(n16.c fqName) {
        java.io.InputStream a17;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        t06.h hVar = (t06.h) this.f17413b;
        hVar.getClass();
        if (fqName.h(l06.x.f314955j)) {
            a17 = hVar.f414539b.a(c26.a.f38081q.a(fqName));
        } else {
            a17 = null;
        }
        if (a17 != null) {
            return c26.e.f38083s.a(fqName, this.f17412a, this.f17414c, a17, false);
        }
        return null;
    }
}
