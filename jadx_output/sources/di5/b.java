package di5;

/* loaded from: classes10.dex */
public final class b extends lf3.n implements di5.t, ut3.d {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f232792d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f232793e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f232794f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f232795g;

    /* renamed from: h, reason: collision with root package name */
    public int f232796h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f232794f = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public void V6(mf3.k mediaInfo) {
        java.lang.String c17;
        int i17;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        ci5.e eVar = mediaInfo instanceof ci5.e ? (ci5.e) mediaInfo : null;
        if (eVar != null) {
            this.f232796h = eVar.f41726b.f415475i;
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostComponent", "doOpenFinderMovieEditor: curPostEnterScene = " + this.f232796h);
        }
        ut3.f.f431176c.f431177a = this;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f232793e = sb6.toString();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        mf3.u type = mediaInfo.getType();
        mf3.u uVar = mf3.u.f326124f;
        if (type == uVar) {
            gg3.c a17 = mediaInfo.a();
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.FinderPostComponent", "doOpenFinderMovieEditor: params is null,type = " + mediaInfo.getType());
                return;
            }
            c17 = a17.f271728c;
            i17 = 4;
        } else {
            sf3.g e17 = mediaInfo.e();
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.FinderPostComponent", "doOpenFinderMovieEditor: params is null,type = " + mediaInfo.getType());
                return;
            }
            c17 = e17.c();
            i17 = 3;
        }
        try {
            new com.tencent.mm.vfs.u6(c17);
            if (mediaInfo.getType() == uVar) {
                arrayList.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, 0L, c17, c17, ""));
            } else {
                arrayList.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, 0L, c17, "", ""));
            }
            if (this.f232792d == null) {
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider d17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.d("", "");
                hp.b bVar = new hp.b();
                bVar.e(true);
                bVar.g(true);
                bVar.c(false);
                bVar.b(true);
                bVar.h(false);
                bVar.i(com.tencent.mm.R.drawable.f481057jk, 0, "", 0);
                d17.f155677o = bVar.f282904a;
                com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
                videoCaptureReportInfo.f155690d = 17;
                d17.I = videoCaptureReportInfo;
                d17.F = 17;
                ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
                com.tencent.mm.modelcontrol.VideoTransPara K2 = com.tencent.mm.plugin.finder.storage.t70.f127590a.K2();
                d17.f155676n = K2;
                d17.f155679q = 3;
                d17.f155685w = K2.f71195h * 1000;
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_use_timeline_editor, true);
                com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostComponent", "useTimelineEditor: " + fj6);
                if (fj6) {
                    d17.a(4, "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout");
                } else {
                    d17.a(4, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                }
                d17.a(3, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                d17.a(1, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                this.f232792d = d17;
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f232792d;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("media_list", arrayList);
            bundle.putString("post_id", this.f232793e);
            recordConfigProvider.M = bundle;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f232792d;
            kotlin.jvm.internal.o.d(recordConfigProvider2);
            boolean aj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).aj();
            ut3.m mVar = ut3.m.f431182a;
            if (aj6) {
                com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostComponent", "isMovieComposingEnabled = true");
                mVar.h(getContext(), 1001, 0, 0, recordConfigProvider2, i17, 0, false, null, false, false);
                return;
            }
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderPostComponent", "isMovieComposingEnabled = false");
            mVar.f(getContext(), 1001, 0, 0, recordConfigProvider2, i17, 0);
            java.lang.Runnable runnable = this.f232795g;
            android.os.Handler handler = this.f232794f;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
                this.f232795g = null;
            }
            di5.a aVar = new di5.a(this);
            this.f232795g = aVar;
            handler.postDelayed(aVar, 200L);
        } catch (java.lang.Exception e18) {
            dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.p0c), 1).show();
            com.tencent.mars.xlog.Log.e("MediaGallery.FinderPostComponent", "read file error:" + e18);
        }
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        byte[] byteArray;
        byte[] byteArray2;
        byte[] byteArray3;
        byte[] byteArray4;
        java.util.ArrayList parcelableArrayList;
        byte[] byteArray5;
        byte[] byteArray6;
        if (captureDataManager$CaptureVideoNormalModel != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_POST_ENTERSCENE", this.f232796h);
            if (bundle != null && (byteArray6 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) != null) {
                intent.putExtra("MEDIA_EXTRA_MUSIC", byteArray6);
            }
            if (bundle != null && (byteArray5 = bundle.getByteArray("ORIGIN_MUSIC_INFO")) != null) {
                intent.putExtra("ORIGIN_MUSIC_INFO", byteArray5);
            }
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_ID");
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_PATH");
            pm0.v.l(intent, bundle, "ORIGIN_BGM_URL");
            pm0.v.e(intent, bundle, "MEDIA_IS_MUTE", false, 4, null);
            pm0.v.e(intent, bundle, "MUSIC_IS_MUTE", false, 4, null);
            pm0.v.h(intent, bundle, "SOUND_TRACK_TYPE", 0, 4, null);
            pm0.v.l(intent, bundle, "MUSIC_FEED_ID");
            if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("KEY_POST_HALF_RECT_LIST")) != null) {
                intent.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
            }
            pm0.v.i(intent, bundle, "key_ref_feed_id", 0L, 4, null);
            pm0.v.h(intent, bundle, "key_ref_enter_scene", 0, 4, null);
            pm0.v.l(intent, bundle, "KEY_POST_VIDEO_TITLE");
            pm0.v.e(intent, bundle, "KEY_POST_ASSETS_IS_REAL_SHOOT", false, 4, null);
            java.util.ArrayList arrayList = (java.util.ArrayList) captureDataManager$CaptureVideoNormalModel.a().b("KEY_IMAGE_QUALITY_INT_ARRAY", new java.util.ArrayList());
            java.util.List<java.lang.String> list = captureDataManager$CaptureVideoNormalModel.f155666m;
            if (list == null || list.size() <= 0) {
                if (bundle != null && (byteArray = bundle.getByteArray("video_composition")) != null) {
                    intent.putExtra("video_composition", byteArray);
                }
                intent.putExtra("postType", 4);
                intent.putExtra("postMediaList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155661e));
                boolean z17 = true;
                intent.putExtra("postTypeList", kz5.c0.d(4));
                intent.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
                if (arrayList != null && arrayList.size() == 1) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                java.lang.String string = bundle != null ? bundle.getString("KEY_POST_MIAOJIAN_TONGKUAN_META") : null;
                if (string != null && string.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    intent.putExtra("KEY_POST_MIAOJIAN_TONGKUAN_META", string);
                    if (intent.getIntExtra("KEY_POST_FROM_APP_SOURCE", 0) == 0) {
                        intent.putExtra("KEY_POST_FROM_APP_SOURCE", 4);
                    }
                }
            } else {
                intent.putExtra("postType", 2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) it.next());
                }
                intent.putExtra("postMediaList", arrayList2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str : list) {
                    arrayList3.add(2);
                }
                intent.putExtra("postTypeList", arrayList3);
                intent.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
                if (arrayList != null && arrayList.size() == list.size()) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                pm0.v.j(intent, bundle, "KEY_POST_HALF_IMAGE_LIST");
            }
            intent.putExtra("post_id", this.f232793e);
            intent.putExtra("edit_id", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_ID", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_LIKE_FINDER_FEED_ID", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b17 = captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_TYPE_INT", 0);
            kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
            intent.putExtra("KEY_MUSIC_TYPE", ((java.lang.Number) b17).intValue());
            intent.putExtra("KEY_MUSIC_SESSION_BUFFER", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_SESSION_BUFFER", ""));
            pm0.v.l(intent, bundle, "KEY_POST_ORIGIN_FILE_PATH");
            pm0.v.e(intent, bundle, "isLongVideoPost", false, 4, null);
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", bundle != null ? bundle.getByteArray("KEY_POST_VIDEO_TEMPLATE") : null);
            intent.putExtra("KEY_POST_VIDEO_COVER_START_TIME", bundle != null ? java.lang.Double.valueOf(bundle.getDouble("KEY_POST_VIDEO_COVER_START_TIME")) : null);
            if (bundle != null && (byteArray4 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE", byteArray4);
            }
            if (bundle != null && (byteArray3 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_JSON")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_JSON", byteArray3);
            }
            if (bundle != null && (byteArray2 = bundle.getByteArray("KEY_POST_ASSET_INFO")) != null) {
                intent.putExtra("KEY_POST_ASSET_INFO", byteArray2);
            }
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1);
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            intent.removeExtra("KEY_FROM_SHOOT_COMPOSING");
            ((w40.e) i95.n0.c(w40.e.class)).getClass();
            qs2.v.f366327a.e(getContext(), intent);
        }
        ut3.f.f431176c.f431177a = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ut3.f.f431176c.f431177a = null;
        java.lang.Runnable runnable = this.f232795g;
        if (runnable != null) {
            this.f232794f.removeCallbacks(runnable);
            this.f232795g = null;
        }
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }
}
