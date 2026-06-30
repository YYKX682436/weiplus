package j2;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final j2.a f297211a = new j2.a();

    public final java.lang.Object a(h2.d localeList) {
        kotlin.jvm.internal.o.g(localeList, "localeList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(localeList, 10));
        java.util.Iterator it = localeList.iterator();
        while (it.hasNext()) {
            h2.b bVar = (h2.b) it.next();
            kotlin.jvm.internal.o.g(bVar, "<this>");
            arrayList.add(((h2.a) bVar.f278257a).f278256a);
        }
        java.lang.Object[] array = arrayList.toArray(new java.util.Locale[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) array;
        return new android.text.style.LocaleSpan(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(i2.f textPaint, h2.d localeList) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        kotlin.jvm.internal.o.g(localeList, "localeList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(localeList, 10));
        java.util.Iterator it = localeList.iterator();
        while (it.hasNext()) {
            h2.b bVar = (h2.b) it.next();
            kotlin.jvm.internal.o.g(bVar, "<this>");
            arrayList.add(((h2.a) bVar.f278257a).f278256a);
        }
        java.lang.Object[] array = arrayList.toArray(new java.util.Locale[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) array;
        textPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
    }
}
