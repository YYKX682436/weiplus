package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class t4 extends bm5.p1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f209874b;

    public t4(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        this.f209874b = findMoreFriendsUI;
    }

    @Override // bm5.p1
    public java.lang.Object a() {
        return new e75.a() { // from class: com.tencent.mm.ui.t4$$a
            @Override // e75.a
            public final void onChanged(java.lang.Object obj) {
                final com.tencent.mm.ui.t4 t4Var = com.tencent.mm.ui.t4.this;
                t4Var.getClass();
                ((ug0.x) obj).b(tg0.i2.class, new j75.l() { // from class: com.tencent.mm.ui.t4$$b
                    @Override // j75.l
                    public final void a(j75.d dVar) {
                        final com.tencent.mm.ui.t4 t4Var2 = com.tencent.mm.ui.t4.this;
                        final tg0.i2 i2Var = (tg0.i2) dVar;
                        t4Var2.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, received a WebSearchRedDotControlAction.");
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.t4$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z17;
                                boolean z18;
                                r45.f03 f03Var;
                                r45.f03 f03Var2;
                                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
                                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2;
                                r45.f03 f03Var3;
                                boolean z19;
                                com.tencent.mm.ui.t4 t4Var3 = com.tencent.mm.ui.t4.this;
                                com.tencent.mm.ui.websearch.WebSearchTipPreference webSearchTipPreference = (com.tencent.mm.ui.websearch.WebSearchTipPreference) t4Var3.f209874b.f196656w.h("find_friends_by_search");
                                if (webSearchTipPreference == null) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.FindMoreFriendsUI", "webSearchObserver, searchPreference is null, skipped.");
                                    return;
                                }
                                com.tencent.mm.plugin.finder.extension.reddot.a aVar = i2Var.f419082b;
                                boolean z27 = false;
                                java.lang.String str = null;
                                if (aVar == null) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDowResult is null, create an empty instance.");
                                    aVar = new com.tencent.mm.plugin.finder.extension.reddot.a(false, null, null, "");
                                }
                                zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
                                java.lang.String str2 = aVar.f105331e;
                                boolean equals = "Search.Entrance".equals(str2);
                                boolean z28 = aVar.f105327a;
                                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = aVar.f105329c;
                                if (equals) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: Entrance, getting ctrlInfo from action.");
                                    if (jbVar3 != null) {
                                        f03Var2 = jbVar3.I0("Search.Entrance");
                                        boolean z29 = f03Var2 != null && z28;
                                        jbVar2 = jbVar3;
                                        z18 = false;
                                        f03Var = null;
                                        z17 = z29;
                                        jbVar = null;
                                    } else {
                                        jbVar2 = jbVar3;
                                        z17 = false;
                                        z18 = false;
                                        f03Var = null;
                                        f03Var2 = null;
                                        jbVar = null;
                                    }
                                    str = "Search.Entrance";
                                } else if ("Search.MentionEntrance".equals(str2)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: MentionEntrance, getting ctrlInfo from action.");
                                    if (jbVar3 != null) {
                                        r45.f03 I0 = jbVar3.I0("Search.MentionEntrance");
                                        boolean z37 = I0 != null && I0.f373888e > 0 && z28;
                                        z17 = false;
                                        jbVar2 = null;
                                        z18 = z37;
                                        jbVar = jbVar3;
                                        f03Var = I0;
                                        f03Var2 = null;
                                    } else {
                                        jbVar = jbVar3;
                                        z17 = false;
                                        z18 = false;
                                        f03Var = null;
                                        f03Var2 = null;
                                        jbVar2 = null;
                                    }
                                    str = "Search.MentionEntrance";
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath not supported.");
                                    z17 = false;
                                    z18 = false;
                                    f03Var = null;
                                    f03Var2 = null;
                                    jbVar = null;
                                    jbVar2 = null;
                                }
                                if (f03Var2 == null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, entranceShowInfo is null, finding showInfo by path.");
                                    jbVar2 = nk6.L0("Search.Entrance");
                                    if (jbVar2 != null) {
                                        f03Var2 = jbVar2.I0("Search.Entrance");
                                        z17 = f03Var2 != null;
                                    }
                                }
                                if (f03Var == null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, mentionEntranceShowInfo is null, finding showInfo by path.");
                                    jbVar = nk6.L0("Search.MentionEntrance");
                                    if (jbVar != null) {
                                        r45.f03 I02 = jbVar.I0("Search.MentionEntrance");
                                        if (I02 != null && I02.f373888e > 0) {
                                            z27 = true;
                                        }
                                        f03Var3 = I02;
                                        z19 = z27;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: " + str + ", isEntranceShow: " + z17 + ", entranceCtrlInfo: " + jbVar2 + ", entranceShowInfo: " + f03Var2 + ", isMentionEntranceShow: " + z19 + ", mentionEntranceCtrlInfo: " + jbVar + ", mentionEntranceShowInfo: " + f03Var3);
                                        t4Var3.f209874b.B0(webSearchTipPreference, str, z17, jbVar2, f03Var2, z19, jbVar, f03Var3);
                                    }
                                }
                                f03Var3 = f03Var;
                                z19 = z18;
                                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "webSearchObserver, redDotPath: " + str + ", isEntranceShow: " + z17 + ", entranceCtrlInfo: " + jbVar2 + ", entranceShowInfo: " + f03Var2 + ", isMentionEntranceShow: " + z19 + ", mentionEntranceCtrlInfo: " + jbVar + ", mentionEntranceShowInfo: " + f03Var3);
                                t4Var3.f209874b.B0(webSearchTipPreference, str, z17, jbVar2, f03Var2, z19, jbVar, f03Var3);
                            }
                        });
                    }
                });
            }
        };
    }
}
