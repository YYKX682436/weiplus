package oj0;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f345736a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.HandlerThread f345737b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f345738c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f345739d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.ImageReader f345740e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f345741f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f345742g;

    /* renamed from: h, reason: collision with root package name */
    public int f345743h;

    /* renamed from: i, reason: collision with root package name */
    public int f345744i;

    /* renamed from: j, reason: collision with root package name */
    public rh0.d0 f345745j;

    /* renamed from: k, reason: collision with root package name */
    public int f345746k;

    /* renamed from: l, reason: collision with root package name */
    public int f345747l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f345748m = new java.util.ArrayList();

    public h() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("FilterRenderHandlerThread", 5);
        this.f345737b = a17;
        a17.start();
        this.f345736a = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
    }

    public final android.graphics.Bitmap a() {
        android.graphics.Bitmap bitmap = this.f345742g;
        if (bitmap != null) {
            return bitmap;
        }
        kotlin.jvm.internal.o.o("inputBitmap");
        throw null;
    }
}
