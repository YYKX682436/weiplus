package sk4;

/* loaded from: classes14.dex */
public final class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f25.f0 f408962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.b f408963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f408964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f408965g;

    public a(f25.f0 f0Var, sk4.b bVar, int i17, byte[] bArr) {
        this.f408962d = f0Var;
        this.f408963e = bVar;
        this.f408964f = i17;
        this.f408965g = bArr;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioModuleImpl", "scene: " + this.f408962d + ", onResume, lose audio focus");
        sk4.b.a(this.f408963e, this.f408964f, this.f408965g);
    }

    @Override // f25.f
    public void onResume() {
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioModuleImpl", "scene: " + this.f408962d + ", onStop, lose audio focus");
        sk4.b.a(this.f408963e, this.f408964f, this.f408965g);
    }
}
