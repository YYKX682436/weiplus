package wu3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu3.h f449744d;

    public g(wu3.h hVar) {
        this.f449744d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.PhotoTextView captionView;
        captionView = this.f449744d.getCaptionView();
        captionView.setBackgroundDrawable(null);
    }
}
