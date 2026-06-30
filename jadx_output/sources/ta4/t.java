package ta4;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f416830a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f416831b;

    /* renamed from: c, reason: collision with root package name */
    public r45.e86 f416832c;

    /* renamed from: d, reason: collision with root package name */
    public int f416833d;

    /* renamed from: e, reason: collision with root package name */
    public ta4.s f416834e = ta4.s.f416818e;

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLogId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLogId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        return 36244;
    }

    public final void b(r45.e86 e86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComment", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        this.f416832c = e86Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComment", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
    }

    public final void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        this.f416831b = snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
    }

    public final void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsScene", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        this.f416830a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsScene", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
    }

    public final java.util.Map e() {
        java.lang.String snsAlbumSessionId;
        java.lang.String valueOf;
        java.util.LinkedList linkedList;
        r45.d86 d86Var;
        java.util.LinkedList linkedList2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toDictionary", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f416831b;
        linkedHashMap.put("sns_feed_id", snsInfo != null ? ca4.z0.t0(snsInfo.field_snsId) : null);
        int i17 = this.f416830a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        if (i17 == ta4.z0.f416869f.h()) {
            snsAlbumSessionId = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            kotlin.jvm.internal.o.f(snsAlbumSessionId, "requestSessionId(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        } else {
            java.lang.String snsAlbumSessionId2 = ca4.z0.f40071d;
            kotlin.jvm.internal.o.f(snsAlbumSessionId2, "snsAlbumSessionId");
            if (snsAlbumSessionId2.length() > 0) {
                snsAlbumSessionId = ca4.z0.f40071d;
                kotlin.jvm.internal.o.f(snsAlbumSessionId, "snsAlbumSessionId");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            } else {
                snsAlbumSessionId = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
                kotlin.jvm.internal.o.f(snsAlbumSessionId, "requestSessionId(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            }
        }
        linkedHashMap.put("sessionid_sns", snsAlbumSessionId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommitId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f416831b;
        if (snsInfo2 == null || !snsInfo2.isAd()) {
            r45.e86 e86Var = this.f416832c;
            valueOf = java.lang.String.valueOf(e86Var != null ? java.lang.Integer.valueOf(e86Var.f373132m) : null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommitId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        } else {
            r45.e86 e86Var2 = this.f416832c;
            valueOf = java.lang.String.valueOf(e86Var2 != null ? java.lang.Long.valueOf(e86Var2.f373137r) : null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommitId", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        }
        linkedHashMap.put("sns_cmt_id", valueOf);
        r45.e86 e86Var3 = this.f416832c;
        if (e86Var3 != null) {
            java.lang.Integer valueOf2 = (e86Var3 == null || (linkedList2 = e86Var3.A) == null) ? null : java.lang.Integer.valueOf(linkedList2.size());
            kotlin.jvm.internal.o.d(valueOf2);
            if (valueOf2.intValue() > 0) {
                r45.e86 e86Var4 = this.f416832c;
                linkedHashMap.put("pic_md5", (e86Var4 == null || (linkedList = e86Var4.A) == null || (d86Var = (r45.d86) kz5.n0.X(linkedList)) == null) ? null : d86Var.f372240u);
            }
        }
        linkedHashMap.put("sns_scene", java.lang.Integer.valueOf(this.f416830a));
        int i18 = this.f416833d;
        if ((i18 > 0 ? linkedHashMap : null) != null) {
            linkedHashMap.put("cmt_pic_cnt", java.lang.Integer.valueOf(i18));
        }
        ta4.s sVar = this.f416834e;
        if ((sVar != ta4.s.f416818e ? linkedHashMap : null) != null) {
            sVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
            linkedHashMap.put("pic_exp_type", java.lang.Integer.valueOf(sVar.f416823d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toDictionary", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        return linkedHashMap;
    }
}
