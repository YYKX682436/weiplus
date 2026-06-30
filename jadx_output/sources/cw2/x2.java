package cw2;

/* loaded from: classes10.dex */
public final class x2 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f224103a;

    public x2(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f224103a = new android.widget.ImageView(context);
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        kotlin.jvm.internal.o.g(onReady, "onReady");
        kotlin.jvm.internal.o.g(onDestroy, "onDestroy");
        kotlin.jvm.internal.o.g(onSeekFrame, "onSeekFrame");
    }

    @Override // cw2.aa
    public void destroy() {
    }

    @Override // cw2.aa
    public android.graphics.Bitmap getBitmap() {
        return ug5.x.b(this.f224103a);
    }

    @Override // cw2.aa
    public long getCurrentPositionMs() {
        return 0L;
    }

    @Override // cw2.aa
    public android.view.View getView() {
        return this.f224103a;
    }

    @Override // cw2.aa
    public void resume() {
    }

    @Override // cw2.aa
    public void seekTo(long j17) {
    }
}
