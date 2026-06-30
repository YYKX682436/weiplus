package pn0;

/* loaded from: classes14.dex */
public abstract class a implements pn0.b {

    /* renamed from: e, reason: collision with root package name */
    public int f356941e;

    /* renamed from: f, reason: collision with root package name */
    public int f356942f;

    /* renamed from: g, reason: collision with root package name */
    public int f356943g;

    /* renamed from: j, reason: collision with root package name */
    public final nn0.o f356946j;

    /* renamed from: a, reason: collision with root package name */
    public int f356937a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f356938b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f356939c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f356940d = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356944h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f356945i = false;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.rtmp.ui.TXCloudVideoView f356947k = null;

    public a(nn0.o oVar) {
        this.f356946j = null;
        this.f356946j = oVar;
    }

    @Override // pn0.b
    public void B(boolean z17) {
    }

    @Override // pn0.b
    public boolean a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        return true;
    }

    @Override // pn0.b
    public void b(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.f356947k = tXCloudVideoView;
    }

    @Override // pn0.b
    public void c(int i17, int i18) {
        if (this.f356939c == i17 && this.f356940d == i18) {
            return;
        }
        this.f356939c = i17;
        this.f356940d = i18;
    }

    public boolean d() {
        return getSurface() != null && getSurface().isValid();
    }

    @Override // pn0.b
    public void release() {
    }

    @Override // pn0.b
    public void setRenderMode(int i17) {
        this.f356942f = i17;
    }

    @Override // pn0.b
    public void setRenderRotation(int i17) {
        this.f356943g = i17;
    }

    @Override // pn0.b
    public void u(int i17, int i18) {
        if (i17 == this.f356937a && i18 == this.f356938b) {
            return;
        }
        this.f356937a = i17;
        this.f356938b = i18;
    }
}
