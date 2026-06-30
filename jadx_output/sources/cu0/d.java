package cu0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cu0.x xVar) {
        super(1);
        this.f222311d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f222311d.f222354d = booleanValue;
        this.f222311d.g().e().i(booleanValue);
        if (booleanValue) {
            oo4.d dVar = oo4.d.f347197a;
            dVar.h(25496, this.f222311d.i());
            cu0.x xVar = this.f222311d;
            if (xVar.f222365o) {
                dVar.i(xVar.f222357g, xVar.i());
                this.f222311d.f222365o = false;
            }
        }
        yz5.l lVar = this.f222311d.f222364n;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        cu0.x xVar2 = this.f222311d;
        if (booleanValue) {
            xVar2.k();
        } else {
            ev0.b bVar = xVar2.f222353c.f256879b;
            long o17 = bVar != null ? bVar.o() : 0L;
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a aVar = xVar2.g().f222579o;
            if (aVar != null) {
                aVar.j(xVar2.f222355e, xVar2.f222357g, o17);
            }
            ev0.t.c(xVar2.f222353c, false, null, 2, null);
            if (xVar2.m()) {
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = xVar2.f222355e;
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) xVar2.g().e().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
                boolean s17 = e0Var != null ? e0Var.s(3) : false;
                boolean z17 = xVar2.f222356f;
                if (audioCacheInfo != null) {
                    kotlinx.coroutines.l.d(xVar2.f222359i, null, null, new cu0.w(xVar2, audioCacheInfo, s17, z17, null), 3, null);
                }
            } else {
                kotlinx.coroutines.l.d(xVar2.f222360j, null, null, new cu0.n(xVar2, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
