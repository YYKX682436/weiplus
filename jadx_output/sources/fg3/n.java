package fg3;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.o f262439d;

    public n(fg3.o oVar) {
        this.f262439d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg3.o oVar = this.f262439d;
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c17 = oVar.a0().c();
        c17.setVideoTotalTime(oVar.f262444w);
        c17.a(oVar.f262443v);
    }
}
