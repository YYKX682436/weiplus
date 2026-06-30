package ni3;

/* loaded from: classes10.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public fc2.c f337526b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f337527c;

    /* renamed from: e, reason: collision with root package name */
    public int f337529e;

    /* renamed from: f, reason: collision with root package name */
    public int f337530f;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.monitor.FinderStreamVideoLoadStrategyMonitor$finderCdnTaskEvent$1 f337537m;

    /* renamed from: n, reason: collision with root package name */
    public final ni3.z0 f337538n;

    /* renamed from: o, reason: collision with root package name */
    public final ni3.x0 f337539o;

    /* renamed from: a, reason: collision with root package name */
    public final ni3.o1 f337525a = new ni3.o1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f337528d = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f337531g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f337532h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f337533i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ni3.b1 f337534j = new ni3.b1();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f337535k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ni3.w0 f337536l = new ni3.w0(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.monitor.FinderStreamVideoLoadStrategyMonitor$finderCdnTaskEvent$1] */
    public a1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f337537m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCdnTaskEvent>(a0Var) { // from class: com.tencent.mm.plugin.monitor.FinderStreamVideoLoadStrategyMonitor$finderCdnTaskEvent$1
            {
                this.__eventId = 977534942;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderCdnTaskEvent finderCdnTaskEvent) {
                com.tencent.mm.autogen.events.FinderCdnTaskEvent event = finderCdnTaskEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.na naVar = event.f54257g;
                if (naVar.f7414a == 1) {
                    dn.o oVar = naVar.f7415b;
                    boolean z17 = oVar instanceof cs2.l;
                    ni3.a1 a1Var = ni3.a1.this;
                    if (z17) {
                        kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.preload.video.VideoOnlinePlayCdnTask");
                        cs2.l lVar = (cs2.l) oVar;
                        a1Var.getClass();
                        ni3.p0 f17 = a1Var.f(lVar.f222077d2);
                        if (f17 != null) {
                            ni3.o0 o0Var = f17.f337671b;
                            int i17 = lVar.f222078e2;
                            o0Var.f337650d = i17;
                            so2.j5 j5Var = f17.f337670a;
                            o0Var.a(hc2.b0.h(j5Var, false, 1, null));
                            java.lang.String videoFlag = lVar.X1;
                            kotlin.jvm.internal.o.f(videoFlag, "videoFlag");
                            o0Var.f337652f = videoFlag;
                            ni3.r0 r0Var = f17.f337672c;
                            java.lang.String field_mediaId = lVar.field_mediaId;
                            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                            r0Var.getClass();
                            r0Var.f337719a = field_mediaId;
                            ni3.r0 r0Var2 = f17.f337672c;
                            java.lang.String field_fullpath = lVar.field_fullpath;
                            kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
                            r0Var2.getClass();
                            r0Var2.f337720b = field_fullpath;
                            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", "onOnlinePlayTaskCreate ".concat(a1Var.e(i17, j5Var)));
                        }
                    } else if (oVar instanceof cs2.p) {
                        kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.preload.video.VideoPreloadCdnTask");
                        cs2.p pVar = (cs2.p) oVar;
                        a1Var.getClass();
                        ni3.p0 f18 = a1Var.f(pVar.f222089f2);
                        if (f18 != null) {
                            int i18 = pVar.f222094k2;
                            ni3.o0 o0Var2 = f18.f337671b;
                            o0Var2.f337650d = i18;
                            so2.j5 j5Var2 = f18.f337670a;
                            o0Var2.a(hc2.b0.h(j5Var2, false, 1, null));
                            o0Var2.f337652f = pVar.f222088e2.g();
                            ni3.r0 r0Var3 = f18.f337672c;
                            r0Var3.getClass();
                            java.lang.String str = pVar.f222092i2;
                            kotlin.jvm.internal.o.g(str, "<set-?>");
                            r0Var3.f337719a = str;
                            ni3.r0 r0Var4 = f18.f337672c;
                            java.lang.String field_fullpath2 = pVar.field_fullpath;
                            kotlin.jvm.internal.o.f(field_fullpath2, "field_fullpath");
                            r0Var4.getClass();
                            r0Var4.f337720b = field_fullpath2;
                            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", "onPreloadTaskCreate " + a1Var.e(pVar.f222094k2, j5Var2) + ' ' + pVar);
                        }
                    }
                }
                return false;
            }
        };
        this.f337538n = new ni3.z0(this);
        this.f337539o = new ni3.x0(this);
    }

    public static final ni3.n0 a(ni3.a1 a1Var, int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a1Var.f337535k;
        ni3.n0 n0Var = (ni3.n0) concurrentHashMap.get(valueOf);
        if (n0Var != null) {
            return n0Var;
        }
        ni3.n0 n0Var2 = new ni3.n0(i17, 0L, 0L, 0);
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), n0Var2);
        return n0Var2;
    }

    public final java.lang.String b(int i17, int i18) {
        java.lang.String format = java.lang.String.format("%.2f%% [" + i17 + '/' + i18 + ']', java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((i17 / i18) * 100)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public final java.util.Map c(java.util.Map map, java.util.Map map2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            ni3.p0 p0Var = (ni3.p0) entry.getValue();
            if (!kotlin.jvm.internal.o.b(map2.get(java.lang.Long.valueOf(longValue)), p0Var)) {
                concurrentHashMap.put(java.lang.Long.valueOf(longValue), p0Var);
            }
        }
        return concurrentHashMap;
    }

    public final java.lang.String d(int i17, cw2.wa waVar) {
        if (waVar != null) {
            java.lang.String str = i17 + '.' + hc2.b0.k(waVar.f224099f.getDescription(), 0, 0, 3, null) + '.' + waVar.f224098e.g();
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final java.lang.String e(int i17, so2.j5 j5Var) {
        java.lang.String d17;
        return (j5Var == null || (d17 = hc2.b0.d(j5Var, i17)) == null) ? "" : d17;
    }

    public final ni3.p0 f(long j17) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = this.f337527c;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f337531g;
        i("getFeedLife", dataBuffer, concurrentHashMap);
        return (ni3.p0) concurrentHashMap.get(java.lang.Long.valueOf(j17));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(kw2.d0 r17) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni3.a1.g(kw2.d0):void");
    }

    public final java.lang.String h(java.lang.String str, java.util.Map map, java.util.Map map2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append((char) 65306);
        sb6.append(b(map.size(), map2.size()));
        sb6.append(' ');
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((ni3.p0) ((java.util.Map.Entry) it.next()).getValue()).toString());
        }
        sb6.append(kz5.n0.g0(arrayList, " ", null, null, 0, null, null, 62, null));
        sb6.append(" \n");
        return sb6.toString();
    }

    public final void i(java.lang.String str, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        long j17;
        if (dataBuffer.size() != concurrentHashMap.size() && kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncSourceList2SourceLife begin ");
            sb6.append(str);
            sb6.append(' ');
            sb6.append(dataBuffer.size());
            java.lang.String str2 = " --> ";
            sb6.append(" --> ");
            sb6.append(concurrentHashMap.size());
            sb6.append(' ');
            sb6.append(this);
            java.lang.String str3 = "FinderStreamVideoLoadStrategyMonitor";
            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
            java.util.Iterator it = dataBuffer.iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (!concurrentHashMap.containsKey(java.lang.Long.valueOf(j5Var.getItemId()))) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j5Var.getItemId());
                    java.util.Iterator it6 = it;
                    ni3.o0 o0Var = new ni3.o0(this.f337528d, this.f337529e, this.f337530f, dataBuffer.indexOf(j5Var), hc2.b0.h(j5Var, false, 1, null), "NIL-SPEC", "");
                    ni3.r0 r0Var = new ni3.r0("", "", false, -1L, -1L, -1L, -1L, -1L, -1L, -1L);
                    if (j5Var instanceof so2.u1) {
                        r45.hl2 client_local_buffer = ((so2.u1) j5Var).getFeedObject().getFeedObject().getClient_local_buffer();
                        j17 = client_local_buffer != null ? client_local_buffer.getLong(0) : c01.id.c();
                    } else {
                        j17 = -1;
                    }
                    concurrentHashMap.put(valueOf, new ni3.p0(j5Var, o0Var, r0Var, new ni3.q0(j17, -1L, -1L, -1L, 0L), false, false, new ni3.s0(false, false, -1, new ni3.t0(0L, 0)), new ni3.s0(false, false, -1, new ni3.t0(0L, 0)), new ni3.s0(false, false, -1, new ni3.t0(0L, 0))));
                    str2 = str2;
                    str3 = str3;
                    it = it6;
                }
            }
            com.tencent.mars.xlog.Log.i(str3, "syncSourceList2SourceLife end " + str + ' ' + dataBuffer.size() + str2 + concurrentHashMap.size() + ' ' + this);
        }
    }
}
