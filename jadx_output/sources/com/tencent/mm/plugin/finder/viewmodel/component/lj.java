package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135068d;

    public lj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135068d = blVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.q23 video_tmpl_info;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135068d;
        blVar.getClass();
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("TLPostCamera");
        com.tencent.mm.plugin.finder.report.p2.f125237a.D(blVar.getActivity(), false, 1);
        if (!hz2.d.f286313a.a("post")) {
            i95.m c17 = i95.n0.c(l40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String str = null;
            int dh6 = l40.e.dh((l40.e) c17, blVar.getContext(), null, 2, null);
            if (dh6 == 2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_create_scene", 1);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qj(blVar.getActivity(), intent);
            } else if (dh6 == 4) {
                db5.t7.makeText(blVar.getActivity(), blVar.getActivity().getResources().getString(com.tencent.mm.R.string.f489809cc), 1).show();
                blVar.U6(4);
            } else if (dh6 == 5) {
                db5.t7.makeText(blVar.getActivity(), blVar.getActivity().getResources().getString(com.tencent.mm.R.string.f489808cb), 1).show();
                blVar.U6(5);
            } else if (dh6 == 6) {
                db5.t7.makeText(blVar.getActivity(), blVar.getActivity().getResources().getString(com.tencent.mm.R.string.f489807ca), 1).show();
                blVar.U6(6);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(blVar.getContext()))) {
                com.tencent.mars.xlog.Log.e("Finder.HomeActionBarUIC", "getDefaultFinderUsername is null.");
            } else {
                androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
                in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(blVar.getActivity());
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Lj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Lj : null;
                java.lang.String Z6 = blVar.Z6(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L, baseFinderFeed != null ? baseFinderFeed.w() : null);
                org.json.JSONObject jSONObject = Z6 != null ? new org.json.JSONObject(Z6) : null;
                android.content.Intent intent2 = new android.content.Intent();
                qs2.e eVar = new qs2.e(3, 59, 5);
                eVar.f366262d = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
                eVar.f366263e = baseFinderFeed != null ? baseFinderFeed.w() : null;
                if (jSONObject != null) {
                    java.lang.String optString = jSONObject.optString("audio_id");
                    if (!java.lang.Boolean.valueOf(!(optString == null || optString.length() == 0)).booleanValue()) {
                        optString = null;
                    }
                    if (optString == null) {
                        optString = jSONObject.optString("audioid");
                    }
                    eVar.f366269k = optString;
                    intent2.putExtra("KEY_FINDER_SOURCE_AUDIO_ID", optString);
                    java.lang.String optString2 = jSONObject.optString("song_id");
                    if (!java.lang.Boolean.valueOf(!(optString2 == null || optString2.length() == 0)).booleanValue()) {
                        optString2 = null;
                    }
                    if (optString2 == null) {
                        optString2 = jSONObject.optString("qq_music_song_id");
                    }
                    eVar.f366270l = optString2;
                    intent2.putExtra("KEY_FINDER_SOURCE_SONG_ID", optString2);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("topics");
                    if (optJSONArray != null) {
                        if (!java.lang.Boolean.valueOf(optJSONArray.length() > 0).booleanValue()) {
                            optJSONArray = null;
                        }
                        if (optJSONArray != null) {
                            str = optJSONArray.getString(0);
                        }
                    }
                    eVar.f366265g = str;
                    intent2.putExtra("KEY_FINDER_SOURCE_TOPIC_NAME", str);
                }
                if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (objectDesc = feedObject2.getObjectDesc()) != null && (video_tmpl_info = objectDesc.getVideo_tmpl_info()) != null) {
                    intent2.putExtra("KEY_FINDER_TARGET_TEMPLATE_ID", video_tmpl_info.f383585d);
                    intent2.putExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", video_tmpl_info.f383586e);
                    eVar.f366271m = video_tmpl_info.f383585d;
                    eVar.f366272n = video_tmpl_info.f383586e;
                }
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ri(activity, eVar, intent2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
