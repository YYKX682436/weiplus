package cu0;

/* loaded from: classes5.dex */
public abstract class y extends cv3.h {

    /* renamed from: p, reason: collision with root package name */
    public final yz5.l f222366p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(context, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f222366p = ignoreBackgroundTouchEvent;
    }

    @Override // cv3.c
    public vu3.c a() {
        return new cu0.c(this.f222569d, this.f222366p);
    }

    @Override // cv3.d
    public void close() {
        uu3.u uVar = this.f222571f;
        if (uVar != null) {
            com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(uVar, false, 1, null);
        }
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout e() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        kotlin.jvm.internal.o.e(d17, "null cannot be cast to non-null type T of com.tencent.mm.mj_publisher.finder.common.music.ComposingMusicPickerDrawerImpl");
        return d17;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setPlayMusicWhenSearchFinish(boolean z17) {
        e().setPlayFirstSongOnRecommendFinish(z17);
    }
}
