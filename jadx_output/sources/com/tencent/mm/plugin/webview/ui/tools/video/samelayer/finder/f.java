package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        r45.n23 n23Var;
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo webViewVideoFinderActionHandler$EnterFinderFullScreenInfo = (com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo) obj;
        if (webViewVideoFinderActionHandler$EnterFinderFullScreenInfo != null && (n23Var = webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186981d) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "enterFinderFullScreen invoke localFeedId: %s", n23Var.getString(20));
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) n23Var.getCustom(0);
            long id6 = finderObject != null ? finderObject.getId() : -1L;
            java.lang.String string = n23Var.getString(1);
            java.lang.String str = string == null ? "" : string;
            java.lang.String string2 = n23Var.getString(2);
            java.lang.String str2 = string2 == null ? "" : string2;
            int integer = n23Var.getInteger(4);
            java.lang.String string3 = n23Var.getString(5);
            ((c61.l7) b6Var).hl(id6, str, "", str2, integer, string3 == null ? "" : string3, n23Var.getInteger(13), n23Var.getLong(11), n23Var.getLong(12), n23Var.getInteger(14), n23Var.getInteger(15), n23Var.getString(6), n23Var.getString(7), n23Var.getBoolean(21));
            cl0.g gVar = new cl0.g();
            gVar.o("playBackTime", n23Var.getInteger(16));
            gVar.r("isPause", n23Var.getBoolean(17));
            gVar.n("playbackRate", n23Var.getDouble(18));
            gVar.r("showBarrage", n23Var.getBoolean(19));
            gVar.h("feedID", n23Var.getString(20));
            gVar.h("mediaId", n23Var.getString(1));
            if (webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186982e.length() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186982e);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                kotlin.jvm.internal.o.d(keys);
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    gVar.h(next, jSONObject.opt(next));
                }
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long Z = pm0.v.Z(n23Var.getString(20));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) n23Var.getCustom(0);
            java.lang.String objectNonceId = finderObject2 != null ? finderObject2.getObjectNonceId() : null;
            if (Z == 0) {
                com.tencent.mars.xlog.Log.i("FinderRouterApi", "enterProfileForWxPay exportId empty");
            } else {
                int optInt = gVar.optInt("playBackTime");
                boolean optBoolean = gVar.optBoolean("isPause");
                double optDouble = gVar.optDouble("playbackRate");
                gVar.optBoolean("showBarrage");
                java.lang.String optString = gVar.optString("mediaId");
                int optInt2 = gVar.optInt("requestScene", 3);
                com.tencent.mars.xlog.Log.i("FinderRouterApi", "enterFeedForWxPay feedId:" + Z + " exportId:null, enterCommentScene:184");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("feed_object_id", Z);
                intent.putExtra("feed_encrypted_object_id", (java.lang.String) null);
                if (objectNonceId == null) {
                    objectNonceId = "";
                }
                intent.putExtra("feed_object_nonceId", objectNonceId);
                intent.putExtra("key_need_related_list", true);
                intent.putExtra("key_comment_scene", 184);
                intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", optInt);
                intent.putExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", true);
                intent.putExtra("KEY_VIDEO_PLAY_SPEED_RATIO", (float) optDouble);
                intent.putExtra("KEY_VIDEO_IS_PAUSE", optBoolean);
                intent.putExtra("KEY_VIDEO_MEDIA_ID", optString);
                intent.putExtra("key_reuqest_scene", optInt2);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 33, 184, intent);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).uk(context, intent, false);
            }
        }
        if (rVar != null) {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        }
    }
}
