package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f149313a;

    /* renamed from: b, reason: collision with root package name */
    public final float f149314b;

    /* renamed from: c, reason: collision with root package name */
    public final float f149315c;

    /* renamed from: d, reason: collision with root package name */
    public long f149316d;

    /* renamed from: e, reason: collision with root package name */
    public float f149317e;

    /* renamed from: f, reason: collision with root package name */
    public final int f149318f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f149319g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.d2 f149320h;

    public e2(float f17, float f18, int i17) {
        this.f149313a = null;
        this.f149314b = f17;
        this.f149315c = f18;
        this.f149318f = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProgressHandlerAnimator", "create ProgressHandlerAnimator, start: %s, end: %s, duration: %s, updateStep: %s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i17), java.lang.Float.valueOf((100.0f / i17) * 20.0f));
        this.f149319g = false;
        this.f149316d = 0L;
        this.f149313a = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.mmsight.ui.c2(this), true);
    }
}
