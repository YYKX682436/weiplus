package ui1;

/* loaded from: classes7.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ui1.p f428082d = new ui1.p(null);

    /* renamed from: a, reason: collision with root package name */
    public final ui1.r f428083a;

    /* renamed from: b, reason: collision with root package name */
    public final ui1.a0 f428084b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428085c;

    public t(ui1.r rVar, ui1.a0 a0Var) {
        this.f428083a = new ui1.f(this, rVar, a0Var);
        this.f428084b = a0Var;
        this.f428085c = a0Var.f428025a.t3().f74805p.f77281g;
    }

    public static void a(ui1.t tVar, com.tencent.mm.plugin.appbrand.networking.c0 c0Var, r45.h24 h24Var) {
        ui1.a0 a0Var = tVar.f428084b;
        com.tencent.mm.plugin.appbrand.y yVar = a0Var.f428025a;
        java.lang.String appId = yVar.getAppId();
        java.lang.String str = a0Var.f428026b;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, appId %s, api %s, checkAuth Response.errcode %d", appId, str, java.lang.Integer.valueOf(h24Var.f375773d.f377491d));
        r45.j14 j14Var = h24Var.f375773d;
        int i17 = j14Var.f377491d;
        ui1.r rVar = tVar.f428083a;
        if (i17 == 0) {
            f428082d.e(appId, str);
            ((ui1.f) rVar).a();
            return;
        }
        if (i17 != -12000) {
            int i18 = j14Var.f377493f;
            if (i18 == 0) {
                rVar.b(j14Var.f377492e);
                return;
            } else {
                ((ui1.f) rVar).c(i18, j14Var.f377492e);
                return;
            }
        }
        r45.jv5 jv5Var = (r45.jv5) h24Var.f375774e.get(0);
        if (jv5Var == null) {
            rVar.b(null);
            return;
        }
        if ((t37 instanceof ze.n) && ((ze.n) t37).Z1()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, is headless mode");
            ((ui1.f) rVar).onCancel();
            return;
        }
        java.lang.String str2 = h24Var.f375779m;
        java.lang.String str3 = h24Var.f375778i;
        java.lang.String str4 = h24Var.f375777h;
        java.lang.String str5 = jv5Var.f378131d;
        boolean b17 = si1.d1.b(str5, t37.E0());
        java.lang.String a17 = si1.d1.a(str5, t37);
        if (!b17 || !android.text.TextUtils.isEmpty(a17)) {
            yVar.m(new ui1.o(tVar, t37, yVar, str5, h24Var, appId, str, c0Var, str2, jv5Var, str4, str3, b17, a17));
        } else {
            rVar.b("fail:require permission desc");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user confirm, error = fail:require permission desc");
        }
    }

    public static void b(ui1.t tVar, com.tencent.mm.plugin.appbrand.networking.c0 c0Var, java.lang.String str, int i17, boolean z17, boolean z18, ui1.s sVar) {
        tVar.getClass();
        r45.e24 e24Var = new r45.e24();
        ui1.a0 a0Var = tVar.f428084b;
        e24Var.f372924d = a0Var.f428025a.getAppId();
        e24Var.f372925e.add(str);
        e24Var.f372926f = i17;
        e24Var.f372929i = z18;
        java.lang.String appId = a0Var.f428025a.getAppId();
        c0Var.e1("/cgi-bin/mmbiz-bin/js-authorize-confirm", appId, e24Var, r45.f24.class).n(new ui1.g(tVar, i17, appId, a0Var.f428026b, str, z17, sVar));
    }

    public static void c(ui1.a0 a0Var, ui1.r rVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f428025a.getAppId()) || com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f428026b)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.y component = a0Var.f428025a;
        java.util.HashMap hashMap = ui1.e.f428043h;
        kotlin.jvm.internal.o.g(component, "component");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
        ui1.e eVar = null;
        if (t37 != null) {
            java.util.HashMap hashMap2 = ui1.e.f428043h;
            synchronized (hashMap2) {
                ui1.e eVar2 = (ui1.e) hashMap2.get(t37);
                if (eVar2 == null) {
                    eVar2 = new ui1.e(t37, null);
                    hashMap2.put(t37, eVar2);
                }
                eVar = eVar2;
            }
        }
        if (eVar != null) {
            eVar.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name[");
            sb6.append(a0Var.f428026b);
            sb6.append("], callbackId[");
            sb6.append(a0Var.f428028d);
            sb6.append("], appId[");
            com.tencent.mm.plugin.appbrand.y yVar = a0Var.f428025a;
            sb6.append(yVar.getAppId());
            sb6.append("], component[");
            sb6.append(yVar.getComponentId());
            sb6.append(']');
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSApiUserAuthExecutor", "execute " + sb7);
            eVar.a(new ui1.c(a0Var, rVar, sb7));
        }
    }
}
