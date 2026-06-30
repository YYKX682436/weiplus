package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n0 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f113574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var, java.lang.Class cls) {
        super(cls);
        this.f113574b = q0Var;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.cd2 result = (r45.cd2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        if (result.getList(0).size() <= 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "startPolling poll no ad video");
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((mm2.w) this.f113574b.P0(mm2.w.class)).f329498g;
        java.util.LinkedList<r45.ce2> list = result.getList(0);
        kotlin.jvm.internal.o.f(list, "getAd_infos(...)");
        for (r45.ce2 ce2Var : list) {
            com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "startPolling onPollingSuccess live_ad_id:" + ce2Var.getString(0) + " startTime:" + ce2Var.getLong(1) + " duration:" + ce2Var.getLong(2));
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                mm2.j jVar = (mm2.j) it.next();
                if (kotlin.jvm.internal.o.b(jVar.f329150b.getString(0), ce2Var.getString(0)) && jVar.f329150b.getLong(1) == ce2Var.getLong(1)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 == -1) {
                copyOnWriteArrayList.add(new mm2.j(mm2.l.f329203d, ce2Var));
                com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "startPolling add live_ad_id:" + ce2Var.getString(0) + " startTime:" + ce2Var.getLong(1) + " size:" + copyOnWriteArrayList.size());
            }
        }
    }
}
