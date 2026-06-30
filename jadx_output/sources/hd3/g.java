package hd3;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hd3.i f280555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280556f;

    public g(java.lang.String str, hd3.i iVar, java.lang.String str2) {
        this.f280554d = str;
        this.f280555e = iVar;
        this.f280556f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [jz5.f0] */
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.vfs.x1 x1Var;
        java.lang.Object obj;
        java.lang.String str = this.f280554d;
        lc3.z zVar = lc3.x.f317936c;
        java.lang.String str2 = null;
        if (str != null) {
            hd3.i iVar = this.f280555e;
            java.lang.String str3 = this.f280556f;
            java.lang.String str4 = "CPU_" + iVar.e().f344331a + '_' + java.lang.System.currentTimeMillis() + ".cpuprofile";
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bf3.r0.a(str4, str));
            if (!valueOf.booleanValue()) {
                valueOf = null;
            }
            ?? r86 = jz5.f0.f302826a;
            if (valueOf != null) {
                valueOf.booleanValue();
                int length = str.length();
                java.lang.String str5 = lp0.b.D() + "appbrand/trace/";
                java.lang.String str6 = str5 + str4;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopCpuProfile", "hy: dump successful with " + length + " bytes!");
                kotlin.jvm.internal.o.d(str3);
                if ((str3.length() > 0 ? str3 : null) != null) {
                    java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str5, false);
                    if (s17 != null) {
                        java.util.Iterator it = s17.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            java.lang.String name = ((com.tencent.mm.vfs.x1) obj).f213232b;
                            kotlin.jvm.internal.o.f(name, "name");
                            if (r26.i0.y(name, "gpu-".concat(str3), false)) {
                                break;
                            }
                        }
                        x1Var = (com.tencent.mm.vfs.x1) obj;
                    } else {
                        x1Var = null;
                    }
                    if (x1Var != null) {
                        str2 = x1Var.f213231a;
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).B(new hd3.f(length, str6, str2));
                iVar.s().invoke(iVar.k());
                str2 = r86;
            }
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopCpuProfile", "hy: cpu profile " + str4 + " generate failed");
                iVar.s().invoke(iVar.i(zVar));
            }
            str2 = r86;
        }
        if (str2 == null) {
            hd3.i iVar2 = this.f280555e;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopCpuProfile", "hy: cpu profile content is null!");
            iVar2.s().invoke(iVar2.i(zVar));
        }
    }
}
