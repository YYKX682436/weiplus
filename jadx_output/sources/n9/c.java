package n9;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f335741a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f335742b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f335743c;

    /* renamed from: d, reason: collision with root package name */
    public final long f335744d;

    /* renamed from: e, reason: collision with root package name */
    public final long f335745e;

    /* renamed from: f, reason: collision with root package name */
    public final n9.e f335746f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f335747g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String[] f335748h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f335749i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f335750j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f335751k;

    public c(java.lang.String str, java.lang.String str2, long j17, long j18, n9.e eVar, java.lang.String[] strArr, java.lang.String str3) {
        this.f335741a = str;
        this.f335742b = str2;
        this.f335746f = eVar;
        this.f335748h = strArr;
        this.f335743c = str2 != null;
        this.f335744d = j17;
        this.f335745e = j18;
        str3.getClass();
        this.f335747g = str3;
        this.f335749i = new java.util.HashMap();
        this.f335750j = new java.util.HashMap();
    }

    public static n9.c a(java.lang.String str) {
        return new n9.c(null, str.replaceAll(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    public static android.text.SpannableStringBuilder c(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new android.text.SpannableStringBuilder());
        }
        return (android.text.SpannableStringBuilder) map.get(str);
    }

    public final void b(java.util.TreeSet treeSet, boolean z17) {
        boolean equals = "p".equals(this.f335741a);
        if (z17 || equals) {
            long j17 = this.f335744d;
            if (j17 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j17));
            }
            long j18 = this.f335745e;
            if (j18 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j18));
            }
        }
        if (this.f335751k == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f335751k).size(); i17++) {
            ((n9.c) ((java.util.ArrayList) this.f335751k).get(i17)).b(treeSet, z17 || equals);
        }
    }

    public final void d(java.util.Map map, java.util.Map map2) {
        for (java.util.Map.Entry entry : this.f335750j.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.HashMap hashMap = this.f335749i;
            int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : 0;
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) map2.get(str);
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            if (intValue != intValue2) {
                n9.e eVar = this.f335746f;
                java.lang.String[] strArr = this.f335748h;
                if (eVar == null && strArr == null) {
                    eVar = null;
                } else if (eVar == null && strArr.length == 1) {
                    eVar = (n9.e) map.get(strArr[0]);
                } else if (eVar == null && strArr.length > 1) {
                    eVar = new n9.e();
                    for (java.lang.String str2 : strArr) {
                        eVar.a((n9.e) map.get(str2));
                    }
                } else if (eVar != null && strArr != null && strArr.length == 1) {
                    eVar.a((n9.e) map.get(strArr[0]));
                } else if (eVar != null && strArr != null && strArr.length > 1) {
                    for (java.lang.String str3 : strArr) {
                        eVar.a((n9.e) map.get(str3));
                    }
                }
                if (eVar != null) {
                    int i17 = eVar.f335765h;
                    if (((i17 == -1 && eVar.f335766i == -1) ? -1 : (i17 == 1 ? (char) 1 : (char) 0) | (eVar.f335766i == 1 ? (char) 2 : (char) 0)) != -1) {
                        int i18 = eVar.f335765h;
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan((i18 == -1 && eVar.f335766i == -1) ? -1 : (i18 == 1 ? 1 : 0) | (eVar.f335766i == 1 ? 2 : 0)), intValue, intValue2, 33);
                    }
                    if (eVar.f335763f == 1) {
                        spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), intValue, intValue2, 33);
                    }
                    if (eVar.f335764g == 1) {
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), intValue, intValue2, 33);
                    }
                    if (eVar.f335760c) {
                        if (!eVar.f335760c) {
                            throw new java.lang.IllegalStateException("Font color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(eVar.f335759b), intValue, intValue2, 33);
                    }
                    if (eVar.f335762e) {
                        if (!eVar.f335762e) {
                            throw new java.lang.IllegalStateException("Background color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(eVar.f335761d), intValue, intValue2, 33);
                    }
                    if (eVar.f335758a != null) {
                        spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(eVar.f335758a), intValue, intValue2, 33);
                    }
                    if (eVar.f335770m != null) {
                        spannableStringBuilder.setSpan(new android.text.style.AlignmentSpan.Standard(eVar.f335770m), intValue, intValue2, 33);
                    }
                    int i19 = eVar.f335767j;
                    if (i19 == 1) {
                        spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) eVar.f335768k, true), intValue, intValue2, 33);
                    } else if (i19 == 2) {
                        spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(eVar.f335768k), intValue, intValue2, 33);
                    } else if (i19 == 3) {
                        spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(eVar.f335768k / 100.0f), intValue, intValue2, 33);
                    }
                }
            }
            int i27 = 0;
            while (true) {
                java.util.List list = this.f335751k;
                if (i27 < (list == null ? 0 : ((java.util.ArrayList) list).size())) {
                    java.util.List list2 = this.f335751k;
                    if (list2 == null) {
                        throw new java.lang.IndexOutOfBoundsException();
                    }
                    ((n9.c) ((java.util.ArrayList) list2).get(i27)).d(map, map2);
                    i27++;
                }
            }
        }
    }

    public final void e(long j17, boolean z17, java.lang.String str, java.util.Map map) {
        java.util.HashMap hashMap = this.f335749i;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f335750j;
        hashMap2.clear();
        java.lang.String str2 = this.f335747g;
        java.lang.String str3 = "".equals(str2) ? str : str2;
        if (this.f335743c && z17) {
            c(str3, map).append((java.lang.CharSequence) this.f335742b);
            return;
        }
        java.lang.String str4 = this.f335741a;
        if ("br".equals(str4) && z17) {
            c(str3, map).append('\n');
            return;
        }
        if ("metadata".equals(str4)) {
            return;
        }
        long j18 = this.f335744d;
        long j19 = this.f335745e;
        if (!((j18 == -9223372036854775807L && j19 == -9223372036854775807L) || (j18 <= j17 && j19 == -9223372036854775807L) || ((j18 == -9223372036854775807L && j17 < j19) || (j18 <= j17 && j17 < j19)))) {
            return;
        }
        boolean equals = "p".equals(str4);
        for (java.util.Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), java.lang.Integer.valueOf(((android.text.SpannableStringBuilder) entry.getValue()).length()));
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f335751k;
            if (i17 >= (list == null ? 0 : ((java.util.ArrayList) list).size())) {
                if (equals) {
                    android.text.SpannableStringBuilder c17 = c(str3, map);
                    int length = c17.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (c17.charAt(length) == ' ');
                    if (length >= 0 && c17.charAt(length) != '\n') {
                        c17.append('\n');
                    }
                }
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    hashMap2.put(entry2.getKey(), java.lang.Integer.valueOf(((android.text.SpannableStringBuilder) entry2.getValue()).length()));
                }
                return;
            }
            java.util.List list2 = this.f335751k;
            if (list2 == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            ((n9.c) ((java.util.ArrayList) list2).get(i17)).e(j17, z17 || equals, str3, map);
            i17++;
        }
    }
}
