package kv3;

/* loaded from: classes5.dex */
public final class j extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.p1 {
    public final r45.yv0 F;
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, r45.yv0 finderCgiType, int i17, kotlin.jvm.internal.i iVar) {
        super(parent, status);
        finderCgiType = (i17 & 4) != 0 ? r45.yv0.kFinderBgmListTypeSearch : finderCgiType;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(finderCgiType, "finderCgiType");
        this.F = finderCgiType;
        this.G = jz5.h.b(new kv3.i(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public void u(boolean z17, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1 searchType) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f17;
        kotlin.jvm.internal.o.g(searchType, "searchType");
        ev3.d dVar = this.A;
        ((nv3.i) ((jz5.n) this.G).getValue()).a(this.f156181v, z17, searchType, (dVar == null || (f17 = dVar.f()) == null) ? null : f17.p());
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public int x() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public void z() {
        super.z();
        nv3.i iVar = (nv3.i) ((jz5.n) this.G).getValue();
        jv3.a aVar = iVar.f340681e;
        if (aVar != null) {
            aVar.j();
        }
        iVar.f340681e = null;
    }
}
