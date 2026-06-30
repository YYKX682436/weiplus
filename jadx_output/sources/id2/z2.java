package id2;

/* loaded from: classes3.dex */
public final class z2 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f290899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290900c;

    public z2(id2.u3 u3Var, com.tencent.mm.plugin.lite.s sVar, android.content.Context context) {
        this.f290898a = u3Var;
        this.f290899b = sVar;
        this.f290900c = context;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[live_record] actionName = " + str);
        try {
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[live_record] actionName = " + str + ", data = " + obj);
            id2.u3 u3Var = this.f290898a;
            com.tencent.mm.plugin.lite.s sVar = this.f290899b;
            android.content.Context context = this.f290900c;
            if (str == null || obj == null) {
                return false;
            }
            switch (str.hashCode()) {
                case -794725022:
                    if (!str.equals("openFinderPostGallery")) {
                        break;
                    } else {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams finderLiveGalleryParams = new com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams();
                        finderLiveGalleryParams.f66603d = 1;
                        java.lang.String string = ((org.json.JSONObject) obj).getString("uniqId");
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        finderLiveGalleryParams.f66604e = string;
                        finderLiveGalleryParams.f66605f = ((org.json.JSONObject) obj).getString("coverImageUrl");
                        finderLiveGalleryParams.f66606g = ((org.json.JSONObject) obj).getString("sliceMp4Url");
                        java.lang.String string2 = ((org.json.JSONObject) obj).getString("duration");
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        finderLiveGalleryParams.f66607h = java.lang.Long.parseLong(string2);
                        java.lang.String string3 = ((org.json.JSONObject) obj).getString("liveId");
                        kotlin.jvm.internal.o.f(string3, "getString(...)");
                        finderLiveGalleryParams.f66608i = string3;
                        arrayList.add(finderLiveGalleryParams);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ((ci5.h) ((s40.x0) i95.n0.c(s40.x0.class))).wi(context, new t40.b("task_FinderCdnDownloader", 2, 0, com.tencent.mm.plugin.finder.assist.e9.f102137f, t40.d.f415476d, 106), arrayList);
                        return false;
                    }
                case 127673242:
                    if (!str.equals("openCancelReplayPage")) {
                        break;
                    } else {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.lang.String optString = ((org.json.JSONObject) obj).optString("liveId");
                        java.lang.String optString2 = ((org.json.JSONObject) obj).optString("objectId");
                        long q07 = com.tencent.mm.sdk.platformtools.t8.q0(optString == null ? "0" : optString, 0L);
                        long q08 = com.tencent.mm.sdk.platformtools.t8.q0(optString2 == null ? "0" : optString2, 0L);
                        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[openCancelReplayPage] objectId:" + optString2 + " liveId:" + optString);
                        android.content.Context context2 = (android.content.Context) sVar.f144169f.get();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        id2.y2 y2Var = new id2.y2(i17, j17, sVar);
                        u3Var.getClass();
                        u3Var.f290825m = new com.tencent.mm.plugin.finder.live.widget.wt(context2, new id2.v2(u3Var, context2, q07, q08, y2Var));
                        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "openCancelReplayPage");
                        com.tencent.mm.plugin.finder.live.widget.wt wtVar = u3Var.f290825m;
                        if (wtVar == null) {
                            return false;
                        }
                        wtVar.w();
                        return false;
                    }
                case 1945792096:
                    if (str.equals("openReplaySettingSheet")) {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.lang.String optString3 = ((org.json.JSONObject) obj).optString("finderUserName");
                        java.lang.String optString4 = ((org.json.JSONObject) obj).optString("liveId");
                        java.lang.String optString5 = ((org.json.JSONObject) obj).optString("objectId");
                        long q09 = com.tencent.mm.sdk.platformtools.t8.q0(optString4 == null ? "0" : optString4, 0L);
                        long q010 = com.tencent.mm.sdk.platformtools.t8.q0(optString5 == null ? "0" : optString5, 0L);
                        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[openReplaySettingSheet] finderUserName:" + optString3 + " liveId:" + optString4 + " objectId:" + optString5);
                        android.content.Context context3 = (android.content.Context) sVar.f144169f.get();
                        kotlin.jvm.internal.o.f(context3, "getContext(...)");
                        kotlin.jvm.internal.o.d(optString3);
                        kotlinx.coroutines.l.d(v65.m.b(u3Var.getActivity()), null, null, new id2.d3(context3, q09, u3Var, q010, new id2.x2(i17, j17, sVar), null), 3, null);
                        return false;
                    }
                    break;
                case 2056802828:
                    if (!str.equals("openLiveReplayPage")) {
                        break;
                    } else {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.lang.String optString6 = ((org.json.JSONObject) obj).optString("objectId");
                        long q011 = com.tencent.mm.sdk.platformtools.t8.q0(optString6 == null ? "0" : optString6, 0L);
                        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[openLiveReplayPage] objectId:" + optString6);
                        cl0.g gVar = new cl0.g();
                        gVar.r("statusChanged", true);
                        gVar.o("errCode", 0);
                        java.lang.String gVar2 = gVar.toString();
                        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[openLiveReplayPage] callback jsonStr:" + gVar2 + " callbackId:" + i17 + " instanceId:" + j17);
                        sVar.c(j17, i17, gVar2);
                        android.content.Context context4 = (android.content.Context) sVar.f144169f.get();
                        kotlin.jvm.internal.o.f(context4, "getContext(...)");
                        id2.u3.O6(u3Var, context4, q011);
                        return false;
                    }
            }
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[live_record] invalid action");
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[live_record] e = " + e17.getMessage());
            return false;
        }
    }
}
