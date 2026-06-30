package hc2;

/* loaded from: classes10.dex */
public abstract class p0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final byte[] a(r45.mb4 mb4Var, int i17) {
        fo3.i iVar;
        fo3.h hVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(mb4Var, "<this>");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (mb4Var.getInteger(2) == 4) {
                java.lang.String string = !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(16)) ? mb4Var.getString(16) : !com.tencent.mm.sdk.platformtools.t8.K0(mb4Var.getString(41)) ? mb4Var.getString(41) : mb4Var.getString(25);
                hVar = new fo3.h(string, null, string);
                iVar = new fo3.i(mb4Var.getString(0), mb4Var.getInteger(3), mb4Var.getString(48), i17);
            } else if (mb4Var.getInteger(2) == 2) {
                hVar = new fo3.h(mb4Var.getString(0), null, mb4Var.getString(48));
                iVar = null;
            } else {
                iVar = null;
                hVar = null;
            }
            byte[] s86 = fo3.s.INSTANCE.s8(hVar, iVar);
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateSecClientMediaFeature time:");
                sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
                sb6.append(" size:");
                sb6.append(s86 != 0 ? java.lang.Integer.valueOf(s86.length) : null);
                sb6.append(" type:");
                sb6.append(mb4Var.getInteger(2));
                sb6.append(" duration:");
                sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.f264907b) : null);
                sb6.append(" url:");
                java.lang.String str2 = "";
                if (iVar != null) {
                    str = iVar.f264906a;
                    if (android.text.TextUtils.isEmpty(str)) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                sb6.append(str);
                sb6.append(" url:");
                if (hVar != null) {
                    java.lang.String str3 = hVar.f264904a;
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                } else {
                    str2 = null;
                }
                sb6.append(str2);
                sb6.append(" origin:");
                sb6.append(mb4Var.getString(48));
                sb6.append(" watermarkFlag:");
                sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.f264909d) : null);
                com.tencent.mars.xlog.Log.i("LogPost", sb6.toString());
                return s86;
            } catch (java.lang.Throwable th6) {
                th = th6;
                r3 = s86;
                com.tencent.mars.xlog.Log.w("LogPost", "calculateSecClientMediaFeature time e:" + th);
                return r3;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static final void b(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, java.lang.String prefix) {
        kotlin.jvm.internal.o.g(finderFeedReportObject, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        com.tencent.mars.xlog.Log.i("LogPost.FinderFeedReportObject", prefix + " remux:" + finderFeedReportObject.getMediaProcessCost() + ",upload:" + finderFeedReportObject.getUploadCost() + ",uploadSize:" + (finderFeedReportObject.getUploadMediaTotalSize() / 1024) + "KB,taskTotal:" + finderFeedReportObject.getPostTaskCost() + ",repost:" + finderFeedReportObject.getClickRepostCount());
    }

    public static final void c(android.view.View view, java.lang.String viewId, java.lang.String eventId, java.util.Map map) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            jz5.l[] lVarArr = new jz5.l[2];
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
            if (finderFeedReportObject == null || (str = finderFeedReportObject.getSessionId()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("finder_post_sessionid", str);
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
            lVarArr[1] = new jz5.l("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject2 != null ? finderFeedReportObject2.getEnterScene() : 0));
            java.util.Map l17 = kz5.c1.l(lVarArr);
            if (map != null) {
                l17.putAll(map);
            }
            hc2.v0.d(view, viewId, eventId, false, l17, null, 20, null);
        }
    }

    public static /* synthetic */ void d(android.view.View view, java.lang.String str, java.lang.String str2, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = "";
        }
        if ((i17 & 2) != 0) {
            str2 = "view_exp";
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        c(view, str, str2, map);
    }
}
