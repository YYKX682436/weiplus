package um2;

/* loaded from: classes3.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f428909e;

    public o4(um2.x5 x5Var, km2.q qVar) {
        this.f428908d = x5Var;
        this.f428909e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xh2.c cVar;
        java.lang.Object obj;
        kn0.p pVar;
        java.util.ArrayList<km2.q> lastMicUserList;
        um2.x5 x5Var = this.f428908d;
        fm2.c cVar2 = x5Var.f19606c;
        if (cVar2 != null && (lastMicUserList = cVar2.getLastMicUserList()) != null) {
            lastMicUserList.clear();
        }
        ((mm2.o4) x5Var.c(mm2.o4.class)).O7(this.f428909e);
        co0.s E = x5Var.E();
        if (E != null) {
            E.S = true;
        }
        com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var = x5Var.f429041i;
        if (dk0Var != null && (cVar = (xh2.c) ((mm2.o4) dk0Var.P0(mm2.o4.class)).A.getValue()) != null) {
            java.util.LinkedList<xh2.a> linkedList = cVar.f454531a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (xh2.a aVar : linkedList) {
                java.lang.String b17 = aVar.b();
                xh2.i iVar = aVar.f454521b;
                arrayList.add(new jo0.a(b17, new hn5.b(iVar.f282609a, iVar.f282610b, iVar.f282611c, iVar.f282612d), false));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "preAddCameraView micDataSize: " + arrayList.size());
            java.lang.String m86 = ((mm2.c1) dk0Var.P0(mm2.c1.class)).m8();
            if (m86 == null) {
                m86 = "";
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((jo0.a) obj).f300870a, m86)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                arrayList.add(new jo0.a(m86, new hn5.b(0.0f, 0.0f, 0.1f, 0.1f), true));
            }
            co0.s u17 = dk0Var.u1();
            dk0Var.f112299p.d(arrayList, cVar.f454532b, (u17 == null || (pVar = u17.D) == null || !pVar.f309589i) ? false : true);
        }
        co0.s E2 = x5Var.E();
        if (E2 != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            E2.R0(x5Var.f429034f1 ? 5 : 2);
        }
        com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var2 = x5Var.f429041i;
        if (dk0Var2 != null) {
            dk0Var2.v1();
        }
        com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var3 = x5Var.f429041i;
        if (dk0Var3 != null) {
            com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = dk0Var3.f112299p.renderRatioLayout;
            tRTCVideoRatioLayout.getClass();
            tRTCVideoRatioLayout.f68576o.d(false);
        }
    }
}
