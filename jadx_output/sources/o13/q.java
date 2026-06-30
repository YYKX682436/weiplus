package o13;

/* loaded from: classes12.dex */
public abstract class q {
    public static int a(java.util.List list, java.util.List list2) {
        boolean z17;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            boolean z18 = true;
            if (i17 >= (list.size() - list2.size()) + 1) {
                return -1;
            }
            while (i18 < list2.size()) {
                java.util.List list3 = (java.util.List) list.get(i17 + i18);
                java.lang.String str = (java.lang.String) list2.get(i18);
                if (!list3.contains(str)) {
                    if (i18 == list2.size() - 1) {
                        java.util.Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z17 = false;
                                break;
                            }
                            if (((java.lang.String) it.next()).startsWith(str)) {
                                z17 = true;
                                break;
                            }
                        }
                        if (z17) {
                        }
                    }
                    i18 = 0;
                    z18 = false;
                    break;
                }
                i18++;
            }
            if (z18) {
                return i17;
            }
            i17++;
        }
    }

    public static java.util.List b(java.lang.String str, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
            if (o13.s.a(charAt)) {
                java.lang.String[] strArr = (java.lang.String[]) o13.s.f342266l.get(java.lang.String.valueOf(charAt));
                if (strArr == null || strArr.length <= 0 || strArr[0].length() <= 0) {
                    arrayList.add(arrayList2);
                } else {
                    int length = strArr.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        java.lang.String str2 = strArr[i18];
                        if (z17) {
                            str2 = str2.substring(0, 1);
                        }
                        if (!arrayList2.contains(str2)) {
                            arrayList2.add(str2);
                        }
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    public static android.text.Spannable c(android.content.Context context, java.lang.CharSequence charSequence, java.lang.String str) {
        p13.j e17 = e(p13.i.a(charSequence, str, false, false));
        java.lang.CharSequence charSequence2 = e17.f351105a;
        return charSequence2 instanceof android.text.Spannable ? (android.text.Spannable) charSequence2 : new android.text.SpannableString(e17.f351105a);
    }

    public static final p13.j d(java.lang.String str, java.lang.String str2, p13.i iVar) {
        p13.j e17 = e(iVar);
        e17.f351105a = android.text.TextUtils.concat(str, e17.f351105a, str2);
        return e17;
    }

    public static final p13.j e(p13.i iVar) {
        p13.j jVar = new p13.j();
        android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.concat(iVar.f351101i, iVar.f351093a, iVar.f351102j));
        jVar.f351106b = -1;
        jVar.f351105a = spannableString;
        if (!((com.tencent.mm.sdk.platformtools.t8.J0(iVar.f351093a) || iVar.f351094b == null) ? false : true)) {
            return jVar;
        }
        java.lang.String charSequence = iVar.f351093a.toString();
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.util.HashMap hashMap = o13.n.f342241a;
        java.lang.String c17 = o13.s.c(charSequence.toLowerCase());
        java.util.List arrayList = new java.util.ArrayList();
        if (iVar.f351095c) {
            arrayList = b(c17, iVar.f351096d);
        }
        if (((java.util.ArrayList) iVar.f351094b.f351133e).size() == 1 || f(spannableString, iVar)) {
            p13.h hVar = new p13.h();
            if (((java.util.ArrayList) iVar.f351094b.f351133e).size() == 1) {
                hVar.f351090d = (p13.p) ((java.util.ArrayList) iVar.f351094b.f351133e).get(0);
                if (iVar.f351095c) {
                    j(arrayList, hVar, iVar);
                } else {
                    i(c17, hVar, iVar);
                }
                if (!hVar.h()) {
                    return jVar;
                }
                try {
                    return k(spannableString, hVar, iVar);
                } catch (java.lang.Exception unused) {
                    jVar.f351105a = spannableString;
                    return jVar;
                }
            }
            hVar.f351090d = (p13.p) ((java.util.ArrayList) iVar.f351094b.f351133e).get(0);
            if (iVar.f351095c) {
                j(arrayList, hVar, iVar);
            } else {
                i(c17, hVar, iVar);
            }
            if (hVar.h()) {
                try {
                    jVar = k(spannableString, hVar, iVar);
                } catch (java.lang.Exception unused2) {
                    jVar.f351105a = spannableString;
                }
            }
            java.lang.String charSequence2 = jVar.f351105a.toString();
            java.util.List arrayList2 = new java.util.ArrayList();
            if (iVar.f351095c) {
                arrayList2 = b(charSequence2, iVar.f351096d);
            }
            for (int i17 = 1; i17 < ((java.util.ArrayList) iVar.f351094b.f351133e).size(); i17++) {
                hVar.f351090d = (p13.p) ((java.util.ArrayList) iVar.f351094b.f351133e).get(i17);
                if (iVar.f351095c) {
                    j(arrayList2, hVar, iVar);
                } else {
                    i(charSequence2, hVar, iVar);
                }
                if (hVar.h()) {
                    try {
                        jVar = k((android.text.Spannable) jVar.f351105a, hVar, iVar);
                    } catch (java.lang.Exception unused3) {
                        jVar.f351105a = spannableString;
                    }
                }
            }
            return jVar;
        }
        p13.h hVar2 = new p13.h();
        p13.p pVar = new p13.p();
        hVar2.f351090d = pVar;
        p13.o oVar = new p13.o();
        oVar.f351120a = p13.q.OTHER;
        oVar.f351121b = iVar.f351094b.f351130b;
        ((java.util.ArrayList) pVar.f351123a).add(oVar);
        if (iVar.f351095c) {
            j(arrayList, hVar2, iVar);
        } else {
            i(c17, hVar2, iVar);
        }
        if (hVar2.h()) {
            try {
                return k(spannableString, hVar2, iVar);
            } catch (java.lang.Exception unused4) {
                jVar.f351105a = spannableString;
                return jVar;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) iVar.f351094b.f351133e).iterator();
        while (it.hasNext()) {
            p13.p pVar2 = (p13.p) it.next();
            p13.h hVar3 = new p13.h();
            hVar3.f351090d = pVar2;
            arrayList3.add(hVar3);
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            p13.h hVar4 = (p13.h) it6.next();
            if (iVar.f351095c) {
                j(arrayList, hVar4, iVar);
            } else {
                i(c17, hVar4, iVar);
            }
        }
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            p13.h hVar5 = (p13.h) it7.next();
            if (hVar5.h()) {
                p13.j k17 = k(spannableString, hVar5, iVar);
                if (k17.f351106b == 0) {
                    jVar = k17;
                }
            }
        }
        return jVar;
    }

    public static boolean f(android.text.Spannable spannable, p13.i iVar) {
        android.text.TextPaint textPaint;
        float f17 = iVar.f351099g;
        return f17 > 0.0f && (textPaint = iVar.f351100h) != null && f17 - (textPaint.getTextSize() * 2.0f) < iVar.f351100h.measureText(spannable.toString());
    }

    public static java.lang.CharSequence g(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        return android.text.Html.fromHtml(str.replaceAll("<em class=\"highlight\">", "<font color=\"" + java.lang.String.format("#%06X", java.lang.Integer.valueOf(i17 & 16777215)) + "\">").replaceAll("</em>", "</font>"));
    }

    public static p13.j h(android.text.Spannable spannable, p13.h hVar, p13.i iVar) {
        p13.j jVar = new p13.j();
        p13.g gVar = iVar.f351097e;
        if (gVar == p13.g.CustomTag) {
            java.lang.String obj = spannable.toString();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(obj.substring(0, hVar.f351091e));
            stringBuffer.append(iVar.f351103k);
            stringBuffer.append(obj.substring(hVar.f351091e, hVar.f351092f));
            stringBuffer.append(iVar.f351104l);
            if (hVar.f351092f < obj.length()) {
                stringBuffer.append(obj.substring(hVar.f351092f, obj.length()));
            }
            jVar.f351105a = stringBuffer.toString();
            jVar.f351106b = 0;
        } else {
            try {
                spannable.setSpan(gVar == p13.g.Background ? new android.text.style.BackgroundColorSpan(iVar.f351098f) : new android.text.style.ForegroundColorSpan(iVar.f351098f), hVar.f351091e, hVar.f351092f, 33);
                jVar.f351105a = spannable;
                jVar.f351106b = 0;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", e17, "setSpan %s", hVar.toString());
                jVar.f351105a = spannable;
                jVar.f351106b = -1;
            }
        }
        return jVar;
    }

    public static void i(java.lang.String str, p13.h hVar, p13.i iVar) {
        java.lang.String str2;
        java.lang.CharSequence charSequence;
        p13.p pVar = hVar.f351090d;
        if (pVar != null && ((java.util.ArrayList) pVar.f351123a).size() > 0) {
            java.util.Iterator it = ((java.util.ArrayList) hVar.f351090d.f351123a).iterator();
            while (it.hasNext()) {
                p13.o oVar = (p13.o) it.next();
                if (oVar.f351120a == p13.q.OTHER) {
                    str2 = oVar.f351121b;
                    break;
                }
            }
        }
        str2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        int indexOf = str.indexOf(str2);
        if (indexOf >= 0) {
            hVar.f351091e = indexOf;
            hVar.f351092f = indexOf + str2.length();
        }
        if (!hVar.h() || (charSequence = iVar.f351101i) == null) {
            return;
        }
        hVar.f351091e += charSequence.length();
        hVar.f351092f += iVar.f351101i.length();
    }

    public static void j(java.util.List list, p13.h hVar, p13.i iVar) {
        int a17;
        java.lang.CharSequence charSequence;
        p13.o oVar;
        if (!iVar.f351096d) {
            java.util.Iterator it = ((java.util.ArrayList) hVar.f351090d.f351123a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p13.o oVar2 = (p13.o) it.next();
                if (oVar2.f351120a == p13.q.FullPY && (a17 = a(list, oVar2.f351122c)) >= 0) {
                    hVar.f351091e = a17;
                    hVar.f351092f = a17 + oVar2.f351122c.size();
                    break;
                }
            }
        } else {
            java.util.Iterator it6 = ((java.util.ArrayList) hVar.f351090d.f351123a).iterator();
            while (true) {
                if (!it6.hasNext()) {
                    oVar = null;
                    break;
                } else {
                    oVar = (p13.o) it6.next();
                    if (oVar.f351120a == p13.q.ShortPY) {
                        break;
                    }
                }
            }
            if (oVar == null) {
                return;
            }
            int a18 = a(list, oVar.f351122c);
            if (a18 >= 0) {
                hVar.f351091e = a18;
                hVar.f351092f = a18 + oVar.f351122c.size();
            }
        }
        if (!hVar.h() || (charSequence = iVar.f351101i) == null) {
            return;
        }
        hVar.f351091e += charSequence.length();
        hVar.f351092f += iVar.f351101i.length();
    }

    public static p13.j k(android.text.Spannable spannable, p13.h hVar, p13.i iVar) {
        android.text.SpannableString spannableString;
        if (!f(spannable, iVar)) {
            return h(spannable, hVar, iVar);
        }
        p13.j jVar = new p13.j();
        float textSize = iVar.f351099g - (iVar.f351100h.getTextSize() * 2.0f);
        float measureText = iVar.f351100h.measureText("…");
        float measureText2 = iVar.f351100h.measureText(spannable, 0, hVar.f351091e);
        float measureText3 = iVar.f351100h.measureText(spannable, hVar.f351091e, hVar.f351092f);
        float measureText4 = iVar.f351100h.measureText(spannable, hVar.f351092f, spannable.length());
        float f17 = measureText2 + measureText3;
        if (f17 + measureText4 < textSize) {
            return h(spannable, hVar, iVar);
        }
        java.lang.CharSequence subSequence = spannable.subSequence(hVar.f351091e, hVar.f351092f);
        p13.g gVar = iVar.f351097e;
        if (gVar == p13.g.CustomTag) {
            spannableString = new android.text.SpannableString(android.text.TextUtils.concat(iVar.f351103k, subSequence, iVar.f351104l));
        } else {
            java.lang.Object backgroundColorSpan = gVar == p13.g.Background ? new android.text.style.BackgroundColorSpan(iVar.f351098f) : new android.text.style.ForegroundColorSpan(iVar.f351098f);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(subSequence);
            try {
                spannableString2.setSpan(backgroundColorSpan, 0, spannableString2.length(), 33);
                spannableString = spannableString2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSUIHLLogic", e17, "setSpan %s", hVar.toString());
                jVar.f351106b = -1;
                jVar.f351105a = spannable;
                return jVar;
            }
        }
        if (f17 + measureText < textSize) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(spannable, 0, hVar.f351091e);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            spannableStringBuilder.append(android.text.TextUtils.ellipsize(spannable.subSequence(hVar.f351092f, spannable.length()), iVar.f351100h, (textSize - measureText2) - measureText3, android.text.TextUtils.TruncateAt.END));
            jVar.f351105a = spannableStringBuilder;
        } else {
            float f18 = measureText + measureText3;
            if (f18 + measureText4 < textSize) {
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                spannableStringBuilder2.append(android.text.TextUtils.ellipsize(spannable.subSequence(0, hVar.f351091e), iVar.f351100h, (textSize - measureText3) - measureText4, android.text.TextUtils.TruncateAt.START));
                spannableStringBuilder2.append((java.lang.CharSequence) spannableString);
                spannableStringBuilder2.append((java.lang.CharSequence) spannable, hVar.f351092f, spannable.length());
                jVar.f351105a = spannableStringBuilder2;
            } else if (f18 + measureText >= textSize) {
                android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
                spannableStringBuilder3.append(android.text.TextUtils.ellipsize(spannableString, iVar.f351100h, textSize, android.text.TextUtils.TruncateAt.END));
                jVar.f351105a = spannableStringBuilder3;
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder();
                float f19 = (textSize - measureText3) / 2.0f;
                java.lang.CharSequence subSequence2 = spannable.subSequence(0, hVar.f351091e);
                java.lang.CharSequence subSequence3 = spannable.subSequence(hVar.f351092f, spannable.length());
                spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence2, iVar.f351100h, f19, android.text.TextUtils.TruncateAt.START));
                spannableStringBuilder4.append((java.lang.CharSequence) spannableString);
                spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence3, iVar.f351100h, f19, android.text.TextUtils.TruncateAt.END));
                jVar.f351105a = spannableStringBuilder4;
            }
        }
        jVar.f351106b = 0;
        return jVar;
    }

    public static final android.text.SpannableString l(java.lang.CharSequence charSequence, int i17, int i18) {
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        p13.h hVar = new p13.h();
        hVar.f351091e = i17;
        hVar.f351092f = i18;
        k(spannableString, hVar, new p13.i());
        return spannableString;
    }

    public static final android.text.SpannableString m(java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence) {
        return l(str + ((java.lang.Object) charSequence) + str2, str.length(), str.length() + charSequence.length());
    }
}
