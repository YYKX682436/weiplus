package tc4;

/* loaded from: classes4.dex */
public final class j3 extends tc4.k2 {
    public static final /* synthetic */ int F1 = 0;
    public android.widget.TextView A1;
    public android.widget.TextView B1;
    public final int C1;
    public boolean D1;
    public java.lang.String E1;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.ViewGroup f417383x1;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.TagImageView f417384y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.ImageView f417385z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.C1 = 2;
        this.E1 = "";
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new tc4.i3(this, null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return g17;
    }

    @Override // tc4.d2
    public com.tencent.mm.memory.ui.QPictureView getTagImgView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = this.f417384y1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return tagImageView;
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return 1;
    }

    @Override // uc4.f1, tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        uc4.g gVar;
        com.tencent.mm.plugin.sns.storage.SnsInfo c17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        java.util.Iterator it = uc4.f1.J(this).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (uc4.g) it.next();
            if (gVar instanceof uc4.y0) {
                break;
            }
        }
        if (gVar == null) {
            java.util.ArrayList<uc4.g> clickInstanceList = getClickInstanceList();
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            uc4.y0 y0Var = new uc4.y0(context);
            uc4.g.l(y0Var, this.f417383x1, false, true, false, 10, null);
            clickInstanceList.add(y0Var);
        }
        this.E1 = bVar.n().a1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSth", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        zc4.b data = getData();
        xc4.p n18 = data != null ? data.n() : null;
        zc4.b data2 = getData();
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = (data2 == null || (n17 = data2.n()) == null) ? null : n17.h1();
        if ((h17 == null || (a90Var = h17.ContentObj) == null || (linkedList = a90Var.f369840h) == null || !(linkedList.isEmpty() ^ true)) ? false : true) {
            r45.a90 a90Var2 = h17.ContentObj;
            if (a90Var2 != null && a90Var2.f369837e == 30) {
                com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
                r45.y87 y87Var = h17.weappInfo;
                k91.v5 Bi = ((k91.g4) f6Var).Bi(y87Var != null ? y87Var.f390864d : null);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.lang.String str2 = Bi != null ? Bi.field_appId : null;
                if (str2 == null) {
                    str2 = "";
                }
                cy1.a aVar = (cy1.a) rVar;
                aVar.pk(this.f417383x1, "sns_app_brand_card");
                android.view.ViewGroup viewGroup = this.f417383x1;
                jz5.l[] lVarArr = new jz5.l[6];
                lVarArr[0] = new jz5.l("card_id", h17.Id);
                lVarArr[1] = new jz5.l("card_type", "3");
                lVarArr[2] = new jz5.l("appid", str2);
                r45.y87 y87Var2 = h17.weappInfo;
                lVarArr[3] = new jz5.l("pagepath", y87Var2 != null ? y87Var2.f390865e : null);
                lVarArr[4] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "3");
                if (n18 != null && (c17 = n18.c1()) != null) {
                    str = c17.field_userName;
                }
                lVarArr[5] = new jz5.l("share_username", str);
                java.util.Map k17 = kz5.c1.k(lVarArr);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : k17.entrySet()) {
                    if (((java.lang.String) entry.getValue()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                aVar.gk(viewGroup, linkedHashMap);
                aVar.Tj(this.f417383x1, 40, 12, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSth", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        java.lang.Object h18 = super.h(s0Var, bVar, i17, z17, continuation);
        if (h18 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            zy1.e.f477325a.e(12076, "BrowseOtherFeedCount", this.E1);
            return h18;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return f0Var;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        pc4.d dVar = pc4.d.f353410a;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(dVar.x() ? com.tencent.mm.R.layout.ep_ : com.tencent.mm.R.layout.csy, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f417383x1 = viewGroup;
        this.f417384y1 = (com.tencent.mm.plugin.sns.ui.TagImageView) viewGroup.findViewById(com.tencent.mm.R.id.h9t);
        this.f417385z1 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.nh7);
        this.A1 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.m4o);
        this.B1 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.odj);
        android.view.ViewGroup viewGroup2 = this.f417383x1;
        if (viewGroup2 != null) {
            viewGroup2.setTag(com.tencent.mm.R.id.h9t, this.f417384y1);
        }
        android.view.ViewGroup viewGroup3 = this.f417383x1;
        if (viewGroup3 != null) {
            viewGroup3.setTag(com.tencent.mm.R.id.nh7, this.f417385z1);
        }
        android.view.ViewGroup viewGroup4 = this.f417383x1;
        if (viewGroup4 != null) {
            viewGroup4.setTag(com.tencent.mm.R.id.m4o, this.A1);
        }
        android.view.ViewGroup viewGroup5 = this.f417383x1;
        if (viewGroup5 != null) {
            viewGroup5.setTag(com.tencent.mm.R.id.odj, this.B1);
        }
        android.widget.TextView textView = this.B1;
        if (textView != null) {
            textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.a0c));
        }
        ca4.z0.A0(this.f417384y1, getContext());
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f10908s = 0;
        if (dVar.x()) {
            com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = this.f417384y1;
            if (tagImageView != null) {
                tagImageView.setImportantForAccessibility(2);
            }
            ca4.z0.B0(this.B1, 1.4f);
        }
        android.view.ViewGroup viewGroup6 = this.f417383x1;
        kotlin.jvm.internal.o.d(viewGroup6);
        jz5.l lVar = new jz5.l(viewGroup6, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return "OtherImproveTimelineItem";
    }
}
