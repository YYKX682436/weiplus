package wu3;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f449782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        super(1);
        this.f449782d = editorAudioView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList it = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f449782d;
        if (editorAudioView.V) {
            int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.f155970x1;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorAudioView", "EditorView has been destroyed, skip callback");
        } else {
            boolean z17 = !it.isEmpty();
            editorAudioView.N = z17;
            if (z17) {
                wt3.v vVar = wt3.v.f449505i;
                if (vVar != null) {
                    vVar.f449510d = editorAudioView.getMusicRequestId();
                }
                editorAudioView.A.setMRelatedRecId(editorAudioView.getMusicRequestId());
                com.tencent.mm.sdk.platformtools.u3.h(new wu3.m0(editorAudioView, it));
            }
        }
        return jz5.f0.f302826a;
    }
}
