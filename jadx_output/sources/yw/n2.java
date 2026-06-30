package yw;

/* loaded from: classes9.dex */
public final class n2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f466407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizShareInfo f466408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f466409f;

    public n2(yz5.l lVar, com.tencent.pigeon.biz.BizShareInfo bizShareInfo, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f466407d = lVar;
        this.f466408e = bizShareInfo;
        this.f466409f = mMActivity;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.MMActivity mMActivity = this.f466409f;
        com.tencent.pigeon.biz.BizShareInfo bizShareInfo = this.f466408e;
        if (itemId == 1) {
            yz5.l lVar = this.f466407d;
            if (lVar != null) {
                lVar.invoke(new com.tencent.pigeon.biz.BizShareActionResult(1L, java.lang.Boolean.TRUE));
            }
            java.lang.Long shareType = bizShareInfo.getShareType();
            if (shareType != null && ((int) shareType.longValue()) == com.tencent.pigeon.biz.BizShareInfoType.TYPE_IMAGE.ordinal()) {
                yw.q2 q2Var = yw.q2.f466434a;
                if (bizShareInfo.getImgUrl() != null) {
                    q2Var.c(bizShareInfo.getImgUrl(), new yw.b2(new java.lang.ref.WeakReference(mMActivity)));
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSendImgMsgToFriend img url is null");
                    return;
                }
            }
            yw.q2 q2Var2 = yw.q2.f466434a;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", bizShareInfo.getUrl());
            hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, bizShareInfo.getTitle());
            hashMap.put("img_url", bizShareInfo.getImgUrl());
            hashMap.put("desc", bizShareInfo.getDesc());
            hashMap.put("item_show_type", bizShareInfo.getItemShowType());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 35);
            intent.putExtra("scene_from", 20);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("webview_params", hashMap);
            j45.l.w(mMActivity, ".ui.transmit.SelectConversationUI", intent, yw.q2.f466435b, new yw.d2(bizShareInfo, mMActivity));
            com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(bizShareInfo.getImgUrl());
            return;
        }
        if (menuItem.getItemId() == 2) {
            java.lang.Long shareType2 = bizShareInfo.getShareType();
            if (shareType2 != null && ((int) shareType2.longValue()) == com.tencent.pigeon.biz.BizShareInfoType.TYPE_IMAGE.ordinal()) {
                yw.q2 q2Var3 = yw.q2.f466434a;
                if (bizShareInfo.getImgUrl() != null) {
                    q2Var3.c(bizShareInfo.getImgUrl(), new yw.c2(new java.lang.ref.WeakReference(mMActivity), bizShareInfo));
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "doDownloadAndSendImgMsgToTimeline img url is null");
                    return;
                }
            }
            yw.q2 q2Var4 = yw.q2.f466434a;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_width", 640);
            intent2.putExtra("Ksnsupload_height", 640);
            intent2.putExtra("Ksnsupload_link", bizShareInfo.getUrl());
            intent2.putExtra("Ksnsupload_title", bizShareInfo.getTitle());
            intent2.putExtra("Ksnsupload_imgurl", bizShareInfo.getImgUrl());
            intent2.putExtra("ksnsupload_link_desc", bizShareInfo.getDesc());
            intent2.putExtra("Ksnsupload_source", 4);
            intent2.putExtra("Ksnsupload_type", 1);
            intent2.putExtra("sns_upload_is_show_dialog", true);
            intent2.putExtra("ShareUrlOpen", bizShareInfo.getUrl());
            intent2.putExtra("ShareUrlOriginal", bizShareInfo.getUrl());
            if (c01.e2.G(bizShareInfo.getSrcUsername())) {
                intent2.putExtra("src_username", bizShareInfo.getSrcUsername());
                intent2.putExtra("src_displayname", bizShareInfo.getDisplayUsername());
            }
            c01.l2 c17 = c01.n2.d().c(c01.n2.a(bizShareInfo.getMsgId()), true);
            java.lang.Long itemShowType = bizShareInfo.getItemShowType();
            c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", itemShowType != null ? java.lang.Integer.valueOf((int) itemShowType.longValue()) : null);
            c17.i("_tmpl_webview_transfer_scene", 10);
            j45.l.v(mMActivity, "com.tencent.mm.plugin.sns.ui.SnsUploadUI", intent2, yw.q2.f466435b);
        }
    }
}
