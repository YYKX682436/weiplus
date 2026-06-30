package wu3;

/* loaded from: classes5.dex */
public final class g0 implements mr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f449745a;

    public g0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        this.f449745a = editorAudioView;
    }

    @Override // mr.a
    public void onPageSelected(int i17) {
        int i18 = com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.f155970x1;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorAudioView", "onPageSelected >> " + i17);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.h(this.f449745a, i17, false, 2, null);
    }
}
