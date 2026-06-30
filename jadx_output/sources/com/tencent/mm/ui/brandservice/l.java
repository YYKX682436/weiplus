package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class l extends com.tencent.mm.ui.conversation.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.HashMap f198052J;
    public final java.lang.String K;

    public l(android.content.Context context, java.lang.String str, com.tencent.mm.ui.y9 y9Var) {
        super(context, y9Var);
        this.K = str;
        this.f198052J = new java.util.HashMap();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        s(((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, null, this.K, -1));
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void x(final com.tencent.mm.storage.l4 l4Var, boolean z17, final int i17, final boolean z18, final android.view.View view) {
        if (l4Var == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.brandservice.l$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.view.View view2 = view;
                if (view2 == null) {
                    return;
                }
                int i18 = z18 ? 8 : 32;
                com.tencent.mm.storage.l4 l4Var2 = l4Var;
                int i19 = l4Var2.d1() > 0 ? 1 : 0;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("raw_user_name", l4Var2.h1());
                hashMap.put("element_type", "biz_bar_page");
                hashMap.put("element", 6);
                hashMap.put("if_red_dot", java.lang.Integer.valueOf(i19));
                hashMap.put("pos", java.lang.Integer.valueOf(i17));
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(view2, "brand_service_session_view");
                aVar.gk(view2, hashMap);
                aVar.Tj(view2, i18, 12, false);
            }
        });
        com.tencent.mm.ui.brandservice.m mVar = (com.tencent.mm.ui.brandservice.m) this.f198052J.get(l4Var.h1());
        if (mVar == null) {
            mVar = new com.tencent.mm.ui.brandservice.m();
            this.f198052J.put(l4Var.h1(), mVar);
        }
        if (mVar.f198058p > 0) {
            return;
        }
        mVar.f378012g = z17;
        mVar.f378016n = mVar.f378016n || l4Var.d1() > 0;
        int i18 = i17 + 1;
        mVar.f378015m = i18;
        if (z18) {
            mVar.f198058p = i18;
        }
        mVar.f378014i = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (l4Var.R0() == mVar.f198057o) {
            return;
        }
        mVar.f198057o = l4Var.R0();
        com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var.h1());
        if (q57 == null || !q57.t2()) {
            return;
        }
        ot0.m0 Di = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(q57.getMsgId(), q57.j());
        if (com.tencent.mm.sdk.platformtools.t8.L0(Di.f348581i) || com.tencent.mm.sdk.platformtools.t8.K0(((ot0.s0) Di.f348581i.get(0)).f348762e)) {
            return;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(((ot0.s0) Di.f348581i.get(0)).f348762e);
            mVar.f378010e = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
            mVar.f378011f = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("idx"), 0);
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", e18.getMessage());
        }
    }
}
