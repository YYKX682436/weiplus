package xc5;

/* loaded from: classes3.dex */
public final class w1 implements com.tencent.mm.ui.tools.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc5.x1 f453581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f453582b;

    public w1(xc5.x1 x1Var, yz5.a aVar) {
        this.f453581a = x1Var;
        this.f453582b = aVar;
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void a() {
        com.tencent.mars.xlog.Log.w("MicroMsg.MsgHistoryGalleryPageAni", "runExitAnimation onAnimationCancel");
        this.f453581a.f453589g = false;
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void b(float f17) {
        lf3.i iVar = this.f453581a.f453590h;
        if (iVar != null) {
            ((yh5.e) iVar).W6(f17);
        }
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void onAnimationEnd() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPageAni", "runExitAnimation onAnimationEnd");
        this.f453581a.f453589g = false;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new xc5.v1(this.f453582b));
    }

    @Override // com.tencent.mm.ui.tools.p3
    public void onAnimationStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPageAni", "runExitAnimation onAnimationStart");
        this.f453581a.f453589g = true;
    }
}
