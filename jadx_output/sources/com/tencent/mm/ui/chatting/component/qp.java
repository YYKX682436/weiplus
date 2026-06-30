package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.u2.class)
/* loaded from: classes5.dex */
public final class qp extends com.tencent.mm.ui.chatting.component.a implements dh0.i, sb5.u2 {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Long f199804p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f199805q;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f199796e = jz5.h.b(com.tencent.mm.ui.chatting.component.pp.f199730d);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f199797f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f199798g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f199799h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f199800i = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f199801m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f199802n = new java.util.HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f199803o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: r, reason: collision with root package name */
    public final long f199806r = 200;

    public static void p0(com.tencent.mm.ui.chatting.component.qp qpVar, java.lang.String str, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        sb5.t2 t2Var = (sb5.t2) ((java.util.LinkedHashMap) qpVar.f199798g).get(java.lang.Long.valueOf(j17));
        if (t2Var == null) {
            return;
        }
        v11.n0 n07 = qpVar.n0(str, j17);
        java.util.Map map = qpVar.f199799h;
        v11.n0 n0Var = (v11.n0) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (z17 || n0Var != n07) {
            map.put(java.lang.Long.valueOf(j17), n07);
            qpVar.f199803o.post(new com.tencent.mm.ui.chatting.component.kp(t2Var, n07));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        java.lang.Object putIfAbsent;
        com.tencent.mm.storage.z3 u17 = this.f198580d.u();
        if (u17 != null && com.tencent.mm.storage.z3.L4(u17.d1())) {
            java.lang.String d17 = u17.d1();
            kotlin.jvm.internal.o.d(d17);
            dh0.j m07 = m0();
            int i17 = 0;
            if (m07 != null) {
                eh0.o oVar = (eh0.o) m07;
                eh0.e eVar = oVar.f252896e;
                eVar.getClass();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f252873a;
                java.lang.Object obj = concurrentHashMap.get(d17);
                if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(d17, (obj = new java.util.concurrent.CopyOnWriteArrayList()))) != null) {
                    obj = putIfAbsent;
                }
                ((java.util.concurrent.CopyOnWriteArrayList) obj).add(this);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.StreamListenerManager", "registerListener: registered for talker:%s", d17);
                eh0.j jVar = oVar.f252895d;
                jVar.getClass();
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) jVar.f252887a.get(d17);
                java.util.List<eh0.i> S0 = copyOnWriteArrayList != null ? kz5.n0.S0(copyOnWriteArrayList) : kz5.p0.f313996d;
                if (S0.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.Service", "[talker:" + d17 + "] registerStreamCallback: no active sessions");
                } else {
                    int i18 = 0;
                    for (eh0.i iVar : S0) {
                        java.lang.String a17 = iVar.a();
                        if (a17.length() > 0) {
                            if (iVar.f252886i) {
                                t0(d17, iVar.f252878a, iVar.f252879b, a17);
                            } else {
                                q0(d17, iVar.f252878a, iVar.f252879b, a17);
                            }
                        }
                        i18++;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", "[talker:" + d17 + "] registerStreamCallback: " + i18 + " streams registered");
                    i17 = i18;
                }
            }
            if (i17 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.ChattingComponent", "registerCallback: success, registered %d streams for talker=%s", java.lang.Integer.valueOf(i17), d17);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.ChattingComponent", "registerCallback: no active streams for talker=%s", d17);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        dh0.j m07;
        com.tencent.mm.storage.z3 u17 = this.f198580d.u();
        if (u17 == null) {
            return;
        }
        java.lang.String d17 = u17.d1();
        if (d17 != null && com.tencent.mm.storage.z3.L4(d17) && (m07 = m0()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", "[talker:" + d17 + "] unregisterStreamCallback: callback unregister");
            eh0.e eVar = ((eh0.o) m07).f252896e;
            eVar.getClass();
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) eVar.f252873a.get(d17);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(this);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.StreamListenerManager", "[talker:" + d17 + "] unregisterListener: callback removed. remainingListeners:" + copyOnWriteArrayList.size());
            }
        }
        ((java.util.LinkedHashMap) this.f199797f).clear();
        ((java.util.LinkedHashMap) this.f199798g).clear();
        ((java.util.LinkedHashMap) this.f199799h).clear();
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f199800i;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((d90.p) ((com.tencent.mm.ui.chatting.component.ip) it.next()).f199243a).b();
        }
        linkedHashMap.clear();
        this.f199801m.clear();
        this.f199802n.clear();
    }

    public final dh0.j m0() {
        return (dh0.j) ((jz5.n) this.f199796e).getValue();
    }

    public final v11.n0 n0(java.lang.String str, long j17) {
        dh0.j m07 = m0();
        boolean Vi = m07 != null ? ((eh0.o) m07).Vi(str, j17) : false;
        dh0.j m08 = m0();
        boolean Ui = m08 != null ? ((eh0.o) m08).Ui(str, j17) : false;
        dh0.j m09 = m0();
        boolean Ri = m09 != null ? ((eh0.o) m09).Ri(str, j17) : false;
        return (Vi && Ri) ? v11.n0.f432447f : Vi ? v11.n0.f432446e : (Ui && Ri) ? v11.n0.f432448g : Ri ? v11.n0.f432449h : v11.n0.f432445d;
    }

    public final void o0(long j17) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.ChattingComponent", "notifyMessageUpdate: msgId invalid, msgId=%d", java.lang.Long.valueOf(j17));
            return;
        }
        this.f199804p = java.lang.Long.valueOf(j17);
        java.lang.Thread.currentThread().getName();
        if (this.f199805q != null) {
            return;
        }
        com.tencent.mm.ui.chatting.component.jp jpVar = new com.tencent.mm.ui.chatting.component.jp(this);
        this.f199805q = jpVar;
        this.f199803o.postDelayed(jpVar, this.f199806r);
    }

    public void q0(java.lang.String talker, long j17, long j18, java.lang.String deltaText) {
        sb5.r2 u07;
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(deltaText, "deltaText");
        java.lang.Thread.currentThread().getName();
        if (this.f199802n.add(java.lang.Long.valueOf(j17)) && (u07 = u0()) != null) {
            ((com.tencent.mm.ui.chatting.component.hp) u07).o0(j17);
        }
        p0(this, talker, j17, false, 4, null);
        o0(j18);
    }

    public void r0(java.lang.String talker, long j17, long j18, java.lang.String fullText) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(fullText, "fullText");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[STREAM_TRACE] onStreamEnd: msgSvrId=%d, msgId=%d, fullTextLen=%d, thread=%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(fullText.length()), java.lang.Thread.currentThread().getName());
        sb5.s2 s2Var = (sb5.s2) ((java.util.LinkedHashMap) this.f199797f).get(java.lang.Long.valueOf(j17));
        if (s2Var != null) {
            this.f199803o.post(new com.tencent.mm.ui.chatting.component.lp(s2Var));
        }
        dh0.j m07 = m0();
        boolean Vi = m07 != null ? ((eh0.o) m07).Vi(talker, j17) : false;
        dh0.j m08 = m0();
        boolean Ui = m08 != null ? ((eh0.o) m08).Ui(talker, j17) : false;
        java.util.HashSet hashSet = this.f199801m;
        if (hashSet.contains(java.lang.Long.valueOf(j17)) && !Vi) {
            hashSet.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u07 = u0();
            if (u07 != null) {
                ((com.tencent.mm.ui.chatting.component.hp) u07).n0(j17);
            }
        }
        java.util.HashSet hashSet2 = this.f199802n;
        if (hashSet2.contains(java.lang.Long.valueOf(j17)) && !Ui) {
            hashSet2.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u08 = u0();
            if (u08 != null) {
                ((com.tencent.mm.ui.chatting.component.hp) u08).n0(j17);
            }
        }
        p0(this, talker, j17, false, 4, null);
        o0(j18);
    }

    public void s0(java.lang.String talker, long j17, long j18, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.ChattingComponent", "onStreamError: msgId=%d, errorCode=%d, errorMsg=%s", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17), str);
        sb5.s2 s2Var = (sb5.s2) ((java.util.LinkedHashMap) this.f199797f).get(java.lang.Long.valueOf(j17));
        if (s2Var != null) {
            this.f199803o.post(new com.tencent.mm.ui.chatting.component.mp(s2Var));
        }
        dh0.j m07 = m0();
        boolean Vi = m07 != null ? ((eh0.o) m07).Vi(talker, j17) : false;
        dh0.j m08 = m0();
        boolean Ui = m08 != null ? ((eh0.o) m08).Ui(talker, j17) : false;
        java.util.HashSet hashSet = this.f199801m;
        if (hashSet.contains(java.lang.Long.valueOf(j17)) && !Vi) {
            hashSet.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u07 = u0();
            if (u07 != null) {
                ((com.tencent.mm.ui.chatting.component.hp) u07).n0(j17);
            }
        }
        java.util.HashSet hashSet2 = this.f199802n;
        if (hashSet2.contains(java.lang.Long.valueOf(j17)) && !Ui) {
            hashSet2.remove(java.lang.Long.valueOf(j17));
            sb5.r2 u08 = u0();
            if (u08 != null) {
                ((com.tencent.mm.ui.chatting.component.hp) u08).n0(j17);
            }
        }
        p0(this, talker, j17, false, 4, null);
        if (j18 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.ChattingComponent", "notifyMessageError: msgId invalid, msgId=%d", java.lang.Long.valueOf(j18));
            return;
        }
        java.lang.String x17 = this.f198580d.x();
        com.tencent.mm.autogen.events.ChatMsgNotifyEvent chatMsgNotifyEvent = new com.tencent.mm.autogen.events.ChatMsgNotifyEvent();
        am.a2 a2Var = chatMsgNotifyEvent.f54036g;
        a2Var.f6117a = j18;
        a2Var.f6118b = x17;
        a2Var.f6119c = true;
        chatMsgNotifyEvent.e();
    }

    public void t0(java.lang.String talker, long j17, long j18, java.lang.String streamText) {
        sb5.r2 u07;
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(streamText, "streamText");
        java.lang.Thread.currentThread().getName();
        if (this.f199801m.add(java.lang.Long.valueOf(j17)) && (u07 = u0()) != null) {
            ((com.tencent.mm.ui.chatting.component.hp) u07).o0(j17);
        }
        sb5.s2 s2Var = (sb5.s2) ((java.util.LinkedHashMap) this.f199797f).get(java.lang.Long.valueOf(j17));
        if (s2Var != null) {
            this.f199803o.post(new com.tencent.mm.ui.chatting.component.np(s2Var, streamText));
        }
        p0(this, talker, j17, false, 4, null);
    }

    public final sb5.r2 u0() {
        yb5.d dVar = this.f198580d;
        if (dVar != null) {
            return (sb5.r2) dVar.f460708c.a(sb5.r2.class);
        }
        return null;
    }

    public void v0(long j17) {
        java.util.Map map = this.f199797f;
        map.remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[THINKING_TRACE] unregisterThinkingCallback: msgSvrId=%d, mapSize=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(map.size()));
    }

    public void w0(long j17) {
        java.util.Map map = this.f199798g;
        map.remove(java.lang.Long.valueOf(j17));
        this.f199799h.remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[THINKING_TRACE] unregisterThinkingStatusCallback: msgSvrId=%d, mapSize=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(map.size()));
    }
}
