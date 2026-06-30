package com.tencent.mm.ui.mmec;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/mmec/NewCardPackageTipPreference;", "Lcom/tencent/mm/ui/FinderIconViewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class NewCardPackageTipPreference extends com.tencent.mm.ui.FinderIconViewTipPreference {

    /* renamed from: m3, reason: collision with root package name */
    public boolean f209149m3;

    /* renamed from: n3, reason: collision with root package name */
    public java.lang.String f209150n3;

    /* renamed from: o3, reason: collision with root package name */
    public java.lang.String f209151o3;

    /* renamed from: p3, reason: collision with root package name */
    public long f209152p3;

    /* renamed from: q3, reason: collision with root package name */
    public java.lang.ref.WeakReference f209153q3;

    public NewCardPackageTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209150n3 = "";
        this.f209151o3 = "";
    }

    public static java.util.HashMap h1(com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            jbVar = null;
        }
        if ((i18 & 2) != 0) {
            jbVar2 = null;
        }
        if ((i18 & 4) != 0) {
            str = "";
        }
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        if ((i18 & 16) != 0) {
            z17 = false;
        }
        newCardPackageTipPreference.getClass();
        r45.f03 I0 = jbVar2 != null ? jbVar2.I0("Card.Entrance.Right") : null;
        r45.f03 I02 = jbVar != null ? jbVar.I0("Card.Entrance.Left") : null;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("expose_id", ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).f16753d);
        hashMap.put("page_id", "my_page");
        hashMap.put("element_id", "order_card");
        hashMap.put("click_session_id", str);
        hashMap.put("if_red_dot", java.lang.Integer.valueOf((I02 == null && I0 == null) ? 0 : 1));
        if (I0 != null) {
            newCardPackageTipPreference.g1(hashMap, jbVar2, I0);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("card_name", ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ai().f258548d);
        jSONObject.put("is_receive_after_enter", i17);
        if (I02 != null) {
            jSONObject.put("is_left_reddot", 1);
            java.util.Map hashMap2 = new java.util.HashMap();
            newCardPackageTipPreference.g1(hashMap2, jbVar, I02);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            pm0.b0.f(hashMap2, jSONObject2);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            jSONObject.put("left_reddot_info", r26.i0.t(jSONObject3, ",", ";", false));
        }
        java.lang.String jSONObject4 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        hashMap.put("ext_info_1", r26.i0.t(jSONObject4, ",", ";", false));
        if (z17) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("font_size", j65.c.d(newCardPackageTipPreference.Y1) + 1);
            jSONObject5.put("is_teen_mode", ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() ? 1 : 0);
            jSONObject5.put("is_care_mode", j65.e.b() ? 1 : 0);
            java.lang.String jSONObject6 = jSONObject5.toString();
            kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
            hashMap.put("ext_info_2", r26.i0.t(jSONObject6, ",", ";", false));
        }
        return hashMap;
    }

    public final void g1(java.util.Map map, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        java.lang.String str;
        r45.vs2 vs2Var;
        java.lang.String str2 = jbVar != null ? jbVar.field_tips_uuid : null;
        if (str2 == null) {
            str2 = "";
        }
        map.put("reddot_id", str2);
        map.put("reddot_type", java.lang.Integer.valueOf(jbVar != null ? jbVar.getType() : 0));
        if (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null || (str = vs2Var.f388499t) == null) {
            str = "";
        }
        map.put("reddot_ext_info", str);
        java.lang.String str3 = f03Var.f373889f;
        if (str3 == null) {
            str3 = "";
        }
        map.put("reddot_show_title", str3);
        map.put("reddot_show_num", java.lang.Integer.valueOf(f03Var.f373888e));
        map.put("reddot_show_type", java.lang.Integer.valueOf(f03Var.f373887d));
        java.lang.String str4 = f03Var.f373892i;
        map.put("reddot_show_path", str4 != null ? str4 : "");
        map.put("reddot_rec_timestamp", java.lang.Long.valueOf(jbVar != null ? jbVar.field_time : 0L));
    }

    public final void i1(int i17) {
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("Card.Entrance.Left");
        r45.f03 I0 = L0 != null ? L0.I0("Card.Entrance.Left") : null;
        if (L0 != null && I0 != null) {
            ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(i17, L0, I0);
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = nk6.L0("Card.Entrance.Right");
        r45.f03 I02 = L02 != null ? L02.I0("Card.Entrance.Right") : null;
        if (L02 != null && I02 != null) {
            ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(i17, L02, I02);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[report] action=");
        sb6.append(i17);
        sb6.append(" leftShowInfo=");
        sb6.append(I0 != null);
        sb6.append(" rightShowInfo=");
        sb6.append(I02 != null);
        com.tencent.mars.xlog.Log.i("NewCardPackageTipPreference", sb6.toString());
    }

    public final void j1(com.tencent.mm.plugin.finder.extension.reddot.a aVar) {
        if (aVar.f105327a && this.f209149m3) {
            java.lang.String str = aVar.f105331e;
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0(str);
            java.lang.String str2 = L0 != null ? L0.field_tips_uuid : null;
            if (str2 == null) {
                str2 = "";
            }
            if (!(kotlin.jvm.internal.o.b(str2, this.f209150n3) || kotlin.jvm.internal.o.b(str2, this.f209151o3))) {
                r45.f03 I0 = nk6.I0(str);
                if (L0 != null && I0 != null) {
                    ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).Ai(1, L0, I0);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportRedDotExpose] path=");
                sb6.append(str);
                sb6.append(" showInfo=");
                sb6.append(I0 != null);
                com.tencent.mars.xlog.Log.i("NewCardPackageTipPreference", sb6.toString());
            }
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = aVar.f105329c;
            java.lang.String str3 = jbVar != null ? jbVar.field_tips_uuid : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            if ((kotlin.jvm.internal.o.b(str4, this.f209150n3) || kotlin.jvm.internal.o.b(str4, this.f209151o3)) || !((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri()) {
                return;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, kotlin.jvm.internal.o.b(str, "Card.Entrance.Left") ? h1(this, aVar.f105329c, null, null, 1, false, 22, null) : h1(this, null, aVar.f105329c, null, 1, false, 21, null), 12, false);
            i95.m c17 = i95.n0.c(c00.x3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c00.x3.m8((c00.x3) c17, bw5.n9.EXPOSE_WITH_REDDOT, null, 2, null);
        }
    }

    @Override // com.tencent.mm.ui.FinderIconViewTipPreference, com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.ui.base.preference.NormalIconPreference, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        yz5.l lVar;
        android.view.View u17 = super.u(viewGroup);
        u17.post(new hi5.d(this));
        f10.c Ai = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ai();
        if (Ai.f258547c && Ai.f258545a == 2) {
            com.tencent.mars.xlog.Log.i("NewCardPackageTipPreference", "[onCreateView] preloadEnvForMiniProgram...");
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.H);
        }
        boolean Ri = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ri();
        com.tencent.mars.xlog.Log.i("NewCardPackageTipPreference", "bindViewExposeReportEvent isOrderAndCardEntrance:" + Ri);
        if (Ri) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(u17, "order_card");
            aVar.Tj(u17, 32, 12, false);
            aVar.Ai(u17, new hi5.a(this));
            aVar.Vj(u17, 160, new hi5.b(this));
            aVar.rj(u17);
        }
        ym5.a1.h(u17, new hi5.e(this));
        java.lang.ref.WeakReference weakReference = this.f209153q3;
        if (weakReference != null && (lVar = (yz5.l) weakReference.get()) != null) {
            lVar.invoke(u17);
        }
        return u17;
    }

    public NewCardPackageTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f209150n3 = "";
        this.f209151o3 = "";
    }

    public NewCardPackageTipPreference(android.content.Context context) {
        super(context, null);
        this.f209150n3 = "";
        this.f209151o3 = "";
    }
}
