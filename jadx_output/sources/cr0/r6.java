package cr0;

/* loaded from: classes12.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.z6 f221741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f221742e;

    public r6(cr0.z6 z6Var, android.os.Handler handler) {
        this.f221741d = z6Var;
        this.f221742e = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f221741d.getClass();
        cr0.z6.f221826f = this.f221742e;
        cr0.z6.f221831n = zh.c.d();
        if (com.tencent.matrix.hook.junwind.PthreadHackJni.d()) {
            cr0.z6.f221827g = zh.e.b().f472849a == 0;
            if (zh.c.a(cr0.z6.f221831n)) {
                cr0.z6.f221828h = zh.e.a().f472849a == 0;
            }
        }
    }
}
