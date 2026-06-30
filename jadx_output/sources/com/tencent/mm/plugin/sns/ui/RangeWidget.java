package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class RangeWidget extends com.tencent.mm.plugin.sns.ui.BaseRangeWidget {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f166598x = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f166599e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f166600f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsUploadConfigView f166601g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f166602h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f166603i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f166604m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f166605n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f166606o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f166607p;

    /* renamed from: q, reason: collision with root package name */
    public int f166608q;

    /* renamed from: r, reason: collision with root package name */
    public wa4.x f166609r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f166610s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f166611t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f166612u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View.OnClickListener f166613v;

    /* renamed from: w, reason: collision with root package name */
    public int f166614w;

    public RangeWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166608q = 0;
        this.f166609r = null;
        this.f166610s = "";
        this.f166611t = "";
        this.f166612u = "";
        this.f166613v = null;
        this.f166614w = 0;
        c(context);
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public void a(com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f166601g = snsUploadConfigView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public boolean b(int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f166608q = intent.getIntExtra("Ktag_range_index", 0);
        this.f166610s = intent.getStringExtra("Klabel_name_list");
        this.f166611t = intent.getStringExtra("Kother_user_name_list");
        this.f166612u = intent.getStringExtra("Kchat_room_name_list");
        int maxTagNameLen = getMaxTagNameLen();
        java.lang.String str = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166612u)) {
            str = "" + com.tencent.mm.sdk.platformtools.t8.c1(d(java.util.Arrays.asList(this.f166612u.split(","))), ",");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166610s)) {
            if (str.length() > 0) {
                str = str + "," + this.f166610s;
            } else {
                str = str + this.f166610s;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166611t)) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(d(java.util.Arrays.asList(this.f166611t.split(","))), ",");
            if (str.length() > 0) {
                str = str + "," + c17;
            } else {
                str = str + c17;
            }
        }
        if (maxTagNameLen != -1 && str != null && str.length() > maxTagNameLen) {
            str = str.substring(0, maxTagNameLen) + "...";
        }
        int i19 = this.f166608q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = this.f166604m.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f166602h;
        if (weImageView != null) {
            weImageView.s(com.tencent.mm.R.raw.album_group_icon_pressed, com.tencent.mm.R.color.aaq);
            this.f166603i.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
            this.f166604m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
        }
        com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView = this.f166601g;
        if (snsUploadConfigView != null) {
            snsUploadConfigView.setPrivated(false);
        }
        if (i19 == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f166602h;
            if (weImageView2 != null) {
                weImageView2.s(com.tencent.mm.R.raw.album_group_icon_normal, com.tencent.mm.R.color.f479265ui);
                this.f166603i.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                this.f166604m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478873jj));
            }
            this.f166604m.setText(com.tencent.mm.R.string.jbq);
        } else if (i19 == 1) {
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView2 = this.f166601g;
            if (snsUploadConfigView2 != null) {
                snsUploadConfigView2.setPrivated(true);
            }
            if (atContactWidget != null && this.f166601g != null && atContactWidget.getAtList().size() > 0) {
                db5.e1.i(this.f166599e, com.tencent.mm.R.string.jfw, com.tencent.mm.R.string.f490573yv);
                atContactWidget.a();
            }
            this.f166604m.setText(com.tencent.mm.R.string.jbo);
        } else if (i19 == 2) {
            if (this.f166602h != null) {
                this.f166603i.setText(getResources().getString(com.tencent.mm.R.string.f493250jg1));
                if (com.tencent.mm.sdk.platformtools.t8.J0(j17)) {
                    this.f166602h.s(com.tencent.mm.R.raw.album_group_icon_normal, com.tencent.mm.R.color.f479265ui);
                    this.f166603i.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                    this.f166604m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478873jj));
                } else {
                    this.f166603i.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
                    this.f166604m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
                }
            }
            this.f166604m.setText(j17);
        } else if (i19 == 3) {
            if (this.f166602h != null) {
                this.f166603i.setText(getResources().getString(com.tencent.mm.R.string.jfj));
                if (com.tencent.mm.sdk.platformtools.t8.J0(j17)) {
                    this.f166602h.s(com.tencent.mm.R.raw.album_group_icon_normal, com.tencent.mm.R.color.f479265ui);
                    this.f166603i.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                    this.f166604m.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478873jj));
                } else {
                    this.f166602h.setIconColor(-65536);
                    this.f166603i.setTextColor(-65536);
                    this.f166604m.setTextColor(-65536);
                }
            }
            this.f166604m.setText(j17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleRangeChoose", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return true;
    }

    public final void c(android.content.Context context) {
        wa4.x xVar;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f166599e = (android.app.Activity) context;
        this.f166600f = android.view.View.inflate(context, getLayoutResource(), this);
        this.f166609r = com.tencent.mm.plugin.sns.model.l4.Nj().g();
        this.f166604m = (android.widget.TextView) this.f166600f.findViewById(com.tencent.mm.R.id.nbu);
        this.f166603i = (android.widget.TextView) this.f166600f.findViewById(com.tencent.mm.R.id.i0l);
        this.f166602h = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f166600f.findViewById(com.tencent.mm.R.id.f486515li0);
        this.f166605n = (android.widget.LinearLayout) this.f166600f.findViewById(com.tencent.mm.R.id.nbs);
        this.f166606o = (android.widget.TextView) this.f166600f.findViewById(com.tencent.mm.R.id.nbr);
        this.f166607p = this.f166600f.findViewById(com.tencent.mm.R.id.f486518li3);
        this.f166600f.setOnClickListener(new com.tencent.mm.plugin.sns.ui.c8(this));
        android.widget.LinearLayout linearLayout = this.f166605n;
        if (linearLayout != null && this.f166606o != null && this.f166607p != null) {
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.sns.ui.d8(this));
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_last_range_enable, 1) == 1;
            this.f166607p.setBackground(null);
            this.f166605n.setVisibility(8);
            if (z17 && (xVar = this.f166609r) != null && (linkedList = xVar.f444299d) != null && !linkedList.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = this.f166609r.f444299d.iterator();
                while (it.hasNext()) {
                    wa4.y yVar = (wa4.y) it.next();
                    int i17 = yVar.f444306e;
                    if (i17 == 1) {
                        java.lang.String g17 = ((b93.b) c93.a.a()).g(yVar.f444305d);
                        if (g17 != null) {
                            arrayList.add(g17);
                        }
                    } else if (i17 == 2) {
                        gm0.j1.i();
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f444305d, true);
                        if (n17 != null && ((int) n17.E2) != 0) {
                            arrayList.add(yVar.f444305d);
                        }
                    } else {
                        arrayList.add(yVar.f444305d);
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                    this.f166607p.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.bfj));
                    this.f166605n.setVisibility(0);
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(d(arrayList), ",");
                    android.widget.TextView textView = this.f166606o;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = getContext();
                    java.lang.String format = java.lang.String.format(context.getResources().getString(com.tencent.mm.R.string.jfk), c17);
                    float textSize = this.f166606o.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, format, textSize));
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().f61239f = this.f166609r.f444301f ? 2 : 1;
                    com.tencent.mm.plugin.sns.model.l4.Sj().execute(new com.tencent.mm.plugin.sns.ui.e8(this));
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    public final java.util.List d(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            return linkedList;
        }
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return linkedList;
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public int getLabelRange() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        int i17 = this.f166608q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return i17;
    }

    public int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return com.tencent.mm.R.layout.cby;
    }

    public int getMaxTagNameLen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return -1;
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public bw5.nk0 getSnsVisibilityData() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVisibilityData", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        bw5.nk0 nk0Var = new bw5.nk0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVisibilityData", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        return nk0Var;
    }

    public void setEnablePrivate(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public void setRangeTipClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        this.f166613v = onClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public void setSnsRangeChangeComplexCallback(com.tencent.mm.plugin.sns.ui.y0 y0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsRangeChangeComplexCallback", "com.tencent.mm.plugin.sns.ui.RangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsRangeChangeComplexCallback", "com.tencent.mm.plugin.sns.ui.RangeWidget");
    }

    public RangeWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166608q = 0;
        this.f166609r = null;
        this.f166610s = "";
        this.f166611t = "";
        this.f166612u = "";
        this.f166613v = null;
        this.f166614w = 0;
        c(context);
    }
}
