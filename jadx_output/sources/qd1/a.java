package qd1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qd1.b f361603f;

    public a(qd1.b bVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f361603f = bVar;
        this.f361601d = e9Var;
        this.f361602e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.i3 i3Var;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361601d;
        qd1.b bVar = this.f361603f;
        bVar.getClass();
        try {
            i3Var = e9Var.t3().x0();
        } catch (java.lang.Throwable unused) {
            i3Var = null;
        }
        int i17 = this.f361602e;
        if (i3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHideToast", "hideToast uiThread NULL page");
            e9Var.a(i17, bVar.o("fail:page don't exist"));
            return;
        }
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
            boolean z17 = false;
            if (t37 != null) {
                if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
                    throw new java.lang.RuntimeException("Should be called on main-thread");
                }
                ul1.h hVar = (ul1.h) t37.k(ul1.h.class);
                if (hVar != null) {
                    boolean z18 = false;
                    while (true) {
                        java.util.LinkedList linkedList = hVar.f428581d;
                        if (linkedList.isEmpty()) {
                            break;
                        } else {
                            z18 |= ((com.tencent.mm.plugin.appbrand.page.v5) linkedList.poll()).P1().b(false);
                        }
                    }
                    z17 = z18;
                }
            }
            if (z17) {
                e9Var.a(i17, bVar.o("ok"));
            } else {
                e9Var.a(i17, bVar.o("fail:toast can't be found"));
            }
        } catch (java.lang.Throwable unused2) {
            e9Var.a(i17, bVar.o("fail:internal error"));
        }
    }
}
