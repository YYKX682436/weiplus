package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class qs implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar f170356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f170357b;

    public qs(com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar snsTimelineImgBottomBar, r45.jj4 jj4Var) {
        this.f170356a = snsTimelineImgBottomBar;
        this.f170357b = jj4Var;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            java.lang.String YuanBaoTemplateId = this.f170357b.I1;
            kotlin.jvm.internal.o.f(YuanBaoTemplateId, "YuanBaoTemplateId");
            int i17 = com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar.f167465h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar snsTimelineImgBottomBar = this.f170356a;
            snsTimelineImgBottomBar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_template_host, "https://yuanbao.tencent.com/aigi/templates", true);
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(pc4.e.f353426a.a() ? 1 : 0);
                sb6.append("");
                str = java.net.URLEncoder.encode(sb6.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoFlip", e17, "URLEncoder error", new java.lang.Object[0]);
                str = "0";
            }
            java.lang.String format = java.lang.String.format("%s?yb_template_id=%s&yb_support_live_photo=%s", java.util.Arrays.copyOf(new java.lang.Object[]{Zi, YuanBaoTemplateId, str}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTemplateFollowUrl", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            intent.putExtra("key_select_pic_from_mm_gallery_without_clear_top", true);
            j45.l.j(snsTimelineImgBottomBar.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineImgBottomBar", "no permission");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1$1");
    }
}
