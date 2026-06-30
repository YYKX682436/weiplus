package wu3;

/* loaded from: classes5.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView f449828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f449830f;

    public x1(com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView, int i17, int i18) {
        this.f449828d = musicLrcView;
        this.f449829e = i17;
        this.f449830f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView = this.f449828d;
        android.widget.Scroller scroller = musicLrcView.f156058e;
        kotlin.jvm.internal.o.d(scroller);
        scroller.startScroll(musicLrcView.f156061h, 0, this.f449829e, 0, this.f449830f);
        musicLrcView.invalidate();
    }
}
