package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class b4 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: f, reason: collision with root package name */
    public static int f192473f;

    /* renamed from: a, reason: collision with root package name */
    public final int f192474a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f192475b;

    /* renamed from: c, reason: collision with root package name */
    public long f192476c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f192477d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.a4 f192478e;

    public b4(com.tencent.mm.sdk.platformtools.a4 a4Var, boolean z17) {
        this.f192476c = 0L;
        this.f192477d = false;
        this.f192478e = a4Var;
        this.f192474a = b();
        this.f192475b = z17;
        if (java.lang.Thread.currentThread().getName().equals("initThread") || "initThread".equals(xu5.b.e())) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread, stack %s", new com.tencent.mm.sdk.platformtools.z3());
        }
    }

    public static int b() {
        if (f192473f >= 8192) {
            f192473f = 0;
        }
        int i17 = f192473f + 1;
        f192473f = i17;
        return i17;
    }

    public void c(long j17, long j18) {
        this.f192476c = j18;
        d();
        this.f192477d = false;
        sendEmptyMessageDelayed(this.f192474a, j17);
    }

    public void d() {
        removeMessages(this.f192474a);
        this.f192477d = true;
    }

    public boolean e() {
        return this.f192477d || !hasMessages(this.f192474a);
    }

    public void finalize() {
        d();
        super.finalize();
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.sdk.platformtools.a4 a4Var;
        int i17 = message.what;
        int i18 = this.f192474a;
        if (i17 == i18 && (a4Var = this.f192478e) != null && a4Var.onTimerExpired() && this.f192475b && !this.f192477d) {
            sendEmptyMessageDelayed(i18, this.f192476c);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public java.lang.String toString() {
        if (this.f192478e == null) {
            return "MTimerHandler(" + getClass().getName() + "){mCallBack = null}";
        }
        return "MTimerHandler(" + getClass().getName() + "){mCallBack = " + this.f192478e.getClass().getName() + "}";
    }

    public b4(android.os.Looper looper, com.tencent.mm.sdk.platformtools.a4 a4Var, boolean z17) {
        super(looper);
        this.f192476c = 0L;
        this.f192477d = false;
        this.f192478e = a4Var;
        this.f192474a = b();
        this.f192475b = z17;
        if (java.lang.Thread.currentThread().getName().equals("initThread") || "initThread".equals(xu5.b.e())) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MTimerHandler", "MTimerHandler can not init handler with initThread, stack %s", new com.tencent.mm.sdk.platformtools.z3());
        }
    }

    public b4(java.lang.String str, com.tencent.mm.sdk.platformtools.a4 a4Var, boolean z17) {
        super(str);
        this.f192476c = 0L;
        this.f192477d = false;
        this.f192478e = a4Var;
        this.f192474a = b();
        this.f192475b = z17;
    }

    public b4(xu5.b bVar, com.tencent.mm.sdk.platformtools.a4 a4Var, boolean z17) {
        super(bVar);
        this.f192476c = 0L;
        this.f192477d = false;
        this.f192478e = a4Var;
        this.f192474a = b();
        this.f192475b = z17;
    }
}
