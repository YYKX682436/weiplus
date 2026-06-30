package yo4;

/* loaded from: classes10.dex */
public final class d1 implements bp4.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464194d;

    public d1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout) {
        this.f464194d = multiVideoPluginLayout;
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        this.f464194d.f175879v.H(j17);
    }

    @Override // bp4.c0
    public void pause() {
        this.f464194d.f175879v.onPause();
    }

    @Override // bp4.c0
    public void resume() {
        yo4.p pVar = this.f464194d.f175879v;
        if (pVar.f464287r != null) {
            pVar.G();
        }
    }
}
