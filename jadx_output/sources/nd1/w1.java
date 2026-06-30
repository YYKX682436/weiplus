package nd1;

/* loaded from: classes7.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.o4 f336413d;

    public w1(com.tencent.mm.plugin.appbrand.utils.o4 o4Var) {
        this.f336413d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.utils.o4 o4Var = this.f336413d;
        if (o4Var.b()) {
            o4Var.c(true);
        }
    }
}
