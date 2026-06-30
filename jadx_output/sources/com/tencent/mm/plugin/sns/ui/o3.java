package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class o3 extends android.widget.LinearLayout implements com.tencent.mm.plugin.sns.ui.s4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.n3 f170076d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f170077e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f170078f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.m3 f170079g;

    /* renamed from: h, reason: collision with root package name */
    public int f170080h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f170081i;

    /* renamed from: m, reason: collision with root package name */
    public int f170082m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f170083n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnTouchListener f170084o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f170085p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f170086q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f170087r;

    public o3(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f170076d = new com.tencent.mm.plugin.sns.ui.n3(this);
        this.f170078f = null;
        this.f170080h = 0;
        this.f170081i = "";
        this.f170083n = false;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f170084o = new com.tencent.mm.sdk.platformtools.o8();
        this.f170085p = "";
        this.f170086q = false;
        this.f170087r = true;
        this.f170080h = i17;
        this.f170083n = z17;
        e(context);
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo c(com.tencent.mm.plugin.sns.ui.o3 o3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = o3Var.f170078f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        return snsInfo;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.m3 d(com.tencent.mm.plugin.sns.ui.o3 o3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        com.tencent.mm.plugin.sns.ui.m3 m3Var = o3Var.f170079g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        return m3Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.s4
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        setFooter(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    @Override // com.tencent.mm.plugin.sns.ui.s4
    public void b(dd4.x0 x0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public final void e(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f170077e = context;
        if (this.f170080h == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        this.f170085p = c01.z1.r();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.crt, (android.view.ViewGroup) this, true);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.nh_);
        com.tencent.mm.plugin.sns.ui.n3 n3Var = this.f170076d;
        n3Var.f169962a = linearLayout;
        n3Var.f169973l = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.p1m);
        n3Var.f169965d = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i1v);
        android.widget.LinearLayout linearLayout2 = n3Var.f169965d;
        android.view.View.OnTouchListener onTouchListener = this.f170084o;
        linearLayout2.setOnTouchListener(onTouchListener);
        n3Var.f169966e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.haj);
        n3Var.f169967f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.c7h);
        n3Var.f169967f.setOnTouchListener(onTouchListener);
        n3Var.f169968g = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.chc);
        n3Var.f169970i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487020n74);
        n3Var.f169971j = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487021n75);
        n3Var.f169969h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485214gx5);
        n3Var.f169963b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mnb);
        n3Var.f169964c = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.mnd);
        n3Var.f169972k = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n7v);
        n3Var.f169978q = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.hcs);
        n3Var.f169974m = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_r);
        n3Var.f169975n = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485694io3);
        n3Var.f169976o = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dhf);
        n3Var.f169977p = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.cs6);
        n3Var.f169979r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.csd);
        int i17 = this.f170080h;
        if (i17 == 2) {
            n3Var.f169973l.setVisibility(8);
            n3Var.f169977p.setVisibility(8);
            n3Var.f169964c.setVisibility(0);
        } else if (i17 == 3) {
            n3Var.f169973l.setVisibility(8);
            n3Var.f169964c.setVisibility(8);
            n3Var.f169977p.setVisibility(0);
        } else {
            n3Var.f169973l.setVisibility(0);
            n3Var.f169964c.setVisibility(8);
            n3Var.f169977p.setVisibility(8);
        }
        n3Var.f169965d.setOnClickListener(new com.tencent.mm.plugin.sns.ui.h3(this));
        n3Var.f169967f.setOnClickListener(new com.tencent.mm.plugin.sns.ui.i3(this, context));
        n3Var.f169968g.setOnClickListener(new com.tencent.mm.plugin.sns.ui.j3(this, context));
        n3Var.f169963b.setOnClickListener(new com.tencent.mm.plugin.sns.ui.k3(this));
        n3Var.f169979r.setOnClickListener(new com.tencent.mm.plugin.sns.ui.l3(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        if (this.f170080h == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        this.f170078f = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f170081i);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f170081i) || this.f170078f == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        com.tencent.mm.plugin.sns.ui.n3 n3Var = this.f170076d;
        n3Var.f169976o.setVisibility(8);
        int localPrivate = this.f170078f.getLocalPrivate();
        boolean z17 = this.f170083n;
        if (com.tencent.mm.plugin.sns.model.s5.i(localPrivate, z17)) {
            n3Var.f169967f.setVisibility(8);
            n3Var.f169965d.setVisibility(8);
        } else if (this.f170078f.isExtFlag()) {
            if (this.f170087r) {
                n3Var.f169962a.setVisibility(0);
            }
            n3Var.f169968g.setVisibility(0);
            n3Var.f169967f.setVisibility(0);
            n3Var.f169965d.setVisibility(0);
            n3Var.f169973l.setVisibility(0);
        } else {
            n3Var.f169978q.setVisibility(0);
            n3Var.f169973l.setVisibility(0);
            n3Var.f169962a.setVisibility(8);
            n3Var.f169968g.setVisibility(8);
            n3Var.f169967f.setVisibility(8);
            n3Var.f169965d.setVisibility(8);
        }
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(this.f170078f);
        if (e17 != null) {
            if (this.f170078f.isExtFlag()) {
                int i17 = e17.CommentCount;
                if (i17 > 0) {
                    n3Var.f169971j.setText(i17 + "");
                    n3Var.f169971j.setVisibility(0);
                } else {
                    n3Var.f169971j.setVisibility(8);
                }
                int i18 = e17.LikeCount;
                if (i18 > 0) {
                    n3Var.f169970i.setText(i18 + "");
                    n3Var.f169970i.setVisibility(0);
                } else {
                    n3Var.f169970i.setVisibility(8);
                }
                n3Var.f169968g.setContentDescription(getResources().getString(com.tencent.mm.R.string.jak, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)));
                n3Var.f169969h.setText(this.f170078f.getLikeFlag() == 1 ? getResources().getString(com.tencent.mm.R.string.jah) : getResources().getString(com.tencent.mm.R.string.jaj));
                n3Var.f169966e.setImageResource(com.tencent.mm.R.raw.friendactivity_comment_likeicon_normal);
                com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                s0Var.Q().f60456p = i17;
                s0Var.Q().f60457q = i18;
            }
            if (this.f170085p.equals(this.f170078f.getUserName()) || !z17) {
                n3Var.f169974m.setVisibility(8);
            } else {
                n3Var.f169974m.setVisibility(0);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n3Var.f169974m, this.f170078f.getUserName(), null);
            }
        }
        if (this.f170078f.getTimeLine() == null) {
            n3Var.f169972k.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        java.lang.String str = this.f170078f.getTimeLine().ContentDesc;
        if (str == null || str.equals("")) {
            n3Var.f169972k.setText("");
            n3Var.f169972k.setVisibility(8);
        } else {
            android.widget.TextView textView = n3Var.f169972k;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            java.lang.String concat = str.concat(" ");
            float textSize = n3Var.f169972k.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, concat, textSize));
            n3Var.f169972k.setVisibility(0);
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60448h = 1L;
        }
        if (com.tencent.mm.plugin.sns.model.s5.i(this.f170078f.getLocalPrivate(), z17)) {
            n3Var.f169975n.setVisibility(0);
            n3Var.f169972k.setVisibility(0);
        } else {
            n3Var.f169975n.setVisibility(8);
        }
        if (z17 && this.f170078f.isDieItem()) {
            n3Var.f169968g.setVisibility(0);
            n3Var.f169972k.setVisibility(0);
            n3Var.f169976o.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    @Override // com.tencent.mm.plugin.sns.ui.s4
    public android.view.View.OnClickListener getJumpToDetailCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpToDetailCallback", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpToDetailCallback", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        return null;
    }

    public void setCallBack(com.tencent.mm.plugin.sns.ui.m3 m3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f170079g = m3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setFooter(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f170081i = str;
        f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setIsFromStarList(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsFromStarList", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f170086q = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsFromStarList", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setSnsSource(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f170082m = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    public void setType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        this.f170080h = i17;
        e(this.f170077e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        int i18 = this.f170080h;
        if (i18 == 2 || i18 == 3) {
            super.setVisibility(i17);
            this.f170087r = i17 != 8;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f170078f;
        if (snsInfo != null && !snsInfo.isExtFlag()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
            return;
        }
        com.tencent.mm.plugin.sns.ui.n3 n3Var = this.f170076d;
        if (i17 == 8) {
            n3Var.f169962a.setVisibility(8);
            this.f170087r = false;
        } else if (i17 == 0) {
            n3Var.f169962a.setVisibility(0);
            this.f170087r = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
    }
}
