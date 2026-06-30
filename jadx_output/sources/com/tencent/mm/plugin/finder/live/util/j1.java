package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class j1 implements com.tencent.mm.plugin.finder.live.util.o1 {

    /* renamed from: l, reason: collision with root package name */
    public static final int f115566l = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L1).getValue()).r()).intValue();

    /* renamed from: m, reason: collision with root package name */
    public static final int f115567m = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.M1).getValue()).r()).intValue();

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f115568a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f115569b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f115570c;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f115572e;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f115578k;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f115571d = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f115573f = kotlinx.coroutines.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f115574g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Vector f115575h = new java.util.Vector();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f115576i = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f115577j = kotlinx.coroutines.sync.l.a(false, 1, null);

    public j1() {
        java.lang.String str = "Finder.GiftQueueImpl@" + hashCode();
        this.f115578k = str;
        this.f115568a = new java.util.LinkedList();
        this.f115569b = new byte[0];
        this.f115570c = new java.util.concurrent.CopyOnWriteArraySet();
        this.f115572e = new java.util.concurrent.CopyOnWriteArraySet();
        com.tencent.mars.xlog.Log.i(str, "MAX_SIZE:" + f115566l + ",COMBOID_LIVE_TIME:" + f115567m);
    }

    public boolean a(java.util.Collection collection) {
        java.util.List<com.tencent.mm.plugin.finder.live.util.l1> S0;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        boolean contains;
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.live.util.l1 l1Var = (com.tencent.mm.plugin.finder.live.util.l1) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f115589d.getString(2))) {
                if (!kz5.n0.O(this.f115572e, l1Var.f115589d.getString(2))) {
                    java.lang.String str2 = l1Var.f115593h;
                    if (str2 == null) {
                        contains = false;
                    } else {
                        contains = this.f115575h.contains(str2);
                        if (contains) {
                            com.tencent.mars.xlog.Log.i(this.f115578k, "skipComboId:".concat(str2));
                        }
                    }
                    if (!contains) {
                        java.lang.String string = l1Var.f115589d.getString(2);
                        if (string != null) {
                            ((java.util.concurrent.CopyOnWriteArraySet) this.f115572e).add(string);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f115578k, "addAll: duplicate client_msg_id:" + l1Var.f115589d.getString(2));
                it.remove();
            }
        }
        synchronized (this.f115569b) {
            com.tencent.mars.xlog.Log.i(this.f115578k, "addAll: incrementMsgId = " + this.f115571d + ", list size = " + this.f115568a.size() + ", collection size = " + collection.size() + ", observerSetSize:" + ((java.util.concurrent.CopyOnWriteArraySet) this.f115570c).size());
            int size = collection.size();
            int i17 = f115566l;
            if (size > i17) {
                com.tencent.mars.xlog.Log.i(this.f115578k, "addAll: oversize, drop origin collection:" + kz5.n0.L0(kz5.n0.S0(collection), collection.size() - i17));
                S0 = kz5.n0.K0(collection, i17);
            } else {
                S0 = kz5.n0.S0(collection);
            }
            if (this.f115568a.size() + S0.size() > i17) {
                java.lang.String str3 = this.f115578k;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("offer: oversize, drop list:");
                java.util.LinkedList linkedList = this.f115568a;
                sb6.append(kz5.n0.L0(linkedList, (linkedList.size() + S0.size()) - i17));
                com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                java.util.LinkedList linkedList2 = this.f115568a;
                this.f115568a = new java.util.LinkedList(kz5.n0.S(linkedList2, (linkedList2.size() + S0.size()) - i17));
            }
            for (com.tencent.mm.plugin.finder.live.util.l1 l1Var2 : S0) {
                l1Var2.f115591f = this.f115571d.getAndIncrement();
                java.lang.String str4 = l1Var2.f115593h;
                if (str4 == null) {
                    str4 = "";
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r45.xn1 xn1Var = (r45.xn1) l1Var2.f115589d.getCustom(13);
                if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact.getNickname()) == null) {
                    str = "";
                }
                kotlinx.coroutines.l.d(this.f115573f, null, null, new com.tencent.mm.plugin.finder.live.util.h1(this, new com.tencent.mm.plugin.finder.live.util.n1(str4, currentTimeMillis, str), null), 3, null);
            }
            this.f115568a.addAll(S0);
            kz5.g0.s(this.f115568a);
        }
        com.tencent.mm.plugin.finder.live.util.m1 d17 = d();
        if (d17 != null) {
            java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) this.f115570c).iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.util.k1) it6.next()).N(d17, S0);
            }
        }
        return true;
    }

    public void b(ug2.f msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        synchronized (this.f115569b) {
            msg.a(this.f115571d.getAndIncrement());
            if (msg.priority() == ug2.d.f427519d) {
                this.f115574g.addLast(msg);
            } else {
                this.f115574g.addFirst(msg);
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f115570c).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.live.util.k1) it.next()).y();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r1.b() == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ug2.f c(ug2.e r8, java.lang.Long r9) {
        /*
            r7 = this;
            java.lang.String r0 = "slot"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.Object r0 = r7.f115569b
            monitor-enter(r0)
            java.util.LinkedList r1 = r7.f115574g     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = kz5.n0.k0(r1)     // Catch: java.lang.Throwable -> L70
            ug2.f r1 = (ug2.f) r1     // Catch: java.lang.Throwable -> L70
            r2 = 0
            if (r1 == 0) goto L4b
            ug2.d r3 = r1.priority()     // Catch: java.lang.Throwable -> L70
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L42
            r4 = 1
            if (r3 == r4) goto L39
            r4 = 2
            if (r3 == r4) goto L24
            goto L49
        L24:
            ug2.e r3 = r1.b()     // Catch: java.lang.Throwable -> L70
            if (r3 != r8) goto L49
            if (r9 == 0) goto L4a
            long r3 = r1.c()     // Catch: java.lang.Throwable -> L70
            long r5 = r9.longValue()     // Catch: java.lang.Throwable -> L70
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L49
            goto L4a
        L39:
            if (r9 != 0) goto L49
            ug2.e r3 = r1.b()     // Catch: java.lang.Throwable -> L70
            if (r3 != r8) goto L49
            goto L4a
        L42:
            ug2.e r3 = r1.b()     // Catch: java.lang.Throwable -> L70
            if (r3 != r8) goto L49
            goto L4a
        L49:
            r1 = r2
        L4a:
            r2 = r1
        L4b:
            monitor-exit(r0)
            java.lang.String r0 = r7.f115578k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[findNextExtraMsg] slot:"
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = ", nextGiftIncId:"
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = ", result:"
            r1.append(r8)
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r8)
            return r2
        L70:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.j1.c(ug2.e, java.lang.Long):ug2.f");
    }

    public com.tencent.mm.plugin.finder.live.util.m1 d() {
        com.tencent.mm.plugin.finder.live.util.m1 m1Var;
        synchronized (this.f115569b) {
            com.tencent.mm.plugin.finder.live.util.l1 l1Var = (com.tencent.mm.plugin.finder.live.util.l1) this.f115568a.peekFirst();
            m1Var = l1Var != null ? l1Var.f115590e : null;
        }
        return m1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.tencent.mm.plugin.finder.live.util.e1
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.finder.live.util.e1 r0 = (com.tencent.mm.plugin.finder.live.util.e1) r0
            int r1 = r0.f115489g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115489g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.finder.live.util.e1 r0 = new com.tencent.mm.plugin.finder.live.util.e1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f115487e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f115489g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f115486d
            kotlin.jvm.internal.h0 r7 = (kotlin.jvm.internal.h0) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlin.jvm.internal.h0 r8 = new kotlin.jvm.internal.h0
            r8.<init>()
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310570c
            com.tencent.mm.plugin.finder.live.util.f1 r4 = new com.tencent.mm.plugin.finder.live.util.f1
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.f115486d = r8
            r0.f115489g = r3
            java.lang.Object r7 = kotlinx.coroutines.l.g(r2, r4, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r7 = r8
        L4f:
            java.lang.Object r7 = r7.f310123d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.j1.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean f() {
        boolean z17;
        synchronized (this.f115569b) {
            z17 = !this.f115574g.isEmpty();
        }
        return z17;
    }

    public boolean g(com.tencent.mm.plugin.finder.live.util.l1 l1Var) {
        boolean contains;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (l1Var == null) {
            return false;
        }
        java.lang.String str2 = l1Var.f115593h;
        if (str2 == null) {
            contains = false;
        } else {
            contains = this.f115575h.contains(str2);
            if (contains) {
                com.tencent.mars.xlog.Log.i(this.f115578k, "skipComboId:".concat(str2));
            }
        }
        if (contains) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f115589d.getString(2))) {
            if (kz5.n0.O(this.f115572e, l1Var.f115589d.getString(2))) {
                com.tencent.mars.xlog.Log.i(this.f115578k, "offer: duplicate client_msg_id:" + l1Var.f115589d.getString(2));
                return false;
            }
            java.lang.String string = l1Var.f115589d.getString(2);
            if (string != null) {
                ((java.util.concurrent.CopyOnWriteArraySet) this.f115572e).add(string);
            }
        }
        synchronized (this.f115569b) {
            com.tencent.mars.xlog.Log.i(this.f115578k, "offer: incrementMsgId = " + this.f115571d + ", size = " + this.f115568a.size());
            int size = this.f115568a.size();
            int i17 = f115566l;
            if (size >= i17 && i17 >= 1) {
                java.lang.String str3 = this.f115578k;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("offer: oversize, drop:");
                java.util.LinkedList linkedList = this.f115568a;
                sb6.append(kz5.n0.L0(linkedList, (linkedList.size() - i17) + 1));
                com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                this.f115568a = new java.util.LinkedList(kz5.n0.K0(this.f115568a, i17 - 1));
            }
            l1Var.f115591f = this.f115571d.getAndIncrement();
            this.f115568a.offerLast(l1Var);
            kz5.g0.s(this.f115568a);
            java.lang.String str4 = l1Var.f115593h;
            if (str4 == null) {
                str4 = "";
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r45.xn1 xn1Var = (r45.xn1) l1Var.f115589d.getCustom(13);
            if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact.getNickname()) == null) {
                str = "";
            }
            kotlinx.coroutines.l.d(this.f115573f, null, null, new com.tencent.mm.plugin.finder.live.util.h1(this, new com.tencent.mm.plugin.finder.live.util.n1(str4, currentTimeMillis, str), null), 3, null);
        }
        com.tencent.mm.plugin.finder.live.util.m1 d17 = d();
        if (d17 != null) {
            java.util.List c17 = kz5.b0.c(l1Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f115570c).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.util.k1) it.next()).N(d17, c17);
            }
        }
        return true;
    }

    public com.tencent.mm.plugin.finder.live.util.l1 h(java.lang.String comboId) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.live.util.l1 l1Var;
        kotlin.jvm.internal.o.g(comboId, "comboId");
        synchronized (this.f115569b) {
            java.util.Iterator it = this.f115568a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (comboId.equals(((com.tencent.mm.plugin.finder.live.util.l1) obj).f115593h)) {
                    break;
                }
            }
            l1Var = (com.tencent.mm.plugin.finder.live.util.l1) obj;
        }
        return l1Var;
    }

    public com.tencent.mm.plugin.finder.live.util.l1 i(java.lang.String targetUserName) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.live.util.l1 l1Var;
        kotlin.jvm.internal.o.g(targetUserName, "targetUserName");
        synchronized (this.f115569b) {
            java.util.Iterator it = this.f115568a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (targetUserName.equals(((com.tencent.mm.plugin.finder.live.util.l1) obj).f115601s)) {
                    break;
                }
            }
            l1Var = (com.tencent.mm.plugin.finder.live.util.l1) obj;
        }
        return l1Var;
    }

    public com.tencent.mm.plugin.finder.live.util.l1 j(java.lang.String targetUserName) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.live.util.l1 l1Var;
        kotlin.jvm.internal.o.g(targetUserName, "targetUserName");
        synchronized (this.f115569b) {
            java.util.Iterator it = this.f115568a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.tencent.mm.plugin.finder.live.util.l1 l1Var2 = (com.tencent.mm.plugin.finder.live.util.l1) obj;
                if (kotlin.jvm.internal.o.b(l1Var2.f115596n, "PRECIOUS_GIFT_SCHEDULE_NONE") && targetUserName.equals(l1Var2.f115601s)) {
                    break;
                }
            }
            l1Var = (com.tencent.mm.plugin.finder.live.util.l1) obj;
        }
        return l1Var;
    }

    public com.tencent.mm.plugin.finder.live.util.l1 k(java.lang.String comboId) {
        com.tencent.mm.plugin.finder.live.util.l1 h17;
        kotlin.jvm.internal.o.g(comboId, "comboId");
        synchronized (this.f115569b) {
            h17 = h(comboId);
            if (h17 != null) {
                this.f115568a.remove(h17);
            }
        }
        return h17;
    }

    public void l(com.tencent.mm.plugin.finder.live.util.k1 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("registerObserver ");
        sb6.append(observer);
        sb6.append("  ");
        java.util.Set set = this.f115570c;
        sb6.append(((java.util.concurrent.CopyOnWriteArraySet) set).size());
        sb6.append(' ');
        sb6.append(j40.o.f297604a.b());
        com.tencent.mars.xlog.Log.i(this.f115578k, sb6.toString());
        ((java.util.concurrent.CopyOnWriteArraySet) set).add(observer);
    }

    public void m(ug2.f msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        synchronized (this.f115569b) {
            com.tencent.mars.xlog.Log.i(this.f115578k, "[removeExtraMsg] msg:" + msg);
            this.f115574g.remove(msg);
        }
    }

    public void n(com.tencent.mm.plugin.finder.live.util.k1 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unregisterObserver ");
        sb6.append(observer);
        sb6.append("  ");
        java.util.Set set = this.f115570c;
        sb6.append(((java.util.concurrent.CopyOnWriteArraySet) set).size());
        sb6.append(' ');
        sb6.append(j40.o.f297604a.b());
        com.tencent.mars.xlog.Log.i(this.f115578k, sb6.toString());
        ((java.util.concurrent.CopyOnWriteArraySet) set).remove(observer);
    }
}
