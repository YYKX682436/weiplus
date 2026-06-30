package com.tencent.mm.plugin.sns.ui.view;

/* loaded from: classes4.dex */
public class SnsStoryHeaderView extends android.widget.FrameLayout implements ze4.i {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f170656w = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f170657d;

    /* renamed from: e, reason: collision with root package name */
    public int f170658e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f170659f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f170660g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f170661h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f170662i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f170663m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f170664n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.StoryAvatarDotsView f170665o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f170666p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f170667q;

    /* renamed from: r, reason: collision with root package name */
    public int f170668r;

    /* renamed from: s, reason: collision with root package name */
    public int f170669s;

    /* renamed from: t, reason: collision with root package name */
    public int f170670t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f170671u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f170672v;

    public SnsStoryHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        if (!this.f170671u) {
            android.view.View view = this.f170663m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "checkExpose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "checkExpose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            return;
        }
        if (this.f170663m.getVisibility() == 0) {
            int[] iArr = new int[2];
            this.f170663m.getLocationOnScreen(iArr);
            if (iArr[1] <= 0) {
                this.f170662i = false;
            } else if (!this.f170662i) {
                this.f170662i = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsStoryHeaderView", "reportExpose: ");
                java.util.LinkedList linkedList = (java.util.LinkedList) this.f170659f;
                if (linkedList.size() <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    if (this.f170668r > 0) {
                        sb6.append((java.lang.String) linkedList.get(0));
                    }
                    for (int i17 = 1; i17 < this.f170668r; i17++) {
                        sb6.append("|");
                        sb6.append((java.lang.String) linkedList.get(i17));
                    }
                    com.tencent.mm.autogen.mmdata.rpt.StorySnsHeaderExposeStruct storySnsHeaderExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.StorySnsHeaderExposeStruct();
                    storySnsHeaderExposeStruct.f60967d = storySnsHeaderExposeStruct.b("EnterObjectId", this.f170660g, true);
                    storySnsHeaderExposeStruct.f60968e = storySnsHeaderExposeStruct.b("SessionId", java.lang.String.valueOf(99L) + "_" + java.lang.System.currentTimeMillis(), true);
                    storySnsHeaderExposeStruct.f60969f = (long) this.f170668r;
                    storySnsHeaderExposeStruct.f60970g = storySnsHeaderExposeStruct.b("ExposeUinList", sb6.toString(), true);
                    storySnsHeaderExposeStruct.f60971h = (long) this.f170669s;
                    storySnsHeaderExposeStruct.f60972i = (long) this.f170670t;
                    storySnsHeaderExposeStruct.k();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStoryHeaderView", "checkExpose: %s", java.lang.Boolean.valueOf(this.f170662i));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkExpose", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public final void b(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f170665o.setIconSize(i65.a.b(getContext(), 26));
        this.f170665o.setIconGap(i65.a.b(getContext(), 16));
        this.f170668r = 0;
        if (list.size() > 0) {
            this.f170665o.setVisibility(0);
            this.f170665o.setIconLayerCount(java.lang.Math.min(list.size(), 3));
            this.f170668r = this.f170665o.getChildCount();
            for (int i17 = 0; i17 < this.f170665o.getChildCount(); i17++) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f170665o.a(i17), (java.lang.String) list.get(i17), 0.5f);
                this.f170665o.a(i17).setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.b2q));
                this.f170665o.a(i17).setPadding(i65.a.b(getContext(), 1), i65.a.b(getContext(), 1), i65.a.b(getContext(), 1), i65.a.b(getContext(), 1));
            }
        } else {
            this.f170665o.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        if (r11.t0() == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r21) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView.c(boolean):void");
    }

    public void setEnterObjectId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f170660g = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setSessionId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setSnsType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsType", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        this.f170657d = i17;
        c(true);
        java.util.List list = this.f170659f;
        if (((java.util.LinkedList) list).size() > 0) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Bi((java.lang.String) ((java.util.LinkedList) list).get(0), true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsType", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setStoryAction(yd4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public void setTopLineVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTopLineVisibility", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nbk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "setTopLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView", "setTopLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTopLineVisibility", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }

    public SnsStoryHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170658e = 10000;
        this.f170659f = new java.util.LinkedList();
        this.f170660g = null;
        this.f170661h = false;
        this.f170662i = false;
        this.f170668r = 0;
        this.f170669s = 0;
        this.f170670t = 0;
        this.f170671u = true;
        this.f170672v = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_STORY_SNS_HEADER_TYPE_INT, 0);
        if (r17 > 0) {
            this.f170658e = r17;
        } else {
            this.f170658e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_sns_story_open, 10000);
        }
        if (((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Ai().f380460d == 1) {
            this.f170658e = 10001;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStoryHeaderView", "init: headerType %s configType %s", java.lang.Integer.valueOf(this.f170658e), java.lang.Integer.valueOf(r17));
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.ctr, this);
        this.f170663m = findViewById(com.tencent.mm.R.id.nb8);
        this.f170664n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nbj);
        this.f170665o = (com.tencent.mm.ui.widget.StoryAvatarDotsView) findViewById(com.tencent.mm.R.id.nb6);
        this.f170666p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nb9);
        this.f170667q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nb_);
        this.f170663m.setOnClickListener(new yd4.a(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
    }
}
