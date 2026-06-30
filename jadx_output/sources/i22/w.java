package i22;

/* loaded from: classes15.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public int f288059a = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels;

    /* renamed from: b, reason: collision with root package name */
    public int f288060b;

    /* renamed from: c, reason: collision with root package name */
    public int f288061c;

    /* renamed from: d, reason: collision with root package name */
    public int f288062d;

    /* renamed from: e, reason: collision with root package name */
    public int f288063e;

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public void d() {
        float f17 = 2;
        float a17 = this.f288059a - (a() * f17);
        if (a17 < b() * f17) {
            this.f288060b = 1;
            return;
        }
        int c17 = (int) ((c() + a17) / (b() + c()));
        float f18 = c17;
        this.f288061c = (int) ((a17 - (b() * f18)) / (c17 - 1));
        this.f288062d = (int) (((this.f288059a - (b() * f18)) - (this.f288061c * c17)) / f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3ItemSizeResolver", "updateSize: " + b() + ", " + a() + ", " + c() + ", " + this.f288060b + ", " + this.f288061c + ", " + this.f288062d);
        this.f288060b = c17;
    }
}
