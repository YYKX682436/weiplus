package g06;

/* loaded from: classes15.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.z {

    /* renamed from: e, reason: collision with root package name */
    public static final g06.d f267497e = new g06.d();

    @Override // f06.u
    public java.lang.Object get(java.lang.Object obj) {
        f06.d dVar = (f06.d) obj;
        kotlin.jvm.internal.o.g(dVar, "<this>");
        java.util.List a17 = dVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            f06.e i17 = ((i06.w3) ((f06.w) it.next())).i();
            f06.d dVar2 = i17 instanceof f06.d ? (f06.d) i17 : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public java.lang.String getName() {
        return "superclasses";
    }

    @Override // kotlin.jvm.internal.e
    public f06.f getOwner() {
        return kotlin.jvm.internal.i0.b(g06.f.class, "kotlin-reflection");
    }

    @Override // kotlin.jvm.internal.e
    public java.lang.String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}
