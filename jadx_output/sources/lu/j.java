package lu;

/* loaded from: classes9.dex */
public final class j extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        s15.c cVar;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String string;
        z05.c cVar2;
        z05.c cVar3;
        java.lang.String l17;
        z05.c cVar4;
        z05.c cVar5;
        z05.c cVar6;
        z05.c cVar7;
        z05.c cVar8;
        z05.c cVar9;
        z05.c cVar10;
        z05.c cVar11;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar12 = new l15.c();
        cVar12.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar12.k();
        int j17 = (k17 == null || (cVar11 = (z05.c) k17.getCustom(k17.f432315e + 64)) == null) ? 0 : cVar11.j();
        int i17 = recordDataItem.f303422d;
        if (j17 > 0) {
            recordDataItem.set(i17 + 2, 1);
            java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490505wz);
            kotlin.jvm.internal.o.f(g17, "getString(...)");
            recordDataItem.set(i17 + 1, g17);
        } else {
            v05.b k18 = cVar12.k();
            java.lang.String str9 = "";
            if (k18 == null || (str = k18.getString(k18.f368365d + 2)) == null) {
                str = "";
            }
            recordDataItem.set(i17 + 0, str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490589za));
            sb6.append(' ');
            v05.b k19 = cVar12.k();
            if (k19 == null || (str2 = k19.getString(k19.f368365d + 2)) == null) {
                str2 = "";
            }
            sb6.append(str2);
            recordDataItem.set(i17 + 1, sb6.toString());
            recordDataItem.set(i17 + 2, 36);
            s15.x xVar = new s15.x();
            v05.b k27 = cVar12.k();
            if (k27 == null || (cVar10 = (z05.c) k27.getCustom(k27.f432315e + 64)) == null || (str3 = cVar10.getId()) == null) {
                str3 = "";
            }
            xVar.o(str3);
            v05.b k28 = cVar12.k();
            if (k28 == null || (cVar9 = (z05.c) k28.getCustom(k28.f432315e + 64)) == null || (str4 = cVar9.getPath()) == null) {
                str4 = "";
            }
            xVar.t(str4);
            v05.b k29 = cVar12.k();
            if (k29 == null || (cVar8 = (z05.c) k29.getCustom(k29.f432315e + 64)) == null || (str5 = cVar8.p()) == null) {
                str5 = "";
            }
            xVar.u(str5);
            v05.b k37 = cVar12.k();
            xVar.w((k37 == null || (cVar7 = (z05.c) k37.getCustom(k37.f432315e + 64)) == null) ? 0 : cVar7.getSource());
            v05.b k38 = cVar12.k();
            xVar.x((k38 == null || (cVar6 = (z05.c) k38.getCustom(k38.f432315e + 64)) == null) ? 0 : cVar6.r());
            v05.b k39 = cVar12.k();
            z05.e eVar = null;
            xVar.r((k39 == null || (cVar5 = (z05.c) k39.getCustom(k39.f432315e + 64)) == null) ? null : cVar5.n());
            v05.b k47 = cVar12.k();
            xVar.p((k47 == null || (cVar4 = (z05.c) k47.getCustom(k47.f432315e + 64)) == null) ? 0 : cVar4.k());
            v05.b k48 = cVar12.k();
            if (k48 == null || (cVar3 = (z05.c) k48.getCustom(k48.f432315e + 64)) == null || (l17 = cVar3.l()) == null) {
                cVar = null;
            } else {
                cVar = new s15.c();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(l17);
                    cVar.o(jSONObject.optString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE));
                    cVar.s(jSONObject.optString("subSource"));
                    java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    kotlin.jvm.internal.o.f(optString, "optString(...)");
                    cVar.u(optString);
                    cVar.t(jSONObject.optString("thumbUrl"));
                    java.lang.String optString2 = jSONObject.optString("ratioType");
                    kotlin.jvm.internal.o.f(optString2, "optString(...)");
                    cVar.r(optString2);
                    cVar.p(jSONObject.optInt("count"));
                    cVar.q(jSONObject.optInt("duration"));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMsg.LiteAppRecordBuildXmlApi", e17.getMessage());
                    cVar = new s15.c();
                }
            }
            xVar.q(cVar);
            v05.b k49 = cVar12.k();
            if (k49 != null && (cVar2 = (z05.c) k49.getCustom(k49.f432315e + 64)) != null) {
                eVar = cVar2.o();
            }
            xVar.s(eVar);
            recordDataItem.G0(xVar);
            s15.h0 h0Var = new s15.h0();
            v05.b k57 = cVar12.k();
            if (k57 == null || (str6 = k57.getString(k57.f368365d + 2)) == null) {
                str6 = "";
            }
            h0Var.y(str6);
            v05.b k58 = cVar12.k();
            if (k58 == null || (str7 = k58.getString(k58.f368365d + 3)) == null) {
                str7 = "";
            }
            h0Var.q(str7);
            v05.b k59 = cVar12.k();
            if (k59 == null || (str8 = k59.getString(k59.f432315e + 14)) == null) {
                str8 = "";
            }
            h0Var.x(str8);
            v05.b k66 = cVar12.k();
            h0Var.s(k66 != null ? k66.getInteger(k66.f432315e + 1) : 0);
            if ((!r26.n0.N(h0Var.getTitle())) || (!r26.n0.N(h0Var.j())) || (!r26.n0.N(h0Var.o())) || h0Var.l() != 0) {
                h0Var.u(1);
            }
            recordDataItem.n1(h0Var);
            v05.b k67 = cVar12.k();
            if (k67 != null && (string = k67.getString(k67.f368365d + 9)) != null) {
                str9 = string;
            }
            recordDataItem.F0(str9);
        }
        return true;
    }
}
