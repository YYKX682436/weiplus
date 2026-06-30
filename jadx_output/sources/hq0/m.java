package hq0;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hq0.b0 b0Var) {
        super(0);
        this.f283031d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.e(this.f283031d.f282971y, "exceptionListener invoke, recreate biz");
        hq0.b0 b0Var = this.f283031d;
        synchronized (b0Var) {
            com.tencent.mars.xlog.Log.i(b0Var.f282971y, "recreateBiz");
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            if (iVar != null) {
                je3.j.a(iVar, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicStarterRecreate, b0Var.f282970x.f293634a, kz5.q0.f314001d);
            }
            boolean z17 = true;
            boolean z18 = !b0Var.P && (b0Var.N.isEmpty() ^ true);
            b0Var.Z1(mq0.z.f330641o, z18);
            if (z18) {
                b0Var.P = true;
            }
            int i17 = b0Var.K;
            b0Var.K = i17 + 1;
            if (i17 >= 5) {
                b0Var.K = 0;
                if (iVar != null) {
                    je3.j.a(iVar, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicStarterRecreateOutOfLimit, b0Var.f282970x.f293634a, kz5.q0.f314001d);
                }
                com.tencent.mars.xlog.Log.e(b0Var.f282971y, "biz reCreate too much times, destroy it.");
                b0Var.Z1(mq0.z.f330642p, !b0Var.N.isEmpty());
                java.util.Iterator it = ((java.util.HashSet) b0Var.A).iterator();
                while (it.hasNext()) {
                    ((jc3.l0) it.next()).d0(true);
                }
                b0Var.M = true;
                b0Var.destroy();
                b0Var.M = false;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.F;
                boolean z19 = b0Var.f283005t;
                java.lang.ref.WeakReference weakReference = b0Var.f282969J;
                android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                b0Var.M = true;
                b0Var.destroy();
                if (z19) {
                    b0Var.Q1();
                    b0Var.V(activity);
                    if (b0Var.B == null) {
                        com.tencent.mars.xlog.Log.e(b0Var.f282971y, "biz reCreate return no delegate");
                    }
                    java.util.Iterator it6 = ((java.util.HashSet) b0Var.A).iterator();
                    while (it6.hasNext()) {
                        ((jc3.l0) it6.next()).d0(false);
                    }
                    java.util.Collection<hq0.j> values = concurrentHashMap.values();
                    kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                    for (hq0.j jVar : values) {
                        b0Var.Y1(jVar.f283008a, jVar.f283009b, jVar.f283010c, jVar.f283011d, hq0.m0.f283032d);
                    }
                    b0Var.M = false;
                } else {
                    if (iVar != null) {
                        je3.j.a(iVar, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicStarterRecreateSkipNotifyNotActive, b0Var.f282970x.f293634a, kz5.q0.f314001d);
                    }
                    mq0.z zVar = mq0.z.f330645s;
                    if (b0Var.P || !(!b0Var.N.isEmpty())) {
                        z17 = false;
                    }
                    b0Var.Z1(zVar, z17);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
