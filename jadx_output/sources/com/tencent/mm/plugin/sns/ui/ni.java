package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ni implements com.tencent.mm.ui.tools.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f170007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f170008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f170009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f170011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f170012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f170013g;

    public ni(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI, android.view.View view, android.view.View view2, int i17, int i18, float f17, boolean z17) {
        this.f170013g = snsGalleryUI;
        this.f170007a = view;
        this.f170008b = view2;
        this.f170009c = i17;
        this.f170010d = i18;
        this.f170011e = f17;
        this.f170012f = z17;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }

    @Override // com.tencent.mm.ui.tools.o4
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f170013g;
        boolean v76 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.v7(snsGalleryUI);
        int i17 = this.f170010d;
        int i18 = this.f170009c;
        float f18 = this.f170011e;
        android.view.View view = this.f170008b;
        if (!v76) {
            android.view.KeyEvent.Callback callback = this.f170007a;
            if (callback instanceof db5.f0) {
                int width = view.getWidth();
                int height = view.getHeight();
                view.setTranslationX(com.tencent.mm.plugin.sns.ui.SnsGalleryUI.s7(snsGalleryUI) + ((i18 - com.tencent.mm.plugin.sns.ui.SnsGalleryUI.s7(snsGalleryUI)) * f17));
                view.setTranslationY(com.tencent.mm.plugin.sns.ui.SnsGalleryUI.t7(snsGalleryUI) + ((i17 - com.tencent.mm.plugin.sns.ui.SnsGalleryUI.t7(snsGalleryUI)) * f17));
                view.setPivotX(width / 2);
                view.setPivotY(height / 2);
                view.setScaleX(com.tencent.mm.plugin.sns.ui.SnsGalleryUI.u7(snsGalleryUI) + ((f18 - com.tencent.mm.plugin.sns.ui.SnsGalleryUI.u7(snsGalleryUI)) * f17));
                view.setScaleY(com.tencent.mm.plugin.sns.ui.SnsGalleryUI.u7(snsGalleryUI) + ((f18 - com.tencent.mm.plugin.sns.ui.SnsGalleryUI.u7(snsGalleryUI)) * f17));
                ((db5.f0) callback).n(1.0f - f17, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
            }
        }
        if (!com.tencent.mm.plugin.sns.ui.SnsGalleryUI.v7(snsGalleryUI) && this.f170012f && view != null) {
            int width2 = view.getWidth();
            int height2 = view.getHeight();
            float u76 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.u7(snsGalleryUI) + ((f18 - com.tencent.mm.plugin.sns.ui.SnsGalleryUI.u7(snsGalleryUI)) * f17);
            view.setScaleX(u76);
            view.setScaleY(u76);
            view.setTranslationX(com.tencent.mm.plugin.sns.ui.SnsGalleryUI.s7(snsGalleryUI) + ((i18 - com.tencent.mm.plugin.sns.ui.SnsGalleryUI.s7(snsGalleryUI)) * f17));
            view.setTranslationY(com.tencent.mm.plugin.sns.ui.SnsGalleryUI.t7(snsGalleryUI) + ((i17 - com.tencent.mm.plugin.sns.ui.SnsGalleryUI.t7(snsGalleryUI)) * f17));
            view.setPivotX(width2 / 2);
            view.setPivotY(height2 / 2);
            float f19 = width2;
            int width3 = (int) (f19 - ((f19 - (com.tencent.mm.plugin.sns.ui.SnsGalleryUI.r7(snsGalleryUI).width() / u76)) * f17));
            float f27 = height2;
            int height3 = (int) (f27 - ((f27 - (com.tencent.mm.plugin.sns.ui.SnsGalleryUI.r7(snsGalleryUI).height() / u76)) * f17));
            view.setClipBounds(new android.graphics.Rect((width2 - width3) / 2, (height2 - height3) / 2, (width2 + width3) / 2, (height2 + height3) / 2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        android.content.Context context;
        com.tencent.pigeon.sns.FlutterAlbumApi flutterAlbumApi;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f170013g;
        r45.jj4 cntMedia = snsGalleryUI.f166810o.getCntMedia();
        if (cntMedia != null) {
            java.lang.String str = cntMedia.f377855d;
            if (str == null) {
                str = "";
            }
            si0.n0 n0Var = si0.n0.f408137f;
            if (n0Var != null && (context = (android.content.Context) n0Var.f408139e.get()) != null && (flutterAlbumApi = n0Var.f408138d) != null) {
                flutterAlbumApi.changeAlbumItemVisibility(str, "-1", new si0.m0(n0Var, context));
            }
        }
        int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.C1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.os.Handler handler = snsGalleryUI.G1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        handler.post(new com.tencent.mm.plugin.sns.ui.mi(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        this.f170013g.f166810o.n0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }
}
