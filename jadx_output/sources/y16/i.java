package y16;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final y16.h f458943c = new y16.h(null);

    /* renamed from: d, reason: collision with root package name */
    public static int f458944d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f458945e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f458946f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f458947g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f458948h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f458949i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f458950j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f458951k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f458952l;

    /* renamed from: m, reason: collision with root package name */
    public static final y16.i f458953m;

    /* renamed from: n, reason: collision with root package name */
    public static final y16.i f458954n;

    /* renamed from: o, reason: collision with root package name */
    public static final y16.i f458955o;

    /* renamed from: p, reason: collision with root package name */
    public static final y16.i f458956p;

    /* renamed from: q, reason: collision with root package name */
    public static final y16.i f458957q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.List f458958r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f458959s;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f458960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f458961b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        y16.g gVar;
        y16.g gVar2;
        int i17 = f458944d;
        int i18 = i17 << 1;
        f458945e = i17;
        int i19 = i18 << 1;
        f458946f = i18;
        int i27 = i19 << 1;
        f458947g = i19;
        int i28 = i27 << 1;
        f458948h = i27;
        int i29 = i28 << 1;
        f458949i = i28;
        int i37 = i29 << 1;
        f458950j = i29;
        f458944d = i37 << 1;
        int i38 = i37 - 1;
        f458951k = i38;
        int i39 = i17 | i18 | i19;
        f458952l = i39;
        int i47 = 2;
        f458953m = new y16.i(i38, null, i47, 0 == true ? 1 : 0);
        f458954n = new y16.i(i28 | i29, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i17, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i18, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i19, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        f458955o = new y16.i(i39, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i27, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        f458956p = new y16.i(i28, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        f458957q = new y16.i(i29, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i18 | i28 | i29, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        java.lang.reflect.Field[] fields = y16.i.class.getFields();
        kotlin.jvm.internal.o.f(fields, "getFields(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) it.next();
            java.lang.Object obj = field2.get(null);
            y16.i iVar = obj instanceof y16.i ? (y16.i) obj : null;
            if (iVar != null) {
                java.lang.String name = field2.getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                gVar2 = new y16.g(iVar.f458961b, name);
            } else {
                gVar2 = null;
            }
            if (gVar2 != null) {
                arrayList2.add(gVar2);
            }
        }
        f458958r = arrayList2;
        java.lang.reflect.Field[] fields2 = y16.i.class.getFields();
        kotlin.jvm.internal.o.f(fields2, "getFields(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Field field3 : fields2) {
            if (java.lang.reflect.Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (kotlin.jvm.internal.o.b(((java.lang.reflect.Field) next).getType(), java.lang.Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            java.lang.reflect.Field field4 = (java.lang.reflect.Field) it7.next();
            java.lang.Object obj2 = field4.get(null);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj2).intValue();
            if ((intValue == ((-intValue) & intValue)) == true) {
                java.lang.String name2 = field4.getName();
                kotlin.jvm.internal.o.f(name2, "getName(...)");
                gVar = new y16.g(intValue, name2);
            } else {
                gVar = null;
            }
            if (gVar != null) {
                arrayList5.add(gVar);
            }
        }
        f458959s = arrayList5;
    }

    public i(int i17, java.util.List excludes) {
        kotlin.jvm.internal.o.g(excludes, "excludes");
        this.f458960a = excludes;
        java.util.Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i17 &= ~((y16.f) it.next()).a();
        }
        this.f458961b = i17;
    }

    public final boolean a(int i17) {
        return (i17 & this.f458961b) != 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(y16.i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        y16.i iVar = (y16.i) obj;
        return kotlin.jvm.internal.o.b(this.f458960a, iVar.f458960a) && this.f458961b == iVar.f458961b;
    }

    public int hashCode() {
        return (this.f458960a.hashCode() * 31) + this.f458961b;
    }

    public java.lang.String toString() {
        java.lang.Object obj;
        java.util.Iterator it = f458958r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y16.g) obj).f458938a == this.f458961b) {
                break;
            }
        }
        y16.g gVar = (y16.g) obj;
        java.lang.String str = gVar != null ? gVar.f458939b : null;
        if (str == null) {
            java.util.List<y16.g> list = f458959s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (y16.g gVar2 : list) {
                java.lang.String str2 = a(gVar2.f458938a) ? gVar2.f458939b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = kz5.n0.g0(arrayList, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG, null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f458960a + ')';
    }

    public /* synthetic */ i(int i17, java.util.List list, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? kz5.p0.f313996d : list);
    }
}
