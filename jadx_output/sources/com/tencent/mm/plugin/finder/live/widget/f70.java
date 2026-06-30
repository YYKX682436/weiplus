package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f70 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f118321e;

    /* renamed from: f, reason: collision with root package name */
    public int f118322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f118323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u70 f118324h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(android.content.Intent intent, com.tencent.mm.plugin.finder.live.widget.u70 u70Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118323g = intent;
        this.f118324h = u70Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.f70(this.f118323g, this.f118324h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.f70) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int, boolean] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        java.lang.String str;
        r45.yg7 yg7Var;
        r45.z53 z53Var;
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f118322f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.widget.u70 u70Var = this.f118324h;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Intent intent = this.f118323g;
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = intent != null ? (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
            java.lang.String str2 = captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null;
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("key_extra_data") : null;
            ?? r132 = bundleExtra != null ? bundleExtra.getBoolean("has_apply_hd", false) : 0;
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "REQUEST_CODE_CROP_FIX_IMAGE thumbPath: " + str2 + ", isHD=" + ((boolean) r132));
            if ((str2 == null || str2.length() == 0) || !com.tencent.mm.vfs.w6.j(str2)) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f328222e);
                com.tencent.mars.xlog.Log.e("Finder.FinderStartLivePostCoverWidget", "ERROR! filePath=" + str2);
                return f0Var;
            }
            java.lang.String str3 = str2 + "_normal_live_cover_" + java.lang.System.currentTimeMillis();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.widget.e70 e70Var = new com.tencent.mm.plugin.finder.live.widget.e70(u70Var, str2, str3, null);
            this.f118321e = str3;
            this.f118320d = r132;
            this.f118322f = 1;
            if (kotlinx.coroutines.l.g(p0Var, e70Var, this) == aVar) {
                return aVar;
            }
            i17 = r132;
            str = str3;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f118320d;
            str = (java.lang.String) this.f118321e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (i17 != 0) {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329085z).k(str);
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "set hdCoverPath=" + str);
        } else {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329085z).k(null);
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "cleared hdCoverPath");
        }
        android.widget.ImageView imageView = u70Var.f119954m;
        if (imageView != null) {
            zl2.r4.f473950a.P(imageView, str, java.lang.Math.min(imageView.getWidth(), 500), java.lang.Math.min(imageView.getHeight(), 500));
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.x3 x3Var = ml2.j0.f327583i.P;
        switch (x3Var.ordinal()) {
            case 6:
            case 7:
                yg7Var = r45.yg7.FinderLiveImgSource_PhoneShooting;
                break;
            case 8:
                yg7Var = r45.yg7.FinderLiveImgSource_PhotoAlbum;
                break;
            case 9:
                yg7Var = r45.yg7.FinderLiveImgSource_FinderAvatar;
                break;
            default:
                yg7Var = r45.yg7.FinderLiveImgSource_Unknown;
                break;
        }
        u70Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "setCoverUrl url:" + str + ", urlSrc:" + yg7Var);
        u70Var.f119959r = yg7Var;
        df2.od odVar = (df2.od) u70Var.controller(df2.od.class);
        if (odVar != null) {
            odVar.e7(r45.n72.kActionType_SetLiveRoomCoverImg);
        }
        java.lang.String str4 = "";
        if (zl2.r4.f473950a.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329068f).getValue())) {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329079t).k(str);
            km2.g gVar = km2.g.f309100a;
            r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329071i).getValue();
            if (n73Var != null && (z53Var = (r45.z53) n73Var.getCustom(1)) != null && (string = z53Var.getString(0)) != null) {
                str4 = string;
            }
            gVar.f(str, str4);
        } else {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329075p).k(str);
            km2.g.f309100a.f(str, "");
        }
        u70Var.g7(x3Var);
        return f0Var;
    }
}
