package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class y4 implements yn.j, yn.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f200281d = new java.util.HashSet();

    @Override // yn.l
    public void E() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = new java.util.HashSet(this.f200281d).iterator();
        while (it.hasNext()) {
            yn.l lVar = (yn.l) it.next();
            java.lang.System.currentTimeMillis();
            lVar.E();
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimEnd]cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // yn.l
    public void J() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = new java.util.HashSet(this.f200281d).iterator();
        while (it.hasNext()) {
            yn.l lVar = (yn.l) it.next();
            java.lang.System.currentTimeMillis();
            lVar.J();
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimEnd]cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // yn.l
    public void K() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = new java.util.HashSet(this.f200281d).iterator();
        while (it.hasNext()) {
            yn.l lVar = (yn.l) it.next();
            java.lang.System.currentTimeMillis();
            lVar.K();
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleObserver", "[onChattingExitAnimStart]cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // yn.l
    public void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = new java.util.HashSet(this.f200281d).iterator();
        while (it.hasNext()) {
            yn.l lVar = (yn.l) it.next();
            java.lang.System.currentTimeMillis();
            lVar.a();
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleObserver", "[onChattingInit]cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public void b(yn.l lVar) {
        this.f200281d.add(lVar);
    }

    public void c(yn.l lVar) {
        this.f200281d.remove(lVar);
    }

    @Override // yn.l
    public void x() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = new java.util.HashSet(this.f200281d).iterator();
        while (it.hasNext()) {
            yn.l lVar = (yn.l) it.next();
            java.lang.System.currentTimeMillis();
            lVar.x();
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleObserver", "[onChattingResume]cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // yn.l
    public void y() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = new java.util.HashSet(this.f200281d).iterator();
        while (it.hasNext()) {
            yn.l lVar = (yn.l) it.next();
            java.lang.System.currentTimeMillis();
            lVar.y();
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleObserver", "[onChattingPause]cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // yn.l
    public void z() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = new java.util.HashSet(this.f200281d).iterator();
        while (it.hasNext()) {
            yn.l lVar = (yn.l) it.next();
            java.lang.System.currentTimeMillis();
            lVar.z();
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLifecycleObserver", "[onChattingEnterAnimStart]cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
