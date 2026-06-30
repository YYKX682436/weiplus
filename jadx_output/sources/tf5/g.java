package tf5;

/* loaded from: classes11.dex */
public final class g extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f418978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f418979e;

    /* renamed from: f, reason: collision with root package name */
    public final int f418980f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f418981g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f418982h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f418983i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f418984m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.CharSequence f418985n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.CharSequence f418986o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f418987p;

    public g(com.tencent.mm.storage.z3 contact, int i17, int i18) {
        java.lang.String U0;
        java.lang.String str;
        java.lang.String U02;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String valueOf;
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f418978d = contact;
        this.f418979e = i17;
        this.f418980f = i18;
        this.f418982h = "";
        this.f418983i = true;
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        this.f418984m = arrayList;
        this.f418987p = "";
        java.lang.String wi6 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(contact);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        float h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479897ia);
        ((ke0.e) xVar).getClass();
        this.f418985n = com.tencent.mm.pluginsdk.ui.span.c0.n(context, wi6, h17);
        java.lang.String str5 = contact.f236589y1;
        this.f418986o = str5 == null ? "" : str5;
        java.lang.String y07 = contact.y0();
        if (y07 != null && (r26.n0.N(y07) ^ true)) {
            U0 = contact.y0();
        } else {
            java.lang.String U03 = contact.U0();
            U0 = U03 != null && (r26.n0.N(U03) ^ true) ? contact.U0() : "";
        }
        java.lang.String str6 = "\u007f";
        if (U0 != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            str = U0.toUpperCase(locale);
            kotlin.jvm.internal.o.f(str, "toUpperCase(...)");
        } else {
            str = "\u007f";
        }
        arrayList.add(str);
        java.lang.String w07 = contact.w0();
        if (w07 != null && (r26.n0.N(w07) ^ true)) {
            U02 = contact.w0();
        } else {
            java.lang.String U04 = contact.U0();
            U02 = U04 != null && (r26.n0.N(U04) ^ true) ? contact.U0() : "";
        }
        if (U02 != null) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale2, "getDefault(...)");
            str2 = U02.toUpperCase(locale2);
            kotlin.jvm.internal.o.f(str2, "toUpperCase(...)");
        } else {
            str2 = "\u007f";
        }
        arrayList.add(str2);
        java.lang.String U05 = contact.U0();
        if (U05 != null) {
            java.util.Locale locale3 = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale3, "getDefault(...)");
            str3 = U05.toUpperCase(locale3);
            kotlin.jvm.internal.o.f(str3, "toUpperCase(...)");
        } else {
            str3 = "\u007f";
        }
        arrayList.add(str3);
        java.lang.String P0 = contact.P0();
        if (P0 != null) {
            java.util.Locale locale4 = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale4, "getDefault(...)");
            str4 = P0.toUpperCase(locale4);
            kotlin.jvm.internal.o.f(str4, "toUpperCase(...)");
        } else {
            str4 = "\u007f";
        }
        arrayList.add(str4);
        java.lang.String d17 = contact.d1();
        if (d17 != null) {
            java.util.Locale locale5 = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale5, "getDefault(...)");
            str6 = d17.toUpperCase(locale5);
            kotlin.jvm.internal.o.f(str6, "toUpperCase(...)");
        }
        arrayList.add(str6);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i18 == 123) {
            valueOf = "#";
        } else if (i18 == 32) {
            valueOf = context2.getString(com.tencent.mm.R.string.f489901ex);
            kotlin.jvm.internal.o.d(valueOf);
        } else {
            valueOf = java.lang.String.valueOf((char) i18);
        }
        this.f418982h = valueOf;
        if (com.tencent.mm.storage.z3.m4(contact.d1())) {
            j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
            java.lang.String fj6 = b0Var != null ? ((l41.q2) b0Var).fj(contact.Q0(), contact.G0()) : null;
            java.lang.String str7 = fj6 != null ? fj6 : "";
            this.f418987p = str7;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7) || !kotlin.jvm.internal.o.b("3552365301", contact.Q0())) {
                return;
            }
            this.f418987p = "@" + str7;
        }
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        tf5.g other = (tf5.g) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f418978d, other.f418978d) && this.f418981g == other.f418981g && kotlin.jvm.internal.o.b(this.f418982h, other.f418982h) && this.f418983i == other.f418983i && this.f418980f == other.f418980f;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        tf5.g other = (tf5.g) obj;
        kotlin.jvm.internal.o.g(other, "other");
        int i17 = kotlin.jvm.internal.o.i(this.f418979e, other.f418979e);
        if (i17 == 0 && (i17 = kotlin.jvm.internal.o.i(this.f418978d.W0(), other.f418978d.W0())) == 0) {
            int i18 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f418984m;
                if (i18 < arrayList.size()) {
                    java.util.ArrayList arrayList2 = other.f418984m;
                    if (i18 < arrayList2.size()) {
                        java.lang.String str = (java.lang.String) arrayList.get(i18);
                        java.lang.Object obj2 = arrayList2.get(i18);
                        kotlin.jvm.internal.o.f(obj2, "get(...)");
                        i17 = str.compareTo((java.lang.String) obj2);
                        if (i17 != 0) {
                            break;
                        }
                        i18++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return i17;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f418979e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f418978d.d1() + '-' + this.f418979e;
    }
}
