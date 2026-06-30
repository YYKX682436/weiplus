package kl4;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ll4.d f308952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f308954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f308955g;

    public m(ll4.d dVar, kl4.a0 a0Var, long j17, long j18) {
        this.f308952d = dVar;
        this.f308953e = a0Var;
        this.f308954f = j17;
        this.f308955g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.a0 a0Var = this.f308953e;
        if (!kotlin.jvm.internal.o.b(this.f308952d, a0Var.f308868e) || a0Var.f308869f || a0Var.f308871h) {
            return;
        }
        if (a0Var.f308874n == null) {
            com.tencent.mars.xlog.Log.e(a0Var.f308880t, "onEventChanged contextBytes is null, can not call onPlayEvent");
            return;
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = a0Var.f308867d;
        long j17 = this.f308954f;
        long j18 = this.f308955g;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            jm4.u3 u3Var = (jm4.u3) ((com.tencent.unit_rc.WeakPtr) it.next()).lock();
            if (u3Var != null) {
                u3Var.x(j17, j17, j18);
            }
        }
    }
}
