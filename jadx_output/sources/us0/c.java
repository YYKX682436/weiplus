package us0;

/* loaded from: classes10.dex */
public final class c extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f430446n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ts0.r f430447a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430448b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f430449c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f430450d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f430451e;

    /* renamed from: f, reason: collision with root package name */
    public vs0.l f430452f;

    /* renamed from: g, reason: collision with root package name */
    public float f430453g;

    /* renamed from: h, reason: collision with root package name */
    public float f430454h;

    /* renamed from: i, reason: collision with root package name */
    public int f430455i;

    /* renamed from: j, reason: collision with root package name */
    public int f430456j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f430457k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f430458l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.ImageReader.OnImageAvailableListener f430459m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.os.Looper looper, android.content.Context mContext, ts0.r camera) {
        super(looper);
        int i17;
        kotlin.jvm.internal.o.g(looper, "looper");
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(camera, "camera");
        this.f430447a = camera;
        this.f430448b = "MicroMsg.BaseCameraHandler";
        this.f430457k = true;
        this.f430458l = "auto";
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCameraHandler", "init camera handler");
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraHandler");
        this.f430450d = handlerThread;
        handlerThread.start();
        this.f430449c = new android.os.Handler(handlerThread.getLooper());
        int[] iArr = it0.c.f294486a;
        wo.g1 g1Var = wo.v1.f447829i;
        if ((g1Var == null || (i17 = g1Var.f447709w) == -1 || i17 != 1) ? false : true) {
            this.f430452f = new vs0.l(mContext);
        }
        this.f430459m = new us0.b(this);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what == 4354) {
            int i17 = this.f430455i;
            java.lang.String str = this.f430448b;
            ts0.r rVar = this.f430447a;
            if (i17 == 0 || this.f430456j == 0 || fp.h.a(14)) {
                this.f430457k = false;
                this.f430458l = rVar.n();
                this.f430457k = !rVar.a();
                com.tencent.mars.xlog.Log.i(str, "triggerAutoFocus ret " + this.f430457k);
                return;
            }
            float f17 = this.f430453g;
            float f18 = this.f430454h;
            int i18 = this.f430455i;
            int i19 = this.f430456j;
            if (rVar == null) {
                com.tencent.mars.xlog.Log.w(str, "want to auto focus, but camera is null, do nothing");
            } else {
                if (!this.f430457k) {
                    com.tencent.mars.xlog.Log.w(str, "auto focus not back");
                    return;
                }
                this.f430457k = false;
                this.f430458l = rVar.n();
                this.f430457k = rVar.y(this.f430447a.m(f17, f18, 1.25f, i18, i19), this.f430447a.m(f17, f18, 1.0f, i18, i19));
            }
        }
    }
}
