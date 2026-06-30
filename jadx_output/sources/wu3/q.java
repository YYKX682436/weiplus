package wu3;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        super(2);
        this.f449796d = editorAudioSearchView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj2;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449796d;
        su3.m mVar = editorAudioSearchView.f155964u;
        if (!(mVar != null && intValue == mVar.getItemCount())) {
            editorAudioSearchView.h(intValue);
        }
        return jz5.f0.f302826a;
    }
}
