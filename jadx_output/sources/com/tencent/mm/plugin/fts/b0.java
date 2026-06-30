package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public final class b0 implements com.tencent.mm.plugin.fts.c0 {

    /* renamed from: d, reason: collision with root package name */
    public p13.c f137373d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f137374e = jz5.h.b(com.tencent.mm.plugin.fts.a0.f137371d);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f137375f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f137376g;

    public static final java.util.PriorityQueue f(com.tencent.mm.plugin.fts.b0 b0Var) {
        return (java.util.PriorityQueue) ((jz5.n) b0Var.f137374e).getValue();
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void a(p13.c baseSearchTask) {
        kotlin.jvm.internal.o.g(baseSearchTask, "baseSearchTask");
        baseSearchTask.n();
        if (this.f137373d == baseSearchTask) {
            baseSearchTask.f351066f = true;
        }
        pm0.v.O(g(), new com.tencent.mm.plugin.fts.u(this, baseSearchTask));
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public boolean b() {
        return this.f137375f;
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "***** FTSTaskDaemon clear all task.");
        pm0.v.O(g(), new com.tencent.mm.plugin.fts.v(this));
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void d(p13.c baseSearchTask) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(baseSearchTask, "baseSearchTask");
        if (this.f137376g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSThreadPoolQueue", "***** postTask was ignored since mQuitRequested flag was set.");
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("PostTaskWhenQuit");
            return;
        }
        p13.c cVar = this.f137373d;
        if (cVar != null) {
            int priority = cVar.getPriority();
            int priority2 = baseSearchTask.getPriority();
            pm0.v.O(g(), new com.tencent.mm.plugin.fts.w(baseSearchTask, priority2, cVar, priority, this));
            if (priority >= priority2) {
                cVar.f351066f = true;
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O(g(), new com.tencent.mm.plugin.fts.x(baseSearchTask, this));
        }
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void e(boolean z17) {
    }

    public final java.lang.String g() {
        return "FTSThreadPoolQueue-" + hashCode();
    }

    public final void h() {
        if (this.f137375f) {
            pm0.v.O(g(), new com.tencent.mm.plugin.fts.z(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "not start fts queue");
        }
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public synchronized void quit() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "***** FTSTaskDaemon thread was quitting.");
        pm0.v.O(g(), new com.tencent.mm.plugin.fts.y(this));
        p13.c cVar = this.f137373d;
        if (cVar != null) {
            cVar.f351066f = true;
        }
        this.f137373d = null;
        this.f137376g = true;
        this.f137375f = false;
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void start() {
        this.f137375f = true;
        this.f137376g = false;
        h();
    }
}
