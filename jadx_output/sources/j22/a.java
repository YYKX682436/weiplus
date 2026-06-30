package j22;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f297249a = -1;

    public static final java.lang.String a(com.tencent.mm.plugin.emoji.model.b bVar) {
        if (bVar == null) {
            return "";
        }
        r45.kj0 kj0Var = bVar.f97537a;
        java.lang.String str = kj0Var != null ? kj0Var.f378734o : null;
        java.lang.String str2 = str != null ? str : "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return str2;
        }
        if (bVar.f97539c) {
            return com.tencent.mm.sdk.platformtools.t8.K0(kj0Var != null ? kj0Var.f378728f : null) ? "H5" : "Toptic";
        }
        return "null";
    }

    public static final void b(com.tencent.mm.plugin.emoji.model.b bVar, int i17, int i18, java.lang.String reportType) {
        r45.kj0 kj0Var;
        kotlin.jvm.internal.o.g(reportType, "reportType");
        int i19 = 0;
        if (bVar != null && (kj0Var = bVar.f97537a) != null && kj0Var.f378731i == 1) {
            i19 = 1;
        }
        java.lang.String a17 = a(bVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "emoje_store_emoji_banner");
        hashMap.put("emoje_store_tab", java.lang.Integer.valueOf(i18));
        hashMap.put("banner_type", java.lang.Integer.valueOf(i19));
        hashMap.put("bannerid", a17);
        hashMap.put("banner_index", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(reportType, com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView.f98487q, hashMap, 10, false);
    }

    public static final void c(java.lang.String actionType, java.lang.String eleId, java.lang.String eleInfo, java.lang.String pageInfo, java.lang.String pageId) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(eleId, "eleId");
        kotlin.jvm.internal.o.g(eleInfo, "eleInfo");
        kotlin.jvm.internal.o.g(pageInfo, "pageInfo");
        kotlin.jvm.internal.o.g(pageId, "pageId");
        com.tencent.mm.autogen.mmdata.rpt.EmoticonLiteAppReportInfoStruct emoticonLiteAppReportInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.EmoticonLiteAppReportInfoStruct();
        emoticonLiteAppReportInfoStruct.f56052s = emoticonLiteAppReportInfoStruct.b("action_type", actionType, true);
        emoticonLiteAppReportInfoStruct.f56050q = emoticonLiteAppReportInfoStruct.b("eleid", eleId, true);
        emoticonLiteAppReportInfoStruct.f56051r = emoticonLiteAppReportInfoStruct.b("ele_info", r26.i0.t(eleInfo, ",", ";", false), true);
        emoticonLiteAppReportInfoStruct.f56049p = emoticonLiteAppReportInfoStruct.b("page_info", r26.i0.t(pageInfo, ",", ";", false), true);
        emoticonLiteAppReportInfoStruct.f56044k = emoticonLiteAppReportInfoStruct.b("pageid", pageId, true);
        emoticonLiteAppReportInfoStruct.k();
    }

    public static final void d(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, int i17, int i18, long j17, int i19) {
        if (emojiInfo == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.DesignerEmojiStruct designerEmojiStruct = new com.tencent.mm.autogen.mmdata.rpt.DesignerEmojiStruct();
        designerEmojiStruct.f55783d = i18;
        designerEmojiStruct.f55784e = i17;
        designerEmojiStruct.f55785f = designerEmojiStruct.b("MD5Key", emojiInfo.field_md5.toString(), true);
        designerEmojiStruct.f55786g = designerEmojiStruct.b("SearchID", java.lang.String.valueOf(j17), true);
        designerEmojiStruct.f55787h = designerEmojiStruct.b("DesignerId", emojiInfo.field_designerID, true);
        designerEmojiStruct.f55788i = designerEmojiStruct.b("Pid", emojiInfo.field_groupId, true);
        designerEmojiStruct.f55789j = i19;
        designerEmojiStruct.f55790k = designerEmojiStruct.b("sessionid", java.lang.String.valueOf(f297249a), true);
        designerEmojiStruct.k();
    }

    public static final void e(r45.ri0 ri0Var, int i17, int i18, long j17, int i19) {
        if (ri0Var == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.DesignerEmojiStruct designerEmojiStruct = new com.tencent.mm.autogen.mmdata.rpt.DesignerEmojiStruct();
        designerEmojiStruct.f55783d = i18;
        designerEmojiStruct.f55784e = i17;
        designerEmojiStruct.f55785f = designerEmojiStruct.b("MD5Key", ri0Var.f384886d.toString(), true);
        designerEmojiStruct.f55786g = designerEmojiStruct.b("SearchID", java.lang.String.valueOf(j17), true);
        designerEmojiStruct.f55787h = designerEmojiStruct.b("DesignerId", ri0Var.f384889g, true);
        designerEmojiStruct.f55788i = designerEmojiStruct.b("Pid", ri0Var.f384892m, true);
        designerEmojiStruct.f55789j = i19;
        designerEmojiStruct.f55790k = designerEmojiStruct.b("sessionid", java.lang.String.valueOf(f297249a), true);
        designerEmojiStruct.k();
    }
}
