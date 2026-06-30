package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class h4 implements com.tencent.mm.ui.chatting.adapter.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m4 f202249a;

    public h4(com.tencent.mm.ui.chatting.presenter.m4 m4Var) {
        this.f202249a = m4Var;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void a(android.view.View v17, int i17, com.tencent.mm.ui.chatting.adapter.f0 inputItem) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(inputItem, "inputItem");
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.ui.chatting.presenter.m4 m4Var = this.f202249a;
        com.tencent.mm.storage.f9 n17 = e0Var.n(m4Var.f202542e, ((com.tencent.mm.ui.chatting.presenter.d4) inputItem).f198411d);
        m4Var.getClass();
        de5.a.f229396a.k(5, 10, 11);
        ot0.q v18 = ot0.q.v(n17.j());
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
        openNoteFromSessionEvent.f54599g.f7906c = v17.getContext();
        openNoteFromSessionEvent.f54599g.f7904a = n17.getMsgId();
        openNoteFromSessionEvent.f54599g.f7909f = n17.Q0();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        snVar.f7907d = false;
        snVar.f7905b = v18 != null ? v18.f348663h0 : null;
        snVar.f7910g = 6;
        openNoteFromSessionEvent.e();
    }

    @Override // com.tencent.mm.ui.chatting.adapter.i0
    public void b(android.view.View view, int i17, com.tencent.mm.ui.chatting.adapter.f0 item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.chatting.presenter.m4 m4Var = this.f202249a;
        m4Var.getClass();
        de5.a.f229396a.k(14, 10, 11);
        new com.tencent.mm.ui.tools.s6(view.getContext()).a(view, com.tencent.mm.ui.chatting.presenter.f4.f202212d, new com.tencent.mm.ui.chatting.presenter.g4(m4Var, item), null);
    }
}
