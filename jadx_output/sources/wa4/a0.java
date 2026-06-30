package wa4;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static void a(wa4.z zVar, r45.jj4 jj4Var, java.lang.Boolean bool, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillMediaTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = bool.booleanValue() ? "liveMedia" : "media";
        zVar.e(str);
        zVar.e(dm.i4.COL_ID);
        if (b(jj4Var.f377855d).isEmpty()) {
            zVar.h("0");
        } else {
            zVar.h(b(jj4Var.f377855d));
        }
        zVar.b(dm.i4.COL_ID);
        zVar.e("type");
        zVar.h(jj4Var.f377856e + "");
        zVar.b("type");
        zVar.e(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        zVar.h(c(jj4Var.f377864o));
        zVar.b(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        zVar.e("description");
        zVar.h(c(jj4Var.f377857f));
        zVar.b("description");
        if (!android.text.TextUtils.isEmpty(jj4Var.I1)) {
            zVar.e("ybTemplate");
            zVar.h(c(jj4Var.I1));
            zVar.b("ybTemplate");
        }
        zVar.e("private");
        zVar.h(jj4Var.f377863n + "");
        zVar.b("private");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.P)) {
            zVar.e("songalbumurl");
            zVar.h(jj4Var.P);
            zVar.b("songalbumurl");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.Q)) {
            zVar.e("songlyric");
            zVar.h(jj4Var.Q);
            zVar.b("songlyric");
        }
        hashMap.clear();
        hashMap.put("type", jj4Var.f377859h + "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.f377874w)) {
            hashMap.put("md5", jj4Var.f377874w);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.M)) {
            hashMap.put("videomd5", jj4Var.M);
        }
        zVar.f("url", hashMap);
        zVar.h(c(jj4Var.f377858g));
        zVar.b("url");
        java.lang.String str2 = jj4Var.f377860i;
        if (str2 != null && !str2.isEmpty()) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f377862m + "");
            zVar.f("thumb", hashMap);
            zVar.h(c(jj4Var.f377860i));
            zVar.b("thumb");
        }
        if (!android.text.TextUtils.isEmpty(jj4Var.f377879y0)) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f377859h + "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.f377880y1)) {
                hashMap.put("md5", jj4Var.f377880y1);
            }
            if (jj4Var.f377882z1 != null) {
                hashMap.put("width", jj4Var.f377882z1.f379520d + "");
                hashMap.put("height", jj4Var.f377882z1.f379521e + "");
                hashMap.put("fileSize", jj4Var.f377882z1.f379522f + "");
            }
            zVar.f("uhd", hashMap);
            zVar.h(c(jj4Var.f377879y0));
            zVar.b("uhd");
        }
        if (!android.text.TextUtils.isEmpty(jj4Var.A1)) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f377859h + "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.E1)) {
                hashMap.put("md5", jj4Var.E1);
            }
            if (jj4Var.F1 != null) {
                hashMap.put("width", jj4Var.F1.f379520d + "");
                hashMap.put("height", jj4Var.F1.f379521e + "");
                hashMap.put("fileSize", jj4Var.F1.f379522f + "");
            }
            zVar.f("hd", hashMap);
            zVar.h(c(jj4Var.A1));
            zVar.b("hd");
        }
        zVar.e("videoDuration");
        zVar.h(jj4Var.R + "");
        zVar.b("videoDuration");
        if (jj4Var.f377873v > 0) {
            zVar.e("subType");
            zVar.h(jj4Var.f377873v + "");
            zVar.b("subType");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.f377872u)) {
            zVar.e("userData");
            zVar.h(jj4Var.f377872u);
            zVar.b("userData");
        }
        java.lang.String str3 = jj4Var.f377868q;
        if (str3 != null && !str3.isEmpty()) {
            hashMap.clear();
            hashMap.put("type", jj4Var.f377869r + "");
            zVar.f("lowBandUrl", hashMap);
            zVar.h(c(jj4Var.f377868q));
            zVar.b("lowBandUrl");
        }
        if (jj4Var.f377865p != null) {
            hashMap.clear();
            if (jj4Var.f377865p.f379520d > 0.0f) {
                hashMap.put("width", jj4Var.f377865p.f379520d + "");
            }
            if (jj4Var.f377865p.f379521e > 0.0f) {
                hashMap.put("height", jj4Var.f377865p.f379521e + "");
            }
            if (jj4Var.f377865p.f379522f > 0.0f) {
                hashMap.put("totalSize", jj4Var.f377865p.f379522f + "");
            }
            zVar.f("size", hashMap);
            zVar.b("size");
        }
        java.util.LinkedList linkedList = jj4Var.V;
        if (linkedList != null && !linkedList.isEmpty()) {
            zVar.e("EmotionList");
            for (int i17 = 0; i17 < jj4Var.V.size(); i17++) {
                zVar.e("emotion");
                zVar.e("wording");
                zVar.d(((r45.x96) jj4Var.V.get(i17)).f389902e);
                zVar.b("wording");
                zVar.e("md5");
                zVar.d(((r45.x96) jj4Var.V.get(i17)).f389901d);
                zVar.b("md5");
                zVar.b("emotion");
            }
            zVar.b("EmotionList");
        }
        if (timeLineObject.isExcerpt) {
            zVar.e("BizInfo");
            zVar.e("ExcerptUrl");
            zVar.h(c(com.tencent.mm.sdk.platformtools.t8.p(java.net.URLEncoder.encode(timeLineObject.snsExcerptUrl))));
            zVar.b("ExcerptUrl");
            zVar.b("BizInfo");
        }
        if (jj4Var.W != null) {
            m21.t tVar = new m21.t();
            tVar.f323000a = jj4Var.W;
            zVar.a(tVar.a());
        }
        if (jj4Var.f377876x0 != null) {
            m21.o oVar = new m21.o();
            oVar.f322996a = jj4Var.f377876x0;
            zVar.a(oVar.a());
        }
        if (bool.booleanValue()) {
            zVar.e("liveStillImageTimeMs");
            zVar.h(jj4Var.Z + "");
            zVar.b("liveStillImageTimeMs");
        }
        if (jj4Var.X != null) {
            zVar.e("LivePhoto");
            a(zVar, jj4Var.X, java.lang.Boolean.TRUE, timeLineObject);
            zVar.b("LivePhoto");
        }
        if (jj4Var.G1 != null) {
            zVar.e("finderInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.G1.f388072d)) {
                zVar.e("sourceUrl");
                zVar.h(jj4Var.G1.f388072d);
                zVar.b("sourceUrl");
            }
            zVar.b("finderInfo");
        }
        zVar.b(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillMediaTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
    }

    public static java.lang.String b(java.lang.String str) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (str.matches("\\d*")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            z17 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return "";
    }

    public static java.lang.String c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return str;
    }

    public static java.lang.String d(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pullTimeLineXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        wa4.z zVar = new wa4.z();
        java.util.HashMap hashMap = new java.util.HashMap();
        zVar.e("TimelineObject");
        zVar.e(dm.i4.COL_ID);
        java.lang.String str = timeLineObject.Id;
        if (str == null || str.equals("")) {
            zVar.d("0");
        } else {
            zVar.d(timeLineObject.Id + "");
        }
        zVar.b(dm.i4.COL_ID);
        if (timeLineObject.UserName != null) {
            zVar.e(dm.i4.COL_USERNAME);
            zVar.h(timeLineObject.UserName + "");
            zVar.b(dm.i4.COL_USERNAME);
        }
        zVar.e("createTime");
        zVar.h(timeLineObject.CreateTime + "");
        zVar.b("createTime");
        zVar.e("contentDescShowType");
        zVar.g(timeLineObject.contentDescShowType);
        zVar.b("contentDescShowType");
        zVar.e("contentDescScene");
        zVar.g(timeLineObject.contentDescScene);
        zVar.b("contentDescScene");
        zVar.e("private");
        zVar.h(timeLineObject.Privated + "");
        zVar.b("private");
        r45.y8 y8Var = timeLineObject.AppInfo;
        if (y8Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(y8Var.f390846d)) {
            zVar.e("appInfo");
            zVar.e(dm.i4.COL_ID);
            zVar.h(c(timeLineObject.AppInfo.f390846d));
            zVar.b(dm.i4.COL_ID);
            zVar.e("version");
            zVar.h(c(timeLineObject.AppInfo.f390847e));
            zVar.b("version");
            zVar.e("isHidden");
            zVar.g(timeLineObject.AppInfo.f390852m);
            zVar.b("isHidden");
            zVar.e("appName");
            zVar.h(c(timeLineObject.AppInfo.f390848f));
            zVar.b("appName");
            zVar.e("installUrl");
            zVar.h(c(timeLineObject.AppInfo.f390849g));
            zVar.b("installUrl");
            zVar.e("fromUrl");
            zVar.h(c(timeLineObject.AppInfo.f390850h));
            zVar.b("fromUrl");
            zVar.b("appInfo");
        }
        r45.tf6 tf6Var = timeLineObject.streamvideo;
        if (tf6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(tf6Var.f386379d)) {
            zVar.e("streamvideo");
            zVar.e("streamvideourl");
            zVar.h(c(timeLineObject.streamvideo.f386379d));
            zVar.b("streamvideourl");
            zVar.e("streamvideototaltime");
            zVar.g(timeLineObject.streamvideo.f386380e);
            zVar.b("streamvideototaltime");
            zVar.e("streamvideotitle");
            zVar.h(c(timeLineObject.streamvideo.f386383h));
            zVar.b("streamvideotitle");
            zVar.e("streamvideowording");
            zVar.h(c(timeLineObject.streamvideo.f386381f));
            zVar.b("streamvideowording");
            zVar.e("streamvideoweburl");
            zVar.h(c(timeLineObject.streamvideo.f386382g));
            zVar.b("streamvideoweburl");
            zVar.e("streamvideothumburl");
            zVar.h(c(timeLineObject.streamvideo.f386384i));
            zVar.b("streamvideothumburl");
            zVar.e("streamvideoaduxinfo");
            zVar.h(c(timeLineObject.streamvideo.f386385m));
            zVar.b("streamvideoaduxinfo");
            zVar.e("streamvideopublishid");
            zVar.h(c(timeLineObject.streamvideo.f386386n));
            zVar.b("streamvideopublishid");
            zVar.b("streamvideo");
        }
        r45.y97 y97Var = timeLineObject.webSearchInfo;
        if (y97Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(y97Var.f390898d)) {
            zVar.e("websearch");
            zVar.e("relevant_vid");
            zVar.h(c(timeLineObject.webSearchInfo.f390898d));
            zVar.b("relevant_vid");
            zVar.e("relevant_expand");
            zVar.h(c(timeLineObject.webSearchInfo.f390899e));
            zVar.b("relevant_expand");
            zVar.e("relevant_pre_searchid");
            zVar.h(c(timeLineObject.webSearchInfo.f390900f));
            zVar.b("relevant_pre_searchid");
            zVar.e("relevant_shared_openid");
            zVar.h(c(timeLineObject.webSearchInfo.f390901g));
            zVar.b("relevant_shared_openid");
            zVar.e("rec_category");
            zVar.h(c(timeLineObject.webSearchInfo.f390902h + ""));
            zVar.b("rec_category");
            zVar.e("shareUrl");
            zVar.h(c(timeLineObject.webSearchInfo.f390904m));
            zVar.b("shareUrl");
            zVar.e("shareTitle");
            zVar.h(c(timeLineObject.webSearchInfo.f390905n));
            zVar.b("shareTitle");
            zVar.e("shareDesc");
            zVar.h(c(timeLineObject.webSearchInfo.f390906o));
            zVar.b("shareDesc");
            zVar.e("shareImgUrl");
            zVar.h(c(timeLineObject.webSearchInfo.f390907p));
            zVar.b("shareImgUrl");
            zVar.e("shareString");
            zVar.h(c(timeLineObject.webSearchInfo.f390908q));
            zVar.b("shareString");
            zVar.e("shareStringUrl");
            zVar.h(c(timeLineObject.webSearchInfo.f390909r));
            zVar.b("shareStringUrl");
            zVar.e(ya.b.SOURCE);
            zVar.h(c(timeLineObject.webSearchInfo.f390910s));
            zVar.b(ya.b.SOURCE);
            zVar.e("strPlayCount");
            zVar.h(c(timeLineObject.webSearchInfo.f390903i));
            zVar.b("strPlayCount");
            zVar.e("titleUrl");
            zVar.h(c(timeLineObject.webSearchInfo.f390912u));
            zVar.b("titleUrl");
            zVar.e("extReqParams");
            zVar.h(c(timeLineObject.webSearchInfo.f390913v));
            zVar.b("extReqParams");
            zVar.e("tagList");
            zVar.h(c(timeLineObject.webSearchInfo.f390914w));
            zVar.b("tagList");
            zVar.e(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
            zVar.h(c(timeLineObject.webSearchInfo.f390915x + ""));
            zVar.b(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID);
            zVar.e("thumbUrl");
            zVar.h(c(timeLineObject.webSearchInfo.f390916y));
            zVar.b("thumbUrl");
            zVar.e("shareTag");
            zVar.h(c(timeLineObject.webSearchInfo.f390917z));
            zVar.b("shareTag");
            zVar.b("websearch");
        }
        zVar.e("contentDesc");
        zVar.h(c(timeLineObject.ContentDesc));
        zVar.b("contentDesc");
        zVar.e("contentattr");
        zVar.h(timeLineObject.contentattr + "");
        zVar.b("contentattr");
        zVar.e("sourceUserName");
        zVar.h(c(timeLineObject.sourceUserName));
        zVar.b("sourceUserName");
        zVar.e("publicUserName");
        zVar.h(c(timeLineObject.publicUserName));
        zVar.b("publicUserName");
        zVar.e("sourceNickName");
        zVar.h(c(timeLineObject.sourceNickName));
        zVar.b("sourceNickName");
        zVar.e("publicFinderUserName");
        zVar.h(timeLineObject.publicFinderUserName);
        zVar.b("publicFinderUserName");
        zVar.e("publicPhotoAccountUserName");
        zVar.h(timeLineObject.publicPhotoAccountUserName);
        zVar.b("publicPhotoAccountUserName");
        zVar.e("publicPhotoAccountNickName");
        zVar.h(timeLineObject.publicPhotoAccountNickName);
        zVar.b("publicPhotoAccountNickName");
        zVar.e("publicBrandContactType");
        zVar.g(timeLineObject.publicBrandContactType);
        zVar.b("publicBrandContactType");
        zVar.e("snsCoverOffset");
        zVar.g(timeLineObject.snsCoverOffset);
        zVar.b("snsCoverOffset");
        r45.p76 p76Var = timeLineObject.bgmInfo;
        if (p76Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(p76Var.f382815e)) {
            zVar.e("bgmInfo");
            zVar.e("bgmType");
            zVar.h(timeLineObject.bgmInfo.f382814d + "");
            zVar.b("bgmType");
            zVar.e("listenId");
            zVar.h(c(timeLineObject.bgmInfo.f382815e));
            zVar.b("listenId");
            zVar.e("isMajorOwned");
            zVar.h(timeLineObject.bgmInfo.f382816f ? "1" : "0");
            zVar.b("isMajorOwned");
            zVar.b("bgmInfo");
        }
        zVar.e("statisticsData");
        zVar.h(c(timeLineObject.statisticsData));
        zVar.b("statisticsData");
        zVar.e("weappInfo");
        zVar.e("appUserName");
        zVar.h(c(timeLineObject.weappInfo.f390864d));
        zVar.b("appUserName");
        zVar.e("pagePath");
        zVar.h(c(timeLineObject.weappInfo.f390865e));
        zVar.b("pagePath");
        zVar.e("version");
        zVar.h(c(timeLineObject.weappInfo.f390866f + ""));
        zVar.b("version");
        zVar.e("isHidden");
        zVar.g(timeLineObject.AppInfo.f390852m);
        zVar.b("isHidden");
        zVar.e("debugMode");
        zVar.h(c(timeLineObject.weappInfo.f390867g + ""));
        zVar.b("debugMode");
        zVar.e("shareActionId");
        zVar.h(c(timeLineObject.weappInfo.f390868h));
        zVar.b("shareActionId");
        zVar.e("isGame");
        zVar.h(c(timeLineObject.weappInfo.f390869i + ""));
        zVar.b("isGame");
        zVar.e("messageExtraData");
        zVar.h(c(timeLineObject.weappInfo.f390870m));
        zVar.b("messageExtraData");
        zVar.e("subType");
        zVar.h(c(timeLineObject.weappInfo.f390871n + ""));
        zVar.b("subType");
        zVar.e("preloadResources");
        zVar.h(c(timeLineObject.weappInfo.f390872o));
        zVar.b("preloadResources");
        zVar.b("weappInfo");
        zVar.e("canvasInfoXml");
        zVar.h(c(timeLineObject.canvasInfo));
        zVar.b("canvasInfoXml");
        r45.ed4 ed4Var = timeLineObject.Location;
        if (ed4Var != null) {
            float f17 = ed4Var.f373311d;
            float f18 = ed4Var.f373312e;
            if (f17 != -1000.0f && f18 != -1000.0f) {
                hashMap.clear();
                hashMap.put("longitude", timeLineObject.Location.f373311d + "");
                hashMap.put("latitude", timeLineObject.Location.f373312e + "");
                hashMap.put("city", com.tencent.mm.sdk.platformtools.t8.p(c(timeLineObject.Location.f373313f)));
                hashMap.put("poiName", com.tencent.mm.sdk.platformtools.t8.p(c(timeLineObject.Location.f373314g)));
                hashMap.put("poiAddress", com.tencent.mm.sdk.platformtools.t8.p(c(timeLineObject.Location.f373315h)));
                hashMap.put("poiScale", timeLineObject.Location.f373319o + "");
                hashMap.put("poiClassifyId", c(timeLineObject.Location.f373316i));
                hashMap.put("poiClassifyType", timeLineObject.Location.f373317m + "");
                hashMap.put("poiClickableStatus", timeLineObject.Location.f373320p + "");
                zVar.f(ya.b.LOCATION, hashMap);
                zVar.b(ya.b.LOCATION);
            }
        }
        zVar.e("ContentObject");
        zVar.e("contentStyle");
        zVar.h(timeLineObject.ContentObj.f369837e + "");
        zVar.b("contentStyle");
        zVar.e("contentSubStyle");
        zVar.h(timeLineObject.ContentObj.f369841i + "");
        zVar.b("contentSubStyle");
        zVar.e(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        zVar.h(c(timeLineObject.ContentObj.f369838f));
        zVar.b(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        zVar.e("description");
        zVar.h(c(timeLineObject.ContentObj.f369836d));
        zVar.b("description");
        zVar.e("contentUrl");
        zVar.h(c(timeLineObject.ContentObj.f369839g));
        zVar.b("contentUrl");
        if (!timeLineObject.ContentObj.f369840h.isEmpty()) {
            zVar.e("mediaList");
            java.util.Iterator it = timeLineObject.ContentObj.f369840h.iterator();
            while (it.hasNext()) {
                a(zVar, (r45.jj4) it.next(), java.lang.Boolean.FALSE, timeLineObject);
            }
            zVar.b("mediaList");
        }
        if (timeLineObject.ContentObj.F != null) {
            m21.d dVar = new m21.d();
            dVar.f322984a = timeLineObject.ContentObj.F;
            zVar.a(dVar.a());
        }
        if (timeLineObject.ContentObj.G != null) {
            new r45.k86();
            r45.k86 k86Var = timeLineObject.ContentObj.G;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (k86Var != null) {
                try {
                    sb6.append("<EcsInfo>");
                    sb6.append("<ecsJumpInfoBase64>");
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(k86Var.f378494d));
                    sb6.append("</ecsJumpInfoBase64>");
                    sb6.append("</EcsInfo>");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsEcsShareInfoObject", e17, "makeContent", new java.lang.Object[0]);
                }
            }
            zVar.a(sb6.toString());
        }
        zVar.f444307a.append(c(timeLineObject.ContentObj.f369842m));
        r45.hh4 hh4Var = timeLineObject.ContentObj.f369843n;
        if (hh4Var != null && hh4Var.f376149d != -1) {
            zVar.e("mmreadershare");
            zVar.e("itemshowtype");
            zVar.g(timeLineObject.ContentObj.f369843n.f376149d);
            zVar.b("itemshowtype");
            zVar.e("ispaysubscribe");
            zVar.g(timeLineObject.ContentObj.f369843n.f376159q);
            zVar.b("ispaysubscribe");
            int i17 = timeLineObject.ContentObj.f369843n.f376149d;
            if (i17 == 5 || i17 == 16) {
                zVar.e("pubtime");
                zVar.g(timeLineObject.ContentObj.f369843n.f376154i);
                zVar.b("pubtime");
                zVar.e(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID);
                zVar.h(timeLineObject.ContentObj.f369843n.f376156n);
                zVar.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID);
                zVar.e("funcflag");
                zVar.g(timeLineObject.ContentObj.f369843n.f376157o);
                zVar.b("funcflag");
                zVar.e("duration");
                zVar.g(timeLineObject.ContentObj.f369843n.f376155m);
                zVar.b("duration");
                zVar.e("digest");
                zVar.h(timeLineObject.ContentObj.f369843n.f376151f);
                zVar.b("digest");
                zVar.e("cover");
                zVar.h(timeLineObject.ContentObj.f369843n.f376158p);
                zVar.b("cover");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.ContentObj.f369843n.f376156n)) {
                    zVar.e("nativepage");
                    zVar.g(1);
                    zVar.b("nativepage");
                }
                zVar.e("width");
                zVar.g(timeLineObject.ContentObj.f369843n.f376152g);
                zVar.b("width");
                zVar.e("height");
                zVar.g(timeLineObject.ContentObj.f369843n.f376153h);
                zVar.b("height");
            }
            r45.hh4 hh4Var2 = timeLineObject.ContentObj.f369843n;
            if (hh4Var2.f376149d == 8 && hh4Var2.f376160r > 0) {
                zVar.e("piccount");
                zVar.g(timeLineObject.ContentObj.f369843n.f376160r);
                zVar.b("piccount");
            }
            zVar.b("mmreadershare");
        }
        if (timeLineObject.ContentObj.f369844o != null) {
            new r45.kv2();
            zVar.a(zy2.d5.f(timeLineObject.ContentObj.f369844o));
        }
        if (timeLineObject.ContentObj.f369852w != null) {
            new r45.xs4();
            zVar.a(zy2.pc.a(timeLineObject.ContentObj.f369852w));
        }
        if (timeLineObject.ContentObj.f369849t != null) {
            m21.p pVar = new m21.p();
            pVar.f322997a = timeLineObject.ContentObj.f369849t;
            zVar.a(pVar.a());
        }
        if (timeLineObject.ContentObj.f369845p != null) {
            new r45.mv2();
            zVar.a(zy2.d5.h(timeLineObject.ContentObj.f369845p));
        }
        if (timeLineObject.ContentObj.f369851v != null) {
            new r45.mv2();
            r45.mv2 mv2Var = timeLineObject.ContentObj.f369851v;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zVar.a(zy2.d5.a(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127633c4).getValue()).r()).intValue(), zy2.d5.h(mv2Var)));
        }
        if (timeLineObject.ContentObj.f369854y != null) {
            new r45.mv2();
            zVar.a(zy2.d5.a(4, zy2.d5.h(timeLineObject.ContentObj.f369854y)));
        }
        if (timeLineObject.ContentObj.C != null) {
            new r45.mv2();
            zVar.a(zy2.d5.a(6, zy2.d5.h(timeLineObject.ContentObj.C)));
        }
        if (timeLineObject.ContentObj.A != null) {
            new r45.km6();
            r45.km6 shareObj = timeLineObject.ContentObj.A;
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            kotlin.jvm.internal.o.g(shareObj, "shareObj");
            zVar.a(cl4.g.a(shareObj));
        }
        if (timeLineObject.ContentObj.f369846q != null) {
            m21.q qVar = new m21.q();
            qVar.f322998a = timeLineObject.ContentObj.f369846q;
            zVar.a(qVar.a());
        }
        if (timeLineObject.ContentObj.f369848s != null) {
            new r45.g92();
            r45.g92 g92Var = timeLineObject.ContentObj.f369848s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            kotlin.jvm.internal.o.g(g92Var, "<set-?>");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
            java.lang.String c17 = zy2.d5.c(g92Var);
            kotlin.jvm.internal.o.f(c17, "makeContent(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
            zVar.a(c17);
        }
        if (timeLineObject.ContentObj.f369847r != null) {
            new r45.dv2();
            zVar.a(zy2.d5.d(timeLineObject.ContentObj.f369847r));
        }
        if (timeLineObject.ContentObj.f369855z != null) {
            new r45.hd2();
            r45.hd2 hd2Var = timeLineObject.ContentObj.f369855z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            kotlin.jvm.internal.o.g(hd2Var, "<set-?>");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            java.lang.String i18 = zy2.d5.i(hd2Var);
            kotlin.jvm.internal.o.f(i18, "makeLiveThemeContent(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
            zVar.a(i18);
        }
        if (timeLineObject.ContentObj.f369853x != null) {
            new r45.lv2();
            zVar.a(zy2.d5.a(2, zy2.d5.g(timeLineObject.ContentObj.f369853x)));
        }
        r45.fd6 fd6Var = timeLineObject.ContentObj.B;
        if (fd6Var != null) {
            zVar.e("SpringFestival");
            if (fd6Var.f374243d != null) {
                m21.h hVar = new m21.h();
                hVar.e(fd6Var.f374243d);
                zVar.a(hVar.c());
            }
            zVar.a("<Source>");
            zVar.a(java.lang.String.valueOf(fd6Var.f374244e));
            zVar.a("</Source>");
            zVar.a("<Year>");
            zVar.a(java.lang.String.valueOf(fd6Var.f374245f));
            zVar.a("</Year>");
            zVar.b("SpringFestival");
        }
        if (timeLineObject.ContentObj.E != null) {
            new r45.ev2();
            r45.ev2 ev2Var = timeLineObject.ContentObj.E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            kotlin.jvm.internal.o.g(ev2Var, "<set-?>");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            java.lang.String e18 = zy2.d5.e(ev2Var);
            kotlin.jvm.internal.o.f(e18, "makeContent(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
            zVar.a(e18);
        }
        java.util.LinkedList linkedList = timeLineObject.ContentObj.H;
        if (linkedList != null && !linkedList.isEmpty()) {
            zVar.e("snsExperiments");
            java.util.Iterator it6 = timeLineObject.ContentObj.H.iterator();
            while (it6.hasNext()) {
                r45.q86 q86Var = (r45.q86) it6.next();
                zVar.e("experiment");
                zVar.e(dm.i4.COL_ID);
                zVar.h(c(q86Var.f383762d));
                zVar.b(dm.i4.COL_ID);
                zVar.e("value");
                zVar.h(c(q86Var.f383763e));
                zVar.b("value");
                zVar.b("experiment");
            }
            zVar.b("snsExperiments");
        }
        zVar.b("ContentObject");
        if (timeLineObject.actionInfo != null) {
            zVar.e("actionInfo");
            if (timeLineObject.actionInfo.f383556m != null) {
                zVar.e("appMsg");
                zVar.e("mediaTagName");
                zVar.d(timeLineObject.actionInfo.f383556m.f380055e);
                zVar.b("mediaTagName");
                zVar.e("messageExt");
                zVar.d(timeLineObject.actionInfo.f383556m.f380056f);
                zVar.b("messageExt");
                zVar.e("messageAction");
                zVar.d(timeLineObject.actionInfo.f383556m.f380057g);
                zVar.b("messageAction");
                zVar.b("appMsg");
            }
            zVar.b("actionInfo");
        }
        r45.y8 y8Var2 = timeLineObject.AppInfo;
        if (y8Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(y8Var2.f390846d)) {
            java.lang.String str2 = timeLineObject.statExtStr;
            r45.td6 td6Var = new r45.td6();
            if (str2 != null) {
                try {
                    td6Var.parseFrom(android.util.Base64.decode(str2, 0));
                } catch (java.lang.Exception unused) {
                }
            }
            r45.rd6 rd6Var = new r45.rd6();
            td6Var.f386331f = rd6Var;
            rd6Var.f384752d = timeLineObject.AppInfo.f390846d;
            try {
                str2 = android.util.Base64.encodeToString(td6Var.toByteArray(), 0).replace("\n", "");
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TimelineConvert", e19, "", new java.lang.Object[0]);
            }
            timeLineObject.statExtStr = str2;
        }
        if (timeLineObject.statExtStr != null) {
            zVar.e("statExtStr");
            zVar.h(timeLineObject.statExtStr + "");
            zVar.b("statExtStr");
        }
        r45.n74 n74Var = timeLineObject.liteappInfo;
        if (n74Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(n74Var.f381130d)) {
            zVar.e("liteApp");
            zVar.e("appId");
            zVar.h(c(timeLineObject.liteappInfo.f381130d));
            zVar.b("appId");
            zVar.e(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            zVar.h(c(timeLineObject.liteappInfo.f381131e));
            zVar.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            zVar.e("query");
            zVar.h(c(timeLineObject.liteappInfo.f381132f));
            zVar.b("query");
            zVar.e("istransparent");
            zVar.h(timeLineObject.liteappInfo.f381133g ? "1" : "0");
            zVar.b("istransparent");
            zVar.b("liteApp");
        }
        r45.ib6 ib6Var = timeLineObject.videoTemplate;
        if (ib6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(ib6Var.f376910e)) {
            zVar.e("VideoTemplate");
            if (timeLineObject.videoTemplate.f376909d != null) {
                zVar.e("Type");
                zVar.h(timeLineObject.videoTemplate.f376909d);
                zVar.b("Type");
            }
            if (timeLineObject.videoTemplate.f376910e != null) {
                zVar.e("TemplateId");
                zVar.h(timeLineObject.videoTemplate.f376910e);
                zVar.b("TemplateId");
            }
            if (timeLineObject.videoTemplate.f376911f != null) {
                zVar.e("MusicId");
                zVar.h(timeLineObject.videoTemplate.f376911f);
                zVar.b("MusicId");
            }
            if (!android.text.TextUtils.isEmpty(timeLineObject.videoTemplate.f376915m)) {
                zVar.e("AIModelType");
                zVar.h(timeLineObject.videoTemplate.f376915m);
                zVar.b("AIModelType");
            }
            zVar.e("VersionInfo");
            zVar.e("IosSdkVersionMin");
            zVar.h(timeLineObject.videoTemplate.f376913h + "");
            zVar.b("IosSdkVersionMin");
            zVar.e("AndroidSdkVersionMin");
            zVar.h(timeLineObject.videoTemplate.f376912g + "");
            zVar.b("AndroidSdkVersionMin");
            zVar.b("VersionInfo");
            zVar.b("VideoTemplate");
        }
        if (timeLineObject.gameShareCardObject != null) {
            zVar.e("gameshare");
            zVar.e("appbrandext");
            zVar.e("litegameinfo");
            zVar.h(c(timeLineObject.gameShareCardObject.f373071m));
            zVar.b("litegameinfo");
            zVar.e("appbrandpriority");
            zVar.g(timeLineObject.gameShareCardObject.f373072n);
            zVar.b("appbrandpriority");
            zVar.b("appbrandext");
            zVar.e("liteappext");
            zVar.e("liteappbizdata");
            zVar.h(c(timeLineObject.gameShareCardObject.f373069h));
            zVar.b("liteappbizdata");
            zVar.e("liteapppriority");
            zVar.g(timeLineObject.gameShareCardObject.f373070i);
            zVar.b("liteapppriority");
            zVar.b("liteappext");
            zVar.e("gameshareid");
            zVar.h(c(timeLineObject.gameShareCardObject.f373066e));
            zVar.b("gameshareid");
            zVar.e("sharedata");
            zVar.h(c(timeLineObject.gameShareCardObject.f373065d));
            zVar.b("sharedata");
            zVar.e("isvideo");
            zVar.g(timeLineObject.gameShareCardObject.f373067f);
            zVar.b("isvideo");
            zVar.e("duration");
            zVar.g(timeLineObject.gameShareCardObject.f373068g);
            zVar.b("duration");
            zVar.b("gameshare");
        }
        zVar.b("TimelineObject");
        java.lang.String c18 = zVar.c();
        if (com.tencent.mm.sdk.platformtools.aa.d(c18, "TimelineObject", null) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullTimeLineXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return c18;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TimelineConvert", "xml is error");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullTimeLineXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return "";
    }
}
