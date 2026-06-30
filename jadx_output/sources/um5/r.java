package um5;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.w f429185d;

    public r(um5.w wVar) {
        this.f429185d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.w wVar = this.f429185d;
        java.lang.String c17 = wVar.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createEGLEnvironment, size:[");
        sb6.append(wVar.f429194c);
        sb6.append(", ");
        sb6.append(wVar.f429195d);
        sb6.append("], surface:");
        android.view.Surface surface = wVar.f429198g;
        sb6.append(surface != null ? surface.hashCode() : 0);
        xm5.b.c(c17, sb6.toString(), new java.lang.Object[0]);
        android.view.Surface surface2 = wVar.f429198g;
        if (surface2 != null) {
            wVar.f429197f = new com.tencent.tav.decoder.RenderContext(wVar.f429194c, wVar.f429195d, surface2);
        } else {
            wVar.f429197f = new com.tencent.tav.decoder.RenderContext(wVar.f429194c, wVar.f429195d, null);
        }
        um5.w wVar2 = this.f429185d;
        com.tencent.mm.xeffect.VLogDirector vLogDirector = wVar2.f429192a;
        vLogDirector.c();
        vLogDirector.e(wVar2.f429193b);
        this.f429185d.f429199h = new um5.y();
        this.f429185d.f429201j = true;
        um5.x xVar = this.f429185d.f429209r;
        xVar.getClass();
        xVar.f429215d = java.lang.System.currentTimeMillis() - xVar.f429214c;
        um5.w wVar3 = this.f429185d;
        synchronized (wVar3.f429205n) {
            java.util.Iterator it = wVar3.f429205n.iterator();
            while (it.hasNext()) {
                ((yz5.a) it.next()).invoke();
            }
            wVar3.f429205n.clear();
        }
        xm5.b.c(this.f429185d.c(), "initEGL finished", new java.lang.Object[0]);
    }
}
