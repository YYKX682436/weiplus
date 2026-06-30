package sm2;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f409676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409677e;

    public r(sm2.o4 o4Var) {
        this.f409677e = o4Var;
    }

    public final boolean a() {
        return this.f409676d;
    }

    public final void b(boolean z17) {
        this.f409676d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f409676d = false;
        sm2.o4 o4Var = this.f409677e;
        com.tencent.mars.xlog.Log.i(o4Var.f409610f, "closeMicHeartRunnable invoke");
        lk2.c.f319010e.a(o4Var.f19609a, 1, null);
    }
}
