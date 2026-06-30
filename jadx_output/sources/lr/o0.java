package lr;

/* loaded from: classes10.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f320560a;

    /* renamed from: b, reason: collision with root package name */
    public int f320561b;

    /* renamed from: c, reason: collision with root package name */
    public int f320562c;

    /* renamed from: d, reason: collision with root package name */
    public int f320563d;

    /* renamed from: e, reason: collision with root package name */
    public int f320564e;

    public o0() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        context.getResources();
        this.f320560a = i65.a.b(context, 400);
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public final void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PanelSizeResolver", "setParentWidth: " + i17);
        if (i17 <= 0) {
            return;
        }
        this.f320560a = i17;
        e();
    }

    public void e() {
        float f17 = 2;
        float a17 = this.f320560a - (a() * f17);
        if (a17 < b() * f17) {
            this.f320561b = 1;
            return;
        }
        int b17 = ((int) ((a17 - b()) / (b() + c()))) + 1;
        float f18 = b17;
        this.f320562c = (int) ((a17 - (b() * f18)) / (b17 - 1));
        float b18 = this.f320560a - (b() * f18);
        int i17 = this.f320562c;
        this.f320563d = (int) ((b18 - (i17 * b17)) / f17);
        this.f320564e = i17 / 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.PanelSizeResolver", "updateSize: " + b() + ", " + a() + ", " + c() + ", " + this.f320561b + ", " + this.f320562c + ", " + this.f320563d + ", " + this.f320564e);
        this.f320561b = b17;
    }
}
