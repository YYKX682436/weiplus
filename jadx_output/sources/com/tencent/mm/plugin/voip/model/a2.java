package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class a2 {

    /* renamed from: j, reason: collision with root package name */
    public static com.tencent.mm.plugin.voip.model.a2 f176322j;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f176328f;

    /* renamed from: a, reason: collision with root package name */
    public int f176323a = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f176325c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f176326d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f176327e = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176329g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f176330h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f176331i = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.w1(this), true);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.v2protocal f176324b = new com.tencent.mm.plugin.voip.model.v2protocal(new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()));

    public static com.tencent.mm.plugin.voip.model.a2 a() {
        if (f176322j == null) {
            f176322j = new com.tencent.mm.plugin.voip.model.a2();
        }
        return f176322j;
    }

    public void b(boolean z17) {
        com.tencent.mm.plugin.voip.model.z1 z1Var;
        if (z17) {
            com.tencent.mm.plugin.voip.model.v2protocal.f176820g2++;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipNetStatusChecker", "my network bad");
        } else {
            com.tencent.mm.plugin.voip.model.v2protocal.f176821h2++;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipNetStatusChecker", "otherside network bad");
        }
        this.f176330h = 0;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f176325c) {
            return;
        }
        long j17 = this.f176327e;
        if (j17 == -1 || currentTimeMillis - j17 >= 5000) {
            this.f176325c = true;
            this.f176327e = currentTimeMillis;
            java.lang.ref.WeakReference weakReference = this.f176328f;
            if (weakReference == null || (z1Var = (com.tencent.mm.plugin.voip.model.z1) weakReference.get()) == null) {
                return;
            }
            z1Var.m(z17);
        }
    }

    public void c() {
        this.f176327e = -1L;
        this.f176329g = true;
        this.f176323a = 0;
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.voip.model.x1(this), 3000L);
    }
}
