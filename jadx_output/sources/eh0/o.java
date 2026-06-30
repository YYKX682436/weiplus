package eh0;

@j95.b
/* loaded from: classes5.dex */
public final class o extends i95.w implements dh0.j {

    /* renamed from: d, reason: collision with root package name */
    public final eh0.j f252895d = new eh0.j();

    /* renamed from: e, reason: collision with root package name */
    public final eh0.e f252896e = new eh0.e();

    /* renamed from: f, reason: collision with root package name */
    public e70.a0 f252897f;

    public static final void wi(eh0.o oVar, eh0.i iVar, com.tencent.wechat.aff.ilink_stream.x xVar) {
        oVar.getClass();
        java.lang.String str = iVar.f252882e;
        boolean z17 = str == null || str.length() == 0;
        long j17 = iVar.f252878a;
        if (z17 || j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", "handleStreamError: talker or msgSvrId is empty. talker:" + str + ", msgSvrId:" + j17);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", eh0.q.a(str, j17, iVar.f252880c) + "handleStreamError: errorCode:" + xVar.ordinal() + ", errorName:" + xVar.name());
        java.lang.String Ni = oVar.Ni(str, j17);
        oVar.Zi(iVar);
        eh0.g.f252875a.b(Ni);
        oVar.Bi(iVar);
        oVar.f252896e.b(str, iVar.f252878a, iVar.f252879b, xVar.ordinal(), xVar.name());
    }

