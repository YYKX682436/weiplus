package zj4;

/* loaded from: classes11.dex */
public final class c implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zj4.e f473340a;

    public c(zj4.e eVar) {
        this.f473340a = eVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        boolean b17 = kotlin.jvm.internal.o.b(str, "view_exp");
        zj4.e eVar = this.f473340a;
        if (b17) {
            eVar.getClass();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            bi4.d1 P6 = eVar.P6();
            kz5.q0 q0Var = kz5.q0.f314001d;
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str3 = P6 != null ? P6.G : null;
            if (str3 == null) {
                str3 = "";
            }
            lVarArr[0] = new jz5.l("status_clipostid", str3);
            java.lang.String str4 = P6 != null ? P6.f354941h : null;
            if (str4 == null) {
                str4 = "";
            }
            lVarArr[1] = new jz5.l("status_sessionid", str4);
            ((cy1.a) rVar).Hj("fill_in_status_word_button", "view_clk", kz5.c1.m(kz5.c1.k(lVarArr), q0Var), 33629);
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            bi4.d1 P62 = eVar.P6();
            jz5.l[] lVarArr2 = new jz5.l[2];
            java.lang.String str5 = P62 != null ? P62.G : null;
            if (str5 == null) {
                str5 = "";
            }
            lVarArr2[0] = new jz5.l("status_clipostid", str5);
            java.lang.String str6 = P62 != null ? P62.f354941h : null;
            lVarArr2[1] = new jz5.l("status_sessionid", str6 != null ? str6 : "");
            ((cy1.a) rVar2).Gj(50145, "page_in", kz5.c1.m(kz5.c1.k(lVarArr2), q0Var), 33629);
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "view_unexp")) {
            eVar.getClass();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            qj4.h hVar = eVar.f473346h;
            hVar.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("clk_custom_icon_pv", hVar.f363911a);
            jSONObject.put("clk_fill_in_status_pv", hVar.f363915e.size());
            jSONObject.put("clk_cancel_pv", hVar.f363912b);
            jSONObject.put("clk_finish_pv", hVar.f363913c);
            try {
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                str2 = r26.i0.t(jSONObject2, ",", ";", false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(hVar.f363916f, e17, "json error", new java.lang.Object[0]);
                str2 = "";
            }
            linkedHashMap.put("customstatuspage_opt_cnt", str2);
            linkedHashMap.put("custom_icon_list", kz5.n0.g0(eVar.f473346h.f363914d, "##", null, null, 0, null, null, 62, null));
            linkedHashMap.put("custom_word_list", kz5.n0.g0(eVar.f473346h.f363915e, "##", null, null, 0, null, null, 62, null));
            dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar2 = iy1.c.MainUI;
            bi4.d1 P63 = eVar.P6();
            jz5.l[] lVarArr3 = new jz5.l[2];
            java.lang.String str7 = P63 != null ? P63.G : null;
            if (str7 == null) {
                str7 = "";
            }
            lVarArr3[0] = new jz5.l("status_clipostid", str7);
            java.lang.String str8 = P63 != null ? P63.f354941h : null;
            lVarArr3[1] = new jz5.l("status_sessionid", str8 != null ? str8 : "");
            ((cy1.a) rVar3).Gj(50145, "page_out", kz5.c1.m(kz5.c1.k(lVarArr3), linkedHashMap), 33629);
            eVar.f473346h = new qj4.h(0, 0, 0, null, null, 31, null);
        }
    }
}
