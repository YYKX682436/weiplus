package xu3;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView f457263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        super(3);
        this.f457263d = editorAudioSelectFinderVideoView;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.widget.Button finishBtn;
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderFavFragment finderFavFragment;
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.protocal.protobuf.FinderObject finderObj = (com.tencent.mm.protocal.protobuf.FinderObject) obj3;
        kotlin.jvm.internal.o.g((com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView = this.f457263d;
        finishBtn = editorAudioSelectFinderVideoView.getFinishBtn();
        finishBtn.setEnabled(true);
        finderFavFragment = editorAudioSelectFinderVideoView.getFinderFavFragment();
        finderFavFragment.b();
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView.d(editorAudioSelectFinderVideoView, finderObj, 5);
        return jz5.f0.f302826a;
    }
}
