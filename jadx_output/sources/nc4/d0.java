package nc4;

/* loaded from: classes4.dex */
public final class d0 extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: d, reason: collision with root package name */
    public final int f336131d;

    /* renamed from: e, reason: collision with root package name */
    public final int f336132e;

    /* renamed from: f, reason: collision with root package name */
    public int f336133f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f336134g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f336135h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f336136i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f336137m;

    /* renamed from: n, reason: collision with root package name */
    public final nc4.s f336138n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f336131d = i65.a.b(getContext(), 245);
        this.f336132e = i65.a.b(getContext(), 20);
        this.f336133f = -1;
        this.f336136i = jz5.h.b(new nc4.j(this));
        this.f336137m = jz5.h.b(new nc4.l(this));
        this.f336138n = new nc4.s(this, activity);
    }

    public static final void O6(nc4.d0 d0Var, java.util.HashMap hashMap, nc4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        d0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        hashMap.put(java.lang.Integer.valueOf(cVar.type()), cVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    public static final /* synthetic */ java.util.LinkedHashMap P6(nc4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        java.util.LinkedHashMap R6 = d0Var.R6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        return R6;
    }

    public static final /* synthetic */ int Q6(nc4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaxHeight$p", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        int i17 = d0Var.f336131d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaxHeight$p", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        return i17;
    }

    public final java.util.LinkedHashMap R6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) ((jz5.n) this.f336136i).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r9 = P6(r15).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r9.hasNext() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        r10 = (java.util.Map.Entry) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if ((r10.getValue() instanceof nc4.j0) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r8 = r10.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r8 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r8 = (nc4.j0) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        r9 = nc4.d.f336126h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r9.h() != r16) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r6 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r16 != nc4.d.f336125g.h()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        r9 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        r11 = new java.lang.Object[8];
        r11[0] = java.lang.Long.valueOf(c01.id.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r6 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        r11[1] = java.lang.Integer.valueOf(r6);
        r11[2] = java.lang.Integer.valueOf(r10);
        r11[3] = ca4.z0.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        if (r8 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r11[4] = java.lang.Integer.valueOf(r4);
        r11[5] = java.lang.Integer.valueOf(r0);
        r11[6] = java.lang.Integer.valueOf(r3);
        r11[7] = java.lang.Integer.valueOf(r17);
        r9.d(20838, r11);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        if (r16 != nc4.d.f336124f.h()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        if (r16 != r9.h()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r16 != nc4.d.f336127i.h()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        if (r10 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a0, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0095, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        r0 = new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0090, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005b, code lost:
    
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc4.d0.S6(int, int):void");
    }

    public final void T6() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSpringPostIconRedDotVisibility$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        boolean f17 = xa4.g.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ToolBarUIC", "updatePostIconRedDotVisibility: " + f17);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().U0(0, f17);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.eb E = ((com.tencent.mm.ui.MMActivity) activity2).getController().E(0);
        android.widget.ImageView imageView = (E == null || (view = E.f208385k) == null) ? null : (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d2h);
        if (f17) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            int f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479672c9);
            int f19 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn);
            if (layoutParams2 != null) {
                layoutParams2.setMargins(0, f18, f19, 0);
            }
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams2);
            }
            if (imageView != null) {
                imageView.setColorFilter(i65.a.d(getContext(), com.tencent.mm.R.color.Red_100));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("redDot ");
            sb6.append(imageView != null ? java.lang.Integer.valueOf(imageView.hashCode()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ToolBarUIC", sb6.toString());
        }
        if (imageView != null) {
            imageView.setVisibility(f17 ? 0 : 8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSpringPostIconRedDotVisibility$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        super.onActivityResult(i17, i18, intent);
        java.util.Iterator it = R6().entrySet().iterator();
        while (it.hasNext()) {
            ((nc4.c) ((java.util.Map.Entry) it.next()).getValue()).onActivityResult(i17, i18, intent);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupOptionMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        mMActivity.addIconOptionMenu(0, com.tencent.mm.R.string.j5r, com.tencent.mm.R.raw.icons_filled_camera, new nc4.a0(this), new nc4.b0(this));
        mMActivity.setBackBtn(new nc4.c0(mMActivity), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        xa4.b.f452821a.c(xa4.g.f(), "view_exp", 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupOptionMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupActionBarColor", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) activity2;
        if (!resumePage()) {
            mMActivity2.setTitleAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupActionBarColor", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        getRecycleView().i(this.f336138n);
        if (xa4.g.f()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markExposeRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsActivityPostActionReportStruct snsActivityPostActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsActivityPostActionReportStruct();
            snsActivityPostActionReportStruct.f60433d = 1;
            snsActivityPostActionReportStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markExposeRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.ToolBarUIC", "error requestCode:" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ToolBarUIC", "requestCode:" + i17 + ",grantResults:" + grantResults[0]);
        if (i17 == 16) {
            if (grantResults[0] == 0) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                pf5.e.launch$default(this, kotlinx.coroutines.internal.b0.f310484a, null, new nc4.n(this, null), 2, null);
            } else {
                int i18 = kotlin.jvm.internal.o.b("android.permission.CAMERA", permissions[0]) ? com.tencent.mm.R.string.hh8 : com.tencent.mm.R.string.hhn;
                if (grantResults[0] != 0) {
                    db5.e1.C(getContext(), getString(i18), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new nc4.o(this), nc4.p.f336169d);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }
}
