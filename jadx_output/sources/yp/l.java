package yp;

/* loaded from: classes10.dex */
public class l implements yp.j, yp.k {

    /* renamed from: d, reason: collision with root package name */
    public boolean f464384d;

    /* renamed from: e, reason: collision with root package name */
    public yp.i f464385e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.danmaku.render.NativeDanmakuView f464386f;

    public l(com.tencent.mm.danmaku.render.NativeDanmakuView nativeDanmakuView) {
        this.f464386f = nativeDanmakuView;
        nativeDanmakuView.f64872d = this;
    }

    @Override // yp.j
    public void a(yp.i iVar) {
        this.f464385e = iVar;
    }

    @Override // yp.j
    public float b() {
        return this.f464386f.getY();
    }

    @Override // yp.j
    public android.view.View getView() {
        return this.f464386f;
    }

    @Override // yp.j
    public android.graphics.Canvas lockCanvas() {
        return null;
    }

    @Override // yp.j
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f464386f.setOnTouchListener(onTouchListener);
    }

    @Override // yp.j
    public void unlock() {
    }

    @Override // yp.j
    public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
    }
}
