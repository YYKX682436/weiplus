package com.tencent.mm.pluginsdk.model.app;

@j95.b
/* loaded from: classes9.dex */
public class u5 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.s5 f189093d = null;

    public static com.tencent.mm.pluginsdk.model.app.f Ai() {
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        return zo3.p.Bi();
    }

    public static com.tencent.mm.pluginsdk.model.app.y Bi() {
        return zo3.p.Ni();
    }

    public static com.tencent.mm.pluginsdk.model.app.z Di() {
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        return zo3.p.Ri();
    }

    public static com.tencent.mm.pluginsdk.model.app.s5 Ni() {
        gm0.j1.b().c();
        if (((com.tencent.mm.pluginsdk.model.app.u5) i95.n0.c(com.tencent.mm.pluginsdk.model.app.u5.class)).f189093d == null) {
            ((com.tencent.mm.pluginsdk.model.app.u5) i95.n0.c(com.tencent.mm.pluginsdk.model.app.u5.class)).f189093d = new com.tencent.mm.pluginsdk.model.app.s5();
        }
        return ((com.tencent.mm.pluginsdk.model.app.u5) i95.n0.c(com.tencent.mm.pluginsdk.model.app.u5.class)).f189093d;
    }

    public static com.tencent.mm.pluginsdk.model.app.g0 Ri() {
        return (com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai();
    }

    public static com.tencent.mm.pluginsdk.model.app.c1 Ui() {
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        return zo3.p.Ui();
    }

    public static com.tencent.mm.pluginsdk.model.app.e wi() {
        return (com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.pluginsdk.model.app.t5 t5Var = new com.tencent.mm.pluginsdk.model.app.t5(this);
        try {
            t5Var.run();
        } catch (java.lang.Throwable th6) {
            if (!fp.h.a(20)) {
                throw th6;
            }
            t5Var.run();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        int size;
        com.tencent.mm.pluginsdk.model.app.s5 s5Var = ((com.tencent.mm.pluginsdk.model.app.u5) i95.n0.c(com.tencent.mm.pluginsdk.model.app.u5.class)).f189093d;
        if (s5Var != null) {
            s5Var.f189077o = 0;
        }
        synchronized (com.tencent.mm.pluginsdk.model.c3.f189250w) {
            java.util.HashMap hashMap = com.tencent.mm.pluginsdk.model.c3.f189249v;
            size = hashMap.size();
            hashMap.clear();
        }
        if (com.tencent.mm.pluginsdk.model.c3.f189251x == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, worker is null, setCount %d", java.lang.Integer.valueOf(size));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, setCount %d, workerJobCount %d", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(com.tencent.mm.pluginsdk.model.c3.f189251x.f192739a.size()));
        com.tencent.mm.pluginsdk.model.c3.f189251x.f192739a.clear();
        com.tencent.mm.pluginsdk.model.c3.f189251x = null;
    }
}
