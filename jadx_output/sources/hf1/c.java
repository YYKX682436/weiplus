package hf1;

/* loaded from: classes15.dex */
public class c implements oe1.o1 {

    /* renamed from: d, reason: collision with root package name */
    public final hf1.b f280995d;

    public c(android.content.Context context) {
        this.f280995d = new hf1.b(context);
    }

    @Override // oe1.o1
    public boolean a(double d17, boolean z17) {
        return this.f280995d.a(d17, z17);
    }

    @Override // oe1.o1
    public boolean b(double d17) {
        return this.f280995d.b(d17);
    }

    @Override // oe1.o1
    public boolean c(float f17) {
        this.f280995d.c(f17);
        return false;
    }

    @Override // oe1.o1
    public void d() {
        this.f280995d.d();
    }

    @Override // oe1.o1
    public void e() {
        this.f280995d.e();
    }

    @Override // oe1.o1
    public void g() {
        this.f280995d.g();
    }

    @Override // oe1.o1
    public int getCacheTimeSec() {
        return this.f280995d.getCacheTimeSec();
    }

    @Override // oe1.o1
    public int getCurrPosMs() {
        return this.f280995d.getCurrPosMs();
    }

    @Override // oe1.o1
    public int getCurrPosSec() {
        return this.f280995d.getCurrPosSec();
    }

    @Override // oe1.o1
    public int getPlayerType() {
        return this.f280995d.getPlayerType();
    }

    @Override // oe1.o1
    public int getVideoDurationSec() {
        return this.f280995d.getVideoDurationSec();
    }

    @Override // oe1.o1
    public android.view.View getView() {
        return this.f280995d;
    }

    @Override // oe1.o1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.f280995d.h(z17, str, i17);
    }

    @Override // oe1.o1
    public boolean isPlaying() {
        return this.f280995d.isPlaying();
    }

    @Override // oe1.o1
    public boolean j() {
        return this.f280995d.j();
    }

    @Override // oe1.o1
    public void m() {
        this.f280995d.m();
    }

    @Override // oe1.o1
    public boolean pause() {
        return this.f280995d.pause();
    }

    @Override // oe1.o1
    public boolean play() {
        return this.f280995d.play();
    }

    @Override // oe1.o1
    public void setCover(android.graphics.Bitmap bitmap) {
        this.f280995d.setCover(bitmap);
    }

    @Override // oe1.o1
    public void setFullDirection(int i17) {
        this.f280995d.setFullDirection(i17);
    }

    @Override // oe1.o1
    public void setIMMVideoViewCallback(oe1.h1 h1Var) {
        this.f280995d.setIMMVideoViewCallback(h1Var);
    }

    @Override // oe1.o1
    public void setIsShowBasicControls(boolean z17) {
        this.f280995d.setIsShowBasicControls(z17);
    }

    @Override // oe1.o1
    public void setMute(boolean z17) {
        this.f280995d.setMute(z17);
    }

    @Override // oe1.o1
    public void setScaleType(oe1.m1 m1Var) {
        this.f280995d.setScaleType(m1Var);
    }

    @Override // oe1.o1
    public void setVideoContext(oe1.s1 s1Var) {
        this.f280995d.setVideoContext(s1Var);
    }

    @Override // oe1.o1
    public void setVideoFooterView(oe1.g1 g1Var) {
        this.f280995d.setVideoFooterView(g1Var);
    }

    @Override // oe1.o1
    public void setVideoSource(int i17) {
        this.f280995d.setVideoSource(i17);
    }

    @Override // oe1.o1
    public void start() {
        this.f280995d.start();
    }

    @Override // oe1.o1
    public void stop() {
        this.f280995d.stop();
    }
}
