package qu2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final qu2.h f366782d = new qu2.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List dataStream = (java.util.List) obj;
        kotlin.jvm.internal.o.g(dataStream, "dataStream");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.Iterator it = dataStream.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            float f17 = ((qu2.g) next).f366781a;
            do {
                java.lang.Object next2 = it.next();
                float f18 = ((qu2.g) next2).f366781a;
                if (java.lang.Float.compare(f17, f18) < 0) {
                    next = next2;
                    f17 = f18;
                }
            } while (it.hasNext());
        }
        objArr[0] = java.lang.Float.valueOf(((qu2.g) next).f366781a);
        java.lang.String format = java.lang.String.format("%.0f", java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        jSONObject.put("pssMax", format);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(dataStream, 10));
        java.util.Iterator it6 = dataStream.iterator();
        while (it6.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(((qu2.g) it6.next()).f366781a));
        }
        objArr2[0] = java.lang.Double.valueOf(kz5.n0.K(arrayList));
        java.lang.String format2 = java.lang.String.format("%.0f", java.util.Arrays.copyOf(objArr2, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        jSONObject.put("pssAverage", format2);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(dataStream, 10));
        java.util.Iterator it7 = dataStream.iterator();
        while (it7.hasNext()) {
            arrayList2.add(java.lang.Float.valueOf(((qu2.g) it7.next()).f366781a));
        }
        java.util.List D0 = kz5.n0.D0(arrayList2);
        int size = dataStream.size() / 2;
        objArr3[0] = (size < 0 || size > kz5.c0.h(D0)) ? java.lang.Double.valueOf(0.0d) : D0.get(size);
        java.lang.String format3 = java.lang.String.format("%.0f", java.util.Arrays.copyOf(objArr3, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        jSONObject.put("pssMedian", format3);
        return jSONObject;
    }
}
