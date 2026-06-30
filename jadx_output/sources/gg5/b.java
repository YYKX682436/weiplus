package gg5;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final gg5.b f271788a = new gg5.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f271789b = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x010e, code lost:
    
        if ((r14 == null || r14.length() == 0) == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence a(android.content.Context r18, com.tencent.mm.storage.l4 r19, int r20, android.text.SpannableStringBuilder r21, java.lang.CharSequence r22) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg5.b.a(android.content.Context, com.tencent.mm.storage.l4, int, android.text.SpannableStringBuilder, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x04a7, code lost:
    
        if (((r3 == null || (r3 = (com.tencent.mm.pluginsdk.ui.tools.j0) r3.y(com.tencent.mm.pluginsdk.ui.tools.j0.class)) == null || r3.f191727h != 139) ? false : true) != false) goto L157;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence b(android.content.Context r22, com.tencent.mm.storage.l4 r23, yf5.x r24, int r25, android.text.SpannableStringBuilder r26, java.lang.CharSequence r27, boolean r28, r45.fh7 r29) {
        /*
            Method dump skipped, instructions count: 1395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg5.b.b(android.content.Context, com.tencent.mm.storage.l4, yf5.x, int, android.text.SpannableStringBuilder, java.lang.CharSequence, boolean, r45.fh7):java.lang.CharSequence");
    }

    public final java.lang.String c(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public final void d(android.widget.ImageView locationShareIv, com.tencent.mm.storage.l4 conv) {
        kotlin.jvm.internal.o.g(locationShareIv, "locationShareIv");
        kotlin.jvm.internal.o.g(conv, "conv");
        if (q21.d.a() != null) {
            if (((va3.z0) q21.d.a()).f(conv.h1())) {
                locationShareIv.setVisibility(0);
                return;
            }
        }
        locationShareIv.setVisibility(8);
    }

    public final void e(android.widget.ImageView multiTalkingIv, com.tencent.mm.storage.l4 conv) {
        kotlin.jvm.internal.o.g(multiTalkingIv, "multiTalkingIv");
        kotlin.jvm.internal.o.g(conv, "conv");
        android.content.Context context = multiTalkingIv.getContext();
        com.tencent.mm.plugin.multitalk.model.y yVar = (com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class);
        if (!com.tencent.mm.storage.z3.R4(conv.h1()) || yVar == null || !yVar.zc(conv.h1())) {
            multiTalkingIv.setVisibility(8);
            return;
        }
        if (yVar.Si() && yVar.Th(conv.h1(), c01.z1.r())) {
            multiTalkingIv.setImageResource(com.tencent.mm.R.raw.chatlist_multitalk_highlight_icon);
        } else {
            multiTalkingIv.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_groupcall, context.getResources().getColor(com.tencent.mm.R.color.f478694eb)));
        }
        multiTalkingIv.setVisibility(0);
    }

    public final android.text.SpannableStringBuilder f(android.content.Context context, com.tencent.mm.storage.l4 l4Var, int i17) {
        if (i17 < 0) {
            i17 = l4Var.d1();
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.gpz, java.lang.Integer.valueOf(i17), "");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (i17 >= 1000) {
            string = context.getString(com.tencent.mm.R.string.f492459o84);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(context, com.tencent.mm.R.color.Red_100)), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final java.lang.String g(android.content.Context context, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).getClass();
        if (zv.q.f476079a.g()) {
            uw.a.f431476a.getClass();
            str = uw.a.f431480e;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str2 = "";
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            str2 = c01.a2.e(str);
        }
        if (str2.length() > 6) {
            java.lang.String substring = str2.substring(0, 6);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            str2 = substring.concat("...");
        }
        kotlin.jvm.internal.o.d(str2);
        if (str2.length() > 0) {
            string = i17 == 1 ? context.getString(com.tencent.mm.R.string.paw, str2, "") : i17 > i18 ? context.getString(com.tencent.mm.R.string.pav, str2, java.lang.Integer.valueOf(i18), "") : context.getString(com.tencent.mm.R.string.par, str2, java.lang.Integer.valueOf(i17), "");
            kotlin.jvm.internal.o.d(string);
        } else {
            string = i17 > i18 ? context.getString(com.tencent.mm.R.string.mtl, java.lang.Integer.valueOf(i18), "") : context.getString(com.tencent.mm.R.string.mtj, java.lang.Integer.valueOf(i17), "");
            kotlin.jvm.internal.o.d(string);
        }
        return string;
    }

    public final java.lang.String h(android.content.Context context, com.tencent.mm.storage.l4 conv) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(conv, "conv");
        if (com.tencent.mm.sdk.platformtools.t8.K0(conv.z0())) {
            java.lang.String y07 = conv.y0();
            kotlin.jvm.internal.o.f(y07, "getDigest(...)");
            return y07;
        }
        java.lang.String i17 = i(conv);
        try {
            java.lang.String y08 = conv.y0();
            kotlin.jvm.internal.o.f(y08, "getDigest(...)");
            java.lang.String format = java.lang.String.format(y08, java.util.Arrays.copyOf(new java.lang.Object[]{i17}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        } catch (java.util.UnknownFormatConversionException unused) {
            return qm.a0.l(conv.Q0(), conv.h1(), conv.j(), j(conv.U0()), context);
        } catch (java.lang.Exception unused2) {
            return qm.a0.l(conv.Q0(), conv.h1(), conv.j(), j(conv.U0()), context);
        }
    }

    public final java.lang.String i(com.tencent.mm.storage.l4 l4Var) {
        if (l4Var.Q0() != 0 || !com.tencent.mm.storage.z3.R4(l4Var.h1())) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String z07 = l4Var.z0();
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(z07);
            return e17 == null ? "" : e17;
        }
        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String z08 = l4Var.z0();
        java.lang.String h17 = l4Var.h1();
        ((sg3.a) v0Var2).getClass();
        java.lang.String f17 = c01.a2.f(z08, h17);
        return f17 == null ? "" : f17;
    }

    public final int j(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return 1;
        }
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConversationWithCacheAdapter", e17, "", new java.lang.Object[0]);
            return 1;
        }
    }

    public final jz5.l k(android.content.Context context, com.tencent.mm.storage.l4 conv, yf5.x xVar, java.util.List list) {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        android.text.SpannableStringBuilder spannableStringBuilder;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(conv, "conv");
        eg5.n nVar = eg5.n.f252856a;
        java.util.List F0 = kz5.n0.F0(kz5.n0.F0(g95.u.c(conv.h1()), new eg5.m()), new eg5.l());
        java.util.HashSet hashSet = new java.util.HashSet();
        int size = F0.size();
        boolean z17 = false;
        if (list != null) {
            str = kz5.n0.g0(kz5.n0.K0(list, 2), ", ", null, null, 0, null, null, 62, null);
            if (!F0.isEmpty()) {
                str = str.concat(", ");
            }
            i17 = java.lang.Math.min(list.size(), 2) + 0;
        } else {
            str = "";
            i17 = 0;
        }
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 2; i18 < size && i17 < i27; i27 = 2) {
            g15.a aVar = (g15.a) F0.get(i18);
            if (!hashSet.contains(java.lang.Integer.valueOf(aVar.k()))) {
                hashSet.add(java.lang.Integer.valueOf(aVar.k()));
                if (i19 > 0) {
                    str = str + ", ";
                }
                i19++;
                i17++;
                str = str + nVar.a(context, aVar.k());
            }
            i18++;
        }
        boolean z18 = i19 < size;
        if (str.length() > 0) {
            if (z18) {
                str = str.concat(", ...");
            }
            str2 = "[" + str + ']';
        } else {
            str2 = "";
        }
        if (str2 == null || str2.length() == 0) {
            spannableStringBuilder = new android.text.SpannableStringBuilder();
        } else {
            r45.fh7 fh7Var = xVar != null ? xVar.f462011w : null;
            if (fh7Var != null) {
                fh7Var.f374360d = 101;
            }
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(str2);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479482a31)), 0, spannableStringBuilder2.length(), 33);
            if (fh7Var != null) {
                fh7Var.f374361e = spannableStringBuilder2.toString();
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
        if (str2.length() > 0) {
            spannableStringBuilder.append((java.lang.CharSequence) " ");
        } else {
            if (xVar != null && !xVar.f462008t) {
                z17 = true;
            }
            if (!z17 && (conv.d1() > 1 || conv.f1() > 0)) {
                spannableStringBuilder.append((java.lang.CharSequence) context.getString(com.tencent.mm.R.string.f492465gq5, java.lang.Integer.valueOf(conv.d1()), ""));
            }
        }
        return new jz5.l(spannableStringBuilder, str2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:27|(4:29|(1:31)(4:43|(1:45)|46|(1:52))|33|(5:35|(1:37)(1:42)|38|(1:40)|41))|53|54|55|(1:57)|58|33|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016a, code lost:
    
        if (r9 != 74) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c8, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConversationWithCacheAdapter", r0, "", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence l(android.content.Context r29, com.tencent.mm.storage.l4 r30, yf5.x r31, int r32) {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg5.b.l(android.content.Context, com.tencent.mm.storage.l4, yf5.x, int):java.lang.CharSequence");
    }
}
