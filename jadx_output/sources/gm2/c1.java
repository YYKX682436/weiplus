package gm2;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final gm2.c1 f273320a = new gm2.c1();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f273321b = jz5.h.b(gm2.x0.f273524d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f273322c = jz5.h.b(gm2.y0.f273532d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f273323d = jz5.h.b(gm2.w0.f273521d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f273324e = jz5.h.b(gm2.u0.f273491d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f273325f = jz5.h.b(gm2.t0.f273480d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f273326g = jz5.h.b(gm2.y.f273531d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f273327h = jz5.h.b(gm2.z.f273533d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f273328i = jz5.h.b(gm2.b0.f273314d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f273329j = jz5.h.b(gm2.a0.f273311d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f273330k = jz5.h.b(gm2.k0.f273422d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f273331l;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f273332m;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f273333n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f273334o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f273335p;

    /* renamed from: q, reason: collision with root package name */
    public static final jz5.g f273336q;

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f273337r;

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f273338s;

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f273339t;

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f273340u;

    /* renamed from: v, reason: collision with root package name */
    public static final jz5.g f273341v;

    /* renamed from: w, reason: collision with root package name */
    public static final jz5.g f273342w;

    /* renamed from: x, reason: collision with root package name */
    public static final jz5.g f273343x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f273344y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f273345z;

    static {
        jz5.h.b(gm2.j0.f273417d);
        jz5.h.b(gm2.l0.f273427d);
        jz5.h.b(gm2.m0.f273431d);
        f273331l = jz5.h.b(gm2.q0.f273463d);
        f273332m = jz5.h.b(gm2.r0.f273468d);
        f273333n = jz5.h.b(gm2.s0.f273469d);
        f273334o = jz5.h.b(gm2.c0.f273319d);
        f273335p = jz5.h.b(gm2.d0.f273354d);
        jz5.h.b(gm2.e0.f273357d);
        f273336q = jz5.h.b(gm2.f0.f273366d);
        f273337r = jz5.h.b(gm2.g0.f273367d);
        f273338s = jz5.h.b(gm2.h0.f273369d);
        f273339t = jz5.h.b(gm2.i0.f273410d);
        f273340u = jz5.h.b(gm2.o0.f273456d);
        f273341v = jz5.h.b(gm2.n0.f273434d);
        f273342w = jz5.h.b(gm2.p0.f273458d);
        f273343x = jz5.h.b(gm2.v0.f273501d);
        f273344y = "Finder.FinderLiveSpanUtil";
        f273345z = new int[]{1, 2, 4, 5, 8, 10, 11, 12, 13, 14, 17, 15, 16, 19, 20};
    }

    public static final int a(gm2.c1 c1Var, int i17) {
        c1Var.getClass();
        if (i17 == 17) {
            return 108;
        }
        if (i17 == 20) {
            return 89;
        }
        switch (i17) {
            case 1:
                return 100;
            case 2:
                return 90;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 110;
            case 6:
                return 70;
            default:
                switch (i17) {
                    case 12:
                        return 85;
                    case 13:
                        return 109;
                    case 14:
                        return 107;
                    case 15:
                        return 79;
                    default:
                        return 0;
                }
        }
    }

    public static android.graphics.drawable.Drawable c(gm2.c1 c1Var, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        c1Var.getClass();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setBounds(0, 0, i17, i18);
        return gradientDrawable;
    }

    public static jz5.l d(gm2.c1 c1Var, android.view.View view, android.content.Context context, java.lang.String msg, java.util.LinkedList linkedList, int[] filterSpan, gm2.c2 c2Var, gm2.e2 e2Var, int i17, java.lang.Integer num, java.util.Map map, int i18, java.lang.Object obj) {
        gm2.c2 spanMode = (i18 & 32) != 0 ? gm2.c2.f273348g : c2Var;
        gm2.e2 sizeType = (i18 & 64) != 0 ? gm2.e2.f273361g : e2Var;
        int i19 = (i18 & 128) != 0 ? -1 : i17;
        java.lang.Integer num2 = (i18 & 256) != 0 ? null : num;
        java.util.Map specialColorMode = (i18 & 512) != 0 ? new java.util.LinkedHashMap() : map;
        c1Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(filterSpan, "filterSpan");
        kotlin.jvm.internal.o.g(spanMode, "spanMode");
        kotlin.jvm.internal.o.g(sizeType, "sizeType");
        kotlin.jvm.internal.o.g(specialColorMode, "specialColorMode");
        gm2.e2 e2Var2 = sizeType;
        gm2.c2 c2Var2 = spanMode;
        java.util.List r17 = r(c1Var, linkedList, filterSpan, spanMode, sizeType, i19, view, null, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl), 0, num2, specialColorMode, com.tencent.mapsdk.internal.km.f50100e, null);
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("userlevelTest,badgeInfos size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(",spanList:");
        sb6.append(c1Var.s(linkedList));
        sb6.append(",validSpan:");
        sb6.append(((java.util.LinkedList) r17).size());
        sb6.append(",spanMode:");
        sb6.append(c2Var2);
        sb6.append(",sizeType:");
        sb6.append(e2Var2);
        r4Var.M2("getAllBadgeSpannableString", sb6.toString());
        return new jz5.l(c1Var.q(context, msg, r17, true), r17);
    }

    public static android.text.style.ImageSpan n(gm2.c1 c1Var, java.util.List list, gm2.d1 d1Var, int i17, java.lang.Object obj) {
        r45.eq1 eq1Var;
        java.lang.String str = null;
        if ((i17 & 2) != 0) {
            d1Var = null;
        }
        c1Var.getClass();
        if (list == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.yl1 yl1Var = (r45.yl1) it.next();
            if (yl1Var.getInteger(0) == 12 && yl1Var.getInteger(2) > 0) {
                java.lang.String string = yl1Var.getString(4);
                if (!(true ^ (string == null || string.length() == 0))) {
                    string = null;
                }
                if (string == null) {
                    mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
                    if (n2Var != null && (eq1Var = n2Var.f329279g) != null) {
                        str = eq1Var.getString(0);
                    }
                } else {
                    str = string;
                }
                gm2.h hVar = gm2.j.f273414e;
                gm2.f fVar = new gm2.f();
                int integer = yl1Var.getInteger(2);
                if (d1Var == null) {
                    d1Var = new gm2.d1(gm2.c2.f273348g, gm2.e2.f273361g);
                }
                fVar.b(integer, d1Var);
                if (str == null) {
                    str = "";
                }
                gm2.i iVar = fVar.f273365a;
                iVar.getClass();
                iVar.f273393d = str;
                fVar.c(yl1Var.getString(3));
                gm2.j a17 = fVar.a();
                yl1Var.getInteger(0);
                return a17;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x02b4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.LinkedList] */
    public static java.util.List r(gm2.c1 c1Var, java.util.List list, int[] iArr, gm2.c2 c2Var, gm2.e2 e2Var, int i17, android.view.View view, java.util.Map map, int i18, int i19, java.lang.Integer num, java.util.Map map2, int i27, java.lang.Object obj) {
        java.lang.Integer num2;
        ?? r76;
        java.util.Iterator it;
        int[] iArr2;
        int i28;
        java.util.Map map3;
        java.util.Map map4;
        java.util.Map map5;
        gm2.z1 z1Var;
        int i29;
        int dimension;
        r45.eq1 eq1Var;
        int i37;
        int dimension2;
        java.util.Map map6;
        boolean z17;
        android.graphics.Bitmap n17;
        r45.eq1 eq1Var2;
        java.lang.Object obj2;
        int i38;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i39;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        int i47;
        int i48;
        java.lang.Object obj8;
        int[] spanFilter = (i27 & 2) != 0 ? f273345z : iArr;
        gm2.c2 spanColorMode = (i27 & 4) != 0 ? gm2.c2.f273348g : c2Var;
        gm2.e2 sizeType = (i27 & 8) != 0 ? gm2.e2.f273361g : e2Var;
        int i49 = (i27 & 16) != 0 ? -1 : i17;
        java.util.Map map7 = (i27 & 64) != 0 ? null : map;
        int i57 = (i27 & 128) != 0 ? 0 : i18;
        int k17 = (i27 & 256) != 0 ? c1Var.k() : i19;
        java.lang.Integer num3 = (i27 & 512) != 0 ? null : num;
        java.util.Map specialColorMode = (i27 & 1024) != 0 ? new java.util.LinkedHashMap() : map2;
        c1Var.getClass();
        kotlin.jvm.internal.o.g(spanFilter, "spanFilter");
        kotlin.jvm.internal.o.g(spanColorMode, "spanColorMode");
        kotlin.jvm.internal.o.g(sizeType, "sizeType");
        kotlin.jvm.internal.o.g(specialColorMode, "specialColorMode");
        java.util.LinkedList<android.text.style.UpdateLayout> linkedList = new java.util.LinkedList();
        if (list != null) {
            r76 = new java.util.LinkedList();
            r76.addAll(list);
            switch (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3472f0).getValue()).r()).intValue()) {
                case 1:
                    num2 = num3;
                    int i58 = 0;
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj2 = it6.next();
                            java.util.Iterator it7 = it6;
                            if (!(((r45.yl1) obj2).getInteger(i58) == 17)) {
                                it6 = it7;
                                i58 = 0;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 == null) {
                        r45.yl1 yl1Var = new r45.yl1();
                        yl1Var.set(0, 17);
                        yl1Var.set(4, "资深买家");
                        r76.add(yl1Var);
                        break;
                    }
                    break;
                case 2:
                    num2 = num3;
                    java.util.Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj3 = it8.next();
                            i38 = 14;
                            if (((r45.yl1) obj3).getInteger(0) == 14) {
                            }
                        } else {
                            i38 = 14;
                            obj3 = null;
                        }
                    }
                    if (obj3 == null) {
                        r45.yl1 yl1Var2 = new r45.yl1();
                        yl1Var2.set(0, java.lang.Integer.valueOf(i38));
                        yl1Var2.set(4, "普通买家");
                        r76.add(yl1Var2);
                        break;
                    }
                    break;
                case 3:
                    num2 = num3;
                    java.util.Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            obj4 = it9.next();
                            if (((r45.yl1) obj4).getInteger(0) == 15) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    if (obj4 == null) {
                        r45.yl1 yl1Var3 = new r45.yl1();
                        yl1Var3.set(0, 15);
                        yl1Var3.set(4, "粉丝");
                        r76.add(yl1Var3);
                        break;
                    }
                    break;
                case 4:
                    num2 = num3;
                    java.util.Iterator it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            obj5 = it10.next();
                            i39 = 16;
                            if (((r45.yl1) obj5).getInteger(0) == 16) {
                            }
                        } else {
                            i39 = 16;
                            obj5 = null;
                        }
                    }
                    if (obj5 == null) {
                        r45.yl1 yl1Var4 = new r45.yl1();
                        yl1Var4.set(0, java.lang.Integer.valueOf(i39));
                        yl1Var4.set(4, "常看");
                        r76.add(yl1Var4);
                        break;
                    }
                    break;
                case 5:
                    num2 = num3;
                    java.util.Iterator it11 = list.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            obj6 = it11.next();
                            if (((r45.yl1) obj6).getInteger(0) == 13) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    if (obj6 == null) {
                        r45.yl1 yl1Var5 = new r45.yl1();
                        yl1Var5.set(0, 13);
                        yl1Var5.set(4, "买过x单");
                        r76.add(yl1Var5);
                        break;
                    }
                    break;
                case 6:
                    java.util.Iterator it12 = list.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            obj7 = it12.next();
                            num2 = num3;
                            if (!(((r45.yl1) obj7).getInteger(0) == 17)) {
                                num3 = num2;
                            }
                        } else {
                            num2 = num3;
                            obj7 = null;
                        }
                    }
                    if (obj7 == null) {
                        r45.yl1 yl1Var6 = new r45.yl1();
                        i47 = 0;
                        yl1Var6.set(0, 17);
                        yl1Var6.set(4, "资深买家");
                        r76.add(yl1Var6);
                    } else {
                        i47 = 0;
                    }
                    java.util.Iterator it13 = list.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            obj8 = it13.next();
                            int integer = ((r45.yl1) obj8).getInteger(i47);
                            i48 = 14;
                            if (!(integer == 14)) {
                                i47 = 0;
                            }
                        } else {
                            i48 = 14;
                            obj8 = null;
                        }
                    }
                    if (obj8 == null) {
                        r45.yl1 yl1Var7 = new r45.yl1();
                        yl1Var7.set(0, java.lang.Integer.valueOf(i48));
                        yl1Var7.set(4, "普通买家");
                        r76.add(yl1Var7);
                        break;
                    }
                    break;
                default:
                    num2 = num3;
                    break;
            }
        } else {
            num2 = num3;
            r76 = list;
        }
        if (r76 != 0) {
            r76 = kz5.n0.F0(r76, new gm2.b1());
        }
        if (r76 != 0) {
            java.util.Iterator it14 = r76.iterator();
            while (it14.hasNext()) {
                r45.yl1 yl1Var8 = (r45.yl1) it14.next();
                if (kz5.z.F(spanFilter, yl1Var8.getInteger(0)) && (i49 == -1 || linkedList.size() < i49)) {
                    int integer2 = yl1Var8.getInteger(0);
                    gm2.c1 c1Var2 = f273320a;
                    it = it14;
                    iArr2 = spanFilter;
                    i28 = i49;
                    switch (integer2) {
                        case 1:
                            map3 = specialColorMode;
                            map4 = map7;
                            int integer3 = yl1Var8.getInteger(2);
                            if (integer3 > 0) {
                                int i59 = gm2.i1.f273411f;
                                gm2.e1 e1Var = new gm2.e1();
                                e1Var.b(integer3, new gm2.b());
                                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dyp);
                                kotlin.jvm.internal.o.f(string, "getString(...)");
                                e1Var.e(string);
                                java.lang.String number = java.lang.String.valueOf(integer3);
                                kotlin.jvm.internal.o.g(number, "number");
                                gm2.h1 h1Var = e1Var.f273358a;
                                h1Var.getClass();
                                h1Var.f273371b = number;
                                h1Var.f273375f = i57;
                                h1Var.f273378i = k17;
                                h1Var.f273381l = c1Var2.k();
                                e1Var.d(yl1Var8.getString(3), true);
                                gm2.i1 a17 = e1Var.a();
                                yl1Var8.getInteger(0);
                                linkedList.add(a17);
                                map7 = map4;
                                it14 = it;
                                spanFilter = iArr2;
                                i49 = i28;
                                specialColorMode = map3;
                            }
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 2:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (yl1Var8.getInteger(2) > 0) {
                                if (map5 != null) {
                                    map4 = map5;
                                    z1Var = (gm2.z1) map4.get(2);
                                } else {
                                    map4 = map5;
                                    z1Var = null;
                                }
                                gm2.t1 t1Var = z1Var instanceof gm2.t1 ? (gm2.t1) z1Var : null;
                                linkedList.add(c1Var2.b(yl1Var8.getInteger(2), view, t1Var == null ? new gm2.t1(spanColorMode, sizeType) : t1Var, i57, k17, yl1Var8.getString(3)));
                                map7 = map4;
                                it14 = it;
                                spanFilter = iArr2;
                                i49 = i28;
                                specialColorMode = map3;
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 3:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String str = f273344y;
                            if (view != null) {
                                zl2.r4.f473950a.M2(str, "getIconDrawable viewRef:" + view.hashCode() + ", name:" + yl1Var8.getString(4) + ", bgcolor:" + yl1Var8.getString(3) + ", url:" + yl1Var8.getString(1));
                                int integer4 = (int) (((float) 255) * (((float) yl1Var8.getInteger(5)) / 100.0f));
                                r26.a.a(16);
                                java.lang.String num4 = java.lang.Integer.toString(integer4, 16);
                                kotlin.jvm.internal.o.f(num4, "toString(...)");
                                java.lang.String string2 = yl1Var8.getString(3);
                                if (string2 == null) {
                                    string2 = "#FFFFFF";
                                }
                                java.lang.String concat = num4.concat(r26.i0.t(string2, "#", "", false));
                                gm2.j1 j1Var = new gm2.j1(view, sizeType, com.tencent.mm.R.id.f487509ou0);
                                gm2.e2 e2Var2 = gm2.e2.f273361g;
                                int dimension3 = (int) (sizeType == e2Var2 ? com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479646bl) : com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480422xh));
                                int dimension4 = (int) (sizeType == e2Var2 ? com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479738dv) : com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480431xq));
                                if (sizeType == e2Var2) {
                                    dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479643bi);
                                    i29 = 2;
                                } else {
                                    i29 = 2;
                                    dimension = ((int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480422xh)) / 2;
                                }
                                gm2.p pVar = gm2.q.f273460e;
                                gm2.r rVar = new gm2.r();
                                int integer5 = yl1Var8.getInteger(i29);
                                java.lang.String string3 = yl1Var8.getString(4);
                                rVar.b(integer5, string3 == null ? "" : string3, j1Var);
                                gm2.o oVar = rVar.f273465a;
                                oVar.f273436a = i57;
                                oVar.f273437b = k17;
                                oVar.f273438c = dimension3;
                                oVar.f273439d = dimension4;
                                oVar.f273440e = dimension;
                                rVar.c("#" + concat);
                                java.lang.String string4 = yl1Var8.getString(1);
                                if (string4 == null) {
                                    string4 = "";
                                }
                                rVar.f273465a.f273449n = new fx2.f(string4, j1Var.f273419b, (android.view.View) j1Var.f273420c.get());
                                gm2.q a18 = rVar.a(view);
                                yl1Var8.getInteger(0);
                                linkedList.add(a18);
                            } else {
                                com.tencent.mars.xlog.Log.i(str, "GameRank attachView null");
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 4:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (yl1Var8.getInteger(2) > 0) {
                                java.lang.String string5 = yl1Var8.getString(4);
                                if (!(!(string5 == null || string5.length() == 0))) {
                                    string5 = null;
                                }
                                if (string5 == null) {
                                    mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
                                    string5 = (n2Var == null || (eq1Var = n2Var.f329279g) == null) ? null : eq1Var.getString(0);
                                }
                                gm2.h hVar = gm2.j.f273414e;
                                gm2.f fVar = new gm2.f();
                                fVar.b(yl1Var8.getInteger(2), new gm2.e(spanColorMode, sizeType));
                                java.lang.String str2 = string5 == null ? "" : string5;
                                gm2.i iVar = fVar.f273365a;
                                iVar.getClass();
                                iVar.f273393d = str2;
                                gm2.i iVar2 = fVar.f273365a;
                                iVar2.f273404o = i57;
                                iVar2.f273405p = k17;
                                fVar.c(yl1Var8.getString(3));
                                gm2.j a19 = fVar.a();
                                yl1Var8.getInteger(0);
                                linkedList.add(a19);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 5:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            int i66 = gm2.i1.f273411f;
                            gm2.e1 e1Var2 = new gm2.e1();
                            e1Var2.b(0, new gm2.t(spanColorMode, null, 2, null));
                            e1Var2.f((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                            gm2.h1 h1Var2 = e1Var2.f273358a;
                            h1Var2.f273375f = i57;
                            h1Var2.f273378i = k17;
                            e1Var2.c((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
                            java.lang.String string6 = yl1Var8.getString(4);
                            e1Var2.e(string6 == null ? "" : string6);
                            gm2.i1 a27 = e1Var2.a();
                            yl1Var8.getInteger(0);
                            linkedList.add(a27);
                            if (kotlin.jvm.internal.o.b(yl1Var8.getString(4), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491469d60))) {
                                break;
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 6:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (view != null) {
                                r26.a.a(16);
                                java.lang.String num5 = java.lang.Integer.toString((int) (255 * (yl1Var8.getInteger(5) / 100.0f)), 16);
                                kotlin.jvm.internal.o.f(num5, "toString(...)");
                                java.lang.String string7 = yl1Var8.getString(3);
                                if (string7 == null) {
                                    string7 = "#FFFFFF";
                                }
                                java.lang.String concat2 = num5.concat(r26.i0.t(string7, "#", "", false));
                                gm2.j1 j1Var2 = new gm2.j1(view, sizeType, com.tencent.mm.R.id.otz);
                                gm2.e2 e2Var3 = gm2.e2.f273361g;
                                int dimension5 = (int) (sizeType == e2Var3 ? com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479646bl) : com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480422xh));
                                int dimension6 = (int) (sizeType == e2Var3 ? com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479738dv) : com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480431xq));
                                if (sizeType == e2Var3) {
                                    dimension2 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479643bi);
                                    i37 = 2;
                                } else {
                                    i37 = 2;
                                    dimension2 = ((int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480422xh)) / 2;
                                }
                                gm2.p pVar2 = gm2.q.f273460e;
                                gm2.r rVar2 = new gm2.r();
                                int integer6 = yl1Var8.getInteger(i37);
                                java.lang.String string8 = yl1Var8.getString(4);
                                rVar2.b(integer6, string8 == null ? "" : string8, j1Var2);
                                gm2.o oVar2 = rVar2.f273465a;
                                oVar2.f273436a = i57;
                                oVar2.f273437b = k17;
                                oVar2.f273438c = dimension5;
                                oVar2.f273439d = dimension6;
                                oVar2.f273440e = dimension2;
                                rVar2.c("#" + concat2);
                                java.lang.String string9 = yl1Var8.getString(1);
                                rVar2.f273465a.f273449n = new fx2.f(string9 == null ? "" : string9, j1Var2.f273419b, (android.view.View) j1Var2.f273420c.get());
                                gm2.q a28 = rVar2.a(view);
                                yl1Var8.getInteger(0);
                                linkedList.add(a28);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 7:
                        default:
                            map3 = specialColorMode;
                            map4 = map7;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 8:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            int i67 = gm2.i1.f273411f;
                            gm2.e1 e1Var3 = new gm2.e1();
                            e1Var3.b(0, new gm2.n(spanColorMode, null, 2, null));
                            e1Var3.f((int) context2.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                            e1Var3.c((int) context2.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
                            java.lang.String string10 = yl1Var8.getString(4);
                            e1Var3.e(string10 == null ? "" : string10);
                            gm2.i1 a29 = e1Var3.a();
                            yl1Var8.getInteger(0);
                            linkedList.add(a29);
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 9:
                            java.util.Map map8 = specialColorMode;
                            map6 = map7;
                            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            int parseColor = map8.getOrDefault(9, gm2.z0.f273534d) == gm2.c2.f273349h ? android.graphics.Color.parseColor("#0D000000") : map8.getOrDefault(9, gm2.a1.f273312d) == gm2.c2.f273348g ? android.graphics.Color.parseColor("#804c4c4c") : com.tencent.mm.ui.bk.C() ? android.graphics.Color.parseColor("#804c4c4c") : android.graphics.Color.parseColor("#0D000000");
                            int parseColor2 = android.graphics.Color.parseColor("#CFB177");
                            gm2.p pVar3 = gm2.q.f273460e;
                            gm2.r rVar3 = new gm2.r();
                            gm2.o oVar3 = rVar3.f273465a;
                            oVar3.f273436a = i57;
                            oVar3.f273437b = k17;
                            map3 = map8;
                            oVar3.f273449n = m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.icons_live_filld_vip, 0.0f);
                            rVar3.f273465a.f273450o = c1Var2.f();
                            int f17 = c1Var2.f();
                            gm2.o oVar4 = rVar3.f273465a;
                            oVar4.f273451p = f17;
                            oVar4.f273452q = parseColor2;
                            oVar4.f273446k = parseColor2;
                            context3.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1);
                            int e17 = c1Var2.e();
                            gm2.o oVar5 = rVar3.f273465a;
                            oVar5.f273447l = e17;
                            oVar5.f273441f = parseColor;
                            java.lang.String string11 = yl1Var8.getString(4);
                            java.lang.String str3 = string11 == null ? "" : string11;
                            gm2.o oVar6 = rVar3.f273465a;
                            oVar6.getClass();
                            oVar6.f273445j = str3;
                            gm2.q a37 = rVar3.a(view);
                            z17 = false;
                            yl1Var8.getInteger(0);
                            linkedList.add(a37);
                            map4 = map6;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 10:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            int i68 = gm2.i1.f273411f;
                            gm2.e1 e1Var4 = new gm2.e1();
                            e1Var4.b(0, new gm2.t(spanColorMode, null, 2, null));
                            e1Var4.f((int) context4.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                            gm2.h1 h1Var3 = e1Var4.f273358a;
                            h1Var3.f273375f = i57;
                            h1Var3.f273378i = k17;
                            e1Var4.c((int) context4.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
                            java.lang.String string12 = yl1Var8.getString(4);
                            e1Var4.e(string12 == null ? "" : string12);
                            gm2.i1 a38 = e1Var4.a();
                            yl1Var8.getInteger(0);
                            linkedList.add(a38);
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 11:
                            map3 = specialColorMode;
                            map6 = map7;
                            android.content.Context context5 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            int integer7 = yl1Var8.getInteger(2);
                            if (integer7 == 1) {
                                android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.f481920c81);
                                kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
                                n17 = pm0.v.n(drawable);
                            } else if (integer7 == 2) {
                                android.graphics.drawable.Drawable drawable2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.f481921c82);
                                kotlin.jvm.internal.o.f(drawable2, "getDrawable(...)");
                                n17 = pm0.v.n(drawable2);
                            } else if (integer7 != 3) {
                                n17 = null;
                            } else {
                                android.graphics.drawable.Drawable drawable3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.f481922c83);
                                kotlin.jvm.internal.o.f(drawable3, "getDrawable(...)");
                                n17 = pm0.v.n(drawable3);
                            }
                            int i69 = gm2.i1.f273411f;
                            gm2.e1 e1Var5 = new gm2.e1();
                            e1Var5.b(0, new gm2.n(spanColorMode, null, 2, null));
                            e1Var5.f((int) context5.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                            e1Var5.c((int) context5.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
                            java.lang.String string13 = context5.getResources().getString(com.tencent.mm.R.string.dkx, java.lang.Integer.valueOf(yl1Var8.getInteger(2)));
                            kotlin.jvm.internal.o.f(string13, "getString(...)");
                            e1Var5.e(string13);
                            e1Var5.f273358a.f273385p = n17;
                            gm2.i1 a39 = e1Var5.a();
                            z17 = false;
                            yl1Var8.getInteger(0);
                            linkedList.add(a39);
                            map4 = map6;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 12:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (yl1Var8.getInteger(2) > 0) {
                                java.lang.String string14 = yl1Var8.getString(4);
                                if (!(!(string14 == null || string14.length() == 0))) {
                                    string14 = null;
                                }
                                if (string14 == null) {
                                    mm2.n2 n2Var2 = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
                                    string14 = (n2Var2 == null || (eq1Var2 = n2Var2.f329279g) == null) ? null : eq1Var2.getString(0);
                                }
                                gm2.h hVar2 = gm2.j.f273414e;
                                gm2.f fVar2 = new gm2.f();
                                fVar2.b(yl1Var8.getInteger(2), new gm2.d1(spanColorMode, sizeType));
                                java.lang.String str4 = string14 == null ? "" : string14;
                                gm2.i iVar3 = fVar2.f273365a;
                                iVar3.getClass();
                                iVar3.f273393d = str4;
                                gm2.i iVar4 = fVar2.f273365a;
                                iVar4.f273404o = i57;
                                iVar4.f273405p = k17;
                                gm2.j a47 = fVar2.a();
                                yl1Var8.getInteger(0);
                                linkedList.add(a47);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 13:
                            map3 = specialColorMode;
                            map5 = map7;
                            if (dk2.ef.I != null) {
                                java.lang.String string15 = yl1Var8.getString(4);
                                if (!(string15 == null || string15.length() == 0)) {
                                    android.content.Context context6 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                    int i76 = gm2.i1.f273411f;
                                    gm2.e1 e1Var6 = new gm2.e1();
                                    e1Var6.b(0, new gm2.s(spanColorMode, null, 2, null));
                                    e1Var6.f((int) context6.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                                    gm2.h1 h1Var4 = e1Var6.f273358a;
                                    h1Var4.f273375f = i57;
                                    h1Var4.f273378i = k17;
                                    java.lang.String string16 = yl1Var8.getString(4);
                                    e1Var6.e(string16 == null ? "" : string16);
                                    e1Var6.f273358a.f273386q = new int[]{android.graphics.Color.parseColor("#ccc72205"), android.graphics.Color.parseColor("#ccff611e")};
                                    gm2.i1 a48 = e1Var6.a();
                                    yl1Var8.getInteger(0);
                                    linkedList.add(a48);
                                }
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 14:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String string17 = yl1Var8.getString(4);
                            if (!(string17 == null || string17.length() == 0)) {
                                android.content.Context context7 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                int i77 = gm2.i1.f273411f;
                                gm2.e1 e1Var7 = new gm2.e1();
                                e1Var7.b(0, new gm2.x(spanColorMode, null, 2, null));
                                e1Var7.f((int) context7.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                                gm2.h1 h1Var5 = e1Var7.f273358a;
                                h1Var5.f273375f = i57;
                                h1Var5.f273378i = k17;
                                java.lang.String string18 = yl1Var8.getString(4);
                                e1Var7.e(string18 == null ? "" : string18);
                                e1Var7.f273358a.f273386q = new int[]{android.graphics.Color.parseColor("#ccffb752"), android.graphics.Color.parseColor("#ccff8326")};
                                gm2.i1 a49 = e1Var7.a();
                                yl1Var8.getInteger(0);
                                linkedList.add(a49);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 15:
                        case 16:
                        case 20:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String string19 = yl1Var8.getString(4);
                            if (!(string19 == null || string19.length() == 0)) {
                                android.content.Context context8 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                int i78 = gm2.i1.f273411f;
                                gm2.e1 e1Var8 = new gm2.e1();
                                e1Var8.b(0, new gm2.x(spanColorMode, null, 2, null));
                                e1Var8.f((int) context8.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                                e1Var8.c((int) context8.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
                                java.lang.String string20 = yl1Var8.getString(4);
                                e1Var8.e(string20 == null ? "" : string20);
                                e1Var8.f273358a.f273372c = spanColorMode == gm2.c2.f273350i ? com.tencent.mm.ui.bk.C() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1) : (spanColorMode == gm2.c2.f273348g || spanColorMode == gm2.c2.f273351m) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1);
                                e1Var8.d(yl1Var8.getString(3), false);
                                gm2.i1 a57 = e1Var8.a();
                                yl1Var8.getInteger(0);
                                linkedList.add(a57);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 17:
                            map3 = specialColorMode;
                            map5 = map7;
                            java.lang.String string21 = yl1Var8.getString(4);
                            if (!(string21 == null || string21.length() == 0)) {
                                android.content.Context context9 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                int i79 = gm2.i1.f273411f;
                                gm2.e1 e1Var9 = new gm2.e1();
                                e1Var9.b(0, new gm2.x(spanColorMode, null, 2, null));
                                e1Var9.f((int) context9.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                                e1Var9.c((int) context9.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
                                java.lang.String string22 = yl1Var8.getString(4);
                                e1Var9.e(string22 == null ? "" : string22);
                                e1Var9.f273358a.f273386q = new int[]{android.graphics.Color.parseColor("#ccff7c30"), android.graphics.Color.parseColor("#ccf46a4d")};
                                gm2.i1 a58 = e1Var9.a();
                                yl1Var8.getInteger(0);
                                linkedList.add(a58);
                            }
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                        case 18:
                            map3 = specialColorMode;
                            map5 = map7;
                            android.content.Context context10 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            int i86 = gm2.i1.f273411f;
                            gm2.e1 e1Var10 = new gm2.e1();
                            e1Var10.b(0, new gm2.t(spanColorMode, null, 2, null));
                            e1Var10.f((int) context10.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                            gm2.h1 h1Var6 = e1Var10.f273358a;
                            h1Var6.f273375f = i57;
                            h1Var6.f273378i = k17;
                            e1Var10.c((int) context10.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
                            java.lang.String string23 = yl1Var8.getString(4);
                            e1Var10.e(string23 == null ? "" : string23);
                            gm2.i1 a59 = e1Var10.a();
                            yl1Var8.getInteger(0);
                            linkedList.add(a59);
                            map4 = map5;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                        case 19:
                            android.content.Context context11 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            int color = spanColorMode == gm2.c2.f273350i ? com.tencent.mm.ui.bk.C() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5) : (spanColorMode == gm2.c2.f273348g || spanColorMode == gm2.c2.f273351m) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5);
                            int ordinal = spanColorMode.ordinal();
                            int color2 = ordinal != 1 ? ordinal != 2 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9) : com.tencent.mm.ui.bk.C() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5);
                            gm2.p pVar4 = gm2.q.f273460e;
                            gm2.r rVar4 = new gm2.r();
                            gm2.o oVar7 = rVar4.f273465a;
                            oVar7.f273436a = i57;
                            oVar7.f273437b = k17;
                            map6 = map7;
                            map3 = specialColorMode;
                            oVar7.f273449n = m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.icons_regular_location, 0.0f);
                            oVar7.f273450o = c1Var2.e();
                            oVar7.f273451p = c1Var2.f();
                            oVar7.f273452q = color2;
                            oVar7.f273446k = color2;
                            context11.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1);
                            rVar4.f273465a.f273447l = c1Var2.e();
                            oVar7.f273441f = color;
                            java.lang.String string24 = yl1Var8.getString(4);
                            java.lang.String str5 = string24 == null ? "" : string24;
                            gm2.o oVar8 = rVar4.f273465a;
                            oVar8.getClass();
                            oVar8.f273445j = str5;
                            gm2.q a67 = rVar4.a(view);
                            z17 = false;
                            yl1Var8.getInteger(0);
                            linkedList.add(a67);
                            map4 = map6;
                            map7 = map4;
                            it14 = it;
                            spanFilter = iArr2;
                            i49 = i28;
                            specialColorMode = map3;
                            break;
                    }
                    return linkedList;
                }
                it = it14;
                map3 = specialColorMode;
                iArr2 = spanFilter;
                i28 = i49;
                map4 = map7;
                map7 = map4;
                it14 = it;
                spanFilter = iArr2;
                i49 = i28;
                specialColorMode = map3;
            }
        }
        if (num2 != null && num2.intValue() > 0) {
            int i87 = 0;
            for (android.text.style.UpdateLayout updateLayout : linkedList) {
                gm2.y1 y1Var = updateLayout instanceof gm2.y1 ? (gm2.y1) updateLayout : null;
                i87 += y1Var != null ? y1Var.a() : 0;
            }
            while (i87 >= num2.intValue()) {
                kz5.h0.E(linkedList);
                i87 = 0;
                for (android.text.style.UpdateLayout updateLayout2 : linkedList) {
                    gm2.y1 y1Var2 = updateLayout2 instanceof gm2.y1 ? (gm2.y1) updateLayout2 : null;
                    i87 += y1Var2 != null ? y1Var2.a() : 0;
                }
            }
        }
        return linkedList;
    }

    public final android.text.style.ImageSpan b(int i17, android.view.View view, gm2.t1 t1Var, int i18, int i19, java.lang.String str) {
        if (t1Var == null) {
            t1Var = new gm2.t1(gm2.c2.f273348g, gm2.e2.f273361g);
        }
        gm2.p pVar = gm2.q.f273460e;
        gm2.r rVar = new gm2.r();
        rVar.b(i17, java.lang.String.valueOf(i17), t1Var);
        gm2.o oVar = rVar.f273465a;
        oVar.f273436a = i18;
        oVar.f273437b = i19 + 1;
        zl2.r4 r4Var = zl2.r4.f473950a;
        rVar.f273465a.f273452q = r4Var.W0(i17);
        rVar.f273465a.f273446k = r4Var.W0(i17);
        rVar.c(str);
        return rVar.a(view);
    }

    public final int e() {
        return ((java.lang.Number) ((jz5.n) f273334o).getValue()).intValue();
    }

    public final int f() {
        return ((java.lang.Number) ((jz5.n) f273337r).getValue()).intValue();
    }

    public final int g() {
        return ((java.lang.Number) ((jz5.n) f273338s).getValue()).intValue();
    }

    public final int h() {
        return ((java.lang.Number) ((jz5.n) f273341v).getValue()).intValue();
    }

    public final int i() {
        return ((java.lang.Number) ((jz5.n) f273333n).getValue()).intValue();
    }

    public final int j() {
        return ((java.lang.Number) ((jz5.n) f273325f).getValue()).intValue();
    }

    public final int k() {
        return ((java.lang.Number) ((jz5.n) f273324e).getValue()).intValue();
    }

    public final int l() {
        return ((java.lang.Number) ((jz5.n) f273321b).getValue()).intValue();
    }

    public final android.text.style.ImageSpan m(int i17) {
        return i17 == k() ? (android.text.style.ImageSpan) ((jz5.n) f273343x).getValue() : new android.text.style.ImageSpan(c(this, i17, 0, 2, null));
    }

    public final java.lang.String o(java.util.List spanList) {
        kotlin.jvm.internal.o.g(spanList, "spanList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = spanList.iterator();
        while (it.hasNext()) {
            sb6.append(" ");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final float p(java.lang.String text, float f17) {
        kotlin.jvm.internal.o.g(text, "text");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        return paint.measureText(text, 0, text.length());
    }

    public final com.tencent.mm.pluginsdk.ui.span.f0 q(android.content.Context context, java.lang.String msg, java.util.List spans, boolean z17) {
        int length;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(spans, "spans");
        int size = spans.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append(" ");
        }
        if (z17) {
            sb6.append(msg);
            length = 0;
        } else {
            sb6.insert(0, msg);
            length = msg.length();
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String valueOf = java.lang.String.valueOf(sb6);
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, valueOf));
        for (int i18 = 0; i18 < size; i18++) {
            int i19 = length + i18;
            f0Var.c(spans.get(i18), i19, i19 + 1, 33);
        }
        return f0Var;
    }

    public final java.lang.String s(java.util.LinkedList linkedList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (linkedList != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.yl1 yl1Var = (r45.yl1) obj;
                sb6.append("[" + i17 + "],type:" + yl1Var.getInteger(0) + ",level:" + yl1Var.getInteger(2) + ';');
                i17 = i18;
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
