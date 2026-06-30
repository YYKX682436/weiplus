package cu0;

/* loaded from: classes5.dex */
public final class f extends no4.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222314i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(cu0.x xVar, android.os.Bundle bundle, com.tencent.mm.plugin.vlog.model.i0 i0Var) {
        super(bundle, i0Var);
        this.f222314i = xVar;
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void a() {
        this.f222314i.j();
        ev0.t.c(this.f222314i.f222353c, false, null, 3, null);
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
        this.f222314i.n(z17, lyricsInfos);
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void g(boolean z17) {
        super.g(z17);
        cu0.x xVar = this.f222314i;
        xVar.j();
        xVar.f222356f = z17;
    }

    @Override // no4.c, com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    public void m(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var;
        super.m(audioCacheInfo);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.u3(m7Var, null), 3, null);
        this.f222314i.j();
        cu0.x xVar = this.f222314i;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = xVar.f222355e;
        int i17 = xVar.f222357g;
        ev0.b bVar = xVar.f222353c.f256879b;
        j(audioCacheInfo2, i17, bVar != null ? bVar.o() : 0L);
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3 = this.f222314i.f222355e;
        if (!kotlin.jvm.internal.o.b(audioCacheInfo3 != null ? audioCacheInfo3.a() : null, audioCacheInfo != null ? audioCacheInfo.a() : null) && audioCacheInfo != null) {
            audioCacheInfo.G = null;
            audioCacheInfo.H = null;
        }
        cu0.x xVar2 = this.f222314i;
        xVar2.f222355e = audioCacheInfo;
        xVar2.f222357g = xVar2.f();
        if (this.f222314i.f222354d || this.f222314i.c(audioCacheInfo)) {
            ev0.t tVar = this.f222314i.f222353c;
            cu0.x xVar3 = this.f222314i;
            kotlinx.coroutines.l.d(tVar.f256878a, null, null, new ev0.r(audioCacheInfo, xVar3.f222363m, tVar, new cu0.e(audioCacheInfo, xVar3), null), 3, null);
        } else if (audioCacheInfo != null) {
            pv3.n.f358619a.a(this.f222314i.h(), audioCacheInfo);
        }
        cu0.x xVar4 = this.f222314i;
        yz5.l lVar = xVar4.f222362l;
        if (lVar != null) {
            lVar.invoke(xVar4.f222355e);
        }
        this.f222314i.j();
        if (audioCacheInfo != null || (e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) this.f222314i.g().e().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class)) == null) {
            return;
        }
        e0Var.o();
    }
}
