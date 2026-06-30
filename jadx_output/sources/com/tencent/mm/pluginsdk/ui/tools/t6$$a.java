package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final /* synthetic */ class t6$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.u6 f191921d;

    public /* synthetic */ t6$$a(com.tencent.mm.pluginsdk.ui.tools.u6 u6Var) {
        this.f191921d = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.tencent.mm.pluginsdk.ui.tools.u6 u6Var = this.f191921d;
        try {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, null, js3.g.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.pluginsdk.ui.tools.t6$$b
                @Override // com.tencent.mm.ipcinvoker.r
                public final void a(java.lang.Object obj) {
                    final com.tencent.mm.pluginsdk.ui.tools.u6 u6Var2 = com.tencent.mm.pluginsdk.ui.tools.u6.this;
                    final int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
                    if (i17 < 0) {
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        java.util.Objects.requireNonNull(u6Var2);
                        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.tools.t6$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.pluginsdk.ui.tools.u6.this.a();
                            }
                        });
                        return;
                    }
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_QQMAIL_UNREAD_COUNT_INT, java.lang.Integer.valueOf(i17));
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.tools.t6$$d
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.pluginsdk.ui.tools.u6.this.onSuccess(i17);
                        }
                    });
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QQMailUnreadHelper", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.QQMailUnreadHelper", "getUnreadCountAsync exception");
        }
    }
}
