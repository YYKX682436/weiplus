package yo4;

/* loaded from: classes10.dex */
public final class b0 implements bp4.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464180d;

    public b0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
        this.f464180d = multiVideoFullScreenPluginLayout;
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        yo4.p pVar = this.f464180d.f175855w;
        if (pVar != null) {
            pVar.H(j17);
        } else {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
    }

    @Override // bp4.c0
    public void pause() {
        yo4.p pVar = this.f464180d.f175855w;
        if (pVar != null) {
            pVar.onPause();
        } else {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
    }

    @Override // bp4.c0
    public void resume() {
        yo4.p pVar = this.f464180d.f175855w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("addMusicPlugin");
            throw null;
        }
        if (pVar.f464287r != null) {
            if (pVar != null) {
                pVar.G();
            } else {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
        }
    }
}
