package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class md implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f123983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC f123984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f123985f;

    public md(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer, com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC, long j17) {
        this.f123983d = dataBuffer;
        this.f123984e = finderProfileReplayLiveUIC;
        this.f123985f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.f123983d;
        java.util.Iterator<T> it = dataBuffer.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            j17 = this.f123985f;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            so2.q2 q2Var = j5Var instanceof so2.q2 ? (so2.q2) j5Var : null;
            if ((q2Var == null || (finderObject = q2Var.f410549n) == null || (liveInfo = finderObject.getLiveInfo()) == null || liveInfo.getLong(0) != j17) ? false : true) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0 && i17 < dataBuffer.size()) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = this.f123984e;
        if (z17) {
            java.lang.Object remove = dataBuffer.remove(i17);
            kotlin.jvm.internal.o.f(remove, "removeAt(...)");
            so2.j5 j5Var2 = (so2.j5) remove;
            androidx.recyclerview.widget.f2 adapter = finderProfileReplayLiveUIC.P6().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(i17);
            }
            cm2.a aVar = cm2.a.f43328a;
            so2.q2 q2Var2 = j5Var2 instanceof so2.q2 ? (so2.q2) j5Var2 : null;
            str = aVar.x(q2Var2 != null ? q2Var2.f410549n : null, i17);
        } else {
            str = "fail,live:" + j17 + ",pos:" + i17;
        }
        com.tencent.mars.xlog.Log.i(finderProfileReplayLiveUIC.f123448i, "delete replay " + str);
    }
}
