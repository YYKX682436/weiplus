package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f209356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f209357e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f209358f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f209359g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f209360h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f209356d = "";
        this.f209357e = "";
        this.f209360h = jz5.h.b(new com.tencent.mm.ui.mvvm.uic.conversation.recent.n0(this));
    }

    public static final void T6(com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 r0Var) {
        j75.f stateCenter;
        wi5.n0 n0Var;
        int intExtra = r0Var.getIntent().getIntExtra("ForwardParams_ReportFromScene", 0);
        int intExtra2 = r0Var.getIntent().getIntExtra("ForwardParams_ForwardMsgType", 0);
        j75.f Q6 = r0Var.Q6();
        java.util.Map a17 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a((Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null) ? null : n0Var.f446324t, intExtra, intExtra2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardMultiNextBtn: " + a17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_multi_next_btn", "view_clk", a17, 32337);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = r0Var.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.c());
    }

    public static final void U6(com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 r0Var) {
        j75.f stateCenter;
        wi5.n0 n0Var;
        int intExtra = r0Var.getIntent().getIntExtra("ForwardParams_ReportFromScene", 0);
        int intExtra2 = r0Var.getIntent().getIntExtra("ForwardParams_ForwardMsgType", 0);
        j75.f Q6 = r0Var.Q6();
        java.util.Map a17 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a((Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null) ? null : n0Var.f446324t, intExtra, intExtra2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardMultiBtn: " + a17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_multi_btn", "view_clk", a17, 32337);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = r0Var.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.e());
    }

    public final void V6(wi5.n0 state) {
        kotlin.jvm.internal.o.g(state, "state");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateMenu: ");
        java.util.LinkedList linkedList = state.f446319o;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.TopMenuUIC", sb6.toString());
        linkedList.size();
        linkedList.contains(this.f209357e);
        if (!state.e()) {
            this.f209359g = false;
            mMActivity.setBackBtnVisible(true);
            mMActivity.updateOptionMenuStyle(1, com.tencent.mm.ui.fb.TRANSPARENT);
            mMActivity.updateOptionMenuListener(1, new com.tencent.mm.ui.mvvm.uic.conversation.recent.q0(this), null);
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490493wm));
            mMActivity.enableOptionMenu(1, true);
            return;
        }
        mMActivity.setBackBtnVisible(false);
        mMActivity.getController().x0(getResources().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.mvvm.uic.conversation.recent.o0(this));
        mMActivity.updateOptionMenuStyle(1, com.tencent.mm.ui.fb.GREEN);
        mMActivity.updateOptionMenuListener(1, new com.tencent.mm.ui.mvvm.uic.conversation.recent.p0(this), null);
        if (linkedList.size() > 0) {
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5) + '(' + linkedList.size() + ')');
        } else {
            mMActivity.updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490441v5));
        }
        if (linkedList.size() > state.f446317m) {
            mMActivity.enableOptionMenu(1, true);
            this.f209359g = false;
        } else {
            mMActivity.enableOptionMenu(1, false);
            this.f209359g = true;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return this.f209359g;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        com.tencent.mm.storage.b3 a17;
        java.lang.String stringExtra = getIntent().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f209357e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("chatroomName");
        this.f209356d = stringExtra2 != null ? stringExtra2 : "";
        rv1.f fVar = (rv1.f) gm0.j1.s(rv1.f.class);
        this.f209358f = (fVar == null || (a17 = ((qv1.a) fVar).a()) == null) ? null : a17.z0(this.f209356d);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.L2(getActivity(), new com.tencent.mm.ui.mvvm.uic.conversation.recent.l0(this, h0Var));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), com.tencent.mm.ui.mvvm.uic.conversation.recent.m0.f209346d);
    }
}
