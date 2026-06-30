package cr0;

/* loaded from: classes12.dex */
public final class p0 implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f221707a;

    public p0(cr0.u0 u0Var) {
        this.f221707a = u0Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(method, "method");
        kotlin.jvm.internal.o.g(args, "args");
        java.lang.String name = method.getName();
        boolean b17 = kotlin.jvm.internal.o.b(name, "onTransactStarted");
        cr0.u0 u0Var = this.f221707a;
        if (b17) {
            if (args.length >= 2) {
                java.lang.Object obj2 = args[0];
                if ((obj2 instanceof android.os.IBinder) && (args[1] instanceof java.lang.Integer)) {
                    kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type android.os.IBinder");
                    java.lang.String interfaceDescriptor = ((android.os.IBinder) obj2).getInterfaceDescriptor();
                    cr0.u1.a(cr0.u1.f221760a, new cr0.m0(interfaceDescriptor));
                    if (interfaceDescriptor != null) {
                        if (interfaceDescriptor.length() > 0) {
                            java.lang.String str = (java.lang.String) cr0.u1.f221764e.getValue();
                            kotlin.jvm.internal.o.f(str, "<get-pkgName>(...)");
                            if (!r26.i0.A(interfaceDescriptor, str, false, 2, null)) {
                                java.lang.Object obj3 = args[1];
                                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                                return cr0.u0.b(u0Var, interfaceDescriptor, java.lang.String.valueOf(((java.lang.Integer) obj3).intValue()));
                            }
                        }
                    }
                }
            }
            cr0.u1.a(cr0.u1.f221760a, new cr0.n0(args));
        } else if (kotlin.jvm.internal.o.b(name, "onTransactEnded")) {
            cr0.u1.a(cr0.u1.f221760a, new cr0.o0(args));
            if (!(args.length == 0)) {
                java.lang.Object obj4 = args[0];
                if (obj4 instanceof cr0.d1) {
                    kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.matrix.battery.BinderTracker.PendingTimer");
                    cr0.u0.a(u0Var, (cr0.d1) obj4);
                }
            }
        }
        return null;
    }
}
