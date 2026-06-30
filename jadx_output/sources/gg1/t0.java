package gg1;

/* loaded from: classes7.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271629d;

    public t0(gg1.c1 c1Var) {
        this.f271629d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.w wVar = this.f271629d.f271540f;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
            throw null;
        }
        if (wVar.d() && wVar.f271637g != null) {
            gg1.p pVar = wVar.f271640m;
            if (pVar != null) {
                pVar.notifyDataSetChanged();
            } else {
                kotlin.jvm.internal.o.o("recycleViewAdapter");
                throw null;
            }
        }
    }
}
