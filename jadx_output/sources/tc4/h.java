package tc4;

/* loaded from: classes4.dex */
public final class h implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f417347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc4.p f417349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f417350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417351e;

    public h(r45.g92 g92Var, tc4.a0 a0Var, xc4.p pVar, long j17, int i17) {
        this.f417347a = g92Var;
        this.f417348b = a0Var;
        this.f417349c = pVar;
        this.f417350d = j17;
        this.f417351e = i17;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        boolean z17;
        java.lang.Integer num;
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
        java.lang.String string = this.f417347a.getString(0);
        if (string == null) {
            string = "0";
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V(string, 0L);
        if (V != j17) {
            this.f417348b.x("MicroMsg.Improve.FinderLiveTimelineItem", "#checkLiveStatus.onLiveStatusCallback not match, return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
            return;
        }
        this.f417347a.set(13, java.lang.Integer.valueOf(i17));
        r45.g92 g92Var = this.f417347a;
        boolean z18 = obj instanceof r45.l71;
        r45.l71 l71Var = z18 ? (r45.l71) obj : null;
        g92Var.set(24, l71Var != null ? (r45.nw1) l71Var.getCustom(1) : null);
        r45.a90 a90Var = this.f417349c.h1().ContentObj;
        r45.g92 g92Var2 = a90Var != null ? a90Var.f369848s : null;
        if (g92Var2 != null) {
            r45.l71 l71Var2 = z18 ? (r45.l71) obj : null;
            g92Var2.set(24, l71Var2 != null ? (r45.nw1) l71Var2.getCustom(1) : null);
        }
        r45.nw1 nw1Var = (r45.nw1) this.f417347a.getCustom(24);
        r45.o52 o52Var = nw1Var != null ? (r45.o52) nw1Var.getCustom(28) : null;
        tc4.a0 a0Var = this.f417348b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkLiveStatus, thisLiveId:");
        sb6.append(this.f417350d);
        sb6.append(",liveID:");
        sb6.append(j17);
        sb6.append(",desc:");
        sb6.append(this.f417347a.getString(4));
        sb6.append(",share liveStatus:");
        sb6.append(this.f417347a.getInteger(13));
        sb6.append(", callback liveStatus:");
        sb6.append(i17);
        sb6.append(",purchaseInfo:[");
        sb6.append(o52Var != null ? java.lang.Boolean.valueOf(o52Var.getBoolean(1)) : null);
        sb6.append(',');
        if (o52Var != null) {
            z17 = false;
            num = java.lang.Integer.valueOf(o52Var.getInteger(0));
        } else {
            z17 = false;
            num = null;
        }
        sb6.append(num);
        sb6.append(']');
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", sb6.toString());
        java.lang.String Jj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Jj(V);
        if (Jj.length() > 0) {
            z17 = true;
        }
        if (!z17) {
            Jj = null;
        }
        if (Jj != null) {
            this.f417347a.set(5, Jj);
        }
        if (this.f417351e == 1 && i17 == 2) {
            r45.a90 a90Var2 = this.f417349c.h1().ContentObj;
            r45.g92 g92Var3 = a90Var2 != null ? a90Var2.f369848s : null;
            if (g92Var3 != null) {
                g92Var3.set(13, java.lang.Integer.valueOf(i17));
            }
            xc4.p pVar = this.f417349c;
            pVar.z0(pVar.h1().toByteArray());
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            int W6 = com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(((zc4.h) a17).P6(zc4.g.class), this.f417349c, false, false, 4, null);
            this.f417348b.x("MicroMsg.Improve.FinderLiveTimelineItem", "checkLiveStatus, update finder live status to end!result:" + W6);
        }
        pm0.v.X(new tc4.g(this.f417348b, this.f417347a, obj, i17));
        tc4.a0 a0Var2 = this.f417348b;
        r45.g92 g92Var4 = this.f417347a;
        r45.nw1 nw1Var2 = (r45.nw1) g92Var4.getCustom(24);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean Y = a0Var2.Y(g92Var4, nw1Var2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (Y) {
            p52.c cVar = p52.h.f352016a;
            java.lang.String liveId = java.lang.String.valueOf(j17);
            kotlin.jvm.internal.o.g(liveId, "liveId");
            p52.h.C.remove(liveId);
        } else {
            sb4.z.h(p52.h.f352016a.a(java.lang.String.valueOf(j17)), i17 != 1 ? 2 : 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1");
    }
}
