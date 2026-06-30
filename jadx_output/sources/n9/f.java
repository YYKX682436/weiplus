package n9;

/* loaded from: classes15.dex */
public final class f implements i9.d {

    /* renamed from: d, reason: collision with root package name */
    public final n9.c f335771d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f335772e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f335773f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f335774g;

    public f(n9.c cVar, java.util.Map map, java.util.Map map2) {
        this.f335771d = cVar;
        this.f335774g = map2;
        this.f335773f = map != null ? java.util.Collections.unmodifiableMap(map) : java.util.Collections.emptyMap();
        cVar.getClass();
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int i17 = 0;
        cVar.b(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i17] = ((java.lang.Long) it.next()).longValue();
            i17++;
        }
        this.f335772e = jArr;
    }

    @Override // i9.d
    public long a(int i17) {
        return this.f335772e[i17];
    }

    @Override // i9.d
    public int h() {
        return this.f335772e.length;
    }

    @Override // i9.d
    public int i(long j17) {
        long[] jArr = this.f335772e;
        int b17 = t9.d0.b(jArr, j17, false, false);
        if (b17 < jArr.length) {
            return b17;
        }
        return -1;
    }

    @Override // i9.d
    public java.util.List j(long j17) {
        int i17;
        int i18;
        n9.c cVar = this.f335771d;
        cVar.getClass();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        cVar.e(j17, false, cVar.f335747g, treeMap);
        cVar.d(this.f335773f, treeMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            n9.d dVar = (n9.d) this.f335774g.get(entry.getKey());
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) entry.getValue();
            int length = spannableStringBuilder.length();
            int i19 = 0;
            for (int i27 = 0; i27 < length; i27++) {
                if (spannableStringBuilder.charAt(i27) == ' ') {
                    int i28 = i27 + 1;
                    int i29 = i28;
                    while (i29 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i29) == ' ') {
                        i29++;
                    }
                    int i37 = i29 - i28;
                    if (i37 > 0) {
                        spannableStringBuilder.delete(i27, i27 + i37);
                        length -= i37;
                    }
                }
            }
            if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
                length--;
            }
            int i38 = 0;
            while (true) {
                i17 = length - 1;
                if (i38 >= i17) {
                    break;
                }
                if (spannableStringBuilder.charAt(i38) == '\n') {
                    int i39 = i38 + 1;
                    if (spannableStringBuilder.charAt(i39) == ' ') {
                        spannableStringBuilder.delete(i39, i38 + 2);
                        length = i17;
                    }
                }
                i38++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i17) == ' ') {
                spannableStringBuilder.delete(i17, length);
                length = i17;
            }
            while (true) {
                i18 = length - 1;
                if (i19 >= i18) {
                    break;
                }
                if (spannableStringBuilder.charAt(i19) == ' ') {
                    int i47 = i19 + 1;
                    if (spannableStringBuilder.charAt(i47) == '\n') {
                        spannableStringBuilder.delete(i19, i47);
                        length = i18;
                    }
                }
                i19++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i18) == '\n') {
                spannableStringBuilder.delete(i18, length);
            }
            arrayList.add(new i9.a(spannableStringBuilder, null, dVar.f335754c, dVar.f335755d, dVar.f335756e, dVar.f335753b, Integer.MIN_VALUE, dVar.f335757f));
        }
        return arrayList;
    }
}
