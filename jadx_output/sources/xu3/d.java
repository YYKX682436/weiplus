package xu3;

/* loaded from: classes5.dex */
public final class d extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment f457255a;

    public d(com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment editorAudioFinderTabFragment) {
        this.f457255a = editorAudioFinderTabFragment;
    }

    @Override // ym5.q3
    public void b(int i17) {
        this.f457255a.c();
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        com.tencent.mm.view.RefreshLoadMoreLayout loadMoreLayout;
        kotlin.jvm.internal.o.g(reason, "reason");
        if (reason.f463521f) {
            return;
        }
        loadMoreLayout = this.f457255a.getLoadMoreLayout();
        kotlin.jvm.internal.o.f(loadMoreLayout, "access$getLoadMoreLayout(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout.I(loadMoreLayout, null, 1, null);
    }
}
