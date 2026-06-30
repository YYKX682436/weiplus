package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes4.dex */
public class jf implements yn.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f204254d;

    @Override // yn.l
    public void E() {
    }

    @Override // yn.l
    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimEnd");
        java.lang.ref.WeakReference weakReference = this.f204254d;
        if (weakReference == null) {
            return;
        }
        yb5.d dVar = (yb5.d) weakReference.get();
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimEnd ui is unull");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimEnd ui:%s", dVar);
        c01.n2.d().e(com.tencent.mm.ui.chatting.viewitems.mf.a(dVar));
        ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) dVar.f460708c.a(yn.j.class))).c(this);
        k01.x0 x0Var = (k01.x0) i95.n0.c(k01.x0.class);
        java.lang.String a17 = com.tencent.mm.ui.chatting.viewitems.mf.a(dVar);
        synchronized (((oh1.k2) x0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "removeOnUpdatbleMsgInfoChange token:%s", a17);
            java.util.List<oh1.e2> list = (java.util.List) ((java.util.HashMap) oh1.k2.f345247e).get(a17);
            if (list == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxaUpdateableMsgService", "[removeOnUpdatbleMsgInfoChange]getUpdatableMsgWorkers is null, err");
                return;
            }
            for (oh1.e2 e2Var : list) {
                e2Var.getClass();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) oh1.j2.INSTANCE.f345241d;
                concurrentHashMap.size();
                concurrentHashMap.remove(java.lang.Integer.valueOf(e2Var.f345205b.hashCode()));
            }
            ((java.util.HashMap) oh1.k2.f345247e).remove(a17);
        }
    }

    @Override // yn.l
    public void K() {
    }

    @Override // yn.l
    public void a() {
    }

    @Override // yn.l
    public void x() {
        ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "startUpdatbleMsgInfoChange");
        oh1.j2 j2Var = oh1.j2.INSTANCE;
        synchronized (j2Var) {
            j2Var.f345242e.set(false);
            j2Var.h();
            j2Var.f345243f.set(0);
        }
    }

    @Override // yn.l
    public void y() {
        ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "stopOnUpdatbleMsgInfoChange");
        oh1.j2 j2Var = oh1.j2.INSTANCE;
        synchronized (j2Var) {
            j2Var.f345242e.set(true);
        }
    }

    @Override // yn.l
    public void z() {
    }
}
