package gc4;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.n f270465a = new gc4.n();

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disableWechatCutSame", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_maas_disable_wechat_cutsame, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ThirdAppJumpHelper", "disableWechatCutSame " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disableWechatCutSame", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return z17;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        java.lang.String str3 = "";
        if ((str2 == null || str2.length() == 0) || !r26.n0.D(str2, "miaojianExtInfo", false, 2, null)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        try {
            java.lang.String optString = new cl0.g(str2).optString("miaojianExtInfo");
            if (android.text.TextUtils.isEmpty(optString)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            } else {
                cl0.g gVar = new cl0.g();
                gVar.h("APP_TYPE", "APP_TYPE_SECOND_CUP");
                gVar.h("MSG_EXT", optString);
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                str3 = gVar2;
            }
        } catch (cl0.f unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ThirdAppJumpHelper", "parse SecondCutSimpleStyle JSON error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            try {
                if (android.text.TextUtils.isEmpty(str2)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                } else {
                    java.lang.String optString2 = new cl0.g(m21.y.u(str2)).optString("miaojianExtInfo");
                    if (android.text.TextUtils.isEmpty(optString2)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                    } else {
                        cl0.g gVar3 = new cl0.g();
                        gVar3.h("APP_TYPE", "APP_TYPE_SECOND_CUP");
                        gVar3.h("MSG_EXT", optString2);
                        java.lang.String gVar4 = gVar3.toString();
                        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
                        str3 = gVar4;
                    }
                }
            } catch (cl0.f unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ThirdAppJumpHelper", "parse SecondCutSimpleStyle JSON error");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryUnescapeXml", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSecondCutJson", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpJSON", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return str3;
    }

    public final gc4.l c(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        gc4.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parsedMiaojianCutSameInfo", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            byte[] decode = android.util.Base64.decode(str, 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            m521constructorimpl = kotlin.Result.m521constructorimpl(new org.json.JSONObject(new java.lang.String(decode, r26.c.f368865a)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ThirdAppJumpHelper", m524exceptionOrNullimpl, "getJson fail", new java.lang.Object[0]);
        }
        gc4.l lVar2 = null;
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) m521constructorimpl;
        if (jSONObject != null) {
            if (jSONObject.has("templateId")) {
                java.lang.String string = jSONObject.getString("templateId");
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String optString = jSONObject.optString("musicKey", "");
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                lVar = new gc4.l(string, optString);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
                ((ez0.i) hVar).getClass();
                java.lang.String templateId = lVar.f270460a;
                kotlin.jvm.internal.o.g(templateId, "templateId");
                nz0.o.f341530a.e(templateId, 4);
                lVar2 = lVar;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ThirdAppJumpHelper", "parsedMiaojianCutSameInfo: " + lVar2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parsedMiaojianCutSameInfo", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper");
        return lVar2;
    }
}
