package com.tencent.mm.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class FindMoreGameRedLogic$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderGameRedDotEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.g6 f196685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindMoreGameRedLogic$1(com.tencent.mm.ui.g6 g6Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f196685d = g6Var;
        this.__eventId = -550720006;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FinderGameRedDotEvent finderGameRedDotEvent) {
        final com.tencent.mm.autogen.events.FinderGameRedDotEvent finderGameRedDotEvent2 = finderGameRedDotEvent;
        if (!this.f196685d.b()) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.FindMoreGameRedLogic$1$$a
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
            
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Game.Entrance");
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r11 = this;
                    com.tencent.mm.ui.FindMoreGameRedLogic$1 r0 = com.tencent.mm.ui.FindMoreGameRedLogic$1.this
                    com.tencent.mm.autogen.events.FinderGameRedDotEvent r1 = r2
                    com.tencent.mm.ui.g6 r2 = r0.f196685d
                    java.lang.Object r2 = r2.f208620b
                    monitor-enter(r2)
                    com.tencent.mm.ui.g6 r3 = r0.f196685d     // Catch: java.lang.Throwable -> L77
                    com.tencent.mm.ui.FindMoreFriendsUI r3 = r3.f208619a     // Catch: java.lang.Throwable -> L77
                    if (r3 == 0) goto L6e
                    com.tencent.mm.ui.base.preference.h0 r3 = r3.f196656w     // Catch: java.lang.Throwable -> L77
                    if (r3 != 0) goto L14
                    goto L6e
                L14:
                    java.lang.String r4 = "more_tab_game_recommend"
                    com.tencent.mm.ui.base.preference.Preference r3 = r3.h(r4)     // Catch: java.lang.Throwable -> L77
                    r6 = r3
                    com.tencent.mm.ui.GameIconViewTipPreference r6 = (com.tencent.mm.ui.GameIconViewTipPreference) r6     // Catch: java.lang.Throwable -> L77
                    if (r6 != 0) goto L21
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    goto L76
                L21:
                    am.ib r1 = r1.f54278g     // Catch: java.lang.Throwable -> L77
                    int r1 = r1.f6935a     // Catch: java.lang.Throwable -> L77
                    r3 = 3
                    if (r3 == r1) goto L53
                    r4 = 2
                    if (r1 != r4) goto L2c
                    goto L53
                L2c:
                    r3 = 1
                    if (r3 != r1) goto L6c
                    java.lang.Class<zy2.b6> r1 = zy2.b6.class
                    i95.m r1 = i95.n0.c(r1)     // Catch: java.lang.Throwable -> L77
                    zy2.b6 r1 = (zy2.b6) r1     // Catch: java.lang.Throwable -> L77
                    c61.l7 r1 = (c61.l7) r1     // Catch: java.lang.Throwable -> L77
                    zy2.fa r1 = r1.nk()     // Catch: java.lang.Throwable -> L77
                    java.lang.String r3 = "Game.Entrance"
                    r45.f03 r5 = r1.I0(r3)     // Catch: java.lang.Throwable -> L77
                    if (r5 != 0) goto L47
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    goto L76
                L47:
                    com.tencent.mm.ui.g6 r0 = r0.f196685d     // Catch: java.lang.Throwable -> L77
                    com.tencent.mm.ui.FindMoreFriendsUI r4 = r0.f208619a     // Catch: java.lang.Throwable -> L77
                    r7 = 0
                    r8 = 1
                    r9 = 1
                    r10 = 0
                    r4.z0(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77
                    goto L6c
                L53:
                    if (r3 != r1) goto L68
                    java.lang.Class<zy2.b6> r0 = zy2.b6.class
                    i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Throwable -> L77
                    zy2.b6 r0 = (zy2.b6) r0     // Catch: java.lang.Throwable -> L77
                    c61.l7 r0 = (c61.l7) r0     // Catch: java.lang.Throwable -> L77
                    zy2.fa r0 = r0.nk()     // Catch: java.lang.Throwable -> L77
                    java.lang.String r1 = "Game.Entrance"
                    r0.N(r1)     // Catch: java.lang.Throwable -> L77
                L68:
                    r0 = 0
                    r6.y(r0)     // Catch: java.lang.Throwable -> L77
                L6c:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    goto L76
                L6e:
                    java.lang.String r0 = "MicroMsg.FindMoreGameRedLogic"
                    java.lang.String r1 = "findMoreFriendsUI get screen fail"
                    com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L77
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                L76:
                    return
                L77:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L77
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FindMoreGameRedLogic$1$$a.run():void");
            }
        });
        return false;
    }
}
