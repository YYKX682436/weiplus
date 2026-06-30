package d26;

/* loaded from: classes16.dex */
public final class i0 implements d26.b0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f226002j = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(d26.i0.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(d26.i0.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f226003a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f226004b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f226005c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.v f226006d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.v f226007e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.w f226008f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.x f226009g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.x f226010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d26.l0 f226011i;

    public i0(d26.l0 l0Var, java.util.List functionList, java.util.List propertyList, java.util.List typeAliasList) {
        kotlin.jvm.internal.o.g(functionList, "functionList");
        kotlin.jvm.internal.o.g(propertyList, "propertyList");
        kotlin.jvm.internal.o.g(typeAliasList, "typeAliasList");
        this.f226011i = l0Var;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : functionList) {
            n16.g b17 = b26.t0.b(l0Var.f226021b.f17516b, ((i16.j0) ((p16.h0) obj)).f287529i);
            java.lang.Object obj2 = linkedHashMap.get(b17);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(b17, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        this.f226003a = c(linkedHashMap);
        d26.l0 l0Var2 = this.f226011i;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Object obj3 : propertyList) {
            n16.g b18 = b26.t0.b(l0Var2.f226021b.f17516b, ((i16.u0) ((p16.h0) obj3)).f287765i);
            java.lang.Object obj4 = linkedHashMap2.get(b18);
            if (obj4 == null) {
                obj4 = new java.util.ArrayList();
                linkedHashMap2.put(b18, obj4);
            }
            ((java.util.List) obj4).add(obj3);
        }
        this.f226004b = c(linkedHashMap2);
        this.f226011i.f226021b.f17515a.f17485c.getClass();
        d26.l0 l0Var3 = this.f226011i;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.lang.Object obj5 : typeAliasList) {
            n16.g b19 = b26.t0.b(l0Var3.f226021b.f17516b, ((i16.o1) ((p16.h0) obj5)).f287675h);
            java.lang.Object obj6 = linkedHashMap3.get(b19);
            if (obj6 == null) {
                obj6 = new java.util.ArrayList();
                linkedHashMap3.put(b19, obj6);
            }
            ((java.util.List) obj6).add(obj5);
        }
        this.f226005c = c(linkedHashMap3);
        this.f226006d = ((e26.u) this.f226011i.f226021b.f17515a.f17483a).c(new d26.e0(this));
        this.f226007e = ((e26.u) this.f226011i.f226021b.f17515a.f17483a).c(new d26.f0(this));
        this.f226008f = ((e26.u) this.f226011i.f226021b.f17515a.f17483a).d(new d26.g0(this));
        d26.l0 l0Var4 = this.f226011i;
        this.f226009g = ((e26.u) l0Var4.f226021b.f17515a.f17483a).b(new d26.d0(this, l0Var4));
        d26.l0 l0Var5 = this.f226011i;
        this.f226010h = ((e26.u) l0Var5.f226021b.f17515a.f17483a).b(new d26.h0(this, l0Var5));
    }

    public java.util.Collection a(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return !((java.util.Set) e26.b0.a(this.f226009g, this, f226002j[0])).contains(name) ? kz5.p0.f313996d : (java.util.Collection) ((e26.r) this.f226006d).invoke(name);
    }

    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return !((java.util.Set) e26.b0.a(this.f226010h, this, f226002j[1])).contains(name) ? kz5.p0.f313996d : (java.util.Collection) ((e26.r) this.f226007e).invoke(name);
    }

    public final java.util.Map c(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.lang.Iterable<p16.c> iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            for (p16.c cVar : iterable) {
                int serializedSize = cVar.getSerializedSize();
                int f17 = p16.j.f(serializedSize) + serializedSize;
                if (f17 > 4096) {
                    f17 = 4096;
                }
                p16.j j17 = p16.j.j(byteArrayOutputStream, f17);
                j17.v(serializedSize);
                cVar.a(j17);
                j17.i();
                arrayList.add(jz5.f0.f302826a);
            }
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }
}
