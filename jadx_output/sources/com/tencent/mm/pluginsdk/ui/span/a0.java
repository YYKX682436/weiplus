package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes9.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f191162d = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f191163a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f191164b;

    /* renamed from: c, reason: collision with root package name */
    public long f191165c = 0;

    public void a(android.view.View view, r35.m3 m3Var) {
        com.tencent.mm.pluginsdk.ui.span.z zVar;
        java.lang.String userName;
        com.tencent.mm.storage.f9 c17;
        com.tencent.mm.storage.f9 c18;
        com.tencent.mm.storage.f9 c19;
        com.tencent.mm.storage.f9 c27;
        com.tencent.mm.storage.f9 c28;
        if (java.lang.System.currentTimeMillis() - this.f191165c <= 500) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSpanClickListener", "process pass");
            return;
        }
        this.f191165c = java.lang.System.currentTimeMillis();
        if (m3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSpanClickListener", "onClick error, hrefInfo is null!");
            return;
        }
        if (this.f191163a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSpanClickListener", "onClick error, context is null!");
            return;
        }
        java.util.LinkedList linkedList = f191162d;
        if (linkedList == null || linkedList.size() <= 0) {
            zVar = null;
        } else {
            linkedList.size();
            zVar = (com.tencent.mm.pluginsdk.ui.span.z) linkedList.getLast();
        }
        if (view == null || !(view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5) || (c28 = ((com.tencent.mm.ui.chatting.viewitems.er) ((com.tencent.mm.pluginsdk.ui.chat.l5) view.getTag())).c()) == null) {
            userName = (view == null || !(view.getTag() instanceof b45.a)) ? null : ((b45.a) view.getTag()).getUserName();
        } else {
            userName = c28.Q0();
            if (com.tencent.mm.storage.z3.R4(userName)) {
                userName = c01.w9.s(c28.j());
            }
        }
        m3Var.f369197f = userName;
        m3Var.f369198g = (view == null || !(view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5) || (c27 = ((com.tencent.mm.ui.chatting.viewitems.er) ((com.tencent.mm.pluginsdk.ui.chat.l5) view.getTag())).c()) == null || c27.A0() != 1) ? null : c01.z1.r();
        m3Var.f369199h = (view == null || !(view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5) || (c19 = ((com.tencent.mm.ui.chatting.viewitems.er) ((com.tencent.mm.pluginsdk.ui.chat.l5) view.getTag())).c()) == null) ? null : c19.j();
        m3Var.f369200i = (view == null || !(view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5) || (c18 = ((com.tencent.mm.ui.chatting.viewitems.er) ((com.tencent.mm.pluginsdk.ui.chat.l5) view.getTag())).c()) == null) ? null : c18.Q0();
        int i17 = 0;
        m3Var.f369201j = (view == null || !(view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5) || (c17 = ((com.tencent.mm.ui.chatting.viewitems.er) ((com.tencent.mm.pluginsdk.ui.chat.l5) view.getTag())).c()) == null || c17.getType() != 10000) ? 0 : c17.X;
        m3Var.f369206o = (view == null || !(view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5)) ? null : ((com.tencent.mm.ui.chatting.viewitems.er) ((com.tencent.mm.pluginsdk.ui.chat.l5) view.getTag())).c();
        m3Var.f369207p = (view == null || !(view.getTag() instanceof b45.a)) ? 1 : ((b45.a) view.getTag()).b();
        m3Var.f369208q = (view == null || !(view.getTag() instanceof b45.a)) ? null : ((b45.a) view.getTag()).a();
        if (m3Var.f369205n == 0) {
            if (view != null && (view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5)) {
                i17 = 1;
            } else if (view != null && (view.getTag() instanceof b45.a)) {
                i17 = 2;
            }
            if (i17 != 0) {
                m3Var.f369205n = i17;
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f191164b)) {
            m3Var.f369204m = this.f191164b;
        }
        ((com.tencent.mm.app.plugin.s) com.tencent.mm.pluginsdk.ui.span.n.a()).h(this.f191163a, view, m3Var, zVar);
        if (view != null && (view.getTag() instanceof com.tencent.mm.pluginsdk.ui.chat.l5)) {
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(m3Var.f369197f, 1);
        }
        m3Var.f369204m = null;
    }
}
