package com.tencent.wechat.aff.wenote;

/* loaded from: classes12.dex */
class ZIDL_qgniI8ycsB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.wenote.i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.wenote.j f217673a;

    public ZIDL_qgniI8ycsB(java.lang.Object obj) {
        com.tencent.wechat.aff.wenote.j jVar = (com.tencent.wechat.aff.wenote.j) obj;
        this.f217673a = jVar;
        ((dz4.j0) jVar).f245310b = this;
    }

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BU(long j17, long j18, byte[] bArr);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18);

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FI(long j17, byte[] bArr, byte[] bArr2);

    private native void ZIDL_GX(long j17, long j18);

    private native void ZIDL_HX(long j17, long j18);

    private native void ZIDL_IX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_JX(long j17, long j18, byte[] bArr);

    private native void ZIDL_KX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_LBX(long j17, long j18, byte[] bArr);

    private native void ZIDL_LX(long j17, long j18, byte[] bArr);

    private native void ZIDL_OX(long j17, long j18);

    private native void ZIDL_PBX(long j17, long j18, boolean z17);

    private native void ZIDL_QX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_RI(long j17);

    private native void ZIDL_SI(long j17, byte[] bArr);

    private native void ZIDL_TI(long j17, boolean z17);

    private native void ZIDL_UI(long j17, byte[] bArr);

    private native void ZIDL_VI(long j17);

    private native void ZIDL_WX(long j17, long j18, byte[] bArr);

    @Override // com.tencent.wechat.aff.wenote.i
    public void A1(long j17, com.tencent.wechat.aff.favorites.o oVar) {
        ZIDL_BU(this.nativeHandler, j17, oVar.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void D1(long j17, java.util.ArrayList arrayList) {
        ZIDL_KX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void E1(long j17, boolean z17) {
        ZIDL_PBX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void J0(long j17, com.tencent.wechat.aff.favorites.j jVar) {
        ZIDL_JX(this.nativeHandler, j17, jVar.toByteArrayOrNull());
    }

    public void Q1(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void T0(boolean z17) {
        ZIDL_TI(this.nativeHandler, z17);
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void U0(long j17, com.tencent.wechat.aff.favorites.f fVar) {
        ZIDL_LX(this.nativeHandler, j17, fVar.toByteArrayOrNull());
    }

    public void ZIDL_AB(byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.wenote.j jVar = this.f217673a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        dz4.j0 j0Var = (dz4.j0) jVar;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.t(j0Var, str, str2));
    }

    public void ZIDL_AV(long j17, double d17, double d18, double d19, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        dz4.z2 z2Var;
        android.app.Activity activity;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str3 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null || (z2Var = (dz4.z2) ((jz5.n) ((ez4.u) pVar).f257950i).getValue()) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = ((ez4.u) z2Var.f245476a).f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterLocationHelper", "handleLocationShow failed, Activity is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kwebmap_slat", d18);
        intent.putExtra("kwebmap_lng", d17);
        intent.putExtra("kPoiName", str2);
        intent.putExtra("Kwebmap_locaion", str);
        intent.putExtra("kwebmap_scale", 0);
        intent.putExtra("kPoiid", str3);
        intent.putExtra("KIsFromPoiList", false);
        intent.putExtra("KPoiCategoryTips", "");
        intent.putExtra("kPoiBusinessHour", "");
        intent.putExtra("KPoiPhone", "");
        intent.putExtra("KPoiPriceTips", 0.0f);
        intent.putExtra("kBuildingID", "");
        intent.putExtra("kFloorName", "");
        intent.putExtra("kisUsername", false);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("map_view_type", 12);
        intent.putExtra("kFavInfoLocalId", -1);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        j45.l.n(activity, ya.b.LOCATION, ".ui.RedirectUI", intent, 1);
    }

    public void ZIDL_BB(long j17) {
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickNoteEditTag: holder null");
            return;
        }
        ez4.u uVar = (ez4.u) pVar;
        java.lang.ref.WeakReference weakReference = uVar.f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickNoteEditTag: activity null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_fav_scene", 2);
        intent.putExtra("key_fav_item_id", uVar.f257942a.f245293d);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(activity, ".ui.FavTagEditUI", intent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ZIDL_BV(long r34, byte[] r36) {
        /*
            Method dump skipped, instructions count: 1697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsB.ZIDL_BV(long, byte[]):void");
    }

    public void ZIDL_CB(boolean z17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.wenote.j jVar = this.f217673a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        dz4.j0 j0Var = (dz4.j0) jVar;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.u(j0Var, z17, str, str2));
    }

    public void ZIDL_CV(long j17, byte[] bArr, byte[] bArr2) {
        boolean z17;
        com.tencent.wechat.aff.wenote.i iVar;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null || com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "pauseVoiceAsync: failed");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "pauseVoiceAsync: " + str + ", " + str2);
        dz4.k4 k4Var = (dz4.k4) ((jz5.n) ((ez4.u) pVar).f257949h).getValue();
        k4Var.getClass();
        java.lang.String str3 = "pausePlay: key=" + str + ", path=" + str2 + ", currentPlayingPath=" + k4Var.f245329d;
        java.lang.String str4 = k4Var.f245326a;
        com.tencent.mars.xlog.Log.i(str4, str3);
        fz4.m mVar = (fz4.m) ((java.util.LinkedHashMap) k4Var.f245327b).get(str2);
        if (mVar == null) {
            com.tencent.mars.xlog.Log.w(str4, "pausePlay: voiceHelper not found for path=".concat(str2));
        } else {
            boolean g17 = mVar.g();
            com.tencent.mars.xlog.Log.i(str4, "pausePlay: voiceHelper.isPlay=" + g17 + ", isPause=" + mVar.f());
            java.util.Map map = k4Var.f245328c;
            if (!g17) {
                com.tencent.mars.xlog.Log.w(str4, "pausePlay: voiceHelper is not playing, skip pause");
                dz4.l lVar = (dz4.l) ((java.util.LinkedHashMap) map).get(str2);
                if (lVar != null) {
                    lVar.a(str);
                }
                if (kotlin.jvm.internal.o.b(k4Var.f245329d, str2)) {
                    com.tencent.mars.xlog.Log.i(str4, "pausePlay: clearing currentPlayingPath from " + k4Var.f245329d + " to null (not playing)");
                    k4Var.f245329d = null;
                }
            } else if (mVar.h()) {
                dz4.l lVar2 = (dz4.l) ((java.util.LinkedHashMap) map).get(str2);
                if (lVar2 != null) {
                    lVar2.a(str);
                }
                if (kotlin.jvm.internal.o.b(k4Var.f245329d, str2)) {
                    com.tencent.mars.xlog.Log.i(str4, "pausePlay: clearing currentPlayingPath from " + k4Var.f245329d + " to null");
                    k4Var.f245329d = null;
                }
                z17 = true;
                if (z17 || (iVar = j0Var.f245310b) == null) {
                }
                ((com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsB) iVar).Q1(j17);
                return;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public byte[] ZIDL_DB(long j17, long j18) {
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        j0Var.getClass();
        com.tencent.wechat.aff.wenote.f fVar = new com.tencent.wechat.aff.wenote.f();
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "getCurrentMoreActionSheetState: holder null");
        } else {
            ez4.u uVar = (ez4.u) pVar;
            com.tencent.mm.plugin.wenote.multitask.e eVar = uVar.a().f245466d;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = eVar != null ? eVar.f300077a : null;
            fVar.f217687d = (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() || multiTaskInfo == null) ? false : ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
            boolean[] zArr = fVar.f217690g;
            zArr[1] = true;
            fVar.f217688e = ((dz4.b1) ((jz5.n) uVar.f257963v).getValue()).b();
            zArr[2] = true;
        }
        return fVar.toByteArrayOrNull();
    }

    public void ZIDL_DV(long j17) {
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "releaseAudioPlayerAsync: ");
            return;
        }
        dz4.k4 k4Var = (dz4.k4) ((jz5.n) ((ez4.u) pVar).f257949h).getValue();
        com.tencent.mars.xlog.Log.i(k4Var.f245326a, "destroyAll: ");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) k4Var.f245327b;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((fz4.m) ((java.util.Map.Entry) it.next()).getValue()).b();
        }
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) k4Var.f245328c;
        java.util.Iterator it6 = linkedHashMap2.entrySet().iterator();
        while (it6.hasNext()) {
            dz4.l lVar = (dz4.l) ((java.util.Map.Entry) it6.next()).getValue();
            lVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterNoteVoiceProgressMonitor", "release: ");
            lVar.b();
            lVar.f245333d = null;
            lVar.f245330a.removeCallbacksAndMessages(null);
        }
        linkedHashMap.clear();
        linkedHashMap2.clear();
        k4Var.f245329d = null;
    }

    public void ZIDL_EB(long j17) {
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onUserConfirmDeleteNoteAsync: holder null");
            return;
        }
        long j18 = ((ez4.u) pVar).f257942a.f245293d;
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 12;
        z9Var.f8547t = 21;
        z9Var.f8532e = j18;
        z9Var.f8537j = new dz4.x(j18);
        favoriteOperationEvent.e();
    }

    public void ZIDL_EV(long j17, byte[][] bArr, int i17, boolean z17) {
        dz4.a0 a0Var;
        dz4.b3 b3Var;
        android.app.Activity activity;
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.favorites.h.f216777t, bArr);
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        if (z17) {
            j0Var.getClass();
            a0Var = new dz4.a0(j0Var);
        } else {
            a0Var = null;
        }
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null || (b3Var = (dz4.b3) ((jz5.n) ((ez4.u) pVar).f257952k).getValue()) == null) {
            return;
        }
        ez4.u uVar = (ez4.u) b3Var.f245174a;
        java.lang.ref.WeakReference weakReference = uVar.f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterMediaGalleryHelper", "handleMediaGalleryReq failed, Activity is null");
            if (a0Var != null) {
                a0Var.a("", null);
                return;
            }
            return;
        }
        if ((mmpbListUnSerializeFromBasic == null || mmpbListUnSerializeFromBasic.isEmpty()) || mmpbListUnSerializeFromBasic.size() <= i17 || i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterMediaGalleryHelper", "handleMediaGalleryReq: media err");
            if (a0Var != null) {
                a0Var.a("", null);
                return;
            }
            return;
        }
        b3Var.f245176c = a0Var;
        char c17 = 3;
        if (a0Var != null) {
            java.lang.Object obj = mmpbListUnSerializeFromBasic.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.wechat.aff.favorites.h hVar = (com.tencent.wechat.aff.favorites.h) obj;
            java.lang.String str = hVar.f216790s[3] ? hVar.f216780f : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaGalleryHelper", "handleEditMedia path:" + str + " dataId:" + hVar.b());
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(str, "");
            b17.F = 0;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.Map map = uICustomParam.f64779h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            b17.f155677o = uICustomParam;
            b3Var.f245175b = hVar;
            ut3.m.f431182a.f(activity, 4362, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, uVar.f257942a.f245291b ? 3 : 2);
            return;
        }
        com.tencent.wechat.aff.favorites.h hVar2 = (com.tencent.wechat.aff.favorites.h) mmpbListUnSerializeFromBasic.get(0);
        char c18 = '\b';
        java.lang.String str2 = (hVar2.f216790s[8] ? hVar2.f216785n : new com.tencent.wechat.aff.favorites.g()).f216766d ? "task_RecordMsgCDNService" : "task_FavCdnService";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaGalleryHelper", "handleBrowseMedia: mediaAssets.size=" + mmpbListUnSerializeFromBasic.size() + ", showIndex=" + i17);
        int i18 = 0;
        for (java.lang.Object obj2 : mmpbListUnSerializeFromBasic) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.wechat.aff.favorites.h hVar3 = (com.tencent.wechat.aff.favorites.h) obj2;
            com.tencent.wechat.aff.favorites.g gVar = hVar3.f216790s[c18] ? hVar3.f216785n : new com.tencent.wechat.aff.favorites.g();
            boolean[] zArr = hVar3.f216790s;
            if (!com.tencent.mm.vfs.w6.j(zArr[c17] ? hVar3.f216780f : "")) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleBrowseMedia, dataId=");
                sb6.append(hVar3.b());
                sb6.append(", file not exist, path=");
                sb6.append(zArr[c17] ? hVar3.f216780f : "");
                com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterMediaGalleryHelper", sb6.toString());
            }
            if (hVar3.f216781g) {
                java.lang.String str3 = zArr[5] ? hVar3.f216782h : "";
                if (!(str3 == null || str3.length() == 0)) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleBrowseMedia, dataId=");
                    sb7.append(hVar3.b());
                    sb7.append(", video thumb file not exist, path=");
                    sb7.append(zArr[5] ? hVar3.f216782h : "");
                    com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterMediaGalleryHelper", sb7.toString());
                }
            }
            com.tencent.mm.feature.gallery.api.GalleryParams galleryParams = new com.tencent.mm.feature.gallery.api.GalleryParams();
            e60.s0 s0Var = new e60.s0(0L, null, null, null, null, null, 63, null);
            android.app.Activity activity2 = activity;
            s0Var.f249725a = hVar3.f216787p;
            java.lang.String str4 = zArr[11] ? hVar3.f216788q : "";
            kotlin.jvm.internal.o.f(str4, "getFileMd5(...)");
            s0Var.f249730f = str4;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(gVar.f216776q[10] ? gVar.f216775p : "");
            boolean[] zArr2 = gVar.f216776q;
            if (K0) {
                java.lang.String str5 = zArr2[3] ? gVar.f216768f : "";
                kotlin.jvm.internal.o.f(str5, "getCdnAesKey(...)");
                s0Var.f249727c = str5;
                java.lang.String str6 = zArr2[2] ? gVar.f216767e : "";
                kotlin.jvm.internal.o.f(str6, "getCdnFileId(...)");
                s0Var.f249726b = str6;
            } else {
                java.lang.String str7 = zArr2[8] ? gVar.f216773n : "";
                kotlin.jvm.internal.o.f(str7, "getTpAuthKey(...)");
                s0Var.f249728d = str7;
                java.lang.String str8 = zArr2[9] ? gVar.f216774o : "";
                kotlin.jvm.internal.o.f(str8, "getTpAesKey(...)");
                s0Var.f249727c = str8;
                java.lang.String str9 = zArr2[10] ? gVar.f216775p : "";
                kotlin.jvm.internal.o.f(str9, "getTpDataUrl(...)");
                s0Var.f249729e = str9;
                s0Var.f249726b = "";
            }
            java.lang.String str10 = zArr2[4] ? gVar.f216769g : "";
            kotlin.jvm.internal.o.f(str10, "getDownloadPath(...)");
            java.lang.String str11 = zArr[5] ? hVar3.f216782h : "";
            kotlin.jvm.internal.o.f(str11, "getVideoThumbPath(...)");
            e60.v0 v0Var = new e60.v0(str10, str11, hVar3.f216786o, s0Var);
            java.lang.String b18 = hVar3.b();
            kotlin.jvm.internal.o.f(b18, "getDataId(...)");
            galleryParams.f67106e = b18;
            galleryParams.f67107f = ((zh5.l0) ((e60.d1) i95.n0.c(e60.d1.class))).wi(v0Var);
            galleryParams.f67105d = hVar3.f216781g ? 1 : 0;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Media i=");
            sb8.append(i18);
            sb8.append(", htmlId=");
            sb8.append(zArr[12] ? hVar3.f216789r : "");
            sb8.append(", type=");
            sb8.append(galleryParams.f67105d == 0 ? "img" : "video");
            sb8.append(", mediaUri=");
            sb8.append(galleryParams.f67107f);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaGalleryHelper", sb8.toString());
            arrayList.add(galleryParams);
            i18 = i19;
            activity = activity2;
            c18 = '\b';
            c17 = 3;
        }
        android.app.Activity activity3 = activity;
        e60.t0 t0Var = new e60.t0(str2, 2, 24, i17, true, true, null, 64, null);
        ((zh5.l0) ((e60.d1) i95.n0.c(e60.d1.class))).getClass();
        android.content.Intent intent = new android.content.Intent(activity3, (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
        intent.putParcelableArrayListExtra("key_media_gallery_data", new java.util.ArrayList<>(arrayList));
        intent.putExtra("key_media_gallery_config", t0Var);
        pf5.j0.a(intent, zh5.z.class);
        o72.x1.L0(activity3, "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent, null);
    }

    public void ZIDL_FB() {
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.v(j0Var));
    }

    public void ZIDL_GB() {
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.w(j0Var));
    }

    public void ZIDL_GV(long j17, byte[] bArr, byte[] bArr2) {
        java.lang.ref.WeakReference weakReference;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        jz5.f0 f0Var = null;
        android.app.Activity activity = (pVar == null || (weakReference = ((ez4.u) pVar).f257944c) == null) ? null : (android.app.Activity) weakReference.get();
        if (!(activity != null) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openWebpageAsync: failed");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wxa_short_link_launch_scene", "NOTE_FROM_FAV");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(activity);
        j1Var.f191230i = true;
        j1Var.f191226e = true;
        j1Var.f191227f = true;
        j1Var.f191239r = true;
        j1Var.f191236o = true;
        j1Var.f191246y = 1;
        j1Var.f191231j = true;
        j1Var.f191234m = false;
        j1Var.f191232k = false;
        j1Var.f191235n = true;
        j1Var.B = false;
        j1Var.H = bundle;
        j1Var.e(str, 0, false);
        java.util.ArrayList arrayList = j1Var.f191222a;
        kotlin.jvm.internal.o.f(arrayList, "spanAndGetHrefInfoList(...)");
        java.lang.Object Z = kz5.n0.Z(arrayList);
        h0Var.f310123d = Z;
        if (((r35.m3) Z) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "openWebpageAsync: hrefInfo type = " + ((r35.m3) h0Var.f310123d).f369195d);
            pm0.v.X(new dz4.c0(activity, h0Var));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "openWebpageAsync: hrefInfo null");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] ZIDL_HB() {
        /*
            r11 = this;
            com.tencent.wechat.aff.wenote.j r0 = r11.f217673a
            dz4.j0 r0 = (dz4.j0) r0
            ih0.p r0 = r0.f245309a
            if (r0 == 0) goto L80
            ez4.u r0 = (ez4.u) r0
            jz5.g r0 = r0.f257965x
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            dz4.o1 r0 = (dz4.o1) r0
            if (r0 == 0) goto L80
            ku5.u0 r1 = ku5.t0.f312615d
            dz4.l1 r2 = new dz4.l1
            r2.<init>(r0)
            ku5.t0 r1 = (ku5.t0) r1
            r1.B(r2)
            com.tencent.mm.vfs.r7 r0 = com.tencent.mm.vfs.q7.f213141a
            java.lang.String r0 = "noteexportimage"
            com.tencent.mm.vfs.r6 r0 = lp0.b.h0(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r2 = "_temp"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 1
            java.lang.String r1 = com.tencent.mm.vfs.e8.l(r1, r2, r3)
            com.tencent.mm.vfs.z7 r0 = r0.f213166d
            if (r1 == 0) goto L76
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L51
            goto L76
        L51:
            java.lang.String r2 = r0.f213279f
            com.tencent.mm.vfs.z7 r10 = new com.tencent.mm.vfs.z7
            java.lang.String r5 = r0.f213277d
            java.lang.String r6 = r0.f213278e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r2 = 47
            r4.append(r2)
            r4.append(r1)
            java.lang.String r7 = r4.toString()
            java.lang.String r8 = r0.f213280g
            java.lang.String r9 = r0.f213281h
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = r10
        L76:
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.tencent.mm.vfs.w6.i(r0, r3)
            if (r0 != 0) goto L82
        L80:
            java.lang.String r0 = ""
        L82:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsB.ZIDL_HB():byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        if (r14.a(r15, r4) != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ZIDL_HV(long r22, int r24, byte[] r25, byte[] r26, byte[] r27, int r28, byte[] r29, byte[] r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsB.ZIDL_HV(long, int, byte[], byte[], byte[], int, byte[], byte[], byte[]):void");
    }

    public void ZIDL_IB(byte[] bArr) {
        dz4.o1 o1Var;
        com.tencent.wechat.aff.wenote.j jVar = this.f217673a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ih0.p pVar = ((dz4.j0) jVar).f245309a;
        if (pVar == null || (o1Var = (dz4.o1) ((jz5.n) ((ez4.u) pVar).f257965x).getValue()) == null) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = str;
        if (!(str.length() == 0)) {
            com.tencent.mars.xlog.Log.i(o1Var.f245361b, "handleResultForExportAsImage ready, mediaPath " + str + " -> resultPath " + ((java.lang.String) h0Var.f310123d));
            try {
                java.lang.String a17 = q75.c.a("jpg");
                h0Var.f310123d = a17;
                com.tencent.mm.vfs.w6.w(str, a17);
                com.tencent.mars.xlog.Log.i(o1Var.f245361b, "PNG to JPG conversion successful: " + ((java.lang.String) h0Var.f310123d));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(o1Var.f245361b, "PNG to JPG conversion failed: " + e17.getMessage(), e17);
                h0Var.f310123d = null;
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.m1(o1Var, h0Var));
    }

    public void ZIDL_IV(long j17, byte[] bArr) {
        android.app.Activity activity;
        com.tencent.wechat.aff.favorites.i iVar = (com.tencent.wechat.aff.favorites.i) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.favorites.i.f216791m, bArr);
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openPhotoSelectorAsync: failed");
            return;
        }
        dz4.b0 b0Var = new dz4.b0(j17, j0Var);
        dz4.i3 c17 = ((ez4.u) pVar).c();
        java.lang.Integer valueOf = iVar != null ? java.lang.Integer.valueOf(iVar.f216792d) : null;
        c17.getClass();
        java.lang.ref.WeakReference weakReference = ((ez4.u) c17.f245305a).f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterMediaPickHelper", "handleOpenAlbumPicker failed, Activity is null");
            b0Var.a(null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "handleOpenAlbumPicker maxCount: " + valueOf + ", asyncCompressEnabled: " + c17.b());
        c17.f245306b = b0Var;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "handleOpenAlbumPicker maxCount is 0, show max limit tips");
            b0Var.a(null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("max_select_count", valueOf != null ? valueOf.intValue() : 1);
        intent.putExtra("query_source_type", 13);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("show_header_view", true);
        intent.putExtra("send_btn_string", activity.getString(com.tencent.mm.R.string.c__));
        com.tencent.mm.plugin.mmsight.SightParams sightParams = (com.tencent.mm.plugin.mmsight.SightParams) intent.getParcelableExtra("KEY_SIGHT_PARAMS");
        if (sightParams == null) {
            sightParams = new com.tencent.mm.plugin.mmsight.SightParams(4, 0);
        }
        java.lang.String str = "micromsg_" + java.lang.System.currentTimeMillis();
        java.lang.String str2 = lp0.b.m() + str + ".mp4";
        java.lang.String str3 = lp0.b.m() + str + ".jpeg";
        int intExtra = intent.getIntExtra("key_pick_local_media_duration", 60);
        com.tencent.mm.plugin.mmsight.SightParams sightParams2 = new com.tencent.mm.plugin.mmsight.SightParams(4, 1);
        sightParams2.f148818e = 2;
        sightParams2.f148817d = 0;
        if (sightParams2.f148819f == null) {
            sightParams2.f148819f = new com.tencent.mm.modelcontrol.VideoTransPara();
        }
        sightParams2.f148819f.f71195h = intExtra;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(q75.c.d());
        java.lang.String format = java.lang.String.format("%s%d.%s", java.util.Arrays.copyOf(new java.lang.Object[]{"capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sightParams2.a(str, str2, str3, sb6.toString());
        intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
        intent.putExtra("record_video_force_sys_camera", false);
        intent.putExtra("record_video_is_sight_capture", true);
        intent.putExtra("record_video_time_limit", 15000);
        intent.addFlags(67108864);
        intent.putExtra("key_can_select_video_and_pic", !c17.b());
        j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent, 4097);
    }

    public void ZIDL_JB(int i17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onReadyUploadNoteFavItem: failed");
            return;
        }
        ez4.u uVar = (ez4.u) pVar;
        dz4.q3 q3Var = (dz4.q3) ((jz5.n) uVar.f257957p).getValue();
        q3Var.getClass();
        com.tencent.mars.xlog.Log.i(q3Var.f245380b, "onReadyUploadNoteFavItem: favId " + i17 + ", sessionId" + str);
        uVar.f257945d = true;
    }

    public void ZIDL_JV(long j17, boolean z17, boolean z18) {
        android.app.Activity activity;
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "takePhotoAsync: failed");
            return;
        }
        dz4.i0 i0Var = new dz4.i0(j17, j0Var);
        dz4.i3 c17 = ((ez4.u) pVar).c();
        c17.getClass();
        java.lang.ref.WeakReference weakReference = ((ez4.u) c17.f245305a).f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterMediaPickHelper", "handleJumpTakePhoto failed, Activity is null");
            i0Var.a(null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterMediaPickHelper", "handleJumpTakePhoto");
        c17.f245306b = i0Var;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider h17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.h(4);
        h17.f155685w = 15000;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool);
        hashMap.put("plugin_poi", bool);
        hashMap.put("plugin_tip", bool);
        hashMap.put("plugin_menu", bool);
        h17.f155677o = uICustomParam;
        ut3.m.f431182a.c(activity, 4098, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, h17);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ZIDL_KB(byte[] r27) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsB.ZIDL_KB(byte[]):void");
    }

    public void ZIDL_KV(long j17, int i17) {
        android.app.Activity activity;
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openFileSelectorAsync: failed");
            return;
        }
        dz4.y yVar = new dz4.y(j17, j0Var);
        dz4.x1 x1Var = (dz4.x1) ((jz5.n) ((ez4.u) pVar).f257953l).getValue();
        x1Var.getClass();
        java.lang.ref.WeakReference weakReference = ((ez4.u) x1Var.f245451a).f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterFileHelper", "handleJumpFilePicker failed, Activity is null");
            yVar.a(null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterFileHelper", "handleJumpFilePicker");
        if (!fp.i.b()) {
            db5.t7.k(activity, null);
            yVar.a(null);
            return;
        }
        x1Var.f245452b = yVar;
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent.putExtra("INTENT_MAX_SELECT_COUNT", 1);
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new dz4.w1(activity, intent))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterFileHelper", "handleJumpFilePicker needRequestPermission");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4100);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/wenote/flutter/WeNoteFlutterFileHelper", "handleJumpFilePicker", "(Lcom/tencent/mm/plugin/wenote/flutter/IFlutterNoteFilePickReqCallback;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ZIDL_LBV(long r28, byte[] r30) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsB.ZIDL_LBV(long, byte[]):void");
    }

    public void ZIDL_LV(long j17) {
        android.app.Activity activity;
        android.app.Activity activity2;
        android.app.Activity activity3;
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        ih0.p pVar = j0Var.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "openLocationSelectorAsync: failed taskId: " + j17);
            return;
        }
        dz4.z zVar = new dz4.z(j17, j0Var);
        dz4.z2 z2Var = (dz4.z2) ((jz5.n) ((ez4.u) pVar).f257950i).getValue();
        z2Var.getClass();
        ez4.u uVar = (ez4.u) z2Var.f245476a;
        java.lang.ref.WeakReference weakReference = uVar.f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterLocationHelper", "handleLocationClick failed, Activity is null");
            zVar.a(null);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.f9.SessionLocation.k(activity, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterLocationHelper", "handleLocationClick failed, SessionLocation is not available");
            zVar.a(null);
            return;
        }
        java.lang.ref.WeakReference weakReference2 = uVar.f257944c;
        boolean z17 = false;
        if (weakReference2 == null || (activity3 = (android.app.Activity) weakReference2.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterLocationHelper", "Activity is null, cannot check location permission");
        } else {
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
            if (str == null) {
                str = "";
            }
            if (u11.c.f(str)) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (j35.u.d(activity3, "android.permission.ACCESS_FINE_LOCATION", true)) {
                    z17 = true;
                } else {
                    java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                    java.lang.Boolean bool = m17 instanceof java.lang.Boolean ? (java.lang.Boolean) m17 : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        j35.u.i(activity3, "android.permission.ACCESS_FINE_LOCATION", 64);
                    } else {
                        java.lang.String string = activity3.getString(com.tencent.mm.R.string.f492399gh2, com.tencent.mm.sdk.platformtools.m2.d());
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        c71.b.c(activity3, string, 30764, true);
                    }
                }
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                z17 = j35.u.a(activity3, "android.permission.ACCESS_FINE_LOCATION", 64, null, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterLocationHelper", "checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(z17));
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterLocationHelper", "handleLocationClick failed, location permission not granted");
            zVar.a(null);
            return;
        }
        z2Var.f245477b = zVar;
        java.lang.ref.WeakReference weakReference3 = uVar.f257944c;
        if (weakReference3 == null || (activity2 = (android.app.Activity) weakReference3.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeNoteFlutterLocationHelper", "Activity is null, cannot launch location picker");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterLocationHelper", "launchLocationPicker");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
        intent.putExtra("map_view_type", 3);
        j45.l.n(activity2, ya.b.LOCATION, ".ui.RedirectUI", intent, 4099);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (iq.b.e(r2) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ZIDL_M(boolean r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsB.ZIDL_M(boolean, byte[]):boolean");
    }

    public void ZIDL_MB(byte[] bArr) {
        com.tencent.wechat.aff.wenote.e eVar = (com.tencent.wechat.aff.wenote.e) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.wenote.e.f217684f, bArr);
        if (((dz4.j0) this.f217673a).f245309a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onNoteFlutterPageStateChange: holder null");
        } else if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onNoteFlutterPageStateChange: stateNotify null");
        }
    }

    public boolean ZIDL_N(byte[] bArr) {
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "isOnRecording: holder null");
        } else {
            ez4.u uVar = (ez4.u) pVar;
            java.lang.ref.WeakReference weakReference = uVar.f257944c;
            if ((weakReference != null ? (android.app.Activity) weakReference.get() : null) != null) {
                uVar.b().getClass();
                return hz4.b0.a().f286382a;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterWeNoteNativeHelperImpl", "isOnRecording: activity null");
        }
        return false;
    }

    public boolean ZIDL_NB() {
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onCheckInterceptNotePageExit: holder null");
            return false;
        }
        ez4.u uVar = (ez4.u) pVar;
        if (uVar.f257946e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "onCheckInterceptFlutterNotePageExit: onConfigurationChanging");
        } else if (!uVar.a().a(false)) {
            return false;
        }
        return true;
    }

    public void ZIDL_OB(boolean z17) {
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onChangeEnablePageEdgeDragGesture: holder null");
            return;
        }
        java.lang.ref.WeakReference weakReference = ((ez4.u) pVar).f257944c;
        android.content.Context context = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        com.tencent.mm.ui.vas.VASActivity vASActivity = context instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context : null;
        if (vASActivity != null) {
            vASActivity.enableSwipeBackGesture(z17);
        }
    }

    public void ZIDL_OV(long j17, int i17) {
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.h0(j0Var, i17));
    }

    public void ZIDL_P() {
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.n(j0Var));
    }

    public void ZIDL_PBV(long j17) {
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.s(j0Var, j17));
    }

    public void ZIDL_QV(long j17) {
        dz4.j0 j0Var = (dz4.j0) this.f217673a;
        j0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new dz4.r(j0Var, j17));
    }

    public void ZIDL_WV(long j17, byte[] bArr) {
        android.app.Activity activity;
        com.tencent.wechat.aff.favorites.d dVar = (com.tencent.wechat.aff.favorites.d) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.favorites.d.f216748i, bArr);
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "isOnRecording: holder null");
            return;
        }
        dz4.u2 u2Var = (dz4.u2) ((jz5.n) ((ez4.u) pVar).f257958q).getValue();
        ez4.u uVar = (ez4.u) u2Var.f245426a;
        java.lang.ref.WeakReference weakReference = uVar.f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "handleForwardToConversation: context null");
            return;
        }
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "handleForwardToConversation: invalid parameters");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleForwardToConversation: ");
        boolean[] zArr = dVar.f216753h;
        sb6.append(zArr[3] ? dVar.f216751f : "");
        sb6.append(", ");
        sb6.append((zArr[2] ? dVar.f216750e : "").length());
        sb6.append(", ");
        sb6.append(dVar.f216749d);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterForwardChatHelper", sb6.toString());
        dz4.i iVar = uVar.f257942a;
        dz4.g gVar = iVar instanceof dz4.g ? (dz4.g) iVar : null;
        java.lang.Long valueOf = gVar != null ? java.lang.Long.valueOf(gVar.f245293d) : null;
        boolean z17 = ((valueOf == null || valueOf.longValue() <= 0) ? null : ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(valueOf.longValue())) != null ? !o72.x1.l0(r13) : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterForwardChatHelper", "handleForwardToConversation notUpload:" + z17 + ", needAwaitFavUploadResult:" + dVar.f216752g);
        boolean z18 = dVar.f216752g;
        kotlinx.coroutines.y0 y0Var = u2Var.f245428c;
        if (!z18 && !z17) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new dz4.l2(u2Var, activity, dVar, null), 2, null);
        } else {
            kotlinx.coroutines.r2 r2Var = u2Var.f245429d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            u2Var.f245429d = kotlinx.coroutines.l.d(y0Var, null, null, new dz4.s2(u2Var, activity, dVar, null), 3, null);
        }
    }

    public void ZIDL_X(byte[] bArr) {
        android.app.Activity activity;
        com.tencent.wechat.aff.wcrte.h hVar = (com.tencent.wechat.aff.wcrte.h) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.wcrte.h.f217660p, bArr);
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "downloadMsgFileAsync: holder null");
            return;
        }
        dz4.h4 h4Var = (dz4.h4) ((jz5.n) ((ez4.u) pVar).f257959r).getValue();
        ez4.u uVar = (ez4.u) h4Var.f245283a;
        int i17 = uVar.f257942a.f245290a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleShareToSnsTimeLine: scene=");
        sb6.append(i17);
        sb6.append(" noteXml length=");
        dz4.i iVar = uVar.f257942a;
        sb6.append(iVar.f245292c.length());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = h4Var.f245284b;
        com.tencent.mars.xlog.Log.i(str, sb7);
        java.lang.String str2 = null;
        if (i17 != 2) {
            if (i17 != 4) {
                com.tencent.mars.xlog.Log.e(str, "handleShareNoteToSnsTimeLine: can not handle scene " + i17);
                return;
            }
            dz4.h hVar2 = (dz4.h) iVar;
            o72.v2.d(hVar2.f245293d, 0, 0);
            java.lang.ref.WeakReference weakReference = uVar.f257944c;
            android.app.Activity activity2 = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (hVar != null) {
                str2 = hVar.f217669o[1] ? hVar.f217661d : "";
            }
            h4Var.c(activity2, hVar2.f245292c, hVar2.f245270o, str2);
            return;
        }
        dz4.g gVar = (dz4.g) iVar;
        boolean z17 = !o72.x1.l0(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(gVar.f245293d));
        com.tencent.mars.xlog.Log.i(str, "notUpload:" + z17);
        if (!z17) {
            h4Var.d(gVar, hVar);
            return;
        }
        java.lang.ref.WeakReference weakReference2 = uVar.f257944c;
        if (weakReference2 == null || (activity = (android.app.Activity) weakReference2.get()) == null) {
            com.tencent.mars.xlog.Log.e(str, "handleForwardToConversation: context null");
            return;
        }
        kotlinx.coroutines.r2 r2Var = h4Var.f245289g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        h4Var.f245289g = kotlinx.coroutines.l.d(h4Var.f245288f, null, null, new dz4.d4(gVar, h4Var, activity, hVar, null), 3, null);
    }

    public void ZIDL_Y(int i17) {
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onConvertToEditableNote: holder null");
            return;
        }
        ez4.u uVar = (ez4.u) pVar;
        java.lang.ref.WeakReference weakReference = uVar.f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onConvertToEditableNote: activity null");
        } else {
            com.tencent.mm.plugin.fav.ui.b4.c((com.tencent.mm.ui.MMActivity) activity, uVar.f257942a.f245293d, null, 300L);
        }
    }

    public void ZIDL_Z() {
        ih0.p pVar = ((dz4.j0) this.f217673a).f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onConvertToEditableNote: holder null");
            return;
        }
        dz4.d1 d1Var = (dz4.d1) ((jz5.n) ((ez4.u) pVar).f257960s).getValue();
        java.lang.ref.WeakReference weakReference = ((ez4.u) d1Var.f245196a).f257944c;
        jz5.f0 f0Var = null;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = d1Var.f245197b;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i(str, "handleComplaint: context null");
            return;
        }
        if (!j62.e.g().l("clicfg_note_expose_config_switch_android", false, false, true)) {
            d1Var.a();
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
        bundle.putString("query", "{\"scene\":57}");
        bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, new android.os.Bundle());
        com.tencent.mars.xlog.Log.i(str, "open liteApp:wxalited4df4810a40b1d9ddc0cbea44d263fd9");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.lite.i) g0Var).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, new dz4.c1(d1Var));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(str, "LiteApp service not available");
            d1Var.a();
        }
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void d0() {
        ZIDL_RI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void e1(com.tencent.wechat.aff.wenote.l lVar) {
        ZIDL_SI(this.nativeHandler, lVar.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void m0(java.lang.String str) {
        ZIDL_UI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void p0() {
        ZIDL_VI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void q0(long j17, java.util.ArrayList arrayList) {
        ZIDL_QX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void r0(long j17, java.util.ArrayList arrayList) {
        ZIDL_IX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void t1(long j17, com.tencent.wechat.aff.favorites.n nVar) {
        ZIDL_LBX(this.nativeHandler, j17, nVar.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.aff.wenote.i
    public void u1(java.lang.String str, com.tencent.wechat.aff.favorites.j jVar) {
        ZIDL_FI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), jVar.toByteArrayOrNull());
    }
}
