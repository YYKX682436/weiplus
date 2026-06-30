package df5;

/* loaded from: classes11.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f232072a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.e0 f232073b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f232074c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f232075d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f232076e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f232077f;

    public d1(android.content.Context context, v11.e0 renderConfig) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(renderConfig, "renderConfig");
        this.f232072a = context;
        this.f232073b = renderConfig;
        this.f232075d = jz5.h.b(new df5.b1(this));
        this.f232076e = jz5.h.b(new df5.a1(this));
        this.f232077f = jz5.h.b(new df5.c1(this));
    }

    public static void d(df5.d1 d1Var, android.text.SpannableStringBuilder spannableStringBuilder, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        d1Var.getClass();
        if (i17 <= 0) {
            return;
        }
        spannableStringBuilder.append("\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append("\u200b\n");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(1, false), length, length2, 33);
        spannableStringBuilder.setSpan(new df5.x0(i17, d1Var.f232073b.f432364c.f432394a.f432420e, z17 ? ((java.lang.Number) ((jz5.n) d1Var.f232077f).getValue()).intValue() : 0), length, length2, 33);
    }

    public final void a(android.text.SpannableStringBuilder spannableStringBuilder, v11.r rVar) {
        java.util.LinkedHashMap linkedHashMap;
        java.util.ArrayList arrayList;
        java.util.LinkedHashMap linkedHashMap2;
        v11.e0 e0Var;
        int i17;
        java.util.LinkedHashMap linkedHashMap3;
        int i18;
        java.util.ArrayList arrayList2;
        v11.e0 e0Var2;
        if (rVar instanceof v11.p) {
            spannableStringBuilder.append(g(((v11.p) rVar).f432453a, null));
            return;
        }
        if (!(rVar instanceof v11.n)) {
            if (rVar instanceof v11.j) {
                b(spannableStringBuilder, (v11.j) rVar, 1);
                return;
            }
            return;
        }
        java.util.List list = ((v11.n) rVar).f432444a;
        v11.e0 e0Var3 = this.f232073b;
        int i19 = e0Var3.f432367f.f432347b;
        jz5.g gVar = this.f232075d;
        int measureText = (int) ((android.text.TextPaint) ((jz5.n) gVar).getValue()).measureText("0.");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        int i27 = -1;
        while (it.hasNext()) {
            int i28 = ((v11.i) it.next()).f432401c;
            if (i28 != i27) {
                java.util.Set keySet = linkedHashMap4.keySet();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj : keySet) {
                    if (((java.lang.Number) obj).intValue() > i28) {
                        arrayList4.add(obj);
                    }
                }
                java.util.Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    int intValue = ((java.lang.Number) it6.next()).intValue();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                    java.lang.Integer num = (java.lang.Integer) linkedHashMap4.get(java.lang.Integer.valueOf(intValue));
                    linkedHashMap4.put(valueOf, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            if (!linkedHashMap4.containsKey(java.lang.Integer.valueOf(i28))) {
                linkedHashMap4.put(java.lang.Integer.valueOf(i28), 0);
            }
            java.lang.Object obj2 = linkedHashMap4.get(java.lang.Integer.valueOf(i28));
            kotlin.jvm.internal.o.d(obj2);
            arrayList3.add(new df5.s0(i28, ((java.lang.Number) obj2).intValue()));
            i27 = i28;
        }
        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
        int size = list.size();
        for (int i29 = 0; i29 < size; i29++) {
            df5.s0 s0Var = (df5.s0) arrayList3.get(i29);
            v11.i iVar = (v11.i) list.get(i29);
            int measureText2 = iVar.f432400b ? (int) ((android.text.TextPaint) ((jz5.n) gVar).getValue()).measureText(iVar.f432399a) : 0;
            java.lang.Integer num2 = (java.lang.Integer) linkedHashMap5.get(s0Var);
            linkedHashMap5.put(s0Var, java.lang.Integer.valueOf(java.lang.Math.max(num2 != null ? num2.intValue() : measureText, measureText2)));
        }
        java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
        int i37 = 0;
        for (java.lang.Object obj3 : list) {
            int i38 = i37 + 1;
            if (i37 < 0) {
                kz5.c0.p();
                throw null;
            }
            v11.i iVar2 = (v11.i) obj3;
            java.lang.Integer num3 = (java.lang.Integer) linkedHashMap5.get(arrayList3.get(i37));
            int intValue2 = num3 != null ? num3.intValue() : measureText;
            linkedHashMap6.put(java.lang.Integer.valueOf(iVar2.f432401c), java.lang.Integer.valueOf(intValue2));
            int i39 = 0;
            for (int i47 = 0; i47 < iVar2.f432401c; i47++) {
                java.lang.Integer num4 = (java.lang.Integer) linkedHashMap6.get(java.lang.Integer.valueOf(i47));
                i39 += (num4 != null ? num4.intValue() : measureText) + i19;
            }
            int i48 = intValue2 + i39 + i19;
            int length = spannableStringBuilder.length();
            java.util.Iterator it7 = iVar2.f432402d.iterator();
            while (it7.hasNext()) {
                c(spannableStringBuilder, (v11.a) it7.next(), e0Var3.f432368g);
            }
            int length2 = spannableStringBuilder.length();
            if (length < length2) {
                java.lang.String str = iVar2.f432399a;
                linkedHashMap = linkedHashMap6;
                v11.c0 c0Var = e0Var3.f432367f;
                arrayList = arrayList3;
                linkedHashMap2 = linkedHashMap5;
                i17 = i19;
                e0Var = e0Var3;
                spannableStringBuilder.setSpan(new df5.w0(str, c0Var.f432346a, i39, i48, c0Var.f432347b, iVar2.f432400b, measureText), length, length2, 33);
                e(spannableStringBuilder, length, length2, iVar2.f432403e);
            } else {
                linkedHashMap = linkedHashMap6;
                arrayList = arrayList3;
                linkedHashMap2 = linkedHashMap5;
                e0Var = e0Var3;
                i17 = i19;
            }
            if (i37 < kz5.c0.h(list)) {
                e0Var2 = e0Var;
                linkedHashMap3 = linkedHashMap;
                arrayList2 = arrayList;
                i18 = measureText;
                d(this, spannableStringBuilder, e0Var2.f432364c.f432397d, false, 4, null);
            } else {
                linkedHashMap3 = linkedHashMap;
                i18 = measureText;
                arrayList2 = arrayList;
                e0Var2 = e0Var;
            }
            e0Var3 = e0Var2;
            linkedHashMap6 = linkedHashMap3;
            arrayList3 = arrayList2;
            measureText = i18;
            i37 = i38;
            linkedHashMap5 = linkedHashMap2;
            i19 = i17;
        }
    }

    public final void b(android.text.SpannableStringBuilder spannableStringBuilder, v11.j jVar, int i17) {
        if (jVar.f432414a.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        java.util.List list = jVar.f432414a;
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            v11.e0 e0Var = this.f232073b;
            if (!hasNext) {
                int length2 = spannableStringBuilder.length();
                if (length < length2) {
                    v11.u uVar = e0Var.f432371j;
                    if (i17 <= uVar.f432472d) {
                        spannableStringBuilder.setSpan(new df5.t0(uVar.f432469a, uVar.f432470b, uVar.f432471c, 1), length, length2, 33);
                        e(spannableStringBuilder, length, length2, jVar.f432415b);
                        return;
                    }
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            v11.r rVar = (v11.r) next;
            if (rVar instanceof v11.j) {
                b(spannableStringBuilder, (v11.j) rVar, i17 + 1);
            } else {
                a(spannableStringBuilder, rVar);
            }
            if (i18 < kz5.c0.h(list)) {
                d(this, spannableStringBuilder, e0Var.f432364c.f432397d, false, 4, null);
            }
            i18 = i19;
        }
    }

    public final void c(android.text.SpannableStringBuilder spannableStringBuilder, v11.a aVar, v11.b0 b0Var) {
        java.util.regex.Matcher matcher;
        java.lang.Object obj;
        boolean z17 = aVar.f432323f;
        v11.s sVar = aVar.f432325h;
        java.lang.String str = aVar.f432318a;
        if (z17) {
            int i17 = b0Var.f432343k;
            boolean z18 = spannableStringBuilder.length() == 0;
            int i18 = b0Var.f432342j;
            int i19 = z18 ? i18 : i17 + i18;
            int i27 = i17 + i18;
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append("\u2060");
            spannableStringBuilder.setSpan(new df5.r0(i19), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append("\u2060");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) str);
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append("\u2060");
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append("\u2060");
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new df5.r0(i27), length4, length5, 33);
            if (length2 == length3) {
                return;
            }
            java.lang.Object value = ((jz5.n) this.f232076e).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            spannableStringBuilder.setSpan(new df5.v0(b0Var.f432337e, b0Var.f432339g, b0Var.f432345m, (android.graphics.Paint.FontMetricsInt) value), length, length5, 33);
            e(spannableStringBuilder, length2, length3, sVar);
            return;
        }
        int length6 = spannableStringBuilder.length();
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        spannableStringBuilder.append(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f232072a, str));
        int length7 = spannableStringBuilder.length();
        if (length6 == length7) {
            return;
        }
        boolean z19 = aVar.f432319b;
        java.lang.String str2 = aVar.f432322e;
        boolean z27 = z19 || (str2 != null && b0Var.f432335c);
        v11.e0 e0Var = this.f232073b;
        if (z27) {
            e0Var.f432365d.getClass();
            spannableStringBuilder.setSpan(new df5.u0(0.8f), length6, length7, 33);
        }
        if (aVar.f432320c) {
            int i28 = 0;
            while (i28 < str.length()) {
                if (i(str.charAt(i28))) {
                    i28++;
                } else {
                    int i29 = i28;
                    while (i29 < str.length() && !i(str.charAt(i29))) {
                        i29++;
                    }
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i28 + length6, length6 + i29, 33);
                    i28 = i29;
                }
            }
        }
        if (aVar.f432321d) {
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), length6, length7, 33);
        }
        if (aVar.f432324g && b0Var.f432338f) {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan("monospace"), length6, length7, 33);
        }
        if (str2 != null) {
            r35.m3 m3Var = new r35.m3(str2, 1, null);
            m3Var.f369202k = b0Var.f432333a;
            m3Var.f369203l = b0Var.f432334b;
            com.tencent.mm.pluginsdk.ui.span.z0 z0Var = new com.tencent.mm.pluginsdk.ui.span.z0(1, m3Var);
            z0Var.setSpanClickCallback(new df5.y0(this));
            spannableStringBuilder.setSpan(z0Var, length6, length7, 33);
        } else {
            if (str.length() > 500) {
                java.util.regex.Pattern pattern = com.tencent.mm.pluginsdk.ui.span.b0.f191178m;
                java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                matcher = pattern.matcher(lowerCase);
            } else {
                java.util.regex.Pattern pattern2 = com.tencent.mm.pluginsdk.ui.span.b0.f191177l;
                java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
                matcher = pattern2.matcher(lowerCase2);
            }
            while (matcher.find()) {
                int end = matcher.end();
                if (end < str.length()) {
                    char charAt = str.charAt(end);
                    obj = 'a' <= charAt && charAt < '{' ? null : null;
                }
                int start = matcher.start() + length6;
                int i37 = length6 + end;
                java.lang.String substring = str.substring(matcher.start(), end);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                r35.m3 m3Var2 = new r35.m3(substring, 1, obj);
                m3Var2.f369202k = b0Var.f432333a;
                m3Var2.f369203l = b0Var.f432334b;
                if (b0Var.f432335c) {
                    e0Var.f432365d.getClass();
                    spannableStringBuilder.setSpan(new df5.u0(0.8f), start, i37, 33);
                }
                com.tencent.mm.pluginsdk.ui.span.z0 z0Var2 = new com.tencent.mm.pluginsdk.ui.span.z0(1, m3Var2);
                z0Var2.setSpanClickCallback(new df5.z0(this));
                spannableStringBuilder.setSpan(z0Var2, start, i37, 33);
            }
        }
        e(spannableStringBuilder, length6, length7, sVar);
    }

    public final void e(android.text.SpannableStringBuilder spannableStringBuilder, int i17, int i18, v11.s sVar) {
        if (i17 < i18 && sVar != null) {
            spannableStringBuilder.setSpan(new jf5.k(sVar), i17, i18, 33);
        }
    }

    public final java.lang.CharSequence f(java.util.List runs, int i17, v11.s sVar) {
        v11.e0 e0Var;
        float f17;
        kotlin.jvm.internal.o.g(runs, "runs");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        java.util.Iterator it = runs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e0Var = this.f232073b;
            if (!hasNext) {
                break;
            }
            c(spannableStringBuilder, (v11.a) it.next(), e0Var.f432368g);
        }
        int length2 = spannableStringBuilder.length();
        if (length < length2) {
            v11.z zVar = e0Var.f432366e;
            if (zVar.f432497g) {
                java.lang.Float f18 = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? zVar.f432496f.f432328c : zVar.f432495e.f432328c : zVar.f432494d.f432328c : zVar.f432493c.f432328c : zVar.f432492b.f432328c : zVar.f432491a.f432328c;
                if (f18 != null) {
                    f17 = f18.floatValue();
                } else {
                    e0Var.f432365d.getClass();
                    f17 = 0.8f;
                }
                spannableStringBuilder.setSpan(new df5.u0(f17), length, length2, 33);
            }
            v11.z zVar2 = e0Var.f432366e;
            spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(a06.d.b(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? zVar2.f432496f.f432326a : zVar2.f432495e.f432326a : zVar2.f432494d.f432326a : zVar2.f432493c.f432326a : zVar2.f432492b.f432326a : zVar2.f432491a.f432326a), true), length, length2, 33);
            e(spannableStringBuilder, length, length2, sVar);
        }
        return spannableStringBuilder;
    }

    public final java.lang.CharSequence g(java.util.List runs, v11.b0 b0Var) {
        kotlin.jvm.internal.o.g(runs, "runs");
        if (b0Var == null) {
            b0Var = this.f232073b.f432368g;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.Iterator it = runs.iterator();
        while (it.hasNext()) {
            c(spannableStringBuilder, (v11.a) it.next(), b0Var);
        }
        return spannableStringBuilder;
    }

    public final java.lang.CharSequence h(java.util.List blocks) {
        kotlin.jvm.internal.o.g(blocks, "blocks");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : blocks) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            a(spannableStringBuilder, (v11.r) obj);
            if (i17 < kz5.c0.h(blocks)) {
                d(this, spannableStringBuilder, this.f232073b.f432364c.f432398e, false, 4, null);
            }
            i17 = i18;
        }
        return spannableStringBuilder;
    }

    public final boolean i(char c17) {
        if (11904 <= c17 && c17 < 12288) {
            return true;
        }
        if (12288 <= c17 && c17 < 12352) {
            return true;
        }
        if (12352 <= c17 && c17 < 12544) {
            return true;
        }
        if (12544 <= c17 && c17 < 12592) {
            return true;
        }
        if (12704 <= c17 && c17 < 12800) {
            return true;
        }
        if (12800 <= c17 && c17 < 13312) {
            return true;
        }
        if (13312 <= c17 && c17 < 19904) {
            return true;
        }
        if (19968 <= c17 && c17 < 40960) {
            return true;
        }
        if (63744 <= c17 && c17 < 64256) {
            return true;
        }
        return 65281 <= c17 && c17 < 65377;
    }
}
