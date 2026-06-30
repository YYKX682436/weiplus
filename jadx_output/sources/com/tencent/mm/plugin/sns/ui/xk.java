package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public abstract class xk extends ql5.d {

    /* renamed from: w, reason: collision with root package name */
    public static int f171529w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static int f171530x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static int f171531y = 2;

    /* renamed from: f, reason: collision with root package name */
    public final zd4.o f171535f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f171536g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f171537h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.LayoutInflater f171538i;

    /* renamed from: j, reason: collision with root package name */
    public int f171539j;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.yk f171549t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f171550u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f171551v;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f171532z = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jbm);
    public static java.lang.String A = "";
    public static java.util.List B = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f171533d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f171534e = false;

    /* renamed from: k, reason: collision with root package name */
    public int f171540k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f171541l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f171542m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f171543n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f171544o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f171545p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f171546q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f171547r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f171548s = new java.util.ArrayList();

    public xk(android.content.Context context, zd4.o oVar) {
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f171549t = null;
        this.f171550u = "";
        this.f171551v = "";
        this.f171537h = context;
        this.f171538i = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.f171535f = oVar == null ? new zd4.s() : oVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_from_chatroom_enable, 1) == 1) {
            f171529w = 0;
            f171530x = 1;
            f171531y = 2;
        } else {
            f171529w = -1;
            f171530x = 0;
            f171531y = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "initWithConfig %s %s %s %s", java.lang.Integer.valueOf(f171529w), java.lang.Integer.valueOf(f171530x), java.lang.Integer.valueOf(f171531y), java.lang.Integer.valueOf(f()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithConfig", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r9 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence k(java.util.ArrayList r11, boolean r12, int r13) {
        /*
            java.lang.String r0 = "packageLabelInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            r3 = 0
        Le:
            int r4 = r11.size()
            if (r3 >= r4) goto Lc8
            int r4 = r2.length()
            java.lang.Object r5 = r11.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            c93.b r6 = c93.a.a()
            b93.b r6 = (b93.b) r6
            java.lang.String r6 = r6.g(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L30
            goto Lc4
        L30:
            c93.b r7 = c93.a.a()
            b93.b r7 = (b93.b) r7
            java.util.List r7 = r7.j(r5)
            java.lang.String r8 = "MicroMsg.Sns.AnimatedExpandableListAdapter"
            if (r7 == 0) goto L44
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L6a
        L44:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r9 = com.tencent.mm.plugin.sns.ui.xk.A
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L56
            java.util.List r9 = com.tencent.mm.plugin.sns.ui.xk.B
            r7.addAll(r9)
        L56:
            java.lang.String r9 = com.tencent.mm.plugin.sns.ui.xk.A
            boolean r9 = r5.equals(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r6, r5}
            java.lang.String r10 = "packageLabelInfo nameList empty,new create:%b, label name:%s id:%s "
            com.tencent.mars.xlog.Log.i(r8, r10, r9)
        L6a:
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5, r7}
            java.lang.String r7 = "packageLabelInfo label name:%s id:%s size:%d"
            com.tencent.mars.xlog.Log.i(r8, r7, r5)
            int r5 = r11.size()
            int r5 = r5 + (-1)
            if (r3 == r5) goto L96
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r7 = com.tencent.mm.plugin.sns.ui.xk.f171532z
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            goto L97
        L96:
            r5 = r6
        L97:
            java.lang.Class<le0.x> r7 = le0.x.class
            i95.m r7 = i95.n0.c(r7)
            le0.x r7 = (le0.x) r7
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            ke0.e r7 = (ke0.e) r7
            r7.getClass()
            android.text.SpannableString r5 = com.tencent.mm.pluginsdk.ui.span.c0.i(r8, r5)
            r2.append(r5)
            if (r12 == 0) goto Lc4
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            android.content.Context r7 = com.tencent.mm.sdk.platformtools.x2.f193071a
            int r7 = i65.a.d(r7, r13)
            r5.<init>(r7)
            int r6 = r6.length()
            int r6 = r6 + r4
            r7 = 17
            r2.setSpan(r5, r4, r6, r7)
        Lc4:
            int r3 = r3 + 1
            goto Le
        Lc8:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.xk.k(java.util.ArrayList, boolean, int):java.lang.CharSequence");
    }

    @Override // ql5.d
    public int c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        zd4.o oVar = this.f171535f;
        int n17 = oVar.n(i17);
        if (!oVar.o(n17, 2) && (!oVar.o(n17, 3) || this.f171536g == null)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
        int f17 = f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return f17;
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearExcludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        this.f171546q.clear();
        this.f171551v = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearExcludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearIncludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        this.f171545p.clear();
        this.f171550u = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearIncludeSelectedOtherUsers", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    public int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (this.f171533d) {
            int i17 = f171531y + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return i17;
        }
        int i18 = f171530x + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return i18;
    }

    public final java.util.List g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(335875, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return null;
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return P1;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        java.lang.Object obj = this.f171536g.get(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return obj;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 4;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x014d, code lost:
    
        if (r13 != 6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01c3, code lost:
    
        if (r1 != 4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    @Override // android.widget.ExpandableListAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getGroupView(int r22, boolean r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.xk.getGroupView(int, boolean, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean h(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        if (i17 == 1) {
            boolean i18 = i(this.f171543n, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            return i18;
        }
        boolean i19 = i(this.f171544o, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return i19;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return false;
    }

    public final boolean i(java.util.List list, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return true;
    }

    public java.lang.CharSequence j(java.util.ArrayList arrayList, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jbm);
        int i18 = 0;
        while (i18 < arrayList.size()) {
            int length = spannableStringBuilder.length();
            java.lang.String str = (java.lang.String) arrayList.get(i18);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String a17 = c01.a2.a(str);
            if (lj.f.f(a17)) {
                gm0.j1.i();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && !android.text.TextUtils.isEmpty(n17.f2())) {
                    a17 = n17.g2();
                }
                i18++;
            }
            java.lang.String str2 = a17 + (i18 != arrayList.size() - 1 ? g17 : "");
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(i17);
            spannableStringBuilder.append((java.lang.CharSequence) str2);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, a17.length() + length, 17);
            spannableStringBuilder.subSequence(length, a17.length() + length);
            i18++;
        }
        android.text.SpannableString Ri = com.tencent.mm.smiley.x1.Di().Ri(spannableStringBuilder, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        return Ri;
    }

    public void l(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        java.util.List g17 = g();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (g17 == null || arrayList == null) {
            this.f171536g = arrayList;
        } else {
            java.util.Iterator it = ((java.util.ArrayList) g17).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (i(arrayList, str)) {
                    arrayList.remove(str);
                    arrayList2.add(str);
                }
            }
            arrayList.addAll(0, arrayList2);
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ",");
            gm0.j1.i();
            gm0.j1.u().c().w(335875, c17);
            this.f171536g = arrayList;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }

    @Override // android.widget.BaseExpandableListAdapter
    public void notifyDataSetChanged() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        super.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
    }
}
