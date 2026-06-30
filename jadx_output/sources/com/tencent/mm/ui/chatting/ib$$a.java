package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final /* synthetic */ class ib$$a implements vh0.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ib f201847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r35.m3 f201848b;

    public /* synthetic */ ib$$a(com.tencent.mm.ui.chatting.ib ibVar, r35.m3 m3Var) {
        this.f201847a = ibVar;
        this.f201848b = m3Var;
    }

    public final void a(android.net.Uri uri, final vh0.h1 h1Var) {
        final com.tencent.mm.ui.chatting.ib ibVar = this.f201847a;
        final r35.m3 m3Var = this.f201848b;
        ibVar.getClass();
        vh0.h1 h1Var2 = vh0.h1.UNKNOWN_URL;
        if (h1Var != h1Var2 && "/SetRedEnvelopeCover".equals(uri.getPath())) {
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.chatting.ib ibVar2 = com.tencent.mm.ui.chatting.ib.this;
                    ibVar2.getClass();
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    java.util.HashMap hashMap = new java.util.HashMap(16);
                    m3.d[] dVarArr = new m3.d[4];
                    yb5.d dVar = ibVar2.f201846a;
                    dVarArr[0] = new m3.d("chat_name", dVar.x());
                    dVarArr[1] = new m3.d("enter_sessionid", dVar.f460722q);
                    dVarArr[2] = new m3.d("enter_type", java.lang.Integer.valueOf(vh0.l2.a(dVar.k())));
                    com.tencent.mm.storage.f9 f9Var = m3Var.f369206o;
                    dVarArr[3] = new m3.d("msgid", java.lang.Long.valueOf(f9Var != null ? f9Var.I0() : 0L));
                    ((cy1.a) rVar).Hj("yuanbao_text_link", "view_clk", bm5.i0.a(hashMap, dVarArr), 34004);
                }
            }, "yb_txt_link_clk_rpt");
        }
        if (h1Var != h1Var2 && "/SendYuanbaoRemindMsg".equals(uri.getPath())) {
            long F1 = com.tencent.mm.sdk.platformtools.t8.F1(uri.getQueryParameter("msgid"), 0L);
            java.lang.String x17 = ibVar.f201846a.x();
            java.lang.Long valueOf = java.lang.Long.valueOf(F1);
            final com.tencent.mm.storage.f9 o27 = valueOf.longValue() != 0 ? ((com.tencent.mm.plugin.messenger.foundation.h2) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.h2.class)).cj().o2(x17, valueOf.longValue()) : null;
            if (o27 != null) {
                com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_POSITION_REMIND_MSG_TIP_IN_BOOLEAN;
                if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            final com.tencent.mm.ui.chatting.ib ibVar2 = com.tencent.mm.ui.chatting.ib.this;
                            yb5.d dVar = ibVar2.f201846a;
                            android.app.Activity g17 = dVar.g();
                            java.lang.String string = dVar.s().getString(com.tencent.mm.R.string.hy8);
                            java.lang.String string2 = dVar.s().getString(com.tencent.mm.R.string.hy9);
                            final com.tencent.mm.storage.f9 f9Var = o27;
                            db5.e1.t(g17, string, string2, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.chatting.ib$$f
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                                    final com.tencent.mm.ui.chatting.ib ibVar3 = com.tencent.mm.ui.chatting.ib.this;
                                    final com.tencent.mm.storage.f9 f9Var2 = f9Var;
                                    ibVar3.getClass();
                                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$g
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            pj5.k.f355386a.d(com.tencent.mm.ui.chatting.ib.this.f201846a.g(), f9Var2, 1);
                                        }
                                    });
                                }
                            });
                        }
                    });
                    c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
                } else {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$d
                        @Override // java.lang.Runnable
                        public final void run() {
                            pj5.k.f355386a.d(com.tencent.mm.ui.chatting.ib.this.f201846a.g(), o27, 1);
                        }
                    });
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).D(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.ib$$e
            @Override // java.lang.Runnable
            public final void run() {
                vh0.h1 h1Var3 = vh0.h1.OK;
                vh0.h1 h1Var4 = h1Var;
                com.tencent.mm.ui.chatting.ib ibVar2 = com.tencent.mm.ui.chatting.ib.this;
                if (h1Var4 != h1Var3) {
                    ibVar2.getClass();
                    return;
                }
                yb5.d dVar = ibVar2.f201846a;
                if (dVar.l() != null) {
                    dVar.n().putExtra("deeplink_handled", true);
                    dVar.d();
                }
            }
        });
    }
}
