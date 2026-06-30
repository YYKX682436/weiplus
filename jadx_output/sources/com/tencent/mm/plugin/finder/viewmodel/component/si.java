package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class si implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135904a;

    public si(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135904a = blVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.q23 video_tmpl_info;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135904a;
        android.widget.FrameLayout a76 = blVar.a7();
        kotlin.jvm.internal.o.f(a76, "access$getPostEntranceLayout(...)");
        blVar.getClass();
        android.content.Context context = a76.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(blVar.getActivity());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Lj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Lj : null;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        android.app.Activity context2 = blVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(itemId, baseFinderFeed != null ? baseFinderFeed.w() : null, integer);
        java.lang.String Z6 = blVar.Z6(itemId, baseFinderFeed != null ? baseFinderFeed.w() : null);
        org.json.JSONObject jSONObject = Z6 != null ? new org.json.JSONObject(Z6) : null;
        java.util.Map l17 = kz5.c1.l(new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("behaviour_session_id", V6.getString(0)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("extra_info", V6.getString(11)), new jz5.l("enter_source_info", V6.getString(12)), new jz5.l("source_feedid", pm0.v.u(itemId)), new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(integer)), new jz5.l("source_feed_sessionbuffer", ek6));
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (objectDesc = feedObject2.getObjectDesc()) != null && (video_tmpl_info = objectDesc.getVideo_tmpl_info()) != null) {
            l17.put("templateid", video_tmpl_info.f383585d);
            l17.put("template_type", java.lang.Integer.valueOf(video_tmpl_info.f383586e));
            l17.put("source_template_type", video_tmpl_info.f383585d);
            l17.put("source_templateid", java.lang.Integer.valueOf(video_tmpl_info.f383586e));
        }
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("audio_id");
            if (!(!(optString == null || optString.length() == 0))) {
                optString = null;
            }
            if (optString == null) {
                optString = jSONObject.optString("audioid");
            }
            l17.put("source_audioid", optString);
            java.lang.String optString2 = jSONObject.optString("song_id");
            if (!(!(optString2 == null || optString2.length() == 0))) {
                optString2 = null;
            }
            if (optString2 == null) {
                optString2 = jSONObject.optString("qq_music_song_id");
            }
            l17.put("source_songid", optString2);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("topics");
            if (optJSONArray != null) {
                if (!(optJSONArray.length() > 0)) {
                    optJSONArray = null;
                }
                if (optJSONArray != null) {
                    str2 = optJSONArray.getString(0);
                    l17.put("topic_name", str2);
                }
            }
            str2 = null;
            l17.put("topic_name", str2);
        }
        return l17;
    }
}
