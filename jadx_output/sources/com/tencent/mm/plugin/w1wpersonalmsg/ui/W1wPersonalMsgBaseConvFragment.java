package com.tencent.mm.plugin.w1wpersonalmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgBaseConvFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lkr4/g;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class W1wPersonalMsgBaseConvFragment extends com.tencent.mm.chatting.BasePrivateMsgConvListFragment<kr4.g> {

    /* renamed from: w, reason: collision with root package name */
    public yz5.r f177543w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f177544x = jz5.h.b(new lr4.a(this));

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View A0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public int B0() {
        return 15;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View C0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ilq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.u F0() {
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.o.f(requireActivity, "requireActivity(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(requireActivity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) requireActivity).a(wn.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (wn.u) a17;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public androidx.recyclerview.widget.RecyclerView G0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ciw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (androidx.recyclerview.widget.RecyclerView) findViewById;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public com.tencent.mm.view.RefreshLoadMoreLayout H0() {
        android.view.View view = this.f206301h;
        kotlin.jvm.internal.o.d(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
    }

    public final void K0(vu4.d actionType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        yz5.r rVar = this.f177543w;
        if (rVar != null) {
            rVar.C(actionType, str, str2, str3);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqm;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f64732o).getValue()).setItemAnimator(null);
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        android.os.Bundle arguments = getArguments();
        int i17 = arguments != null ? arguments.getInt("KEY_CONV_TYPE", 1) : 1;
        lr4.k kVar = (lr4.k) ((jz5.n) this.f177544x).getValue();
        kVar.f320748n = i17;
        return kVar;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public java.util.List u0() {
        return kz5.b0.c(((fr4.g0) i95.n0.c(fr4.g0.class)).Ai());
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.b y0() {
        android.os.Bundle arguments = getArguments();
        return new lr4.o(arguments != null ? arguments.getInt("KEY_CONV_TYPE", 1) : 1);
    }
}
