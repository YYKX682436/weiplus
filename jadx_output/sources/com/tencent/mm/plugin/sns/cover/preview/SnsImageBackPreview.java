package com.tencent.mm.plugin.sns.cover.preview;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001/B#\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR#\u0010#\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010'\u001a\n \u001e*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)¨\u00060"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Landroid/widget/ImageView;", "imageView", "Landroid/graphics/RectF;", "getImageDisplayRect", "", "getLayoutId", "Ljz5/f0;", "onResume", "onPause", "onDestroy", "getType", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "Lv94/k;", "snsCoverStatusProvider", "setCoverFoldStatusProvider", "Lv94/g;", "coverInfo", "loadCover", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "mode", "I", "foldHeight", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "kotlin.jvm.PlatformType", "thumbView$delegate", "Ljz5/g;", "getThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView", "coverFoldImageView$delegate", "getCoverFoldImageView", "()Landroid/widget/ImageView;", "coverFoldImageView", "Lv94/k;", "Lv94/g;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;II)V", "Companion", "aa4/m", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsImageBackPreview extends com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview {
    public static final aa4.m Companion = new aa4.m(null);
    private static final float PREVIEW_RATIO = 1.7777778f;
    private static final java.lang.String TAG = "MicroMsg.SnsImageBackPreview";

    /* renamed from: coverFoldImageView$delegate, reason: from kotlin metadata */
    private final jz5.g coverFoldImageView;
    private v94.g coverInfo;
    private final int foldHeight;
    private final int mode;
    private v94.k snsCoverStatusProvider;

    /* renamed from: thumbView$delegate, reason: from kotlin metadata */
    private final jz5.g thumbView;

    public /* synthetic */ SnsImageBackPreview(android.content.Context context, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(context, (i19 & 2) != 0 ? 1 : i17, (i19 & 4) != 0 ? i65.a.h(context, com.tencent.mm.R.dimen.aa_) : i18);
    }

    public static final /* synthetic */ android.widget.ImageView access$getCoverFoldImageView(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        android.widget.ImageView coverFoldImageView = snsImageBackPreview.getCoverFoldImageView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return coverFoldImageView;
    }

    public static final /* synthetic */ int access$getFoldHeight$p(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFoldHeight$p", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        int i17 = snsImageBackPreview.foldHeight;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFoldHeight$p", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return i17;
    }

    public static final /* synthetic */ android.graphics.RectF access$getImageDisplayRect(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getImageDisplayRect", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        android.graphics.RectF imageDisplayRect = snsImageBackPreview.getImageDisplayRect(imageView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getImageDisplayRect", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return imageDisplayRect;
    }

    public static final /* synthetic */ v94.k access$getSnsCoverStatusProvider$p(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsCoverStatusProvider$p", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        v94.k kVar = snsImageBackPreview.snsCoverStatusProvider;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsCoverStatusProvider$p", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return kVar;
    }

    private final android.widget.ImageView getCoverFoldImageView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        android.widget.ImageView imageView = (android.widget.ImageView) this.coverFoldImageView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return imageView;
    }

    private final android.graphics.RectF getImageDisplayRect(android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageDisplayRect", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        if (imageView.getDrawable() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageDisplayRect", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
            return null;
        }
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, r2.getIntrinsicWidth(), r2.getIntrinsicHeight());
        android.graphics.Matrix imageMatrix = imageView.getImageMatrix();
        kotlin.jvm.internal.o.f(imageMatrix, "getImageMatrix(...)");
        imageMatrix.mapRect(rectF);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        float f17 = i17 + rectF.left;
        int i18 = iArr[1];
        android.graphics.RectF rectF2 = new android.graphics.RectF(f17, i18 + rectF.top, i17 + rectF.right, i18 + rectF.bottom);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageDisplayRect", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return rectF2;
    }

    private final com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView getThumbView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView snsCoverFadeImageView = (com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView) this.thumbView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return snsCoverFadeImageView;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return com.tencent.mm.R.layout.cra;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return 1;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void loadCover(v94.g coverInfo) {
        v94.i snsCoverReporter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        kotlin.jvm.internal.o.g(coverInfo, "coverInfo");
        this.coverInfo = coverInfo;
        getThumbView().setMode(this.mode);
        getThumbView().setSourceDecodeCallback(new aa4.p(this, coverInfo));
        v94.k kVar = this.snsCoverStatusProvider;
        if (kVar != null && (snsCoverReporter = kVar.getSnsCoverReporter()) != null) {
            ((ba4.a) snsCoverReporter).e();
        }
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView = getThumbView();
        com.tencent.mm.plugin.sns.storage.x1 x1Var = (com.tencent.mm.plugin.sns.storage.x1) coverInfo;
        java.lang.String userName = x1Var.getUserName();
        kotlin.jvm.internal.o.f(userName, "getUserName(...)");
        java.lang.Long u07 = x1Var.u0();
        kotlin.jvm.internal.o.f(u07, "getSnsObjId(...)");
        long longValue = u07.longValue();
        java.lang.String t07 = x1Var.t0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverOffset", "com.tencent.mm.plugin.sns.storage.SnsCover");
        int i17 = x1Var.field_snsCoverOffset;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverOffset", "com.tencent.mm.plugin.sns.storage.SnsCover");
        thumbView.n(userName, longValue, t07, i17, true);
        if (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_COVER_DEBUG_INT_SYNC, 0) == 1 && z65.c.a()) {
            setOnLongClickListener(new aa4.q(this, coverInfo));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i(TAG, "onConfigurationChanged");
        v94.g gVar = this.coverInfo;
        if (gVar != null) {
            loadCover(gVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPostClose() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mars.xlog.Log.i(TAG, "[onPostClose]");
        getCoverFoldImageView().setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPostOpen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPreClose() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mars.xlog.Log.i(TAG, "[onPreClose]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPreOpen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mars.xlog.Log.i(TAG, "[onPreOpen]");
        getCoverFoldImageView().setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void setCoverFoldStatusProvider(v94.k kVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCoverFoldStatusProvider", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        super.setCoverFoldStatusProvider(kVar);
        this.snsCoverStatusProvider = kVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCoverFoldStatusProvider", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsImageBackPreview(android.content.Context context, int i17, int i18) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.mode = i17;
        this.foldHeight = i18;
        this.thumbView = jz5.h.b(new aa4.r(this));
        this.coverFoldImageView = jz5.h.b(new aa4.n(this));
    }
}
