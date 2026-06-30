package sf;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static sf.b f406940b;

    /* renamed from: a, reason: collision with root package name */
    public static final sf.c f406939a = new sf.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Queue f406941c = new java.util.ArrayDeque(2);

    public final void a(com.tencent.mm.plugin.appbrand.jsapi.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, sf.b content) {
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (tVar == null || lVar == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appBrandPage == null: ");
            sb6.append(tVar == null);
            sb6.append(", appBrandService == null: ");
            sb6.append(lVar == null);
            com.tencent.mars.xlog.Log.i("Luggage.ExtendEditableKeyboardHeightDispatcher", sb6.toString());
            return;
        }
        f406940b = content;
        yz5.a aVar = content.f406938d;
        if (aVar != null) {
            aVar.invoke();
        }
        sf.b bVar = f406940b;
        if (bVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.p1 p1Var = new com.tencent.mm.plugin.appbrand.jsapi.p1();
            int i17 = bVar.f406935a > 0 ? bVar.f406936b : 0;
            java.lang.Integer num = bVar.f406937c;
            if ((num != null ? num.intValue() : -1) < 0) {
                num = null;
            }
            p1Var.s("height", java.lang.Integer.valueOf(ik1.w.e(i17)));
            if (num != null) {
                p1Var.s("viewId", java.lang.Integer.valueOf(num.intValue()));
            }
            p1Var.u(lVar);
            p1Var.m();
            p1Var.u(tVar);
            p1Var.m();
        }
        f406940b = null;
    }

    public final boolean b() {
        java.util.Queue queue = f406941c;
        if (((java.util.ArrayDeque) queue).size() < 2) {
            return true;
        }
        sf.a aVar = (sf.a) kz5.n0.W(queue);
        int i17 = aVar != null ? aVar.f406933a : -1;
        sf.a aVar2 = (sf.a) kz5.n0.h0(queue);
        return i17 == (aVar2 != null ? aVar2.f406933a : -1);
    }

    public final void c(sf.a action) {
        kotlin.jvm.internal.o.g(action, "action");
        java.util.Queue queue = f406941c;
        if (!queue.isEmpty()) {
            if (action.f406934b == ((sf.a) kz5.n0.h0(queue)).f406934b) {
                return;
            }
        }
        if (((java.util.ArrayDeque) queue).size() == 2) {
            ((java.util.ArrayDeque) queue).poll();
        }
        ((java.util.ArrayDeque) queue).offer(action);
    }
}
