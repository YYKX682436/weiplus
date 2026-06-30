package gg1;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271620d;

    public q0(gg1.c1 c1Var) {
        this.f271620d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.w wVar = this.f271620d.f271540f;
        if (wVar != null) {
            wVar.e();
        } else {
            kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
            throw null;
        }
    }
}
