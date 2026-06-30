package com.tencent.mm.plugin.finder.live.component;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/component/LuckyMoneyResultReceiev;", "Landroid/os/ResultReceiver;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LuckyMoneyResultReceiev extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f111564d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f111565e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f111566f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyMoneyResultReceiev(te2.c4 presenter, android.os.Handler handler) {
        super(handler);
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f111564d = "LuckyMoneyResultReceiev";
        this.f111565e = new java.lang.ref.WeakReference(presenter);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        super.onReceiveResult(i17, bundle);
        te2.c4 c4Var = (te2.c4) this.f111565e.get();
        java.lang.ref.WeakReference weakReference = this.f111566f;
        te2.z3 z3Var = weakReference != null ? (te2.z3) weakReference.get() : null;
        com.tencent.mars.xlog.Log.i(this.f111564d, "openLuckyMoney presenter:" + c4Var + ",LuckyMoneyShowInfo:" + z3Var + ", result:" + i17);
        if (c4Var == null || z3Var == null) {
            return;
        }
        if (i17 != -1) {
            if (i17 != 1) {
                return;
            }
            c4Var.h(z3Var);
            return;
        }
        qo0.c cVar = c4Var.f417921e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        java.lang.Object context = k0Var != null ? k0Var.getContext() : null;
        gk2.e eVar = c4Var.f417920d;
        pq5.g l17 = new ek2.v2(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328992v, ((mm2.e1) eVar.a(mm2.e1.class)).f328985o, z3Var.f418556a.getString(0)).l();
        if (context != null && (context instanceof com.tencent.mm.ui.MMActivity)) {
            l17.f((im5.b) context);
        }
        c4Var.h(z3Var);
    }
}
