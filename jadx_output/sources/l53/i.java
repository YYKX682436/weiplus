package l53;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final m33.k1 f316660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f316661b;

    /* renamed from: c, reason: collision with root package name */
    public l53.a f316662c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f316663d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f316664e;

    public i(m33.k1 videoFile, int i17) {
        kotlin.jvm.internal.o.g(videoFile, "videoFile");
        this.f316660a = videoFile;
        this.f316661b = i17;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video , user cancel");
        java.lang.String str = this.f316663d;
        if (str != null) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
        }
        this.f316664e = true;
        l53.a aVar = this.f316662c;
        if (aVar != null) {
            aVar.onCancel();
        }
        this.f316662c = null;
    }

    public final void b(android.content.Context context, l53.a aVar) {
        l53.b bVar;
        l53.a aVar2;
        kotlin.jvm.internal.o.g(context, "context");
        this.f316662c = aVar;
        m33.k1 k1Var = this.f316660a;
        java.lang.String absFilePath = k1Var.f323305c;
        kotlin.jvm.internal.o.f(absFilePath, "absFilePath");
        java.util.HashMap hashMap = l53.c.f316640a;
        if (hashMap != null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(absFilePath));
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            bVar = (l53.b) hashMap.get(kk.k.a(r6Var));
        } else {
            bVar = null;
        }
        if (bVar != null) {
            java.lang.String str = bVar.f316638b;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = bVar.f316639c;
                if (!(str2 == null || str2.length() == 0)) {
                    int i17 = this.f316661b;
                    if (i17 == 1) {
                        c(context, str, str2);
                        return;
                    }
                    if (i17 == 2) {
                        d(context, str, str2);
                        return;
                    } else {
                        if (i17 == 3 && (aVar2 = this.f316662c) != null) {
                            aVar2.b(str, str2);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        java.lang.String str3 = (com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_MONTH) + "haowan/") + "vsg_thumb_" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        if (!java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x.D0(android.media.ThumbnailUtils.createVideoThumbnail(k1Var.f323305c, 1), 50, android.graphics.Bitmap.CompressFormat.JPEG, str3, true)).booleanValue()) {
            l53.a aVar3 = this.f316662c;
            if (aVar3 != null) {
                aVar3.a("thumbPic create error");
                return;
            }
            return;
        }
        java.lang.String str4 = k1Var.f323305c;
        l53.h hVar = new l53.h(this, context);
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.w2.a(k1Var.f323305c) + java.lang.System.currentTimeMillis();
        this.f316663d = str5;
        dn.m mVar = new dn.m();
        mVar.field_fileType = 20302;
        java.lang.String str6 = k1Var.f323305c;
        mVar.field_fullpath = str6;
        mVar.field_appType = 214;
        mVar.field_mediaId = str5;
        mVar.field_totalLen = com.tencent.mm.vfs.w6.k(str6);
        mVar.field_priority = 3;
        mVar.f241787f = hVar;
        mVar.f241786e = true;
        mVar.field_needStorage = true;
        mVar.field_bzScene = 2;
        mVar.field_thumbpath = str3;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    public final void c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (!(context instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            l53.a aVar = this.f316662c;
            if (aVar != null) {
                aVar.a("shareToFriend context need MMFragmentActivity");
                return;
            }
            return;
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) context;
        l53.a aVar2 = this.f316662c;
        if (aVar2 != null) {
            aVar2.c();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        hashMap.put("img_url", str2);
        m33.k1 k1Var = this.f316660a;
        java.lang.String str3 = k1Var.f323307e;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
        java.lang.String str4 = k1Var.f323308f;
        hashMap.put("desc", str4 != null ? str4 : "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 2);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("Retr_Msg_Type", 2);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(str2);
        j45.l.x(mMFragmentActivity, ".ui.transmit.SelectConversationUI", intent, 1001, new l53.f(this, str2, mMFragmentActivity, str, hashMap));
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        l53.a aVar = this.f316662c;
        if (aVar != null) {
            aVar.c();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_link", str);
        java.lang.String str3 = this.f316660a.f323307e;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("Ksnsupload_title", str3);
        intent.putExtra("Ksnsupload_imgurl", str2);
        intent.putExtra("ShareUrlOriginal", str);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 1);
        if (!(context instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            j45.l.k(context, "sns", ".ui.SnsUploadUI", intent, false);
        } else {
            ((com.tencent.mm.ui.MMFragmentActivity) context).setMMOnFragmentActivityResult(new l53.g(this, context));
            j45.l.o(context, "sns", ".ui.SnsUploadUI", intent, 1002, false);
        }
    }
}
