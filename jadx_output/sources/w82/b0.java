package w82;

/* loaded from: classes12.dex */
public class b0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f443816d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f443817e;

    /* renamed from: f, reason: collision with root package name */
    public w82.a0 f443818f;

    /* renamed from: g, reason: collision with root package name */
    public w82.r1 f443819g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f443820h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f443821i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Long f443822m;

    /* renamed from: n, reason: collision with root package name */
    public int f443823n;

    /* renamed from: o, reason: collision with root package name */
    public final float f443824o;

    /* renamed from: p, reason: collision with root package name */
    public final float f443825p;

    public b0(android.content.Context context) {
        super(context);
        this.f443819g = null;
        this.f443820h = false;
        this.f443821i = false;
        this.f443822m = 0L;
        this.f443824o = 1.0737418E9f;
        this.f443825p = 1024.0f;
        setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.f443816d = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.abt, null);
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488759e53, null);
        inflate.findViewById(com.tencent.mm.R.id.t_8).setOnClickListener(new w82.z(this));
        this.f443817e = inflate;
        addView(this.f443816d, new android.widget.LinearLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams));
        addView(this.f443817e, new android.widget.LinearLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams));
    }

    public void a(boolean z17) {
        if (z17 && this.f443817e.getVisibility() != 0) {
            c("view_exp");
        }
        android.view.View view = this.f443817e;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableFullSizeBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableFullSizeBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void b(boolean z17) {
        android.view.View view = this.f443816d;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableOldVersionBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "enableOldVersionBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = this.f443823n;
        int i18 = 1;
        if (i17 == 1) {
            i18 = 2;
        } else if (i17 != 3) {
            i18 = 0;
        }
        hashMap.put("fav_cap_status", java.lang.Integer.valueOf(i18));
        float b07 = (float) o72.x1.b0();
        float f17 = this.f443825p;
        hashMap.put("fav_cap_usage", java.lang.Float.valueOf(b07 / f17));
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(((float) o72.x1.a0()) / f17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_space_cap_bar", str, hashMap, 32903);
    }

    public final void d() {
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= getChildCount()) {
                break;
            }
            if (getChildAt(i17).getId() == com.tencent.mm.R.id.dul) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            return;
        }
        android.view.View view = new android.view.View(getContext());
        view.setId(com.tencent.mm.R.id.dul);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv)));
        addView(view);
    }

    public final void e(int i17, long j17) {
        java.lang.Long valueOf = java.lang.Long.valueOf(o72.x1.K());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(o72.x1.a0());
        java.lang.Long valueOf3 = java.lang.Long.valueOf(o72.x1.b0());
        this.f443822m = java.lang.Long.valueOf(j17);
        ((android.widget.TextView) this.f443817e.findViewById(com.tencent.mm.R.id.v_8)).setText(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.nuo, o72.x1.O((float) valueOf2.longValue()), o72.x1.O((float) valueOf3.longValue())));
        this.f443823n = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavHeaderView", "showStatusBar status:" + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showStatusBar freeCapacity: ");
        float longValue = (float) valueOf.longValue();
        float f17 = this.f443824o;
        sb6.append(longValue / f17);
        sb6.append(" GB, totalCapacity: ");
        sb6.append(((float) valueOf2.longValue()) / f17);
        sb6.append(" GB, usedCapacity: ");
        sb6.append(((float) valueOf3.longValue()) / f17);
        sb6.append(" GB, failedCapacity: ");
        sb6.append(((float) this.f443822m.longValue()) / f17);
        sb6.append(" GB");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavHeaderView", sb6.toString());
        if (i17 == 0) {
            android.view.View view = this.f443817e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView", "showStatusBar", "(IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                android.view.View childAt = getChildAt(i18);
                if (childAt.getId() == com.tencent.mm.R.id.dul) {
                    removeView(childAt);
                }
            }
            return;
        }
        if (i17 == 1) {
            if (!this.f443820h) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14109, 1);
            }
            this.f443820h = true;
            a(true);
            ((android.widget.TextView) this.f443817e.findViewById(com.tencent.mm.R.id.ssv)).setText(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.nup, o72.x1.O((float) (this.f443822m.longValue() - valueOf.longValue()))));
            d();
            return;
        }
        if (i17 == 3) {
            if (!this.f443821i) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14109, 0);
            }
            this.f443821i = true;
            a(true);
            ((android.widget.TextView) this.f443817e.findViewById(com.tencent.mm.R.id.ssv)).setText(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.nuy, o72.x1.O((float) valueOf.longValue())));
            d();
        }
    }

    public void f() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavHeaderView", "triggerStatusBar call");
        java.util.List o47 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
        long j17 = 0;
        if (o47 != null) {
            java.util.Iterator it = o47.iterator();
            z17 = false;
            while (it.hasNext()) {
                j17 += o72.x1.b((o72.r2) it.next());
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavHeaderView", "triggerStatusBar uploadFailedItemList size:%d,totalSize:%d", java.lang.Integer.valueOf(o47.size()), java.lang.Long.valueOf(j17));
        } else {
            z17 = false;
        }
        if (z17 && j17 > o72.x1.K()) {
            e(1, j17);
            w82.r1 r1Var = this.f443819g;
            if (r1Var != null) {
                ((com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) r1Var).u7(false);
                return;
            }
            return;
        }
        if (o72.x1.m0()) {
            e(3, j17);
            w82.r1 r1Var2 = this.f443819g;
            if (r1Var2 != null) {
                ((com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) r1Var2).u7(false);
                return;
            }
            return;
        }
        e(0, j17);
        w82.r1 r1Var3 = this.f443819g;
        if (r1Var3 != null) {
            ((com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) r1Var3).u7(true);
        }
    }

    public void setCleanFavSpace(w82.a0 a0Var) {
        this.f443818f = a0Var;
    }

    public void setUsageTipsBarVisibilityListener(w82.r1 r1Var) {
        this.f443819g = r1Var;
    }
}
