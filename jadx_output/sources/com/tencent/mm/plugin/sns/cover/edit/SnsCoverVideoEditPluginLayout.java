package com.tencent.mm.plugin.sns.cover.edit;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverVideoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SnsCoverVideoEditPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f163994o = 0;

    /* renamed from: i, reason: collision with root package name */
    public final yt3.a f163995i;

    /* renamed from: m, reason: collision with root package name */
    public final y94.f0 f163996m;

    /* renamed from: n, reason: collision with root package name */
    public final y94.h0 f163997n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsCoverVideoEditPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a37, (android.view.ViewGroup) this, true);
        yt3.e eVar = new yt3.e(this, "close-plugin");
        eVar.z(com.tencent.mm.R.id.ckq, ju3.c0.C);
        this.f163995i = eVar;
        this.f163996m = new y94.f0(this);
        new y94.i(this);
        this.f163997n = new y94.h0(this);
        new yt3.e(this, "finish-plugin").z(com.tencent.mm.R.id.f483966cl0, ju3.c0.B1);
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        android.view.ViewPropertyAnimator duration;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverVideoEditPluginLayout", "statusChange :" + status);
        int ordinal = status.ordinal();
        if (ordinal != 32) {
            yt3.a aVar = this.f163995i;
            y94.f0 f0Var = this.f163996m;
            if (ordinal == 56) {
                ((yt3.e) aVar).setVisibility(4);
                f0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCropScaleAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                int width = f0Var.A().getWidth();
                int height = f0Var.A().getHeight();
                int b17 = ((i65.a.b(f0Var.z(), 2) + i65.a.b(f0Var.z(), 110)) - i65.a.b(f0Var.z(), 44)) + i65.a.b(f0Var.z(), 2);
                if (com.tencent.mm.ui.bl.f(f0Var.z())) {
                    b17 += com.tencent.mm.ui.bl.c(f0Var.z());
                }
                int i17 = height - b17;
                if (f0Var.A().getBottom() < ai3.d.f(f0Var.z()).y) {
                    i17 = (int) ((width - (i65.a.b(f0Var.z(), 16) * 2)) / (width / height));
                }
                float f17 = width;
                float f18 = i17;
                float B = ((((int) ((f17 / r2) * f18)) / f17) * i65.a.B(f0Var.z())) / f17;
                android.view.ViewPropertyAnimator translationY = f0Var.A().animate().scaleX(B).scaleY(((f18 / height) * i65.a.B(f0Var.z())) / f17).translationY(-(java.lang.Math.abs(b17) / 2.0f));
                if (translationY != null && (duration = translationY.setDuration(300L)) != null) {
                    duration.setListener(new y94.e0(f0Var));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCropScaleAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            } else if (ordinal != 58) {
                if (ordinal == 65) {
                    kotlinx.coroutines.l.d(this, null, null, new x94.e(this, null), 3, null);
                } else if (ordinal != 165) {
                    switch (ordinal) {
                        case 60:
                            f0Var.onPause();
                            break;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            f0Var.onResume();
                            break;
                        case 62:
                        case 63:
                            ((yt3.e) aVar).setVisibility(0);
                            f0Var.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showNormalAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                            f0Var.A().animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300L);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showNormalAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                            break;
                    }
                }
            } else if (bundle != null) {
                int i18 = bundle.getInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT");
                int i19 = bundle.getInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverVideoEditPluginLayout", "set crop range:[" + i18 + ' ' + i19 + ']');
                f0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                kk4.b player = f0Var.A().getPlayer();
                if (player != null) {
                    ((kk4.v) player).H(i18, i19);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                kk4.b player2 = f0Var.A().getPlayer();
                if (player2 != null) {
                    kk4.b.f(player2, i18, false, null, 6, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                long j17 = i18;
                long j18 = i19;
                y94.h0 h0Var = this.f163997n;
                h0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                og3.d dVar = h0Var.f460374f;
                if (dVar == null || h0Var.f460375g == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                } else {
                    com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = (com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) dVar.f345159a.get(0);
                    com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo mediaDurationInfo = new com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo(j17, j18);
                    mediaSingleInfo.getClass();
                    mediaSingleInfo.f148611f = mediaDurationInfo;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishPageWithCancel", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).Z6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishPageWithCancel", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
    }
}
