package nu3;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct f340217a = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct();

    public h() {
        a();
    }

    public final void a() {
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct();
        this.f340217a = multiMediaEditInfoStruct;
        multiMediaEditInfoStruct.f59306j = multiMediaEditInfoStruct.b("isSlowMotion", "", true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct2 = this.f340217a;
        multiMediaEditInfoStruct2.f59302f = multiMediaEditInfoStruct2.b("ExtraInfo", "", true);
    }

    public final void b(java.util.List editList, boolean z17) {
        kotlin.jvm.internal.o.g(editList, "editList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it = editList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it.next()).isBeauty ? 1 : 0));
        }
        java.lang.String g07 = kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it6 = editList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(z17 ? 0 : com.tencent.mm.sdk.platformtools.t8.V1(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it6.next()).targetDuration)));
        }
        java.lang.String g08 = kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it7 = editList.iterator();
        while (it7.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(z17 ? 0 : com.tencent.mm.sdk.platformtools.t8.V1(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it7.next()).originDuration)));
        }
        java.lang.String g09 = kz5.n0.g0(arrayList3, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it8 = editList.iterator();
        while (it8.hasNext()) {
            arrayList4.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it8.next()).dragCount));
        }
        java.lang.String g010 = kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it9 = editList.iterator();
        while (it9.hasNext()) {
            arrayList5.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it9.next()).scaleCount));
        }
        java.lang.String g011 = kz5.n0.g0(arrayList5, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it10 = editList.iterator();
        while (it10.hasNext()) {
            arrayList6.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it10.next()).clickEditCount));
        }
        java.lang.String g012 = kz5.n0.g0(arrayList6, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it11 = editList.iterator();
        while (it11.hasNext()) {
            arrayList7.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it11.next()).durationCutCount));
        }
        java.lang.String g013 = kz5.n0.g0(arrayList7, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it12 = editList.iterator();
        while (it12.hasNext()) {
            arrayList8.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it12.next()).durationScrollCount));
        }
        java.lang.String g014 = kz5.n0.g0(arrayList8, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it13 = editList.iterator();
        while (true) {
            int i17 = 1;
            if (!it13.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem editItem = (com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it13.next();
            java.lang.String str = g07;
            java.util.ArrayList arrayList10 = arrayList9;
            if (editItem.targetDuration >= editItem.originDuration) {
                i17 = 0;
            }
            arrayList10.add(java.lang.Integer.valueOf(i17));
            arrayList9 = arrayList10;
            g07 = str;
        }
        java.lang.String str2 = g07;
        java.lang.String g015 = kz5.n0.g0(arrayList9, "#", null, null, 0, null, null, 62, null);
        java.util.ArrayList arrayList11 = new java.util.ArrayList(kz5.d0.q(editList, 10));
        java.util.Iterator it14 = editList.iterator();
        while (it14.hasNext()) {
            arrayList11.add(java.lang.Integer.valueOf(((com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem) it14.next()).type));
        }
        java.lang.String g016 = kz5.n0.g0(arrayList11, "#", null, null, 0, null, null, 62, null);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = this.f340217a;
        multiMediaEditInfoStruct.f59303g = multiMediaEditInfoStruct.b("isBeauty", str2, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct2 = this.f340217a;
        multiMediaEditInfoStruct2.f59304h = multiMediaEditInfoStruct2.b("targetDuration", g08, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct3 = this.f340217a;
        multiMediaEditInfoStruct3.f59305i = multiMediaEditInfoStruct3.b("originDuration", g09, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct4 = this.f340217a;
        multiMediaEditInfoStruct4.f59307k = multiMediaEditInfoStruct4.b("dragCount", g010, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct5 = this.f340217a;
        multiMediaEditInfoStruct5.f59308l = multiMediaEditInfoStruct5.b("scaleCount", g011, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct6 = this.f340217a;
        multiMediaEditInfoStruct6.f59309m = multiMediaEditInfoStruct6.b("clickEditCount", g012, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct7 = this.f340217a;
        multiMediaEditInfoStruct7.f59310n = multiMediaEditInfoStruct7.b("durationCutCount", g013, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct8 = this.f340217a;
        multiMediaEditInfoStruct8.f59311o = multiMediaEditInfoStruct8.b("durationScrollCount", g014, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct9 = this.f340217a;
        multiMediaEditInfoStruct9.f59312p = multiMediaEditInfoStruct9.b("isDurationCut", g015, true);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct10 = this.f340217a;
        multiMediaEditInfoStruct10.f59317u = multiMediaEditInfoStruct10.b("VideoType", g016, true);
        this.f340217a.D = 101L;
    }

    public final void c(boolean z17, java.util.HashMap labelMap) {
        kotlin.jvm.internal.o.g(labelMap, "labelMap");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("count", labelMap.size());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Collection<android.util.Pair> values = labelMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (android.util.Pair pair : values) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(pair.first);
            sb6.append('#');
            stringBuffer.append(sb6.toString());
        }
        jSONObject.put("labelList", stringBuffer);
        jSONObject.put("enable", z17 ? 1 : 0);
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct multiMediaEditInfoStruct = this.f340217a;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        multiMediaEditInfoStruct.A = multiMediaEditInfoStruct.b("FilterInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiMediaEditReport", "filterInfo:" + this.f340217a.A);
    }
}
