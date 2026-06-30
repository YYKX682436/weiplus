package im1;

/* loaded from: classes15.dex */
public final class y implements yf.x {

    /* renamed from: b, reason: collision with root package name */
    public final yf.t f292237b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.l f292238c;

    /* renamed from: d, reason: collision with root package name */
    public final yf.h f292239d;

    public y(yf.t weEffectManager, yf.l stickerApplyAdapter, yf.h makeupApplyAdapter, int i17, kotlin.jvm.internal.i iVar) {
        stickerApplyAdapter = (i17 & 2) != 0 ? new im1.k(weEffectManager) : stickerApplyAdapter;
        makeupApplyAdapter = (i17 & 4) != 0 ? new im1.i(weEffectManager) : makeupApplyAdapter;
        kotlin.jvm.internal.o.g(weEffectManager, "weEffectManager");
        kotlin.jvm.internal.o.g(stickerApplyAdapter, "stickerApplyAdapter");
        kotlin.jvm.internal.o.g(makeupApplyAdapter, "makeupApplyAdapter");
        this.f292237b = weEffectManager;
        this.f292238c = stickerApplyAdapter;
        this.f292239d = makeupApplyAdapter;
    }

    @Override // yf.t
    public void a(yf.s sVar, java.lang.String str) {
        this.f292237b.a(sVar, str);
    }

    @Override // yf.t
    public void b(yf.r rVar, java.lang.String str) {
        this.f292237b.b(rVar, str);
    }

    @Override // yf.j
    public boolean c(yf.c info) {
        kotlin.jvm.internal.o.g(info, "info");
        return ((im1.i) this.f292239d).c(info);
    }

    @Override // yf.t
    public void d() {
        this.f292237b.d();
    }

    @Override // yf.t
    public void e(yf.q qVar, float f17) {
        this.f292237b.e(qVar, f17);
    }

    @Override // yf.j
    public boolean f(yf.f info) {
        kotlin.jvm.internal.o.g(info, "info");
        return ((im1.i) this.f292239d).f(info);
    }

    @Override // yf.j
    public boolean g(yf.g info) {
        kotlin.jvm.internal.o.g(info, "info");
        return ((im1.i) this.f292239d).g(info);
    }

    @Override // yf.j
    public boolean h(yf.c0 info) {
        kotlin.jvm.internal.o.g(info, "info");
        return ((im1.i) this.f292239d).h(info);
    }

    @Override // yf.j
    public boolean i(yf.d info) {
        kotlin.jvm.internal.o.g(info, "info");
        return ((im1.i) this.f292239d).i(info);
    }

    @Override // yf.t
    public boolean isEnabled() {
        return this.f292237b.isEnabled();
    }

    @Override // yf.n
    public boolean j(yf.s type, java.util.List stickerInfo, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(stickerInfo, "stickerInfo");
        return ((im1.k) this.f292238c).j(type, stickerInfo, jSONObject);
    }

    @Override // yf.t
    public void k(java.lang.String str, float f17) {
        this.f292237b.k(str, f17);
    }

    @Override // yf.t
    public void l() {
        this.f292237b.l();
    }

    @Override // yf.t
    public void m() {
        this.f292237b.m();
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onDetectFacePoints(float[] fArr) {
        this.f292237b.onDetectFacePoints(fArr);
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public int onTextureCustomProcess(int i17, int i18, int i19) {
        return this.f292237b.onTextureCustomProcess(i17, i18, i19);
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onTextureDestoryed() {
        this.f292237b.onTextureDestoryed();
    }
}
