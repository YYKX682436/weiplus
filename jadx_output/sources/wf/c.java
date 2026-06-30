package wf;

/* loaded from: classes7.dex */
public class c implements tf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f445460a;

    public c(wf.b bVar) {
        this.f445460a = bVar;
    }

    @Override // tf.u
    public void h() {
        wf.b bVar = this.f445460a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "playVideo, JustPlayAudio getAndSet: false");
        bVar.V.set(false);
        bVar.L(new java.lang.Runnable() { // from class: wf.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar2 = wf.c.this.f445460a;
                if (bVar2.V.get()) {
                    com.tencent.mars.xlog.Log.i(bVar2.w(), "ignore playVideo in liveThread");
                    return;
                }
                wf.a aVar = bVar2.f445418i;
                if (aVar != null) {
                    aVar.setSurface(bVar2.f445416g);
                    if (bVar2.f445418i.isPlaying()) {
                        return;
                    }
                    bVar2.f445418i.n(com.tencent.tav.core.AssetExtension.SCENE_PLAY, null);
                }
            }
        });
    }

    @Override // tf.u
    public void j() {
        wf.b bVar = this.f445460a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "playAudio, JustPlayAudio getAndSet: true");
        if (bVar.V.getAndSet(true)) {
            com.tencent.mars.xlog.Log.i(bVar.w(), "ignore playAudio");
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: wf.c$$b
            @Override // java.lang.Runnable
            public final void run() {
                final wf.c cVar = wf.c.this;
                cVar.getClass();
                cVar.f445460a.L(new java.lang.Runnable() { // from class: wf.c$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        wf.a aVar;
                        wf.b bVar2 = wf.c.this.f445460a;
                        if (bVar2.V.get() && (aVar = bVar2.f445418i) != null) {
                            aVar.setSurface(null);
                            if (bVar2.f445418i.isPlaying()) {
                                return;
                            }
                            bVar2.f445418i.n(com.tencent.tav.core.AssetExtension.SCENE_PLAY, null);
                        }
                    }
                });
            }
        };
        bVar.getClass();
        bVar.x(new wf.g(bVar, runnable));
    }
}
