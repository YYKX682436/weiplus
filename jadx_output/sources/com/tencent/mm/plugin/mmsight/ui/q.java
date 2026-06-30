package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final float f149393a;

    /* renamed from: b, reason: collision with root package name */
    public final float f149394b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f149395c = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f149396d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f149397e;

    /* renamed from: f, reason: collision with root package name */
    public float f149398f;

    /* renamed from: g, reason: collision with root package name */
    public long f149399g;

    /* renamed from: h, reason: collision with root package name */
    public long f149400h;

    /* renamed from: i, reason: collision with root package name */
    public float f149401i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f149402j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.a f149403k;

    public q(float f17, float f18) {
        this.f149393a = f17;
        this.f149394b = f18;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveProgressHandlerAnimator", "init >> " + f17 + ", " + f18);
        if (f18 > 35000.0f) {
            this.f149397e = true;
        }
    }
}
