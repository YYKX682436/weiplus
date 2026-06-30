package com.tencent.mm.plugin.vlog.ui.preview;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogFakeVideoView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/vlog/model/m1;", "getScriptModel", "", "mute", "Ljz5/f0;", "setMute", "Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "d", "Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "getVlogVideoView", "()Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "setVlogVideoView", "(Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;)V", "vlogVideoView", "Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "e", "Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "getFakeLayer", "()Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;", "setFakeLayer", "(Lcom/tencent/mm/plugin/recordvideo/ui/FakeVideoViewLayer;)V", "fakeLayer", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "getLoading", "()Landroid/widget/ProgressBar;", "setLoading", "(Landroid/widget/ProgressBar;)V", "loading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class VLogFakeVideoView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView vlogVideoView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeLayer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.ProgressBar loading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VLogFakeVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.VLogFakeVideoView", "initView");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489599d42, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.p4h);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setVlogVideoView((com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView) findViewById);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dqf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setFakeLayer((com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer) findViewById2);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ozc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setLoading((android.widget.ProgressBar) findViewById3);
        getVlogVideoView().setPrepareCallback(new ip4.a(this));
    }

    private final com.tencent.mm.plugin.vlog.model.m1 getScriptModel() {
        new r45.hi0();
        return null;
    }

    public final com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer getFakeLayer() {
        com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer = this.fakeLayer;
        if (fakeVideoViewLayer != null) {
            return fakeVideoViewLayer;
        }
        kotlin.jvm.internal.o.o("fakeLayer");
        throw null;
    }

    public final android.widget.ProgressBar getLoading() {
        android.widget.ProgressBar progressBar = this.loading;
        if (progressBar != null) {
            return progressBar;
        }
        kotlin.jvm.internal.o.o("loading");
        throw null;
    }

    public final com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView getVlogVideoView() {
        com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView vLogPlayView = this.vlogVideoView;
        if (vLogPlayView != null) {
            return vLogPlayView;
        }
        kotlin.jvm.internal.o.o("vlogVideoView");
        throw null;
    }

    public final void setFakeLayer(com.tencent.mm.plugin.recordvideo.ui.FakeVideoViewLayer fakeVideoViewLayer) {
        kotlin.jvm.internal.o.g(fakeVideoViewLayer, "<set-?>");
        this.fakeLayer = fakeVideoViewLayer;
    }

    public final void setLoading(android.widget.ProgressBar progressBar) {
        kotlin.jvm.internal.o.g(progressBar, "<set-?>");
        this.loading = progressBar;
    }

    public final void setMute(boolean z17) {
    }

    public final void setVlogVideoView(com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView vLogPlayView) {
        kotlin.jvm.internal.o.g(vLogPlayView, "<set-?>");
        this.vlogVideoView = vLogPlayView;
    }
}
