package nd1;

/* loaded from: classes7.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.o4 f336422d;

    public x1(com.tencent.mm.plugin.appbrand.utils.o4 o4Var) {
        this.f336422d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.utils.o4 o4Var = this.f336422d;
        if (o4Var.a()) {
            o4Var.c(false);
        }
    }
}
