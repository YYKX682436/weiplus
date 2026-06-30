package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/Image2VideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lju3/d0;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class Image2VideoPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout {
    public yt3.y0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Image2VideoPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout
    public android.view.View getPlayerView() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView = new com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView(context);
        storyFakeVideoPlayView.setAlpha(0.0f);
        com.tencent.mars.xlog.Log.i("MicroMsg.Image2VideoPluginLayout", "playerView :" + storyFakeVideoPlayView);
        yt3.y0 y0Var = new yt3.y0(storyFakeVideoPlayView, this);
        this.D = y0Var;
        getPluginList().add(y0Var);
        return storyFakeVideoPlayView;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public boolean onBackPress() {
        if (super.onBackPress()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Image2VideoPluginLayout", "onBackPress");
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
        it3.y navigator = getNavigator();
        if (navigator == null) {
            return true;
        }
        it3.y.a(navigator, 0, null, 2, null);
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        int size;
        super.r(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.Image2VideoPluginLayout", "loadCurrentPage info " + bVar);
        if (bVar != null) {
            yt3.y0 y0Var = this.D;
            if (y0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoToVideoPlugin", "start preview " + bVar);
                y0Var.f465723e = bVar;
                boolean z17 = false;
                y0Var.f465722d.setVisibility(0);
                y0Var.f465722d.setAlpha(0.0f);
                y0Var.f465722d.setCallback(y0Var.f465724f);
                com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView storyFakeVideoPlayView = y0Var.f465722d;
                java.util.ArrayList imageList = bVar.f222214k;
                storyFakeVideoPlayView.getClass();
                kotlin.jvm.internal.o.g(imageList, "imageList");
                com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
                wu3.c2 c2Var = storyFakeVideoPlayView.f156093m;
                if (c2Var != null) {
                    java.util.List list = storyFakeVideoPlayView.f156094n;
                    if (list != null && list.size() == imageList.size() && (size = imageList.size() - 1) >= 0) {
                        for (int i17 = 0; com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) imageList.get(i17), (java.lang.String) list.get(i17)); i17++) {
                            if (i17 != size) {
                            }
                        }
                        if (z17 || c2Var.f449722e) {
                            c2Var.f449722e = true;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "play same imagelist, do nothing");
                        }
                    }
                    z17 = true;
                    if (z17) {
                    }
                    c2Var.f449722e = true;
                }
                storyFakeVideoPlayView.f156094n = imageList;
                storyFakeVideoPlayView.f156093m = new wu3.c2(storyFakeVideoPlayView, imageList);
                ku5.u0 u0Var = ku5.t0.f312615d;
                wu3.c2 c2Var2 = storyFakeVideoPlayView.f156093m;
                kotlin.jvm.internal.o.d(c2Var2);
                ((ku5.t0) u0Var).q(c2Var2);
            }
            yt3.r4 reMuxPlugin = getReMuxPlugin();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
            kotlin.jvm.internal.o.d(configProvider);
            reMuxPlugin.j(bVar, configProvider);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        int i17;
        java.util.ArrayList arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        ct0.b bVar;
        kotlin.jvm.internal.o.g(status, "status");
        if (status != ju3.c0.f301885l1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Image2VideoPluginLayout", "statusChange " + status + " ,param : " + bundle);
        }
        int ordinal = status.ordinal();
        if (ordinal != 61) {
            if (ordinal == 65) {
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
                boolean c17 = getAddMusicPlugin().c();
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = getAddMusicPlugin().f294998n;
                java.util.ArrayList d17 = getItemContainerPlugin().d(null);
                java.util.ArrayList c18 = getItemContainerPlugin().c();
                float[] b17 = getItemContainerPlugin().b();
                yt3.y0 y0Var = this.D;
                if (y0Var == null || (bVar = y0Var.f465723e) == null || (arrayList = bVar.f222214k) == null) {
                    arrayList = new java.util.ArrayList();
                }
                st3.s sVar = new st3.s(c17, audioCacheInfo, d17, c18, b17, 0, 0, arrayList, null, getItemContainerPlugin().g(), 256, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.Image2VideoPluginLayout", "edit config: " + sVar);
                getReMuxPlugin().m(sVar);
                nu3.i iVar = nu3.i.f340218a;
                iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().e()));
                iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(getItemContainerPlugin().f()));
                iVar.n("KEY_SELECT_MUSIC_INT", java.lang.Integer.valueOf(getAddMusicPlugin().f294998n == null ? 0 : 1));
                iVar.n("KEY_SELECT_ORIGIN_INT", java.lang.Integer.valueOf(!getAddMusicPlugin().c() ? 1 : 0));
                iVar.n("KEY_AFTER_EDIT_INT", 1);
                iVar.h();
                java.util.Iterator it = getItemContainerPlugin().c().iterator();
                int i19 = 0;
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zu3.a aVar = (zu3.a) it.next();
                    int ordinal2 = aVar.f475758a.ordinal();
                    if (ordinal2 == 0) {
                        i27++;
                    } else if (ordinal2 == 1) {
                        i19++;
                    } else if (ordinal2 == 2) {
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
                    } else if (ordinal2 == 3) {
                        nu3.i.f340221d.B = 1L;
                    } else if (ordinal2 == 4) {
                        nu3.i.f340221d.A = 1L;
                    }
                }
                com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct4 = nu3.i.f340221d;
                storyDoPublishStruct4.f60877l = i19;
                storyDoPublishStruct4.f60878m = i27;
                storyDoPublishStruct4.f60889x = getMoreMenuPlugin().f465432m ? 1L : 0L;
                com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct5 = nu3.i.f340221d;
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = getAddMusicPlugin().f294998n;
                storyDoPublishStruct5.f60888w = (audioCacheInfo2 != null && audioCacheInfo2.f155719p == 4) == true ? 1L : 0L;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                ct0.b captureInfo = getCaptureInfo();
                if (captureInfo != null && (arrayList2 = captureInfo.f222214k) != null) {
                    for (java.lang.String str : arrayList2) {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(options);
                        arrayList3.add(str);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(obj, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/Image2VideoPluginLayout", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList3.get(0), (android.graphics.BitmapFactory.Options) arrayList3.get(1)), "com/tencent/mm/plugin/recordvideo/plugin/parent/Image2VideoPluginLayout", "prepareImageSizeReport", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                        int i28 = options.outWidth;
                        sb8.append(options.outHeight + ':' + i28 + "||");
                    }
                }
                int lastIndexOf = sb8.lastIndexOf("||");
                if (lastIndexOf >= 0) {
                    com.tencent.mm.autogen.mmdata.rpt.StoryDoPublishStruct storyDoPublishStruct6 = nu3.i.f340221d;
                    storyDoPublishStruct6.C = storyDoPublishStruct6.b("PhotoWidthHeightScales", sb8.substring(0, lastIndexOf).toString(), true);
                }
                nu3.i iVar2 = nu3.i.f340218a;
                iVar2.d(13);
                nu3.i.f340221d.f60874i = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
                iVar2.g(configProvider != null ? configProvider.F : 0);
                return;
            }
            super.w(status, bundle);
        }
    }
}
