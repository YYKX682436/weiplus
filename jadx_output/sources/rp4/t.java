package rp4;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout f398687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398687d = editorVideoCompositionPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp4.t(this.f398687d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rp4.t tVar = (rp4.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Rect rect;
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Rect rect2 = lt3.n.f321263d;
        com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout = this.f398687d;
        rect2.set(editorVideoCompositionPluginLayout.getMediaModel().f398702g);
        rp4.g previewNewPlugin = editorVideoCompositionPluginLayout.getPreviewNewPlugin();
        ct0.b captureInfo = editorVideoCompositionPluginLayout.getCaptureInfo();
        kotlin.jvm.internal.o.d(captureInfo);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = editorVideoCompositionPluginLayout.getConfigProvider();
        previewNewPlugin.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preview ");
        sb6.append(captureInfo);
        sb6.append(' ');
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = previewNewPlugin.f398649d;
        sb6.append(videoCompositionPlayView != null ? java.lang.Integer.valueOf(videoCompositionPlayView.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", sb6.toString());
        previewNewPlugin.f398654i = captureInfo;
        previewNewPlugin.f398655m = configProvider != null ? configProvider.f155685w : 10000;
        if (previewNewPlugin.f398649d == null) {
            previewNewPlugin.f398649d = new com.tencent.mm.videocomposition.play.VideoCompositionPlayView(previewNewPlugin.f398652g);
        }
        previewNewPlugin.f398660r = true;
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView2 = previewNewPlugin.f398649d;
        fp.e eVar = new fp.e(videoCompositionPlayView2 != null ? videoCompositionPlayView2.getContext() : null);
        previewNewPlugin.f398653h = eVar;
        eVar.b();
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView3 = previewNewPlugin.f398649d;
        if (videoCompositionPlayView3 != null) {
            videoCompositionPlayView3.setVisibility(0);
        }
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView4 = previewNewPlugin.f398649d;
        if (videoCompositionPlayView4 != null) {
            videoCompositionPlayView4.setPlayerCallback(previewNewPlugin.f398661s);
        }
        previewNewPlugin.f398657o = captureInfo.f222207d;
        previewNewPlugin.f398658p = captureInfo.f222208e;
        android.widget.TextView textView = previewNewPlugin.f398651f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView != null && z65.c.a()) {
            di3.u.f232763a.postToWorker(new rp4.e(previewNewPlugin, textView));
        }
        rp4.x xVar = previewNewPlugin.f398659q;
        com.tencent.mm.plugin.vlog.model.h1 h1Var = xVar != null ? xVar.f398705j : null;
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView5 = previewNewPlugin.f398649d;
        if (videoCompositionPlayView5 != null) {
            kotlin.jvm.internal.o.d(h1Var);
            videoCompositionPlayView5.o(h1Var.e());
        }
        android.os.Bundle bundle = new android.os.Bundle();
        int i18 = previewNewPlugin.f398658p - previewNewPlugin.f398657o;
        if (i18 > previewNewPlugin.f398655m + 750) {
            bundle.putBoolean("PARAM_VIDEO_NEED_CROP", true);
        }
        ju3.c0 c0Var = ju3.c0.C1;
        ju3.d0 d0Var = previewNewPlugin.f398650e;
        d0Var.w(c0Var, bundle);
        int i19 = previewNewPlugin.f398655m;
        if (i18 > i19 + 750) {
            previewNewPlugin.f398658p = i19 + 250;
            ju3.d0.k(d0Var, ju3.c0.f301912x0, null, 2, null);
        } else {
            if (((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Ai(i18)) {
                ju3.d0.k(d0Var, ju3.c0.T2, null, 2, null);
            }
            ju3.d0.k(d0Var, ju3.c0.U2, null, 2, null);
        }
        rp4.x xVar2 = previewNewPlugin.f398659q;
        android.graphics.Rect rect3 = xVar2 != null ? xVar2.f398702g : null;
        android.view.ViewGroup a17 = previewNewPlugin.a();
        if (rect3 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "setupPreviewMatrixData: failed, videoRect");
        } else if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "setupPreviewMatrixData: failed, layoutView");
        } else {
            rect3.toString();
            sp4.b bVar = (sp4.b) ((jz5.n) previewNewPlugin.f398662t).getValue();
            bVar.f411320a = a17.getMeasuredWidth();
            bVar.f411321b = a17.getMeasuredHeight();
            double width = (rect3.width() * 1.0d) / rect3.height();
            bVar.f411323d = width;
            if (width >= 1.0d) {
                float f17 = bVar.f411322c;
                if (f17 <= 0.0f) {
                    f17 = bVar.f411321b * 0.75f;
                }
                rect = new android.graphics.Rect();
                float f18 = bVar.f411321b - f17;
                com.tencent.mars.xlog.Log.i("MicroMsg.PreviewTransformCalculateHandler", "createLandscapeTargetRect centerYOffset:0 maxBottomViewHeight:" + f17 + ", videoAreaHeight:" + f18 + " videoRatio:" + ((rect3.width() * 1.0f) / rect3.height()));
                int height = (int) ((f18 - ((float) rect3.height())) / 2.0f);
                rect.top = height;
                rect.left = rect3.left;
                rect.right = rect3.right;
                rect.bottom = height + rect3.height();
            } else {
                float f19 = bVar.f411322c;
                if (f19 <= 0.0f) {
                    f19 = bVar.f411321b * 0.75f;
                }
                android.graphics.Rect rect4 = new android.graphics.Rect();
                float f27 = bVar.f411321b - f19;
                float width2 = (rect3.width() * 1.0f) / rect3.height();
                com.tencent.mars.xlog.Log.i("MicroMsg.PreviewTransformCalculateHandler", "createPortraitTargetRect maxBottomViewHeight:" + f19 + ", videoAreaHeight:" + f27 + ", videoRatio:" + width2);
                float f28 = width2 * f27;
                rect4.top = 0;
                int b17 = a06.d.b(((((float) bVar.f411320a) - f28) * 1.0f) / ((float) 2));
                rect4.left = b17;
                rect4.right = a06.d.b(((float) b17) + f28);
                rect4.bottom = a06.d.b(((float) rect4.top) + f27);
                rect = rect4;
            }
            float width3 = (rect3.width() / 2.0f) + rect3.left;
            kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
            float height2 = rect3.height() / 2.0f;
            e0Var.f310115d = height2;
            if (bVar.f411323d < 1.0d && (i17 = rect3.top) > 0) {
                e0Var.f310115d = height2 + i17;
            }
            float width4 = (rect.width() * 1.0f) / rect3.width();
            float height3 = (rect.height() * 1.0f) / rect3.height();
            float f29 = (rect3.top + rect3.bottom) / 2.0f;
            rect.toString();
            a17.clearAnimation();
            bVar.f411324e = new sp4.a(bVar, a17, width3, e0Var, width4, height3, rect.centerX() - rect3.centerX(), (((rect.top + rect.bottom) / 2.0f) - f29) - ((f29 - f29) * height3), a17.getTranslationX(), a17.getTranslationY());
        }
        editorVideoCompositionPluginLayout.A();
        return jz5.f0.f302826a;
    }
}
