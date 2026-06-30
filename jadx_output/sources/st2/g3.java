package st2;

/* loaded from: classes3.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final st2.g3 f412326a = new st2.g3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f412327b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f412328c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f412329d;

    static {
        com.tencent.mars.xlog.Log.i("ShoppingUtil", "initMemoryTrim");
        ki.i.f308101c.c(new st2.t2());
        jz5.h.b(st2.y2.f412509d);
        jz5.h.b(st2.z2.f412518d);
        f412327b = jz5.h.b(st2.w2.f412492d);
        f412328c = jz5.h.b(st2.x2.f412500d);
        f412329d = new com.tencent.mm.sdk.platformtools.r2(5);
    }

    public static final void a(st2.g3 g3Var, java.lang.String str) {
        g3Var.getClass();
        try {
            com.tencent.mm.sdk.platformtools.r2 r2Var = f412329d;
            int size = r2Var.size();
            zl2.r4.f473950a.M2("ShoppingUtil", str + " cache Size:" + size);
            if (size > 0) {
                r2Var.d(-1);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "ShoppingUtil-memoryTrim");
        }
    }

    public static final void m(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation, android.text.style.ImageSpan imageSpan) {
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(imageSpan));
    }

    public final int b(java.lang.String tag, android.content.Context context, android.widget.TextView couponTv, android.view.ViewGroup promoteGroup, java.lang.String wording, int i17, os5.u config) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(couponTv, "couponTv");
        kotlin.jvm.internal.o.g(promoteGroup, "promoteGroup");
        kotlin.jvm.internal.o.g(wording, "wording");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i(tag, "addCouponLabel " + wording + " space:" + i17);
        if ((wording.length() == 0) || i17 <= 0) {
            return 0;
        }
        couponTv.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f479089ae5));
        couponTv.setBackgroundResource(com.tencent.mm.R.drawable.coo);
        couponTv.setText(wording);
        couponTv.setTextSize(0, config.f348292a);
        couponTv.setMaxLines(1);
        couponTv.setEllipsize(android.text.TextUtils.TruncateAt.END);
        couponTv.setGravity(17);
        int i18 = config.f348294c;
        couponTv.setPadding(i18, 0, i18, 0);
        float desiredWidth = android.text.Layout.getDesiredWidth(couponTv.getText().toString(), couponTv.getPaint());
        if (i17 >= couponTv.getPaddingLeft() + desiredWidth + couponTv.getPaddingRight() + o()) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, f412326a.o(), 0);
            promoteGroup.addView(couponTv, layoutParams);
            return ((int) desiredWidth) + layoutParams.leftMargin + layoutParams.rightMargin + couponTv.getPaddingLeft() + couponTv.getPaddingRight();
        }
        com.tencent.mars.xlog.Log.e(tag, "couponWidth:" + desiredWidth + "(padding:" + couponTv.getPaddingLeft() + '-' + couponTv.getPaddingRight() + ",marginRight:" + o() + "), space:" + i17 + ", no space for coupon!");
        return 0;
    }

    public final int c(java.lang.String tag, android.content.Context context, android.widget.TextView descWordTv, android.view.ViewGroup promoteGroup, java.lang.String wording, int i17, os5.u config) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(descWordTv, "descWordTv");
        kotlin.jvm.internal.o.g(promoteGroup, "promoteGroup");
        kotlin.jvm.internal.o.g(wording, "wording");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i(tag, "addDescWord " + wording + ",space:" + i17);
        if ((wording.length() == 0) || i17 <= 0) {
            return 0;
        }
        descWordTv.setTextColor(i65.a.d(context, com.tencent.mm.R.color.f479100pz));
        descWordTv.setText(wording);
        descWordTv.setTextSize(0, config.f348292a);
        descWordTv.setMaxLines(1);
        descWordTv.setEllipsize(android.text.TextUtils.TruncateAt.END);
        descWordTv.setGravity(17);
        float desiredWidth = android.text.Layout.getDesiredWidth(descWordTv.getText().toString(), descWordTv.getPaint());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, f412326a.o(), 0);
        promoteGroup.addView(descWordTv, layoutParams);
        return ((int) desiredWidth) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public final int d(android.content.Context context, android.view.ViewGroup promoteGroup, r45.ff0 info, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(promoteGroup, "promoteGroup");
        kotlin.jvm.internal.o.g(info, "info");
        int a17 = ym5.x.a(context, 9.0f);
        if (a17 <= i17) {
            android.view.View view = new android.view.View(context);
            view.setTag("dividing_line");
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(ym5.x.a(context, 1.0f), ym5.x.a(context, 8.0f));
            layoutParams.setMargins(0, 0, f412326a.p(), 0);
            layoutParams.gravity = 17;
            java.lang.Integer n17 = n(com.tencent.mm.ui.bk.C() ? info.getString(1) : info.getString(0));
            view.setBackgroundColor(n17 != null ? n17.intValue() : context.getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
            promoteGroup.addView(view, layoutParams);
        }
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r20, android.content.Context r21, android.widget.TextView r22, android.view.ViewGroup r23, r45.hu3 r24, int r25, os5.u r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.g3.e(java.lang.String, android.content.Context, android.widget.TextView, android.view.ViewGroup, r45.hu3, int, os5.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int f(android.content.Context context, r45.r56 info, android.view.ViewGroup promoteGroup, int i17, os5.u config) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(promoteGroup, "promoteGroup");
        kotlin.jvm.internal.o.g(config, "config");
        long j17 = info.getLong(3);
        long j18 = info.getLong(2);
        boolean z17 = true;
        boolean z18 = info.getInteger(4) == 1;
        java.lang.String string = info.getString(5);
        java.lang.String string2 = info.getString(1);
        if (string2 == null) {
            string2 = "";
        }
        com.tencent.mars.xlog.Log.i("ShoppingUtil", "add img " + string2 + ", width = " + j17 + ", height = " + j18 + ", hasFrame = " + z18 + ", frameColor = " + string);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        float f17 = j18 > 0 ? ((float) j17) / ((float) j18) : 0.0f;
        int i18 = config.f348293b;
        int i19 = (int) (i18 * f17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i19, i18);
        layoutParams.setMargins(0, 0, f412326a.p(), 0);
        if (z18) {
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            int color = z17 ? context.getColor(com.tencent.mm.R.color.f479096pv) : zl2.q4.f473933a.O(string);
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(i65.a.a(context, 3.0f));
            gradientDrawable.setStroke(i65.a.a(context, 0.5f), color);
            imageView.setBackgroundDrawable(gradientDrawable);
        }
        new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(string2, com.tencent.mm.plugin.finder.storage.y90.f128356f)).c(imageView);
        int i27 = i19 + layoutParams.rightMargin;
        if (i27 <= i17) {
            promoteGroup.addView(imageView, layoutParams);
        }
        return i27;
    }

    public final java.lang.Object g(java.lang.String str, android.content.Context context, android.view.ViewGroup viewGroup, r45.e34 e34Var, int i17, os5.u uVar, kotlin.coroutines.Continuation continuation) {
        java.lang.String string = e34Var.getString(0);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = e34Var.getString(2);
        java.lang.String str2 = string2 != null ? string2 : "";
        com.tencent.mars.xlog.Log.i(str, "addJumpDescWord " + string + ",space:" + i17);
        if ((string.length() == 0) || i17 <= 0) {
            return new java.lang.Integer(0);
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dda, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h6y);
        if (str2.length() > 0) {
            imageView.setVisibility(0);
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f)).c(imageView);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(string);
        textView.setTextSize(0, uVar.f348292a);
        int paddingTop = inflate.getPaddingTop();
        int paddingBottom = inflate.getPaddingBottom();
        int i18 = uVar.f348294c;
        inflate.setPadding(i18, paddingTop, i18, paddingBottom);
        inflate.setOnClickListener(new st2.v2(inflate, e34Var));
        inflate.measure(0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, f412326a.p(), 0);
        int measuredWidth = inflate.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        if (measuredWidth <= i17) {
            viewGroup.addView(inflate, layoutParams);
        }
        return new java.lang.Integer(measuredWidth);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(org.json.JSONObject r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r10 == 0) goto L7f
            java.util.Iterator r10 = r10.iterator()
        L10:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r10.next()
            r45.q56 r1 = (r45.q56) r1
            r2 = 0
            java.util.LinkedList r1 = r1.getList(r2)
            java.lang.String r3 = "getShow_box_items(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L10
            java.lang.Object r3 = r1.next()
            r45.p56 r3 = (r45.p56) r3
            int r4 = r3.getInteger(r2)
            r5 = 6
            if (r4 != r5) goto L2a
            r45.hu3 r4 = new r45.hu3
            r4.<init>()
            r5 = 1
            com.tencent.mm.protobuf.g r3 = r3.getByteString(r5)
            r6 = 0
            if (r3 == 0) goto L4f
            byte[] r3 = r3.g()
            goto L50
        L4f:
            r3 = r6
        L50:
            if (r3 != 0) goto L54
        L52:
            r4 = r6
            goto L65
        L54:
            r4.parseFrom(r3)     // Catch: java.lang.Exception -> L58
            goto L65
        L58:
            r3 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r7 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r7, r4, r3)
            goto L52
        L65:
            if (r4 == 0) goto L2a
            r3 = 2
            int r3 = r4.getInteger(r3)
            int r4 = r0.length()
            if (r4 <= 0) goto L73
            goto L74
        L73:
            r5 = r2
        L74:
            if (r5 == 0) goto L7b
            java.lang.String r4 = ","
            r0.append(r4)
        L7b:
            r0.append(r3)
            goto L2a
        L7f:
            java.lang.String r10 = "show_guarantee_types"
            java.lang.String r0 = r0.toString()
            r9.put(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.g3.h(org.json.JSONObject, java.util.List):void");
    }

    public final void i(org.json.JSONObject json, java.util.List list) {
        kotlin.jvm.internal.o.g(json, "json");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (list != null) {
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append(((r45.hu3) obj).getInteger(2));
                if (i17 < list.size() - 1) {
                    sb6.append(",");
                }
                i17 = i18;
            }
        }
        json.put("show_guarantee_types", sb6.toString());
    }

    public final android.text.style.ImageSpan j(android.content.Context context, android.graphics.Bitmap bitmap, int i17) {
        int i18;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        try {
            i18 = (int) ((i17 * bitmap.getWidth()) / bitmap.getHeight());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ShoppingUtil", "buildImageSpan " + e17.getMessage());
            i18 = i17 * 2;
        }
        bitmapDrawable.setBounds(0, 0, i18, i17);
        return new al5.w(bitmapDrawable, 1);
    }

    public final org.json.JSONObject k(r45.y23 data) {
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("seckill", f412326a.v(data) ? 1 : 0);
        jSONObject.put("extra_report_json", data.getString(50));
        return jSONObject;
    }

    public final java.lang.Object l(android.content.Context context, java.lang.String str, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f412329d.get(str);
        if (!z17 || bitmap == null) {
            if (zl2.q4.f473933a.E()) {
                com.tencent.mars.xlog.Log.i("ShoppingUtil", "genImageSpan load:" + str + '!');
            }
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329965s));
            st2.a3 a3Var = new st2.a3(context, i17, str, c0Var, nVar);
            b17.getClass();
            b17.f447873d = a3Var;
            b17.f();
        } else {
            if (zl2.q4.f473933a.E()) {
                com.tencent.mars.xlog.Log.i("ShoppingUtil", "genImageSpan reuse span:" + str + '!');
            }
            m(c0Var, nVar, f412326a.j(context, bitmap, i17));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final java.lang.Integer n(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(w(str)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ShoppingUtil", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final int o() {
        return ((java.lang.Number) ((jz5.n) f412327b).getValue()).intValue();
    }

    public final int p() {
        return ((java.lang.Number) ((jz5.n) f412328c).getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r11, long r13, int r15, java.lang.String r16, kotlin.coroutines.Continuation r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof st2.b3
            if (r1 == 0) goto L16
            r1 = r0
            st2.b3 r1 = (st2.b3) r1
            int r2 = r1.f412235f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f412235f = r2
            r2 = r10
            goto L1c
        L16:
            st2.b3 r1 = new st2.b3
            r2 = r10
            r1.<init>(r10, r0)
        L1c:
            java.lang.Object r0 = r1.f412233d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r1.f412235f
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: rm0.j -> L2b
            goto L86
        L2b:
            r0 = move-exception
            goto L89
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            kotlin.ResultKt.throwOnFailure(r0)
            r45.ld2 r0 = new r45.ld2
            r0.<init>()
            r4 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r0.set(r4, r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r0.set(r5, r4)
            r4 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r0.set(r4, r6)
            r4 = 3
            r6 = r16
            r0.set(r4, r6)
            java.lang.String r4 = "/cgi-bin/mmbiz-bin/finderliveecgetliveconfig"
            r6 = 7668(0x1df4, float:1.0745E-41)
            ke2.o0 r7 = new ke2.o0     // Catch: rm0.j -> L2b
            r45.bp1 r8 = new r45.bp1     // Catch: rm0.j -> L2b
            r8.<init>()     // Catch: rm0.j -> L2b
            r9 = 0
            r11 = r7
            r12 = r4
            r13 = r6
            r14 = r8
            r15 = r0
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)     // Catch: rm0.j -> L2b
            r8 = 0
            r0 = 0
            r4 = 3
            r6 = 0
            r1.f412235f = r5     // Catch: rm0.j -> L2b
            r11 = r7
            r12 = r8
            r14 = r0
            r15 = r1
            r16 = r4
            r17 = r6
            java.lang.Object r0 = rm0.h.a(r11, r12, r14, r15, r16, r17)     // Catch: rm0.j -> L2b
            if (r0 != r3) goto L86
            return r3
        L86:
            r45.nd2 r0 = (r45.nd2) r0     // Catch: rm0.j -> L2b
            goto Lbd
        L89:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "getEcResponse:"
            r1.<init>(r3)
            java.lang.String r3 = r0.getLocalizedMessage()
            r1.append(r3)
            r3 = 44
            r1.append(r3)
            int r4 = r0.f397425f
            r1.append(r4)
            r4 = 45
            r1.append(r4)
            int r4 = r0.f397424e
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = r0.f397426g
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ShoppingUtil"
            com.tencent.mars.xlog.Log.e(r1, r0)
            r0 = 0
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.g3.q(long, long, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String r(boolean z17, cm2.m0 item, r45.rl0 rl0Var) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(item, "item");
        int i17 = item.H;
        boolean z18 = rl0Var != null;
        if (z17) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if ((i17 == 0 || i17 == 9999999 || i17 == 10000000) || z18) {
                r45.y23 data = item.f43368v;
                kotlin.jvm.internal.o.g(data, "data");
                r45.y64 d17 = cm2.a.f43328a.d(data);
                java.lang.Integer valueOf = ((d17 != null ? d17.getLong(1) : 0L) <= c01.id.c() || d17 == null) ? null : java.lang.Integer.valueOf(d17.getInteger(3));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(item.f43370x);
                sb6.append('-');
                sb6.append(item.f43369w);
                sb6.append(" discountStock:");
                sb6.append(valueOf);
                sb6.append(",isExclusiveStock:");
                sb6.append(z18);
                sb6.append(",exclusive stock:");
                sb6.append(rl0Var != null ? java.lang.Integer.valueOf(rl0Var.getInteger(3)) : null);
                sb6.append(",stock:");
                sb6.append(item.f43372z);
                com.tencent.mars.xlog.Log.i("ShoppingUtil", sb6.toString());
                if (valueOf != null && valueOf.intValue() > 0) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eem, valueOf);
                } else if (z18) {
                    android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(rl0Var != null ? rl0Var.getInteger(3) : 0);
                    string = resources.getString(com.tencent.mm.R.string.edz, objArr);
                } else {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eem, java.lang.Integer.valueOf(item.f43372z));
                }
                kotlin.jvm.internal.o.d(string);
                return string;
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s(java.lang.String str, gk2.e buContext, r45.dv1 resp) {
        java.lang.String str2;
        int i17;
        r45.k74 k74Var;
        java.lang.String str3;
        java.lang.String sb6;
        java.util.List arrayList;
        java.util.LinkedList<r45.ov2> list;
        bw5.u7 f17;
        bw5.u7 f18;
        r45.c33 c33Var;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(resp, "resp");
        if (resp.getLong(6) != ((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0)) {
            com.tencent.mars.xlog.Log.i("ShoppingUtil", "handleShopShellResp invalid live resp,liveId:" + resp.getLong(6) + ",current liveId:" + ((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0));
            return false;
        }
        mm2.f6 f6Var = (mm2.f6) buContext.a(mm2.f6.class);
        int i18 = 1;
        if (str == null) {
            f6Var.f329047u = 0;
            f6Var.f329039o.f364680a.clear();
            f6Var.f329033g = true;
            resp.getInteger(49);
            resp.getByteString(48);
            f6Var.f329047u = resp.getInteger(10);
            r45.dv1 dv1Var = f6Var.f329038n;
            if (dv1Var == null) {
                f6Var.a7(resp);
                java.util.LinkedList<r45.l92> list2 = resp.getList(1);
                kotlin.jvm.internal.o.f(list2, "getItem_list(...)");
                for (r45.l92 l92Var : list2) {
                    cm2.a aVar = cm2.a.f43328a;
                    kotlin.jvm.internal.o.d(l92Var);
                    so2.j5 z17 = aVar.z(l92Var);
                    if (z17 != null) {
                        f6Var.f329039o.f364680a.add(z17);
                    }
                }
                com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "first mergeProductShelf, size:" + f6Var.f329039o.f364680a.size());
            } else {
                dv1Var.set(2, (r45.c33) resp.getCustom(2));
                r45.dv1 dv1Var2 = f6Var.f329038n;
                if (dv1Var2 != null) {
                    dv1Var2.set(4, (r45.c33) resp.getCustom(4));
                }
                r45.dv1 dv1Var3 = f6Var.f329038n;
                if (dv1Var3 != null) {
                    dv1Var3.set(5, (r45.ve2) resp.getCustom(5));
                }
                r45.dv1 dv1Var4 = f6Var.f329038n;
                if (dv1Var4 != null) {
                    dv1Var4.set(7, (r45.c33) resp.getCustom(7));
                }
                r45.dv1 dv1Var5 = f6Var.f329038n;
                if (dv1Var5 != null) {
                    dv1Var5.set(11, (r45.h92) resp.getCustom(11));
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList<r45.l92> list3 = resp.getList(1);
                kotlin.jvm.internal.o.f(list3, "getItem_list(...)");
                for (r45.l92 l92Var2 : list3) {
                    cm2.a aVar2 = cm2.a.f43328a;
                    kotlin.jvm.internal.o.d(l92Var2);
                    so2.j5 z18 = aVar2.z(l92Var2);
                    if (z18 instanceof cm2.m0) {
                        qm0.a aVar3 = f6Var.f329039o;
                        mm2.a6 a6Var = new mm2.a6(z18);
                        aVar3.getClass();
                        java.util.List list4 = aVar3.f364680a;
                        kotlin.jvm.internal.o.f(list4, "list");
                        synchronized (list4) {
                            java.util.Iterator it = list4.iterator();
                            int i19 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i17 = -1;
                                    break;
                                }
                                if (((java.lang.Boolean) a6Var.invoke(it.next())).booleanValue()) {
                                    i17 = i19;
                                    break;
                                }
                                i19++;
                            }
                        }
                        if (i17 == -1) {
                            linkedList.add(z18);
                        }
                    } else if (z18 instanceof cm2.k0) {
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "add couponItem: " + z18);
                        linkedList.add(z18);
                    } else if (z18 instanceof cm2.i0) {
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "add bulkBuyItem: " + z18);
                        linkedList.add(z18);
                    }
                }
                qm0.a aVar4 = f6Var.f329039o;
                mm2.b6 b6Var = mm2.b6.f328766d;
                aVar4.getClass();
                java.util.List list5 = aVar4.f364680a;
                kotlin.jvm.internal.o.f(list5, "list");
                pm0.v.G(list5, b6Var);
                f6Var.f329039o.f364680a.addAll(linkedList);
                com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "continue mergeProductShelf, size:" + f6Var.f329039o.f364680a.size());
            }
            if (!f6Var.f329039o.f364680a.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "mergeProducts, anchorProductsOnSale!");
            }
            f6Var.S6(f6Var.f329039o);
            r45.nt2 nt2Var = (r45.nt2) resp.getCustom(12);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("switch:");
            sb7.append(nt2Var != null ? java.lang.Integer.valueOf(nt2Var.getInteger(0)) : null);
            sb7.append(", type:");
            sb7.append(nt2Var != null ? java.lang.Integer.valueOf(nt2Var.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb7.toString());
            f6Var.E = nt2Var;
            r45.uv2 uv2Var = (r45.uv2) resp.getCustom(32);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("askForPromoteSetting = ");
            sb8.append(uv2Var != null ? java.lang.Integer.valueOf(uv2Var.getInteger(0)) : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb8.toString());
            f6Var.F = uv2Var;
            f6Var.G = resp.getLong(13);
            resp.getString(15);
            r45.qv2 qv2Var = (r45.qv2) resp.getCustom(18);
            if (qv2Var != null) {
                k74Var = new r45.k74();
                k74Var.set(0, qv2Var.getString(0));
                k74Var.set(1, qv2Var.getString(1));
                k74Var.set(2, qv2Var.getString(2));
                k74Var.set(3, qv2Var.getString(3));
            } else {
                k74Var = null;
            }
            f6Var.f329031J = k74Var;
            f6Var.K = (r45.e56) resp.getCustom(16);
            r45.j31 j31Var = (r45.j31) resp.getCustom(19);
            f6Var.Y = j31Var;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("set flash sale record config: enabled = ");
            sb9.append(j31Var != null ? java.lang.Integer.valueOf(j31Var.getInteger(0)) : null);
            sb9.append(", path = ");
            sb9.append((j31Var == null || (c33Var = (r45.c33) j31Var.getCustom(1)) == null) ? null : c33Var.getString(1));
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb9.toString());
            r45.k31 k31Var = (r45.k31) resp.getCustom(25);
            f6Var.W = k31Var;
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("get flashSaleSwitchSetting: switch = ");
            sb10.append(k31Var != null ? java.lang.Integer.valueOf(k31Var.getInteger(0)) : null);
            sb10.append(", first open = ");
            sb10.append(k31Var != null ? java.lang.Integer.valueOf(k31Var.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb10.toString());
            r45.c33 c33Var2 = (r45.c33) resp.getCustom(20);
            f6Var.Z = c33Var2;
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("set cart jump info, appId = ");
            sb11.append(c33Var2 != null ? c33Var2.getString(0) : null);
            sb11.append(", path = ");
            sb11.append(c33Var2 != null ? c33Var2.getString(1) : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb11.toString());
            bw5.x7 x7Var = (bw5.x7) resp.getCustom(44);
            f6Var.f329041p0 = x7Var;
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("set shopBagJumpInfo, miniAppInfo appid = ");
            sb12.append((x7Var == null || (f18 = x7Var.f()) == null) ? null : f18.getAppid());
            sb12.append(", path = ");
            sb12.append((x7Var == null || (f17 = x7Var.f()) == null) ? null : f17.getPath());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb12.toString());
            f6Var.f329051x0 = (r45.yv2) resp.getCustom(21);
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder("set shelf order setting, asc flag = ");
            r45.yv2 yv2Var = f6Var.f329051x0;
            sb13.append(yv2Var != null ? java.lang.Integer.valueOf(yv2Var.getInteger(0)) : null);
            sb13.append(", insert flag = ");
            r45.yv2 yv2Var2 = f6Var.f329051x0;
            sb13.append(yv2Var2 != null ? java.lang.Integer.valueOf(yv2Var2.getInteger(1)) : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb13.toString());
            f6Var.f329054y0 = (r45.a56) resp.getCustom(22);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "set shopVIPInfo " + f6Var.f329054y0);
            java.lang.String string = resp.getString(43);
            if ((string != null ? string.length() : 0) <= 5000) {
                f6Var.C = resp.getString(43);
            } else {
                java.lang.StringBuilder sb14 = new java.lang.StringBuilder("liveRoomBuffer too long, length: ");
                java.lang.String string2 = resp.getString(43);
                sb14.append(string2 != null ? java.lang.Integer.valueOf(string2.length()) : null);
                com.tencent.mars.xlog.Log.e("ShoppingUtil", sb14.toString());
            }
            bw5.jj0 jj0Var = (bw5.jj0) resp.getCustom(39);
            f6Var.f329036l1 = jj0Var;
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder("set shelf coupon banner info, shelfCouponBannerInfo2 = ");
            sb15.append(jj0Var != null ? jj0Var.toJSON() : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb15.toString());
            java.util.LinkedList list6 = resp.getList(24);
            f6Var.f329057z1 = list6;
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "set productFilterLabels " + list6);
            int integer = resp.getInteger(30);
            f6Var.A1 = integer;
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "set enableAnchorPrehot " + integer);
            java.lang.String str4 = "ShoppingUtil";
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder("handleShopShellResp licenseLiteApp:");
            r45.k74 k74Var2 = f6Var.f329031J;
            sb16.append(k74Var2 != null ? k74Var2.getString(0) : null);
            sb16.append(",productList:");
            java.util.List b17 = f6Var.f329039o.b(st2.c3.f412250d);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it6 = ((java.util.ArrayList) b17).iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var = (so2.j5) it6.next();
                kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
                arrayList2.add(((cm2.m0) j5Var).f43368v);
            }
            if (arrayList2.isEmpty()) {
                sb6 = "";
                str3 = "ShoppingUtil";
                str2 = null;
            } else {
                java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                java.util.Iterator it7 = arrayList2.iterator();
                int i27 = 0;
                while (it7.hasNext()) {
                    java.lang.Object next = it7.next();
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.y23 y23Var = (r45.y23) next;
                    java.lang.StringBuilder sb18 = new java.lang.StringBuilder("[第");
                    sb18.append(i27);
                    sb18.append("个,");
                    sb18.append(y23Var.getString(i18));
                    sb18.append('-');
                    java.lang.String str5 = str4;
                    sb18.append(y23Var.getLong(0));
                    sb18.append(",price:");
                    sb18.append(y23Var.getInteger(5));
                    sb18.append('-');
                    sb18.append(y23Var.getInteger(4));
                    sb18.append(",showBox:");
                    mm2.x5 x5Var = mm2.f6.G1;
                    java.util.LinkedList list7 = y23Var.getList(28);
                    kotlin.jvm.internal.o.f(list7, "getShow_box_items(...)");
                    sb18.append(x5Var.a(list7));
                    sb18.append(',');
                    sb18.append(y23Var.getInteger(10));
                    sb18.append(']');
                    sb17.append(sb18.toString());
                    i27 = i28;
                    str4 = str5;
                    i18 = 1;
                }
                str3 = str4;
                str2 = null;
                sb6 = sb17.toString();
                kotlin.jvm.internal.o.f(sb6, "toString(...)");
            }
            sb16.append(sb6);
            com.tencent.mars.xlog.Log.i(str3, sb16.toString());
            r45.tv2 tv2Var = (r45.tv2) resp.getCustom(31);
            if (tv2Var == null || (list = tv2Var.getList(0)) == null) {
                arrayList = new java.util.ArrayList();
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.ov2 ov2Var : list) {
                    kotlin.jvm.internal.o.d(ov2Var);
                    arrayList3.add(new cm2.k0(ov2Var));
                }
                arrayList = kz5.n0.V0(arrayList3);
            }
            f6Var.f329044r = arrayList;
            r45.tv2 tv2Var2 = (r45.tv2) resp.getCustom(31);
            java.lang.String string3 = tv2Var2 != null ? tv2Var2.getString(1) : str2;
            if (string3 == null) {
                string3 = "";
            }
            f6Var.f329045s = string3;
            f6Var.P = resp;
        } else {
            str2 = null;
            java.util.LinkedList linkedList2 = f6Var.f329043q;
            linkedList2.clear();
            java.util.LinkedList<r45.l92> list8 = resp.getList(1);
            kotlin.jvm.internal.o.f(list8, "getItem_list(...)");
            for (r45.l92 l92Var3 : list8) {
                cm2.a aVar5 = cm2.a.f43328a;
                kotlin.jvm.internal.o.d(l92Var3);
                so2.j5 z19 = aVar5.z(l92Var3);
                if (z19 != null && (z19 instanceof cm2.m0)) {
                    linkedList2.add(z19);
                }
            }
            f6Var.D = str;
        }
        r45.c33 c33Var3 = (r45.c33) resp.getCustom(7);
        java.lang.String string4 = c33Var3 != null ? c33Var3.getString(0) : str2;
        r45.c33 c33Var4 = (r45.c33) resp.getCustom(7);
        java.lang.String string5 = c33Var4 != null ? c33Var4.getString(1) : str2;
        if (string4 != null && string5 != null) {
            ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4("", string4, string5, 0);
        }
        r45.c33 c33Var5 = (r45.c33) resp.getCustom(20);
        java.lang.String string6 = c33Var5 != null ? c33Var5.getString(0) : str2;
        r45.c33 c33Var6 = (r45.c33) resp.getCustom(20);
        java.lang.String string7 = c33Var6 != null ? c33Var6.getString(1) : str2;
        if (string6 != null && string7 != null) {
            ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4("", string6, string7, 0);
        }
        mm2.e1 e1Var = (mm2.e1) buContext.a(mm2.e1.class);
        com.tencent.mm.protobuf.g byteString = resp.getByteString(3);
        e1Var.l7(byteString != null ? byteString.f192156a : str2);
        com.tencent.mars.xlog.Log.i("ShoppingUtil", "handleShopShellResp mergeProducts, resp list size:" + resp.getList(1).size());
        java.lang.String string8 = resp.getString(8);
        if (string8 != null) {
            ((mm2.c1) buContext.a(mm2.c1.class)).y9(string8);
        }
        return true;
    }

    public final void t(java.lang.String source, kotlinx.coroutines.y0 scope, android.widget.TextView text, java.util.List list, java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27, int i17, int i18, java.lang.Float f17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(str, "str");
        if (!(list == null || list.isEmpty())) {
            kotlinx.coroutines.l.d(scope, null, null, new st2.f3(list, source, scope, z18, i18, z19, f17, text, i17, z27, str, z17, aVar, null), 3, null);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        text.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
    }

    public final boolean v(r45.y23 data) {
        kotlin.jvm.internal.o.g(data, "data");
        r45.y64 d17 = cm2.a.f43328a.d(data);
        return d17 != null && d17.getInteger(0) > 0;
    }

    public final java.lang.String w(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() != 9) {
            return str;
        }
        char charAt = str.charAt(0);
        java.lang.String substring = str.substring(1, 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = str.substring(3, 5);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        java.lang.String substring3 = str.substring(5, 7);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        java.lang.String substring4 = str.substring(7, 9);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        return charAt + substring4 + substring + substring2 + substring3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(android.widget.TextView r22, java.lang.String r23, android.view.View r24, android.widget.TextView r25, java.lang.String r26, android.widget.TextView r27, java.lang.String r28, android.view.View r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.g3.x(android.widget.TextView, java.lang.String, android.view.View, android.widget.TextView, java.lang.String, android.widget.TextView, java.lang.String, android.view.View, boolean):boolean");
    }
}
