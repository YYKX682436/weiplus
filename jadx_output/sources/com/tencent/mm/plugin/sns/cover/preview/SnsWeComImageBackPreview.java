package com.tencent.mm.plugin.sns.cover.preview;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u0015\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018R#\u0010\"\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010'\u001a\n \u001d*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsWeComImageBackPreview;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lcom/tencent/mm/plugin/sns/model/h0;", "", "getLayoutId", "Ljz5/f0;", "onResume", "onPause", "onDestroy", "getType", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "", "mediaId", "onThumbFinish", "snsId", "downloadType", "", "isOk", "onImageFinish", "onSetbg", "onSightFinish", "Lv94/g;", "coverInfo", "loadCover", "downloadCover", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "kotlin.jvm.PlatformType", "thumbView$delegate", "Ljz5/g;", "getThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView", "Landroid/widget/ImageView;", "coverFoldImageView$delegate", "getCoverFoldImageView", "()Landroid/widget/ImageView;", "coverFoldImageView", "Lv94/g;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "aa4/b0", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsWeComImageBackPreview extends com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview implements com.tencent.mm.plugin.sns.model.h0 {
    public static final aa4.b0 Companion = new aa4.b0(null);
    private static final float PREVIEW_RATIO = 1.7777778f;
    private static final java.lang.String TAG = "MicroMsg.SnsWeComImageBackPreview";

    /* renamed from: coverFoldImageView$delegate, reason: from kotlin metadata */
    private final jz5.g coverFoldImageView;
    private v94.g coverInfo;

    /* renamed from: thumbView$delegate, reason: from kotlin metadata */
    private final jz5.g thumbView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsWeComImageBackPreview(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.thumbView = jz5.h.b(new aa4.d0(this));
        this.coverFoldImageView = jz5.h.b(new aa4.c0(this));
    }

    private final android.widget.ImageView getCoverFoldImageView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        android.widget.ImageView imageView = (android.widget.ImageView) this.coverFoldImageView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return imageView;
    }

    private final com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView getThumbView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView snsCoverFadeImageView = (com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView) this.thumbView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return snsCoverFadeImageView;
    }

    public final void downloadCover(v94.g coverInfo) {
        java.lang.String str;
        java.lang.String str2;
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        kotlin.jvm.internal.o.g(coverInfo, "coverInfo");
        java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
        kotlin.jvm.internal.o.f(Di, "getAccSnsPath(...)");
        com.tencent.mm.plugin.sns.storage.x1 x1Var = (com.tencent.mm.plugin.sns.storage.x1) coverInfo;
        com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(x1Var.getUserName());
        java.lang.String str3 = J0.field_bgId;
        com.tencent.mars.xlog.Log.i(TAG, "downloadCover, userName:" + x1Var.getUserName() + ", bgId:" + str3 + ", olderBgId:" + J0.field_older_bgId);
        java.lang.String K = ca4.z0.K(str3);
        kotlin.jvm.internal.o.f(K, "getSnsBigNameWithoutEnc(...)");
        java.lang.String str4 = x1Var.getUserName() + "bg_";
        java.lang.String str5 = x1Var.getUserName() + "tbg_";
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(Di, x1Var.getUserName());
        kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
        com.tencent.mm.vfs.w6.u(d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
        boolean z17 = (J0.field_local_flag & 1) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
        if (z17) {
            com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
            java.lang.String userName = x1Var.getUserName();
            Ej.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unChnage", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            com.tencent.mm.plugin.sns.storage.d2 J02 = Ej.J0(userName);
            J02.field_userName = userName;
            J02.field_local_flag &= -2;
            Ej.u1(J02);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unChnage", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(Di, x1Var.getUserName()) + str4)) {
                com.tencent.mm.vfs.w6.h(com.tencent.mm.plugin.sns.model.f6.d(Di, x1Var.getUserName()) + str5);
                com.tencent.mm.vfs.w6.P(com.tencent.mm.plugin.sns.model.f6.d(Di, x1Var.getUserName()), str4, str5);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
            J0.field_local_flag &= -2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
            com.tencent.mm.plugin.sns.model.l4.Ej().u1(J0);
        }
        if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str3) + K)) {
            if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(Di, x1Var.getUserName()) + str4)) {
                com.tencent.mm.vfs.w6.c(com.tencent.mm.plugin.sns.model.f6.d(Di, str3) + K, com.tencent.mm.plugin.sns.model.f6.d(Di, x1Var.getUserName()) + str4);
            }
        }
        com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195307k;
        if (str3 != null) {
            str = "downloadCover";
            str2 = d17;
            bitmap = com.tencent.mm.plugin.sns.model.l4.hj().n(d17 + str4, J0.field_bgUrl, str3, true, s7Var, J0.field_imBGaeskey, J0.field_imBGauthkey);
            if (bitmap == null) {
                com.tencent.mm.vfs.w6.h(str2 + str4);
            }
        } else {
            str = "downloadCover";
            str2 = d17;
            bitmap = null;
        }
        if (bitmap == null && str3 != null) {
            bitmap = com.tencent.mm.plugin.sns.model.l4.hj().n(str2 + str5, J0.field_bgUrl, str3, false, s7Var, J0.field_imBGaeskey, J0.field_imBGauthkey);
        }
        getThumbView().setImageBitmapWithFade(bitmap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return com.tencent.mm.R.layout.cra;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return 6;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void loadCover(v94.g coverInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        kotlin.jvm.internal.o.g(coverInfo, "coverInfo");
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        this.coverInfo = coverInfo;
        downloadCover(coverInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPostClose() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mars.xlog.Log.i(TAG, "[onPostClose]");
        getCoverFoldImageView().setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPostOpen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPreClose() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mars.xlog.Log.i(TAG, "[onPreClose]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPreOpen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mars.xlog.Log.i(TAG, "[onPreOpen]");
        getCoverFoldImageView().setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        v94.g gVar = this.coverInfo;
        if (gVar != null) {
            downloadCover(gVar);
        }
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }
}