    public void Ai(java.lang.String talker, long j17) {
        java.util.List list;
        kotlin.jvm.internal.o.g(talker, "talker");
        eh0.j jVar = this.f252895d;
        jVar.getClass();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) jVar.f252887a.get(talker);
        if (copyOnWriteArrayList == null) {
            list = kz5.p0.f313996d;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                eh0.i iVar = (eh0.i) it.next();
                if (iVar.f252878a == j17) {
                    arrayList.add(iVar);
                }
            }
            copyOnWriteArrayList.removeAll(kz5.n0.X0(arrayList));
            if (!arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "removeAllSessions: removed %d session(s) for talker:%s, msgSvrId:%d", java.lang.Integer.valueOf(arrayList.size()), talker, java.lang.Long.valueOf(j17));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.Service", "[talker:" + talker + "|svrId:" + j17 + "] cancelStream: no session found");
            return;
        }
        eh0.g.f252875a.b(Ni(talker, j17));
        java.util.Iterator it6 = list.iterator();
        while (true) {
            java.lang.Object obj = null;
            if (!it6.hasNext()) {
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it7.next();
                    if (((eh0.i) next).f252879b > 0) {
                        obj = next;
                        break;
                    }
                }
                eh0.i iVar2 = (eh0.i) obj;
                this.f252896e.b(talker, j17, iVar2 != null ? iVar2.f252879b : ((eh0.i) kz5.n0.X(list)).f252879b, -2, "canceled due to completed");
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", "[talker:" + talker + "|svrId:" + j17 + "] cancelStream: " + list.size() + " session(s) canceled, error notified to listeners");
                return;
            }
            eh0.i iVar3 = (eh0.i) it6.next();
            java.lang.String a17 = eh0.q.a(talker, j17, iVar3.f252880c);
            java.lang.String str = iVar3.f252880c;
            if (!(str == null || r26.n0.N(str))) {
                e70.a0 a0Var = this.f252897f;
                if (a0Var == null) {
                    kotlin.jvm.internal.o.o("streamController");
                    throw null;
                }
                ((d83.t0) a0Var).e(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", a17 + "cancelStream: stream released, isThinking:" + iVar3.f252886i);
            }
        }
    }

    public final void Bi(eh0.i iVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        java.lang.String talker = iVar.f252882e;
        boolean z17 = talker == null || talker.length() == 0;
        long j17 = iVar.f252878a;
        if (z17 || j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", "cleanSessions: talker or msgSvrId is empty. talker:" + talker + ", msgSvrId:" + j17);
            return;
        }
        eh0.j jVar = this.f252895d;
        jVar.getClass();
        java.lang.String str = iVar.f252882e;
        if (str != null && (copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) jVar.f252887a.get(str)) != null && copyOnWriteArrayList.remove(iVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "removeSession: talker:%s, msgSvrId:%d, remaining:%d", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(copyOnWriteArrayList.size()));
        }
        java.lang.String a17 = iVar.a();
        long j18 = iVar.f252878a;
        long j19 = iVar.f252879b;
        eh0.e eVar = this.f252896e;
        eVar.getClass();
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) eVar.f252873a.get(talker);
        if (copyOnWriteArrayList2 == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.mm.ui.chatting.component.qp) ((dh0.i) it.next())).r0(talker, j18, j19, a17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyStreamEnd error", new java.lang.Object[0]);
            }
        }
    }

    public java.lang.String Di(java.lang.String talker, long j17, java.lang.String streamTicket, boolean z17) {
        java.lang.String str;
        boolean z18;
        fh0.d dVar;
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(streamTicket, "streamTicket");
        java.lang.String a17 = eh0.q.a(talker, j17, null);
        eh0.i a18 = this.f252895d.a(talker, j17, z17);
        if (a18 != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.Service", a17 + "createAndStartStream: session already exists, skip creating. isThinking:" + z17 + ", existingStreamId:" + a18.f252880c);
            return a18.f252880c;
        }
        e70.a0 a0Var = this.f252897f;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("streamController");
            throw null;
        }
        d83.t0 t0Var = (d83.t0) a0Var;
        t0Var.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkStreamController", "createDownStream businessType: 10");
        if (t0Var.f227022b == null) {
            synchronized (t0Var) {
                if (t0Var.f227022b == null) {
                    t0Var.f227022b = com.tencent.wechat.aff.ilink_stream.p.f217294b.d(t0Var.f227021a);
                    t0Var.f227027g.set(false);
                }
            }
        }
        d83.t0.a(t0Var);
        com.tencent.wechat.aff.ilink_stream.o oVar = t0Var.f227022b;
        if (oVar != null) {
            java.lang.String a19 = oVar.a(10, null, streamTicket, new com.tencent.wechat.aff.ilink_stream.h());
            t0Var.f227023c.put(a19, new d83.h0(10, null, 0L, null, null, new d83.i0(a19, t0Var), 30, null));
            str = a19;
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", a17.concat("createDownStream: streamId is empty"));
            return null;
        }
        java.lang.String streamId = str;
        eh0.i iVar = new eh0.i(j17, 0L, str, streamTicket, talker, 0L, null, null, z17, com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX, null);
        e70.a0 a0Var2 = this.f252897f;
        if (a0Var2 == null) {
            kotlin.jvm.internal.o.o("streamController");
            throw null;
        }
        kotlin.jvm.internal.o.g(streamId, "streamId");
        d83.h0 h0Var = (d83.h0) ((d83.t0) a0Var2).f227023c.get(streamId);
        if (h0Var != null) {
            h0Var.f226972c = 60000L;
        }
        e70.a0 a0Var3 = this.f252897f;
        if (a0Var3 == null) {
            kotlin.jvm.internal.o.o("streamController");
            throw null;
        }
        ((d83.t0) a0Var3).b(streamId, new eh0.l(this, iVar));
        fh0.k kVar = fh0.k.f262530a;
        if (fh0.k.f262533d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            sb6.append('_');
            sb6.append(z17);
            java.lang.String sb7 = sb6.toString();
            z18 = z17;
            fh0.k.f262534e.put(sb7, new fh0.b(j17, z17, null, 0, null, 28, null));
            kVar.a();
            dVar = new fh0.d(sb7);
        } else {
            z18 = z17;
            dVar = null;
        }
        if (dVar != null) {
            e70.a0 a0Var4 = this.f252897f;
            if (a0Var4 == null) {
                kotlin.jvm.internal.o.o("streamController");
                throw null;
            }
            ((d83.t0) a0Var4).b(streamId, dVar);
        }
        eh0.j jVar = this.f252895d;
        jVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = jVar.f252887a;
        java.lang.Object obj = concurrentHashMap.get(talker);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(talker, (obj = new java.util.concurrent.CopyOnWriteArrayList()))) != null) {
            obj = putIfAbsent;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) obj).add(iVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "addSession: added session for talker:%s, msgSvrId:%d", talker, java.lang.Long.valueOf(iVar.f252878a));
        eh0.g.f252875a.c(Ni(talker, j17), iVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", a17 + "createAndStartStream: stream created success, streamId:" + streamId + ", isThinking:" + z18 + ", streamTicket:" + streamTicket);
        return streamId;
    }

    public final java.lang.String Ni(java.lang.String str, long j17) {
        return str + '_' + j17;
    }

    public boolean Ri(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        java.lang.String b17 = eh0.k.f252888a.b(talker, j17);
        return !(b17 == null || r26.n0.N(b17));
    }

    public boolean Ui(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        return this.f252895d.a(talker, j17, false) != null;
    }

    public boolean Vi(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        return this.f252895d.a(talker, j17, true) != null;
    }

    public final void Zi(eh0.i iVar) {
        java.lang.String str = iVar.f252882e;
        long j17 = iVar.f252878a;
        java.lang.String a17 = eh0.q.a(str, j17, iVar.f252880c);
        boolean z17 = iVar.f252886i;
        if (z17 && iVar.f252879b > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", a17 + "updateMsgInfoContent: thinking stream, msg already exists (msgId=" + iVar.f252879b + "), skip");
            return;
        }
        java.lang.String a18 = iVar.a();
        if (a18.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", a17.concat("updateMsgInfoContent: content is empty, skip update"));
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String str2 = iVar.f252882e;
        com.tencent.mm.storage.f9 l17 = e0Var.l(str2, j17);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.Service", a17.concat("updateMsgInfoContent: msgInfo not found, creating new one"));
            l17 = new com.tencent.mm.storage.f9();
            l17.o1(j17);
            l17.u1(str2);
            l17.setType(16777265);
            l17.j1(0);
            l17.r1(3);
            l17.e1(c01.w9.o(str2));
        }
        if (!z17) {
            v05.b bVar = new v05.b();
            int i17 = bVar.f368365d;
            bVar.set(i17 + 2, a18);
            bVar.set(i17 + 6, 1);
            l17.d1(bVar.toXml());
        }
        try {
            long msgId = l17.getMsgId();
            if (l17.getMsgId() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", a17.concat("updateMsgInfoContent: msgId is 0, skip update"));
            } else if (!z17) {
                e0Var.s(l17.Q0(), l17.getMsgId(), l17);
            }
            iVar.f252879b = msgId;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeClawStream.Service", e17, a17.concat("updateMsgInfoContent: failed to save message"), new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", "onAccountInitialized");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new eh0.m(this, null), 1, null);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", "onAccountReleased");
        this.f252895d.f252887a.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.StreamSessionManager", "clear: all sessions cleared");
        this.f252896e.f252873a.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.StreamListenerManager", "clear: all listeners cleared");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
    }
}
