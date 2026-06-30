package um2;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f428839e;

    public j(um2.x5 x5Var, long j17) {
        this.f428838d = x5Var;
        this.f428839e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        r45.o52 P6;
        com.tencent.mm.plugin.finder.live.plugin.gb gbVar;
        com.tencent.mm.plugin.finder.live.plugin.f10 f10Var;
        um2.x5 x5Var = this.f428838d;
        fm2.c cVar = x5Var.f19606c;
        android.view.ViewGroup viewGroup = (cVar == null || (f10Var = (com.tencent.mm.plugin.finder.live.plugin.f10) cVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.f10.class)) == null) ? null : f10Var.f365323d;
        fm2.c cVar2 = x5Var.f19606c;
        if (cVar2 == null || (gbVar = (com.tencent.mm.plugin.finder.live.plugin.gb) cVar2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.gb.class)) == null) {
            z17 = false;
        } else {
            com.tencent.mm.plugin.finder.live.plugin.ab abVar = com.tencent.mm.plugin.finder.live.plugin.ab.f111842d;
            r45.o52 P62 = ((mm2.g0) x5Var.c(mm2.g0.class)).P6();
            z17 = com.tencent.mm.plugin.finder.live.plugin.gb.t1(gbVar, abVar, 1, P62 != null ? P62.getString(7) : null, false, 0L, viewGroup, 24, null);
        }
        com.tencent.mars.xlog.Log.i(x5Var.f429032f, "checkLiveCharge show promoteInfo delay:" + this.f428839e + ", result:" + z17 + '!');
        if (!z17 || (P6 = ((mm2.g0) x5Var.c(mm2.g0.class)).P6()) == null) {
            return;
        }
        P6.set(7, "");
    }
}
