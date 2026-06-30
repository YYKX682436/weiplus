package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class t implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185822b;

    public t(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, android.content.Context context) {
        this.f185821a = mPVideoPlayFullScreenView;
        this.f185822b = context;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        int i17;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185821a;
        if (mPVideoPlayFullScreenView.L) {
            int i18 = aVar2 == null ? -1 : com.tencent.mm.plugin.webview.ui.tools.media.s.f185818a[aVar2.ordinal()];
            if (i18 == 1) {
                i17 = 0;
            } else if (i18 != 2) {
                return;
            } else {
                i17 = 8;
            }
            mPVideoPlayFullScreenView.K = i17;
            android.content.Context context = this.f185822b;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).setRequestedOrientation(mPVideoPlayFullScreenView.K);
            int i19 = mPVideoPlayFullScreenView.K;
            if (i19 == 0 || i19 == 8) {
                mPVideoPlayFullScreenView.j();
            } else {
                mPVideoPlayFullScreenView.k();
            }
        }
    }
}
