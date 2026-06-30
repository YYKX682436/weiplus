package vh;

/* loaded from: classes12.dex */
public class m extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f436793f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f436794g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f436795h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f436796i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f436797m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f436798n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f436799o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f436800p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f436801q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f436802r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f436803s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f436804t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f436805u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f436806v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f436807w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f436808x;

    public m(android.view.View view) {
        super(view);
        this.f436793f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqb);
        this.f436794g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqh);
        this.f436795h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqi);
        this.f436796i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqj);
        this.f436797m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oo7);
        this.f436798n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hlt);
        this.f436799o = view.findViewById(com.tencent.mm.R.id.hwr);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hww);
        this.f436800p = findViewById;
        this.f436801q = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.onb);
        this.f436802r = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.onc);
        this.f436803s = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.om7);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.hwx);
        this.f436804t = findViewById2;
        this.f436805u = view.findViewById(com.tencent.mm.R.id.hws);
        this.f436806v = view.findViewById(com.tencent.mm.R.id.hwt);
        this.f436807w = view.findViewById(com.tencent.mm.R.id.hwu);
        this.f436808x = view.findViewById(com.tencent.mm.R.id.hwv);
        vh.k kVar = new vh.k(this);
        view.findViewById(com.tencent.mm.R.id.hyj).setOnClickListener(kVar);
        view.findViewById(com.tencent.mm.R.id.hxw).setOnClickListener(kVar);
        findViewById2.setOnClickListener(new vh.l(this));
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem batteryStatsAdapter$Item$EventDumpItem = (com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem) hVar;
        this.f436818d = batteryStatsAdapter$Item$EventDumpItem;
        android.view.View view = this.f436799o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f436800p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f436804t;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f436805u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f436806v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f436807w;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = this.f436808x;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j(batteryStatsAdapter$Item$EventDumpItem);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j(com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem batteryStatsAdapter$Item$EventDumpItem) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        boolean z18;
        android.view.View view;
        android.view.View inflate;
        android.view.View inflate2;
        boolean isEmpty = android.text.TextUtils.isEmpty(batteryStatsAdapter$Item$EventDumpItem.f52626p.f52608i);
        com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord reportRecord = batteryStatsAdapter$Item$EventDumpItem.f52626p;
        java.lang.String str3 = isEmpty ? "" : reportRecord.f52608i;
        str3.getClass();
        int i17 = -1;
        switch (str3.hashCode()) {
            case -1367725928:
                if (str3.equals("canary")) {
                    z17 = false;
                    break;
                }
                z17 = -1;
                break;
            case 529694916:
                if (str3.equals("overheat")) {
                    z17 = true;
                    break;
                }
                z17 = -1;
                break;
            case 570410685:
                if (str3.equals("internal")) {
                    z17 = 2;
                    break;
                }
                z17 = -1;
                break;
            default:
                z17 = -1;
                break;
        }
        switch (z17) {
            case false:
                if (reportRecord.b("app_fg", false)) {
                    str = "前台 Polling 监控";
                    str2 = "App 在前台时, 周期性地执行电量统计 (具体周期见时长)";
                    break;
                } else {
                    str = "待机功耗监控";
                    str2 = "App 进入后台并持续一段时间后 (待机), 再次切换到前台时执行一次电量统计。";
                    break;
                }
            case true:
                str = "Runnable 任务监控";
                str2 = "ThreadPool 等需要执行大量零碎 Runnable 的专项电量统计。";
                break;
            case true:
                str = "Matrix 内部监控";
                str2 = "Matrix 自身电量开销的监控, 避免电量监控框架自身导致的耗电问题";
                break;
            default:
                str = ": " + reportRecord.f52608i;
                str2 = "缺乏描述";
                break;
        }
        wh.c2 c2Var = vh.s.f436817e;
        this.f436793f.setText(((java.text.DateFormat) c2Var.b()).format(new java.util.Date(batteryStatsAdapter$Item$EventDumpItem.f52600e)));
        this.f436797m.setRotation(batteryStatsAdapter$Item$EventDumpItem.f52627q ? 180.0f : 0.0f);
        android.view.View view2 = this.f436799o;
        int i18 = batteryStatsAdapter$Item$EventDumpItem.f52627q ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f436794g.setText(str);
        this.f436795h.setText(((java.text.DateFormat) c2Var.b()).format(new java.util.Date(batteryStatsAdapter$Item$EventDumpItem.f52600e - batteryStatsAdapter$Item$EventDumpItem.f52609m)) + " ~ " + ((java.text.DateFormat) c2Var.b()).format(new java.util.Date(batteryStatsAdapter$Item$EventDumpItem.f52600e)));
        java.util.Iterator it = reportRecord.f52605h.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (str4.endsWith("_overheat") && reportRecord.b(str4, false)) {
                    z18 = true;
                }
            } else {
                z18 = false;
            }
        }
        android.widget.TextView textView = this.f436796i;
        android.widget.ImageView imageView = this.f436798n;
        if (z18) {
            imageView.setImageLevel(4);
            textView.setText("#OVERHEAT");
        } else {
            imageView.setImageLevel(2);
            textView.setText("正常");
        }
        if (batteryStatsAdapter$Item$EventDumpItem.f52627q) {
            this.f436801q.setText("模式: " + batteryStatsAdapter$Item$EventDumpItem.f52608i);
            this.f436802r.setText("时长: " + java.lang.Math.max(1L, batteryStatsAdapter$Item$EventDumpItem.f52609m / 60000) + "min");
            if (!android.text.TextUtils.isEmpty(null)) {
                str2 = null;
            }
            this.f436803s.setText(str2);
            android.view.View view3 = this.f436804t;
            int i19 = !batteryStatsAdapter$Item$EventDumpItem.f52610n.isEmpty() ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean isEmpty2 = batteryStatsAdapter$Item$EventDumpItem.f52610n.isEmpty();
            float f17 = 5.0f;
            int i27 = -2;
            int i28 = com.tencent.mm.R.layout.cvo;
            if (!isEmpty2) {
                boolean b17 = reportRecord.b("jiffy_overheat", false);
                android.view.View view4 = this.f436804t;
                android.widget.TextView textView2 = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.onb);
                textView2.setTextColor(textView2.getResources().getColor(b17 ? com.tencent.mm.R.color.alp : com.tencent.mm.R.color.all));
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view4.findViewById(com.tencent.mm.R.id.hwn);
                int childCount = linearLayout.getChildCount();
                for (int i29 = 0; i29 < childCount; i29++) {
                    android.view.View childAt = linearLayout.getChildAt(i29);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                int i37 = 0;
                while (i37 < 5) {
                    if (i37 < batteryStatsAdapter$Item$EventDumpItem.f52610n.size()) {
                        com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.ThreadInfo threadInfo = (com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.ThreadInfo) batteryStatsAdapter$Item$EventDumpItem.f52610n.get(i37);
                        if (i37 < childCount) {
                            inflate2 = linearLayout.getChildAt(i37);
                        } else {
                            inflate2 = android.view.LayoutInflater.from(linearLayout.getContext()).inflate(com.tencent.mm.R.layout.cvo, (android.view.ViewGroup) linearLayout, false);
                            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, i27);
                            layoutParams.topMargin = (int) android.util.TypedValue.applyDimension(1, f17, linearLayout.getContext().getResources().getDisplayMetrics());
                            linearLayout.addView(inflate2, layoutParams);
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(inflate2, arrayList4.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(inflate2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.onr);
                        android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.oqs);
                        textView3.setVisibility(threadInfo != null ? 0 : 8);
                        textView4.setVisibility(threadInfo != null ? 0 : 8);
                        if (threadInfo != null) {
                            textView3.setText(threadInfo.f52616e);
                            textView4.setText(threadInfo.f52615d + " / " + java.lang.Math.max(1L, (threadInfo.f52618g * 10) / 60000) + "min / " + threadInfo.f52617f);
                            i37++;
                            i17 = -1;
                            f17 = 5.0f;
                            i27 = -2;
                        }
                    }
                    i37++;
                    i17 = -1;
                    f17 = 5.0f;
                    i27 = -2;
                }
            }
            int i38 = 1;
            for (int i39 = 4; i38 <= i39; i39 = 4) {
                if (i38 == 1) {
                    view = this.f436805u;
                } else if (i38 == 2) {
                    view = this.f436806v;
                } else if (i38 == 3) {
                    view = this.f436807w;
                } else {
                    if (i38 != i39) {
                        throw new java.lang.IndexOutOfBoundsException("entryList section out of bound: " + i38);
                    }
                    view = this.f436808x;
                }
                com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.EntryInfo entryInfo = i38 <= batteryStatsAdapter$Item$EventDumpItem.f52611o.size() ? (com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.EntryInfo) batteryStatsAdapter$Item$EventDumpItem.f52611o.get(i38 - 1) : null;
                int i47 = entryInfo != null ? 0 : 8;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(java.lang.Integer.valueOf(i47));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view, arrayList5.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.EntryInfo entryInfo2 = entryInfo;
                yj0.a.f(view, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (entryInfo2 != null) {
                    ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.onb)).setText(entryInfo2.f52612d);
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hwn);
                    int childCount2 = linearLayout2.getChildCount();
                    for (int i48 = 0; i48 < childCount2; i48++) {
                        android.view.View childAt2 = linearLayout2.getChildAt(i48);
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(childAt2, arrayList6.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(childAt2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    int i49 = 0;
                    for (java.util.Map.Entry entry : entryInfo2.f52614f.entrySet()) {
                        i49++;
                        if (i49 > 6) {
                            break;
                        }
                        if (i49 < childCount2) {
                            inflate = linearLayout2.getChildAt(i49);
                        } else {
                            inflate = android.view.LayoutInflater.from(linearLayout2.getContext()).inflate(i28, (android.view.ViewGroup) linearLayout2, false);
                            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                            layoutParams2.topMargin = (int) android.util.TypedValue.applyDimension(1, 5.0f, linearLayout2.getContext().getResources().getDisplayMetrics());
                            linearLayout2.addView(inflate, layoutParams2);
                        }
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(inflate, arrayList7.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(inflate, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.onr);
                        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqs);
                        textView5.setText((java.lang.CharSequence) entry.getKey());
                        textView6.setText((java.lang.CharSequence) entry.getValue());
                        i28 = com.tencent.mm.R.layout.cvo;
                    }
                }
                i38++;
                i28 = com.tencent.mm.R.layout.cvo;
            }
        }
    }
}
