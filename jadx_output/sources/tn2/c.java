package tn2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn2.d f420821d;

    public c(tn2.d dVar) {
        this.f420821d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        byte[] byteArray;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/floatball/FinderMegaVideoMiniViewHelper$generateWindowClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_OPEN_FROM_VIDEO_FLOAT_BALL", true);
        tn2.d dVar = this.f420821d;
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", (dVar.k0().isVideoEnd || (videoView = dVar.k0().getVideoView()) == null) ? 0L : videoView.getCurrentPlayMs());
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView2 = dVar.k0().getVideoView();
        intent.putExtra("KEY_VIDEO_PLAY_SPEED_RATIO", videoView2 != null ? videoView2.getPlaySpeedRatio() : 1.0f);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = dVar.f93132d;
        synchronized (ballInfo) {
            byteArray = ballInfo.i("KEY_VIDEO_FLOAT_BALL_INFO") ? ballInfo.G.getByteArray("KEY_VIDEO_FLOAT_BALL_INFO") : null;
        }
        r45.yj4 yj4Var = new r45.yj4();
        try {
            yj4Var.parseFrom(byteArray);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderMegaVideoMiniViewHelper", "handleBallInfoClicked", th6);
        }
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = yj4Var.getList(6);
        kotlin.jvm.internal.o.f(list, "getCacheNewVideoList(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(h90Var.a(finderObject, 1));
            p17.t1(true);
            arrayList2.add(p17);
        }
        hc2.e0.b(intent, yj4Var.getInteger(2), arrayList2, yj4Var.getByteString(4), null);
        intent.putExtra("KEY_ROUTER_UI", yj4Var.getInteger(5));
        intent.putExtra("KEY_VIDEO_FLOAT_BALL_INFO", yj4Var.toByteArray());
        intent.putExtra("KEY_FLOAT_BALL_TASK_ORDER", dVar.f93132d.f("KEY_FLOAT_BALL_TASK_ORDER", 0));
        intent.putExtra("KEY_FLOAT_BALL_MINI_SESSION_ID", dVar.f93132d.g("KEY_FLOAT_BALL_MINI_SESSION_ID", ""));
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(8, 6, 45, intent);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.assist.i0.Ak((com.tencent.mm.plugin.finder.assist.i0) c17, context, intent, true, false, 8, null);
        java.lang.String g17 = dVar.f93132d.g("KEY_FLOAT_BALL_MINI_SESSION_ID", "");
        com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
        kotlin.jvm.internal.o.d(g17);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(arrayList2);
        java.lang.String u17 = pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L);
        com.tencent.mm.autogen.mmdata.rpt.MegaVideoPopupActionStruct megaVideoPopupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.MegaVideoPopupActionStruct();
        megaVideoPopupActionStruct.f59157d = 1;
        megaVideoPopupActionStruct.f59158e = 1L;
        megaVideoPopupActionStruct.f59159f = megaVideoPopupActionStruct.b("MiniSessionId", g17, true);
        megaVideoPopupActionStruct.f59160g = 0;
        megaVideoPopupActionStruct.f59161h = megaVideoPopupActionStruct.b("LongVideoId", u17, true);
        megaVideoPopupActionStruct.f59162i = megaVideoPopupActionStruct.b("sessionid", "", true);
        megaVideoPopupActionStruct.f59163j = megaVideoPopupActionStruct.b("contextid", Bj, true);
        megaVideoPopupActionStruct.f59164k = megaVideoPopupActionStruct.b("ClickTabContextId", "", true);
        megaVideoPopupActionStruct.f59165l = 1L;
        megaVideoPopupActionStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(megaVideoPopupActionStruct);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/floatball/FinderMegaVideoMiniViewHelper$generateWindowClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
