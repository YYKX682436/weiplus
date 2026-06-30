package i85;

/* loaded from: classes12.dex */
public final class b implements d85.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i85.c f289663a;

    public b(i85.c cVar) {
        this.f289663a = cVar;
    }

    @Override // d85.m1
    public jz5.l a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean z17;
        java.lang.String name;
        boolean z18;
        android.content.ClipboardManager clipboardManager;
        i85.c cVar = this.f289663a;
        boolean z19 = false;
        if (kotlin.jvm.internal.o.b(cVar.a(), "phone") && method != null) {
            java.lang.String name2 = method.getName();
            kotlin.jvm.internal.o.f(name2, "getName(...)");
            if (r26.i0.y(name2, "requestCellInfoUpdate", false) && android.os.Build.VERSION.SDK_INT == 29) {
                return new jz5.l(java.lang.Boolean.FALSE, null);
            }
        }
        if (kotlin.jvm.internal.o.b(cVar.a(), "clipboard") && method != null) {
            java.util.List i17 = kz5.c0.i("getPrimaryClip", "getPrimaryClipDescription");
            if (!i17.isEmpty()) {
                java.util.Iterator it = i17.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(method.getName(), (java.lang.String) it.next())) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18 && (clipboardManager = (android.content.ClipboardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.content.ClipboardManager.class)) != null && !clipboardManager.hasPrimaryClip()) {
                return new jz5.l(java.lang.Boolean.FALSE, null);
            }
        }
        g85.c cVar2 = (g85.c) g85.d.f269555a.get(method != null ? method.getName() : null);
        jz5.l value = cVar2 != null ? cVar2.value() : null;
        if (value != null) {
            boolean z27 = (method == null || (name = method.getName()) == null || !name.equals("getConnectionInfo")) ? false : true;
            java.lang.Object obj2 = value.f302834e;
            if (z27 && (obj2 instanceof android.net.wifi.WifiInfo)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onServiceMethodIntercept] methodName = ");
                java.lang.String name3 = method != null ? method.getName() : null;
                if (name3 == null) {
                    name3 = "";
                }
                sb6.append(name3);
                sb6.append(", return cache: ");
                sb6.append(obj2);
                com.tencent.mars.xlog.Log.w("BaseHookSysServiceProcessor", sb6.toString());
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onServiceMethodIntercept] methodName = ");
                java.lang.String name4 = method != null ? method.getName() : null;
                if (name4 == null) {
                    name4 = "";
                }
                sb7.append(name4);
                sb7.append(", return cache:");
                if (obj2 == null) {
                    obj2 = "null";
                }
                sb7.append(obj2);
                com.tencent.mars.xlog.Log.w("BaseHookSysServiceProcessor", sb7.toString());
            }
            if (((java.lang.Boolean) value.f302833d).booleanValue()) {
                z17 = false;
            } else {
                if (method != null) {
                    method.getName();
                }
                z17 = true;
            }
            j85.g gVar = j85.g.f298251a;
            java.lang.String serviceName = cVar.a();
            java.lang.String name5 = method != null ? method.getName() : null;
            java.lang.String str = name5 != null ? name5 : "";
            kotlin.jvm.internal.o.g(serviceName, "serviceName");
            pm0.v.M(j85.g.f298252b, false, new j85.d(serviceName, str, z17), 2, null);
        }
        if (value != null && !((java.lang.Boolean) value.f302833d).booleanValue()) {
            return value;
        }
        if (method != null) {
            k85.t tVar = k85.t.f305439a;
            java.lang.String name6 = method.getName();
            kotlin.jvm.internal.o.f(name6, "getName(...)");
            if (k85.t.b(tVar, name6, null, 2, null)) {
                z19 = true;
            }
        }
        if (!z19) {
            return new jz5.l(java.lang.Boolean.TRUE, null);
        }
        try {
            return new jz5.l(java.lang.Boolean.FALSE, method.getReturnType().newInstance());
        } catch (java.lang.Exception unused) {
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
    }

    @Override // d85.m1
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (kotlin.jvm.internal.o.b(this.f289663a.a(), "phone") || kotlin.jvm.internal.o.b(this.f289663a.a(), "clipboard")) {
            if (!com.tencent.mm.sdk.platformtools.s9.f192975c || com.tencent.mars.xlog.Log.getLogLevel() > 1) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onServiceMethodInvoke] methodName = ");
            sb6.append(this.f289663a.a());
            sb6.append('#');
            sb6.append(method != null ? method.getName() : null);
            com.tencent.mars.xlog.Log.i("Kenneth-methodCall", sb6.toString());
            ((ku5.t0) ku5.t0.f312615d).g(new i85.a(new java.lang.Throwable(), this.f289663a, method));
            return;
        }
        if (method != null) {
            method.getName();
        }
        java.util.List list = g85.e.f269556a;
        java.lang.String name = method != null ? method.getName() : null;
        if (name == null) {
            name = "";
        }
        if (g85.e.f269556a.contains(name)) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TraceMethodConfig", "sensitive method:".concat(name), new java.lang.Object[0]);
        }
    }

    @Override // d85.m1
    public void c(java.lang.reflect.Method method, java.lang.Object obj) {
        java.lang.String name = method != null ? method.getName() : null;
        if (name == null || obj == null) {
            return;
        }
        java.util.HashMap hashMap = g85.d.f269555a;
        g85.c cVar = (g85.c) g85.d.f269555a.get(name);
        if (cVar != null) {
            cVar.a(obj);
        }
    }
}
