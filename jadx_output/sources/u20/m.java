package u20;

/* loaded from: classes9.dex */
public final class m extends u20.c {

    /* renamed from: d, reason: collision with root package name */
    public final u20.j f423908d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f423909e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f423910f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(org.json.JSONObject jSONObject, org.json.JSONObject params, java.util.List list, com.tencent.mm.feature.ecs.share.t callback) {
        super(list, callback);
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(callback, "callback");
        u20.j jVar = new u20.j();
        org.json.JSONObject optJSONObject = params.optJSONObject("productParams");
        if (optJSONObject == null) {
            jVar = null;
        } else {
            jVar.f423885a = jSONObject != null ? jSONObject.optString("sourceAppID") : null;
            jVar.f423886b = optJSONObject.optString("finderUsername");
            jVar.f423887c = optJSONObject.optString("entranceGMsgId");
            jVar.f423888d = optJSONObject.optString("passBuffer");
            jVar.f423889e = optJSONObject.optString("productId");
            jVar.f423890f = optJSONObject.optLong("cpsProductId");
            jVar.f423891g = optJSONObject.optString("realProductId");
            jVar.f423892h = optJSONObject.optString("ecSource");
            jVar.f423893i = optJSONObject.optString("promoterkey");
            jVar.f423894j = optJSONObject.optString("finderLiveToken");
            jVar.f423895k = params.optBoolean("showLoading", true);
        }
        if (jVar == null) {
            ((t00.m2) callback).a("model is null");
        }
        this.f423908d = jVar;
        this.f423909e = params.optString("bizReportData");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(u20.m r4, bw5.qe0 r5, r45.zc4 r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof u20.k
            if (r0 == 0) goto L16
            r0 = r7
            u20.k r0 = (u20.k) r0
            int r1 = r0.f423899g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f423899g = r1
            goto L1b
        L16:
            u20.k r0 = new u20.k
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f423897e
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f423899g
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r5 = r0.f423896d
            r6 = r5
            r45.zc4 r6 = (r45.zc4) r6
            kotlin.ResultKt.throwOnFailure(r4)
            goto L4d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.throwOnFailure(r4)
            r0.f423896d = r6
            r0.f423899g = r2
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310570c
            e00.k r1 = new e00.k
            r3 = 0
            r1.<init>(r5, r2, r3)
            java.lang.Object r4 = kotlinx.coroutines.l.g(r4, r1, r0)
            if (r4 != r7) goto L4d
            goto L5b
        L4d:
            bw5.u8 r4 = (bw5.u8) r4
            r45.br2 r7 = e00.l.g(r4)
            r4 = 6
            java.lang.String r4 = r6.getString(r4)
            r7.set(r2, r4)
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u20.m.e(u20.m, bw5.qe0, r45.zc4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // u20.c
    public void c(boolean z17) {
        java.lang.String str = this.f423909e;
        if (str == null) {
            str = "";
        }
        if (r26.i0.y(str, "\"", false) && r26.i0.n(str, "\"", false) && str.length() > 2) {
            str = str.substring(1, str.length() - 1);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        u20.j jVar = this.f423908d;
        lVarArr[0] = new jz5.l("card_id", jVar != null ? jVar.f423889e : null);
        lVarArr[1] = new jz5.l("biz_report_data", str);
        lVarArr[2] = new jz5.l("share_scene", z17 ? "2" : "1");
        lVarArr[3] = new jz5.l("report_data", this.f423910f);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : k17.entrySet()) {
            if (((java.lang.String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ((cy1.a) rVar).Bj("ecs_share_wxec_action", "ecs_event_succ", linkedHashMap, 12, false);
    }
}
