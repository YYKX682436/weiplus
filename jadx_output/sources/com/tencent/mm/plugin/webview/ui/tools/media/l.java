package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185799e;

    public l(android.view.View view, com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185798d = view;
        this.f185799e = mPVideoPlayFullScreenView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f185798d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean c17 = fp.h.c(24);
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185799e;
        if (c17) {
            android.content.Context context = mPVideoPlayFullScreenView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            if (((android.app.Activity) context).isInMultiWindowMode()) {
                com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.b(mPVideoPlayFullScreenView);
                return;
            }
        }
        int c18 = com.tencent.mm.ui.bl.c(mPVideoPlayFullScreenView.getContext());
        int f17 = i65.a.f(mPVideoPlayFullScreenView.getContext(), com.tencent.mm.R.dimen.f479738dv);
        int i17 = f17 * 3;
        int i18 = f17 * 4;
        int i19 = f17 * 7;
        int max = java.lang.Math.max(c18 - i17, 0);
        int i27 = f17 * 2;
        mPVideoPlayFullScreenView.f185712i.setPadding(max, i27, max - f17, i27);
        android.view.View view = mPVideoPlayFullScreenView.A;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = i65.a.h(mPVideoPlayFullScreenView.getContext(), com.tencent.mm.R.dimen.by);
            view.setLayoutParams(layoutParams2);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = mPVideoPlayFullScreenView.f185715o.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(3);
        layoutParams4.setMargins(i18, i17, 0, i17);
        layoutParams4.addRule(15);
        mPVideoPlayFullScreenView.f185715o.setLayoutParams(layoutParams4);
        android.view.ViewGroup.LayoutParams layoutParams5 = mPVideoPlayFullScreenView.f185716p.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.removeRule(3);
        layoutParams6.setMargins(0, i17, i18, i17);
        layoutParams6.addRule(15);
        mPVideoPlayFullScreenView.f185716p.setLayoutParams(layoutParams6);
        android.view.ViewGroup.LayoutParams layoutParams7 = mPVideoPlayFullScreenView.f185719r.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
        layoutParams8.removeRule(3);
        layoutParams8.setMargins(0, i17, i18, i17);
        layoutParams8.addRule(15);
        mPVideoPlayFullScreenView.f185719r.setLayoutParams(layoutParams8);
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = mPVideoPlayFullScreenView.f185728z;
        kotlin.jvm.internal.o.d(redesignVideoPlayerSeekBar);
        android.view.ViewGroup.LayoutParams layoutParams9 = redesignVideoPlayerSeekBar.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
        layoutParams10.addRule(1, com.tencent.mm.R.id.ozv);
        layoutParams10.addRule(0, com.tencent.mm.R.id.f487557p00);
        layoutParams10.addRule(15);
        layoutParams10.setMargins(i19, i17, i19, i17);
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = mPVideoPlayFullScreenView.f185728z;
        if (redesignVideoPlayerSeekBar2 == null) {
            return;
        }
        redesignVideoPlayerSeekBar2.setLayoutParams(layoutParams10);
    }
}
