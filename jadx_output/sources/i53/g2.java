package i53;

/* loaded from: classes8.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameRecommendVideoFragment f288580d;

    public g2(com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment) {
        this.f288580d = gameRecommendVideoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.GameRecommendVideoFragment gameRecommendVideoFragment = this.f288580d;
        p33.e0 videoAlbumItem = gameRecommendVideoFragment.f140062d;
        androidx.fragment.app.FragmentActivity activity = gameRecommendVideoFragment.getActivity();
        kotlin.jvm.internal.o.g(videoAlbumItem, "videoAlbumItem");
        if (activity != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("createTimeSec", videoAlbumItem.f351538e);
            p33.f0 f0Var = videoAlbumItem.f351540g;
            if (f0Var != null) {
                jSONObject.put("duration", f0Var.f351565i);
                jSONObject.put("subTitle", f0Var.f351567n);
                jSONObject.put("thumbUrl", f0Var.f351561e);
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, f0Var.f351564h);
                jSONObject.put("videoUrl", f0Var.f351560d);
                p33.j jVar = videoAlbumItem.f351542i;
                jSONObject.put("transInfo", jVar != null ? jVar.f351598e : null);
            }
            android.content.Intent intent = new android.content.Intent();
            p33.k kVar = videoAlbumItem.f351539f;
            intent.putExtra("key_game_video_appid", kVar != null ? kVar.f351599d : null);
            p33.k kVar2 = videoAlbumItem.f351539f;
            intent.putExtra("key_game_video_appname", kVar2 != null ? kVar2.f351600e : null);
            intent.putExtra("key_game_video_page_type", 2);
            p33.j jVar2 = videoAlbumItem.f351542i;
            intent.putExtra("key_game_trans_info", jVar2 != null ? jVar2.f351598e : null);
            intent.putExtra("key_game_video_encode_json_array", true);
            cl0.e eVar = new cl0.e();
            eVar.q(jSONObject);
            intent.putExtra("key_video_info", eVar.toString());
            activity.setResult(-1, intent);
            activity.finish();
        }
        gameRecommendVideoFragment.j0(true, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
