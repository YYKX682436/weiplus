package df2;

/* loaded from: classes3.dex */
public final class dd {
    public dd(kotlin.jvm.internal.i iVar) {
    }

    public final void a(gk2.e buContext, int i17, int i18, java.lang.String str, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean a86 = ((mm2.c1) buContext.a(mm2.c1.class)).a8();
        boolean U7 = ((mm2.c1) buContext.a(mm2.c1.class)).U7();
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("style", i18);
        if (str != null) {
            gVar.h("taskId", str);
        }
        if (num != null) {
            gVar.o(ya.b.INDEX, num.intValue());
        }
        com.tencent.mars.xlog.Log.i("AnchorLiveTaskReport", "[reportAction] js = " + gVar);
        if (U7) {
            return;
        }
        if (a86) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.T1, gVar.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c18, 54L, gVar.toString(), null, 4, null);
        }
    }

    public final void c(gk2.e buContext, ml2.t1 id6, java.lang.String str) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(id6, "id");
        if (((mm2.c1) buContext.a(mm2.c1.class)).U7()) {
            com.tencent.mars.xlog.Log.i("AnchorLiveTaskReport", "[reportFinishExposed] id = " + id6);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (str != null) {
                hashMap.put("task_id", str);
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, id6, hashMap, null, null, null, null, false, 124, null);
        }
    }

    public final void d(gk2.e buContext, ml2.u1 id6, java.lang.String str) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(id6, "id");
        if (((mm2.c1) buContext.a(mm2.c1.class)).U7()) {
            com.tencent.mars.xlog.Log.i("AnchorLiveTaskReport", "[reportFinishExposed] id = " + id6);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (str != null) {
                hashMap.put("task_id", str);
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, id6, hashMap, null, null, null, null, false, 124, null);
        }
    }
}
