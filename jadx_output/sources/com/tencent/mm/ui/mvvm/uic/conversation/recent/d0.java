package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f209285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f209286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var, boolean z17, wi5.n0 n0Var) {
        super(0);
        this.f209284d = e0Var;
        this.f209285e = z17;
        this.f209286f = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var;
        wi5.n0 n0Var;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var2 = this.f209284d;
        int intExtra = e0Var2.getActivity().getIntent().getIntExtra("ForwardParams_ReportFromScene", 0);
        int intExtra2 = e0Var2.getActivity().getIntent().getIntExtra("ForwardParams_ForwardMsgType", 0);
        j75.f Q6 = e0Var2.Q6();
        java.util.Map a17 = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a((Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null) ? null : n0Var.f446324t, intExtra, intExtra2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardCreateChatBtn: " + a17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_create_chat_btn", "view_clk", a17, 32337);
        boolean z17 = this.f209285e;
        wi5.n0 state = this.f209286f;
        if (z17) {
            rd0.i1 i1Var = (rd0.i1) i95.n0.c(rd0.i1.class);
            androidx.appcompat.app.AppCompatActivity activity = e0Var2.getActivity();
            java.util.LinkedList userNameList = state.f446319o;
            ((com.tencent.mm.ui.transmit.recent.f) i1Var).getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(userNameList, "userNameList");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
            intent.putExtra("list_type", 14);
            intent.putExtra("titile", activity.getString(com.tencent.mm.R.string.f489934fx));
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206788i);
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(userNameList, ","));
            intent.putExtra("max_limit_num", 9);
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
            pf5.j0.a(intent, gk5.k1.class);
            pf5.j0.a(intent, cj5.q4.class);
            pf5.j0.a(intent, aj5.g1.class);
            pf5.j0.a(intent, aj5.i.class);
            pf5.j0.a(intent, cj5.u3.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            e0Var2.getActivity().startActivityForResult(intent, 74518);
            e0Var = e0Var2;
        } else {
            rd0.i1 i1Var2 = (rd0.i1) i95.n0.c(rd0.i1.class);
            androidx.appcompat.app.AppCompatActivity activity2 = e0Var2.getActivity();
            ((com.tencent.mm.ui.transmit.recent.f) i1Var2).getClass();
            kotlin.jvm.internal.o.g(activity2, "activity");
            kotlin.jvm.internal.o.g(state, "state");
            android.content.Intent intent2 = new android.content.Intent();
            e0Var = e0Var2;
            intent2.putExtra("list_type", 5);
            intent2.setClass(activity2, com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
            if ((state.H & 4) > 0) {
                com.tencent.mm.ui.contact.i5.e();
                intent2.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206787h & (-65));
                intent2.putExtra("Select_Conv_Type", state.H);
            } else {
                pf5.j0.a(intent2, cj5.q4.class);
                com.tencent.mm.ui.contact.i5.e();
                intent2.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206787h);
            }
            intent2.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
            if ((state.H & 4) > 0) {
                intent2.putExtra("titile", activity2.getString(com.tencent.mm.R.string.f489934fx));
                pf5.j0.a(intent2, kk5.o0.class);
                pf5.j0.a(intent2, aj5.g1.class);
                pf5.j0.a(intent2, gk5.k1.class);
            } else {
                intent2.putExtra("titile", activity2.getString(com.tencent.mm.R.string.mxl));
                intent2.putExtra("recommend_chatroom", true);
                intent2.putExtra("group_select_need_result", true);
                intent2.putExtra("from_create_group_scene", 5);
                pf5.j0.a(intent2, aj5.l1.class);
                intent2.putExtra("KShowSelectExistChatroom", true);
                pf5.j0.a(intent2, kk5.q.class);
                pf5.j0.a(intent2, aj5.r.class);
                pf5.j0.a(intent2, kk5.c0.class);
                pf5.j0.a(intent2, kk5.h0.class);
                pf5.j0.a(intent2, aj5.r0.class);
                pf5.j0.a(intent2, aj5.i1.class);
            }
            pf5.j0.a(intent2, aj5.i.class);
            pf5.j0.a(intent2, cj5.u3.class);
            pf5.j0.a(intent2, cj5.k4.class);
            pf5.j0.a(intent2, cj5.s.class);
            pf5.j0.a(intent2, cj5.h3.class);
            pf5.j0.a(intent2, cj5.n3.class);
            pf5.j0.a(intent2, cj5.w2.class);
            pf5.j0.a(intent2, cj5.l2.class);
            e0Var.getActivity().startActivityForResult(intent2, 74517);
        }
        j75.f Q62 = e0Var.Q6();
        if (Q62 == null) {
            return null;
        }
        Q62.B3(new wi5.k());
        return jz5.f0.f302826a;
    }
}
