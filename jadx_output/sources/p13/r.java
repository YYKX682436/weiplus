package p13;

/* loaded from: classes12.dex */
public class r {

    /* renamed from: f, reason: collision with root package name */
    public static final p13.n f351128f = new p13.m();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f351129a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f351130b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f351131c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f351132d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f351133e = new java.util.ArrayList();

    public static p13.r b(java.lang.String str, boolean z17) {
        return c(str, z17, f351128f);
    }

    public static p13.r c(java.lang.String str, boolean z17, p13.n nVar) {
        char c17;
        boolean z18;
        int i17 = 0;
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_global_search_enable_more_split_char, true)) {
            p13.r rVar = new p13.r();
            rVar.f351129a = str != null ? str : "";
            java.lang.String trim = o13.s.c(str.toLowerCase()).replaceAll("['*\":&\\-.]", " ").trim();
            rVar.f351130b = trim;
            rVar.f351131c = nVar.b(trim);
            rVar.f351132d = nVar.a(rVar.f351130b, 2);
            java.lang.String[] strArr = rVar.f351131c;
            int length = strArr.length;
            while (i17 < length) {
                ((java.util.ArrayList) rVar.f351133e).add(e(strArr[i17], z17));
                i17++;
            }
            return rVar;
        }
        p13.r rVar2 = new p13.r();
        java.lang.String str2 = str == null ? "" : str;
        rVar2.f351129a = str2;
        if (str2.equals("")) {
            rVar2.f351130b = "";
            rVar2.f351131c = new java.lang.String[0];
            rVar2.f351132d = new java.lang.String[0];
            return rVar2;
        }
        boolean matches = rVar2.f351129a.matches("^['\\*\":&\\\\\\-\\.;；,，、 ]+$");
        java.util.List list = rVar2.f351133e;
        if (matches) {
            java.lang.String trim2 = rVar2.f351129a.trim();
            rVar2.f351130b = trim2;
            rVar2.f351131c = nVar.b(trim2);
            rVar2.f351132d = nVar.a(rVar2.f351130b, 2);
            java.lang.String[] strArr2 = rVar2.f351131c;
            int length2 = strArr2.length;
            while (i17 < length2) {
                ((java.util.ArrayList) list).add(e(strArr2[i17], z17));
                i17++;
            }
            return rVar2;
        }
        java.lang.String str3 = rVar2.f351129a;
        int i18 = 0;
        while (true) {
            c17 = ' ';
            if (i18 >= str3.length()) {
                z18 = false;
                break;
            }
            if (str3.charAt(i18) == ' ') {
                z18 = true;
                break;
            }
            i18++;
        }
        if (!z18) {
            java.lang.String trim3 = o13.s.c(str.toLowerCase()).replaceAll("['*\":&\\-.;；,，、]", " ").trim();
            rVar2.f351130b = trim3;
            java.lang.String[] b17 = nVar.b(trim3);
            rVar2.f351131c = b17;
            rVar2.f351132d = new java.lang.String[0];
            int length3 = b17.length;
            while (i17 < length3) {
                ((java.util.ArrayList) list).add(e(b17[i17], z17));
                i17++;
            }
            return rVar2;
        }
        if (!java.util.regex.Pattern.compile("['\\*\":&\\\\\\-\\.;；,，、]").matcher(rVar2.f351129a).find()) {
            java.lang.String trim4 = rVar2.f351129a.trim();
            rVar2.f351130b = trim4;
            rVar2.f351131c = nVar.b(trim4);
            rVar2.f351132d = nVar.a(rVar2.f351130b, 2);
            java.lang.String[] strArr3 = rVar2.f351131c;
            int length4 = strArr3.length;
            while (i17 < length4) {
                ((java.util.ArrayList) list).add(e(strArr3[i17], z17));
                i17++;
            }
            return rVar2;
        }
        java.lang.String str4 = rVar2.f351129a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str4.length());
        int i19 = 0;
        char c18 = 0;
        while (i19 < str4.length()) {
            if (str4.charAt(i19) == c17) {
                if (c18 != 1) {
                    sb6.append(c17);
                    c18 = 1;
                }
            } else if ("'*\":&\\-.;；,，、".indexOf(str4.charAt(i19)) == -1) {
                sb6.append(str4.charAt(i19));
                c18 = 0;
            } else if (c18 != 2) {
                sb6.append(',');
                c18 = 2;
            }
            i19++;
            c17 = ' ';
        }
        java.lang.String sb7 = sb6.toString();
        int i27 = 0;
        while (true) {
            if (i27 >= sb7.length()) {
                i27 = 0;
                break;
            }
            if ("'*\":&\\-.;；,，、 ".indexOf(sb7.charAt(i27)) != -1) {
                break;
            }
            i27++;
        }
        if ("'*\":&\\-.;；,，、 ".indexOf(sb7.charAt(i27 + 1)) != -1) {
            java.lang.String trim5 = o13.s.c(str.toLowerCase()).replaceAll("['*\":&\\-.;；,，、]", " ").trim();
            rVar2.f351130b = trim5;
            java.lang.String[] b18 = nVar.b(trim5);
            rVar2.f351131c = b18;
            rVar2.f351132d = new java.lang.String[0];
            int length5 = b18.length;
            while (i17 < length5) {
                ((java.util.ArrayList) list).add(e(b18[i17], z17));
                i17++;
            }
            return rVar2;
        }
        java.lang.String trim6 = o13.s.c(str.toLowerCase()).replaceAll("['*\":&\\-.;；,，、]", " ").trim();
        rVar2.f351130b = trim6;
        rVar2.f351131c = nVar.b(trim6);
        rVar2.f351132d = nVar.a(rVar2.f351129a, 2);
        java.lang.String[] strArr4 = rVar2.f351131c;
        int length6 = strArr4.length;
        while (i17 < length6) {
            ((java.util.ArrayList) list).add(e(strArr4[i17], z17));
            i17++;
        }
        return rVar2;
    }

    public static p13.r d(java.util.List list) {
        p13.r rVar = new p13.r();
        rVar.f351129a = "";
        rVar.f351130b = "";
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String[] split = ((java.lang.String) it.next()).split(",");
            p13.p pVar = new p13.p();
            for (java.lang.String str : split) {
                p13.o oVar = new p13.o();
                oVar.f351120a = p13.q.OTHER;
                oVar.f351121b = str;
                ((java.util.ArrayList) pVar.f351123a).add(oVar);
            }
            ((java.util.ArrayList) rVar.f351133e).add(pVar);
        }
        return rVar;
    }

    public static p13.p e(java.lang.String str, boolean z17) {
        boolean z18;
        q13.a aVar;
        if (z17) {
            for (int i17 = 0; i17 < str.length(); i17++) {
                if (!o13.s.b(str.charAt(i17))) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = z17;
        p13.p pVar = new p13.p();
        p13.q qVar = p13.q.OTHER;
        java.util.List list = pVar.f351123a;
        if (z18) {
            q13.b bVar = o13.s.f342264j;
            bVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            char[] charArray = str.toLowerCase().toCharArray();
            int i18 = 0;
            while (true) {
                if (i18 >= charArray.length) {
                    break;
                }
                char c17 = charArray[i18];
                if (bVar.f359684b.f359685a[c17 - 'a'] == null) {
                    arrayList.clear();
                    break;
                }
                arrayList.add(java.lang.String.valueOf(c17));
                i18++;
            }
            if (arrayList.size() > 0) {
                p13.o oVar = new p13.o();
                oVar.f351120a = p13.q.ShortPY;
                oVar.f351121b = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, "\u200b");
                oVar.f351122c = arrayList;
                ((java.util.ArrayList) list).add(oVar);
            }
            q13.b bVar2 = o13.s.f342264j;
            bVar2.getClass();
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            arrayDeque.offer(new q13.a(0, 0, null));
            char[] charArray2 = str.toLowerCase().toCharArray();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (!arrayDeque.isEmpty() && (aVar = (q13.a) arrayDeque.poll()) != null) {
                int i19 = aVar.f359679b;
                q13.c cVar = bVar2.f359684b;
                for (int i27 = i19; i27 < charArray2.length; i27++) {
                    cVar = cVar.f359685a[charArray2[i27] - 'a'];
                    if (cVar == null) {
                        break;
                    }
                    if (cVar.f359686b || i27 == charArray2.length - 1) {
                        if (aVar.f359681d == null) {
                            aVar.f359681d = new java.util.ArrayList();
                        }
                        int i28 = i27 + 1;
                        q13.a aVar2 = new q13.a(i19, i28, aVar);
                        ((java.util.ArrayList) aVar.f359681d).add(aVar2);
                        if (i28 == charArray2.length) {
                            aVar2.f359682e = true;
                        }
                        arrayDeque.offer(aVar2);
                    }
                }
                if (aVar.f359682e) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (aVar != null) {
                        int i29 = aVar.f359679b;
                        int i37 = aVar.f359678a;
                        if (i29 > i37) {
                            arrayList3.add(str.substring(i37, i29));
                        }
                        aVar = aVar.f359680c;
                    }
                    java.util.Collections.reverse(arrayList3);
                    arrayList2.add(arrayList3);
                }
            }
            if (arrayList2.size() > 0) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.util.List list2 = (java.util.List) it.next();
                    if (list2.size() > 0) {
                        p13.o oVar2 = new p13.o();
                        oVar2.f351120a = p13.q.FullPY;
                        oVar2.f351121b = com.tencent.mm.sdk.platformtools.t8.c1(list2, "\u200b");
                        oVar2.f351122c = list2;
                        ((java.util.ArrayList) list).add(oVar2);
                    }
                }
            }
            p13.o oVar3 = new p13.o();
            oVar3.f351120a = qVar;
            oVar3.f351121b = str;
            ((java.util.ArrayList) list).add(oVar3);
        } else {
            p13.o oVar4 = new p13.o();
            oVar4.f351120a = qVar;
            oVar4.f351121b = str;
            ((java.util.ArrayList) list).add(oVar4);
        }
        return pVar;
    }

    public boolean a() {
        return com.tencent.mm.sdk.platformtools.t8.K0(this.f351129a.trim()) || com.tencent.mm.sdk.platformtools.t8.K0(this.f351130b.trim());
    }

    public java.lang.String f() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i17 = 0;
        while (true) {
            java.util.List list = this.f351133e;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return stringBuffer.toString();
            }
            stringBuffer.append("(");
            stringBuffer.append(((p13.p) ((java.util.ArrayList) list).get(i17)).a());
            stringBuffer.append(")");
            if (i17 != ((java.util.ArrayList) list).size() - 1) {
                stringBuffer.append(" AND ");
            }
            i17++;
        }
    }
}
