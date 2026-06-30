package zy2;

/* loaded from: classes8.dex */
public interface b6 extends i95.m {
    static /* synthetic */ void F1(zy2.b6 b6Var, android.app.Activity activity, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j18, android.graphics.Bitmap bitmap, android.graphics.Rect rect, int i17, long j19, java.lang.String str5, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFinderFeedItemToMultiTask");
        }
        ((c61.l7) b6Var).Di(activity, j17, str, str2, str3, str4, j18, (i18 & 128) != 0 ? null : bitmap, (i18 & 256) != 0 ? null : rect, (i18 & 512) != 0 ? 22 : i17, (i18 & 1024) != 0 ? 0L : j19, str5);
    }

    static boolean Mh(zy2.b6 b6Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, zy2.i5 i5Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkHasRealName");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        if ((i17 & 8) != 0) {
            i5Var = null;
        }
        ((c61.l7) b6Var).getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        int integer = g92.b.f269769e.k2().e().getInteger(17);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "check has realname userFlag %d", java.lang.Integer.valueOf(integer));
        if ((integer & 1) == 0) {
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 35L, 1L);
        java.lang.String string = activity.getString(com.tencent.mm.R.string.f3k);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            string = java.lang.String.valueOf(str);
        }
        java.lang.String str3 = string;
        java.lang.String string2 = activity.getString(com.tencent.mm.R.string.cno);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            string2 = java.lang.String.valueOf(str2);
        }
        com.tencent.mm.plugin.finder.assist.p1.f102448a.a(activity, string2, str3, activity.getString(com.tencent.mm.R.string.f3l), activity.getString(com.tencent.mm.R.string.f490347sg), new c61.g3(activity, i5Var), new c61.h3(i5Var), null);
        return false;
    }

    static void Pd(zy2.b6 b6Var, java.lang.String source, dm.y4 y4Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delAliasInfo");
        }
        if ((i17 & 2) != 0) {
            y4Var = null;
        }
        c61.l7 l7Var = (c61.l7) b6Var;
        l7Var.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        if (y4Var == null || (y4Var instanceof so2.i4)) {
            ((ku5.t0) ku5.t0.f312615d).q(new c61.j4(y4Var, source, l7Var));
        }
    }

    static /* synthetic */ java.lang.Object Tf(zy2.b6 b6Var, long j17, java.lang.String str, int i17, long j18, zy2.g5 g5Var, zy2.ub ubVar, java.lang.String str2, boolean z17, com.tencent.mm.pluginsdk.ui.e1 e1Var, kotlin.coroutines.Continuation continuation, int i18, java.lang.Object obj) {
        if (obj == null) {
            return ((c61.l7) b6Var).Hj(j17, str, i17, j18, (i18 & 16) != 0 ? null : g5Var, ubVar, (i18 & 64) != 0 ? "" : str2, (i18 & 128) != 0 ? true : z17, (i18 & 256) != 0 ? null : e1Var, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateFinderVideoPlayer");
    }

    static /* synthetic */ java.lang.Object Wg(zy2.b6 b6Var, java.lang.String str, long j17, int i17, kotlin.coroutines.Continuation continuation, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiFinderUserPage");
        }
        if ((i18 & 2) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        return ((c61.l7) b6Var).Ui(str, j18, i17, continuation);
    }

    static void Yg(zy2.b6 b6Var, android.app.Activity activity, long j17, java.lang.String str, java.lang.String coverUrl, java.lang.String nickName, java.lang.String headUrl, long j18, int i17, long j19, java.lang.String str2, int i18, java.lang.Object obj) {
        boolean z17;
        android.view.Window window;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFinderFeedToMultiTask");
        }
        int i19 = (i18 & 128) != 0 ? 22 : i17;
        long j27 = (i18 & 256) != 0 ? 0L : j19;
        ((c61.l7) b6Var).getClass();
        java.lang.String title = str;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(headUrl, "headUrl");
        r45.yj4 yj4Var = new r45.yj4();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            title = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cw6, nickName);
        }
        kotlin.jvm.internal.o.d(title);
        yj4Var.set(3, 0);
        java.util.LinkedList list = yj4Var.getList(1);
        if (list != null) {
            list.clear();
        }
        java.util.LinkedList list2 = yj4Var.getList(6);
        if (list2 != null) {
            list2.clear();
        }
        yj4Var.set(9, java.lang.Long.valueOf(j17));
        yj4Var.set(10, coverUrl);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        if (h17 != null) {
            java.util.LinkedList list3 = yj4Var.getList(6);
            if (list3 != null) {
                list3.add(h17.getFeedObject());
            }
            r45.hl2 client_local_buffer = h17.getFeedObject().getClient_local_buffer();
            yj4Var.set(7, java.lang.Long.valueOf(client_local_buffer != null ? client_local_buffer.getLong(0) : c01.id.c()));
            h17.getFeedObject().getUrlValidDuration();
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.megavideo.multitask.h hVar = new com.tencent.mm.plugin.finder.megavideo.multitask.h(context, new com.tencent.mm.plugin.finder.megavideo.multitask.i(activity, null, (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView()));
        hVar.y(i19, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk());
        if (j27 == 0) {
            j27 = c01.id.c();
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = hVar.f300077a;
        if (multiTaskInfo != null) {
            multiTaskInfo.field_id = str2 == null || str2.length() == 0 ? pm0.v.u(j17) : str2;
            multiTaskInfo.v0().set(1, title);
            multiTaskInfo.v0().set(5, headUrl);
            multiTaskInfo.field_data = yj4Var.toByteArray();
            z17 = false;
            multiTaskInfo.v0().set(0, nickName);
            multiTaskInfo.v0().set(3, java.lang.Integer.valueOf((int) j18));
            multiTaskInfo.field_createTime = j27;
        } else {
            z17 = false;
        }
        hVar.l(null, z17);
        int Di = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Di(pm0.v.u(j17), 22);
        com.tencent.mm.plugin.finder.report.b6 b6Var2 = com.tencent.mm.plugin.finder.report.b6.f124969a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", pm0.v.u(j17));
        jSONObject.put("feed_index", Di + 1);
        jSONObject.put("import_time", j27);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var2, null, "float_feed_import", 1, jSONObject, false, null, 48, null);
    }

    static java.lang.Object b9(zy2.b6 b6Var, android.content.Context context, r45.br2 br2Var, yz5.l lVar, java.lang.String str, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareProductToConversation");
        }
        yz5.l lVar2 = (i17 & 4) != 0 ? null : lVar;
        java.lang.String str2 = (i17 & 8) != 0 ? "" : str;
        boolean z19 = (i17 & 16) != 0 ? true : z17;
        boolean z27 = (i17 & 32) != 0 ? true : z18;
        ((c61.l7) b6Var).getClass();
        java.lang.Object z28 = com.tencent.mm.plugin.finder.assist.n7.f102406a.z(context, br2Var, lVar2, str2, z19, z27, continuation);
        return z28 == pz5.a.f359186d ? z28 : jz5.f0.f302826a;
    }

    static float h3(zy2.b6 b6Var, java.lang.String source, com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMaxMediaHWRadio");
        }
        ((c61.l7) b6Var).getClass();
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        return bu2.z.f(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0).getMediaList(), "FinderFeedFullConvert", false, 2, null);
    }

    static /* synthetic */ java.lang.Object h7(zy2.b6 b6Var, android.content.Context context, r45.zc5 zc5Var, long j17, long j18, com.tencent.mm.protobuf.g gVar, java.lang.String str, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj == null) {
            return ((c61.l7) b6Var).Ej(context, zc5Var, (i17 & 4) != 0 ? 0L : j17, (i17 & 8) != 0 ? 0L : j18, (i17 & 16) != 0 ? null : gVar, (i17 & 32) != 0 ? null : str, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finderPayFullWholeProcess");
    }

    static /* synthetic */ com.tencent.mm.modelbase.i ji(zy2.b6 b6Var, java.lang.String str, long j17, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var, int i18, long j18, boolean z17, java.lang.Integer num, java.lang.Long l17, java.lang.String str2, yz5.p pVar, yz5.p pVar2, int i19, java.lang.Object obj) {
        if (obj == null) {
            return ((c61.l7) b6Var).Vi(str, (i19 & 2) != 0 ? 0L : j17, (i19 & 4) != 0 ? null : gVar, (i19 & 8) != 0 ? 0 : i17, qt2Var, (i19 & 32) != 0 ? 0 : i18, (i19 & 64) != 0 ? 0L : j18, (i19 & 128) != 0 ? false : z17, (i19 & 256) != 0 ? 0 : num, (i19 & 512) != 0 ? 0L : l17, (i19 & 1024) != 0 ? null : str2, pVar, pVar2);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cgiNetSceneFinderUserPage");
    }
}
