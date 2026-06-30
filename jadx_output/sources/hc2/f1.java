package hc2;

/* loaded from: classes2.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f280315a = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels;

    /* renamed from: b, reason: collision with root package name */
    public static final android.graphics.Rect f280316b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public static long f280317c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f280318d = jz5.h.b(hc2.a1.f280302d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f280319e = jz5.h.b(hc2.c1.f280305d);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f280320f;

    static {
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f280320f = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127913r8).getValue()).r()).booleanValue() && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A());
    }

    public static final void A(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderExt", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    public static final void B(android.content.Context context, java.lang.String wording) {
        kotlin.jvm.internal.o.g(context, "<this>");
        kotlin.jvm.internal.o.g(wording, "wording");
        db5.t7.f(context, wording, hc2.d1.f280312a);
    }

    public static final void C(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof android.app.Activity) {
            if (((android.app.Activity) context).isFinishing() || !k0Var.i()) {
                com.tencent.mars.xlog.Log.i("FinderExt", "context is finishing or not showing :" + k0Var.i());
            } else {
                try {
                    k0Var.j();
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("FinderExt", "", e17);
                }
            }
        }
    }

    public static final void D(com.tencent.mm.view.RingProgressView ringProgressView, int i17, java.lang.String source, java.lang.String tag) {
        kotlin.jvm.internal.o.g(ringProgressView, "<this>");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(tag, "tag");
        if (ringProgressView.getProgress() != i17) {
            com.tencent.mars.xlog.Log.i(tag, "[refreshPostProgress] source:" + source + " progress:" + ringProgressView.getProgress() + " postProgress:" + i17);
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(ringProgressView.getProgress(), i17);
            ofInt.addUpdateListener(new hc2.e1(ringProgressView));
            android.animation.ValueAnimator duration = ofInt.setDuration(400L);
            if (duration != null) {
                duration.start();
            }
        }
    }

    public static final void E(android.widget.TextView textView, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            textView.setTextSize(0, i65.a.h(textView.getContext(), i17));
            if (z17) {
                textView.setTextColor(b3.l.getColor(textView.getContext(), com.tencent.mm.R.color.f478520a84));
            } else {
                textView.setTextColor(b3.l.getColor(textView.getContext(), com.tencent.mm.R.color.abw));
            }
            com.tencent.mm.ui.fk.c(textView);
        }
    }

    public static /* synthetic */ void F(android.widget.TextView textView, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        E(textView, i17, z17);
    }

    public static jz5.l a(android.app.Activity activity, float f17, int i17, java.lang.String str, long j17, int i18, int i19, int i27, java.lang.Object obj) {
        int i28;
        java.lang.String str2 = (i27 & 4) != 0 ? "" : str;
        int i29 = (i27 & 16) != 0 ? 0 : i18;
        int i37 = (i27 & 32) != 0 ? 0 : i19;
        kotlin.jvm.internal.o.g(activity, "<this>");
        boolean z17 = activity.getResources().getConfiguration().orientation == 1;
        jz5.g gVar = f280319e;
        if (i37 == 0) {
            android.graphics.Point b17 = f280320f ? com.tencent.mm.ui.bl.b(activity) : new android.graphics.Point(activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
            i37 = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() ? b17.x : activity.getResources().getConfiguration().orientation == 1 ? b17.x : b17.y;
        }
        int h17 = com.tencent.mm.ui.bl.h(activity);
        int a17 = com.tencent.mm.ui.bl.a(activity) + h17;
        int intValue = i17 - ((java.lang.Number) ((jz5.n) f280318d).getValue()).intValue();
        float f18 = i17;
        float f19 = i37;
        float f27 = (f18 * 1.0f) / f19;
        float f28 = ((intValue - a17) * 1.0f) / f19;
        float f29 = (intValue * 1.0f) / f19;
        boolean z18 = z17;
        float f37 = ((intValue - h17) * 1.0f) / f19;
        float f38 = 0.45f * f18;
        int b18 = a06.d.b(0.05f * f18);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new jz5.o(0, 0, 17);
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = new jz5.l(java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i37));
        boolean z19 = (i29 & 1) != 0;
        if (java.lang.Float.isNaN(f17)) {
            b(h0Var2, i37, i37);
            c(h0Var, a17, 0, 48);
            pm0.z.b(xy2.b.f458155b, "calculateMedia_radio_error", false, null, null, false, false, new hc2.b1(str2, j17), 60, null);
            i28 = -2;
        } else if (z19 || ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            if (z19) {
                if (f17 >= f27) {
                    b(h0Var2, a06.d.b(f18 / f17), i17);
                } else {
                    b(h0Var2, i37, a06.d.b(f19 * f17));
                }
                c(h0Var, 0, 0, 17);
                i28 = -100;
            } else {
                if (f17 >= f27) {
                    b(h0Var2, a06.d.b(f18 / f17), i17);
                } else {
                    b(h0Var2, i37, a06.d.b(f19 * f17));
                }
                c(h0Var, 0, 0, 17);
                i28 = -1;
            }
        } else if (f17 >= f27) {
            b(h0Var2, i37, a06.d.b(f19 * f17));
            c(h0Var, 0, 0, 17);
            i28 = 1;
        } else if (f29 < f17) {
            b(h0Var2, a06.d.b(f18 / f17), i17);
            c(h0Var, 0, 0, 17);
            i28 = 2;
        } else if (f28 < f17) {
            b(h0Var2, i37, intValue);
            c(h0Var, 0, 0, 48);
            i28 = 3;
        } else {
            float f39 = f19 * f17;
            if (f38 - (f39 / 2) >= a17) {
                b(h0Var2, i37, a06.d.b(f39));
                c(h0Var, -b18, 0, 17);
                i28 = 4;
            } else if (f28 <= f17 || f17 < 1.7777778f) {
                b(h0Var2, i37, a06.d.b(f39));
                c(h0Var, h17, 0, 48);
                i28 = 6;
            } else {
                b(h0Var2, i37, a06.d.b(f19 * f37));
                c(h0Var, h17, 0, 48);
                i28 = 5;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateMediaLayoutParams: decorView[");
        sb6.append(activity.getWindow().getDecorView().getWidth());
        sb6.append('x');
        sb6.append(activity.getWindow().getDecorView().getHeight());
        sb6.append("] displayMetrics[");
        sb6.append(activity.getResources().getDisplayMetrics().widthPixels);
        sb6.append('x');
        sb6.append(activity.getResources().getDisplayMetrics().heightPixels);
        sb6.append("] \nrealDisplay[");
        sb6.append(com.tencent.mm.ui.bl.b(activity));
        sb6.append("] screenHeight=[");
        sb6.append(i37);
        sb6.append('x');
        sb6.append(i17);
        sb6.append("]@");
        sb6.append(f27);
        sb6.append(" RATIOS[screen=");
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f27)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append(" video=");
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f17)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        sb6.append(format2);
        sb6.append("  \navatarTopBar=");
        java.lang.String format3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f28)}, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        sb6.append(format3);
        sb6.append(" avatarScreen=");
        java.lang.String format4 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f29)}, 1));
        kotlin.jvm.internal.o.f(format4, "format(...)");
        sb6.append(format4);
        sb6.append("]  \nsource=");
        sb6.append(i28);
        sb6.append(" OUTPUT[parent[topMargin=");
        sb6.append(((java.lang.Number) ((jz5.o) h0Var.f310123d).f302841d).intValue());
        sb6.append(" bottomMargin=");
        sb6.append(((java.lang.Number) ((jz5.o) h0Var.f310123d).f302842e).intValue());
        sb6.append(" gravity=");
        sb6.append(((java.lang.Number) ((jz5.o) h0Var.f310123d).f302843f).intValue());
        sb6.append("] child[width=");
        sb6.append(((java.lang.Number) ((jz5.l) h0Var2.f310123d).f302833d).intValue());
        sb6.append(" height=");
        sb6.append(((java.lang.Number) ((jz5.l) h0Var2.f310123d).f302834e).intValue());
        sb6.append("]]  \nisPortrait=");
        sb6.append(z18);
        sb6.append(" tag=");
        sb6.append(str2);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(j17));
        com.tencent.mars.xlog.Log.i("FinderExt", sb6.toString());
        return new jz5.l(h0Var.f310123d, h0Var2.f310123d);
    }

    public static final void b(kotlin.jvm.internal.h0 h0Var, int i17, int i18) {
        h0Var.f310123d = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static final void c(kotlin.jvm.internal.h0 h0Var, int i17, int i18, int i19) {
        h0Var.f310123d = new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public static final void d(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127679ec).getValue()).r()).intValue() == 1) {
            x(view);
        }
    }

    public static final void e(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127679ec).getValue()).r()).intValue() == 1) {
            view.performHapticFeedback(0);
        }
    }

    public static final java.lang.String f(android.text.TextPaint textPaint, java.lang.String str, int i17, int i18) {
        kotlin.jvm.internal.o.g(textPaint, "<this>");
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str == null ? "" : str;
        }
        try {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i19 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
            if (new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                return str;
            }
            java.lang.String substring = str.substring(0, new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0));
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            return substring.concat("…");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderExt", th6, "ellipseText: ".concat(str), new java.lang.Object[0]);
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0233, code lost:
    
        if ((r1 != null && r1.getHasBgmInfo()) == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0308 A[LOOP:2: B:49:0x0124->B:65:0x0308, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031d A[EDGE_INSN: B:66:0x031d->B:67:0x031d BREAK  A[LOOP:2: B:49:0x0124->B:65:0x0308], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.tencent.mm.plugin.finder.assist.p0 g(androidx.recyclerview.widget.RecyclerView r37, int r38, int r39, java.util.Set r40) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.f1.g(androidx.recyclerview.widget.RecyclerView, int, int, java.util.Set):com.tencent.mm.plugin.finder.assist.p0");
    }

    public static final com.tencent.mm.view.RefreshLoadMoreLayout h(android.view.ViewGroup viewGroup) {
        com.tencent.mm.view.RefreshLoadMoreLayout h17;
        kotlin.jvm.internal.o.g(viewGroup, "<this>");
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt != null) {
                if (childAt instanceof com.tencent.mm.view.RefreshLoadMoreLayout) {
                    return (com.tencent.mm.view.RefreshLoadMoreLayout) childAt;
                }
                android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                if (viewGroup2 != null && (h17 = h(viewGroup2)) != null) {
                    return h17;
                }
            }
            i17++;
        }
    }

    public static final android.view.View i(android.view.ViewGroup viewGroup, int i17, java.lang.Object tag) {
        android.view.View i18;
        kotlin.jvm.internal.o.g(viewGroup, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        int childCount = viewGroup.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = viewGroup.getChildAt(i19);
            if (kotlin.jvm.internal.o.b(tag, childAt.getTag(i17))) {
                return childAt;
            }
            if ((childAt instanceof android.view.ViewGroup) && (i18 = i((android.view.ViewGroup) childAt, i17, tag)) != null) {
                return i18;
            }
        }
        return null;
    }

    public static final int j(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17, int i17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        if (!z17) {
            return i17;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        androidx.recyclerview.widget.k3 q07 = recyclerView.q0(i17, false);
        android.view.View view = q07 != null ? q07.itemView : null;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        return rect.height() >= (view != null ? view.getHeight() : 0) / 2 ? i17 : j(recyclerView, true, i17 + i18, i18);
    }

    public static final java.lang.String k(android.widget.TextView textView, android.content.Context context, int i17, java.lang.String str, int i18) {
        int length;
        int i19;
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        if (i18 <= 0 || str == null) {
            return str;
        }
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(str, 0, str.length(), textView.getPaint(), i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        if (staticLayout.getLineCount() < i18) {
            return str;
        }
        if (i18 > 1) {
            i19 = staticLayout.getLineEnd(i18 - 2);
            length = staticLayout.getLineEnd(i18 - 1);
        } else {
            length = str.length();
            i19 = 0;
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.ctg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.text.StaticLayout staticLayout2 = new android.text.StaticLayout(str, i19, length, textView.getPaint(), (int) (i17 - textView.getPaint().measureText(string)), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        if (staticLayout2.getLineCount() <= 0) {
            return str;
        }
        java.lang.String substring = str.substring(0, staticLayout2.getLineEnd(0));
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring.concat(string);
    }

    public static final java.util.List l(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer, int i17, yz5.l lVar) {
        int i18 = 0;
        if (lVar == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj : dataBuffer) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i19 >= i17) {
                    arrayList.add(obj);
                }
                i19 = i27;
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : dataBuffer) {
            int i28 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj2;
            if (i18 >= i17 && ((java.lang.Boolean) lVar.invoke(j5Var)).booleanValue()) {
                arrayList2.add(j5Var);
            }
            i18 = i28;
        }
        return arrayList2;
    }

    public static final java.util.List m(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 < 0 || i18 < 0 || i17 > i18) {
            return kz5.n0.V0(linkedList);
        }
        java.lang.Object adapter = recyclerView.getAdapter();
        if (adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
            java.util.List data = wxRecyclerAdapter.getData();
            if (i17 <= i18) {
                while (true) {
                    int a07 = i17 - wxRecyclerAdapter.a0();
                    if (a07 >= 0 && a07 < data.size()) {
                        in5.c cVar = (in5.c) data.get(a07);
                        if (cVar.getItemId() != 0 && (cVar instanceof so2.j5)) {
                            fc2.r rVar = new fc2.r((so2.j5) cVar, a07, null, 4, null);
                            in5.v0 v0Var = (in5.v0) wxRecyclerAdapter.f213721z.get(cVar.getItemId());
                            if (v0Var != null) {
                                rVar.f260979c = v0Var;
                            }
                            linkedList.add(rVar);
                        }
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17++;
                }
            }
        } else if (adapter instanceof zy2.fc) {
            zy2.fc fcVar = (zy2.fc) adapter;
            java.util.List data2 = fcVar.getData();
            if (i17 <= i18) {
                while (true) {
                    int n17 = fcVar.n(i17);
                    if (n17 >= 0 && n17 < data2.size()) {
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) data2.get(n17);
                        if (baseFinderFeed.getItemId() != 0) {
                            linkedList.add(new fc2.r(baseFinderFeed, n17, null, 4, null));
                        }
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17++;
                }
            }
        }
        return kz5.n0.V0(linkedList);
    }

    public static final int n(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        int height = view.getHeight();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return (height > 0 || view2 == null) ? height : o(view, view2).y;
    }

    public static final android.graphics.Point o(android.view.View view, android.view.View parent) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(parent, "parent");
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 0), android.view.View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0));
        return new android.graphics.Point(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static final int p(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        textView.getPaint().getTextBounds("全", 0, 1, rect);
        return rect.width();
    }

    public static final android.graphics.Rect q(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        return new android.graphics.Rect(i17, iArr[1], view.getWidth() + i17, iArr[1] + view.getHeight());
    }

    public static final int r(android.widget.TextView textView, int i17) {
        if (textView != null && textView.getVisibility() == 0) {
            return ((int) textView.getPaint().measureText(textView.getText().toString())) + i17;
        }
        return 0;
    }

    public static final jz5.l s(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17) {
        int w17;
        int y17;
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return new jz5.l(-1, -1);
        }
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
            java.lang.Integer j07 = kz5.z.j0(staggeredGridLayoutManager.u(null));
            w17 = j07 != null ? j07.intValue() : 0;
            java.lang.Integer h07 = kz5.z.h0(staggeredGridLayoutManager.v(null));
            y17 = h07 != null ? h07.intValue() : 0;
        } else {
            if (!(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
                return new jz5.l(-1, -1);
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            w17 = linearLayoutManager.w();
            y17 = linearLayoutManager.y();
        }
        int j17 = j(recyclerView, z17, w17, 1);
        int j18 = j(recyclerView, z17, y17, -1);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (w17 <= y17) {
            int i17 = w17;
            while (true) {
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(i17);
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                android.view.View childAt = layoutManager.getChildAt(i17);
                if (childAt != null) {
                    boolean z18 = childAt.isShown() && childAt.getAlpha() > 0.0f && childAt.getLocalVisibleRect(rect);
                    java.lang.Object obj = s0Var != null ? s0Var.f293125i : null;
                    if ((!(obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && !(obj instanceof com.tencent.mm.plugin.finder.feed.model.d5) && obj != null) || !z18) {
                        if (i17 == w17) {
                            j17++;
                        } else {
                            j18--;
                        }
                    }
                }
                if (i17 == y17) {
                    break;
                }
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderExt", "profileScroll realFirstVisibleItemPosition: " + j17 + ", realLastVisibleItemPosition: " + j18);
        return new jz5.l(java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(j18));
    }

    public static final int t(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        int width = view.getWidth();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return (width > 0 || view2 == null) ? width : o(view, view2).x;
    }

    public static final int u(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return view2 != null ? o(view, view2).y : view.getHeight();
    }

    public static final com.tencent.mm.plugin.finder.feed.model.r9 v(androidx.recyclerview.widget.RecyclerView recyclerView, android.content.Intent data, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader feedLoader, boolean z17, yz5.l lVar) {
        com.tencent.mm.protobuf.g gVar;
        int i17;
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        feedLoader.initBackCache(data);
        com.tencent.mm.plugin.finder.feed.model.r9 backCache = feedLoader.getBackCache();
        if (!(adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter) || backCache == null) {
            return null;
        }
        java.util.ArrayList arrayList = backCache.f108300a;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList) || (gVar = backCache.f108301b) == null) {
            return null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        int a07 = wxRecyclerAdapter.a0();
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList = feedLoader.getDataList();
        java.util.List l17 = l(dataList, 0, lVar);
        if (l17.size() != arrayList.size()) {
            java.util.Iterator it = l17.iterator();
            while (it.hasNext()) {
                dataList.remove((so2.j5) it.next());
            }
            dataList.addAll(arrayList);
            if (z17) {
                feedLoader.setLastBuffer(gVar);
            }
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        int i18 = backCache.f108302c;
        if (i18 >= 0) {
            if (((so2.j5) kz5.n0.a0(arrayList, i18)) != null) {
                java.util.Iterator it6 = dataList.iterator();
                i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it6.next();
                    if (j5Var.getItemId() == j5Var.getItemId()) {
                        break;
                    }
                    i17++;
                }
            } else {
                i17 = 0;
            }
            if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
                androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                arrayList2.add(java.lang.Integer.valueOf(i17 + a07));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(staggeredGridLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.O(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
            } else if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                arrayList3.add(java.lang.Integer.valueOf(i17 + a07));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(linearLayoutManager, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
        com.tencent.mars.xlog.Log.i("FinderExt", "mergeBackCacheAndNotify, pos:" + i18 + ", headCount:" + a07);
        return backCache;
    }

    public static com.tencent.mm.plugin.finder.feed.model.r9 w(androidx.recyclerview.widget.RecyclerView recyclerView, android.content.Intent data, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader feedLoader, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(feedLoader, "feedLoader");
        feedLoader.initBackCache(data);
        com.tencent.mm.plugin.finder.feed.model.r9 backCache = feedLoader.getBackCache();
        if (backCache == null) {
            return null;
        }
        java.util.ArrayList arrayList = backCache.f108300a;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList) || (gVar = backCache.f108301b) == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList = feedLoader.getDataList();
        java.util.List l17 = l(dataList, 0, lVar);
        if (l17.size() != arrayList.size()) {
            java.util.Iterator it = l17.iterator();
            while (it.hasNext()) {
                dataList.remove((so2.j5) it.next());
            }
            dataList.addAll(arrayList);
            if (z17) {
                feedLoader.setLastBuffer(gVar);
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        return backCache;
    }

    public static final void x(android.view.View view) {
        if (view != null) {
            view.performHapticFeedback(4);
        }
    }

    public static void y(android.widget.TextView textView, int i17, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        java.lang.String o17;
        if ((i27 & 4) != 0) {
            i19 = 2;
        }
        if ((i27 & 8) != 0) {
            z17 = false;
        }
        android.content.Context context = textView != null ? textView.getContext() : null;
        if (context == null) {
            return;
        }
        if (i18 == 0) {
            textView.setVisibility(8);
            return;
        }
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        if (i19 == 1) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            o17 = com.tencent.mm.plugin.finder.assist.w2.i(i18);
        } else {
            o17 = com.tencent.mm.plugin.finder.assist.w2.o(i18, z17);
        }
        textView.setText(context.getResources().getString(i17, o17));
    }

    public static final void z(com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, com.tencent.mm.api.IEmojiInfo emoji, yz5.l shorterEdgeTransform, yz5.l longerEdgeTransform) {
        kotlin.jvm.internal.o.g(finderEmojiView, "<this>");
        kotlin.jvm.internal.o.g(emoji, "emoji");
        kotlin.jvm.internal.o.g(shorterEdgeTransform, "shorterEdgeTransform");
        kotlin.jvm.internal.o.g(longerEdgeTransform, "longerEdgeTransform");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(emoji.getWidth());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : emoji.b0();
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(emoji.getHeight());
        java.lang.Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        int intValue2 = num != null ? num.intValue() : emoji.t1();
        int min = java.lang.Math.min(intValue, intValue2);
        int max = java.lang.Math.max(intValue, intValue2);
        if (min == 0 || max == 0) {
            return;
        }
        float f17 = min;
        float f18 = max;
        int intValue3 = ((java.lang.Number) longerEdgeTransform.invoke(java.lang.Integer.valueOf((int) ((((java.lang.Number) shorterEdgeTransform.invoke(java.lang.Integer.valueOf(min))).intValue() / f17) * f18)))).intValue();
        int i17 = (int) (f17 * (intValue3 / f18));
        android.view.ViewGroup.LayoutParams layoutParams = finderEmojiView.getLayoutParams();
        finderEmojiView.setEmojiMaxSize(intValue3);
        finderEmojiView.setEmojiMinSize(i17);
        if (min == intValue) {
            layoutParams.width = i17;
            layoutParams.height = intValue3;
        } else {
            layoutParams.width = intValue3;
            layoutParams.height = i17;
        }
        finderEmojiView.setLayoutParams(layoutParams);
    }
}
