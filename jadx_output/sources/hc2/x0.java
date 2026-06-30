package hc2;

/* loaded from: classes10.dex */
public abstract class x0 {

    /* renamed from: a */
    public static final java.util.ArrayList f280346a;

    /* renamed from: b */
    public static final jz5.g f280347b;

    static {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderTopicInputStopTokenList");
        if (!(d17 instanceof java.lang.String)) {
            d17 = null;
        }
        java.lang.String str = d17;
        if (str == null || kotlin.jvm.internal.o.b(str, "")) {
            list = kz5.c0.i("\\s", "\\n", "#", "@", "\\t");
        } else {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"_"}, false, 0, 6, null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj)) {
                    arrayList2.add(obj);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderConfig", "endchars: " + arrayList2);
            list = arrayList2;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new r26.t((java.lang.String) it.next()));
        }
        f280346a = arrayList;
        f280347b = jz5.h.b(hc2.w0.f280343d);
    }

    public static final java.lang.String a(java.lang.String str, java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        if (r26.n0.B(str, "?", false)) {
            java.lang.String format = java.lang.String.format(str + '&' + key + '=' + value, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        java.lang.String format2 = java.lang.String.format(str + '?' + key + '=' + value, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        return format2;
    }

    public static final boolean b(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        java.lang.CharSequence subSequence = str.subSequence(i17, i18);
        r26.t tVar = com.tencent.mm.plugin.finder.assist.j1.f102274a;
        q26.l lVar = new q26.l((q26.m) r26.t.c(com.tencent.mm.plugin.finder.assist.j1.f102274a, subSequence, 0, 2, null));
        while (lVar.hasNext()) {
            java.lang.String c17 = ((r26.q) ((r26.m) lVar.next())).c();
            int O = r26.n0.O(c17, '.', 0, false, 6, null);
            if (O != -1) {
                str2 = c17.substring(O);
                kotlin.jvm.internal.o.f(str2, "substring(...)");
            } else {
                str2 = "";
            }
            if (((java.util.Set) ((jz5.n) f280347b).getValue()).contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static final int c(java.lang.String str, int i17) {
        r26.t tVar = com.tencent.mm.plugin.finder.assist.j1.f102274a;
        java.util.Iterator it = com.tencent.mm.plugin.finder.assist.j1.f102275b.iterator();
        int i18 = -1;
        while (it.hasNext()) {
            r26.m b17 = ((r26.t) it.next()).b(str, i17);
            if (b17 != null && (i18 < 0 || ((r26.q) b17).b().h().intValue() < i18)) {
                i18 = ((r26.q) b17).b().h().intValue();
            }
        }
        return i18;
    }

    public static final java.lang.String d(java.lang.String str, int i17, boolean z17, java.lang.String reddotTitle) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(reddotTitle, "reddotTitle");
        java.lang.String a17 = a(a(str, "from_page", java.lang.String.valueOf(i17)), "is_reddot", z17 ? "1" : "0");
        if (reddotTitle.length() > 0) {
            a17 = a(a17, "reddot_title", reddotTitle);
        }
        com.tencent.mars.xlog.Log.i("FinderSettingInfoUI", "formatUrlWithCreatorInfo, url: ".concat(a17));
        return a17;
    }

    public static /* synthetic */ java.lang.String e(java.lang.String str, int i17, boolean z17, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        if ((i18 & 4) != 0) {
            str2 = "";
        }
        return d(str, i17, z17, str2);
    }

    public static final java.lang.String f(java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[一-龥]");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        int length = str.length();
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (i18 < length) {
            int i28 = i18 + 1;
            java.lang.String substring = str.substring(i18, i28);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            if (compile.matcher(substring).matches()) {
                i27++;
            } else {
                i19++;
            }
            if ((i27 * 2) + i19 > i17 * 2) {
                java.lang.String substring2 = str.substring(0, i18);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                return substring2.concat("…");
            }
            i18 = i28;
        }
        return str;
    }

    public static final jz5.l g(java.lang.String str, boolean z17, yz5.q qVar) {
        int K;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (str == null || str.length() == 0) {
            return new jz5.l(arrayList, arrayList2);
        }
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        int i17 = 0;
        while (i17 < str.length() && (K = r26.n0.K(str, '@', i17, false, 4, null)) != -1 && K < str.length() - 1) {
            int i18 = K + 1;
            i17 = c(str, i18);
            if (i17 == -1) {
                i17 = str.length();
            }
            if (!z17 || !b(str, K, i17)) {
                if (i17 - K > 1) {
                    java.lang.String substring = str.substring(i18, i17);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    linkedList.add(substring);
                    if (qVar != null) {
                        qVar.invoke(java.lang.Integer.valueOf(K), java.lang.Integer.valueOf(i17), substring);
                    }
                    arrayList2.add(new com.tencent.mm.plugin.finder.assist.m0(K, i17, substring, null, 8, null));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FinderStringExt", "after split @ :%s", linkedList);
        if (linkedList.size() <= 0) {
            return new jz5.l(arrayList, arrayList2);
        }
        if (linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.w("FinderStringExt", "list is null or size 0");
            return new jz5.l(arrayList, arrayList2);
        }
        int i19 = 0;
        for (java.lang.String str2 : linkedList) {
            r45.gb4 gb4Var = new r45.gb4();
            gb4Var.set(0, "");
            gb4Var.set(1, "");
            gb4Var.set(2, str2);
            gb4Var.set(3, null);
            gb4Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            gb4Var.set(5, 5);
            gb4Var.set(6, java.lang.Integer.valueOf(i19));
            arrayList.add(gb4Var);
            i19++;
        }
        return new jz5.l(arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        if (r7 < 0) goto L240;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List h(java.lang.String r18, java.util.ArrayList r19, yz5.p r20) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.x0.h(java.lang.String, java.util.ArrayList, yz5.p):java.util.List");
    }

    public static final jz5.l i(java.lang.String str, java.util.HashMap atContactMap, boolean z17, yz5.q qVar) {
        int i17;
        int K;
        kotlin.jvm.internal.o.g(atContactMap, "atContactMap");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (str == null || str.length() == 0) {
            return new jz5.l(arrayList, arrayList2);
        }
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        int i18 = 0;
        while (i18 < str.length() && (K = r26.n0.K(str, '@', i18, false, 4, null)) != -1 && K < str.length() - 1) {
            int i19 = K + 1;
            i18 = c(str, i19);
            if (i18 == -1) {
                i18 = str.length();
            }
            if (!z17 || !b(str, K, i18)) {
                if (i18 - K > 1) {
                    java.lang.String substring = str.substring(i19, i18);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    linkedList.add(substring);
                    if (qVar != null) {
                        qVar.invoke(java.lang.Integer.valueOf(K), java.lang.Integer.valueOf(i18), substring);
                    }
                    arrayList2.add(new com.tencent.mm.plugin.finder.assist.m0(K, i18, substring, null, 8, null));
                }
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127668e1;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != 1000 && arrayList2.size() >= ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue()) {
                    break;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FinderStringExt", "after split @ :%s", linkedList);
        if (linkedList.size() <= 0) {
            return new jz5.l(arrayList, arrayList2);
        }
        if (linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.w("FinderStringExt", "list is null or size 0");
            return new jz5.l(arrayList, arrayList2);
        }
        int i27 = 0;
        for (java.lang.String str2 : linkedList) {
            if (atContactMap.containsKey(str2)) {
                r45.gb4 gb4Var = (r45.gb4) atContactMap.get(str2);
                if (gb4Var != null) {
                    r45.gb4 gb4Var2 = new r45.gb4();
                    gb4Var2.set(0, gb4Var.getString(0));
                    gb4Var2.set(1, gb4Var.getString(1));
                    gb4Var2.set(2, gb4Var.getString(2));
                    gb4Var2.set(3, (com.tencent.mm.protocal.protobuf.FinderAuthInfo) gb4Var.getCustom(3));
                    gb4Var2.set(4, java.lang.Long.valueOf(gb4Var.getLong(4)));
                    gb4Var2.set(5, java.lang.Integer.valueOf(gb4Var.getInteger(5)));
                    gb4Var2.set(7, java.lang.Integer.valueOf(gb4Var.getInteger(7)));
                    i17 = i27 + 1;
                    gb4Var2.set(6, java.lang.Integer.valueOf(i27));
                    arrayList.add(gb4Var2);
                }
            } else {
                r45.gb4 gb4Var3 = new r45.gb4();
                gb4Var3.set(0, "");
                gb4Var3.set(1, "");
                gb4Var3.set(2, str2);
                gb4Var3.set(3, null);
                gb4Var3.set(4, java.lang.Long.valueOf(c01.id.a()));
                gb4Var3.set(5, 5);
                i17 = i27 + 1;
                gb4Var3.set(6, java.lang.Integer.valueOf(i27));
                arrayList.add(gb4Var3);
            }
            i27 = i17;
        }
        return new jz5.l(arrayList, arrayList2);
    }

    public static final java.lang.CharSequence j(java.lang.CharSequence charSequence, android.content.Context context, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        int color = context.getResources().getColor(i19);
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        if (i17 >= 0) {
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, i18, color);
            e17.setBounds(0, 0, i27, i28);
            al5.w wVar = new al5.w(e17, i38);
            wVar.f6079d = i29;
            wVar.f6080e = i37;
            spannableString.setSpan(wVar, i17, i17 + 1, 33);
        }
        return spannableString;
    }

    public static java.lang.CharSequence k(java.lang.CharSequence charSequence, android.content.Context context, char c17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.lang.Object obj) {
        int i39 = (i38 & 64) != 0 ? 0 : i28;
        int i47 = (i38 & 128) != 0 ? 0 : i29;
        int i48 = (i38 & 256) != 0 ? 1 : i37;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        return j(charSequence, context, r26.n0.K(charSequence, c17, 0, false, 6, null), i17, i18, i19, i27, i39, i47, i48);
    }

    public static java.lang.CharSequence l(java.lang.CharSequence charSequence, android.content.Context context, char c17, android.graphics.drawable.Drawable drawable, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj) {
        int i37 = (i29 & 32) != 0 ? 0 : i19;
        int i38 = (i29 & 64) != 0 ? 0 : i27;
        int i39 = (i29 & 128) != 0 ? 1 : i28;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(drawable, "drawable");
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        int K = r26.n0.K(spannableString, c17, 0, false, 6, null);
        int color = context.getResources().getColor(i17);
        if (K >= 0) {
            com.tencent.mm.ui.uk.f(drawable, color);
            drawable.setBounds(0, 0, i18, i18);
            al5.w wVar = new al5.w(drawable, i39);
            wVar.f6079d = i37;
            wVar.f6080e = i38;
            spannableString.setSpan(wVar, K, K + 1, 33);
        }
        return spannableString;
    }
}
