package u06;

/* loaded from: classes16.dex */
public final class n extends u06.k implements e16.e {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f423519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(n16.g gVar, java.lang.Object[] values) {
        super(gVar, null);
        kotlin.jvm.internal.o.g(values, "values");
        this.f423519b = values;
    }

    public java.util.List a() {
        java.lang.Object[] objArr = this.f423519b;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            kotlin.jvm.internal.o.d(obj);
            arrayList.add(u06.i.e(obj.getClass()) ? new u06.c0(null, (java.lang.Enum) obj) : obj instanceof java.lang.annotation.Annotation ? new u06.l(null, (java.lang.annotation.Annotation) obj) : obj instanceof java.lang.Object[] ? new u06.n(null, (java.lang.Object[]) obj) : obj instanceof java.lang.Class ? new u06.y(null, (java.lang.Class) obj) : new u06.e0(null, obj));
        }
        return arrayList;
    }
}
