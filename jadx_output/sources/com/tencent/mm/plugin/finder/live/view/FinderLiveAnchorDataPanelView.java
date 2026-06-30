package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016R6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveAnchorDataPanelView;", "Lcom/tencent/mm/ui/widget/RoundCornerRelativeLayout;", "Lcom/tencent/mm/plugin/finder/live/widget/zl;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, "Ljz5/f0;", "setFlutterTextureViewOpaque", "Landroid/graphics/Bitmap;", "getBitmap", "getSnapshot", "Lkotlin/Function2;", "", "g", "Lyz5/p;", "getOnExpandListener", "()Lyz5/p;", "setOnExpandListener", "(Lyz5/p;)V", "onExpandListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveAnchorDataPanelView extends com.tencent.mm.ui.widget.RoundCornerRelativeLayout implements com.tencent.mm.plugin.finder.live.widget.zl {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f115804f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.p onExpandListener;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.RenderSurface f115806h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveAnchorDataPanelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void d(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation, boolean z17) {
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorDataPanelView", "doResume result:" + z17 + ",but hasResume!");
        }
    }

    public final android.view.TextureView e(android.view.View view) {
        if (view instanceof android.view.TextureView) {
            return (android.view.TextureView) view;
        }
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return null;
        }
        android.view.View childAt = viewGroup.getChildAt(0);
        kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
        return e(childAt);
    }

    public final void f(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorDataPanelView", "release: source=" + source + ", liteAppView=" + this.f115804f);
        setTag(null);
        android.view.View view = this.f115804f;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            if (view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
                ((com.tencent.liteapp.ui.WxaLiteAppBaseView) view).g();
            }
        }
        this.f115804f = null;
    }

    public final java.lang.Object g(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorDataPanelView", "updateLiteApp: fail,appId=" + str + '!');
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(new java.lang.Integer(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND)));
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorDataPanelView", "updateLiteApp: appId=" + str + ", query=" + str2);
            if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(str)) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(new java.lang.Integer(((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(str, "dataPanelStore/updateDataPanelStr", str2))));
            } else {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(str, 10, false, 10L, new com.tencent.mm.plugin.finder.live.view.p1(nVar, str, str2));
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final android.graphics.Bitmap getBitmap() {
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer;
        android.graphics.Bitmap bitmap;
        if (this.f115806h == null) {
            android.view.View view = this.f115804f;
            com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView ? (com.tencent.liteapp.ui.WxaLiteAppBaseView) view : null;
            if (wxaLiteAppBaseView != null) {
                com.tencent.mm.accessibility.base.MapExpandKt.visitChild(wxaLiteAppBaseView, new com.tencent.mm.plugin.finder.live.view.n1(this));
            }
        }
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.f115806h;
        if (renderSurface == null || (attachedRenderer = renderSurface.getAttachedRenderer()) == null || (bitmap = attachedRenderer.getBitmap()) == null) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479672c9));
    }

    public final yz5.p getOnExpandListener() {
        return this.onExpandListener;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.zl
    public android.graphics.Bitmap getSnapshot() {
        return getBitmap();
    }

    public final void setFlutterTextureViewOpaque(boolean z17) {
        android.view.TextureView e17;
        android.view.View view = this.f115804f;
        if (view == null || (e17 = e(view)) == null) {
            return;
        }
        e17.setOpaque(z17);
    }

    public final void setOnExpandListener(yz5.p pVar) {
        this.onExpandListener = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveAnchorDataPanelView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
