package gg1;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271658d;

    public z(gg1.c1 c1Var) {
        this.f271658d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.w wVar = this.f271658d.f271540f;
        if (wVar != null) {
            if (wVar != null) {
                wVar.e();
            } else {
                kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
                throw null;
            }
        }
    }
}
