package kv3;

/* loaded from: classes5.dex */
public final class b extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 {

    /* renamed from: s, reason: collision with root package name */
    public final ev3.d f312674s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, int[] tabTypeArray, int i17, yz5.l fragmentCreator, ev3.d dVar) {
        super(parent, status, tabTypeArray, i17, fragmentCreator);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(tabTypeArray, "tabTypeArray");
        kotlin.jvm.internal.o.g(fragmentCreator, "fragmentCreator");
        this.f312674s = dVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0
    public void r(int i17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f17;
        ev3.d dVar = this.f312674s;
        if (dVar == null || (f17 = dVar.f()) == null) {
            return;
        }
        f17.r(i17);
    }
}
