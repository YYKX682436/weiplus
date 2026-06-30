package h12;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f278102a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f278103b;

    public m(java.lang.String origin, int i17) {
        kotlin.jvm.internal.o.g(origin, "origin");
        this.f278102a = origin;
        this.f278103b = new java.util.ArrayList();
        java.lang.CharSequence a17 = pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, origin);
        if (a17 instanceof android.text.SpannableString) {
            int i18 = 0;
            al5.w[] wVarArr = (al5.w[]) ((android.text.SpannableString) a17).getSpans(0, a17.length(), al5.w.class);
            kotlin.jvm.internal.o.d(wVarArr);
            kz5.v.A(wVarArr, new h12.j(a17));
            int length = wVarArr.length;
            int i19 = 0;
            while (i18 < length) {
                al5.w wVar = wVarArr[i18];
                android.text.SpannableString spannableString = (android.text.SpannableString) a17;
                int spanStart = spannableString.getSpanStart(wVar);
                int spanEnd = spannableString.getSpanEnd(wVar);
                if (i19 < spanStart) {
                    java.util.ArrayList arrayList = this.f278103b;
                    h12.l lVar = h12.l.f278100e;
                    java.lang.String substring = this.f278102a.substring(i19, spanStart);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    arrayList.add(new h12.k(i19, spanStart, lVar, substring));
                }
                java.util.ArrayList arrayList2 = this.f278103b;
                h12.l lVar2 = h12.l.f278099d;
                java.lang.String substring2 = this.f278102a.substring(spanStart, spanEnd);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                arrayList2.add(new h12.k(spanStart, spanEnd, lVar2, substring2));
                i18++;
                i19 = spanEnd;
            }
            if (i19 < this.f278102a.length()) {
                java.util.ArrayList arrayList3 = this.f278103b;
                int length2 = this.f278102a.length();
                h12.l lVar3 = h12.l.f278100e;
                java.lang.String str = this.f278102a;
                java.lang.String substring3 = str.substring(i19, str.length());
                kotlin.jvm.internal.o.f(substring3, "substring(...)");
                arrayList3.add(new h12.k(i19, length2, lVar3, substring3));
            }
        }
    }

    public final int a(com.tencent.mm.ui.tools.t4 mode) {
        int i17;
        kotlin.jvm.internal.o.g(mode, "mode");
        int i18 = 0;
        for (h12.k kVar : this.f278103b) {
            int ordinal = kVar.f278097c.ordinal();
            if (ordinal == 0) {
                i17 = 2;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                i17 = com.tencent.mm.ui.tools.v4.e(kVar.f278098d, mode);
            }
            i18 += i17;
        }
        return i18;
    }

    public final java.lang.String b(int i17, com.tencent.mm.ui.tools.t4 mode) {
        int i18;
        kotlin.jvm.internal.o.g(mode, "mode");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = this.f278103b.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h12.k kVar = (h12.k) it.next();
            int ordinal = kVar.f278097c.ordinal();
            java.lang.String str = kVar.f278098d;
            if (ordinal == 0) {
                i18 = 2;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                i18 = com.tencent.mm.ui.tools.v4.e(str, mode);
            }
            int i27 = i18 + i19;
            if (i27 <= i17) {
                stringBuffer.append(str);
            } else if (i27 > i17) {
                if (kVar.f278097c == h12.l.f278100e && i19 < i17) {
                    stringBuffer.append(com.tencent.mm.ui.tools.v4.h(str, i17 - i19));
                }
            }
            i19 = i27;
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }
}
