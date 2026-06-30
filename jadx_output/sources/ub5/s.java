package ub5;

/* loaded from: classes8.dex */
public final class s implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.wp f426248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f426250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub5.k f426252e;

    public s(com.tencent.mm.ui.chatting.component.wp wpVar, java.lang.String str, java.util.List list, java.lang.String str2, ub5.k kVar) {
        this.f426248a = wpVar;
        this.f426249b = str;
        this.f426250c = list;
        this.f426251d = str2;
        this.f426252e = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public final void onShow() {
        gm0.b bVar;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        com.tencent.mm.ui.chatting.component.wp wpVar = this.f426248a;
        if (wpVar != null && (bVar = gm0.j1.b().f273245h) != null && (lifecycleScope = bVar.f273145e) != null) {
            v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.component.tp(wpVar, null), 1, null);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l lVar = new jz5.l("multi_select_more_actionsheet_btn_list", this.f426249b);
        java.util.List msgList = this.f426250c;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        ((cy1.a) rVar).Hj("multi_select_more_actionsheet", "view_exp", kz5.c1.k(lVar, new jz5.l("selected_msg_list", kz5.n0.g0(msgList, "#", null, null, 0, null, tb5.h0.f417053d, 30, null)), new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(msgList.size())), new jz5.l("share_session_id", this.f426251d), new jz5.l("chat_username", ((com.tencent.mm.ui.chatting.component.d6) this.f426252e).f198925a.f198580d.x())), 35480);
    }
}
