package zl2;

/* loaded from: classes3.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.r4 f473950a = new zl2.r4();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f473951b = kz5.z.D0(new java.lang.Integer[]{19, 6, 28, 25, 26, 27, 20, 21, 22, 23, 24, 29, 30});

    /* renamed from: c, reason: collision with root package name */
    public static final android.text.InputFilter f473952c = zl2.q0.f473926d;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f473953d = jz5.h.b(zl2.p0.f473915d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f473954e = jz5.h.b(zl2.s0.f473963d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f473955f = jz5.h.b(zl2.p1.f473916d);

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f473956g;

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.u3 f473957h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f473958i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f473959j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f473960k;

    /* renamed from: l, reason: collision with root package name */
    public static int f473961l;

    static {
        ae2.in inVar = ae2.in.f3688a;
        f473956g = ((java.lang.Number) ae2.in.G5.r()).intValue() == 1;
        jz5.h.b(zl2.y2.f474035d);
        jz5.h.b(zl2.x2.f474022d);
        f473958i = jz5.h.b(zl2.t0.f473972d);
        f473959j = new java.util.HashMap();
        f473960k = new java.util.HashMap();
        f473961l = -1;
    }

    public static /* synthetic */ int C0(zl2.r4 r4Var, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        return r4Var.B0(i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if ((r8 != null && r8.A) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String D0(zl2.r4 r4, java.lang.String r5, java.lang.String r6, boolean r7, int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.D0(zl2.r4, java.lang.String, java.lang.String, boolean, int, java.lang.Object):java.lang.String");
    }

    public static /* synthetic */ void D2(zl2.r4 r4Var, long j17, java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            i18 = 1;
        }
        r4Var.C2(j17, str, i17, i18);
    }

    public static final boolean E1(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        zl2.r4 r4Var = f473950a;
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) buContext.a(mm2.g1.class)).f329068f;
        if (r4Var.G1(j2Var != null ? (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null)) {
            return true;
        }
        mm2.n0 n0Var = (mm2.n0) buContext.a(mm2.n0.class);
        if (n0Var.f329273r) {
            return true;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if (e17 == null) {
            e17 = "";
        }
        return (e17.length() > 0) && n0Var.P6(e17);
    }

    public static final boolean F1(gk2.e buContext) {
        r45.dm2 object_extend;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (E1(buContext)) {
            return true;
        }
        kotlinx.coroutines.flow.f3 f3Var = ((mm2.n0) buContext.a(mm2.n0.class)).f329271p;
        r45.d50 d50Var = null;
        r45.a84 a84Var = f3Var != null ? (r45.a84) ((kotlinx.coroutines.flow.l2) f3Var).getValue() : null;
        if (a84Var != null) {
            java.util.LinkedList list = a84Var.getList(1);
            if (!(list == null || list.isEmpty())) {
                return true;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) buContext.a(mm2.c1.class)).f328846n;
        if (finderObject != null && (object_extend = finderObject.getObject_extend()) != null) {
            d50Var = (r45.d50) object_extend.getCustom(63);
        }
        if (d50Var != null) {
            java.util.LinkedList list2 = d50Var.getList(1);
            if (!(list2 == null || list2.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public static final void H2(cl0.g gVar, r45.fd2 fd2Var) {
        if (fd2Var == null) {
            return;
        }
        int optInt = gVar.optInt("tag_id");
        java.lang.String optString = gVar.optString("tag_name");
        int optInt2 = gVar.optInt("show_primary_tag");
        int optInt3 = gVar.optInt("need_poi");
        fd2Var.set(0, java.lang.Integer.valueOf(optInt));
        fd2Var.set(1, optString);
        fd2Var.set(4, java.lang.Integer.valueOf(optInt2));
        fd2Var.set(5, java.lang.Integer.valueOf(optInt3));
    }

    public static final void N(android.content.Context context) {
        java.lang.String str;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).tk(1);
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var == null || (str = c1Var.f328852o) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "#enterShopCustomerService-enterChatting anchorUsername=".concat(str2));
        i95.m c17 = i95.n0.c(c61.ub.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.ub.c7((c61.ub) c17, context, str2, 1, null, null, null, null, null, 240, null);
    }

    public static boolean R1(zl2.r4 r4Var, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        r4Var.getClass();
        if (z17) {
            return com.tencent.mm.sdk.platformtools.t8.D0(str, str2);
        }
        return (true ^ (str == null || str.length() == 0)) & com.tencent.mm.sdk.platformtools.t8.D0(str, str2);
    }

    public static java.lang.String S(zl2.r4 r4Var, long j17, int i17, int i18, java.lang.Object obj) {
        java.lang.String format;
        if ((i18 & 2) != 0) {
            i17 = 4;
        }
        r4Var.getClass();
        try {
            if (com.tencent.mm.sdk.platformtools.m2.j()) {
                float f17 = (float) j17;
                if (f17 < 10000.0f) {
                    format = java.lang.String.valueOf(j17);
                } else if (f17 < 10000.0f || f17 >= 1.0E8f) {
                    float floatValue = new java.math.BigDecimal(j17 / 1.0E8f).setScale(2, i17).floatValue();
                    if (floatValue % ((float) 1) == 0.0f) {
                        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.es9);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    } else if ((100 * floatValue) % 10 > 0.0f) {
                        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.esd);
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    } else {
                        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.esc);
                        kotlin.jvm.internal.o.f(string3, "getString(...)");
                        format = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    }
                } else {
                    float floatValue2 = new java.math.BigDecimal(j17 / 10000.0f).setScale(1, i17).floatValue();
                    if (floatValue2 % ((float) 1) == 0.0f) {
                        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.es6);
                        kotlin.jvm.internal.o.f(string4, "getString(...)");
                        format = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue2)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    } else {
                        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491955es0);
                        kotlin.jvm.internal.o.f(string5, "getString(...)");
                        format = java.lang.String.format(string5, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue2)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    }
                }
            } else {
                float f18 = (float) j17;
                if (f18 < 1000.0f) {
                    format = java.lang.String.valueOf(j17);
                } else if (f18 >= 1000.0f && f18 < 1000000.0f) {
                    float floatValue3 = new java.math.BigDecimal(j17 / 1000.0f).setScale(1, i17).floatValue();
                    if (floatValue3 % ((float) 1) == 0.0f) {
                        java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.es7);
                        kotlin.jvm.internal.o.f(string6, "getString(...)");
                        format = java.lang.String.format(string6, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue3)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    } else {
                        java.lang.String string7 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491958es3);
                        kotlin.jvm.internal.o.f(string7, "getString(...)");
                        format = java.lang.String.format(string7, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue3)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    }
                } else if (f18 < 1000000.0f || f18 >= 1.0E9f) {
                    float floatValue4 = new java.math.BigDecimal(j17 / 1.0E9f).setScale(1, i17).floatValue();
                    if (floatValue4 % ((float) 1) == 0.0f) {
                        java.lang.String string8 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.esh);
                        kotlin.jvm.internal.o.f(string8, "getString(...)");
                        format = java.lang.String.format(string8, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue4)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    } else {
                        java.lang.String string9 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.esg);
                        kotlin.jvm.internal.o.f(string9, "getString(...)");
                        format = java.lang.String.format(string9, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue4)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    }
                } else {
                    float floatValue5 = new java.math.BigDecimal(j17 / 1000000.0f).setScale(1, i17).floatValue();
                    if (floatValue5 % ((float) 1) == 0.0f) {
                        java.lang.String string10 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.es_);
                        kotlin.jvm.internal.o.f(string10, "getString(...)");
                        format = java.lang.String.format(string10, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue5)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    } else {
                        java.lang.String string11 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.esa);
                        kotlin.jvm.internal.o.f(string11, "getString(...)");
                        format = java.lang.String.format(string11, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue5)}, 1));
                        kotlin.jvm.internal.o.f(format, "format(...)");
                    }
                }
            }
            return format;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[formatNumber] errMsg:" + e17.getMessage());
            return "";
        }
    }

    public static final r45.gv T0(r45.j72 j72Var) {
        zl2.r4 r4Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.f(j72Var.getList(0), "getCdn_trans_info(...)");
        java.lang.Object obj2 = null;
        if (!(!r1.isEmpty())) {
            return null;
        }
        java.util.LinkedList list = j72Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getCdn_trans_info(...)");
        java.util.Iterator it = list.iterator();
        do {
            boolean hasNext = it.hasNext();
            r4Var = f473950a;
            if (!hasNext) {
                break;
            }
        } while (!(((r45.gv) it.next()).f375541i == r4Var.i0()));
        java.util.LinkedList list2 = j72Var.getList(0);
        kotlin.jvm.internal.o.f(list2, "getCdn_trans_info(...)");
        java.util.Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            }
            obj = it6.next();
            if (((r45.gv) obj).f375541i == r4Var.i0()) {
                break;
            }
        }
        r45.gv gvVar = (r45.gv) obj;
        if (!r4Var.i0() || gvVar != null) {
            return gvVar;
        }
        java.util.LinkedList list3 = j72Var.getList(0);
        kotlin.jvm.internal.o.f(list3, "getCdn_trans_info(...)");
        java.util.Iterator it7 = list3.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            java.lang.Object next = it7.next();
            if (((r45.gv) next).f375541i == 0) {
                obj2 = next;
                break;
            }
        }
        r45.gv gvVar2 = (r45.gv) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getReplayTransitionInfo findBackupCdnTransInfo firstTargetVideoTagType result is null, backupTargetVideoTagType result is null:");
        sb6.append(gvVar2 == null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.w("FinderLiveUtil", sb6.toString());
        return gvVar2;
    }

    public static final r45.gv U0(r45.j72 j72Var, int i17) {
        zl2.r4 r4Var;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.LinkedList list = j72Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getCdn_trans_info(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r4Var = f473950a;
            obj = null;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            r45.gv gvVar = (r45.gv) obj2;
            if (gvVar.f375542m == i17 && gvVar.f375541i == r4Var.i0()) {
                break;
            }
        }
        r45.gv gvVar2 = (r45.gv) obj2;
        if (r4Var.i0() && gvVar2 == null) {
            java.util.LinkedList list2 = j72Var.getList(0);
            kotlin.jvm.internal.o.f(list2, "getCdn_trans_info(...)");
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                r45.gv gvVar3 = (r45.gv) next;
                if (gvVar3.f375542m == i17 && gvVar3.f375541i == 0) {
                    obj = next;
                    break;
                }
            }
            gvVar2 = (r45.gv) obj;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getReplayTransitionInfo findTargetCdnTransInfo firstTargetVideoTagType result is null, backupTargetVideoTagType result is null:");
            sb6.append(gvVar2 == null);
            sb6.append('!');
            com.tencent.mars.xlog.Log.w("FinderLiveUtil", sb6.toString());
        }
        return gvVar2;
    }

    public static void b(zl2.r4 r4Var, android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.plugin.l plugin, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = true;
        }
        r4Var.getClass();
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        if (r4Var.v1(root)) {
            android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (z17) {
                marginLayoutParams.setMarginStart(f473950a.y0(plugin) - ((int) root.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479671c8)));
            }
            if (z18) {
                marginLayoutParams.setMarginEnd((int) root.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db));
            }
        }
    }

    public static void c3(zl2.r4 r4Var, android.view.View view, int i17, int i18, int i19, java.lang.Object obj) {
        int i27 = i19 & 2;
        jz5.g gVar = f473958i;
        if (i27 != 0) {
            r4Var.getClass();
            i17 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        }
        if ((i19 & 4) != 0) {
            r4Var.getClass();
            i18 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        }
        r4Var.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        view.post(new zl2.m3(view, i17, i18));
    }

    public static /* synthetic */ void g(zl2.r4 r4Var, java.lang.String str, android.view.View view, boolean z17, boolean z18, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        boolean z19 = z17;
        if ((i18 & 8) != 0) {
            z18 = true;
        }
        boolean z27 = z18;
        if ((i18 & 16) != 0) {
            i17 = -1;
        }
        r4Var.f(str, view, z19, z27, i17);
    }

    public static r45.jn0 k0(zl2.r4 r4Var, gk2.e buContext, int i17, java.lang.String strvalue, int i18, java.lang.String str, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            strvalue = "";
        }
        if ((i19 & 8) != 0) {
            i18 = -1;
        }
        if ((i19 & 16) != 0) {
            str = null;
        }
        r4Var.getClass();
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(strvalue, "strvalue");
        r45.jn0 jn0Var = new r45.jn0();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean z17 = true;
        jn0Var.set(1, xy2.c.e(context));
        jn0Var.set(0, java.lang.Long.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f328983m));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("feedActionType", java.lang.Integer.valueOf(i17));
        if (!(strvalue.length() == 0)) {
            hashMap.put("strValue", strvalue);
            hashMap.put("value", java.lang.Integer.valueOf(i18));
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            hashMap.put("extraReportJson", str);
        }
        f473950a.M2("FinderLiveUtil", "getExtState :" + hashMap);
        jn0Var.set(3, hc2.k.a(hashMap));
        jn0Var.set(2, ((mm2.e1) buContext.a(mm2.e1.class)).f328993w);
        return jn0Var;
    }

    public static /* synthetic */ void o3(zl2.r4 r4Var, android.view.ViewGroup viewGroup, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        r4Var.n3(viewGroup, str, z17, z18);
    }

    public static void t2(zl2.r4 r4Var, java.lang.String str, yz5.l lVar, yz5.l lVar2, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        if ((i17 & 4) != 0) {
            lVar2 = null;
        }
        r4Var.getClass();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String str2 = str == null ? "" : str;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str2).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(replaceAll.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(replaceAll);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        wo0.c a17 = d1Var.a(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null));
        a17.f447873d = new zl2.v2(lVar2, lVar, str);
        a17.f();
    }

    public static void v0(zl2.r4 r4Var, java.util.ArrayList result, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i18 = com.tencent.mm.R.string.e0s;
        }
        r4Var.getClass();
        kotlin.jvm.internal.o.g(result, "result");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i27 = 0; i27 < 60; i27++) {
            arrayList.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(i18, zl2.q4.f473933a.z(i27)));
        }
        for (int i28 = 0; i28 < i17; i28++) {
            result.add(arrayList);
        }
    }

    public final boolean A(lm2.c commentData) {
        kotlin.jvm.internal.o.g(commentData, "commentData");
        return commentData.h() == 20002 && kotlin.jvm.internal.o.b(commentData.f(), c01.z1.r());
    }

    public final jz5.l A0(android.content.Context context) {
        android.app.Activity activity;
        int i17;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        kotlin.jvm.internal.o.g(context, "context");
        int i18 = com.tencent.mm.ui.bl.b(context).x;
        int i19 = com.tencent.mm.ui.bl.b(context).y;
        boolean z17 = context instanceof android.app.Activity;
        android.view.View view = null;
        android.app.Activity activity2 = z17 ? (android.app.Activity) context : null;
        if ((activity2 == null || (finderLiveVisitorPluginLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) activity2.findViewById(com.tencent.mm.R.id.f484854fq1)) == null) ? false : finderLiveVisitorPluginLayout.getIsPresentedInTimeLineUI()) {
            activity = z17 ? (android.app.Activity) context : null;
            if (activity != null) {
                i17 = com.tencent.mm.R.id.fs6;
                view = activity.findViewById(i17);
            }
        } else {
            activity = z17 ? (android.app.Activity) context : null;
            if (activity != null) {
                i17 = com.tencent.mm.R.id.evz;
                view = activity.findViewById(i17);
            }
        }
        if (view != null && view.getWidth() > 0 && view.getHeight() > 0) {
            int width = view.getWidth();
            i19 = view.getHeight();
            i18 = width;
        }
        return new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public final boolean A1(gk2.e eVar) {
        return pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
    }

    public final void A2(gk2.e eVar, android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
        if (c1Var != null) {
            c1Var.n9(z17);
        }
        rn0.a aVar = rn0.a.f397609a;
        if (z17) {
            if (in0.q.f292769b2 == null) {
                in0.q.f292769b2 = new in0.q(aVar.a());
            }
            in0.q qVar = in0.q.f292769b2;
            kotlin.jvm.internal.o.d(qVar);
            qVar.e0(true);
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f491460d52));
            return;
        }
        if (in0.q.f292769b2 == null) {
            in0.q.f292769b2 = new in0.q(aVar.a());
        }
        in0.q qVar2 = in0.q.f292769b2;
        kotlin.jvm.internal.o.d(qVar2);
        qVar2.e0(false);
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.d4e));
    }

    public final boolean B(android.content.Context context, gk2.e buContext, java.lang.String title, java.lang.String desc, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        boolean z17 = !w1() && d2(buContext, null);
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.ayl, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e);
            android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            kotlin.jvm.internal.o.d(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            textView.setText(title);
            textView2.setText(desc);
            android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            button.setOnClickListener(new zl2.i1(buContext, k0Var, context, aVar));
            button2.setOnClickListener(new zl2.j1(k0Var));
            k0Var.f211872n = new zl2.k1(k0Var, roundedCornerFrameLayout);
            k0Var.e(true);
            k0Var.v();
        }
        return z17;
    }

    public final int B0(int i17, int i18) {
        return qg2.d.f362793a.d(i17, i18);
    }

    public final boolean B1(r45.xn1 xn1Var) {
        java.util.LinkedList<r45.yl1> list = xn1Var != null ? xn1Var.getList(11) : null;
        if (list != null) {
            for (r45.yl1 yl1Var : list) {
                if (yl1Var.getInteger(0) == 5 && !kotlin.jvm.internal.o.b(yl1Var.getString(4), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dtf))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B2() {
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (!(c1Var != null && c1Var.f328824j2 == 2)) {
            mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var2 != null && c1Var2.f328813h2 == 2) {
                return true;
            }
        }
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        if (pm0.v.z(c1Var3 != null ? c1Var3.f328819i2 : 0, 787040)) {
            mm2.c1 c1Var4 = (mm2.c1) efVar.i(mm2.c1.class);
            if (!pm0.v.z(c1Var4 != null ? c1Var4.f328807g2 : 0, 787040)) {
                return true;
            }
        }
        return false;
    }

    public final void C(java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        throw new java.lang.RuntimeException("plugin inflateError throw exception: ".concat(errorMsg));
    }

    public final boolean C1(r45.xn1 xn1Var) {
        java.util.LinkedList list = xn1Var != null ? xn1Var.getList(11) : null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((r45.yl1) it.next()).getInteger(0) == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void C2(long j17, java.lang.String username, int i17, int i18) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = j17;
        iaVar.f6924g = username;
        iaVar.f6925h = i17;
        iaVar.f6921d = i18;
        iaVar.f6919b = 8;
        feedUpdateEvent.e();
        r45.nw1 Gj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(j17);
        if (Gj != null) {
            Gj.set(2, java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "notify live:" + j17 + " status change to:" + i17 + ' ');
    }

    public final boolean D(boolean z17, r45.z63 switchInfo) {
        kotlin.jvm.internal.o.g(switchInfo, "switchInfo");
        if (z17) {
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3704b5).getValue()).r()).booleanValue()) {
                return true;
            }
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GAME_RANK_PERMISSION_SHOW_STRING_SYNC, "");
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "permissionAppids:" + v17 + ", switchInfo.game_app_id:" + switchInfo.getString(0));
            kotlin.jvm.internal.o.d(v17);
            java.lang.String string = switchInfo.getString(0);
            if (!r26.n0.B(v17, string != null ? string : "", false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean D1(r45.y23 y23Var) {
        java.lang.Integer valueOf = y23Var != null ? java.lang.Integer.valueOf(y23Var.getInteger(11)) : null;
        return valueOf != null && valueOf.intValue() == 10000002;
    }

    public final void E(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17) {
        android.view.Window window;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "activity:" + appCompatActivity + " clear flag:" + i17);
        if (appCompatActivity == null || (window = appCompatActivity.getWindow()) == null) {
            return;
        }
        window.clearFlags(i17);
    }

    public final long E0(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        long t17 = ((mm2.c1) buContext.a(mm2.c1.class)).f328778a5 ? gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L);
        if (t17 != 0 && !((mm2.c1) buContext.a(mm2.c1.class)).S) {
            return t17;
        }
        long j17 = ((mm2.c1) buContext.a(mm2.c1.class)).R1;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "replace user page live func switch flag with joinLive cgi flag:" + j17 + '!');
        return j17;
    }

    public final void E2(gk2.e buContext, qo0.c statusMonitor) {
        el2.i2 i2Var;
        el2.i2 i2Var2;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        so2.j5 j5Var = ((mm2.f6) buContext.a(mm2.f6.class)).f329049w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        if (tVar != null) {
            boolean z17 = tVar.f43394p;
            zl2.r4 r4Var = f473950a;
            if (!z17 || r4Var.w1()) {
                qo0.b bVar = qo0.b.N2;
                android.os.Bundle bundle = new android.os.Bundle();
                r45.f52 J2 = r4Var.J2(tVar);
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.toByteArray() : null);
                statusMonitor.statusChange(bVar, bundle);
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
                if (liveRoomControllerStore != null && (i2Var2 = (el2.i2) liveRoomControllerStore.controller(el2.i2.class)) != null) {
                    i2Var2.a7(null, null);
                }
            } else {
                long j17 = tVar.f43393o ? e06.p.j(new e06.k(1, tVar.f43395q), c06.e.f37716d) : 0L;
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[notifyBubble] delay = " + j17);
                pm0.v.V(j17 * ((long) 1000), zl2.d3.f473720d);
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore2 = dk2.ef.f233371J;
        if (liveRoomControllerStore2 == null || (i2Var = (el2.i2) liveRoomControllerStore2.controller(el2.i2.class)) == null) {
            return;
        }
        i2Var.a7(null, null);
    }

    public final boolean F(java.util.LinkedList dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            if (((r45.of1) it.next()).getInteger(2) == 2) {
                return true;
            }
        }
        return false;
    }

    public final long F0(r45.nw1 nw1Var) {
        if (nw1Var != null) {
            return nw1Var.getLong(50);
        }
        return 0L;
    }

    public final void F2(android.content.Context context, com.tencent.mm.api.IEmojiInfo emoji) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(emoji, "emoji");
        java.lang.String md52 = emoji.getMd5();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (md52 == null) {
            md52 = "";
        }
        qk.u uVar = new qk.u(md52, emoji);
        uVar.f364159e = true;
        uVar.f364155a = 76;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveUtil", "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, uVar);
        }
    }

    public final void G(android.content.Context context, java.lang.String url) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, url));
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.guh);
        e4Var.c();
    }

    public final int G0(int i17, int i18, int i19) {
        int e17 = c01.id.e();
        int i27 = i18 - e17;
        int i28 = i18 - i17;
        int i29 = (i27 > i28 || i27 > i19) ? i19 : i27;
        if (i27 <= 0) {
            i29 = 0;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getLotteryRemainTime serverTime:" + e17 + ",beginTime:" + i17 + ",endTime:" + i18 + ",remainTime:" + i19 + ",calRemainTime:" + i27 + ",duration:" + i28 + ",result:" + i29);
        return i29;
    }

    public final boolean G1(r45.q12 q12Var) {
        return (q12Var != null ? q12Var.getInteger(0) : 0) == 5;
    }

    public final java.util.LinkedList G2(java.util.List list, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(list, "list");
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        } else {
            linkedList.clear();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            r45.il1 il1Var = new r45.il1();
            il1Var.parseFrom(bArr);
            linkedList.add(il1Var);
        }
        return linkedList;
    }

    public final dk2.a8 H(r45.ch1 appMsg, gk2.e liveData) {
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        r45.xn1 xn1Var = new r45.xn1();
        zl2.r4 r4Var = f473950a;
        xn1Var.set(0, r4Var.m0(liveData));
        xn1Var.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f328812h);
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        appMsg.set(13, xn1Var);
        return new dk2.a8(appMsg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r0 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String H0(r45.xy1 r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            if (r8 != 0) goto L5
            return r0
        L5:
            r1 = 2
            java.lang.String r2 = r8.getString(r1)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L24
            int r6 = r2.length()
            if (r6 <= 0) goto L17
            r6 = r4
            goto L18
        L17:
            r6 = r5
        L18:
            if (r6 == 0) goto L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            if (r2 == 0) goto L24
            java.lang.String r1 = r8.getString(r1)
            if (r1 != 0) goto L9c
        L24:
            int r1 = r8.getInteger(r5)
            switch(r1) {
                case 1: goto L65;
                case 2: goto L57;
                case 3: goto L65;
                case 4: goto L49;
                case 5: goto L3b;
                case 6: goto L2d;
                default: goto L2b;
            }
        L2b:
            goto L98
        L2d:
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131781119(0x7f1065ff, float:1.9193843E38)
            java.lang.String r0 = r8.getString(r0)
            goto L98
        L3b:
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131766579(0x7f102d33, float:1.9164352E38)
            java.lang.String r0 = r8.getString(r0)
            goto L98
        L49:
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131764352(0x7f102480, float:1.9159835E38)
            java.lang.String r0 = r8.getString(r0)
            goto L98
        L57:
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131764450(0x7f1024e2, float:1.9160034E38)
            java.lang.String r0 = r8.getString(r0)
            goto L98
        L65:
            java.lang.String r8 = r8.getString(r4)
            if (r8 == 0) goto L8b
            int r0 = r8.length()
            if (r0 <= 0) goto L72
            goto L73
        L72:
            r4 = r5
        L73:
            if (r4 == 0) goto L76
            r3 = r8
        L76:
            if (r3 == 0) goto L8b
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131764389(0x7f1024a5, float:1.915991E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = r8.getString(r0, r1)
            if (r0 != 0) goto L98
        L8b:
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131764445(0x7f1024dd, float:1.9160024E38)
            java.lang.String r0 = r8.getString(r0)
        L98:
            kotlin.jvm.internal.o.d(r0)
            r1 = r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.H0(r45.xy1):java.lang.String");
    }

    public final boolean H1(gk2.e eVar) {
        return !pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 8);
    }

    public final r45.hx0 I(int i17, java.util.LinkedList itemList) {
        com.tencent.mm.protobuf.e j12Var;
        com.tencent.mm.protobuf.e eVar;
        kotlin.jvm.internal.o.g(itemList, "itemList");
        r45.hx0 hx0Var = new r45.hx0();
        switch (i17) {
            case 101:
                j12Var = new r45.j12();
                j12Var.set(2, itemList);
                eVar = j12Var;
                break;
            case 102:
                j12Var = new r45.i12();
                j12Var.set(2, itemList);
                eVar = j12Var;
                break;
            case 103:
                eVar = new r45.h12();
                eVar.set(3, (r45.y46) kz5.n0.Z(itemList));
                break;
            default:
                eVar = null;
                break;
        }
        if (eVar != null) {
            hx0Var.set(0, java.lang.Integer.valueOf(i17));
            hx0Var.set(1, com.tencent.mm.protobuf.g.b(eVar != null ? eVar.toByteArray() : null));
        }
        return hx0Var;
    }

    public final com.tencent.mm.sdk.platformtools.o4 I0() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("_finder_live_mmkv" + gm0.j1.b().h());
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final boolean I1(gk2.e eVar) {
        return pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 8388608);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0034. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0037. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:173:0x024a A[Catch: Exception -> 0x02e2, TRY_LEAVE, TryCatch #18 {Exception -> 0x02e2, blocks: (B:3:0x000a, B:6:0x001b, B:14:0x0031, B:15:0x0034, B:16:0x0037, B:19:0x02de, B:23:0x003c, B:25:0x0047, B:33:0x0055, B:27:0x005c, B:35:0x0063, B:37:0x006e, B:41:0x0087, B:46:0x007d, B:48:0x008e, B:50:0x0099, B:54:0x00b2, B:59:0x00a8, B:61:0x00b9, B:63:0x00c4, B:70:0x00d2, B:65:0x00d9, B:72:0x00e0, B:74:0x00eb, B:81:0x00f9, B:76:0x0100, B:83:0x0107, B:85:0x0112, B:92:0x0120, B:87:0x0127, B:94:0x012e, B:96:0x0139, B:103:0x0147, B:98:0x014e, B:105:0x0155, B:107:0x0160, B:114:0x016e, B:109:0x0175, B:116:0x017c, B:118:0x0187, B:125:0x0195, B:120:0x019c, B:127:0x01a3, B:129:0x01ae, B:136:0x01bc, B:131:0x01c3, B:138:0x01ca, B:140:0x01d5, B:147:0x01e3, B:142:0x01ea, B:149:0x01f1, B:151:0x01fc, B:158:0x020a, B:153:0x0211, B:160:0x0218, B:162:0x0223, B:169:0x0231, B:164:0x0238, B:171:0x023f, B:173:0x024a, B:180:0x0258, B:175:0x025f, B:182:0x026a, B:184:0x0275, B:191:0x0283, B:186:0x028a, B:193:0x0290, B:195:0x029b, B:202:0x02a9, B:197:0x02b0, B:204:0x02b6, B:206:0x02c1, B:213:0x02cf, B:208:0x02d6, B:217:0x0014, B:166:0x022c, B:210:0x02ca, B:111:0x0169, B:155:0x0205, B:78:0x00f4, B:177:0x0253, B:122:0x0190, B:30:0x0050, B:5:0x000f, B:67:0x00cd, B:89:0x011b, B:43:0x0078, B:133:0x01b7, B:199:0x02a4, B:56:0x00a3, B:100:0x0142, B:188:0x027e, B:144:0x01de), top: B:2:0x000a, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[Catch: Exception -> 0x02e2, TryCatch #18 {Exception -> 0x02e2, blocks: (B:3:0x000a, B:6:0x001b, B:14:0x0031, B:15:0x0034, B:16:0x0037, B:19:0x02de, B:23:0x003c, B:25:0x0047, B:33:0x0055, B:27:0x005c, B:35:0x0063, B:37:0x006e, B:41:0x0087, B:46:0x007d, B:48:0x008e, B:50:0x0099, B:54:0x00b2, B:59:0x00a8, B:61:0x00b9, B:63:0x00c4, B:70:0x00d2, B:65:0x00d9, B:72:0x00e0, B:74:0x00eb, B:81:0x00f9, B:76:0x0100, B:83:0x0107, B:85:0x0112, B:92:0x0120, B:87:0x0127, B:94:0x012e, B:96:0x0139, B:103:0x0147, B:98:0x014e, B:105:0x0155, B:107:0x0160, B:114:0x016e, B:109:0x0175, B:116:0x017c, B:118:0x0187, B:125:0x0195, B:120:0x019c, B:127:0x01a3, B:129:0x01ae, B:136:0x01bc, B:131:0x01c3, B:138:0x01ca, B:140:0x01d5, B:147:0x01e3, B:142:0x01ea, B:149:0x01f1, B:151:0x01fc, B:158:0x020a, B:153:0x0211, B:160:0x0218, B:162:0x0223, B:169:0x0231, B:164:0x0238, B:171:0x023f, B:173:0x024a, B:180:0x0258, B:175:0x025f, B:182:0x026a, B:184:0x0275, B:191:0x0283, B:186:0x028a, B:193:0x0290, B:195:0x029b, B:202:0x02a9, B:197:0x02b0, B:204:0x02b6, B:206:0x02c1, B:213:0x02cf, B:208:0x02d6, B:217:0x0014, B:166:0x022c, B:210:0x02ca, B:111:0x0169, B:155:0x0205, B:78:0x00f4, B:177:0x0253, B:122:0x0190, B:30:0x0050, B:5:0x000f, B:67:0x00cd, B:89:0x011b, B:43:0x0078, B:133:0x01b7, B:199:0x02a4, B:56:0x00a3, B:100:0x0142, B:188:0x027e, B:144:0x01de), top: B:2:0x000a, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2 A[Catch: Exception -> 0x02e2, TryCatch #18 {Exception -> 0x02e2, blocks: (B:3:0x000a, B:6:0x001b, B:14:0x0031, B:15:0x0034, B:16:0x0037, B:19:0x02de, B:23:0x003c, B:25:0x0047, B:33:0x0055, B:27:0x005c, B:35:0x0063, B:37:0x006e, B:41:0x0087, B:46:0x007d, B:48:0x008e, B:50:0x0099, B:54:0x00b2, B:59:0x00a8, B:61:0x00b9, B:63:0x00c4, B:70:0x00d2, B:65:0x00d9, B:72:0x00e0, B:74:0x00eb, B:81:0x00f9, B:76:0x0100, B:83:0x0107, B:85:0x0112, B:92:0x0120, B:87:0x0127, B:94:0x012e, B:96:0x0139, B:103:0x0147, B:98:0x014e, B:105:0x0155, B:107:0x0160, B:114:0x016e, B:109:0x0175, B:116:0x017c, B:118:0x0187, B:125:0x0195, B:120:0x019c, B:127:0x01a3, B:129:0x01ae, B:136:0x01bc, B:131:0x01c3, B:138:0x01ca, B:140:0x01d5, B:147:0x01e3, B:142:0x01ea, B:149:0x01f1, B:151:0x01fc, B:158:0x020a, B:153:0x0211, B:160:0x0218, B:162:0x0223, B:169:0x0231, B:164:0x0238, B:171:0x023f, B:173:0x024a, B:180:0x0258, B:175:0x025f, B:182:0x026a, B:184:0x0275, B:191:0x0283, B:186:0x028a, B:193:0x0290, B:195:0x029b, B:202:0x02a9, B:197:0x02b0, B:204:0x02b6, B:206:0x02c1, B:213:0x02cf, B:208:0x02d6, B:217:0x0014, B:166:0x022c, B:210:0x02ca, B:111:0x0169, B:155:0x0205, B:78:0x00f4, B:177:0x0253, B:122:0x0190, B:30:0x0050, B:5:0x000f, B:67:0x00cd, B:89:0x011b, B:43:0x0078, B:133:0x01b7, B:199:0x02a4, B:56:0x00a3, B:100:0x0142, B:188:0x027e, B:144:0x01de), top: B:2:0x000a, inners: #0, #1, #2, #3, #4, #5, #6, #7, #8, #9, #10, #11, #12, #13, #14, #15, #16, #17 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cm2.t I2(byte[] r8) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.I2(byte[]):cm2.t");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(gk2.e r10, r45.ba4 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.J(gk2.e, r45.ba4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final java.lang.String J0(android.content.Context context, java.util.LinkedList rewardList) {
        r45.b62 b62Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rewardList, "rewardList");
        java.util.Iterator it = rewardList.iterator();
        if (it.hasNext()) {
            ?? next = it.next();
            if (it.hasNext()) {
                zl2.r4 r4Var = f473950a;
                long Y0 = r4Var.Y0((r45.b62) next);
                do {
                    java.lang.Object next2 = it.next();
                    long Y02 = r4Var.Y0((r45.b62) next2);
                    next = next;
                    if (Y0 < Y02) {
                        next = next2;
                        Y0 = Y02;
                    }
                } while (it.hasNext());
            }
            b62Var = next;
        } else {
            b62Var = null;
        }
        r45.b62 b62Var2 = b62Var;
        return b62Var2 != null ? X0(b62Var2, context) : "";
    }

    public final boolean J1(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        int i17 = ((mm2.c1) buContext.a(mm2.c1.class)).Q1;
        boolean z17 = i17 != -1 ? pm0.v.z(i17, 2097152) : false;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisableComment] isDisable = " + z17);
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r45.f52 J2(so2.j5 data) {
        r45.f52 f52Var;
        kotlin.jvm.internal.o.g(data, "data");
        try {
            if (data instanceof cm2.h0) {
                f52Var = new r45.f52();
                f52Var.set(0, 4);
            } else if (data instanceof cm2.y) {
                f52Var = new r45.f52();
                f52Var.set(0, 1);
            } else if (data instanceof cm2.x) {
                f52Var = new r45.f52();
                f52Var.set(0, 2);
            } else if (data instanceof cm2.z) {
                f52Var = new r45.f52();
                f52Var.set(0, 3);
            } else if (data instanceof cm2.m0) {
                f52Var = new r45.f52();
                f52Var.set(0, 5);
            } else if (data instanceof cm2.i0) {
                f52Var = new r45.f52();
                f52Var.set(0, 21);
            } else if (data instanceof cm2.k0) {
                f52Var = new r45.f52();
                f52Var.set(0, 6);
            } else if (data instanceof cm2.f0) {
                f52Var = new r45.f52();
                f52Var.set(0, 7);
            } else if (data instanceof cm2.v) {
                f52Var = new r45.f52();
                f52Var.set(0, 8);
            } else if (data instanceof cm2.u) {
                f52Var = new r45.f52();
                f52Var.set(0, 11);
            } else if (data instanceof cm2.d0) {
                f52Var = new r45.f52();
                f52Var.set(0, 13);
            } else if (data instanceof cm2.a0) {
                f52Var = new r45.f52();
                f52Var.set(0, 14);
            } else if (data instanceof cm2.b0) {
                f52Var = new r45.f52();
                cm2.b0 b0Var = data instanceof cm2.b0 ? (cm2.b0) data : null;
                f52Var.set(0, java.lang.Integer.valueOf(b0Var != null ? b0Var.f43332w : 999));
            } else if (data instanceof cm2.g0) {
                f52Var = new r45.f52();
                f52Var.set(0, 19);
            } else if (data instanceof cm2.c0) {
                f52Var = new r45.f52();
                f52Var.set(0, 20);
            } else {
                f52Var = null;
            }
            if (f52Var == null) {
                return f52Var;
            }
            try {
                r0 = data instanceof cm2.t ? (cm2.t) data : null;
                if (r0 == null) {
                    return f52Var;
                }
                r0.f(f52Var);
                return f52Var;
            } catch (java.lang.Exception e17) {
                e = e17;
                r0 = f52Var;
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "e.msg = " + e.getMessage());
                return r0;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public final void K(int i17, android.content.Context context, gk2.e buContext) {
        r45.cz1 cz1Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (pm0.v.z(i17, 1)) {
            db5.t7.f(context, context.getResources().getString(com.tencent.mm.R.string.dot), zl2.m1.f473886a);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPostComment attended lottery success,lotteryId:");
            km2.z zVar = ((on2.z2) buContext.a(on2.z2.class)).f347092m;
            sb6.append((zVar == null || (cz1Var = zVar.f309232d) == null) ? null : cz1Var.getString(0));
            com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", sb6.toString());
            if (!w1()) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.ek((ml2.r0) c17, ml2.p4.f327798i, "", null, 0, null, 28, null);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_popup_joined_toast", null, um2.x5.f429020x1.a(), 25561);
            }
        }
        if (pm0.v.z(i17, 8)) {
            db5.t7.f(context, context.getResources().getString(com.tencent.mm.R.string.nuf), zl2.n1.f473899a);
            com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", "doPostComment MMFinderLiveStatusFlag_AttendedLiveGiftActivity success");
        }
        if (pm0.v.z(i17, 2)) {
            db5.t7.f(context, context.getResources().getString(com.tencent.mm.R.string.dot), zl2.o1.f473908a);
            mm2.v4 v4Var = (mm2.v4) buContext.a(mm2.v4.class);
            com.tencent.mars.xlog.Log.i(v4Var.f329476f, "participateCurrentLottery");
            r45.f02 f02Var = (r45.f02) ((kotlinx.coroutines.flow.h3) v4Var.f329479i).getValue();
            v4Var.S6(f02Var != null ? f02Var.f373878d : null, null);
        }
        if (pm0.v.z(i17, 4)) {
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.dzd), 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011c A[LOOP:1: B:28:0x011c->B:30:0x0138, LOOP_START, PHI: r10
  0x011c: PHI (r10v10 int) = (r10v6 int), (r10v11 int) binds: [B:27:0x011a, B:30:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList K0(int r20, java.util.Date r21, java.util.Date r22, java.util.Date r23, java.util.Date r24, java.util.Date r25) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.K0(int, java.util.Date, java.util.Date, java.util.Date, java.util.Date, java.util.Date):java.util.ArrayList");
    }

    public final boolean K1(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = pm0.v.z(((mm2.c1) buContext.a(mm2.c1.class)).Q1, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisableCommentFakeInsert] isDisable = " + z17);
        return z17;
    }

    public final void K2(java.lang.String scene, r45.qy1 msgInfo) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[" + scene + "-preLoadTingBubbleImgAndColor], needPreLoad = " + msgInfo.getBoolean(4));
        if (msgInfo.getBoolean(4)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).hj("DEFAULT_TING_COLOR_BG_KEY", null, com.tencent.mm.sdk.platformtools.x.K0(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.ting_image_empty_lightmode, 0)), null);
            bw5.mb0 P0 = P0(msgInfo);
            pf5.u uVar = pf5.u.f353936a;
            if (P0 != null && (c17 = P0.c()) != null) {
                if (!(c17.length() > 0)) {
                    c17 = null;
                }
                if (c17 != null) {
                    wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(c17, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                    zl2.b3 b3Var = new zl2.b3(c17);
                    a17.getClass();
                    a17.f447873d = b3Var;
                    a17.f();
                }
            }
            java.lang.String string = msgInfo.getString(1);
            if (string != null) {
                java.lang.String str = string.length() > 0 ? string : null;
                if (str != null) {
                    new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f)).f();
                }
            }
        }
    }

    public final boolean L(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3734e5).getValue()).r()).booleanValue()) {
            return true;
        }
        ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K0).getValue()).r()).intValue();
        return ((mm2.e1) buContext.a(mm2.e1.class)).a7() ? ((mm2.o2) buContext.a(mm2.o2.class)).f329306o : ((mm2.c1) buContext.a(mm2.c1.class)).E1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList L0(java.util.ArrayList r23, java.util.Date r24, java.util.Date r25, java.util.Date r26, java.util.Date r27, java.util.Date r28) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.L0(java.util.ArrayList, java.util.Date, java.util.Date, java.util.Date, java.util.Date, java.util.Date):java.util.ArrayList");
    }

    public final boolean L1(gk2.e buContext, df2.ih ihVar) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = true;
        if (!((mm2.c1) buContext.a(mm2.c1.class)).a8()) {
            z17 = true ^ pm0.v.z((int) gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L), 32768);
        } else if (ihVar != null) {
            z17 = ihVar.f230403t;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisableEmojiComment] result = " + z17);
        return z17;
    }

    public final void L2(com.tencent.mm.ui.MMActivity activity, gk2.e liveData, r45.xl1 xl1Var, yz5.a aVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        if (!(activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI) && !W1(liveData)) {
            if (!(sn0.b.f409964e2 != null)) {
                if (!(in0.q.f292769b2 != null)) {
                    return;
                }
            }
        }
        java.util.LinkedList list = xl1Var != null ? xl1Var.getList(1) : null;
        if ((list == null || list.isEmpty()) || !((mm2.c1) liveData.a(mm2.c1.class)).Z6().f233876e.isEmpty()) {
            return;
        }
        dk2.p Z6 = ((mm2.c1) liveData.a(mm2.c1.class)).Z6();
        java.util.LinkedList list2 = xl1Var != null ? xl1Var.getList(1) : null;
        int i17 = ((mm2.c1) liveData.a(mm2.c1.class)).f328813h2;
        Z6.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initSongId liveStatus:");
        sb6.append(i17);
        sb6.append(", size:");
        sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
        sb6.append(", curPlayPos:");
        sb6.append(Z6.f233875d);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicData", sb6.toString());
        if (list2 != null) {
            Z6.f233876e = list2;
        }
        java.util.LinkedList g17 = ((mm2.c1) liveData.a(mm2.c1.class)).Z6().g(false);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "prepareAnchorMusicInfo updateMusicList:" + g17);
        new ek2.m0(((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) liveData.a(mm2.e1.class)).f328985o, xy2.c.e(activity), ((mm2.e1) liveData.a(mm2.e1.class)).f328983m, 1, g17, new zl2.c3(liveData, aVar)).l().f(activity);
    }

    public final boolean M() {
        boolean o17;
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3857q8).getValue()).r()).intValue();
        if (intValue == 1) {
            return true;
        }
        if (intValue == 2) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null && e1Var.a7()) {
            mm2.o2 o2Var = (mm2.o2) efVar.i(mm2.o2.class);
            o17 = o2Var != null ? o2Var.f329308q : false;
        } else {
            o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false);
        }
        return o17 || ((java.lang.Number) inVar.M().r()).intValue() == 1;
    }

    public final long M0() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.X1).getValue()).r()).intValue() == 1 ? java.lang.System.currentTimeMillis() : c01.id.c();
    }

    public final boolean M1(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = pm0.v.z(((mm2.c1) buContext.a(mm2.c1.class)).Q1, 524288);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisableLikeHeadIcon] isDisable = " + z17);
        return z17;
    }

    public final void M2(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i(tag.concat("(Debug)"), msg);
        }
    }

    public final void N0(java.util.ArrayList result, int i17) {
        kotlin.jvm.internal.o.g(result, "result");
        for (int i18 = 0; i18 < 24; i18++) {
            result.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(i17, zl2.q4.f473933a.z(i18)));
        }
    }

    public final boolean N1(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = pm0.v.z(((mm2.c1) buContext.a(mm2.c1.class)).Q1, 8388608);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisableLinkMic] isDisable = " + z17);
        return z17;
    }

    public final void N2(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (zl2.q4.f473933a.E()) {
            com.tencent.mm.sdk.platformtools.Log.c(tag, msg, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.i(tag, msg);
        }
    }

    public final void O(org.json.JSONObject json, java.lang.String emojiMd5, com.tencent.mm.protobuf.g emojiBuffer) {
        kotlin.jvm.internal.o.g(json, "json");
        kotlin.jvm.internal.o.g(emojiMd5, "emojiMd5");
        kotlin.jvm.internal.o.g(emojiBuffer, "emojiBuffer");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).Bi(emojiMd5, emojiBuffer);
        java.lang.String str = emojiInfo.field_groupId;
        if (str == null) {
            str = "";
        }
        json.put("emoji_pid", str);
        java.lang.String md52 = emojiInfo.getMd5();
        if (md52 == null) {
            md52 = "";
        }
        json.put("emoji_md5", md52);
        java.lang.String str2 = emojiInfo.field_designerID;
        if (str2 == null) {
            str2 = "";
        }
        json.put("emoji_designer_id", str2);
        java.lang.String str3 = emojiInfo.field_activityid;
        json.put("emoji_activity_id", str3 != null ? str3 : "");
    }

    public final boolean O0() {
        boolean z17 = (c01.z1.i() & 1073741824) == 0;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getPlayDesktopSwitch " + z17);
        return z17;
    }

    public final boolean O1(boolean z17) {
        int r17 = !z17 ? gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GLOBAL_FLAG_INT_SYNC, 0) : gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_GLOBAL_FLAG_INT_SYNC, 0);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisablePrivateLive] isGameLive = " + z17 + ", globalFlag = " + r17);
        return pm0.v.z(r17, 2);
    }

    public final java.lang.String O2(java.lang.String prefix, java.util.LinkedList visitorRoleList, int i17, long j17) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(visitorRoleList, "visitorRoleList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[printVisitorRoleInfo]" + prefix + ":curVisitorRoleType:" + i17 + ";visitorRoleModifyTime:" + j17 + ';');
        synchronized (visitorRoleList) {
            int i18 = 0;
            for (java.lang.Object obj : visitorRoleList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Object obj2 = (r45.of1) obj;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append('[');
                sb7.append(i18);
                sb7.append(':');
                if (obj2 == null) {
                    obj2 = "";
                }
                sb7.append(pm0.b0.g(obj2));
                sb7.append(']');
                sb6.append(sb7.toString());
                i18 = i19;
            }
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    public final boolean P(android.widget.ImageView imageView, java.lang.String path, int i17, int i18) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(path, "path");
        android.graphics.Bitmap u27 = u2(path, i17, i18);
        imageView.setImageBitmap(u27);
        return u27 != null;
    }

    public final bw5.mb0 P0(r45.qy1 qy1Var) {
        kotlin.jvm.internal.o.g(qy1Var, "<this>");
        try {
            com.tencent.mm.protobuf.g byteString = qy1Var.getByteString(0);
            if (byteString != null) {
                return new bw5.mb0().parseFrom(byteString.g());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[FinderLiveListenPromoteInfo.getPlayInfo], e = " + e17.getMessage());
        }
        return null;
    }

    public final boolean P1(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = pm0.v.z(((mm2.c1) buContext.a(mm2.c1.class)).Q1, 4194304);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisableSendGift] isDisable = " + z17);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x06dd, code lost:
    
        if ((r4 != null && r4.getBoolean(8)) == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P2(android.view.View r28, ce2.i r29) {
        /*
            Method dump skipped, instructions count: 1981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.P2(android.view.View, ce2.i):void");
    }

    public final void Q(android.content.Context context, gk2.e data, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        R(context, data, ((mm2.d) data.a(mm2.d.class)).f328943g, true, 1, lVar);
    }

    public final l81.b1 Q0(r45.ce0 page, int i17) {
        kotlin.jvm.internal.o.g(page, "page");
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = page.getString(0);
        b1Var.f317022f = page.getString(1);
        dk2.ah ahVar = new dk2.ah();
        ahVar.f233213f = 1;
        ahVar.f233222r = i17;
        b1Var.f317028i = ahVar;
        b1Var.f317032k = w1() ? 1176 : 1177;
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, 10, null, false, null, false, null, null, false, false, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -4, 2047, null);
        b1Var.f317012a = page.getString(4);
        b1Var.f317016c = zl2.q4.f473933a.x();
        return b1Var;
    }

    public final boolean Q1(gk2.e eVar) {
        return !pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 268435456);
    }

    public final boolean Q2(android.view.View child) {
        kotlin.jvm.internal.o.g(child, "child");
        android.view.ViewParent parent = child.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(child);
        }
        return viewGroup != null;
    }

    public final void R(android.content.Context context, gk2.e data, java.lang.String username, boolean z17, int i17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(username, "username");
        if (!(username.length() > 0)) {
            username = null;
        }
        java.lang.String str = username;
        if (str != null) {
            o25.a aVar = new o25.a();
            aVar.f342464b = 215;
            aVar.f342468f = i17;
            aVar.f342469g = false;
            aVar.f342465c = java.lang.String.valueOf(((mm2.e1) data.a(mm2.e1.class)).f328988r.getLong(0));
            aVar.f342470h = z17;
            ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).Ai(context, str, 215, true, new zl2.r1(lVar, str), aVar)).f();
        }
    }

    public final int R0(gk2.e liveData, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        int i17 = 0;
        boolean z19 = com.tencent.mm.ui.bk.Q() && com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.P(com.tencent.mm.sdk.platformtools.x2.f193071a) || com.tencent.mm.ui.bk.O(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver()) || com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).x > com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getRenderMode isFolderOpen: " + z19 + " realX: " + com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).x);
        int P6 = ((mm2.c1) liveData.a(mm2.c1.class)).P6();
        if (P6 == 0) {
            i17 = 5;
            if (!z18 && !((mm2.c1) liveData.a(mm2.c1.class)).Y4 && (((mm2.c1) liveData.a(mm2.c1.class)).S7() || (!((mm2.c1) liveData.a(mm2.c1.class)).R7() && !z17))) {
                i17 = 2;
            }
        } else if (P6 != 1) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "unknown audienceMode:" + ((mm2.c1) liveData.a(mm2.c1.class)).P6());
        } else if (z19 || z18 || ((mm2.c1) liveData.a(mm2.c1.class)).Y4 || (!((mm2.c1) liveData.a(mm2.c1.class)).S7() && (((mm2.c1) liveData.a(mm2.c1.class)).R7() || z17))) {
            i17 = 1;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getRenderMode audienceMode:" + ((mm2.c1) liveData.a(mm2.c1.class)).P6() + ", renderMode:" + i17);
        return i17;
    }

    public final void R2(android.view.View view, android.graphics.Bitmap coverBgBitmap) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(coverBgBitmap, "coverBgBitmap");
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setImageBitmap(coverBgBitmap);
        } else {
            view.setBackgroundDrawable(new defpackage.a(coverBgBitmap));
        }
    }

    public final jz5.l S0(int i17, r45.nw1 liveInfo, int i18) {
        r45.j72 j72Var;
        jz5.l lVar;
        kotlin.jvm.internal.o.g(liveInfo, "liveInfo");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        jz5.l lVar2 = new jz5.l(bool, null);
        r45.i72 i72Var = (r45.i72) liveInfo.getCustom(44);
        if (i72Var != null && (j72Var = (r45.j72) i72Var.getCustom(5)) != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getReplayTransitionInfo source:" + i17 + ",customerChooseVideoLevel:" + i18 + ",supportHevc:" + f473950a.i0() + ",liveInfo:" + liveInfo.hashCode() + ',' + cm2.a.f43328a.m((r45.i72) liveInfo.getCustom(44)) + '!');
            if (j72Var.getInteger(2) == 1) {
                U0(j72Var, j72Var.getInteger(1));
            } else {
                if (i18 >= 0) {
                    r45.gv U0 = U0(j72Var, i18);
                    if (U0 == null) {
                        com.tencent.mars.xlog.Log.w("FinderLiveUtil", "getReplayTransitionInfo find info to match customer video level,but result is null!");
                        r45.gv U02 = U0(j72Var, j72Var.getInteger(1));
                        if (U02 != null) {
                            lVar = new jz5.l(java.lang.Boolean.TRUE, U02);
                        } else {
                            r45.gv T0 = T0(j72Var);
                            com.tencent.mars.xlog.Log.w("FinderLiveUtil", "getReplayTransitionInfo find back info!");
                            lVar = new jz5.l(bool, T0);
                        }
                    } else {
                        lVar = new jz5.l(java.lang.Boolean.TRUE, U0);
                    }
                } else {
                    r45.gv U03 = U0(j72Var, j72Var.getInteger(1));
                    if (U03 != null) {
                        lVar = new jz5.l(java.lang.Boolean.TRUE, U03);
                    } else {
                        r45.gv T02 = T0(j72Var);
                        com.tencent.mars.xlog.Log.w("FinderLiveUtil", "getReplayTransitionInfo find back info!");
                        lVar = new jz5.l(bool, T02);
                    }
                }
                lVar2 = lVar;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getReplayTransitionInfo source:");
        sb6.append(i17);
        sb6.append(" result:");
        sb6.append(((java.lang.Boolean) lVar2.f302833d).booleanValue());
        sb6.append(',');
        r45.gv gvVar = (r45.gv) lVar2.f302834e;
        sb6.append(gvVar != null ? gvVar.f375537e : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        return lVar2;
    }

    public final boolean S1(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true).r2();
    }

    public final void S2(gk2.e buContext, int i17) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (((mm2.c1) buContext.a(mm2.c1.class)).T7()) {
            cl0.g gVar = new cl0.g();
            gVar.o("event_type", i17);
            gVar.o("windows_type", ((mm2.c1) buContext.a(mm2.c1.class)).O7() ? 2 : 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            zy2.zb.j5(zbVar, 55L, r26.i0.t(gVar2, ",", ";", false), null, 4, null);
            com.tencent.mars.xlog.Log.i("reportMiniWindowOnLiveBefore", "report = " + gVar);
        }
    }

    public final r45.o72 T(android.content.Context context, long j17, java.lang.String tag) {
        java.lang.String str;
        r45.ta4 e17;
        boolean z17;
        long parseLong;
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(tag, "tag");
        r45.o72 o72Var = new r45.o72();
        if (context != null) {
            pf5.u uVar = pf5.u.f353936a;
            o72Var.set(0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) uVar.b(context).c(zy2.ra.class))).f135387s);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            o72Var.set(1, Ri);
            o72Var.set(2, java.lang.Long.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(j17)));
            java.lang.String str2 = ((ml2.r0) i95.n0.c(ml2.r0.class)).H1;
            o72Var.set(4, str2 != null ? r26.i0.t(str2, ",", ";", false) : "");
            o72Var.set(3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) uVar.b(context).c(zy2.ra.class))).f135388t;
            gk2.e eVar = gk2.e.f272471n;
            o72Var.set(13, java.lang.Integer.valueOf((eVar == null || (num = ((mm2.e1) eVar.a(mm2.e1.class)).f328982i) == null) ? 0 : num.intValue()));
            boolean z18 = str3 == null || str3.length() == 0;
            zl2.r4 r4Var = f473950a;
            o72Var.set(5, z18 ? r4Var.w0(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "exposeType") : r4Var.w0(str3, "exposeType"));
            o72Var.set(10, java.lang.Integer.valueOf(str3 == null || str3.length() == 0 ? com.tencent.mm.sdk.platformtools.b8.a(r4Var.w0(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "main_page_position")) : com.tencent.mm.sdk.platformtools.b8.a(r4Var.w0(str3, "main_page_position"))));
            java.lang.String str4 = ((ml2.r0) i95.n0.c(ml2.r0.class)).f327872m;
            ml2.q1 q1Var = ml2.q1.f327812e;
            if (kotlin.jvm.internal.o.b(str4, "temp_6") && kotlin.jvm.internal.o.b(((m30.o) ((n30.s) i95.n0.c(n30.s.class))).wi(), "111")) {
                ml2.q1 q1Var2 = ml2.q1.f327812e;
                str = "temp_7";
            } else {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                str = a52.a.f1584l;
                if (str == null) {
                    str = "";
                }
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            o72Var.set(8, java.lang.Long.valueOf(y4Var.e(str, y4Var.I.f327569d)));
            o72Var.set(7, r4Var.w0(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type"));
            o72Var.set(19, str);
            gk2.e eVar2 = gk2.e.f272471n;
            o72Var.set(9, java.lang.Long.valueOf(eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f328981h : 0L));
            com.tencent.mars.xlog.Log.i(tag, "FinderLiveCommentScene get " + o72Var.getString(19) + " when genLiveReportObj1 ad_flag: " + o72Var.getInteger(13) + " main_page_position: " + o72Var.getInteger(10));
            try {
                if (r26.n0.L(str, "temp_", 0, false, 6, null) == -1) {
                    parseLong = 0;
                    z17 = false;
                } else {
                    z17 = false;
                    parseLong = java.lang.Long.parseLong(r26.i0.t(str, "temp_", "", false));
                }
                o72Var.set(6, java.lang.Long.valueOf(parseLong));
                long c17 = (str3 == null || str3.length() == 0) ? true : z17 ? com.tencent.mm.sdk.platformtools.b8.c(r4Var.w0(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "general_type")) : com.tencent.mm.sdk.platformtools.b8.c(r4Var.w0(str3, "general_type"));
                java.lang.String w07 = (str3 == null || str3.length() == 0) ? true : z17 ? r4Var.w0(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "general_uxinfo") : r4Var.w0(str3, "general_uxinfo");
                ((im2.t6) uVar.b(context).a(im2.t6.class)).R6(o72Var);
                if (c17 != 0) {
                    com.tencent.mars.xlog.Log.i(tag, "general_type " + c17 + " general_uxinfo length " + w07.length());
                    if (((r45.k30) o72Var.getCustom(16)) == null ? true : z17) {
                        o72Var.set(16, new r45.k30());
                    }
                    r45.k30 k30Var = (r45.k30) o72Var.getCustom(16);
                    if (k30Var != null) {
                        k30Var.set(8, java.lang.Long.valueOf(c17));
                    }
                    r45.k30 k30Var2 = (r45.k30) o72Var.getCustom(16);
                    if (k30Var2 != null) {
                        k30Var2.set(9, w07);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e(tag, "genLiveReportObj err:" + e18.getMessage());
            }
            dk2.ef efVar = dk2.ef.f233372a;
            km2.n nVar = dk2.ef.H;
            if (nVar != null && (e17 = nVar.e()) != null) {
                o72Var.set(15, java.lang.Integer.valueOf(e17.getInteger(10)));
            }
        }
        com.tencent.mars.xlog.Log.i(tag, "enter_icon_type :" + o72Var.getLong(8) + " chnl_enter_immerse_type: " + o72Var.getString(7) + " chnl_expose_type: " + o72Var.getString(5));
        return o72Var;
    }

    public final boolean T1(r45.q12 q12Var) {
        return (q12Var != null ? q12Var.getInteger(0) : 0) == 3;
    }

    public final void T2(int i17) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.I1, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final java.util.Map U(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("finder_username", ((mm2.c1) liveData.a(mm2.c1.class)).f328852o);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[1] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[2] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        lVarArr[3] = new jz5.l("finder_tab_context_id", c17 != null ? c17 : "");
        lVarArr[4] = new jz5.l("live_id", java.lang.Long.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0)));
        return kz5.c1.k(lVarArr);
    }

    public final boolean U1(gk2.e eVar) {
        return pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 128);
    }

    public final void U2(java.util.LinkedList linkedList) {
        try {
            r45.pf1 pf1Var = new r45.pf1();
            if (linkedList == null) {
                linkedList = new java.util.LinkedList();
            }
            pf1Var.set(0, linkedList);
            byte[] byteArray = pf1Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ALIAS_LIST1_STRING_SYNC, new java.lang.String(byteArray, r26.c.f368867c));
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "saveAliasInfoList cacheListStr:" + pm0.b0.g(pf1Var));
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "saveAliasInfoList:" + e17.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            oz5.n r0 = new oz5.n
            kotlin.coroutines.Continuation r9 = pz5.f.b(r9)
            r0.<init>(r9)
            jz5.f0 r9 = jz5.f0.f302826a
            java.lang.String r1 = "getSecSdkImageInfoBuffers(...)"
            fo3.s r2 = fo3.s.INSTANCE
            r3 = 1
            r4 = 0
            r5 = 0
            if (r8 == 0) goto L4b
            int r6 = r8.length()
            if (r6 <= 0) goto L1c
            r6 = r3
            goto L1d
        L1c:
            r6 = r4
        L1d:
            if (r6 == 0) goto L27
            boolean r6 = com.tencent.mm.vfs.w6.j(r8)
            if (r6 == 0) goto L27
            r6 = r3
            goto L28
        L27:
            r6 = r4
        L28:
            if (r6 == 0) goto L2c
            r6 = r8
            goto L2d
        L2c:
            r6 = r5
        L2d:
            if (r6 == 0) goto L4b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r8)
            java.util.ArrayList r6 = r2.id(r6)
            kotlin.jvm.internal.o.f(r6, r1)
            java.lang.Object r6 = kz5.n0.Z(r6)
            java.lang.Object r6 = kotlin.Result.m521constructorimpl(r6)
            r0.resumeWith(r6)
            r6 = r9
            goto L4c
        L4b:
            r6 = r5
        L4c:
            if (r6 != 0) goto Lae
            if (r8 == 0) goto La4
            int r6 = r8.length()
            if (r6 <= 0) goto L57
            goto L58
        L57:
            r3 = r4
        L58:
            if (r3 == 0) goto L5c
            r3 = r8
            goto L5d
        L5c:
            r3 = r5
        L5d:
            if (r3 == 0) goto La4
            mn2.n r3 = new mn2.n
            r6 = 2
            r3.<init>(r8, r5, r6, r5)
            java.lang.String r3 = r3.getPath()
            boolean r6 = com.tencent.mm.vfs.w6.j(r3)
            if (r6 == 0) goto L8a
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r3)
            java.util.ArrayList r8 = r2.id(r8)
            kotlin.jvm.internal.o.f(r8, r1)
            java.lang.Object r8 = kz5.n0.Z(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
            r0.resumeWith(r8)
            goto La5
        L8a:
            n11.a r1 = n11.a.b()
            o11.f r2 = new o11.f
            r2.<init>()
            r2.f342082f = r3
            r2.f342078b = r4
            o11.g r2 = r2.a()
            zl2.s1 r4 = new zl2.s1
            r4.<init>(r0, r8, r3)
            r1.d(r8, r2, r4)
            goto La5
        La4:
            r9 = r5
        La5:
            if (r9 != 0) goto Lae
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r5)
            r0.resumeWith(r8)
        Lae:
            java.lang.Object r8 = r0.a()
            pz5.a r9 = pz5.a.f359186d
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.V(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int V0(android.view.ViewGroup parentView, int[] exceptId) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        kotlin.jvm.internal.o.g(exceptId, "exceptId");
        int width = (parentView.getWidth() - parentView.getPaddingLeft()) - parentView.getPaddingRight();
        int childCount = parentView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parentView.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if (!kz5.z.F(exceptId, childAt.getId()) && childAt.getVisibility() == 0) {
                int width2 = childAt.getWidth();
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                int i18 = width2 + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                width -= i18 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            }
        }
        return width;
    }

    public final boolean V1(gk2.e buContext) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        so2.j5 j5Var = ((mm2.f6) buContext.a(mm2.f6.class)).f329049w;
        cm2.f0 f0Var = j5Var instanceof cm2.f0 ? (cm2.f0) j5Var : null;
        if (f0Var == null) {
            return false;
        }
        java.util.LinkedList list = f0Var.f43342v.getList(0);
        kotlin.jvm.internal.o.f(list, "getInfos(...)");
        r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(list);
        if (wd5Var != null && (string = wd5Var.getString(2)) != null) {
            r45.i52 a17 = com.tencent.mm.plugin.finder.live.util.k0.f115585a.a(string);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isGotRedPacket], full:");
            sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.getInteger(1)) : null);
            sb6.append(", status:");
            sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.getBoolean(0)) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
            r1 = java.lang.Boolean.valueOf((a17 != null && a17.getInteger(1) == 0) && a17.getBoolean(0));
        }
        if (r1 != null) {
            return r1.booleanValue();
        }
        return false;
    }

    public final void V2(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "savePlayDesktopSwitch " + z17);
        boolean z18 = z17 ^ true;
        long i17 = c01.z1.i();
        long j17 = z18 ? i17 | 1073741824 : (-1073741825) & i17;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "setExtStatus2FlagFromUserInfo flag:" + pm0.v.u(1073741824L) + ", " + pm0.v.u(i17) + ", " + pm0.v.u(j17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
        int i18 = z17 ? 2 : 1;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 93;
        p53Var.f382762e = i18;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }

    public final l81.b1 W(r45.dv1 dv1Var) {
        java.lang.String str;
        java.lang.String string;
        l81.b1 b1Var = new l81.b1();
        if (dv1Var != null) {
            r45.c33 c33Var = (r45.c33) dv1Var.getCustom(2);
            java.lang.String str2 = "";
            boolean z17 = false;
            if (c33Var == null || (str = c33Var.getString(0)) == null) {
                str = "";
            }
            b1Var.f317014b = str;
            r45.c33 c33Var2 = (r45.c33) dv1Var.getCustom(2);
            if (c33Var2 != null && (string = c33Var2.getString(1)) != null) {
                str2 = string;
            }
            b1Var.f317022f = str2;
            dk2.ah ahVar = new dk2.ah();
            ahVar.f233213f = 1;
            ahVar.f233222r = 1;
            b1Var.f317028i = ahVar;
            b1Var.f317032k = f473950a.w1() ? 1176 : 1177;
            b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, 10, null, false, null, false, null, null, false, false, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -4, 2047, null);
            r45.c33 c33Var3 = (r45.c33) dv1Var.getCustom(2);
            b1Var.f317012a = c33Var3 != null ? c33Var3.getString(2) : null;
            zl2.q4 q4Var = zl2.q4.f473933a;
            if (q4Var.E() && !com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f317012a)) {
                java.lang.String str3 = b1Var.f317012a;
                if (str3 != null && !r26.i0.n(str3, "@app", false)) {
                    z17 = true;
                }
                if (z17) {
                    b1Var.f317012a += "@app";
                }
            }
            b1Var.f317016c = q4Var.x();
        }
        return b1Var;
    }

    public final int W0(int i17) {
        int B = zl2.q4.f473933a.B(i17);
        if (B >= 0 && B < 50) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an);
        }
        if (50 <= B && B < 80) {
            return android.graphics.Color.parseColor("#FFE58F");
        }
        if (80 <= B && B < 90) {
            return android.graphics.Color.parseColor("#FFE9A1");
        }
        if (90 <= B && B < 100) {
            return android.graphics.Color.parseColor("#FFEFBA");
        }
        return 100 <= B && B <= Integer.MAX_VALUE ? android.graphics.Color.parseColor("#FFEFB9") : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an);
    }

    public final boolean W1(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        dk2.ef efVar = dk2.ef.f233372a;
        return !(dk2.ef.f233380e instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) && ((mm2.c1) liveData.a(mm2.c1.class)).C7() == 2;
    }

    public final void W2(java.util.LinkedList linkedList, int i17, long j17) {
        U2(linkedList);
        g92.b bVar = g92.b.f269769e;
        m92.f fVar = new m92.f();
        fVar.set(5, java.lang.Long.valueOf(j17));
        fVar.set(4, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[saveVisitorRoleInfo] current_alias_role_type:" + fVar.getInteger(4) + ", next_alias_mod_available_time:" + fVar.getLong(5));
        bVar.S1(fVar, m92.j.f324996n);
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", O2("saveVisitorRoleInfo USERINFO_FINDER_LIVE_VISITOR_ROLE_INT_SYNC", linkedList, i17, j17));
    }

    public final java.lang.String X(dk2.zf commentData) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(commentData, "commentData");
        if (!(commentData instanceof dk2.a8) || commentData.getType() != 20002) {
            return "";
        }
        r45.xn1 xn1Var = (r45.xn1) ((dk2.a8) commentData).f233186a.getCustom(0);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getNickname();
    }

    public final java.lang.String X0(r45.b62 b62Var, android.content.Context context) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(b62Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        int integer = b62Var.getInteger(0);
        if (integer == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Long.valueOf(((r45.c62) b62Var.getCustom(1)) != null ? r7.getInteger(0) : 0L);
            string = context.getString(com.tencent.mm.R.string.mpz, objArr);
        } else if (integer == 2) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r45.z37 z37Var = (r45.z37) b62Var.getCustom(2);
            objArr2[0] = java.lang.Long.valueOf(z37Var != null ? z37Var.getLong(0) : 0L);
            string = context.getString(com.tencent.mm.R.string.f491859mq3, objArr2);
        } else if (integer == 3) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            r45.gu3 gu3Var = (r45.gu3) b62Var.getCustom(3);
            objArr3[0] = java.lang.Long.valueOf(gu3Var != null ? gu3Var.getLong(0) : 0L);
            string = context.getString(com.tencent.mm.R.string.mpy, objArr3);
        } else if (integer != 4) {
            string = "";
        } else {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            r45.br0 br0Var = (r45.br0) b62Var.getCustom(4);
            objArr4[0] = java.lang.Long.valueOf(br0Var != null ? br0Var.getLong(0) : 0L);
            string = context.getString(com.tencent.mm.R.string.mpx, objArr4);
        }
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public final boolean X1(r45.q12 q12Var) {
        return (q12Var != null ? q12Var.getInteger(0) : 0) == 4;
    }

    public final void X2(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17, int i18) {
        android.view.Window window;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "activity:" + appCompatActivity + " set flag:" + i17 + " mask:" + i18);
        if (appCompatActivity == null || (window = appCompatActivity.getWindow()) == null) {
            return;
        }
        window.setFlags(i17, i18);
    }

    public final void Y(java.lang.String avatarUrl, yz5.l callback) {
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.o.g(callback, "callback");
        ff0.z zVar = (ff0.z) ((java.util.HashMap) f473959j).get(avatarUrl);
        if (zVar != null) {
            callback.invoke(java.lang.Integer.valueOf(zVar.f261597c));
        } else {
            t2(this, avatarUrl, new zl2.t1(callback), null, 4, null);
        }
    }

    public final long Y0(r45.b62 b62Var) {
        r45.br0 br0Var;
        kotlin.jvm.internal.o.g(b62Var, "<this>");
        int integer = b62Var.getInteger(0);
        if (integer == 1) {
            if (((r45.c62) b62Var.getCustom(1)) != null) {
                return r6.getInteger(0);
            }
            return 0L;
        }
        if (integer == 2) {
            r45.z37 z37Var = (r45.z37) b62Var.getCustom(2);
            if (z37Var != null) {
                return z37Var.getLong(0);
            }
            return 0L;
        }
        if (integer != 3) {
            if (integer == 4 && (br0Var = (r45.br0) b62Var.getCustom(4)) != null) {
                return br0Var.getLong(0);
            }
            return 0L;
        }
        r45.gu3 gu3Var = (r45.gu3) b62Var.getCustom(3);
        if (gu3Var != null) {
            return gu3Var.getLong(0);
        }
        return 0L;
    }

    public final boolean Y1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final void Y2(android.widget.TextView btn, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(btn, "btn");
        if (z17) {
            if (com.tencent.mm.ui.bk.C() || z18) {
                btn.setTextColor(btn.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                return;
            } else {
                btn.setTextColor(btn.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                return;
            }
        }
        if (com.tencent.mm.ui.bk.C() || z18) {
            btn.setTextColor(btn.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_2));
        } else {
            btn.setTextColor(btn.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
    }

    public final void Z(java.lang.String avatarUrl, yz5.l callback) {
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.o.g(callback, "callback");
        ff0.z zVar = (ff0.z) ((java.util.HashMap) f473959j).get(avatarUrl);
        if (zVar != null) {
            callback.invoke(java.lang.Integer.valueOf(zVar.f261595a));
        } else {
            t2(this, avatarUrl, new zl2.u1(callback), null, 4, null);
        }
    }

    public final int Z0() {
        int i17;
        android.view.View view;
        int i18 = f473961l;
        if (i18 > 0) {
            return i18;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        boolean z17 = false;
        if (liveRoomControllerStore == null) {
            return 0;
        }
        df2.ox oxVar = (df2.ox) liveRoomControllerStore.controller(df2.ox.class);
        if ((oxVar == null || (view = oxVar.f231013n) == null) ? true : view.isShown()) {
            i17 = 8;
        } else {
            jf2.k0 k0Var = (jf2.k0) liveRoomControllerStore.controller(jf2.k0.class);
            if (k0Var != null && k0Var.f7(20)) {
                z17 = true;
            }
            i17 = z17 ? 10 : 9;
        }
        return i17;
    }

    public final boolean Z1(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "validVideoSize videoWidth:" + i17 + ",videoHeight:" + i18);
        boolean z17 = i17 > 0 && i18 > 0;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "isLandscapeVideo validVideoSize:" + z17);
        return z17 && i17 >= i18;
    }

    public final void Z2(android.widget.EditText editText, android.widget.TextView textView, int i17, int i18, boolean z17, com.tencent.mm.ui.tools.t4 chineseMode, yz5.a aVar) {
        kotlin.jvm.internal.o.g(chineseMode, "chineseMode");
        android.text.InputFilter[] inputFilterArr = {new zl2.i3(editText), new zl2.j3(i17, chineseMode)};
        if (!z17) {
            inputFilterArr[0] = new zl2.h3(java.util.regex.Pattern.compile("[^a-zA-Z0-9一-龥_]"));
        }
        if (editText != null) {
            editText.setFilters(inputFilterArr);
        }
        zl2.k3 k3Var = new zl2.k3(textView, i18, aVar);
        if (editText != null) {
            editText.addTextChangedListener(k3Var);
        }
    }

    public final void a(java.lang.String str, gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (K1(buContext) || str == null) {
            return;
        }
        ((mm2.c1) buContext.a(mm2.c1.class)).A4.add(str);
    }

    public final java.lang.Integer a0() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("batterymanager");
        android.os.BatteryManager batteryManager = systemService instanceof android.os.BatteryManager ? (android.os.BatteryManager) systemService : null;
        return java.lang.Integer.valueOf(batteryManager != null ? batteryManager.getIntProperty(4) : 0);
    }

    public final com.tencent.mm.ui.widget.dialog.k0 a1(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, r45.qt2 qt2Var, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String str = i17 == 1005 ? "2" : "5";
        if (i17 == 1005) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.t1 t1Var = ml2.t1.f327938c2;
            jz5.l[] lVarArr = new jz5.l[2];
            r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
            lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId()));
            zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), qt2Var != null ? qt2Var.getString(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null), null, null, false, 112, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.t1 t1Var2 = ml2.t1.f327940d2;
            jz5.l[] lVarArr2 = new jz5.l[2];
            r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
            lVarArr2[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null));
            lVarArr2[1] = new jz5.l("feedId", java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId()));
            zy2.zb.T8(zbVar2, t1Var2, kz5.c1.l(lVarArr2), qt2Var != null ? qt2Var.getString(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null), null, null, false, 112, null);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        h0Var2.f310123d = new com.tencent.mm.pluginsdk.forward.m();
        if (h0Var.f310123d == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 0, true);
            h0Var.f310123d = k0Var;
            k0Var.X1 = false;
            k0Var.U1 = true;
        }
        java.lang.Object obj = h0Var.f310123d;
        ((com.tencent.mm.ui.widget.dialog.k0) obj).f211855d2 = false;
        ((com.tencent.mm.ui.widget.dialog.k0) obj).o(null);
        java.lang.Object obj2 = h0Var.f310123d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = (com.tencent.mm.ui.widget.dialog.k0) obj2;
        com.tencent.mm.ui.widget.dialog.k0 sheet = (com.tencent.mm.ui.widget.dialog.k0) obj2;
        kotlin.jvm.internal.o.g(sheet, "sheet");
        k0Var2.f211872n = new zl2.w1(feed, context, sheet);
        java.lang.Object obj3 = h0Var.f310123d;
        ((com.tencent.mm.ui.widget.dialog.k0) obj3).f211874o = new zl2.k2(feed, context, qt2Var, i17);
        ((com.tencent.mm.ui.widget.dialog.k0) obj3).f211876p = new zl2.y1(feed, h0Var, h0Var2, context);
        feed.getFeedObject().setShareScene(kz5.z.G(new java.lang.Integer[]{135, 182}, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null) ? 2 : 5);
        java.lang.Object obj4 = h0Var.f310123d;
        ((com.tencent.mm.ui.widget.dialog.k0) obj4).f211881s = new zl2.a2(context, feed, str, h0Var, h0Var2);
        ((com.tencent.mm.ui.widget.dialog.k0) obj4).f211884v = new zl2.d2(feed, i17, qt2Var, context, h0Var, aVar);
        ((com.tencent.mm.ui.widget.dialog.k0) obj4).f211885w = new zl2.h2(h0Var2, feed, context, h0Var, str);
        ((com.tencent.mm.ui.widget.dialog.k0) obj4).f211886x = new zl2.i2(h0Var, h0Var2);
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = (com.tencent.mm.ui.widget.dialog.k0) obj4;
        if (k0Var3 != null) {
            k0Var3.p(new zl2.j2(h0Var2, h0Var));
        }
        return (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d;
    }

    public final boolean a2(gk2.e eVar) {
        return !pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 512);
    }

    public final int b0(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (w1()) {
            return 1;
        }
        if (((mm2.c1) buContext.a(mm2.c1.class)).T) {
            return 3;
        }
        return ((mm2.n0) buContext.a(mm2.n0.class)).f329273r ? 16 : 2;
    }

    public final java.lang.String b1(r45.ba4 ba4Var) {
        kotlin.jvm.internal.o.g(ba4Var, "<this>");
        int integer = ba4Var.getInteger(2);
        if (integer == 0) {
            java.lang.String string = ba4Var.getString(0);
            return string == null ? "" : string;
        }
        if (integer != 1) {
            return "";
        }
        r45.gg0 gg0Var = (r45.gg0) ba4Var.getCustom(1);
        java.lang.String string2 = gg0Var != null ? gg0Var.getString(1) : null;
        return string2 == null ? "" : string2;
    }

    public final boolean b2(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        java.util.LinkedList linkedList = ((mm2.c1) buContext.a(mm2.c1.class)).f328812h;
        java.lang.Object obj = null;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.yl1) next).getInteger(0) == 8) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.yl1) obj;
        }
        return obj != null;
    }

    public final void b3(android.widget.TextView textView) {
        if (textView == null) {
            return;
        }
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveUtil", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    public final void c(android.view.ViewGroup vg6, boolean z17) {
        kotlin.jvm.internal.o.g(vg6, "vg");
        if (vg6.getLayoutParams() != null && (vg6.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && z17) {
            int dimensionPixelOffset = vg6.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
            android.view.ViewGroup.LayoutParams layoutParams = vg6.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelOffset;
        }
    }

    public final long c0(r45.do2 info) {
        r45.n11 n11Var;
        kotlin.jvm.internal.o.g(info, "info");
        int integer = info.getInteger(2);
        if (integer != 1) {
            if (integer == 2 && (n11Var = (r45.n11) info.getCustom(1)) != null) {
                return n11Var.getLong(0);
            }
            return 0L;
        }
        r45.uz0 uz0Var = (r45.uz0) info.getCustom(0);
        if (uz0Var != null) {
            return uz0Var.getLong(0);
        }
        return 0L;
    }

    public final java.lang.String c1(java.lang.String msg, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String h17 = com.tencent.mm.ui.tools.v4.h(msg, i17);
        if (z17 && msg.length() > h17.length()) {
            return h17.concat("...");
        }
        kotlin.jvm.internal.o.d(h17);
        return h17;
    }

    public final boolean c2(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        zl2.q4 q4Var = zl2.q4.f473933a;
        return com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.r()) || hc2.l.g(str);
    }

    public final void d(com.tencent.mm.plugin.finder.live.plugin.l plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        c(plugin.f113324f, plugin.x0());
    }

    public final com.tencent.rtmp.TXLivePlayConfig d0(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return com.tencent.mm.plugin.finder.live.util.n2.b(com.tencent.mm.plugin.finder.live.util.n2.f115640a, source, false, null, null, 0, 0, 62, null);
    }

    public final java.lang.String d1(android.content.Context context, bw5.mb0 mb0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        bw5.o50 a17 = mb0Var != null ? il4.l.f292142a.a(mb0Var, null) : null;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m5p);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.String o17 = il4.d.o(context2, a17, false);
        java.lang.String str = true ^ (o17 == null || o17.length() == 0) ? o17 : null;
        return str != null ? str : string;
    }

    public final boolean d2(gk2.e buContext, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (linkedList == null) {
            linkedList = ((mm2.c1) buContext.a(mm2.c1.class)).f328812h;
        }
        java.lang.Object obj = null;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.yl1) next).getInteger(0) == 10) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.yl1) obj;
        }
        return obj != null;
    }

    public final void d3(hn0.h hVar) {
        if (!zl2.q4.f473933a.E() || hVar == null) {
            return;
        }
        ae2.b2 b2Var = ae2.b2.f3461a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.H).getValue()).r()).intValue();
        tn0.w0 w0Var = (tn0.w0) hVar;
        cl0.g gVar = new cl0.g();
        try {
            gVar.h("api", "setNetEnv");
            cl0.g gVar2 = new cl0.g();
            gVar2.o("env", intValue);
            gVar.h("params", gVar2);
            w0Var.T().callExperimentalAPI(gVar.toString());
        } catch (java.lang.Exception unused) {
        }
    }

    public final void e(com.tencent.mm.plugin.finder.live.plugin.l plugin, boolean z17) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        plugin.f113324f.post(new zl2.v0(plugin, z17));
    }

    public final jz5.o e0() {
        java.util.Date date = new java.util.Date(M0());
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < 91; i17++) {
            calendar.setTime(date);
            calendar.add(5, i17);
            arrayList.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e0g, java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("getNoticePicker", (java.lang.String) it.next());
        }
        if (date.getHours() >= 23 && date.getMinutes() >= 55) {
            arrayList.remove(0);
        }
        java.util.Date date2 = new java.util.Date(M0());
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        zl2.r4 r4Var = f473950a;
        calendar2.setTimeInMillis(r4Var.M0());
        calendar2.set(5, calendar2.get(5) + 90);
        java.util.Date time = calendar2.getTime();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.setTimeInMillis(r4Var.M0());
        if (date2.getHours() >= 23 && date2.getMinutes() >= 55) {
            calendar3.set(5, calendar3.get(5) + 1);
        }
        java.util.Date time2 = calendar3.getTime();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        calendar4.setTimeInMillis(r4Var.M0());
        calendar4.set(5, calendar4.get(5) + 90);
        java.util.Date time3 = calendar4.getTime();
        int size = arrayList.size();
        kotlin.jvm.internal.o.d(time2);
        kotlin.jvm.internal.o.d(time3);
        kotlin.jvm.internal.o.d(time);
        java.util.ArrayList K0 = K0(size, time2, time3, date2, time, null);
        return new jz5.o(arrayList, K0, L0(K0, time2, time3, date2, time, null));
    }

    public final java.lang.String e1(r45.vw4 vw4Var) {
        if ((vw4Var != null ? vw4Var.f388624d : 0) == 1) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491730m95);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491726m91);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    public final boolean e2(r45.h32 noticeInfo) {
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        if (noticeInfo.getInteger(14) == 1) {
            return false;
        }
        r45.q65 q65Var = (r45.q65) noticeInfo.getCustom(10);
        return ((q65Var != null ? q65Var.getBoolean(0) : false) || noticeInfo.getInteger(20) == 1) ? false : true;
    }

    public final void e3() {
        int i17;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        gk2.e eVar = dk2.ef.I;
        if (context == null || eVar == null) {
            return;
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).Y2) {
            db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.f491427d22));
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) eVar.a(mm2.c1.class)).W2;
        if (finderJumpInfo != null) {
            bf3.x0 x0Var = bf3.x0.f19674a;
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            int i18 = x0Var.a(context2).y - com.tencent.mm.ui.bk.m((android.app.Activity) context).bottom;
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = finderJumpInfo.getMini_app_info();
            int half_page_custom_height = mini_app_info != null ? mini_app_info.getHalf_page_custom_height() : 0;
            boolean k17 = com.tencent.mm.ui.bk.k(context);
            if (half_page_custom_height > 0) {
                i17 = i65.a.b(context, half_page_custom_height) + (k17 ? i18 : 0);
            } else {
                i17 = 544;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "half_page_custom_height=" + half_page_custom_height + " navHeight=" + i18 + " isNavigationBarVisibility=" + k17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            r45.l34 l34Var = new r45.l34();
            r45.m34 m34Var = new r45.m34();
            m34Var.set(3, java.lang.Integer.valueOf(i17));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            m34Var.set(0, bool);
            m34Var.set(1, bool);
            m34Var.set(2, java.lang.Boolean.TRUE);
            l34Var.set(2, m34Var);
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453238c = l34Var;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
    }

    public final void f(java.lang.String tag, android.view.View root, boolean z17, boolean z18, int i17) {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(root, "root");
        if (z17) {
            android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(0, 0, 0, 0);
                layoutParams2.width = -1;
                layoutParams2.height = -1;
            }
            roundCornerRelativeLayout = root instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) root : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.c(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            return;
        }
        android.content.Context context = root.getContext();
        float f17 = com.tencent.mm.ui.bl.b(context).x;
        float f18 = com.tencent.mm.ui.bl.b(context).y;
        int h17 = com.tencent.mm.ui.bl.h(context);
        float a17 = com.tencent.mm.ui.zk.a(root.getContext(), 16);
        int a18 = com.tencent.mm.ui.zk.a(context, 80);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        int intValue = a18 + (valueOf != null ? valueOf.intValue() : com.tencent.mm.ui.bl.c(context));
        com.tencent.mars.xlog.Log.i(tag, "[adjustRootLayout] screenW:" + f17 + " screenH:" + f18 + " factor:1.7777778 statusBarH:" + h17);
        if (f18 / f17 <= 1.7777778f) {
            android.view.ViewGroup.LayoutParams layoutParams3 = root.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.setMargins(0, 0, 0, 0);
                layoutParams4.width = -1;
                layoutParams4.height = -1;
            }
            roundCornerRelativeLayout = root instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) root : null;
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.c(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.tencent.mars.xlog.Log.i(tag, "adjustPreviewByScreen fill screen");
            return;
        }
        float f19 = f17 * 1.7777778f;
        float f27 = f18 - f19;
        if (f27 <= h17) {
            android.view.ViewGroup.LayoutParams layoutParams5 = root.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.topMargin = z18 ? (int) f27 : 0;
                layoutParams6.bottomMargin = 0;
            }
            if (z18) {
                roundCornerRelativeLayout = root instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) root : null;
                if (roundCornerRelativeLayout != null) {
                    roundCornerRelativeLayout.c(a17, a17, 0.0f, 0.0f);
                }
            } else {
                roundCornerRelativeLayout = root instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) root : null;
                if (roundCornerRelativeLayout != null) {
                    roundCornerRelativeLayout.c(a17, a17, 0.0f, 0.0f);
                }
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams7 = root.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.topMargin = z18 ? h17 : 0;
                int i18 = ((int) f27) - h17;
                if (i18 > intValue) {
                    i18 = intValue;
                }
                layoutParams8.bottomMargin = i18;
            }
            if (z18) {
                roundCornerRelativeLayout = root instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) root : null;
                if (roundCornerRelativeLayout != null) {
                    roundCornerRelativeLayout.c(a17, a17, a17, a17);
                }
            } else {
                roundCornerRelativeLayout = root instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) root : null;
                if (roundCornerRelativeLayout != null) {
                    roundCornerRelativeLayout.c(0.0f, 0.0f, a17, a17);
                }
            }
        }
        com.tencent.mars.xlog.Log.i(tag, "adjustPreviewByScreen fit screen, targetH:" + f19 + " offsetH:" + f27 + " realBottomMargin:" + (((int) f27) - h17) + " mostBottomMargin:" + intValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r3.T == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f0() {
        /*
            r6 = this;
            boolean r0 = r6.w1()
            java.lang.String r1 = ""
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            if (r0 == 0) goto L25
            ya2.g r0 = ya2.h.f460484a
            dk2.ef r3 = dk2.ef.f233372a
            androidx.lifecycle.c1 r2 = r3.i(r2)
            mm2.c1 r2 = (mm2.c1) r2
            if (r2 == 0) goto L19
            java.lang.String r2 = r2.f328852o
            goto L1a
        L19:
            r2 = 0
        L1a:
            ya2.b2 r0 = r0.b(r2)
            if (r0 == 0) goto L54
            java.lang.String r1 = r0.w0()
            goto L54
        L25:
            dk2.ef r0 = dk2.ef.f233372a
            androidx.lifecycle.c1 r3 = r0.i(r2)
            mm2.c1 r3 = (mm2.c1) r3
            r4 = 0
            if (r3 == 0) goto L36
            boolean r3 = r3.T
            r5 = 1
            if (r3 != r5) goto L36
            goto L37
        L36:
            r5 = r4
        L37:
            if (r5 == 0) goto L3e
            java.lang.String r1 = c01.z1.l()
            goto L54
        L3e:
            androidx.lifecycle.c1 r0 = r0.i(r2)
            mm2.c1 r0 = (mm2.c1) r0
            if (r0 == 0) goto L54
            r45.of1 r0 = r0.I7()
            if (r0 == 0) goto L54
            java.lang.String r0 = r0.getString(r4)
            if (r0 != 0) goto L53
            goto L54
        L53:
            r1 = r0
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.f0():java.lang.String");
    }

    public final java.lang.String f1(gk2.e buContext, java.lang.Long l17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        java.lang.String str2 = ((mm2.c1) buContext.a(mm2.c1.class)).f328844m5;
        if (str2 != null) {
            return str2;
        }
        if (l17 != null) {
            str = (java.lang.String) ((mm2.c1) buContext.a(mm2.c1.class)).f328850n5.get(java.lang.Long.valueOf(l17.longValue()));
        } else {
            str = null;
        }
        return str;
    }

    public final boolean f2(gk2.e buContext) {
        mm2.y6 y6Var;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = ((mm2.c1) buContext.a(mm2.c1.class)).T;
        boolean z18 = ((mm2.n0) buContext.a(mm2.n0.class)).f329273r;
        if (!z17 && !z18 && !w1()) {
            r45.nw1 nw1Var = ((mm2.e1) buContext.a(mm2.e1.class)).f328988r;
            return pm0.v.z(nw1Var != null ? nw1Var.getInteger(37) : 0, 32768);
        }
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) buContext.a(mm2.g1.class)).f329078s;
        if (j2Var == null || (y6Var = (mm2.y6) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null) {
            return false;
        }
        return y6Var.f();
    }

    public final void f3(android.content.Context context, java.lang.String msg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (zl2.q4.f473933a.E()) {
            pm0.v.X(new zl2.n3(context, msg));
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", msg);
        }
    }

    public final int g0() {
        r45.of1 I7;
        if (w1()) {
            return 3;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z17 = false;
        if (c1Var != null && c1Var.T) {
            z17 = true;
        }
        if (z17) {
            return 1;
        }
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var2 == null || (I7 = c1Var2.I7()) == null) {
            return 4;
        }
        return I7.getInteger(2);
    }

    public final java.lang.String g1(int i17) {
        if (i17 == 1) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eiq);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (i17 != 3) {
            return "";
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eii);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    public final boolean g2(java.util.Calendar calendar, java.util.Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public final void g3(android.content.Context context, r45.z63 switchInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(switchInfo, "switchInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        e3Var.f(com.tencent.mm.R.layout.akq);
        android.widget.TextView textView = (android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.kte);
        android.view.View findViewById = e3Var.f131959f.findViewById(com.tencent.mm.R.id.kbu);
        android.view.View findViewById2 = e3Var.f131959f.findViewById(com.tencent.mm.R.id.a3j);
        android.content.res.Resources resources = context.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String string = switchInfo.getString(1);
        if (string == null) {
            string = "";
        }
        objArr[0] = string;
        textView.setText(resources.getString(com.tencent.mm.R.string.dgr, objArr));
        findViewById.setOnClickListener(new zl2.o3(e3Var));
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        findViewById2.setOnClickListener(new zl2.p3(c0Var, e3Var, switchInfo));
        e3Var.f131968r = new zl2.q3(callback, c0Var);
        e3Var.i();
    }

    public final android.util.Size h(zl2.r0 type) {
        int intValue;
        int intValue2;
        boolean z17;
        kotlin.jvm.internal.o.g(type, "type");
        zl2.r0 r0Var = zl2.r0.f473940f;
        if (type == r0Var) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HEVC_ENC_MAX_WIDTH_INT_SYNC, -1);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((java.lang.Integer) m17).intValue();
        } else {
            java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_AVC_ENC_MAX_WIDTH_INT_SYNC, -1);
            kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((java.lang.Integer) m18).intValue();
        }
        if (type == r0Var) {
            java.lang.Object m19 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HEVC_ENC_MAX_WIDTH_INT_SYNC, -1);
            kotlin.jvm.internal.o.e(m19, "null cannot be cast to non-null type kotlin.Int");
            intValue2 = ((java.lang.Integer) m19).intValue();
        } else {
            java.lang.Object m27 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_AVC_ENC_MAX_WIDTH_INT_SYNC, -1);
            kotlin.jvm.internal.o.e(m27, "null cannot be cast to non-null type kotlin.Int");
            intValue2 = ((java.lang.Integer) m27).intValue();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getMaxEncResolution type:" + type + ", maxWidth:" + intValue + ",maxHeight:" + intValue2);
        boolean z18 = true;
        if (intValue == -1) {
            z17 = true;
            intValue = 1920;
        } else {
            z17 = false;
        }
        if (intValue2 == -1) {
            intValue2 = 1920;
        } else {
            z18 = z17;
        }
        if (z18) {
            ((ku5.t0) ku5.t0.f312615d).g(new zl2.w0(type));
        }
        return new android.util.Size(intValue, intValue2);
    }

    public final java.lang.String h0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int integer = g92.b.f269769e.k2().getInteger(4);
        if (integer == 1) {
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.d(r17);
            return r17;
        }
        if (integer == 2) {
            java.lang.String k17 = c01.z1.k();
            kotlin.jvm.internal.o.d(k17);
            return k17;
        }
        if (integer == 3) {
            return xy2.c.e(context);
        }
        java.lang.String r18 = c01.z1.r();
        kotlin.jvm.internal.o.d(r18);
        return r18;
    }

    public final void h1(android.content.Context context, gk2.e liveData, long j17, r45.y23 productInfo, int i17, java.lang.String session, java.lang.String jumpId) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(productInfo, "productInfo");
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(jumpId, "jumpId");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new zl2.m2(h0Var, context, null), 2, null);
        if (dk2.ef.f233372a.k(liveData) != null) {
            zl2.l2 l2Var = new zl2.l2(d17, h0Var, session, productInfo, i17, liveData, j17, jumpId, context);
            pq5.g l17 = new ek2.e3(j17).l();
            l17.K(new dk2.n2(l2Var));
            l17.f((com.tencent.mm.ui.MMActivity) context);
        }
    }

    public final boolean h2(gk2.e eVar) {
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3877s8).getValue()).r()).intValue();
        if (intValue == 1) {
            return true;
        }
        if (intValue != 2) {
            return pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 32768);
        }
        return false;
    }

    public final void h3(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        pm0.v.X(new zl2.r3(z17, context));
    }

    public final boolean i(km2.q qVar) {
        return qVar != null && qVar.f309181l == 1;
    }

    public final boolean i0() {
        return ((java.lang.Boolean) ((jz5.n) f473955f).getValue()).booleanValue();
    }

    public final void i1(android.app.Activity mActivity, int i17) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        if (!gm0.j1.u().l()) {
            db5.t7.k(mActivity, null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_edit_video_max_time_length", 10);
        intent.putExtra("gallery_report_tag", 34);
        intent.putExtra("key_check_third_party_video", true);
        intent.putExtra("record_video_is_sight_capture", true);
        intent.putExtra("max_select_count", 1);
        intent.putExtra("query_source_type", 34);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("show_header_view", false);
        intent.addFlags(67108864);
        intent.setClassName(mActivity, "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAudioBgAlbumUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(mActivity, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "goSelectBg", "(Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final boolean i2(r45.fr1 gameTeamInfo, java.lang.String str) {
        r45.l73 l73Var;
        r45.i73 i73Var;
        r45.l73 l73Var2;
        java.util.LinkedList list;
        r45.kv1 kv1Var;
        kotlin.jvm.internal.o.g(gameTeamInfo, "gameTeamInfo");
        r45.i73 i73Var2 = (r45.i73) gameTeamInfo.getCustom(24);
        if (i73Var2 == null || (l73Var = (r45.l73) i73Var2.getCustom(0)) == null) {
            return false;
        }
        java.lang.Object obj = null;
        if (!l73Var.getBoolean(1)) {
            l73Var = null;
        }
        if (l73Var == null || (i73Var = (r45.i73) gameTeamInfo.getCustom(24)) == null || (l73Var2 = (r45.l73) i73Var.getCustom(0)) == null || (list = l73Var2.getList(0)) == null) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.kv1 kv1Var2 = (r45.kv1) ((r45.pt3) next).getCustom(0);
            if (kotlin.jvm.internal.o.b(kv1Var2 != null ? kv1Var2.getString(0) : null, str)) {
                obj = next;
                break;
            }
        }
        r45.pt3 pt3Var = (r45.pt3) obj;
        if (pt3Var == null || (kv1Var = (r45.kv1) pt3Var.getCustom(0)) == null) {
            return false;
        }
        return pm0.v.z(kv1Var.getInteger(12), 4);
    }

    public final so0.d i3(java.lang.String tag, r45.w32 svrSession, java.lang.String str) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(svrSession, "svrSession");
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[svrSession2DbSession-" + tag + "], svrSession = " + pm0.b0.g(svrSession));
        so0.d dVar = new so0.d();
        dVar.f410218d = java.lang.Long.valueOf(svrSession.getLong(1));
        dVar.f410215a = svrSession.getString(0);
        int integer = svrSession.getInteger(5);
        if (integer == 1) {
            r45.xn1 xn1Var2 = (r45.xn1) svrSession.getCustom(2);
            dVar.f410217c = (xn1Var2 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getUsername();
            r45.xn1 xn1Var3 = (r45.xn1) svrSession.getCustom(3);
            dVar.f410216b = (xn1Var3 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact.getUsername();
            dVar.f410219e = 3;
        } else if (integer == 2) {
            r45.xn1 xn1Var4 = (r45.xn1) svrSession.getCustom(3);
            dVar.f410217c = (xn1Var4 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) ? null : finderContact4.getUsername();
            r45.xn1 xn1Var5 = (r45.xn1) svrSession.getCustom(2);
            dVar.f410216b = (xn1Var5 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null) ? null : finderContact3.getUsername();
            r45.xn1 xn1Var6 = (r45.xn1) svrSession.getCustom(3);
            dVar.f410219e = xn1Var6 != null ? xn1Var6.getInteger(7) : 4;
        } else if (integer == 3) {
            java.util.LinkedList list = svrSession.getList(4);
            dVar.f410217c = (list == null || (xn1Var = (r45.xn1) kz5.n0.a0(list, svrSession.getInteger(6))) == null || (finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact6.getUsername();
            r45.xn1 xn1Var7 = (r45.xn1) svrSession.getCustom(3);
            dVar.f410216b = (xn1Var7 == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var7.getCustom(0)) == null) ? null : finderContact5.getUsername();
            dVar.f410219e = 1;
        }
        dVar.f410221g = str;
        java.lang.Long l17 = dVar.f410218d;
        if (l17 == null || l17.longValue() != 0) {
            java.lang.String str2 = dVar.f410215a;
            if (!(str2 == null || str2.length() == 0)) {
                java.lang.String str3 = dVar.f410217c;
                if (!(str3 == null || str3.length() == 0)) {
                    java.lang.String str4 = dVar.f410216b;
                    if (!(str4 == null || str4.length() == 0)) {
                        int i17 = dVar.f410219e;
                        if (1 <= i17 && i17 < 4) {
                            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[svrSession2DbSession-" + tag + "], dbSession = " + dVar);
                            return dVar;
                        }
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[svrSession2DbSession] return null, " + dVar.f410218d + ", " + dVar.f410215a + ", " + dVar.f410217c + ", " + dVar.f410216b + ", " + dVar.f410219e);
        return null;
    }

    public final boolean j() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.X0).getValue()).r()).intValue() == 1;
    }

    public final java.lang.String j0(android.content.Context context) {
        java.lang.String str;
        byte[] g17;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.protobuf.g gVar = ((im2.t6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.t6.class)).f292558h;
        if (gVar != null) {
            g17 = gVar.g();
        } else {
            dk2.ef efVar = dk2.ef.f233372a;
            gk2.e eVar = dk2.ef.I;
            if (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f328844m5) == null) {
                str = "";
            }
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            g17 = new com.tencent.mm.protobuf.g(bytes).g();
        }
        java.lang.String encode = java.net.URLEncoder.encode(new java.lang.String(g17, r26.c.f368865a));
        kotlin.jvm.internal.o.f(encode, "encode(...)");
        return encode;
    }

    public final void j1(android.content.Context context, gk2.e buContext) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI.class);
        intent.putExtra("liveid", ((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0));
        intent.putExtra("objectid", ((mm2.e1) buContext.a(mm2.e1.class)).f328983m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoCommentManagerUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoCommentManagerUI", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final boolean j2(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        so2.j5 j5Var = ((mm2.f6) buContext.a(mm2.f6.class)).f329049w;
        cm2.k0 k0Var = j5Var instanceof cm2.k0 ? (cm2.k0) j5Var : null;
        return k0Var != null && k0Var.f43360v.getInteger(21) == 0;
    }

    public final int j3(int i17) {
        if (i17 != 2) {
            return i17 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void k(android.view.View view, java.lang.String avatarUrl) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.HashMap) f473960k).get(avatarUrl);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "blurAvatarColorToView coverBgBitmap=" + bitmap);
        if (bitmap != null) {
            R2(view, bitmap);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "blurAvatarColorToView no cache, avatarUrl: ".concat(avatarUrl));
            t2(this, avatarUrl, null, new zl2.x0(view), 2, null);
        }
    }

    public final void k1(android.content.Context context, long j17, long j18, java.lang.String objectNonceId, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI.class);
        intent.putExtra("finderlivecreateparamliveid", j17);
        intent.putExtra("finderlivecreateparamobjectid", j18);
        intent.putExtra("finderlivecreateparamnonceobjectid", objectNonceId);
        intent.putExtra("finderlivecreateparamusername", username);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoVoteUI", "(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "gotoVoteUI", "(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final boolean k2(java.lang.String str) {
        if (!hc2.l.g(str)) {
            zl2.q4 q4Var = zl2.q4.f473933a;
            if (!com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.r()) && !com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.k())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k3(dk2.zf selfMsg, gk2.e liveData) {
        kotlin.jvm.internal.o.g(selfMsg, "selfMsg");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        if (K1(liveData)) {
            return false;
        }
        ((mm2.x4) liveData.a(mm2.x4.class)).f329528f.add(selfMsg);
        ((mm2.j2) liveData.a(mm2.j2.class)).N6(selfMsg);
        ((mm2.c1) liveData.a(mm2.c1.class)).B4.add(selfMsg);
        no0.h.f338720a.a();
        return true;
    }

    public final java.util.Map l(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        zl2.r4 r4Var = f473950a;
        if (!r4Var.w1()) {
            return kz5.c1.i(new jz5.l("share_scene", java.lang.String.valueOf(r4Var.Z0())), new jz5.l("liveid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0))), new jz5.l("feedid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f328983m)));
        }
        jz5.l lVar = new jz5.l("share_scene", java.lang.String.valueOf(r4Var.Z0()));
        jz5.l lVar2 = new jz5.l("liveid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0)));
        jz5.l lVar3 = new jz5.l("feedid", pm0.v.u(((mm2.e1) buContext.a(mm2.e1.class)).f328983m));
        ml2.s1 s1Var = ml2.s1.f327915e;
        return kz5.c1.i(lVar, lVar2, lVar3, new jz5.l("anchor_status", "LIVING"));
    }

    public final java.lang.String l0(java.lang.String fieldName) {
        kotlin.jvm.internal.o.g(fieldName, "fieldName");
        try {
            java.lang.String optString = new cl0.g(r26.i0.v(((ml2.r0) i95.n0.c(ml2.r0.class)).M, ";", ",", false, 4, null)).optString(fieldName);
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getFieldInChnlExtra " + fieldName + ": " + optString);
            return optString;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveUtil", e17, "getFieldInChnlExtra", new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l1(int r6, int r7, r45.qp1 r8, android.app.Activity r9, yz5.a r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.l1(int, int, r45.qp1, android.app.Activity, yz5.a):boolean");
    }

    public final boolean l2(r45.ba4 ba4Var) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(ba4Var, "<this>");
        int integer = ba4Var.getInteger(2);
        if (integer == 0) {
            java.lang.String string2 = ba4Var.getString(0);
            if (string2 != null) {
                if (string2.length() > 0) {
                    return true;
                }
            }
            return false;
        }
        if (integer != 1) {
            return false;
        }
        r45.gg0 gg0Var = (r45.gg0) ba4Var.getCustom(1);
        if (gg0Var != null && (string = gg0Var.getString(0)) != null) {
            if (string.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void l3(gk2.e buContext, qo0.c statusMonitor, boolean z17) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        so2.j5 j5Var = ((mm2.f6) buContext.a(mm2.f6.class)).f329049w;
        if (j5Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 J2 = f473950a.J2(j5Var);
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.toByteArray() : null);
            bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_ANCHOR", !z17);
            statusMonitor.statusChange(bVar, bundle);
        }
    }

    public final boolean m() {
        kotlinx.coroutines.flow.j2 j2Var;
        r45.n73 n73Var;
        r45.z53 z53Var;
        kotlinx.coroutines.flow.j2 j2Var2;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var != null && c1Var.a8()) {
            mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
            if ((c1Var2 != null ? c1Var2.H2 : 0) <= 0) {
                return false;
            }
        } else {
            mm2.g1 g1Var = (mm2.g1) efVar.i(mm2.g1.class);
            r45.t63 t63Var = null;
            if (!T1((g1Var == null || (j2Var2 = g1Var.f329068f) == null) ? null : (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var2).getValue())) {
                return false;
            }
            mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
            if (g1Var2 != null && (j2Var = g1Var2.f329071i) != null && (n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) != null && (z53Var = (r45.z53) n73Var.getCustom(1)) != null) {
                t63Var = (r45.t63) z53Var.getCustom(11);
            }
            if (t63Var == null) {
                return false;
            }
        }
        return true;
    }

    public final com.tencent.mm.protocal.protobuf.FinderContact m0(gk2.e liveData) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String l17;
        java.lang.String l18;
        kotlin.jvm.internal.o.g(liveData, "liveData");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
        zl2.r4 r4Var = f473950a;
        if (r4Var.w1()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            finderContact.setUsername(xy2.c.e(context));
            ya2.b2 b17 = ya2.h.f460484a.b(finderContact.getUsername());
            finderContact.setNickname(b17 != null ? b17.z0() : "");
            finderContact.setHeadUrl(b17 != null ? b17.y0() : "");
        } else if (((mm2.c1) liveData.a(mm2.c1.class)).T) {
            finderContact.setUsername(c01.z1.r());
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            if (c1Var == null || (l18 = c1Var.B7()) == null) {
                l18 = c01.z1.l();
            }
            finderContact.setNickname(l18);
            finderContact.setHeadUrl(((mm2.c1) liveData.a(mm2.c1.class)).I7().getString(1));
        } else {
            r45.of1 I7 = ((mm2.c1) liveData.a(mm2.c1.class)).I7();
            int integer = I7.getInteger(2);
            if (integer == 2) {
                finderContact.setUsername(c01.z1.k());
                mm2.c1 c1Var2 = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                if (c1Var2 == null || (string = c1Var2.B7()) == null) {
                    string = I7.getString(0);
                }
                finderContact.setNickname(string);
                finderContact.setHeadUrl(I7.getString(1));
            } else if (integer != 3) {
                finderContact.setUsername(c01.z1.r());
                mm2.c1 c1Var3 = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                if (c1Var3 == null || (l17 = c1Var3.B7()) == null) {
                    l17 = c01.z1.l();
                }
                finderContact.setNickname(l17);
                finderContact.setHeadUrl(I7.getString(1));
            } else {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                finderContact.setUsername(xy2.c.e(context2));
                mm2.c1 c1Var4 = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                if (c1Var4 == null || (string2 = c1Var4.B7()) == null) {
                    string2 = I7.getString(0);
                }
                finderContact.setNickname(string2);
                finderContact.setHeadUrl(I7.getString(1));
            }
        }
        if (r4Var.d2(liveData, null)) {
            finderContact.setNickname("***");
        }
        return finderContact;
    }

    public final boolean m2(r45.j52 j52Var) {
        boolean z17 = false;
        if (j52Var != null && (((r45.mc1) j52Var.getCustom(0)) != null || ((com.tencent.mm.protocal.protobuf.FinderJumpInfo) j52Var.getCustom(1)) != null)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "FinderLivePromotionEntrance.isValid " + z17);
        return z17;
    }

    public final void m3(im5.b bVar, long j17, java.lang.String userName, int i17, int i18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (x0()) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Yj(j17, 2, 20000L, bVar, new zl2.s3(j17, userName, i17), i18);
        }
    }

    public final boolean n(int i17) {
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3764h5).getValue()).r()).intValue() == 1) {
            return false;
        }
        return !pm0.v.z(i17, 65536);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di((android.app.Activity) r3) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class n0(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.Class<zy2.c9> r0 = zy2.c9.class
            i95.m r1 = i95.n0.c(r0)
            zy2.c9 r1 = (zy2.c9) r1
            com.tencent.mm.plugin.finder.service.l3 r1 = (com.tencent.mm.plugin.finder.service.l3) r1
            boolean r1 = r1.Zi(r3)
            if (r1 != 0) goto L37
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L2a
            i95.m r0 = i95.n0.c(r0)
            zy2.c9 r0 = (zy2.c9) r0
            android.app.Activity r3 = (android.app.Activity) r3
            com.tencent.mm.plugin.finder.service.l3 r0 = (com.tencent.mm.plugin.finder.service.l3) r0
            boolean r3 = r0.Di(r3)
            if (r3 == 0) goto L2a
            goto L37
        L2a:
            jz2.x0 r3 = jz2.x0.f302754a
            jz5.g r3 = jz2.x0.f302770q
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
            goto L43
        L37:
            jz2.x0 r3 = jz2.x0.f302754a
            jz5.g r3 = jz2.x0.f302771r
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.n0(android.content.Context):java.lang.Class");
    }

    public final void n1(int i17, android.view.View view, android.widget.TextView textView, android.view.View view2) {
        int i18;
        int i19;
        dk2.u7 u7Var = dk2.u7.f234181a;
        r45.aw1 aw1Var = dk2.u7.f234194n;
        if (aw1Var != null) {
            i19 = aw1Var.getInteger(0);
            i18 = i17;
        } else {
            i18 = i17;
            i19 = 0;
        }
        boolean z17 = i19 >= i18;
        if (!z17) {
            view.setBackground(view.getContext().getDrawable(com.tencent.mm.R.drawable.f481724a42));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            view.setBackground(view.getContext().getDrawable(com.tencent.mm.R.drawable.f481725a43));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f3h);
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        textView.setText(view.getContext().getString(com.tencent.mm.R.string.di6, java.lang.Integer.valueOf(i17)));
        int i27 = z17 ? 8 : 0;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleRewardTag", "(ILandroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean n2(r45.q12 q12Var) {
        return (q12Var != null ? q12Var.getInteger(0) : 0) == 1;
    }

    public final void n3(android.view.ViewGroup root, java.lang.String tag, boolean z17, boolean z18) {
        boolean z19;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(tag, "tag");
        float q17 = i65.a.q(root.getContext());
        zl2.r4 r4Var = f473950a;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        float s07 = r4Var.s0(context, 1.0f);
        float n17 = i65.a.n(root.getContext());
        if (z17) {
            xy2.b bVar = xy2.b.f458155b;
            if (!(n17 == 1.0f)) {
                if (q17 == 1.0f) {
                    z19 = true;
                    pm0.z.a(bVar, "finder_live_input_text_scale", z19, null, null, false, false, new zl2.t3(q17, s07, n17), 60, null);
                }
            }
            z19 = false;
            pm0.z.a(bVar, "finder_live_input_text_scale", z19, null, null, false, false, new zl2.t3(q17, s07, n17), 60, null);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "textScaleSize:" + q17 + ", widthHeightScale:" + s07 + ", textOriginalScaleSize:" + n17);
        if (q17 <= 1.0f) {
            if (s07 == 1.0f) {
                return;
            }
        }
        root.post(new zl2.v3(root, z18));
    }

    public final boolean o(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        if (!((mm2.c1) buContext.a(mm2.c1.class)).P) {
            return false;
        }
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_ASK_PRODUCTION_SETTING_BOOLEAN_SYNC, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowAnchorAskProductRedDot:");
        boolean z17 = !o17;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di((android.app.Activity) r3) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class o0(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.Class<zy2.c9> r0 = zy2.c9.class
            i95.m r1 = i95.n0.c(r0)
            zy2.c9 r1 = (zy2.c9) r1
            com.tencent.mm.plugin.finder.service.l3 r1 = (com.tencent.mm.plugin.finder.service.l3) r1
            boolean r1 = r1.Zi(r3)
            if (r1 != 0) goto L37
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L2a
            i95.m r0 = i95.n0.c(r0)
            zy2.c9 r0 = (zy2.c9) r0
            android.app.Activity r3 = (android.app.Activity) r3
            com.tencent.mm.plugin.finder.service.l3 r0 = (com.tencent.mm.plugin.finder.service.l3) r0
            boolean r3 = r0.Di(r3)
            if (r3 == 0) goto L2a
            goto L37
        L2a:
            jz2.x0 r3 = jz2.x0.f302754a
            jz5.g r3 = jz2.x0.f302758e
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
            goto L43
        L37:
            jz2.x0 r3 = jz2.x0.f302754a
            jz5.g r3 = jz2.x0.f302759f
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.o0(android.content.Context):java.lang.Class");
    }

    public final void o1(java.lang.String str, android.view.View view, android.view.View view2, android.widget.TextView textView) {
        view.setBackground(view.getContext().getDrawable(com.tencent.mm.R.drawable.f481724a42));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleSkinTag", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleSkinTag", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        textView.setText(str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleSkinTag", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "handleSkinTag", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean o2() {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        return (c1Var != null && !c1Var.T) && !w1();
    }

    public final boolean p() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_FUNCTION_BOOLEAN_SYNC, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowAnchorMoreFunctionRedDot:");
        sb6.append(!o17);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        return !o17;
    }

    public final java.util.LinkedList p0(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getFinderLiveAndienceFileIdList list is empty!");
            return linkedList;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AndienceFileIdList:");
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.il1 il1Var = new r45.il1();
            il1Var.parseFrom((byte[]) obj);
            java.lang.String string = il1Var.getString(0);
            if (string == null || string.length() == 0) {
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getFinderLiveAndienceFileIdList index:" + i17 + " item:" + il1Var.getString(1) + " is empty!");
            } else {
                linkedList.add(string);
                sb6.append("[" + il1Var.getString(1) + ',' + il1Var.getString(0) + ']');
            }
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "getFinderLiveAndienceFileIdList " + ((java.lang.Object) sb6));
        return linkedList;
    }

    public final boolean p1(java.lang.String sentence) {
        kotlin.jvm.internal.o.g(sentence, "sentence");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        java.lang.Object[] spans = com.tencent.mm.pluginsdk.ui.span.c0.i(context, sentence).getSpans(0, sentence.length(), com.tencent.mm.smiley.r0.class);
        kotlin.jvm.internal.o.f(spans, "getSpans(...)");
        return !(spans.length == 0);
    }

    public final boolean p2(r45.q12 q12Var) {
        return (q12Var != null ? q12Var.getInteger(0) : 0) == 2;
    }

    public final java.lang.Object p3(java.lang.String path, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0 f0Var = mv2.f0.f331561a;
        java.lang.String userName = xy2.c.e(context);
        zl2.w3 w3Var = new zl2.w3(nVar);
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(userName, "userName");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        mv2.f0.f331562b.b(new mv2.p0(path, userName), w3Var);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final boolean q(gk2.e eVar) {
        boolean z17;
        r45.j52 j52Var;
        long t17 = eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).f328778a5 ? gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L);
        if (w1()) {
            if ((eVar == null || (j52Var = ((mm2.c1) eVar.a(mm2.c1.class)).X) == null || !m2(j52Var)) ? false : true) {
                z17 = true;
                boolean z18 = pm0.v.z((int) t17, 2);
                boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_PROMOTION_BOOLEAN_SYNC, false);
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "canShowAnchorPromotionRedDot: " + z17 + ", flag:" + t17 + ',' + z18 + ", " + o17);
                return (z17 || !z18 || o17) ? false : true;
            }
        }
        z17 = false;
        boolean z182 = pm0.v.z((int) t17, 2);
        boolean o172 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_PROMOTION_BOOLEAN_SYNC, false);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "canShowAnchorPromotionRedDot: " + z17 + ", flag:" + t17 + ',' + z182 + ", " + o172);
        if (z17) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di((android.app.Activity) r7) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class q0(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.Class<zy2.c9> r0 = zy2.c9.class
            i95.m r1 = i95.n0.c(r0)
            zy2.c9 r1 = (zy2.c9) r1
            com.tencent.mm.plugin.finder.service.l3 r1 = (com.tencent.mm.plugin.finder.service.l3) r1
            boolean r1 = r1.Zi(r7)
            if (r1 != 0) goto Lc6
            boolean r1 = r7 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            i95.m r0 = i95.n0.c(r0)
            zy2.c9 r0 = (zy2.c9) r0
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            com.tencent.mm.plugin.finder.service.l3 r0 = (com.tencent.mm.plugin.finder.service.l3) r0
            boolean r0 = r0.Di(r2)
            if (r0 == 0) goto L2c
            goto Lc6
        L2c:
            if (r1 == 0) goto Lb9
            java.lang.String r0 = "FinderLiveUtil"
            r1 = 0
            r2 = 0
            java.lang.Class<android.app.ActivityManager> r3 = android.app.ActivityManager.class
            java.lang.Object r3 = b3.l.getSystemService(r7, r3)     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            r4 = 1
            if (r3 == 0) goto L42
            java.util.List r3 = r3.getRunningTasks(r4)     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            goto L43
        L42:
            r3 = r2
        L43:
            if (r3 == 0) goto L4c
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            if (r5 != r4) goto L4c
            goto L4d
        L4c:
            r4 = r1
        L4d:
            if (r4 == 0) goto L55
            java.lang.String r7 = "running Tasks null"
            com.tencent.mars.xlog.Log.i(r0, r7)     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            goto La4
        L55:
            if (r3 == 0) goto L62
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            android.app.ActivityManager$RunningTaskInfo r3 = (android.app.ActivityManager.RunningTaskInfo) r3     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            if (r3 == 0) goto L62
            android.content.ComponentName r3 = r3.baseActivity     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L87
            goto L63
        L62:
            r3 = r2
        L63:
            if (r3 == 0) goto L71
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L88
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ActivityInfo r7 = r7.getActivityInfo(r3, r4)     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L88
            java.lang.String r2 = r7.taskAffinity     // Catch: java.lang.Exception -> L74 android.content.pm.PackageManager.NameNotFoundException -> L88
        L71:
            if (r2 != 0) goto La6
            goto La4
        L74:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getTaskAffinity, get exception:"
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.tencent.mars.xlog.Log.e(r0, r7)
            goto La4
        L87:
            r3 = r2
        L88:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r4 = "componentName:"
            r7.<init>(r4)
            if (r3 == 0) goto L95
            java.lang.String r2 = r3.toString()
        L95:
            r7.append(r2)
            java.lang.String r2 = ",trigger PackageManager.NameNotFoundException"
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r0, r7)
        La4:
            java.lang.String r2 = ""
        La6:
            java.lang.String r7 = "com.tencent.mm.topStory"
            boolean r7 = r26.i0.y(r2, r7, r1)
            if (r7 == 0) goto Lb9
            jz5.g r7 = jz2.x0.f302756c
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Class r7 = (java.lang.Class) r7
            goto Ld2
        Lb9:
            jz2.x0 r7 = jz2.x0.f302754a
            jz5.g r7 = jz2.x0.f302755b
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Class r7 = (java.lang.Class) r7
            goto Ld2
        Lc6:
            jz2.x0 r7 = jz2.x0.f302754a
            jz5.g r7 = jz2.x0.f302757d
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Class r7 = (java.lang.Class) r7
        Ld2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.q0(android.content.Context):java.lang.Class");
    }

    public final boolean q1(gk2.e data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).rj(((mm2.c1) data.a(mm2.c1.class)).f328852o)) {
            return true;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((mm2.d) data.a(mm2.d.class)).f328943g, true);
        return n17 != null && n17.r2();
    }

    public final void q2(r45.j52 j52Var, java.lang.String tag, android.content.Context context) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(j52Var, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = true;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) j52Var.getCustom(1);
        if (finderJumpInfo != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", tag.concat(" FinderLivePromotionEntrance.jump liteapp"));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            r45.mc1 mc1Var = (r45.mc1) j52Var.getCustom(0);
            java.lang.String string = mc1Var != null ? mc1Var.getString(0) : null;
            java.lang.String string2 = mc1Var != null ? mc1Var.getString(1) : null;
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", tag + " FinderLivePromotionEntrance.jump appId:" + string + ", path:" + string2);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                db5.t7.g(context, "请稍候重试");
                return;
            }
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = string;
            b1Var.f317022f = string2;
            b1Var.f317018d = 0;
            b1Var.H = k91.z3.OPAQUE;
            b1Var.f317032k = 1205;
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            b1Var.f317016c = 0;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        }
    }

    public final boolean q3(java.lang.String sdkUserId, int i17, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        zn0.y yVar = zn0.x.f474414a;
        yVar.j(str, sdkUserId, i17, z17);
        zn0.v d17 = yVar.d(sdkUserId);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "updateRemoteLinkMicUserInfo: user didn't online yet, sdkUserId:" + sdkUserId + ", sdkLiveId:" + i17 + ", isAnchor:" + z17 + ", sessionId:" + str);
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "updateRemoteLinkMicUserInfo: already add, need update, sdkUserId:" + sdkUserId + ", sdkLiveId:" + i17 + ", isAnchor:" + z17 + ", sessionId:" + str);
        d17.f474411i = java.lang.String.valueOf(i17);
        d17.f474412m = z17;
        return true;
    }

    public final boolean r() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_WISH_BOOLEAN_SYNC, false);
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        boolean z17 = c1Var != null && c1Var.Z5;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowAnchorWishRedDot:local");
        sb6.append(!o17);
        sb6.append(" , enableInteractionWish:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        return !o17 && z17;
    }

    public final int r0(java.util.List list) {
        java.lang.Object obj;
        zl2.q4 q4Var = zl2.q4.f473933a;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                boolean z17 = false;
                if (((r45.yl1) obj).getInteger(0) == 2) {
                    z17 = true;
                }
                if (z17) {
                    break;
                }
            }
            r45.yl1 yl1Var = (r45.yl1) obj;
            if (yl1Var != null) {
                return yl1Var.getInteger(2);
            }
        }
        return -1;
    }

    public final void r1(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.view.View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            android.content.Context context = currentFocus.getContext();
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) (context != null ? context.getSystemService("input_method") : null);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }
    }

    public final void r2(android.content.Context context, bw5.mb0 info, bw5.ar0 tingScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(tingScene, "tingScene");
        bw5.o50 a17 = il4.l.f292142a.a(info, null);
        com.tencent.mars.xlog.Log.i("JumpTingCategory", "item = " + a17.c());
        qk.f9.c(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), context, a17, tingScene, new il4.e(null, 0, tingScene.f25422d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null), null, 16, null);
    }

    public final void r3(android.content.Context context, gk2.e buContext, r45.ba4 liveRoomImg) {
        yg2.b bVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(liveRoomImg, "liveRoomImg");
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "liveStart:" + c1Var.a8() + ", liveFinish:" + c1Var.U7() + ", liveRoomImg:" + pm0.b0.g(liveRoomImg));
            mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
            boolean z17 = false;
            if (c1Var2 != null && c1Var2.l7()) {
                te2.a2.f417855a.a(liveRoomImg.getInteger(2) == 0 ? 3 : 4);
                mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var3 != null && c1Var3.a8()) {
                    z17 = true;
                }
                if (!z17) {
                    mm2.c1 c1Var4 = (mm2.c1) efVar.i(mm2.c1.class);
                    if (c1Var4 != null) {
                        c1Var4.A1 = liveRoomImg;
                    }
                    com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                    if (k0Var != null) {
                        qo0.b bVar2 = qo0.b.f365366i4;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
                        k0Var.statusChange(bVar2, bundle);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                kotlinx.coroutines.r2 r2Var = null;
                h0Var.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.ggd), true, 3, null);
                gk2.e eVar = dk2.ef.I;
                if (eVar != null && (bVar = eVar.f272475i) != null) {
                    r2Var = kotlinx.coroutines.l.d(bVar, kotlinx.coroutines.q1.f310570c, null, new zl2.c4(buContext, liveRoomImg, context, h0Var, null), 2, null);
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
                if (u3Var != null) {
                    u3Var.setCancelable(true);
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
                if (u3Var2 != null) {
                    u3Var2.setOnDismissListener(new zl2.x3(r2Var, h0Var));
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var3 = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
                if (u3Var3 != null) {
                    u3Var3.show();
                }
            }
        }
    }

    public final boolean s(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        ae2.in inVar = ae2.in.f3688a;
        jz5.g gVar = ae2.in.M;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() > 0 ? ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 1 : ((mm2.c1) buContext.a(mm2.c1.class)).A5;
    }

    public final float s0(android.content.Context context, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        return ((f17 * 1.0f) * j65.f.g()) / 400;
    }

    public final boolean s1(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        if (W1(liveData)) {
            return (((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getInteger(12) == 1) && ((mm2.c1) liveData.a(mm2.c1.class)).a8();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s2(gk2.e r5, yz5.l r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof zl2.p2
            if (r0 == 0) goto L13
            r0 = r7
            zl2.p2 r0 = (zl2.p2) r0
            int r1 = r0.f473919f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f473919f = r1
            goto L18
        L13:
            zl2.p2 r0 = new zl2.p2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f473917d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f473919f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4e
        L2f:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Class<mm2.c1> r7 = mm2.c1.class
            androidx.lifecycle.c1 r5 = r5.a(r7)
            mm2.c1 r5 = (mm2.c1) r5
            kotlinx.coroutines.flow.j2 r5 = r5.E5
            if (r5 == 0) goto L54
            zl2.q2 r7 = new zl2.q2
            r7.<init>(r6)
            r0.f473919f = r3
            kotlinx.coroutines.flow.h3 r5 = (kotlinx.coroutines.flow.h3) r5
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            jz5.d r5 = new jz5.d
            r5.<init>()
            throw r5
        L54:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.s2(gk2.e, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s3(boolean z17, boolean z18) {
        co0.a aVar = co0.b.f43709e2;
        int size = co0.b.f43710f2.size();
        if (!z17) {
            if (size > 2) {
                pm0.z.b(xy2.b.f458155b, "liveVisitorCoreOverSize", false, null, null, false, false, new zl2.e4(size), 60, null);
            }
        } else if (size > 1 || (z18 && size > 0)) {
            pm0.z.b(xy2.b.f458155b, "liveVisitorCoreLeak", false, null, null, false, false, new zl2.d4(z18, size), 60, null);
            if (z18) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        }
    }

    public final boolean t(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        ae2.in inVar = ae2.in.f3688a;
        jz5.g gVar = ae2.in.M;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() > 0) {
            return ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 1;
        }
        jz5.g gVar2 = ae2.in.Y2;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() > 0 ? ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() == 1 : ((mm2.c1) buContext.a(mm2.c1.class)).f328774J;
    }

    public final int t0() {
        if (!zl2.q4.f473933a.E()) {
            return 0;
        }
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3742f3).getValue()).r()).intValue();
        int i17 = 1;
        if (intValue != 1) {
            i17 = 2;
            if (intValue != 2) {
                return 0;
            }
        }
        return i17;
    }

    public final boolean t1(gk2.e eVar) {
        return !pm0.v.A(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0L, 8589934592L);
    }

    public final void u(android.app.Activity context, gk2.e eVar, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        df2.te teVar;
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = context.getResources().getConfiguration().orientation;
        if (i17 == 1) {
            if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O7()) {
                if ((eVar == null || ((mm2.c1) eVar.a(mm2.c1.class)).A2) ? false : true) {
                    if (k0Var != null && (teVar = (df2.te) k0Var.getController(df2.te.class)) != null) {
                        teVar.Z6();
                    }
                    com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "checkAnchorScreenOrientation curOrientation:" + i17 + ",requestOrientation:" + context.getRequestedOrientation());
                }
            }
        }
    }

    public final java.lang.String u0(r45.aw1 aw1Var) {
        java.lang.String str;
        java.lang.String str2;
        r45.nw1 nw1Var;
        if (aw1Var == null || (str = aw1Var.getString(3)) == null) {
            str = "https://channels.weixin.qq.com/live-support/pages/user-side/level-rights";
        }
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        kotlin.jvm.internal.o.f(buildUpon, "buildUpon(...)");
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null && (nw1Var = e1Var.f328988r) != null) {
            buildUpon.appendQueryParameter("live_id", java.lang.String.valueOf(nw1Var.getLong(0)));
        }
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var != null && (str2 = c1Var.f328852o) != null) {
            buildUpon.appendQueryParameter("finder_username", str2);
        }
        buildUpon.appendQueryParameter("pack_entrance", "1");
        buildUpon.appendQueryParameter("disable_privacy", "1");
        mm2.j2 j2Var = (mm2.j2) efVar.i(mm2.j2.class);
        if (j2Var != null && j2Var.R6()) {
            buildUpon.appendQueryParameter("float_msg", "1");
        }
        java.lang.String uri = buildUpon.build().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327277x2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "3");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        return uri;
    }

    public final boolean u1(r45.f62 f62Var) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(f62Var, "<this>");
        java.util.LinkedList list = f62Var.getList(5);
        kotlin.jvm.internal.o.f(list, "getStage_items(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.hd6 hd6Var = (r45.hd6) obj;
            kotlin.jvm.internal.o.d(hd6Var);
            if (!(hd6Var.getInteger(3) == 3 || hd6Var.getInteger(3) == 4)) {
                break;
            }
        }
        return obj == null;
    }

    public final android.graphics.Bitmap u2(java.lang.String path, int i17, int i18) {
        kotlin.jvm.internal.o.g(path, "path");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(path);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "loadLocalImageBitmap", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil", "loadLocalImageBitmap", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        options.inSampleSize = com.tencent.mm.sdk.platformtools.x.f(options.outWidth, options.outHeight, i17, i18);
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        return com.tencent.mm.graphics.e.d(path, options);
    }

    public final boolean v(android.content.Context context, java.lang.String configKey, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(configKey, "configKey");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(configKey);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[checkGiftLegalArgeement] config:" + d17);
        if (d17 == null) {
            return false;
        }
        try {
            cl0.g gVar = new cl0.g(d17);
            java.lang.String optString = gVar.optString("legal_title");
            java.lang.String optString2 = gVar.optString("legal_url");
            int optInt = gVar.optInt("legal_type");
            int optInt2 = gVar.optInt("version");
            if (!(1 <= optInt && optInt < 3)) {
                return false;
            }
            com.tencent.mm.storage.u3 u3Var = optInt != 1 ? optInt != 2 ? com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PKG_GIFT_AGREEMENT_VERSION_INT_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_POPULAR_GIFT_AGREEMENT_VERSION_INT_SYNC : com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PKG_GIFT_AGREEMENT_VERSION_INT_SYNC;
            int r17 = gm0.j1.u().c().r(u3Var, -1);
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[checkGiftLegalArgeement] currentVersion:" + r17);
            if (zl2.q4.f473933a.E()) {
                db5.t7.makeText(context, "checkGiftLegalArgeement type:" + optInt + ", version:" + optInt2 + ", currentVersion:" + r17, 0).show();
            }
            if (r17 >= optInt2) {
                return false;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.arm, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e);
            android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            textView2.setText(optString);
            textView.setText(optInt != 1 ? optInt != 2 ? "" : context.getString(com.tencent.mm.R.string.d0d) : context.getString(com.tencent.mm.R.string.d0e));
            android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            kotlin.jvm.internal.o.d(button);
            com.tencent.mm.ui.fk.a(button);
            kotlin.jvm.internal.o.d(button2);
            com.tencent.mm.ui.fk.a(button2);
            textView2.setOnClickListener(new zl2.y0(optString2, context));
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            button.setOnClickListener(new zl2.c1(context, optInt, optInt2, u3Var, c0Var, k0Var));
            button2.setOnClickListener(new zl2.d1(k0Var));
            k0Var.f211854d = new zl2.e1(callback, c0Var);
            k0Var.f211872n = new zl2.f1(k0Var, roundedCornerFrameLayout);
            k0Var.e(true);
            k0Var.v();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[checkGiftLegalArgeement] errMsg:" + e17.getMessage());
            return false;
        }
    }

    public final boolean v1(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        return x1() && root.getContext().getResources().getConfiguration().orientation == 2;
    }

    public final boolean v2() {
        java.lang.String str = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).f66991o;
        return !(str == null || str.length() == 0);
    }

    public final boolean w(android.content.Context context, dk2.zf commentData) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(commentData, "commentData");
        if (!(commentData instanceof dk2.a8) || commentData.getType() != 20002) {
            return false;
        }
        r45.ch1 ch1Var = ((dk2.a8) commentData).f233186a;
        r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(0);
        java.lang.String str = null;
        if (!kotlin.jvm.internal.o.b((xn1Var == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact3.getUsername(), c01.z1.r())) {
            r45.xn1 xn1Var2 = (r45.xn1) ch1Var.getCustom(0);
            if (!kotlin.jvm.internal.o.b((xn1Var2 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getUsername(), xy2.c.e(context))) {
                r45.xn1 xn1Var3 = (r45.xn1) ch1Var.getCustom(0);
                if (xn1Var3 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) != null) {
                    str = finderContact.getUsername();
                }
                if (!kotlin.jvm.internal.o.b(str, c01.z1.k())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final java.lang.String w0(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return "";
        }
        try {
            java.lang.Object opt = new org.json.JSONObject(r26.i0.t(str, ";", ",", false)).opt(str2);
            if (opt == null) {
                return "";
            }
            java.lang.String obj = opt.toString();
            return obj == null ? "" : obj;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", java.lang.String.valueOf(e17.getMessage()));
            return "";
        }
    }

    public final boolean w1() {
        if (in0.q.f292769b2 != null) {
            return true;
        }
        return sn0.b.f409964e2 != null;
    }

    public final boolean w2(long j17) {
        return pm0.v.z((int) j17, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (S1(r5) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(dk2.zf r8) {
        /*
            r7 = this;
            java.lang.String r0 = "commentData"
            kotlin.jvm.internal.o.g(r8, r0)
            boolean r0 = r7.w1()
            r1 = 0
            if (r0 != 0) goto Lbe
            boolean r0 = r8 instanceof dk2.a8
            if (r0 == 0) goto Lbe
            dk2.ef r0 = dk2.ef.f233372a
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.i(r2)
            mm2.c1 r0 = (mm2.c1) r0
            r2 = 1
            if (r0 == 0) goto L2c
            r45.of1 r0 = r0.I7()
            if (r0 == 0) goto L2c
            r3 = 2
            int r0 = r0.getInteger(r3)
            if (r0 != r2) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r0 == 0) goto Lbe
            r0 = r8
            dk2.a8 r0 = (dk2.a8) r0
            r45.ch1 r0 = r0.f233186a
            r3 = 13
            com.tencent.mm.protobuf.f r4 = r0.getCustom(r3)
            r45.xn1 r4 = (r45.xn1) r4
            java.lang.String r5 = ""
            if (r4 == 0) goto L4e
            com.tencent.mm.protobuf.f r4 = r4.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderContact r4 = (com.tencent.mm.protocal.protobuf.FinderContact) r4
            if (r4 == 0) goto L4e
            java.lang.String r4 = r4.getUsername()
            if (r4 != 0) goto L4f
        L4e:
            r4 = r5
        L4f:
            java.lang.String r6 = c01.z1.r()
            boolean r4 = kotlin.jvm.internal.o.b(r4, r6)
            if (r4 != 0) goto L7f
            int r4 = r8.getType()
            r6 = 20032(0x4e40, float:2.8071E-41)
            if (r4 != r6) goto L7f
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r3)
            r45.xn1 r0 = (r45.xn1) r0
            if (r0 == 0) goto L79
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = (com.tencent.mm.protocal.protobuf.FinderContact) r0
            if (r0 == 0) goto L79
            java.lang.String r0 = r0.getUsername()
            if (r0 != 0) goto L78
            goto L79
        L78:
            r5 = r0
        L79:
            boolean r0 = r7.S1(r5)
            if (r0 != 0) goto Lbd
        L7f:
            int r0 = r8.getType()
            r3 = 20034(0x4e42, float:2.8074E-41)
            if (r0 != r3) goto Lbe
            java.lang.Object r8 = r8.D()
            java.lang.String r0 = "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderLiveContact>"
            kotlin.jvm.internal.o.e(r8, r0)
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            java.util.Iterator r8 = r8.iterator()
        L96:
            boolean r0 = r8.hasNext()
            r3 = 0
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r8.next()
            r4 = r0
            r45.xn1 r4 = (r45.xn1) r4
            com.tencent.mm.protobuf.f r4 = r4.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderContact r4 = (com.tencent.mm.protocal.protobuf.FinderContact) r4
            if (r4 == 0) goto Lb0
            java.lang.String r3 = r4.getUsername()
        Lb0:
            java.lang.String r4 = c01.z1.r()
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            if (r3 == 0) goto L96
            r3 = r0
        Lbb:
            if (r3 == 0) goto Lbe
        Lbd:
            r1 = r2
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.r4.x(dk2.zf):boolean");
    }

    public final boolean x0() {
        return ((java.lang.Boolean) ((jz5.n) f473954e).getValue()).booleanValue();
    }

    public final boolean x1() {
        return in0.q.f292769b2 != null;
    }

    public final boolean x2(long j17) {
        return pm0.v.z((int) j17, 2);
    }

    public final boolean y(lm2.c commentData) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(commentData, "commentData");
        if (kotlin.jvm.internal.o.b(commentData.c(), c01.z1.r()) || commentData.h() != 20032 || !S1(commentData.c())) {
            if (commentData.h() != 20034) {
                return false;
            }
            java.lang.Object obj = null;
            lm2.b bVar = commentData instanceof lm2.b ? (lm2.b) commentData : null;
            if (bVar != null && (arrayList = bVar.f319369n) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) next).getCustom(0);
                    if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, c01.z1.r())) {
                        obj = next;
                        break;
                    }
                }
                obj = (r45.xn1) obj;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public final int y0(com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        if (lVar == null) {
            return 0;
        }
        android.content.Context context = lVar.f113324f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return z0(context, W1(lVar.S0()) || z1(lVar.S0()));
    }

    public final boolean y1(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        if (f473950a.w1() || ((mm2.c1) liveData.a(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) liveData.a(mm2.n0.class)).f329273r;
    }

    public final boolean y2(long j17) {
        return pm0.v.z((int) j17, 1);
    }

    public final void z(gk2.e liveData, mm2.i7 recordableItem) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(recordableItem, "recordableItem");
        long j17 = ((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0);
        r45.hd5 hd5Var = recordableItem.f329148e;
        if (hd5Var == null || j17 == hd5Var.getLong(0)) {
            return;
        }
        recordableItem.a(null);
    }

    public final int z0(android.content.Context context, boolean z17) {
        int dimensionPixelOffset;
        kotlin.jvm.internal.o.g(context, "context");
        int h17 = com.tencent.mm.ui.bk.u(context, false) ? com.tencent.mm.ui.bl.h(context) : 0;
        int c17 = z17 ? com.tencent.mm.ui.bl.c(context) : 0;
        if (z17) {
            if (h17 < c17) {
                h17 = c17;
            }
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        } else {
            if (h17 <= 0) {
                return context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
            }
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        }
        return h17 + dimensionPixelOffset;
    }

    public final boolean z1(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        return w1() && ((mm2.c1) liveData.a(mm2.c1.class)).Y4;
    }

    public final boolean z2(long j17) {
        return pm0.v.z((int) j17, 128);
    }

    public final boolean X1(gk2.e eVar) {
        return !pm0.v.z(eVar != null ? (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q : 0, 2097152);
    }
}
