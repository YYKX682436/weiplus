package j00;

/* loaded from: classes5.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f296856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f296857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f296858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f296859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296860i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f296861m;

    public p0(j00.k1 k1Var, android.graphics.Bitmap bitmap, int i17, int i18, boolean z17, java.lang.String str, android.widget.ImageView imageView) {
        this.f296855d = k1Var;
        this.f296856e = bitmap;
        this.f296857f = i17;
        this.f296858g = i18;
        this.f296859h = z17;
        this.f296860i = str;
        this.f296861m = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        j00.k1 k1Var = this.f296855d;
        android.graphics.Bitmap bitmap2 = this.f296856e;
        int i17 = this.f296857f;
        int i18 = this.f296858g;
        boolean z17 = this.f296859h;
        k1Var.getClass();
        int b17 = z17 ? i17 : i17 - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i18 / bitmap2.getHeight()));
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "createEcsGiftMsgBubble, width: " + i17 + ", height: " + i18 + ", wantedBitmapWidth:" + ceil + ", srcBitMapWidth:" + bitmap2.getWidth() + ", srcBitMapHeight:" + bitmap2.getHeight());
        if (ceil <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "createEcsGiftMsgBubble, wantedBitmapWidth or height error");
            bitmap = null;
        } else {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
            int i19 = ceil - b17;
            if (i19 < 0) {
                i19 = 0;
            }
            bitmap = com.tencent.mm.sdk.platformtools.x.p(com.tencent.mm.sdk.platformtools.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i18), false), z17 ? com.tencent.mm.R.drawable.dau : com.tencent.mm.R.drawable.bzs);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new j00.o0(bitmap, this.f296860i, this.f296861m));
    }
}
