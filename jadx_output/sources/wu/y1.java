package wu;

/* loaded from: classes9.dex */
public final class y1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.j0 j0Var = new z01.j0();
        j0Var.f469064e = new wu.w1(item, this);
        j0Var.f469069m = item.f284997e.q();
        j0Var.f469081y = new wu.x1(this, item);
        mvvmView.setViewModel(j0Var);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        boolean z17;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.text.SimpleDateFormat simpleDateFormat = vu.a.f440046a;
        hu.f fVar = this.f449610e;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(fVar.n(), fVar.q());
        java.lang.Long p17 = fVar.p();
        s15.h hVar = item.f284997e;
        s15.g l17 = hVar.l();
        int i17 = hVar.f303422d;
        if (l17 == null) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailVideoItemConvert", "handleMpVideoItem %s/%s", l17.getBizUsername(), l17.l());
            ot0.m1 m1Var = new ot0.m1();
            m1Var.f373348p = l17.getBizUsername();
            m1Var.f373349q = l17.getBizNickname();
            m1Var.f373339d = l17.k();
            m1Var.f373340e = l17.n();
            m1Var.f373341f = l17.l();
            m1Var.f373342g = hVar.getString(i17 + 0);
            m1Var.f373343h = l17.getThumbUrl();
            m1Var.f373345m = l17.getThumbWidth();
            m1Var.f373346n = l17.getThumbHeight();
            m1Var.f373344i = l17.j();
            m1Var.f373347o = hVar.U();
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailVideoItemConvert", "[ImageGalleryUI] showImgGallery");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("show_search_chat_content_result", false);
            intent.putExtra("img_gallery_msg_id", 0);
            intent.putExtra("img_gallery_talker", l17.getBizUsername());
            intent.putExtra("img_gallery_chatroom_name", false);
            intent.putExtra("img_gallery_is_mp_video_without_msg", true);
            intent.putExtra("img_gallery_mp_video_click_from", 0);
            intent.putExtra("img_gallery_path", hVar.getString(i17 + 3));
            intent.putExtra("show_enter_grid", false);
            intent.putExtra("KOpenArticleSceneFromScene", 24);
            intent.putExtra("img_preview_only", false);
            try {
                intent.putExtra("img_gallery_mp_share_video_info", m1Var.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordDetailVideoItemConvert", "handleMpVideoItem toByteArray ex %s", e17.getMessage());
            }
            j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
            ((android.app.Activity) context).overridePendingTransition(0, 0);
            z17 = true;
        }
        if (z17) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(hVar.getString(i17 + 8));
        long j17 = msgIdTalker.f149480d;
        if (!K0 || !com.tencent.mm.sdk.platformtools.t8.K0(hVar.a0())) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("message_id", j17);
            intent2.putExtra("message_talker", msgIdTalker.a());
            intent2.putExtra("record_data_id", hVar.getString(i17 + 3));
            intent2.putExtra("key_detail_fav_video_scene_from", 1);
            q(intent2, view);
            if (com.tencent.mm.vfs.w6.j(vu.a.b(item, msgIdTalker.a(), j17, p17))) {
                r(intent2, item, context, vu.a.b(item, msgIdTalker.a(), j17, p17), vu.a.d(item, msgIdTalker.a(), j17, p17), true);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailVideoItemConvert", "RecordData.RECORD_TYPE: data not exist, go and download ");
                r(intent2, item, context, vu.a.b(item, msgIdTalker.a(), j17, p17), vu.a.d(item, msgIdTalker.a(), j17, p17), false);
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RecordDetailVideoItemConvert", "full md5[%s], fullsize[%d], start use url", hVar.getString(i17 + 10), java.lang.Long.valueOf(hVar.getLong(i17 + 11)));
        java.lang.String U = hVar.U();
        if (com.tencent.mm.sdk.platformtools.t8.K0(U)) {
            U = hVar.T();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(U)) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", U);
            intent3.putExtra("key_enable_teen_mode_check", true);
            intent3.putExtra("key_enable_fts_quick", true);
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent3, 1);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RecordDetailVideoItemConvert", "go to video[webpage] error, url null, dataid[%s]", hVar.getString(i17 + 3));
        android.content.Intent intent4 = new android.content.Intent();
        q(intent4, view);
        java.lang.String d17 = vu.a.d(item, msgIdTalker.a(), j17, p17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || !com.tencent.mm.vfs.w6.j(d17)) {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.odp));
            return;
        }
        java.lang.String b17 = vu.a.b(item, msgIdTalker.a(), j17, p17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17) || !com.tencent.mm.vfs.w6.j(b17)) {
            intent4.putExtra("key_detail_data_valid", false);
        }
        r(intent4, item, context, b17, d17, true);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView z17 = ((bf5.a) Ai).z(context);
        z17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(z17, -2, -2);
    }

    public final void q(android.content.Intent intent, android.view.View view) {
        int i17;
        int i18;
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
            i18 = view.getWidth();
            i17 = view.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        intent.putExtra("img_gallery_left", iArr[0]);
        intent.putExtra("img_gallery_top", iArr[1]);
        intent.putExtra("img_gallery_width", i18);
        intent.putExtra("img_gallery_height", i17);
    }

    public final void r(android.content.Intent intent, hu.b bVar, android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_detail_fav_path", str);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("key_detail_fav_thumb_path", str2);
        intent.putExtra("key_detail_fav_video_duration", bVar.f284997e.q());
        s15.h hVar = bVar.f284997e;
        intent.putExtra("key_detail_statExtStr", hVar.R());
        intent.putExtra("key_detail_is_data_exist", z17);
        intent.putExtra("key_detail_msg_uuid", hVar.F());
        intent.putExtra("params", this.f449610e.toJson().toString());
        intent.setClassName(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI");
        pf5.j0.a(intent, gi5.h.class);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailVideoItemConvert", "gotoVideoPlay", "(Landroid/content/Intent;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
