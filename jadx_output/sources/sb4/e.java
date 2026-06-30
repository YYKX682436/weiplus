package sb4;

/* loaded from: classes4.dex */
public abstract class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f405455d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f405457f;

    /* renamed from: g, reason: collision with root package name */
    public final sb4.v f405458g;

    /* renamed from: n, reason: collision with root package name */
    public boolean f405462n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f405463o;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f405467s;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.storage.s7 f405469u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.storage.e8 f405470v;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f405456e = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f405459h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f405460i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f405461m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public int f405464p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f405465q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f405466r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f405468t = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f405471w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f405472x = Integer.MAX_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public int f405473y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f405474z = false;
    public com.tencent.mm.plugin.sns.statistics.b0 A = null;
    public final android.view.View.OnClickListener B = new sb4.g(this);

    public e(boolean z17, android.app.Activity activity, sb4.v vVar, java.lang.String str) {
        this.f405457f = "";
        this.f405462n = false;
        this.f405467s = "";
        this.f405470v = null;
        this.f405463o = z17;
        this.f405467s = str;
        this.f405455d = activity;
        this.f405458g = vVar;
        this.f405470v = com.tencent.mm.plugin.sns.model.l4.pj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(activity.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), activity);
        if (o17.equals("zh_CN") || o17.equals("en") || o17.equals("zh_TW")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        } else {
            o17 = o17.equals("zh_HK") ? "zh_TW" : "en";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        }
        this.f405457f = o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        gm0.j1.i();
        if (str.equals((java.lang.String) gm0.j1.u().c().l(2, null))) {
            this.f405462n = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (this.f405462n) {
            this.f405469u = com.tencent.mm.storage.s7.a();
            return;
        }
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || !n17.r2()) {
            this.f405469u = new com.tencent.mm.storage.s7("album_stranger");
        } else {
            this.f405469u = new com.tencent.mm.storage.s7("album_friend");
        }
    }

    public static void a(sb4.e eVar, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSize", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSize", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public abstract boolean A();

    public void B(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetLayoutParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (view.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
            if (intValue == 1) {
                layoutParams.topMargin = 0;
                view.setLayoutParams(layoutParams);
            } else {
                layoutParams.topMargin = this.f405455d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480615ab5);
                view.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetLayoutParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public boolean C(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject, com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView snsAlbumThumbStateIconView, boolean z17) {
        boolean z18;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return false;
        }
        ca4.e1 e1Var = ca4.f1.f39897a;
        boolean b17 = e1Var.b(snsObject.ExtFlag);
        if (this.f405462n && b17 && (str = this.f405467s) != null && str.equals(snsInfo.getUserName())) {
            if (z17) {
                snsAlbumThumbStateIconView.b(com.tencent.mm.plugin.sns.ui.widget.c1.f171092d);
            } else {
                snsAlbumThumbStateIconView.a(com.tencent.mm.plugin.sns.ui.widget.c1.f171092d);
            }
            snsAlbumThumbStateIconView.setVisibility(0);
        }
        if (com.tencent.mm.plugin.sns.model.s5.i(snsInfo.getLocalPrivate(), this.f405462n)) {
            if (z17) {
                snsAlbumThumbStateIconView.b(com.tencent.mm.plugin.sns.ui.widget.c1.f171093e);
            } else {
                snsAlbumThumbStateIconView.a(com.tencent.mm.plugin.sns.ui.widget.c1.f171093e);
            }
            snsAlbumThumbStateIconView.setVisibility(0);
            z18 = true;
        } else {
            z18 = false;
        }
        e1Var.j("MicroMsg.SnsSelfBaseAdapter", snsObject, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelfBaseAdapter", "setGroupIcon: isShowGroup:%b, snsId:%s, localId:%d, snsObjectId:%s, isShowPrivateIcon:%b", java.lang.Boolean.valueOf(b17), snsInfo.getSnsId(), java.lang.Integer.valueOf(snsInfo.localid), java.lang.String.valueOf(snsObject.Id), java.lang.Boolean.valueOf(z18));
        boolean z19 = snsAlbumThumbStateIconView.getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(int r27, com.tencent.mm.ui.widget.QFadeImageView r28, android.widget.TextView r29, com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r30, android.widget.TextView r31, int r32, boolean r33, sb4.k r34, int r35) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.D(int, com.tencent.mm.ui.widget.QFadeImageView, android.widget.TextView, com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView, android.widget.TextView, int, boolean, sb4.k, int):void");
    }

    public void E(android.view.View view, android.view.View view2, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemContentDescription", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        view2.setContentDescription(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            view.setContentDescription("");
        } else {
            view.setContentDescription(str + "," + str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemContentDescription", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public void F(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLastClickSnsInfoLocalId", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        this.f405468t = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLastClickSnsInfoLocalId", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public final void G(android.view.View view, android.view.View view2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarAndLiveTagViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f((com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i17));
        if (j()) {
            if (f17.InTopList == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarAndLiveTagViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public abstract void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo);

    public void d(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateYearHeight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (this.f405471w <= 0) {
            textView.post(new sb4.f(this, textView));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateYearHeight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public final void f(android.widget.TextView textView, android.widget.TextView textView2, long j17) {
        java.lang.String str;
        java.lang.Object format;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cerateTimeView", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        long j18 = 1000 * j17;
        java.lang.String str2 = this.f405457f;
        boolean z17 = !str2.equals("en");
        java.util.Map map = com.tencent.mm.plugin.sns.ui.os.f170121a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.lang.CharSequence charSequence = "";
        android.app.Activity activity = this.f405455d;
        if (j18 < 3600000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            str = "cerateTimeView";
            format = "";
        } else {
            str = "cerateTimeView";
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis = j18 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000 || !z17) {
                long timeInMillis2 = (j18 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                if (timeInMillis2 <= 0 || timeInMillis2 > 86400000 || !z17) {
                    new java.util.GregorianCalendar().setTimeInMillis(j18);
                    format = android.text.format.DateFormat.format(activity.getString(com.tencent.mm.R.string.f492136fc3), j18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                } else {
                    format = activity.getString(com.tencent.mm.R.string.fdi);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                }
            } else {
                format = activity.getString(com.tencent.mm.R.string.fd_);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            }
        }
        java.lang.String str3 = (java.lang.String) format;
        textView2.setTextSize(0, i65.a.f(activity, com.tencent.mm.R.dimen.f480612aj2));
        textView.setTextSize(0, i65.a.f(activity, com.tencent.mm.R.dimen.f480611aj1));
        if (str3.indexOf(":") > 0) {
            java.lang.String[] split = str3.split(":");
            if (split[1].length() < 2) {
                split[1] = "0" + split[1];
            }
            textView.setText(split[0]);
            textView2.setText(split[1]);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            textView2.setContentDescription(java.lang.String.format(activity.getResources().getString(com.tencent.mm.R.string.f493193j91), split[0], split[1]));
        } else if (str3.indexOf("/") > 0) {
            java.lang.String[] split2 = str3.split("/");
            if (split2[1].length() < 2) {
                split2[1] = "0" + split2[1];
            }
            java.lang.String str4 = split2[0];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.plugin.sns.ui.os.f170121a;
            if (hashMap.get(str2) == null) {
                com.tencent.mm.plugin.sns.ui.os.g(activity, str2);
            }
            int P = com.tencent.mm.sdk.platformtools.t8.P(str4, 0);
            java.util.List list = (java.util.List) hashMap.get(str2);
            if (P >= list.size() || list.get(P) == null || ((java.lang.String) list.get(P)).equals("")) {
                com.tencent.mm.plugin.sns.ui.os.g(activity, str2);
            }
            java.util.List list2 = (java.util.List) hashMap.get(str2);
            if (P < list2.size()) {
                charSequence = (java.lang.String) list2.get(P);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            }
            split2[0] = charSequence;
            textView.setText(charSequence);
            textView2.setText(split2[1]);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            textView2.setContentDescription(java.lang.String.format(activity.getResources().getString(com.tencent.mm.R.string.f493193j91), split2[0], split2[1]));
        } else {
            textView2.setContentDescription(str3.concat(""));
            textView2.setVisibility(0);
            textView2.setText(str3.concat(""));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public final void g(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeDescAndLinkPadding", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (view.getVisibility() == 0) {
            int paddingTop = view.getPaddingTop();
            view2.setPadding(paddingTop, 0, paddingTop, paddingTop);
        } else {
            int h17 = i65.a.h(view2.getContext(), com.tencent.mm.R.dimen.f480613aj3);
            view2.setPadding(h17, h17, h17, h17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeDescAndLinkPadding", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public abstract boolean h(int i17, long j17);

    public abstract boolean j();

    public abstract void k(android.widget.TextView textView, int i17, int i18);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0223, code lost:
    
        if (r42 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x022e, code lost:
    
        if (r3.getHead() == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0c75  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View l(int r42, android.view.View r43) {
        /*
            Method dump skipped, instructions count: 3579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.l(int, android.view.View):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    public android.view.View m(int i17, android.view.View view) {
        sb4.k kVar;
        android.view.View view2;
        int i18;
        boolean z17;
        boolean z18;
        int i19;
        boolean z19;
        ?? r122;
        android.view.View view3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        sb4.v vVar = this.f405458g;
        android.app.Activity activity = this.f405455d;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.k)) {
            sb4.k kVar2 = new sb4.k(this);
            android.view.View inflate = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.f489515ct1, (android.view.ViewGroup) null);
            kVar2.f405504c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n7u);
            kVar2.f405503b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n_7);
            kVar2.f405505d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487063nd4);
            kVar2.f405543l = (com.tencent.mm.plugin.sns.ui.MaskImageView) inflate.findViewById(com.tencent.mm.R.id.haa);
            kVar2.f405544m = (com.tencent.mm.plugin.sns.ui.MaskImageView) inflate.findViewById(com.tencent.mm.R.id.hab);
            kVar2.f405545n = (com.tencent.mm.plugin.sns.ui.MaskImageView) inflate.findViewById(com.tencent.mm.R.id.hac);
            kVar2.f405546o = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.qqg);
            kVar2.f405547p = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f484050cu2);
            kVar2.f405548q = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.png);
            kVar2.f405549r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487741qy1);
            kVar2.f405550s = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487742qy2);
            kVar2.f405551t = inflate.findViewById(com.tencent.mm.R.id.cuh);
            kVar2.f405508g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482733md);
            kVar2.f405506e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i27);
            kVar2.f405507f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485695io4);
            kVar2.f405509h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i3x);
            kVar2.f405510i = inflate.findViewById(com.tencent.mm.R.id.f485550i26);
            kVar2.f405546o.setOnClickListener(vVar.f405582e);
            kVar2.f405543l.setOnClickListener(vVar.f405582e);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qx6);
            kVar2.F = findViewById;
            kVar2.C = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.f487087ng4);
            kVar2.f405557z = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) kVar2.F.findViewById(com.tencent.mm.R.id.gu8);
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qx7);
            kVar2.G = findViewById2;
            kVar2.D = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2.findViewById(com.tencent.mm.R.id.f487087ng4);
            kVar2.A = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) kVar2.G.findViewById(com.tencent.mm.R.id.gu8);
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qx8);
            kVar2.H = findViewById3;
            kVar2.E = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3.findViewById(com.tencent.mm.R.id.f487087ng4);
            kVar2.B = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) kVar2.H.findViewById(com.tencent.mm.R.id.gu8);
            kVar2.f405553v = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.okc);
            kVar2.f405554w = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.okc);
            kVar2.f405555x = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.okc);
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout = (com.tencent.mm.plugin.sns.ui.MaskLinearLayout) inflate.findViewById(com.tencent.mm.R.id.n9w);
            kVar2.f405556y = maskLinearLayout;
            maskLinearLayout.b(kVar2.f405543l);
            kVar2.f405511j = (com.tencent.mm.ui.EndMaskView) inflate.findViewById(com.tencent.mm.R.id.f485066gf5);
            inflate.setTag(kVar2);
            kVar = kVar2;
            view2 = inflate;
        } else {
            view2 = view;
            kVar = (sb4.k) view.getTag();
        }
        com.tencent.mm.plugin.sns.model.l4.hj().P(kVar.f405543l);
        com.tencent.mm.plugin.sns.model.l4.hj().P(kVar.f405544m);
        com.tencent.mm.plugin.sns.model.l4.hj().P(kVar.f405545n);
        java.util.Map map = this.f405459h;
        int intValue = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        kVar.a();
        kVar.f405505d.setTag(java.lang.Integer.valueOf(i17));
        kVar.f405556y.settouchEnable(false);
        kVar.f405556y.setBackgroundResource(0);
        kVar.f405556y.setDescendantFocusability(131072);
        kVar.f405556y.setClickable(false);
        kVar.f405543l.settouchEnable(true);
        kVar.f405543l.setClickable(true);
        kVar.f405556y.setOnClickListener(null);
        if (intValue >= this.f405464p || intValue == -1) {
            android.view.View view4 = view2;
            view4.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return view4;
        }
        int i27 = intValue - 1;
        if (i27 >= 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i27);
            i18 = snsInfo.getHead();
            z17 = com.tencent.mm.plugin.sns.model.s5.i(snsInfo.getLocalPrivate(), this.f405462n);
        } else {
            i18 = -1;
            z17 = false;
        }
        view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(intValue);
        snsInfo2.getTimeLine();
        if ((this.f405462n && i17 == v()) || i18 == -1 || snsInfo2.getHead() != i18) {
            if (h(i17, snsInfo2.field_snsId)) {
                f(kVar.f405503b, kVar.f405504c, snsInfo2.getCreateTime());
            }
            java.lang.String u17 = u(intValue, snsInfo2.getHead(), new com.tencent.mm.pointers.PInt());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                kVar.f405508g.setText(u17);
                kVar.f405508g.setVisibility(0);
            }
            android.view.View view5 = kVar.f405510i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z18 = false;
        } else {
            z18 = z17;
        }
        k(kVar.f405505d, i18, snsInfo2.getHead());
        long j17 = this.f405465q;
        if (j17 == 0 || snsInfo2.field_snsId != j17) {
            kVar.f405511j.setVisibility(8);
            kVar.f405506e.setVisibility(0);
        } else {
            kVar.f405511j.setVisibility(0);
            kVar.f405511j.c(y(), i65.a.r(activity, com.tencent.mm.R.string.f493223jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$createViewHB$6", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view6);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f405455d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$createViewHB$6", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            kVar.f405506e.setVisibility(8);
        }
        if (this.f405462n) {
            z19 = true;
            if (i17 == 1) {
                kVar.f405546o.setVisibility(0);
                kVar.f405546o.setContentDescription(activity.getString(com.tencent.mm.R.string.f493251jg2));
                kVar.f405543l.setVisibility(8);
                kVar.f405547p.b(this.f405466r == 1 ? activity.getString(com.tencent.mm.R.string.jh9) : "");
                kVar.f405547p.setVisibility(0);
                android.view.View view6 = kVar.f405551t;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sb4.u uVar = new sb4.u();
                uVar.f405576b = -1;
                uVar.f405575a = -1;
                kVar.f405546o.setTag(uVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                return view2;
            }
            i19 = 8;
        } else {
            i19 = 8;
            z19 = true;
        }
        int i28 = i19;
        int i29 = intValue;
        sb4.k kVar3 = kVar;
        android.view.View view7 = view2;
        D(intValue, kVar.f405543l, kVar.f405548q, kVar.f405557z, kVar.f405553v, 1, z18, kVar, i17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = kVar3.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStarViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f((com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i29));
        if (!j()) {
            r122 = 0;
            view3 = view7;
        } else if (f17.InTopList == 1) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(weImageView, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            view3 = view7;
            r122 = 0;
            yj0.a.f(weImageView, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            r122 = 0;
            view3 = view7;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(i28));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(weImageView, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStarViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (kVar3.f405557z.getVisibility() == 0 || kVar3.C.getVisibility() == 0) {
            android.view.View view8 = kVar3.F;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(java.lang.Integer.valueOf((int) r122));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(r122)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view9 = kVar3.F;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(i28));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList8.get(r122)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i29);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(snsInfo3.getTimeLine().ContentDesc) && snsInfo3.isPhoto()) {
            kVar3.f405556y.setDescendantFocusability(393216);
            kVar3.f405556y.setClickable(true);
            kVar3.f405543l.setClickable(r122);
            kVar3.f405543l.settouchEnable(r122);
            kVar3.f405556y.setOnClickListener(vVar.f405582e);
            kVar3.f405556y.settouchEnable(true);
            int i37 = snsInfo2.localid;
            sb4.u uVar2 = new sb4.u();
            uVar2.f405576b = i37;
            uVar2.f405577c = snsInfo2.getSnsId();
            java.util.Map map2 = this.f405461m;
            if (((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17)) != null) {
                uVar2.f405575a = ((java.lang.Integer) ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17))).intValue();
            } else {
                uVar2.f405575a = r122;
            }
            kVar3.f405556y.setTag(uVar2);
        }
        c(snsInfo3);
        android.view.View view10 = view3;
        view10.setDrawingCacheEnabled(r122);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return view10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0244, code lost:
    
        if (r3.getHead() != r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032b  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View n(int r39, android.view.View r40) {
        /*
            Method dump skipped, instructions count: 1531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.n(int, android.view.View):android.view.View");
    }

    public android.view.View o(int i17, android.view.View view) {
        sb4.i iVar;
        android.view.View inflate;
        int i18;
        int i19;
        java.lang.String str;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        android.app.Activity activity = this.f405455d;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.i)) {
            iVar = new sb4.i(this);
            inflate = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.csz, (android.view.ViewGroup) null);
            iVar.f405502a = inflate.findViewById(com.tencent.mm.R.id.chj);
            iVar.f405504c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n7u);
            iVar.f405503b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n_7);
            iVar.f405505d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487063nd4);
            iVar.f405508g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482733md);
            iVar.f405510i = inflate.findViewById(com.tencent.mm.R.id.f485550i26);
            iVar.f405508g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482733md);
            iVar.f405506e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i27);
            iVar.f405507f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485695io4);
            iVar.f405509h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i3x);
            iVar.f405515l = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.cut);
            iVar.f405516m = (com.tencent.mm.ui.widget.MMRoundCornerImageView) inflate.findViewById(com.tencent.mm.R.id.jyi);
            iVar.f405518o = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486052k05);
            iVar.f405519p = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jyl);
            iVar.f405517n = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.jzb);
            iVar.f405502a.setOnClickListener(this.f405458g.f405581d);
            iVar.f405520q = inflate.findViewById(com.tencent.mm.R.id.jdl);
            iVar.f405521r = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) inflate.findViewById(com.tencent.mm.R.id.gu8);
            iVar.f405522s = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487087ng4);
            iVar.f405523t = inflate.findViewById(com.tencent.mm.R.id.nh_);
            iVar.f405511j = (com.tencent.mm.ui.EndMaskView) inflate.findViewById(com.tencent.mm.R.id.f485066gf5);
            inflate.setTag(iVar);
        } else {
            iVar = (sb4.i) view.getTag();
            inflate = view;
        }
        iVar.f405505d.setTag(java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = (java.util.HashMap) this.f405459h;
        int intValue = hashMap.get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        iVar.a();
        if (intValue >= this.f405464p || intValue == -1) {
            inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = inflate;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return inflate;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        android.view.View view3 = inflate;
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = intValue - 1;
        if (i27 >= 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i27);
            int head = snsInfo.getHead();
            com.tencent.mm.plugin.sns.model.s5.i(snsInfo.getLocalPrivate(), this.f405462n);
            i18 = head;
        } else {
            i18 = -1;
        }
        inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        android.view.View view4 = inflate;
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.HashMap hashMap2 = (java.util.HashMap) this.f405460i;
        if (hashMap2.get(java.lang.Integer.valueOf(i17)) != null) {
            ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(i17))).intValue();
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(intValue);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo2.getTimeLine();
        if ((this.f405462n && i17 == v()) || i18 == -1 || snsInfo2.getHead() != i18) {
            if (h(i17, snsInfo2.field_snsId)) {
                f(iVar.f405503b, iVar.f405504c, snsInfo2.getCreateTime());
            }
            java.lang.String u17 = u(intValue, snsInfo2.getHead(), new com.tencent.mm.pointers.PInt());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                iVar.f405508g.setText(u17);
                iVar.f405508g.setVisibility(0);
            }
            android.view.View view5 = iVar.f405510i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        k(iVar.f405505d, i18, snsInfo2.getHead());
        long j17 = this.f405465q;
        if (j17 == 0 || snsInfo2.field_snsId != j17) {
            i19 = 8;
            iVar.f405511j.setVisibility(8);
            iVar.f405506e.setVisibility(0);
        } else {
            iVar.f405511j.setVisibility(0);
            iVar.f405511j.c(y(), i65.a.r(activity, com.tencent.mm.R.string.f493223jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$createViewMusicMv$2", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(view6);
                    java.lang.Object[] array = arrayList5.toArray();
                    arrayList5.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f405455d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$createViewMusicMv$2", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            i19 = 8;
            iVar.f405506e.setVisibility(8);
        }
        sb4.u uVar = new sb4.u();
        uVar.f405576b = snsInfo2.localid;
        uVar.f405577c = snsInfo2.getSnsId();
        java.util.HashMap hashMap3 = (java.util.HashMap) this.f405461m;
        if (hashMap3.get(java.lang.Integer.valueOf(i17)) != null) {
            uVar.f405575a = ((java.lang.Integer) hashMap3.get(java.lang.Integer.valueOf(i17))).intValue();
        } else {
            uVar.f405575a = 0;
        }
        iVar.f405502a.setTag(uVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(timeLine.ContentDesc)) {
            iVar.f405515l.setVisibility(i19);
        } else {
            iVar.f405515l.setVisibility(0);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = iVar.f405515l;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = timeLine.ContentDesc;
            float textSize = iVar.f405515l.getTextSize();
            ((ke0.e) xVar).getClass();
            mMNeat7extView.b(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str2, textSize));
        }
        g(iVar.f405515l, iVar.f405520q);
        iVar.f405515l.setMaxLines(1);
        android.view.View view6 = iVar.f405520q;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str3 = this.f405469u.f195312a;
        r45.a90 a90Var = timeLine.ContentObj;
        r45.jj4 jj4Var = (!(a90Var != null) || !true || (linkedList = a90Var.f369840h) == null || linkedList.isEmpty()) ? null : (r45.jj4) timeLine.ContentObj.f369840h.get(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        java.lang.String a17 = m21.s.a(timeLine, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelfBaseAdapter", "coverInfo, coverUrl: %s", a17);
        java.lang.String str4 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            android.view.View view7 = iVar.f405520q;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            iVar.f405517n.setVisibility(0);
            iVar.f405517n.setPressed(false);
            android.view.View view8 = iVar.f405520q;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (jj4Var != null) {
                jj4Var.f377870s = snsInfo2.localid;
                java.lang.String str5 = jj4Var.f377857f;
                str4 = jj4Var.f377864o;
                str = str5;
            } else {
                str = "";
            }
            iVar.f405518o.setVisibility(0);
            iVar.f405518o.setText(str4);
            iVar.f405518o.setMaxLines(1);
            iVar.f405518o.setTextColor(activity.getResources().getColor(com.tencent.mm.R.color.f479515a62));
            r45.xs4 xs4Var = timeLine.ContentObj.f369852w;
            if (xs4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(4))) {
                iVar.f405519p.setVisibility(0);
                iVar.f405519p.setText(timeLine.ContentObj.f369852w.getString(4));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                iVar.f405519p.setVisibility(0);
                iVar.f405519p.setText(str);
            }
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(a17, iVar.f405516m, null);
            if (com.tencent.mm.plugin.sns.ui.wm.b(timeLine)) {
                iVar.f405517n.s(com.tencent.mm.R.raw.icons_outlined_pause2, com.tencent.mm.R.color.f478553an);
                iVar.f405517n.setContentDescription(activity.getString(com.tencent.mm.R.string.jfa));
            } else {
                iVar.f405517n.s(com.tencent.mm.R.raw.icons_outlined_play2, com.tencent.mm.R.color.f478553an);
                iVar.f405517n.setContentDescription(activity.getString(com.tencent.mm.R.string.jdm));
            }
            iVar.f405517n.setIconColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
            iVar.f405517n.setTag(timeLine);
            iVar.f405517n.setOnClickListener(this.B);
            iVar.f405520q.setTag(timeLine);
            r45.a90 a90Var2 = timeLine.ContentObj;
            if (a90Var2.f369852w == null) {
                a90Var2.f369852w = new r45.xs4();
            }
            r45.xs4 xs4Var2 = timeLine.ContentObj.f369852w;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(activity.getString(com.tencent.mm.R.string.jcb));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                stringBuffer.append(str4 + ",");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xs4Var2.getString(4))) {
                stringBuffer.append(xs4Var2.getString(4) + ",");
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            java.lang.String str6 = timeLine.AppInfo.f390846d;
            ((com.tencent.mm.app.o7) wi6).getClass();
            java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(activity, str6);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                stringBuffer.append(Zi);
            }
            str4 = timeLine.ContentDesc + "，" + ((java.lang.Object) stringBuffer);
        }
        E(iVar.f405509h, iVar.f405520q, x(iVar.f405504c), str4);
        com.tencent.mm.plugin.sns.storage.SnsInfo t17 = t(snsInfo2, intValue);
        if (t17 != null) {
            snsInfo2 = t17;
        }
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(snsInfo2);
        if (j()) {
            if (f17.InTopList == 1) {
                iVar.f405522s.setVisibility(0);
            } else {
                iVar.f405522s.setVisibility(i19);
            }
        }
        C(snsInfo2, f17, iVar.f405521r, false);
        if (iVar.f405522s.getVisibility() == i19 && iVar.f405521r.getVisibility() == i19) {
            android.view.View view9 = iVar.f405523t;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view10 = iVar.f405523t;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x054a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View p(int r34, android.view.View r35) {
        /*
            Method dump skipped, instructions count: 2287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.p(int, android.view.View):android.view.View");
    }

    public android.view.View q(int i17, android.view.View view) {
        sb4.k kVar;
        android.view.View view2;
        int i18;
        boolean z17;
        boolean z18;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        int i19;
        boolean z19;
        android.view.View view3;
        java.lang.String str;
        java.lang.String str2;
        android.app.Activity activity;
        int i27;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        sb4.k kVar2;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2;
        int i28;
        int i29;
        int i37;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        sb4.k kVar3;
        android.app.Activity activity2;
        int i38;
        java.util.LinkedList linkedList;
        int i39;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createViewPhotos", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        android.app.Activity activity3 = this.f405455d;
        sb4.v vVar = this.f405458g;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.k)) {
            sb4.k kVar4 = new sb4.k(this);
            android.view.View inflate = com.tencent.mm.ui.id.b(activity3).inflate(com.tencent.mm.R.layout.f489515ct1, (android.view.ViewGroup) null);
            kVar4.f405504c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n7u);
            kVar4.f405503b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n_7);
            kVar4.f405505d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487063nd4);
            kVar4.f405543l = (com.tencent.mm.plugin.sns.ui.MaskImageView) inflate.findViewById(com.tencent.mm.R.id.haa);
            kVar4.f405544m = (com.tencent.mm.plugin.sns.ui.MaskImageView) inflate.findViewById(com.tencent.mm.R.id.hab);
            kVar4.f405545n = (com.tencent.mm.plugin.sns.ui.MaskImageView) inflate.findViewById(com.tencent.mm.R.id.hac);
            kVar4.f405546o = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.qqg);
            kVar4.f405547p = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f484050cu2);
            kVar4.f405548q = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.png);
            kVar4.f405549r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487741qy1);
            kVar4.f405550s = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487742qy2);
            kVar4.f405551t = inflate.findViewById(com.tencent.mm.R.id.cuh);
            kVar4.f405552u = inflate.findViewById(com.tencent.mm.R.id.jby);
            kVar4.f405508g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482733md);
            kVar4.f405506e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i27);
            kVar4.f405507f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485695io4);
            kVar4.f405509h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i3x);
            kVar4.f405510i = inflate.findViewById(com.tencent.mm.R.id.f485550i26);
            kVar4.f405546o.setOnClickListener(vVar.f405578a);
            kVar4.f405543l.setOnClickListener(vVar.f405578a);
            kVar4.f405544m.setOnClickListener(vVar.f405579b);
            kVar4.f405545n.setOnClickListener(vVar.f405580c);
            kVar4.f405543l.setOnLongClickListener(vVar.f405585h);
            kVar4.f405544m.setOnLongClickListener(vVar.f405585h);
            kVar4.f405545n.setOnLongClickListener(vVar.f405585h);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qx6);
            kVar4.F = findViewById;
            kVar4.C = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById.findViewById(com.tencent.mm.R.id.f487087ng4);
            kVar4.f405557z = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) kVar4.F.findViewById(com.tencent.mm.R.id.gu8);
            kVar4.I = (com.tencent.mm.ui.widget.imageview.WeImageView) kVar4.F.findViewById(com.tencent.mm.R.id.s6z);
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qx7);
            kVar4.G = findViewById2;
            kVar4.D = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2.findViewById(com.tencent.mm.R.id.f487087ng4);
            kVar4.A = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) kVar4.G.findViewById(com.tencent.mm.R.id.gu8);
            kVar4.f405542J = (com.tencent.mm.ui.widget.imageview.WeImageView) kVar4.G.findViewById(com.tencent.mm.R.id.s6z);
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qx8);
            kVar4.H = findViewById3;
            kVar4.E = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3.findViewById(com.tencent.mm.R.id.f487087ng4);
            kVar4.B = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) kVar4.H.findViewById(com.tencent.mm.R.id.gu8);
            kVar4.K = (com.tencent.mm.ui.widget.imageview.WeImageView) kVar4.H.findViewById(com.tencent.mm.R.id.s6z);
            kVar4.f405553v = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.okc);
            kVar4.f405554w = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.okd);
            kVar4.f405555x = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oke);
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout = (com.tencent.mm.plugin.sns.ui.MaskLinearLayout) inflate.findViewById(com.tencent.mm.R.id.n9w);
            kVar4.f405556y = maskLinearLayout;
            maskLinearLayout.b(kVar4.f405543l);
            kVar4.f405511j = (com.tencent.mm.ui.EndMaskView) inflate.findViewById(com.tencent.mm.R.id.f485066gf5);
            inflate.setTag(kVar4);
            kVar = kVar4;
            view2 = inflate;
        } else {
            view2 = view;
            kVar = (sb4.k) view.getTag();
        }
        com.tencent.mm.plugin.sns.model.l4.hj().P(kVar.f405543l);
        com.tencent.mm.plugin.sns.model.l4.hj().P(kVar.f405544m);
        com.tencent.mm.plugin.sns.model.l4.hj().P(kVar.f405545n);
        java.util.Map map = this.f405459h;
        int intValue = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        kVar.a();
        kVar.f405505d.setTag(java.lang.Integer.valueOf(i17));
        kVar.f405556y.settouchEnable(false);
        kVar.f405556y.setBackgroundResource(0);
        kVar.f405556y.setDescendantFocusability(131072);
        kVar.f405556y.setClickable(false);
        boolean z27 = this.f405463o;
        if (z27) {
            kVar.f405551t.setClickable(true);
            kVar.f405551t.setOnClickListener(vVar.f405584g);
        }
        kVar.f405543l.settouchEnable(true);
        kVar.f405543l.setClickable(true);
        kVar.f405543l.setLongClickable(false);
        kVar.f405544m.setLongClickable(false);
        kVar.f405545n.setLongClickable(false);
        kVar.f405556y.setOnClickListener(null);
        kVar.f405556y.setOnLongClickListener(null);
        kVar.f405556y.setLongClickable(false);
        if (intValue >= this.f405464p || intValue == -1) {
            android.view.View view4 = view2;
            view4.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewPhotos", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return view4;
        }
        int i47 = intValue - 1;
        if (i47 >= 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i47);
            i18 = snsInfo3.getHead();
            z17 = com.tencent.mm.plugin.sns.model.s5.i(snsInfo3.getLocalPrivate(), this.f405462n);
        } else {
            i18 = -1;
            z17 = false;
        }
        view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.Map map2 = this.f405460i;
        int intValue2 = ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17))).intValue() : 1;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(intValue);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo4.getTimeLine();
        if ((this.f405462n && i17 == v()) || i18 == -1 || snsInfo4.getHead() != i18) {
            timeLineObject = timeLine;
            if (h(i17, snsInfo4.field_snsId)) {
                f(kVar.f405503b, kVar.f405504c, snsInfo4.getCreateTime());
            }
            java.lang.String u17 = u(intValue, snsInfo4.getHead(), new com.tencent.mm.pointers.PInt());
            if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                i39 = 0;
            } else {
                kVar.f405508g.setText(u17);
                i39 = 0;
                kVar.f405508g.setVisibility(0);
            }
            android.view.View view5 = kVar.f405510i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i39));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z18 = false;
        } else {
            z18 = z17;
            timeLineObject = timeLine;
        }
        long j17 = this.f405465q;
        int i48 = intValue2;
        int i49 = intValue;
        if (j17 == 0 || snsInfo4.field_snsId != j17) {
            kVar.f405511j.setVisibility(8);
            i19 = 0;
            kVar.f405506e.setVisibility(0);
        } else {
            kVar.f405511j.setVisibility(0);
            kVar.f405511j.c(y(), i65.a.r(activity3, com.tencent.mm.R.string.f493223jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$g
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$createViewPhotos$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view6);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f405455d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$createViewPhotos$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            kVar.f405506e.setVisibility(8);
            i19 = 0;
        }
        if (z(i17) && A()) {
            kVar.f405546o.setVisibility(i19);
            kVar.f405546o.setContentDescription(activity3.getString(com.tencent.mm.R.string.f493251jg2));
            kVar.f405543l.setVisibility(8);
            kVar.f405547p.b(this.f405466r == 1 ? activity3.getString(com.tencent.mm.R.string.jh9) : "");
            kVar.f405547p.setVisibility(0);
            android.view.View view6 = kVar.f405551t;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z27) {
                android.view.View view7 = kVar.f405551t;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            sb4.u uVar = new sb4.u();
            uVar.f405576b = -1;
            uVar.f405575a = -1;
            kVar.f405546o.setTag(uVar);
            E(kVar.f405509h, kVar.f405556y, x(kVar.f405504c), kVar.f405546o.getContentDescription() != null ? kVar.f405546o.getContentDescription().toString() : "");
            kVar.f405556y.setImportantForAccessibility(2);
            if (!this.f405474z) {
                xa4.b.f452821a.c(false, "view_exp", 2);
                this.f405474z = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewPhotos", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return view2;
        }
        k(kVar.f405505d, i18, snsInfo4.getHead());
        if (i48 >= 1) {
            str = "createViewPhotos";
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = timeLineObject;
            i28 = 8;
            str2 = "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter";
            activity = activity3;
            snsInfo = snsInfo4;
            z19 = z27;
            i27 = i49;
            view3 = view2;
            D(i49, kVar.f405543l, kVar.f405548q, kVar.f405557z, kVar.f405553v, 1, z18, kVar, i17);
            kVar2 = kVar;
            G(kVar2.C, kVar2.I, i27);
            if (kVar2.C.getVisibility() == 0 || kVar2.f405557z.getVisibility() == 0 || kVar2.I.getVisibility() == 0) {
                timeLineObject2 = timeLineObject3;
                android.view.View view8 = kVar2.F;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view9 = kVar2.F;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                timeLineObject2 = timeLineObject3;
                yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c((com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i27));
            i29 = i48;
            i37 = 2;
        } else {
            z19 = z27;
            view3 = view2;
            str = "createViewPhotos";
            str2 = "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter";
            activity = activity3;
            i27 = i49;
            snsInfo = snsInfo4;
            kVar2 = kVar;
            timeLineObject2 = timeLineObject;
            i28 = 8;
            i29 = i48;
            i37 = 2;
        }
        if (i29 >= i37) {
            int i57 = i27 + 1;
            snsInfo2 = snsInfo;
            kVar3 = kVar2;
            D(i57, kVar2.f405544m, kVar2.f405549r, kVar2.A, kVar2.f405554w, 2, z18, kVar2, i17);
            G(kVar3.D, kVar3.f405542J, i57);
            if (kVar3.D.getVisibility() == 0 || kVar3.A.getVisibility() == 0 || kVar3.f405542J.getVisibility() == 0) {
                android.view.View view10 = kVar3.G;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view11 = kVar3.G;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view11, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c((com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i57));
        } else {
            snsInfo2 = snsInfo;
            kVar3 = kVar2;
        }
        if (i29 >= 3) {
            int i58 = i27 + 2;
            D(i58, kVar3.f405545n, kVar3.f405550s, kVar3.B, kVar3.f405555x, 3, z18, kVar3, i17);
            G(kVar3.E, kVar3.K, i58);
            if (kVar3.E.getVisibility() == 0 || kVar3.B.getVisibility() == 0 || kVar3.K.getVisibility() == 0) {
                android.view.View view12 = kVar3.H;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view12, arrayList10.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view13 = kVar3.H;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view13, arrayList11.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c((com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i58));
        }
        if (i29 == 1) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i27);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(snsInfo5.getTimeLine().ContentDesc) && snsInfo5.isPhoto()) {
                if (!z19) {
                    kVar3.f405556y.setDescendantFocusability(393216);
                    kVar3.f405556y.setClickable(true);
                    kVar3.f405543l.setClickable(false);
                    kVar3.f405543l.settouchEnable(false);
                    kVar3.f405556y.setOnClickListener(vVar.f405578a);
                    kVar3.f405556y.settouchEnable(true);
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo6 = snsInfo2;
                int i59 = snsInfo6.localid;
                sb4.u uVar2 = new sb4.u();
                uVar2.f405576b = i59;
                uVar2.f405577c = snsInfo6.getSnsId();
                java.util.Map map3 = this.f405461m;
                if (((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17)) != null) {
                    uVar2.f405575a = ((java.lang.Integer) ((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17))).intValue();
                } else {
                    uVar2.f405575a = 0;
                }
                if (snsInfo5.isInValid() && snsInfo5.isDieItem()) {
                    kVar3.f405556y.setOnLongClickListener(vVar.f405585h);
                }
                kVar3.f405556y.setTag(uVar2);
            }
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject4 = timeLineObject2;
        r45.a90 a90Var = timeLineObject4.ContentObj;
        int max = (a90Var == null || (linkedList = a90Var.f369840h) == null) ? i29 : java.lang.Math.max(linkedList.size(), i29);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(timeLineObject4.ContentDesc);
        sb6.append("，");
        if (max > 1) {
            i38 = com.tencent.mm.R.string.bku;
            activity2 = activity;
        } else {
            activity2 = activity;
            i38 = com.tencent.mm.R.string.bkt;
        }
        sb6.append(activity2.getString(i38));
        E(kVar3.f405509h, kVar3.f405556y, x(kVar3.f405504c), sb6.toString());
        android.view.View view14 = view3;
        view14.setDrawingCacheEnabled(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return view14;
    }

    public android.view.View r(int i17, android.view.View view) {
        sb4.l lVar;
        android.view.View inflate;
        int i18;
        int i19;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createViewSight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        sb4.v vVar = this.f405458g;
        android.app.Activity activity = this.f405455d;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.l)) {
            lVar = new sb4.l(this);
            inflate = com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.ctm, (android.view.ViewGroup) null);
            lVar.f405504c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n7u);
            lVar.f405503b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n_7);
            lVar.f405505d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487063nd4);
            lVar.f405558l = (com.tencent.mm.plugin.sns.ui.MaskImageView) inflate.findViewById(com.tencent.mm.R.id.haa);
            lVar.f405562p = inflate.findViewById(com.tencent.mm.R.id.nas);
            lVar.f405508g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482733md);
            lVar.f405506e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i27);
            lVar.f405507f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485695io4);
            lVar.f405509h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i3x);
            lVar.f405510i = inflate.findViewById(com.tencent.mm.R.id.f485550i26);
            lVar.f405558l.setOnClickListener(vVar.f405583f);
            lVar.f405563q = (com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView) inflate.findViewById(com.tencent.mm.R.id.gu8);
            lVar.f405564r = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487087ng4);
            lVar.f405565s = inflate.findViewById(com.tencent.mm.R.id.nax);
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout maskLinearLayout = (com.tencent.mm.plugin.sns.ui.MaskLinearLayout) inflate.findViewById(com.tencent.mm.R.id.n9w);
            lVar.f405559m = maskLinearLayout;
            maskLinearLayout.b(lVar.f405558l);
            lVar.f405560n = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.f484050cu2);
            lVar.f405561o = inflate.findViewById(com.tencent.mm.R.id.cuh);
            lVar.f405511j = (com.tencent.mm.ui.EndMaskView) inflate.findViewById(com.tencent.mm.R.id.f485066gf5);
            inflate.setTag(lVar);
        } else {
            lVar = (sb4.l) view.getTag();
            inflate = view;
        }
        com.tencent.mm.plugin.sns.model.l4.hj().P(lVar.f405558l);
        java.util.Map map = this.f405459h;
        if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
            i18 = ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue();
        } else {
            i18 = -1;
        }
        lVar.a();
        lVar.f405505d.setTag(java.lang.Integer.valueOf(i17));
        lVar.f405559m.settouchEnable(false);
        lVar.f405559m.setBackgroundResource(0);
        lVar.f405559m.setDescendantFocusability(131072);
        lVar.f405559m.setClickable(false);
        lVar.f405559m.setOnClickListener(null);
        boolean z18 = this.f405463o;
        if (z18) {
            lVar.f405561o.setClickable(true);
            lVar.f405561o.setOnClickListener(vVar.f405584g);
        }
        lVar.f405558l.settouchEnable(true);
        lVar.f405558l.setClickable(true);
        if (i18 >= this.f405464p || i18 == -1) {
            inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewSight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return inflate;
        }
        int i27 = i18 - 1;
        if (i27 >= 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i27);
            int head = snsInfo.getHead();
            com.tencent.mm.plugin.sns.model.s5.i(snsInfo.getLocalPrivate(), this.f405462n);
            i19 = head;
        } else {
            i19 = -1;
        }
        inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        int i28 = i19;
        yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.Map map2 = this.f405460i;
        if (((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17)) != null) {
            ((java.lang.Integer) ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17))).intValue();
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i18);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo2.getTimeLine();
        if ((this.f405462n && i17 == v()) || i28 == -1 || snsInfo2.getHead() != i28) {
            if (h(i17, snsInfo2.field_snsId)) {
                f(lVar.f405503b, lVar.f405504c, snsInfo2.getCreateTime());
            }
            java.lang.String u17 = u(i18, snsInfo2.getHead(), new com.tencent.mm.pointers.PInt());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                lVar.f405508g.setText(u17);
                lVar.f405508g.setVisibility(0);
            }
            android.view.View view2 = lVar.f405510i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        k(lVar.f405505d, i28, snsInfo2.getHead());
        long j17 = this.f405465q;
        if (j17 == 0 || snsInfo2.field_snsId != j17) {
            lVar.f405511j.setVisibility(8);
            lVar.f405506e.setVisibility(0);
        } else {
            lVar.f405511j.setVisibility(0);
            lVar.f405511j.c(y(), i65.a.r(activity, com.tencent.mm.R.string.f493223jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$f
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$createViewSight$0", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view3);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f405455d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$createViewSight$0", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            lVar.f405506e.setVisibility(8);
        }
        com.tencent.mm.storage.s7 s7Var = new com.tencent.mm.storage.s7(this.f405469u.f195312a);
        s7Var.f195313b = snsInfo2.field_createTime;
        lVar.f405558l.setVisibility(0);
        com.tencent.mm.plugin.sns.model.l4.hj().g0(snsInfo2.getSnsId(), timeLine.ContentObj.f369840h, lVar.f405558l, activity.hashCode(), com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER, s7Var);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i18);
        com.tencent.mm.plugin.sns.storage.SnsInfo t17 = t(snsInfo3, i18);
        if (t17 != null) {
            snsInfo3 = t17;
        }
        com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(snsInfo3);
        java.lang.String str = snsInfo3.getTimeLine().ContentDesc;
        if (j()) {
            z17 = true;
            if (f17.InTopList == 1) {
                lVar.f405564r.setVisibility(0);
            } else {
                lVar.f405564r.setVisibility(8);
            }
        } else {
            z17 = true;
        }
        if (C(snsInfo3, f17, lVar.f405563q, z17) || lVar.f405564r.getVisibility() == 0) {
            android.view.View view3 = lVar.f405565s;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = lVar.f405565s;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (str != null && !str.equals("")) {
            android.view.View view5 = lVar.f405561o;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lVar.f405560n.setVisibility(0);
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = lVar.f405560n;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = lVar.f405560n.getTextSize();
            ((ke0.e) xVar).getClass();
            mMNeat7extView.b(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str, textSize));
        } else if (z18) {
            android.view.View view6 = lVar.f405561o;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lVar.f405560n.setVisibility(4);
        }
        lVar.f405559m.setDescendantFocusability(393216);
        lVar.f405558l.setClickable(false);
        lVar.f405558l.settouchEnable(false);
        int i29 = snsInfo2.localid;
        sb4.u uVar = new sb4.u();
        uVar.f405576b = i29;
        uVar.f405577c = snsInfo2.getSnsId();
        java.util.Map map3 = this.f405461m;
        if (((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17)) != null) {
            uVar.f405575a = ((java.lang.Integer) ((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17))).intValue();
        } else {
            uVar.f405575a = 0;
        }
        if (z18) {
            lVar.f405558l.setClickable(z17);
            lVar.f405558l.settouchEnable(z17);
            lVar.f405558l.setTag(uVar);
            lVar.f405561o.setTag(uVar);
        } else {
            lVar.f405559m.setClickable(z17);
            lVar.f405559m.setOnClickListener(vVar.f405583f);
            lVar.f405559m.settouchEnable(z17);
            lVar.f405559m.setTag(uVar);
        }
        inflate.setDrawingCacheEnabled(false);
        c(snsInfo3);
        lVar.f405560n.setImportantForAccessibility(2);
        E(lVar.f405509h, lVar.f405559m, x(lVar.f405504c), timeLine.ContentDesc + "," + activity.getString(com.tencent.mm.R.string.bkv));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewSight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return inflate;
    }

    public int s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEdTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        int i17 = this.f405473y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEdTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return i17;
    }

    public abstract com.tencent.mm.plugin.sns.storage.SnsInfo t(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17);

    public final java.lang.String u(int i17, int i18, com.tencent.mm.pointers.PInt pInt) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        r45.ed4 ed4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        java.lang.String str = "";
        while (i17 < ((java.util.ArrayList) this.f405456e).size()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i17);
            if (snsInfo.getHead() != i18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                return str;
            }
            pInt.value++;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) && (ed4Var = (timeLine = snsInfo.getTimeLine()).Location) != null) {
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(ed4Var.f373314g);
                r45.ed4 ed4Var2 = timeLine.Location;
                java.lang.String str2 = K0 ? ed4Var2.f373313f : ed4Var2.f373314g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str = str2;
                }
            }
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return str;
    }

    public abstract int v();

    public int w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        int i17 = this.f405472x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return i17;
    }

    public final java.lang.String x(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeDesc", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (view.getContentDescription() != null) {
            str = view.getContentDescription().toString();
            view.setContentDescription("");
        } else {
            str = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeDesc", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return str;
    }

    public final java.lang.String y() {
        r45.cb6 cb6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserSelfTips", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (p94.w0.c() != null) {
            cb6Var = ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(this.f405467s);
        } else {
            cb6Var = null;
        }
        android.app.Activity activity = this.f405455d;
        java.lang.String r17 = i65.a.r(activity, com.tencent.mm.R.string.f493222jd1);
        if (cb6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsSelfBaseAdapter", "userinfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserSelfTips", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return r17;
        }
        int i17 = cb6Var.f371431g;
        int i18 = cb6Var.f371432h;
        if (i18 == 4320 && (i17 & 4096) > 0) {
            r17 = i65.a.r(activity, com.tencent.mm.R.string.ly_);
        } else if (i18 == 72 && (i17 & 4096) > 0) {
            r17 = i65.a.r(activity, com.tencent.mm.R.string.lya);
        } else if (i18 == 720 && (i17 & 4096) > 0) {
            r17 = i65.a.r(activity, com.tencent.mm.R.string.f493264ni);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserSelfTips", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return r17;
    }

    public abstract boolean z(int i17);
}
