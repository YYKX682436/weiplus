package u20;

/* loaded from: classes9.dex */
public final class y extends u20.c {

    /* renamed from: d, reason: collision with root package name */
    public final u20.q f423953d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f423954e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f423955f;

    /* renamed from: g, reason: collision with root package name */
    public final n13.x f423956g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.da f423957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(org.json.JSONObject jSONObject, org.json.JSONObject params, java.util.List list, com.tencent.mm.feature.ecs.share.t callback) {
        super(list, callback);
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(callback, "callback");
        u20.q qVar = new u20.q();
        org.json.JSONObject optJSONObject = params.optJSONObject("shareWAAppParams");
        if (optJSONObject == null) {
            qVar = null;
        } else {
            java.lang.String optString = jSONObject != null ? jSONObject.optString("sourceAppID") : null;
            qVar.f423919a = optString == null ? "" : optString;
            if (jSONObject != null) {
                jSONObject.optString("sourceAppName");
            }
            java.lang.String optString2 = jSONObject != null ? jSONObject.optString("sourceUsername") : null;
            qVar.f423920b = optString2 == null ? "" : optString2;
            qVar.f423921c = jSONObject != null ? jSONObject.optInt("sourceVersion") : 0;
            java.lang.String optString3 = jSONObject != null ? jSONObject.optString("sourceBrandIconUrl") : null;
            qVar.f423922d = optString3 == null ? "" : optString3;
            java.lang.String optString4 = jSONObject != null ? jSONObject.optString("sourceMD5") : null;
            qVar.f423923e = optString4 != null ? optString4 : "";
            qVar.f423924f = jSONObject != null ? jSONObject.optInt("sourcePkgType") : 0;
            qVar.f423925g = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            qVar.f423926h = optJSONObject.optString("desc");
            qVar.f423927i = optJSONObject.optString("imageUrl");
            qVar.f423928j = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            qVar.f423929k = optJSONObject.optInt("disableForward");
            qVar.f423930l = optJSONObject.optInt("bizType");
            qVar.f423931m = optJSONObject.optString("bizSourceName");
            qVar.f423932n = optJSONObject.optString("bizSourceIconUrl");
            int optInt = optJSONObject.optInt("cardType");
            if (optInt > 0) {
                w05.h hVar = new w05.h();
                hVar.H(optInt);
                hVar.I(optJSONObject.optInt("cardVersion", 0));
                java.lang.String optString5 = optJSONObject.optString("passBuffer");
                kotlin.jvm.internal.o.f(optString5, "optString(...)");
                hVar.R(optString5);
                hVar.L(optJSONObject.optInt("fetchAndPreloadFlags", 0));
                java.lang.String optString6 = optJSONObject.optString("reportData");
                kotlin.jvm.internal.o.f(optString6, "optString(...)");
                hVar.F(optString6);
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("cardInfo");
                if (optJSONObject2 != null) {
                    java.lang.String optString7 = optJSONObject2.optString("real_appid");
                    kotlin.jvm.internal.o.f(optString7, "optString(...)");
                    hVar.S(optString7);
                    hVar.E(optJSONObject2.optLong(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, 0L));
                    hVar.G(optJSONObject2.optLong("bulk_id", 0L));
                    if (optInt == 9) {
                        java.lang.String optString8 = optJSONObject2.optString("friendReceiveTitle");
                        kotlin.jvm.internal.o.f(optString8, "optString(...)");
                        hVar.Q(optString8);
                        java.lang.String optString9 = optJSONObject2.optString("friendReceiveDesc");
                        kotlin.jvm.internal.o.f(optString9, "optString(...)");
                        hVar.N(optString9);
                        java.lang.String optString10 = optJSONObject2.optString("friendReceiveSourceName");
                        kotlin.jvm.internal.o.f(optString10, "optString(...)");
                        hVar.P(optString10);
                        java.lang.String optString11 = optJSONObject2.optString("friendReceiveImageUrl");
                        kotlin.jvm.internal.o.f(optString11, "optString(...)");
                        hVar.O(optString11);
                    }
                }
                qVar.f423933o = hVar;
            }
        }
        if (qVar == null) {
            ((t00.m2) callback).a("Failed to init model");
        }
        this.f423953d = qVar;
        this.f423954e = params.optString("bizReportData");
        this.f423955f = new java.util.ArrayList();
        this.f423956g = new u20.w(this);
        this.f423957h = new u20.s(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(u20.y r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u20.y.e(u20.y, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // u20.c
    public void c(boolean z17) {
        w05.h hVar;
        java.lang.String str = this.f423954e;
        if (str == null) {
            str = "";
        }
        if (r26.i0.y(str, "\"", false) && r26.i0.n(str, "\"", false) && str.length() > 2) {
            str = str.substring(1, str.length() - 1);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        u20.q qVar = this.f423953d;
        java.lang.String y17 = (qVar == null || (hVar = qVar.f423933o) == null) ? null : hVar.y();
        if (y17 == null) {
            y17 = "";
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("card_id", y17);
        lVarArr[1] = new jz5.l("biz_report_data", str);
        lVarArr[2] = new jz5.l("share_scene", z17 ? "2" : "1");
        lVarArr[3] = new jz5.l("report_data", "");
        ((cy1.a) rVar).Bj("ecs_share_wxec_action", "ecs_event_succ", kz5.c1.k(lVarArr), 12, false);
    }

    public final void f(android.content.Context context) {
        u20.q qVar = this.f423953d;
        if (qVar == null) {
            return;
        }
        w05.h hVar = qVar.f423933o;
        int r17 = hVar != null ? hVar.r() : 0;
        boolean z17 = ((r17 & 1) == 0 && (r17 & 2) == 0) ? false : true;
        if (hVar == null || !z17 || hVar.B()) {
            if (this.f423953d == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new u20.t(this, context));
            return;
        }
        c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
        java.lang.String str = qVar.f423928j;
        if (str == null) {
            str = "";
        }
        u20.x xVar = new u20.x(hVar, this, context);
        b00.r rVar = (b00.r) z2Var;
        rVar.getClass();
        e00.y yVar = new e00.y(str, hVar, 8);
        yVar.f245833d = new b00.p(yVar, rVar, xVar);
        rVar.Bi(yVar);
    }
}
