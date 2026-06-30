package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vw extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114825p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f114826q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114825p = statusMonitor;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f114826q = false;
        com.tencent.mars.xlog.Log.i("FinderLiveLogoReceivePlugin", "#unMount");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        com.tencent.mars.xlog.Log.i("FinderLiveLogoReceivePlugin", "#startPollingBannerData");
        if (((mm2.w) P0(mm2.w.class)).P6()) {
            com.tencent.mars.xlog.Log.i("FinderLiveLogoReceivePlugin", "#startPollingBannerData return for playing adVideo");
            return;
        }
        r45.ty2 ty2Var = new r45.ty2();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.e(11, ty2Var, new com.tencent.mm.plugin.finder.live.plugin.uw(this, r45.uy2.class), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        r45.ce2 ce2Var;
        boolean a17;
        r45.nw1 liveInfo;
        java.lang.Object obj;
        r45.nw1 liveInfo2;
        com.tencent.mars.xlog.Log.i("FinderLiveLogoReceivePlugin", "#mount");
        this.f114826q = true;
        long c17 = c01.id.c();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) P0(mm2.c1.class)).f328846n;
        java.util.LinkedList list = (finderObject == null || (liveInfo2 = finderObject.getLiveInfo()) == null) ? null : liveInfo2.getList(51);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                r45.ce2 ce2Var2 = (r45.ce2) obj;
                if (ce2Var2.getLong(1) <= c17 && c17 <= ce2Var2.getLong(5)) {
                    break;
                }
            }
            ce2Var = (r45.ce2) obj;
        } else {
            ce2Var = null;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) P0(mm2.c1.class)).f328846n;
        java.lang.Long valueOf = (finderObject2 == null || (liveInfo = finderObject2.getLiveInfo()) == null) ? null : java.lang.Long.valueOf(liveInfo.getLong(0));
        java.lang.String string = ce2Var != null ? ce2Var.getString(0) : null;
        if (ce2Var != null && ce2Var.getBoolean(6)) {
            a17 = mm2.w.f329495u.b(valueOf + '_' + string);
        } else {
            a17 = mm2.w.f329495u.a(java.lang.String.valueOf(valueOf));
        }
        if (ce2Var != null && !a17) {
            com.tencent.mars.xlog.Log.i("FinderLiveLogoReceivePlugin", "#mount has ad video, delay to start.");
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveLogoReceivePlugin", "#mount no ad video.");
            t1();
        }
    }
}
