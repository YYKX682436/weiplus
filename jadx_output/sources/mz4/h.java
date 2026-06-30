package mz4;

/* loaded from: classes12.dex */
public class h implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f333281d;

    public h(mz4.d dVar) {
        this.f333281d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz4.d dVar = this.f333281d;
        lz4.a aVar = dVar.f333230b;
        if (aVar == null) {
            return null;
        }
        ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).t7();
        com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) dVar.f333230b;
        noteEditorUI.f188141J.post(new com.tencent.mm.plugin.wenote.ui.nativenote.w0(noteEditorUI));
        return null;
    }
}
