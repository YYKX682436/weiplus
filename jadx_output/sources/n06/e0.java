package n06;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n06.e0 f333969a = new n06.e0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f333970b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f333971c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f333972d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f333973e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f333974f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f333975g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f333976h;

    static {
        g16.a1 a1Var = g16.a1.f267591a;
        f333970b = kz5.q1.j(a1Var.d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        java.util.List<w16.e> i17 = kz5.c0.i(w16.e.BOOLEAN, w16.e.CHAR);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (w16.e eVar : i17) {
            java.lang.String h17 = eVar.j().f().h();
            kotlin.jvm.internal.o.f(h17, "asString(...)");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = eVar.f442267e;
            if (str == null) {
                w16.e.a(11);
                throw null;
            }
            sb6.append(str);
            sb6.append("Value()");
            sb6.append(eVar.h());
            kz5.h0.u(linkedHashSet, a1Var.c(h17, sb6.toString()));
        }
        f333971c = kz5.q1.i(kz5.q1.i(kz5.q1.i(kz5.q1.i(kz5.q1.i(kz5.q1.i(linkedHashSet, a1Var.d("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), a1Var.c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), a1Var.c("Double", "isInfinite()Z", "isNaN()Z")), a1Var.c("Float", "isInfinite()Z", "isNaN()Z")), a1Var.c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), a1Var.c("CharSequence", "isEmpty()Z"));
        f333972d = a1Var.d("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f333973e = kz5.q1.i(kz5.q1.i(kz5.q1.i(kz5.q1.i(kz5.q1.i(kz5.q1.i(a1Var.c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), a1Var.d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), a1Var.c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), a1Var.c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), a1Var.d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), a1Var.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), a1Var.d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f333974f = kz5.q1.i(kz5.q1.i(a1Var.d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), a1Var.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), a1Var.d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        w16.e eVar2 = w16.e.BOOLEAN;
        w16.e eVar3 = w16.e.BYTE;
        java.util.List i18 = kz5.c0.i(eVar2, eVar3, w16.e.DOUBLE, w16.e.FLOAT, eVar3, w16.e.INT, w16.e.LONG, w16.e.SHORT);
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        java.util.Iterator it = i18.iterator();
        while (it.hasNext()) {
            java.lang.String h18 = ((w16.e) it.next()).j().f().h();
            kotlin.jvm.internal.o.f(h18, "asString(...)");
            java.lang.String[] a17 = a1Var.a("Ljava/lang/String;");
            kz5.h0.u(linkedHashSet2, a1Var.c(h18, (java.lang.String[]) java.util.Arrays.copyOf(a17, a17.length)));
        }
        java.lang.String[] a18 = a1Var.a("D");
        java.util.Set i19 = kz5.q1.i(linkedHashSet2, a1Var.c("Float", (java.lang.String[]) java.util.Arrays.copyOf(a18, a18.length)));
        java.lang.String[] a19 = a1Var.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f333975g = kz5.q1.i(i19, a1Var.c("String", (java.lang.String[]) java.util.Arrays.copyOf(a19, a19.length)));
        java.lang.String[] a27 = a1Var.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f333976h = a1Var.c("Throwable", (java.lang.String[]) java.util.Arrays.copyOf(a27, a27.length));
    }

    public final boolean a(n16.e fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        if (kotlin.jvm.internal.o.b(fqName, l06.w.f314927h)) {
            return true;
        }
        return ((java.util.HashMap) l06.w.f314923d0).get(fqName) != null;
    }
}
