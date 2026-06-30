package f65;

/* loaded from: classes12.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f259978e;

    public t0(java.lang.String str, long j17) {
        this.f259977d = str;
        this.f259978e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        f65.y0 y0Var = f65.y0.f260019a;
        f65.s0 s0Var = f65.s0.f259974d;
        java.lang.String str2 = this.f259977d;
        com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct a17 = f65.y0.a(y0Var, f65.y0.c(y0Var, str2, s0Var));
        f65.w[] wVarArr = f65.w.f259997d;
        a17.f61623k = 2L;
        a17.f61626n = a17.b("MsgId", java.lang.String.valueOf(this.f259978e), true);
        t21.v2 h17 = t21.d3.h(str2);
        if (h17 != null) {
            java.lang.String str3 = this.f259977d;
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(h17.h(), h17.f415016n);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(h17.f())) {
                str = "getService(...)";
                a17.f61621i = com.tencent.mm.vfs.w6.k(h17.f());
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(h17.S)) {
                i95.m c17 = i95.n0.c(tg3.u0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                str = "getService(...)";
                a17.f61621i = com.tencent.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c17, k17, bm5.f0.f22571s, str3, false, 8, null));
            } else {
                str = "getService(...)";
                if (com.tencent.mm.sdk.platformtools.t8.K0(h17.h()) && h17.f415016n > 0 && k17 != null) {
                    i95.m c18 = i95.n0.c(c35.m.class);
                    kotlin.jvm.internal.o.f(c18, str);
                    a17.f61621i = com.tencent.mm.vfs.w6.k(c35.m.p8((c35.m) c18, k17, false, 2, null));
                }
            }
            i95.m c19 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c19, str);
            a17.f61622j = com.tencent.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c19, k17, bm5.f0.f22571s, str3, false, 8, null));
        }
        org.json.JSONObject jSONObject = com.tencent.mm.sdk.platformtools.t8.K0(a17.f61625m) ? new org.json.JSONObject() : new org.json.JSONObject(a17.f61625m);
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("key_multi_send_report_info").getString(str2, null);
        if (string != null) {
            t15.a aVar = new t15.a();
            aVar.fromXml(string);
            jSONObject.put("send_group_id", aVar.j());
            jSONObject.put("send_select_img_count", aVar.l());
            jSONObject.put("send_select_video_count", aVar.n());
            jSONObject.put("send_room_size", aVar.k());
            com.tencent.mm.sdk.platformtools.o4.M("key_multi_send_report_info").remove(str2);
        }
        f65.y0.b(y0Var, str2, jSONObject);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        a17.f61625m = a17.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        a17.k();
        ((q04.r) f65.y0.f260020b).Ri(19, str2);
    }
}
