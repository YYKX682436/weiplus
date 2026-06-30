package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wa0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f114899p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f114900q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f114901r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedHashMap f114902s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedHashMap f114903t;

    /* renamed from: u, reason: collision with root package name */
    public km2.s f114904u;

    /* renamed from: v, reason: collision with root package name */
    public km2.s f114905v;

    /* renamed from: w, reason: collision with root package name */
    public int f114906w;

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.r2 f114907x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f114908y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.pa0 f114909z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(android.view.ViewGroup root, qo0.c statusMonitor, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114899p = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.na0(root));
        this.f114900q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.oa0(root));
        this.f114901r = true;
        this.f114902s = new java.util.LinkedHashMap();
        this.f114903t = new java.util.LinkedHashMap();
        this.f114909z = new com.tencent.mm.plugin.finder.live.plugin.pa0(this);
        ((mm2.n6) P0(mm2.n6.class)).f329294g.setValue(java.lang.Boolean.valueOf(zl2.r4.f473950a.I0().getInt(y1(), 1) == 1));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var) {
        wa0Var.f114904u = null;
        wa0Var.f114905v = null;
        wa0Var.x1().setText("");
        java.lang.Object value = ((jz5.n) wa0Var.f114900q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText("");
        wa0Var.f114902s.clear();
        wa0Var.f114903t.clear();
        wa0Var.f114901r = true;
        kotlinx.coroutines.r2 r2Var = wa0Var.f114907x;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.pa0 pa0Var = wa0Var.f114909z;
        pa0Var.removeMessages(1);
        pa0Var.removeMessages(2);
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var, java.lang.String str, int i17, int i18, int i19) {
        wa0Var.getClass();
        boolean z17 = false;
        if (str.length() > 0) {
            km2.s sVar = i19 == 1 ? wa0Var.f114904u : wa0Var.f114905v;
            if (sVar != null && i17 == sVar.f309219c) {
                z17 = true;
            }
            if (z17) {
                if (sVar != null) {
                    sVar.f309218b = str;
                    sVar.f309220d = i18;
                    wa0Var.D1(sVar);
                    return;
                }
                return;
            }
            if (sVar != null) {
                java.lang.String str2 = sVar.f309218b;
                if (str2 == null) {
                    str2 = "";
                }
                int i27 = sVar.f309221e;
                if (i27 > 0) {
                    str2 = wa0Var.C1(str2, i27, str2.length());
                }
                (sVar.f309217a == 1 ? wa0Var.f114902s : wa0Var.f114903t).put(java.lang.Integer.valueOf(sVar.f309219c), str2);
            }
            km2.s sVar2 = new km2.s(i19, str, i17, i18, 0, 16, null);
            if (i19 == 2) {
                wa0Var.f114905v = sVar2;
            } else {
                wa0Var.f114904u = sVar2;
            }
            wa0Var.D1(sVar2);
        }
    }

    public final boolean A1(java.lang.String str, int i17) {
        return new android.text.StaticLayout(str, 0, str.length(), x1().getPaint(), this.f114906w, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= i17;
    }

    public final void B1(int i17, int i18, int i19) {
        int b17;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        if (i19 == 0) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        int i27 = com.tencent.mm.ui.bl.b(viewGroup.getContext()).y;
        if (x0()) {
            b17 = i65.a.b(viewGroup.getContext(), 16);
        } else {
            b17 = (((mm2.c1) P0(mm2.c1.class)).R7() ? i65.a.b(viewGroup.getContext(), 4) : i65.a.b(viewGroup.getContext(), 16)) + (i27 - (i18 + i19));
        }
        if (x0()) {
            this.f114906w = z1();
            com.tencent.mars.xlog.Log.i("FinderLiveSubtitlePlugin", "requestLayout bottomMargin: " + b17 + " maxWidth: " + this.f114906w);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = b17;
                marginLayoutParams.width = this.f114906w;
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = b17;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSubtitlePlugin", "requestLayout bottomMargin: " + b17);
    }

    public final java.lang.String C1(java.lang.String str, int i17, int i18) {
        if (i17 >= str.length() || i18 > str.length()) {
            return "";
        }
        java.lang.String substring = str.substring(i17, i18);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final void D1(km2.s sVar) {
        android.widget.TextView x17;
        com.tencent.mm.plugin.finder.live.plugin.pa0 pa0Var;
        jz5.l lVar;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        if (sVar.f309217a == 2) {
            java.lang.Object value = ((jz5.n) this.f114900q).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            x17 = (android.widget.TextView) value;
        } else {
            x17 = x1();
        }
        int i17 = sVar.f309217a;
        java.util.LinkedHashMap linkedHashMap = i17 == 1 ? this.f114902s : this.f114903t;
        java.lang.String str3 = sVar.f309218b;
        java.lang.String str4 = str3 == null ? "" : str3;
        int i18 = sVar.f309221e;
        java.lang.String C1 = i18 > 0 ? C1(str4, i18, str4.length()) : str4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        java.lang.String concat = sb7.concat(C1);
        int maxLines = x17.getMaxLines();
        com.tencent.mm.plugin.finder.live.plugin.pa0 pa0Var2 = this.f114909z;
        pa0Var2.removeMessages(i17);
        if (A1(concat, maxLines)) {
            x17.setText(w1(concat));
            return;
        }
        try {
            int length = concat.length();
            java.util.List g17 = new r26.t("(?<=\\u002e)|(?<=\\u002c)|(?<=\\u0020)|(?<=\\uff0c)|(?<=\\uff1f)|(?<=\\u3002)|(?<=\\uff1b)|(\n)|(\r)").g(concat, 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : g17) {
                if (((java.lang.String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i19 = size - 1;
            java.lang.String str5 = concat;
            while (true) {
                if (i19 <= 0) {
                    pa0Var = pa0Var2;
                    str = "";
                    z17 = false;
                    break;
                }
                pa0Var = pa0Var2;
                try {
                    java.lang.String g07 = kz5.n0.g0(arrayList.subList(0, i19), "", null, null, 0, "", null, 46, null);
                    if (A1(g07, maxLines)) {
                        str = kz5.n0.g0(arrayList.subList(i19, size), "", null, null, 0, "", null, 46, null);
                        str5 = g07;
                        z17 = true;
                        break;
                    } else {
                        i19--;
                        str5 = g07;
                        pa0Var2 = pa0Var;
                    }
                } catch (java.lang.Exception unused) {
                    lVar = new jz5.l("", "");
                    java.lang.String str6 = (java.lang.String) lVar.f302833d;
                    x17.setText(w1(str6));
                    sVar.f309221e = (r26.n0.P(str4, str6, 0, false, 6, null) + str6.length()) - sb7.length();
                    linkedHashMap.clear();
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = i17;
                    obtain.obj = lVar.f302834e;
                    pa0Var.sendMessageDelayed(obtain, 1000L);
                }
            }
            if (z17) {
                str2 = str5;
            } else {
                int lineEnd = new android.text.StaticLayout(concat, 0, concat.length(), x1().getPaint(), this.f114906w, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0);
                int i27 = lineEnd - 1;
                if (i27 > 0) {
                    lineEnd = i27;
                }
                java.lang.String substring = concat.substring(0, lineEnd);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                java.lang.String substring2 = concat.substring(lineEnd, length);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                str = substring2;
                str2 = substring;
            }
            lVar = new jz5.l(str2, str);
        } catch (java.lang.Exception unused2) {
            pa0Var = pa0Var2;
        }
        java.lang.String str62 = (java.lang.String) lVar.f302833d;
        x17.setText(w1(str62));
        sVar.f309221e = (r26.n0.P(str4, str62, 0, false, 6, null) + str62.length()) - sb7.length();
        linkedHashMap.clear();
        android.os.Message obtain2 = android.os.Message.obtain();
        obtain2.what = i17;
        obtain2.obj = lVar.f302834e;
        pa0Var.sendMessageDelayed(obtain2, 1000L);
    }

    public final void E1(java.lang.String str) {
        if (((mm2.n6) P0(mm2.n6.class)).f329293f && str != null && !kotlin.jvm.internal.o.b(((mm2.n6) P0(mm2.n6.class)).f329294g.getValue(), java.lang.Boolean.FALSE) && !((mm2.c1) P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) P0(mm2.n0.class)).f329273r)) {
                try {
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    this.f114907x = com.tencent.mm.plugin.finder.live.util.y.m(this, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.va0(this, str, null), 2, null);
                    return;
                } catch (java.lang.Exception e17) {
                    hc2.c.a(e17, "FinderLiveSubtitlePlugin, exception updateSubtitle msg: ".concat(str));
                    return;
                }
            }
        }
        if (!this.f114901r || str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSubtitlePlugin", "updateSubtitle msg:" + str + ", disable subtitle!");
        this.f114901r = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f114909z.removeCallbacksAndMessages(null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void n1() {
        ((mm2.h7) P0(mm2.h7.class)).f329115g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.qa0(this));
        ((mm2.h7) P0(mm2.h7.class)).f329122q.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ra0(this));
        ((mm2.n6) P0(mm2.n6.class)).f329294g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.sa0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void v1() {
        com.tencent.mars.xlog.Log.i("FinderLiveSubtitlePlugin", "checkVisible enableSubtitle:" + ((mm2.n6) P0(mm2.n6.class)).f329293f);
        if (!((mm2.n6) P0(mm2.n6.class)).f329293f || ((mm2.c1) P0(mm2.c1.class)).T || ((mm2.n0) P0(mm2.n0.class)).f329273r) {
            return;
        }
        K0(0);
        if (!x0()) {
            android.view.ViewGroup viewGroup = this.f365323d;
            this.f114906w = (int) (com.tencent.mm.ui.bl.b(viewGroup.getContext()).x - (viewGroup.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn) * 2));
        } else if (((mm2.c1) P0(mm2.c1.class)).ba()) {
            this.f114906w = z1();
        }
    }

    public final java.lang.String w1(java.lang.String str) {
        int i17 = 0;
        for (int i18 = 0; i18 < str.length(); i18++) {
            if (!java.util.regex.Pattern.compile("(?<=\\u002e)|(?<=\\u002c)|(?<=\\u0020)|(?<=\\uff0c)|(?<=\\uff1f)|(?<=\\u3002)|(?<=\\uff1b)|(\n)|(\r)").matcher(java.lang.String.valueOf(str.charAt(i18))).find()) {
                break;
            }
            i17++;
        }
        return C1(str, i17, str.length());
    }

    public final android.widget.TextView x1() {
        java.lang.Object value = ((jz5.n) this.f114899p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final java.lang.String y1() {
        return "Subtitle_" + ((mm2.e1) P0(mm2.e1.class)).f328988r.getLong(0);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        this.f114901r = true;
        ((mm2.n6) P0(mm2.n6.class)).f329295h = false;
    }

    public final int z1() {
        return ((int) (com.tencent.mm.ui.bl.b(r0.getContext()).y * (((mm2.c1) P0(mm2.c1.class)).f328879s2 / ((mm2.c1) P0(mm2.c1.class)).f328885t2))) - i65.a.b(this.f365323d.getContext(), 32);
    }
}
