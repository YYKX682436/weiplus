package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class NewRangeWidget extends com.tencent.mm.plugin.sns.ui.BaseRangeWidget {
    public static final java.lang.String F = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jbm);
    public bw5.nk0 A;
    public android.view.View.OnClickListener B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public com.tencent.mm.plugin.sns.ui.y0 E;
    public java.lang.String G;
    public android.widget.TextView H;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f166384e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f166385f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsUploadConfigView f166386g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f166387h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f166388i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f166389m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f166390n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f166391o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f166392p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f166393q;

    /* renamed from: r, reason: collision with root package name */
    public int f166394r;

    /* renamed from: s, reason: collision with root package name */
    public wa4.x f166395s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f166396t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f166397u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f166398v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.ArrayList f166399w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f166400x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f166401y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f166402z;

    public NewRangeWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166394r = 0;
        this.f166395s = null;
        this.f166396t = "";
        this.f166397u = "";
        this.f166398v = "";
        this.f166399w = new java.util.ArrayList();
        this.f166400x = new java.util.ArrayList();
        this.f166401y = new java.util.ArrayList();
        this.f166402z = new java.util.ArrayList();
        this.G = "";
        this.A = new bw5.nk0();
        this.B = null;
        f(context);
    }

    private void setLastRangeVisibilityWrapper(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLastRangeVisibilityWrapper", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        if (i17 == 0) {
            this.f166390n.setVisibility(i17);
            this.f166391o.setVisibility(i17);
        } else {
            this.f166390n.setVisibility(i17);
            this.f166391o.setVisibility(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLastRangeVisibilityWrapper", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public void a(com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.f166386g = snsUploadConfigView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWidget", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0416  */
    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r23, int r24, android.content.Intent r25, com.tencent.mm.plugin.sns.ui.AtContactWidget r26) {
        /*
            Method dump skipped, instructions count: 2258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.NewRangeWidget.b(int, int, android.content.Intent, com.tencent.mm.plugin.sns.ui.AtContactWidget):boolean");
    }

    public final java.util.ArrayList c(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLabelList", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!android.text.TextUtils.isEmpty(e(str))) {
                    arrayList2.add(str);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLabelList", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return arrayList2;
    }

    public final java.util.ArrayList d(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUserList", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).r2()) {
                    arrayList2.add(str);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUserList", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return arrayList2;
    }

    public final java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayLabelNameByLabelId", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        java.lang.String g17 = ((b93.b) c93.a.a()).g(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            g17 = "";
        } else if (com.tencent.mm.sdk.platformtools.t8.L0(((b93.b) c93.a.a()).j(str))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayLabelNameByLabelId", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayLabelNameByLabelId", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return g17;
    }

    public final void f(android.content.Context context) {
        wa4.x xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.f166384e = (android.app.Activity) context;
        this.f166385f = android.view.View.inflate(context, getLayoutResource(), this);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g6s);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486777mg1);
        this.H = (android.widget.TextView) findViewById(com.tencent.mm.R.id.veb);
        this.f166395s = com.tencent.mm.plugin.sns.model.l4.Nj().g();
        this.f166389m = (android.widget.TextView) this.f166385f.findViewById(com.tencent.mm.R.id.nbu);
        this.f166388i = (android.widget.TextView) this.f166385f.findViewById(com.tencent.mm.R.id.i0l);
        this.f166387h = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f166385f.findViewById(com.tencent.mm.R.id.f486515li0);
        this.f166390n = (android.widget.RelativeLayout) this.f166385f.findViewById(com.tencent.mm.R.id.v98);
        this.f166391o = (android.widget.LinearLayout) this.f166385f.findViewById(com.tencent.mm.R.id.nbs);
        this.f166392p = (android.widget.TextView) this.f166385f.findViewById(com.tencent.mm.R.id.nbr);
        this.f166393q = this.f166385f.findViewById(com.tencent.mm.R.id.f486518li3);
        this.A.i(bw5.qk0.SNS_VISIBILITY_PUBLIC);
        this.f166385f.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.NewRangeWidget$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String str = com.tencent.mm.plugin.sns.ui.NewRangeWidget.F;
                com.tencent.mm.plugin.sns.ui.NewRangeWidget newRangeWidget = com.tencent.mm.plugin.sns.ui.NewRangeWidget.this;
                newRangeWidget.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/NewRangeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", newRangeWidget, array);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/NewRangeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", newRangeWidget, array2);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewRangeWidget", "click to jump to SnsLabelUI");
                if (pc4.d.f353410a.m()) {
                    android.app.Activity context2 = newRangeWidget.f166384e;
                    com.tencent.mm.plugin.sns.ui.NewRangeWidget$$b newRangeWidget$$b = new com.tencent.mm.plugin.sns.ui.NewRangeWidget$$b(newRangeWidget);
                    bw5.nk0 currentData = newRangeWidget.A;
                    java.lang.String postSessionId = ca4.z0.l();
                    kotlin.jvm.internal.o.g(context2, "context");
                    kotlin.jvm.internal.o.g(currentData, "currentData");
                    kotlin.jvm.internal.o.g(postSessionId, "postSessionId");
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new oi0.b(null, currentData, 1, postSessionId, null, context2, newRangeWidget$$b, null), 3, null);
                } else {
                    android.app.Activity activity = newRangeWidget.f166384e;
                    int i17 = com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.P;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewSnsLabelUI", "getJumpIntent");
                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.class);
                    com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                    s0Var.B().D = 1L;
                    s0Var.B().E = 0L;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpIntent", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    intent.putStringArrayListExtra("label_id", newRangeWidget.f166402z);
                    intent.putExtra("KLabel_range_index", newRangeWidget.f166394r);
                    intent.putExtra("Klabel_name_list", newRangeWidget.f166396t);
                    intent.putExtra("Kother_user_name_list", newRangeWidget.f166397u);
                    intent.putExtra("Kchat_room_name_list", newRangeWidget.f166398v);
                    intent.putExtra("k_sns_label_ui_style", 0);
                    intent.putExtra("Kis_with_together", newRangeWidget.f166249d);
                    intent.putExtra("CONTACT_INFO_UI_SOURCE", 81);
                    android.app.Activity activity2 = newRangeWidget.f166384e;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(5);
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.k(activity2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/NewRangeWidget", "lambda$init$1", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
                com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                s0Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = s0Var2.f164959l;
                if (timelineGroupUserBehaviorStruct != null) {
                    int i18 = timelineGroupUserBehaviorStruct.f61238e;
                    if (i18 <= 0) {
                        timelineGroupUserBehaviorStruct.f61238e = 1;
                    } else {
                        timelineGroupUserBehaviorStruct.f61238e = i18 + 1;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseRangeClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                ta4.d1.f416736a.a("view_clk", newRangeWidget.A.b().f32151d);
                yj0.a.h(newRangeWidget, "com/tencent/mm/plugin/sns/ui/NewRangeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$init$1", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
                yj0.a.h(newRangeWidget, "com/tencent/mm/plugin/sns/ui/NewRangeWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.widget.LinearLayout linearLayout = this.f166391o;
        if (linearLayout != null && this.f166392p != null && this.f166393q != null) {
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.sns.ui.g6(this));
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_last_range_enable, 1) == 1;
            this.f166393q.setBackground(null);
            setLastRangeVisibilityWrapper(8);
            if (!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SNS_UPLOAD_USED_NEW_GROUP_BOOLEAN_SYNC, false)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
                return;
            }
            if (z17 && (xVar = this.f166395s) != null && !com.tencent.mm.sdk.platformtools.t8.L0(xVar.f444299d)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int min = java.lang.Math.min(this.f166395s.f444299d.size(), 20) - 1; min >= 0; min--) {
                    wa4.y yVar = (wa4.y) this.f166395s.f444299d.get(min);
                    int i17 = yVar.f444306e;
                    if (i17 == 1) {
                        if (!hashSet.contains(yVar.f444305d) && !com.tencent.mm.sdk.platformtools.t8.K0(yVar.f444305d)) {
                            java.lang.String e17 = e(yVar.f444305d);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                                arrayList.add(0, e17);
                                hashSet.add(yVar.f444305d);
                            }
                        }
                    } else if (i17 == 2) {
                        gm0.j1.i();
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f444305d, true);
                        if (n17 != null && ((int) n17.E2) != 0) {
                            arrayList.add(yVar.f444305d);
                        }
                    } else {
                        java.lang.String g17 = g(yVar.f444305d);
                        if (!android.text.TextUtils.isEmpty(g17)) {
                            arrayList.add(g17);
                        }
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                    this.f166393q.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.bfj));
                    setLastRangeVisibilityWrapper(0);
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, F);
                    android.widget.TextView textView = this.f166392p;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = getContext();
                    java.lang.String format = java.lang.String.format(context.getResources().getString(com.tencent.mm.R.string.jfk), c17);
                    float textSize = this.f166392p.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, format, textSize));
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.B().f61239f = this.f166395s.f444301f ? 2 : 1;
                    com.tencent.mm.plugin.sns.model.l4.Sj().execute(new com.tencent.mm.plugin.sns.ui.h6(this));
                    ta4.d1.f416736a.b("view_exp");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    public final java.lang.String g(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(str);
        if (!android.text.TextUtils.isEmpty(a17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            return a17;
        }
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || android.text.TextUtils.isEmpty(n17.f2())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
            return "";
        }
        java.lang.String f27 = n17.f2();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return f27;
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public int getLabelRange() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        int i17 = this.f166394r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLabelRange", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return i17;
    }

    public int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return com.tencent.mm.R.layout.c7r;
    }

    public int getMaxTagNameLen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return -1;
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public bw5.nk0 getSnsVisibilityData() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVisibilityData", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        bw5.nk0 nk0Var = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVisibilityData", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return nk0Var;
    }

    public void setEnablePrivate(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnablePrivate", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public void setRangeTipClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.B = onClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRangeTipClickListener", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.BaseRangeWidget
    public void setSnsRangeChangeComplexCallback(com.tencent.mm.plugin.sns.ui.y0 y0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsRangeChangeComplexCallback", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        this.E = y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsRangeChangeComplexCallback", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }

    public final java.lang.CharSequence c(android.widget.TextView textView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildPrefixSpan", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.j(context, "- " + str, textSize));
        spannableStringBuilder.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, (int) java.lang.Math.ceil(textView.getPaint().measureText("- "))), 0, spannableStringBuilder.length(), 33);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildPrefixSpan", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        return spannableStringBuilder;
    }

    public NewRangeWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166394r = 0;
        this.f166395s = null;
        this.f166396t = "";
        this.f166397u = "";
        this.f166398v = "";
        this.f166399w = new java.util.ArrayList();
        this.f166400x = new java.util.ArrayList();
        this.f166401y = new java.util.ArrayList();
        this.f166402z = new java.util.ArrayList();
        this.G = "";
        this.A = new bw5.nk0();
        this.B = null;
        f(context);
    }
}
