package sr2;

/* loaded from: classes2.dex */
public final class l5 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.lk2 f411624d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f411625e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f411626f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f411627g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f411628h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f411629i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Vector f411630m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411629i = kz5.c0.i(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.class, com.tencent.mm.plugin.finder.ui.FinderSelfUI.class, com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI.class);
        this.f411630m = new java.util.Vector();
    }

    public final void O6(int i17, int i18, java.lang.String str, r45.lk2 lk2Var) {
        boolean z17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "errType:" + i17 + " , errCode:" + i18);
        boolean z18 = false;
        this.f411625e = false;
        if (i17 == 0 && i18 == 0) {
            this.f411624d = lk2Var;
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f411627g;
            if (u3Var2 != null && u3Var2.isShowing()) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "loadingDialog is showing");
                yz5.a aVar = this.f411628h;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            z17 = false;
        } else {
            db5.t7.makeText(getActivity(), com.tencent.mm.R.string.cnc, 0).show();
            z17 = true;
        }
        this.f411626f = z17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f411627g;
        if (u3Var3 != null && u3Var3.isShowing()) {
            z18 = true;
        }
        if (z18 && (u3Var = this.f411627g) != null) {
            u3Var.dismiss();
        }
        java.util.Iterator it = this.f411630m.iterator();
        while (it.hasNext()) {
            ((yz5.q) it.next()).invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f411626f ? null : this.f411624d);
        }
    }

    public final void P6() {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "prepareResp null,isNetSceneFailed:" + this.f411626f + " , isNetScenePending:" + this.f411625e);
        if (this.f411626f) {
            db5.t7.makeText(getActivity(), com.tencent.mm.R.string.cnc, 0).show();
        } else if (this.f411625e) {
            this.f411627g = com.tencent.mm.ui.widget.dialog.u3.f(getActivity(), getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
        }
    }

    public final boolean Q6(yz5.a whenPreCheckReConnect, yz5.a aVar) {
        kotlin.jvm.internal.o.g(whenPreCheckReConnect, "whenPreCheckReConnect");
        this.f411628h = whenPreCheckReConnect;
        r45.lk2 lk2Var = this.f411624d;
        if (lk2Var == null) {
            P6();
            return false;
        }
        if (com.tencent.mm.plugin.finder.assist.w5.f102652d.d(getActivity(), lk2Var, new sr2.k5(this, aVar))) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "preCheck interrupt");
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(7289, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f411630m.clear();
        gm0.j1.d().q(7289, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f411624d == null) {
            this.f411625e = true;
            if (this.f411629i.contains(getActivity().getClass())) {
                return;
            }
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb.t2((c61.yb) c17, 8, null, 2, null);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.network.v0 reqResp = m1Var != null ? m1Var.getReqResp() : null;
        com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
        java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
        O6(i17, i18, str, obj instanceof r45.lk2 ? (r45.lk2) obj : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f411629i = kz5.c0.i(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.class, com.tencent.mm.plugin.finder.ui.FinderSelfUI.class, com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI.class);
        this.f411630m = new java.util.Vector();
    }
}
