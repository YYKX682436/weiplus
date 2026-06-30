package rv3;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView f400404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f400405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f400406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv3.s f400407g;

    public o(com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView, yz5.l lVar, int i17, rv3.s sVar) {
        this.f400404d = musicLrcView;
        this.f400405e = lVar;
        this.f400406f = i17;
        this.f400407g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView = this.f400404d;
        android.text.TextPaint paint = musicLrcView.getPaint();
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String obj = musicLrcView.getText().toString();
        paint.getTextBounds(obj, 0, obj.length(), rect);
        rect.width();
        musicLrcView.getWidth();
        if (rect.width() < musicLrcView.getWidth()) {
            this.f400407g.getClass();
            musicLrcView.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            musicLrcView.setMarqueeRepeatLimit(-1);
            musicLrcView.d(false, -1);
            return;
        }
        musicLrcView.setEllipsize(null);
        yz5.l lVar = this.f400405e;
        if (lVar != null) {
            lVar.invoke(musicLrcView);
        }
        musicLrcView.d(true, this.f400406f);
    }
}
