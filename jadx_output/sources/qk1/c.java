package qk1;

/* loaded from: classes15.dex */
public final class c implements oe1.o1 {

    /* renamed from: d, reason: collision with root package name */
    public final qk1.b f364420d;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f364420d = new qk1.b(context);
    }

    @Override // oe1.o1
    public boolean a(double d17, boolean z17) {
        return this.f364420d.a(d17, z17);
    }

    @Override // oe1.o1
    public boolean b(double d17) {
        return this.f364420d.b(d17);
    }

    @Override // oe1.o1
    public boolean c(float f17) {
        this.f364420d.c(f17);
        return false;
    }

    @Override // oe1.o1
    public void d() {
        this.f364420d.d();
    }

    @Override // oe1.o1
    public void e() {
        this.f364420d.e();
    }

    @Override // oe1.o1
    public void g() {
        this.f364420d.g();
    }

    @Override // oe1.o1
    public int getCacheTimeSec() {
        return this.f364420d.getCacheTimeSec();
    }

    @Override // oe1.o1
    public int getCurrPosMs() {
        return this.f364420d.getCurrPosMs();
    }

    @Override // oe1.o1
    public int getCurrPosSec() {
        return this.f364420d.getCurrPosSec();
    }

    @Override // oe1.o1
    public int getPlayerType() {
        return this.f364420d.getPlayerType();
    }

    @Override // oe1.o1
    public int getVideoDurationSec() {
        return this.f364420d.getVideoDurationSec();
    }

    @Override // oe1.o1
    public android.view.View getView() {
        return this.f364420d.getView();
    }

    @Override // oe1.o1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.f364420d.h(z17, str, i17);
    }

    @Override // oe1.o1
    public boolean isPlaying() {
        return this.f364420d.isPlaying();
    }

    @Override // oe1.o1
    public boolean j() {
        return this.f364420d.j();
    }

    @Override // oe1.o1
    public void m() {
        this.f364420d.m();
    }

    @Override // oe1.o1
    public boolean pause() {
        return this.f364420d.pause();
    }

    @Override // oe1.o1
    public boolean play() {
        return this.f364420d.play();
    }

    @Override // oe1.o1
    public void setCover(android.graphics.Bitmap bitmap) {
        this.f364420d.setCover(bitmap);
    }

    @Override // oe1.o1
    public void setFullDirection(int i17) {
        this.f364420d.setFullDirection(i17);
    }

    @Override // oe1.o1
    public void setIMMVideoViewCallback(oe1.h1 h1Var) {
        this.f364420d.setIMMVideoViewCallback(h1Var);
    }

    @Override // oe1.o1
    public void setIsShowBasicControls(boolean z17) {
        this.f364420d.setIsShowBasicControls(z17);
    }

    @Override // oe1.o1
    public void setMinBufferDuration(long j17) {
        this.f364420d.setMinBufferDuration(j17);
    }

    @Override // oe1.o1
    public void setMute(boolean z17) {
        this.f364420d.setMute(z17);
    }

    @Override // oe1.o1
    public void setScaleType(oe1.m1 m1Var) {
        this.f364420d.setScaleType(m1Var);
    }

    @Override // oe1.o1
    public void setVideoContext(oe1.s1 p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f364420d.setVideoContext(p07);
    }

    @Override // oe1.o1
    public void setVideoFooterView(oe1.g1 g1Var) {
        this.f364420d.setVideoFooterView(g1Var);
    }

    @Override // oe1.o1
    public void setVideoSource(int i17) {
        this.f364420d.setVideoSource(i17);
    }

    @Override // oe1.o1
    public void start() {
        this.f364420d.start();
    }

    @Override // oe1.o1
    public void stop() {
        this.f364420d.stop();
    }
}
