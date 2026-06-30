package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class s7 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.u7 f116674d;

    public s7(com.tencent.mm.plugin.finder.live.view.u7 u7Var) {
        this.f116674d = u7Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        wu5.c cVar;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 3) {
            com.tencent.mm.plugin.finder.live.view.u7 u7Var = this.f116674d;
            u7Var.getClass();
            gk2.e eVar = gk2.e.f272471n;
            if (eVar != null) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                r45.b22 b22Var = (r45.b22) u7Var.f116715b.get(java.lang.Long.valueOf(((mm2.e1) c1Var.business(mm2.e1.class)).f328988r.getLong(0)));
                if (b22Var == null) {
                    b22Var = new r45.b22();
                }
                java.lang.String string = b22Var.getString(0);
                boolean z17 = !(string == null || string.length() == 0);
                gk2.e eVar2 = gk2.e.f272471n;
                boolean z18 = eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).U7();
                com.tencent.mars.xlog.Log.i("FinderLiveMultiTaskManager", "addToHistory: has added = " + z17 + ", is live finished = " + z18 + ", liveId = " + ((mm2.e1) c1Var.business(mm2.e1.class)).f328988r.getLong(0) + ", objectId = " + ((mm2.e1) c1Var.business(mm2.e1.class)).f328983m);
                if (!z17 && !z18) {
                    b22Var.set(1, java.lang.Long.valueOf(((mm2.e1) c1Var.business(mm2.e1.class)).f328988r.getLong(0)));
                    b22Var.set(2, ((mm2.e1) c1Var.business(mm2.e1.class)).f328992v);
                    b22Var.set(3, java.lang.Long.valueOf(((mm2.e1) c1Var.business(mm2.e1.class)).f328983m));
                    b22Var.set(4, c1Var.f328852o);
                    b22Var.set(5, c1Var.V1);
                    b22Var.set(6, ((mm2.e1) c1Var.business(mm2.e1.class)).f328993w);
                    b22Var.set(7, c1Var.f328846n);
                    u7Var.f116715b.put(java.lang.Long.valueOf(((mm2.e1) c1Var.business(mm2.e1.class)).f328988r.getLong(0)), b22Var);
                    u7Var.b();
                    cVar = ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.finder.live.view.r7(((mm2.c1) c1Var.business(mm2.c1.class)).t7(), u7Var));
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                com.tencent.mars.xlog.Log.e("FinderLiveMultiTaskManager", "addToHistory: curLiveRoomData is null");
            }
        }
        return true;
    }
}
