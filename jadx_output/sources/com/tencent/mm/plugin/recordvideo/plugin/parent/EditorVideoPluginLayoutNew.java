package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lju3/d0;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class EditorVideoPluginLayoutNew extends com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorVideoPluginLayoutNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout
    public android.view.View getPlayerView() {
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditorVideoPlayView editorVideoPlayView = new com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditorVideoPlayView(getContext());
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "playerView :" + editorVideoPlayView);
        setPreviewPlugin(new yt3.o1(editorVideoPlayView, this, (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyh)));
        getPluginList().add(getPreviewPlugin());
        return editorVideoPlayView;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        if (!super.onBackPress()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "onBackPress");
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_AFTER_EDIT_INT", 0);
            iVar.h();
            java.util.Iterator<T> it = getItemContainerPlugin().f465732d.getAllItemViews().iterator();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zu3.n nVar = (zu3.n) it.next();
                if (nVar instanceof zu3.l) {
                    i17++;
                } else if (nVar instanceof zu3.b0) {
                    i18++;
                } else if (nVar instanceof zu3.z) {
                    nu3.i.f340224g.f60954n = 1L;
                } else if (!(nVar instanceof zu3.v) && (nVar instanceof zu3.c0)) {
                    nu3.i.f340224g.f60961u = 1L;
                }
            }
            nu3.i.f340224g.f60958r = getMoreMenuPlugin().f465432m ? 1L : 0L;
            com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct storyQuitPublishStruct = nu3.i.f340224g;
            storyQuitPublishStruct.f60951k = i17;
            storyQuitPublishStruct.f60952l = i18;
            ct0.b captureInfo = getCaptureInfo();
            if (captureInfo != null && captureInfo.f222206c) {
                ((ku5.t0) ku5.t0.f312615d).g(new ju3.b0(this));
            }
            getPreviewPlugin().reset();
            it3.y navigator = getNavigator();
            if (navigator != null) {
                it3.y.a(navigator, 0, null, 2, null);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void onDetach() {
        super.onDetach();
        nu3.i.f340218a.a("MEDIA_EDIT_PAGE_STAYTIME_LONG", getBrowserTimeMs());
        dx1.g.f244489a.j("SnsPublishProcess", "mediaEditPageStaytime_", java.lang.Long.valueOf(getBrowserTimeMs()), bx1.u.f36310e);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        dw3.d0 a17;
        com.tencent.mm.pluginsdk.ui.e1 e1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "loadCurrentPage info " + bVar);
        super.r(bVar);
        if (bVar != null) {
            dw3.f.f244205c = 0;
            boolean z17 = true;
            if (bVar.a()) {
                dw3.f.f244205c++;
            }
            if (bVar.b()) {
                dw3.f.f244205c++;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            yt3.e1 bgPlugin = getBgPlugin();
            ct0.b captureInfo = getCaptureInfo();
            kotlin.jvm.internal.o.d(captureInfo);
            bgPlugin.a(captureInfo, getConfigProvider());
            yt3.o1 previewPlugin = getPreviewPlugin();
            ct0.b captureInfo2 = getCaptureInfo();
            kotlin.jvm.internal.o.d(captureInfo2);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
            previewPlugin.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", "start preview " + captureInfo2);
            previewPlugin.f465564i = captureInfo2;
            previewPlugin.f465565m = configProvider != null ? configProvider.f155685w : 10000;
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = previewPlugin.f465559d;
            fp.e eVar = new fp.e(videoPlayerTextureView != null ? videoPlayerTextureView.getContext() : null);
            previewPlugin.f465561f = eVar;
            eVar.b();
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.setVisibility(0);
            }
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.setAlpha(0.0f);
            }
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.setVideoPath(captureInfo2.d());
            }
            if ((configProvider != null ? kotlin.jvm.internal.o.b(configProvider.f155680r, java.lang.Boolean.TRUE) : false) && (a17 = dw3.e0.f244202a.a(captureInfo2.d())) != null) {
                int i17 = a17.f244191b;
                int i18 = a17.f244190a;
                int i19 = a17.f244193d;
                boolean z19 = i19 == 0 || i19 == 180 ? i18 > i17 : i17 > i18;
                com.tencent.mm.pluginsdk.ui.e1 e1Var2 = com.tencent.mm.pluginsdk.ui.e1.DEFAULT;
                if (configProvider == null || (e1Var = configProvider.f155678p) == e1Var2) {
                    if (!z19) {
                        if (videoPlayerTextureView != null) {
                            videoPlayerTextureView.setForceScaleFullScreen(true);
                        }
                        if (videoPlayerTextureView != null) {
                            videoPlayerTextureView.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                        }
                    } else if (videoPlayerTextureView != null) {
                        videoPlayerTextureView.setScaleType(e1Var2);
                    }
                } else if (videoPlayerTextureView != null) {
                    videoPlayerTextureView.setScaleType(e1Var);
                }
                previewPlugin.f465569q = true;
            }
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.setVideoCallback(previewPlugin.f465571s);
            }
            previewPlugin.f465567o = captureInfo2.f222207d;
            previewPlugin.f465568p = captureInfo2.f222208e;
            android.widget.TextView textView = previewPlugin.f465560e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView != null && z65.c.a()) {
                di3.u.f232763a.postToWorker(new yt3.j1(previewPlugin, textView));
            }
            android.os.SystemClock.elapsedRealtime();
            yt3.r4 reMuxPlugin = getReMuxPlugin();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider2 = getConfigProvider();
            kotlin.jvm.internal.o.d(configProvider2);
            reMuxPlugin.j(bVar, configProvider2);
            android.os.SystemClock.elapsedRealtime();
            au3.l cropVideoPlugin = getCropVideoPlugin();
            ct0.b captureInfo3 = getCaptureInfo();
            kotlin.jvm.internal.o.d(captureInfo3);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider3 = getConfigProvider();
            kotlin.jvm.internal.o.d(configProvider3);
            cropVideoPlugin.getClass();
            cropVideoPlugin.f14119o = captureInfo3;
            cropVideoPlugin.f14120p = configProvider3;
            android.os.SystemClock.elapsedRealtime();
            android.os.Bundle bundle = bVar.f222217n;
            if (bundle != null) {
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("AUDIO_CACHE_INFO_LIST_KEY");
                android.os.Bundle bundle2 = bVar.f222217n;
                kotlin.jvm.internal.o.d(bundle2);
                int i27 = bundle2.getInt("AUDIO_CACHE_INFO_INDEX_KEY", 0);
                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                    iu3.e addMusicPlugin = getAddMusicPlugin();
                    addMusicPlugin.getClass();
                    addMusicPlugin.b().addAudioListForAudioCache(i27, parcelableArrayList);
                }
            }
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_MEDIA_TYPE_INT", 2);
            iVar.n("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", java.lang.Integer.valueOf(bVar.f222208e));
            iVar.n("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar.n("KEY_EDIT_PUBLISHID_INT", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            iVar.n("KEY_EDIT_SESSION_ID", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            nu3.e eVar2 = nu3.e.f340198a;
            java.lang.Object b17 = iVar.l().b("KEY_EDIT_SESSION_ID", 0L);
            kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
            nu3.e.f340201d = ((java.lang.Number) b17).longValue();
            nu3.i.f340221d.f60873h = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct = nu3.i.f340221d;
            java.util.ArrayList arrayList = bVar.f222214k;
            storyDoPublishStruct.f60890y = !(arrayList == null || arrayList.isEmpty()) ? 1L : 2L;
            nu3.i.f340221d.f60891z = bVar.f222214k.size();
            com.tencent.mm.autogen.mmdata.rpt.StoryQuitPublishStruct storyQuitPublishStruct = nu3.i.f340224g;
            java.util.ArrayList arrayList2 = bVar.f222214k;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z17 = false;
            }
            storyQuitPublishStruct.f60959s = z17 ? 2L : 1L;
            nu3.i.f340224g.f60960t = bVar.f222214k.size();
            if (bVar.f222206c) {
                nu3.m mVar = nu3.m.f340229a;
                mVar.q(bVar.f222204a);
                mVar.r(bVar.f222209f);
            } else {
                nu3.m.f340229a.o(bVar.f222204a);
            }
            nu3.m.f340229a.f(getConfigProvider());
            ct0.b captureInfo4 = getCaptureInfo();
            kotlin.jvm.internal.o.d(captureInfo4);
            if (captureInfo4.f222206c) {
                return;
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider4 = getConfigProvider();
            if ((configProvider4 != null ? configProvider4.F : 0) > 0) {
                iVar.n("KEY_MEDIA_SOURCE_INT", 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        int i17;
        java.util.ArrayList<java.lang.String> arrayList;
        kotlin.jvm.internal.o.g(status, "status");
        ju3.c0 c0Var = ju3.c0.f301885l1;
        if (status != c0Var) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "statusChange " + status + " ,param : " + bundle);
        }
        if (ju3.a0.f301860a[status.ordinal()] != 1) {
            if (status != c0Var) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorVideoPluginLayoutNew", "unknown status " + status);
            }
            super.w(status, bundle);
            return;
        }
        java.lang.String b17 = getBgPlugin().b();
        getPreviewPlugin().release();
        getItemContainerPlugin().onPause();
        getAddMusicPlugin().onPause();
        if (getMoreMenuPlugin().f465432m) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            i17 = 1;
        } else {
            i17 = 0;
        }
        ut3.f fVar = ut3.f.f431176c;
        fVar.f431178b.putInt("key_extra_feature_flag", i17);
        int i18 = getMoreMenuPlugin().f465433n;
        android.os.Bundle bundle2 = fVar.f431178b;
        if (i18 == 2) {
            bundle2.putString("key_group_list", getMoreMenuPlugin().a());
        } else if (getMoreMenuPlugin().f465433n == 3) {
            bundle2.putString("key_black_list", getMoreMenuPlugin().a());
        }
        st3.s sVar = new st3.s(getAddMusicPlugin().c(), getAddMusicPlugin().f294998n, getItemContainerPlugin().d(null), getItemContainerPlugin().c(), getItemContainerPlugin().b(), getPreviewPlugin().f465567o, getPreviewPlugin().f465568p, new java.util.ArrayList(), b17, getItemContainerPlugin().g());
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "edit config: " + sVar);
        nu3.m mVar = nu3.m.f340229a;
        int[] iArr = new int[3];
        iArr[0] = getItemContainerPlugin().e();
        iArr[1] = getItemContainerPlugin().f();
        iArr[2] = getAddMusicPlugin().f294998n == null ? 0 : 1;
        mVar.g(iArr);
        getReMuxPlugin().m(sVar);
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().e()));
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().f()));
        iVar.n("KEY_SELECT_MUSIC_INT", java.lang.Integer.valueOf(getAddMusicPlugin().f294998n == null ? 0 : 1));
        iVar.n("KEY_SELECT_ORIGIN_INT", java.lang.Integer.valueOf(!getAddMusicPlugin().c() ? 1 : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        java.util.Iterator it = getItemContainerPlugin().c().iterator();
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zu3.a aVar = (zu3.a) it.next();
            int ordinal = aVar.f475758a.ordinal();
            if (ordinal == 0) {
                i27++;
            } else if (ordinal == 1) {
                i19++;
            } else if (ordinal == 2) {
                com.tencent.mm.protobuf.f protoBuf = aVar.toProtoBuf();
                kotlin.jvm.internal.o.e(protoBuf, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LocationItemData");
                r45.gd4 gd4Var = (r45.gd4) protoBuf;
                com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct = nu3.i.f340221d;
                java.lang.String cityName = gd4Var.f375133d;
                kotlin.jvm.internal.o.f(cityName, "cityName");
                java.lang.String poiName = gd4Var.f375134e;
                kotlin.jvm.internal.o.f(poiName, "poiName");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (!android.text.TextUtils.isEmpty(cityName)) {
                    sb6.append(r26.i0.t(cityName, ",", " ", true));
                }
                if (!android.text.TextUtils.isEmpty(poiName)) {
                    if ((sb6.length() > 0) != false) {
                        sb6.append("|");
                    }
                    sb6.append(r26.i0.t(poiName, ",", " ", true));
                }
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                storyDoPublishStruct.f60881p = storyDoPublishStruct.b("PositionInfo", sb7, true);
                com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct2 = nu3.i.f340221d;
                storyDoPublishStruct2.f60883r = storyDoPublishStruct2.b("PositionLatitude", java.lang.String.valueOf(gd4Var.f375137h), true);
                com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct3 = nu3.i.f340221d;
                storyDoPublishStruct3.f60884s = storyDoPublishStruct3.b("PositionLongitude", java.lang.String.valueOf(gd4Var.f375136g), true);
            } else if (ordinal == 3) {
                nu3.i.f340221d.B = 1L;
            } else if (ordinal == 4) {
                nu3.i.f340221d.A = 1L;
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct4 = nu3.i.f340221d;
        storyDoPublishStruct4.f60877l = i19;
        storyDoPublishStruct4.f60878m = i27;
        storyDoPublishStruct4.f60889x = getMoreMenuPlugin().f465432m ? 1L : 0L;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        ct0.b captureInfo = getCaptureInfo();
        if (captureInfo != null && (arrayList = captureInfo.f222214k) != null) {
            for (java.lang.String str : arrayList) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(options);
                arrayList2.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList2.get(0), (android.graphics.BitmapFactory.Options) arrayList2.get(1)), "com/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                int i28 = options.outWidth;
                sb8.append(options.outHeight + ':' + i28 + "||");
            }
        }
        int lastIndexOf = sb8.lastIndexOf("||");
        if (lastIndexOf >= 0) {
            com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct5 = nu3.i.f340221d;
            storyDoPublishStruct5.C = storyDoPublishStruct5.b("PhotoWidthHeightScales", sb8.substring(0, lastIndexOf).toString(), true);
        }
        nu3.i iVar2 = nu3.i.f340218a;
        iVar2.d(13);
        nu3.i.f340221d.f60874i = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        iVar2.g(configProvider != null ? configProvider.F : 0);
        iVar2.h();
        wt3.v vVar = wt3.v.f449505i;
        if (vVar != null) {
            vVar.e();
        }
    }
}
