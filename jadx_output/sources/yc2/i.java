package yc2;

/* loaded from: classes2.dex */
public final class i implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f460832a;

    public i(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f460832a = activity;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (kotlin.jvm.internal.o.b(str, "finderAuthorRecommendMusicLikeAction")) {
            if (obj instanceof org.json.JSONObject) {
                try {
                    com.tencent.mars.xlog.Log.i("FinderMusicOrAudioLiteAppStoreCallback", "[finderAuthorRecommendMusicLikeAction] data:" + obj);
                    bw5.g80 g80Var = new bw5.g80();
                    boolean[] zArr = g80Var.f27740x;
                    g80Var.f27723d = ((org.json.JSONObject) obj).optString("listen_id");
                    zArr[2] = true;
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    g80Var.f27733q = 1604;
                    zArr[12] = true;
                    g80Var.f27725f = ((org.json.JSONObject) obj).optInt("like_state") == 0;
                    zArr[3] = true;
                    g80Var.f27727h = 2;
                    zArr[6] = true;
                    g80Var.f27732p = 3;
                    zArr[11] = true;
                    g80Var.f27726g = false;
                    zArr[5] = true;
                    ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Di(new qk.aa(this.f460832a, g80Var, true, null, yc2.h.f460831d, 8, null), null);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("FinderMusicOrAudioLiteAppStoreCallback", java.lang.String.valueOf(e17.getMessage()));
                }
            }
        } else if (kotlin.jvm.internal.o.b(str, "finderAudioListenLaterAction") && (obj instanceof org.json.JSONObject)) {
            try {
                com.tencent.mars.xlog.Log.i("FinderMusicOrAudioLiteAppStoreCallback", "[finderAudioListenLaterAction] data:" + obj);
                bw5.v70 v70Var = new bw5.v70();
                v70Var.u(((org.json.JSONObject) obj).optString("listen_id"));
                v70Var.y(((org.json.JSONObject) obj).optInt("type"));
                v70Var.x(((org.json.JSONObject) obj).optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
                v70Var.p(((org.json.JSONObject) obj).optString("author"));
                v70Var.q(((org.json.JSONObject) obj).optString("cover"));
                v70Var.r(((org.json.JSONObject) obj).optInt("duration"));
                bw5.e70 e70Var = new bw5.e70();
                boolean[] zArr2 = e70Var.E;
                e70Var.f26760f = v70Var.getTitle();
                zArr2[3] = true;
                e70Var.d(((org.json.JSONObject) obj).optString("nonce_id"));
                e70Var.e(((org.json.JSONObject) obj).optString("tid"));
                e70Var.f26761g = v70Var.c();
                zArr2[4] = true;
                e70Var.f26763i = v70Var.f34203v;
                zArr2[6] = true;
                e70Var.f26762h = v70Var.f();
                zArr2[5] = true;
                e70Var.f26766o = true;
                zArr2[9] = true;
                v70Var.s(e70Var);
                bw5.ar0 ar0Var2 = bw5.ar0.TingScene_FinderFeed;
                i95.m c17 = i95.n0.c(qk.a8.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                qk.a8.E8((qk.a8) c17, this.f460832a, ar0Var2, v70Var, null, 0, 0, null, null, null, com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX, null);
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("FinderMusicOrAudioLiteAppStoreCallback", java.lang.String.valueOf(e18.getMessage()));
            }
        }
        return true;
    }
}
