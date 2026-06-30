package u04;

/* loaded from: classes12.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f423469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x60 f423470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, r45.x60 x60Var) {
        super(0);
        this.f423469d = i17;
        this.f423470e = x60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity;
        u04.d dVar = u04.d.f423475a;
        jz5.f0 f0Var = null;
        r45.x60 x60Var = this.f423470e;
        java.lang.String str = x60Var != null ? x60Var.f389813d : null;
        if (str == null) {
            str = "";
        }
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryHelper", "topActivity == null or isFinishing or isDestroyed");
        } else {
            if ((x60Var != null ? x60Var.f389815f : null) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryHelper", "recoveryObj == null ");
            } else {
                int i17 = al5.u4.f6058t;
                al5.t4 t4Var = new al5.t4(activity);
                t4Var.f6042e = str;
                t4Var.a(activity.getString(com.tencent.mm.R.string.odr));
                t4Var.f6038a.f6014b = new u04.c(activity, this.f423469d, x60Var);
                t4Var.f6046i = 10000;
                t4Var.f6045h = i65.a.f(activity, com.tencent.mm.R.dimen.anq);
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str2 = x60Var.f389816g;
                objArr[0] = str2 == null || str2.length() == 0 ? "" : x60Var.f389816g;
                t4Var.f6043f = activity.getString(com.tencent.mm.R.string.odt, objArr);
                t4Var.f6049l = true;
                t4Var.f6039b = 1;
                t4Var.g();
                s04.b bVar = s04.b.f401971a;
                java.util.Map map = s04.b.f401972b;
                ((java.util.LinkedHashMap) map).clear();
                java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
                kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
                java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) kz5.z.U(stackTrace, 2);
                java.lang.String methodName = stackTraceElement != null ? stackTraceElement.getMethodName() : null;
                if (methodName == null) {
                    methodName = "unknown_method";
                }
                s04.a aVar = u04.d.f423478d;
                if (aVar != null) {
                    map.put("exit_wechat_timestamp", java.lang.Long.valueOf(aVar.f401968a));
                    java.lang.Integer num = (java.lang.Integer) s04.b.f401973c.get(java.lang.Integer.valueOf(aVar.f401969b));
                    map.put("watch_before_exiting_type", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryReporter", methodName + ": reportParams: " + map);
                    dy1.r a17 = bVar.a();
                    if (a17 != null) {
                        ((cy1.a) a17).Hj("toast_button", "view_exp", map, 33328);
                        f0Var = f0Var2;
                    }
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecoveryReporter", methodName.concat(": recoveryReportData is null"));
                }
            }
        }
        return f0Var2;
    }
}
