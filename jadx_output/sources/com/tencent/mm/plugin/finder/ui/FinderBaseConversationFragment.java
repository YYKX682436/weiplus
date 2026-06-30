package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Lqb2/t;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderBaseConversationFragment extends com.tencent.mm.chatting.BasePrivateMsgConvListFragment<qb2.t> {
    public static final /* synthetic */ int B = 0;

    /* renamed from: z, reason: collision with root package name */
    public ra5.c f128513z;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f128510w = jz5.h.b(new com.tencent.mm.plugin.finder.ui.y0(this));

    /* renamed from: x, reason: collision with root package name */
    public int f128511x = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f128512y = -1;
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.ui.c1(this));

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View A0() {
        android.widget.TextView emptyTip = K0().f434607c;
        kotlin.jvm.internal.o.f(emptyTip, "emptyTip");
        return emptyTip;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public int B0() {
        return 15;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public android.view.View C0() {
        com.tencent.mm.ui.widget.MMProcessBar loadingIcon = K0().f434608d;
        kotlin.jvm.internal.o.f(loadingIcon, "loadingIcon");
        return loadingIcon;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public androidx.recyclerview.widget.RecyclerView G0() {
        androidx.recyclerview.widget.RecyclerView conversationRecyclerView = K0().f434606b;
        kotlin.jvm.internal.o.f(conversationRecyclerView, "conversationRecyclerView");
        conversationRecyclerView.i(new com.tencent.mm.plugin.finder.ui.b1(this));
        return conversationRecyclerView;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public com.tencent.mm.view.RefreshLoadMoreLayout H0() {
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = K0().f434609e;
        kotlin.jvm.internal.o.f(rlLayout, "rlLayout");
        return rlLayout;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public void J0(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f128511x);
        sb6.append('-');
        sb6.append(this.f128512y);
        java.lang.String sql = sb6.toString();
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("enterFinderConversationPage", r26.i0.u(sql, ',', ';', false, 4, null), j17, "", 0L).a();
    }

    public final vb2.g K0() {
        return (vb2.g) ((jz5.n) this.A).getValue();
    }

    public void L0() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aft;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        super.onDestroy();
        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
        android.content.Context context = getContext();
        r45.qt2 qt2Var = null;
        if (context != null) {
            if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                qt2Var = nyVar.V6();
            }
        }
        com.tencent.mm.plugin.finder.report.a6 a6Var = com.tencent.mm.plugin.finder.report.p.f125224c;
        if (a6Var.f124949a) {
            a6Var.d(qt2Var);
        } else {
            com.tencent.mm.plugin.finder.report.p.f125223b.d(qt2Var);
        }
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ra5.c cVar = this.f128513z;
        if (cVar != null) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(cVar, 200L);
            this.f128513z = null;
        }
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        int i17 = this.f128512y;
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1473L, 11L, 1L);
            return;
        }
        if (i17 == 2) {
            int i18 = this.f128511x;
            if (i18 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1473L, 12L, 1L);
            } else if (i18 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1473L, 13L, 1L);
            }
        }
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        android.os.Bundle arguments = getArguments();
        this.f128511x = arguments != null ? arguments.getInt("KEY_TALKER_TYPE", -1) : -1;
        android.os.Bundle arguments2 = getArguments();
        this.f128512y = arguments2 != null ? arguments2.getInt("KEY_TALKER_SCENE", -1) : -1;
        qb2.b0 b0Var = new qb2.b0(this);
        b0Var.f361177s = new qb2.l0(com.tencent.mm.plugin.finder.ui.z0.f130074d);
        b0Var.f361176r = new qb2.g0(this, new com.tencent.mm.plugin.finder.ui.a1(this), null, 4, null);
        b0Var.f361175q = this.f128512y;
        b0Var.f361174p = this.f128511x;
        return b0Var;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public java.util.List u0() {
        return kz5.c0.i(((c61.l7) i95.n0.c(c61.l7.class)).Jj(), ((c61.l7) i95.n0.c(c61.l7.class)).ik(), ((c61.l7) i95.n0.c(c61.l7.class)).hk());
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.b y0() {
        android.os.Bundle arguments = getArguments();
        this.f128511x = arguments != null ? arguments.getInt("KEY_TALKER_TYPE", -1) : -1;
        android.os.Bundle arguments2 = getArguments();
        this.f128512y = arguments2 != null ? arguments2.getInt("KEY_TALKER_SCENE", -1) : -1;
        return new qb2.h0((java.lang.String) ((jz5.n) this.f128510w).getValue(), this.f128511x, this.f128512y);
    }
}
