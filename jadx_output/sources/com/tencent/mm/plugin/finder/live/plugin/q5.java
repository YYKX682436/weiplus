package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q5 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f113961p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView f113962q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113961p = statusMonitor;
        root.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.l5.f113348d);
    }

    @Override // qo0.a
    public boolean B0() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView;
        if (w0() != 0 || (finderLiveDescEditView = this.f113962q) == null || finderLiveDescEditView.getVisibility() != 0) {
            return false;
        }
        finderLiveDescEditView.a();
        yz5.a aVar = finderLiveDescEditView.f117607g;
        if (aVar != null) {
            aVar.invoke();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.m5.f113464a[status.ordinal()] == 1) {
            if (bundle == null) {
                u1(null, "");
                return;
            }
            byte[] byteArray = bundle.getByteArray("PARAM_LIVE_AI_ASSISTANT_INFO");
            java.lang.String string = bundle.getString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID");
            r45.u84 u84Var = new r45.u84();
            if (byteArray != null) {
                try {
                    u84Var.parseFrom(byteArray);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            u1(u84Var, string);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = z17;
        qo0.b bVar = qo0.b.Z2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        this.f113961p.statusChange(bVar, bundle);
    }

    public final void u1(r45.u84 u84Var, java.lang.String str) {
        java.lang.String str2;
        t1(true);
        java.lang.String str3 = ((mm2.c1) S0().a(mm2.c1.class)).V1;
        java.lang.String str4 = ((mm2.c1) S0().a(mm2.c1.class)).W1;
        if (u84Var != null) {
            r45.v84 v84Var = new r45.v84();
            com.tencent.mm.protobuf.g byteString = u84Var.getByteString(1);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    v84Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            java.lang.String string = v84Var.getString(0);
            str4 = v84Var.getString(1);
            str2 = string;
        } else {
            str2 = str3;
        }
        java.lang.String str5 = str4;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView = this.f113962q;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (finderLiveDescEditView == null) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView2 = new com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView(context);
            this.f113962q = finderLiveDescEditView2;
            viewGroup.addView(finderLiveDescEditView2);
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView3 = this.f113962q;
        if (finderLiveDescEditView3 != null) {
            finderLiveDescEditView3.c(((mm2.c1) P0(mm2.c1.class)).X1, str2, str5, ((mm2.c1) P0(mm2.c1.class)).T, new com.tencent.mm.plugin.finder.live.plugin.o5(this), new com.tencent.mm.plugin.finder.live.plugin.p5(this), true, str);
        }
        java.lang.Object systemService = viewGroup.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f113962q, 1);
        K0(0);
    }
}
