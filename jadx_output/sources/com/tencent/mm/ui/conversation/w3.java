package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w3 implements l75.z0, o75.a {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.w3 f208214g = new com.tencent.mm.ui.conversation.w3();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Vector f208215d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f208216e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.u3 f208217f;

    public w3() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DoingInitContactEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DoingInitContactEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.ConversationUnreadHelper$1
            {
                this.__eventId = -1611655951;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DoingInitContactEvent doingInitContactEvent) {
                int i17 = doingInitContactEvent.f54093g.f6636a;
                if (i17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "do init start");
                    com.tencent.mm.ui.conversation.w3.this.f208216e = true;
                } else if (i17 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "do init end");
                    com.tencent.mm.ui.conversation.w3.this.f208216e = false;
                    com.tencent.mm.ui.conversation.w3.this.e();
                }
                return false;
            }
        };
        this.f208217f = new com.tencent.mm.ui.conversation.u3(this, null);
        this.f208215d = new java.util.Vector(8);
        iListener.alive();
        dm.e2.D2.observe(a0Var, this);
        c01.d9.b().getClass();
        j01.c cVar = f01.s1.INSTANCE.f258391d;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f296974a;
        if (!concurrentHashMap.contains(this)) {
            if (mainLooper != null) {
                concurrentHashMap.put(this, new android.os.Handler(mainLooper));
            } else {
                concurrentHashMap.put(this, java.lang.Boolean.FALSE);
            }
        }
        e();
    }

    public static int b(com.tencent.mm.storage.l4 l4Var) {
        if (l4Var == null || l4Var.d1() <= 0) {
            if (l4Var == null || (!(l4Var.d2(8388608) || l4Var.d2(2097152)) || l4Var.f1() <= 0)) {
                return (l4Var == null || !com.tencent.mm.storage.z3.o4(l4Var.h1()) || l4Var.f1() <= 0) ? 0 : 1;
            }
            return 1;
        }
        if (com.tencent.mm.storage.z3.N3(l4Var.h1())) {
            return 1;
        }
        if (com.tencent.mm.storage.z3.k4(l4Var.h1())) {
            if (!l4Var.d2(16) && !l4Var.d2(64)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "getShowUnreadCountType officialaccounts. not time line unread or notify unread. return count no.");
                com.tencent.mm.storage.a1.f193716a.B(0);
                return 0;
            }
            if (l4Var.d2(64) && l4Var.d2(2048)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "getShowUnreadCountType officialaccounts. timeline notify unread but consume. return count no.");
                com.tencent.mm.storage.a1.f193716a.B(0);
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "getShowUnreadCountType officialaccounts. return count mute yes.");
            com.tencent.mm.storage.a1.f193716a.B(1);
            return 1;
        }
        if (com.tencent.mm.storage.z3.B4(l4Var.h1())) {
            return (l4Var.d2(512) || l4Var.d2(1024) || l4Var.d2(32768)) ? 1 : 0;
        }
        if (com.tencent.mm.storage.z3.j4(l4Var.h1()) && !c01.d9.b().p().o(com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            return 1;
        }
        if (com.tencent.mm.storage.z3.C3(l4Var.h1()) && !c01.d9.b().p().o(com.tencent.mm.storage.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            return 1;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(l4Var.h1(), true);
        if (n17 != null && ((int) n17.E2) != 0) {
            if (c01.e2.P(n17) && n17.B2()) {
                return 1;
            }
            if (com.tencent.mm.storage.z3.R4(l4Var.h1()) && n17.T == 0) {
                return 1;
            }
        }
        if (com.tencent.mm.storage.z3.B3(l4Var.h1())) {
            return 1;
        }
        return com.tencent.mm.storage.z3.X3(l4Var.h1()) ? 0 : 2;
    }

    public com.tencent.mm.ui.conversation.v3 a(java.util.Set set) {
        com.tencent.mm.ui.conversation.u3 u3Var = this.f208217f;
        try {
            u3Var.call();
            return u3Var.c(set);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationUnreadHelper", "get24hUnreadCount error: " + e17);
            return com.tencent.mm.ui.conversation.v3.f208182e;
        }
    }

    public int c() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(931, 25);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Integer num = 0;
        try {
            num = this.f208217f.call();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationUnreadHelper", "getTotalUnread error: " + e17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "getTotalUnread totalUnread:%s cost:%s", num, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final boolean d(o75.c cVar) {
        com.tencent.mm.storage.z3 z3Var;
        o75.b bVar = cVar.f343587a;
        if (bVar == o75.b.f343584e || bVar == o75.b.f343582c || (z3Var = (com.tencent.mm.storage.z3) cVar.f343590d) == null || ((int) z3Var.E2) <= 0 || com.tencent.mm.storage.z3.E4(z3Var.d1())) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "onContactStorageNotifyChange contact %s isMute %s, ChatRoomNotify %d", z3Var.d1(), java.lang.Boolean.valueOf(c01.e2.P(z3Var)), java.lang.Integer.valueOf(z3Var.T));
        return true;
    }

    public final void e() {
        this.f208215d.add(null);
        ((ku5.t0) ku5.t0.f312615d).A("ConversationUnreadHelper");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.conversation.u3 u3Var = this.f208217f;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        java.util.Objects.requireNonNull(u3Var);
        t0Var.u(u3Var, 1000, "ConversationUnreadHelper");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "onNotifyChange username:%s isIniting:%s", str, java.lang.Boolean.valueOf(this.f208216e));
            boolean z17 = true;
            if (!(a1Var instanceof com.tencent.mm.storage.l8)) {
                if (!(a1Var instanceof com.tencent.mm.storage.e8) || i17 == 5 || i17 == 2 || this.f208216e) {
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "username is null");
                } else {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                    if (n17 == null || ((int) n17.E2) <= 0 || com.tencent.mm.storage.z3.E4(str)) {
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationUnreadHelper", "onContactStorageNotifyChange contact isMute %s, ChatRoomNotify %d", java.lang.Boolean.valueOf(c01.e2.P(n17)), java.lang.Integer.valueOf(n17.T));
                    }
                }
                e();
                return;
            }
            if (((java.util.ArrayList) c01.h2.g()).contains(str)) {
                return;
            }
            if (i17 == 5) {
                e();
                return;
            }
            if (str == null) {
                return;
            }
            synchronized (this.f208215d) {
                java.util.Iterator it = this.f208215d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    } else if (str.equals((java.lang.String) it.next())) {
                        break;
                    }
                }
                if (!z17) {
                    this.f208215d.add(str);
                }
            }
            ((ku5.t0) ku5.t0.f312615d).A("ConversationUnreadHelper");
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.ui.conversation.u3 u3Var = this.f208217f;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            java.util.Objects.requireNonNull(u3Var);
            t0Var.u(u3Var, 1000, "ConversationUnreadHelper");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // e75.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChanged(java.lang.Object r3) {
        /*
            r2 = this;
            o75.c r3 = (o75.c) r3
            boolean r0 = r2.f208216e
            if (r0 == 0) goto L7
            goto L53
        L7:
            o75.b r0 = r3.f343587a
            o75.b r1 = o75.b.f343585f
            if (r0 != r1) goto L4a
            java.util.HashMap r3 = r3.f343591e
            if (r3 == 0) goto L34
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            o75.c r0 = (o75.c) r0
            boolean r0 = r2.d(r0)
            if (r0 == 0) goto L19
            goto L34
        L32:
            r3 = 0
            goto L35
        L34:
            r3 = 1
        L35:
            if (r3 == 0) goto L3a
            r2.e()
        L3a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "MicroMsg.ConversationUnreadHelper"
            java.lang.String r1 = "batch event %s"
            com.tencent.mars.xlog.Log.i(r0, r1, r3)
            goto L53
        L4a:
            boolean r3 = r2.d(r3)
            if (r3 == 0) goto L53
            r2.e()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.w3.onChanged(java.lang.Object):void");
    }
}
