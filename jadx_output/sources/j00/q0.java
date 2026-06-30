package j00;

/* loaded from: classes5.dex */
public final class q0 implements j00.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f296866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f296867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f296869e;

    public q0(int i17, int i18, boolean z17, j00.k1 k1Var, android.widget.ImageView imageView) {
        this.f296865a = i17;
        this.f296866b = i18;
        this.f296867c = z17;
        this.f296868d = k1Var;
        this.f296869e = imageView;
    }

    public void a(android.graphics.Bitmap bitmap, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, bitmap is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, create bubble, url:" + url + ", viewHeight:" + this.f296865a + ", viewWitdh:" + this.f296866b + ", isSender:" + this.f296867c);
        ((ku5.t0) ku5.t0.f312615d).h(new j00.p0(this.f296868d, bitmap, this.f296866b, this.f296865a, this.f296867c, url, this.f296869e), "MicroMsg.EcsGiftMsgService");
    }
}
