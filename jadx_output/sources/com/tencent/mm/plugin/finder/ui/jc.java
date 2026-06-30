package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class jc {
    public jc(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, int i19) {
        java.lang.String str3;
        java.lang.String postId;
        kotlin.jvm.internal.o.g(context, "context");
        float f17 = i18 / i17;
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_long_video_max_wh_rate;
        float Di = ((h62.d) e0Var).Di(d0Var, 3.0f);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "getLongVideoMaxRatio " + Di);
        if (f17 <= Di) {
            float Di2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(d0Var, 3.0f);
            float f18 = Di2 >= 1.0f ? 1.0f / Di2 : 0.33333334f;
            com.tencent.mars.xlog.Log.i("Finder.FinderPostRouterUI", "getLongVideoMinRatio " + f18);
            if (f17 >= f18) {
                if (!com.tencent.mm.vfs.w6.j(str)) {
                    return false;
                }
                android.content.Intent intent2 = new android.content.Intent();
                if (z17 && (context instanceof android.app.Activity)) {
                    intent2.putExtras(((android.app.Activity) context).getIntent());
                }
                intent2.putExtra("post_id", str2);
                intent2.putExtra("edit_id", gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis());
                intent2.putExtra("postType", 4);
                intent2.putExtra("postMediaList", kz5.c0.d(str));
                intent2.putExtra("postTypeList", kz5.c0.d(4));
                intent2.putExtra("isLongVideoPost", true);
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                p2Var.W(p2Var.i(context, i19, false));
                if (intent != null) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nl(intent2, intent);
                    int intExtra = intent.getIntExtra("key_finder_post_sns_video_duration_ms", -1);
                    if (intExtra > 0 && intExtra < (com.tencent.mm.plugin.finder.storage.t70.f127590a.q2() + 1) * 1000) {
                        intent2.putExtra("isLongVideoPost", false);
                    }
                }
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hk(context, intent2);
                com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                java.lang.String str4 = "";
                if (finderFeedReportObject == null || (str3 = finderFeedReportObject.getClickId()) == null) {
                    str3 = "";
                }
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
                if (finderFeedReportObject2 != null && (postId = finderFeedReportObject2.getPostId()) != null) {
                    str4 = postId;
                }
                long c17 = c01.id.c() / 1000;
                com.tencent.mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct finderPostSelectPageActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct();
                finderPostSelectPageActionStruct.f57553d = finderPostSelectPageActionStruct.b("ClickId", str3, true);
                finderPostSelectPageActionStruct.f57554e = finderPostSelectPageActionStruct.b("PostId", str4, true);
                long j17 = 2;
                finderPostSelectPageActionStruct.f57555f = j17;
                finderPostSelectPageActionStruct.f57556g = c17;
                finderPostSelectPageActionStruct.f57557h = j17;
                finderPostSelectPageActionStruct.k();
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPostSelectPageActionStruct);
                return true;
            }
        }
        db5.t7.makeText(context, com.tencent.mm.R.string.evp, 0).show();
        return false;
    }
}
