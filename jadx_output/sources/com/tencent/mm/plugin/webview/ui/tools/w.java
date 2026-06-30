package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f187001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f187002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f187003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f187004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f187005h;

    public w(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI, java.util.ArrayList arrayList, boolean z17, java.util.List list, int i17) {
        this.f187005h = openFileChooserUI;
        this.f187001d = arrayList;
        this.f187002e = z17;
        this.f187003f = list;
        this.f187004g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String g17;
        java.util.Iterator it;
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f187005h;
        boolean z17 = openFileChooserUI.f183637t;
        boolean z18 = this.f187002e;
        if (z17) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it6 = this.f187001d.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next();
                if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "it is a livephoto");
                    boolean z19 = true;
                    if (((com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem).G != 1) {
                        it = it6;
                        aq.u0 Ai = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(galleryItem$MediaItem.f138434i, galleryItem$MediaItem.f138430e, galleryItem$MediaItem.f138433h, openFileChooserUI.getIntent().getIntExtra("key_live_photo_max_duration", 0));
                        z19 = Ai.f12975a.f12960a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "livePhoto is no parse >> parse result :%b errCode: %s", java.lang.Boolean.valueOf(z19), Ai.toString());
                    } else {
                        it = it6;
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "isParsedVideo == 1!");
                    }
                    if (z19) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "getVideoMetaData success");
                        com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(galleryItem$MediaItem.f138430e);
                        java.lang.String str = b17.f182736e;
                        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
                        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(galleryItem$MediaItem.f138433h);
                        java.lang.String str2 = d17.f182736e;
                        d17.f182748t = z18;
                        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s videolocal id is : %s", galleryItem$MediaItem.f138430e, str2, str);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put(dm.i4.COL_LOCALID, str2);
                            jSONObject.put("videoLocalId", str);
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenFileChooserUI", e17, "", new java.lang.Object[0]);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "getVideoMetaData fail");
                        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d18 = com.tencent.mm.plugin.webview.model.m4.d(galleryItem$MediaItem.f138433h);
                        java.lang.String str3 = d18.f182736e;
                        d18.f182748t = z18;
                        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d18);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", galleryItem$MediaItem.f138433h, str3);
                        if (com.tencent.mm.sdk.platformtools.t8.D0(openFileChooserUI.f183633p, com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME)) {
                            jSONArray.put(str3);
                        } else {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            try {
                                jSONObject2.put(dm.i4.COL_LOCALID, str3);
                            } catch (org.json.JSONException e18) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenFileChooserUI", e18, "", new java.lang.Object[0]);
                            }
                            jSONArray.put(jSONObject2);
                        }
                    }
                } else {
                    it = it6;
                    if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "it is a image not live");
                        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d19 = com.tencent.mm.plugin.webview.model.m4.d(galleryItem$MediaItem.f138430e);
                        java.lang.String str4 = d19.f182736e;
                        d19.f182748t = z18;
                        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d19);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", galleryItem$MediaItem.f138430e, str4);
                        if (com.tencent.mm.sdk.platformtools.t8.D0(openFileChooserUI.f183633p, com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME)) {
                            jSONArray.put(str4);
                        } else {
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                            try {
                                jSONObject3.put(dm.i4.COL_LOCALID, str4);
                            } catch (org.json.JSONException e19) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenFileChooserUI", e19, "", new java.lang.Object[0]);
                            }
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
                it6 = it;
            }
            g17 = jSONArray.toString();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str5 : this.f187003f) {
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d27 = com.tencent.mm.plugin.webview.model.m4.d(str5);
                java.lang.String str6 = d27.f182736e;
                d27.f182748t = z18;
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d27);
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", str5, str6);
                arrayList.add(str6);
            }
            g17 = com.tencent.mm.sdk.platformtools.t8.D0(openFileChooserUI.f183633p, com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME) ? com.tencent.mm.plugin.webview.model.o5.g(arrayList) : com.tencent.mm.plugin.webview.model.o5.h(arrayList);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_media_local_ids", g17);
        intent.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI.f183636s);
        intent.putExtra("key_pick_local_media_callback_type", 2);
        intent.putExtra("key_pick_local_pic_source_type", openFileChooserUI.f183634q ? "camera" : com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        openFileChooserUI.setResult(this.f187004g, intent);
        openFileChooserUI.finish();
    }
}
