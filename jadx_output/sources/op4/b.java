package op4;

/* loaded from: classes10.dex */
public final class b extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout f347265e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f347266f;

    public b(com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f347265e = pluginLayout;
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct();
        this.f347291d = multiMediaEditInfoStruct;
        multiMediaEditInfoStruct.f59306j = multiMediaEditInfoStruct.b("isSlowMotion", "", true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct2 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        if (multiMediaEditInfoStruct2 == null) {
            return;
        }
        multiMediaEditInfoStruct2.f59302f = multiMediaEditInfoStruct2.b("ExtraInfo", "", true);
    }

    @Override // op4.k
    public void d() {
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        if (multiMediaEditInfoStruct != null) {
            multiMediaEditInfoStruct.f59316t = 1L;
        }
        j();
    }

    @Override // op4.k
    public java.lang.String g() {
        return "19904";
    }

    public final void j() {
        rm5.v vVar;
        boolean z17;
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout basePluginLayout = this.f347265e;
        if (multiMediaEditInfoStruct != null) {
            bp4.e4 e4Var = (bp4.e4) basePluginLayout.j(bp4.e4.class);
            multiMediaEditInfoStruct.f59314r = (e4Var == null || (vLogThumbView = e4Var.f23160h) == null) ? 0L : vLogThumbView.getScrollCount();
        }
        lp4.u uVar = (lp4.u) basePluginLayout.j(lp4.u.class);
        if (uVar != null && (vVar = uVar.f320429h) != null) {
            com.tencent.mm.plugin.vlog.model.h1 a17 = np4.a.a(vVar);
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct2 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct2 != null) {
                gp4.j jVar = (gp4.j) basePluginLayout.j(gp4.j.class);
                multiMediaEditInfoStruct2.f59319w = multiMediaEditInfoStruct2.b("TextInfo", jVar != null ? jVar.M(a17.m(), false) : null, true);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct3 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct3 != null) {
                gp4.j jVar2 = (gp4.j) basePluginLayout.j(gp4.j.class);
                multiMediaEditInfoStruct3.f59320x = multiMediaEditInfoStruct3.b("EmojiInfo", jVar2 != null ? jVar2.L(a17.m(), false) : null, true);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct4 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct4 != null) {
                multiMediaEditInfoStruct4.f59321y = multiMediaEditInfoStruct4.b("TransitionInfo", a17.o(), true);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct5 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct5 != null) {
                multiMediaEditInfoStruct5.f59322z = multiMediaEditInfoStruct5.b("TrSpeedInfo", a17.n(), true);
            }
            java.util.ArrayList arrayList = a17.f175597c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.tencent.mm.plugin.vlog.model.i1) it.next()).f175626k);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it6.next()).isBeauty ? 1 : 0));
            }
            java.lang.String g07 = kz5.n0.g0(arrayList3, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.V1(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it7.next()).targetDuration)));
            }
            java.lang.String g08 = kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.V1(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it8.next()).originDuration)));
            }
            java.lang.String g09 = kz5.n0.g0(arrayList5, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                arrayList6.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it9.next()).dragCount));
            }
            java.lang.String g010 = kz5.n0.g0(arrayList6, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                arrayList7.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it10.next()).scaleCount));
            }
            java.lang.String g011 = kz5.n0.g0(arrayList7, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it11 = arrayList2.iterator();
            while (it11.hasNext()) {
                arrayList8.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it11.next()).clickEditCount));
            }
            java.lang.String g012 = kz5.n0.g0(arrayList8, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it12 = arrayList2.iterator();
            while (it12.hasNext()) {
                arrayList9.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it12.next()).durationCutCount));
            }
            java.lang.String g013 = kz5.n0.g0(arrayList9, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it13 = arrayList2.iterator();
            while (it13.hasNext()) {
                arrayList10.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it13.next()).durationScrollCount));
            }
            java.lang.String g014 = kz5.n0.g0(arrayList10, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList11 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it14 = arrayList2.iterator();
            while (it14.hasNext()) {
                com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem editItem = (com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it14.next();
                java.util.ArrayList arrayList12 = arrayList2;
                java.lang.String str = g08;
                arrayList11.add(java.lang.Integer.valueOf(editItem.targetDuration < editItem.originDuration ? 1 : 0));
                arrayList2 = arrayList12;
                g08 = str;
            }
            java.util.ArrayList arrayList13 = arrayList2;
            java.lang.String str2 = g08;
            java.lang.String g015 = kz5.n0.g0(arrayList11, "#", null, null, 0, null, null, 62, null);
            java.util.ArrayList arrayList14 = new java.util.ArrayList(kz5.d0.q(arrayList13, 10));
            java.util.Iterator it15 = arrayList13.iterator();
            while (it15.hasNext()) {
                arrayList14.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it15.next()).type));
            }
            java.lang.String g016 = kz5.n0.g0(arrayList14, "#", null, null, 0, null, null, 62, null);
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct6 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct6 == null) {
                z17 = true;
            } else {
                z17 = true;
                multiMediaEditInfoStruct6.f59303g = multiMediaEditInfoStruct6.b("isBeauty", g07, true);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct7 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct7 != null) {
                multiMediaEditInfoStruct7.f59304h = multiMediaEditInfoStruct7.b("targetDuration", str2, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct8 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct8 != null) {
                multiMediaEditInfoStruct8.f59305i = multiMediaEditInfoStruct8.b("originDuration", g09, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct9 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct9 != null) {
                multiMediaEditInfoStruct9.f59307k = multiMediaEditInfoStruct9.b("dragCount", g010, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct10 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct10 != null) {
                multiMediaEditInfoStruct10.f59308l = multiMediaEditInfoStruct10.b("scaleCount", g011, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct11 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct11 != null) {
                multiMediaEditInfoStruct11.f59309m = multiMediaEditInfoStruct11.b("clickEditCount", g012, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct12 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct12 != null) {
                multiMediaEditInfoStruct12.f59310n = multiMediaEditInfoStruct12.b("durationCutCount", g013, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct13 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct13 != null) {
                multiMediaEditInfoStruct13.f59311o = multiMediaEditInfoStruct13.b("durationScrollCount", g014, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct14 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct14 != null) {
                multiMediaEditInfoStruct14.f59312p = multiMediaEditInfoStruct14.b("isDurationCut", g015, z17);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct15 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct15 != null) {
                multiMediaEditInfoStruct15.f59317u = multiMediaEditInfoStruct15.b("VideoType", g016, z17);
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct16 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        if (multiMediaEditInfoStruct16 != null) {
            cp4.r rVar = (cp4.r) basePluginLayout.j(cp4.r.class);
            multiMediaEditInfoStruct16.f59318v = multiMediaEditInfoStruct16.b("CaptionInfo", rVar != null ? rVar.F() : null, true);
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct17 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        if (multiMediaEditInfoStruct17 != null) {
            multiMediaEditInfoStruct17.D = 101L;
        }
        boolean z18 = this.f347266f;
        java.util.HashMap hashMap = so4.g.f410783h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("count", hashMap.size());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Collection<android.util.Pair> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (android.util.Pair pair : values) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(pair.first);
            sb6.append('#');
            stringBuffer.append(sb6.toString());
        }
        jSONObject.put("labelList", stringBuffer);
        jSONObject.put("enable", z18 ? 1 : 0);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct18 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        if (multiMediaEditInfoStruct18 != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            multiMediaEditInfoStruct18.A = multiMediaEditInfoStruct18.b("FilterInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        }
        java.lang.String i17 = i();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("filterInfo:");
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct19 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        sb7.append(multiMediaEditInfoStruct19 != null ? multiMediaEditInfoStruct19.A : null);
        com.tencent.mars.xlog.Log.i(i17, sb7.toString());
        h();
        this.f347291d = null;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct20 = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct();
        this.f347291d = multiMediaEditInfoStruct20;
        multiMediaEditInfoStruct20.f59306j = multiMediaEditInfoStruct20.b("isSlowMotion", "", true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct21 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
        if (multiMediaEditInfoStruct21 == null) {
            return;
        }
        multiMediaEditInfoStruct21.f59302f = multiMediaEditInfoStruct21.b("ExtraInfo", "", true);
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 64) {
            if (ordinal != 144) {
                return;
            }
            this.f347266f = bundle != null ? bundle.getBoolean("PARAM_1_BOOLEAN", false) : false;
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) this.f347291d;
            if (multiMediaEditInfoStruct != null) {
                multiMediaEditInfoStruct.f59316t = 2L;
            }
            j();
        }
    }
}
