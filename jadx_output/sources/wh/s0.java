package wh;

/* loaded from: classes12.dex */
public abstract class s0 {

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f445862i;

    /* renamed from: a, reason: collision with root package name */
    public long f445863a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f445864b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f445865c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f445866d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f445867e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f445868f;

    /* renamed from: g, reason: collision with root package name */
    public final wh.s f445869g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f445870h;

    static {
        new wh.u(null);
        f445862i = jz5.h.a(jz5.i.f302829d, wh.t.f445872d);
    }

    public s0(wh.s collector, android.os.Handler handler) {
        kotlin.jvm.internal.o.g(collector, "collector");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f445869g = collector;
        this.f445870h = handler;
        jz5.i iVar = jz5.i.f302829d;
        this.f445864b = jz5.h.a(iVar, wh.q0.f445857d);
        this.f445865c = jz5.h.a(iVar, wh.r0.f445861d);
        this.f445866d = jz5.h.a(iVar, new wh.p0(this));
        this.f445867e = jz5.h.a(iVar, wh.k0.f445823d);
        this.f445868f = jz5.h.b(new wh.m0(this));
    }

    public static java.lang.String e(wh.s0 s0Var, java.util.List list, float f17, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String sb6;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dumpPretty");
        }
        java.util.List tidFilter = (i17 & 1) != 0 ? kz5.p0.f313996d : list;
        float f18 = (i17 & 2) != 0 ? 0.1f : f17;
        boolean z18 = (i17 & 4) != 0 ? false : z17;
        s0Var.getClass();
        kotlin.jvm.internal.o.g(tidFilter, "tidFilter");
        wh.l0 l0Var = wh.l0.f445825a;
        jz5.o oVar = (jz5.o) s0Var.f445865c.getValue();
        java.util.concurrent.atomic.AtomicLong atomicLong = (java.util.concurrent.atomic.AtomicLong) oVar.f302841d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) oVar.f302842e;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = (java.util.concurrent.atomic.AtomicLong) oVar.f302843f;
        long j17 = 0;
        java.lang.Object apply = atomicLong.get() > 0 ? l0Var.apply(java.lang.Long.valueOf(atomicLong.get())) : 0;
        java.lang.Object apply2 = atomicLong2.get() > 0 ? l0Var.apply(java.lang.Long.valueOf(atomicLong2.get())) : 0;
        if (atomicLong.get() > 0 && atomicLong2.get() > 0) {
            j17 = (atomicLong2.get() - atomicLong.get()) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        }
        int i18 = atomicInteger.get();
        wh.j0 c17 = s0Var.c(tidFilter);
        try {
            c17.g();
            e = null;
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        wh.a0 a0Var = new wh.a0();
        a0Var.a(r26.i0.s("*", 40) + " CallStack " + r26.i0.s("*", 40));
        a0Var.a("time: from=" + apply + ", from=" + apply2 + ", duration=" + j17 + "min, count=" + i18);
        synchronized (c17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            jz5.o oVar2 = c17.f445809a;
            java.lang.String line = "counter: java=" + ((java.util.concurrent.atomic.AtomicInteger) oVar2.f302841d).get() + ", native=" + ((java.util.concurrent.atomic.AtomicInteger) oVar2.f302842e).get() + ", miss=" + ((java.util.concurrent.atomic.AtomicInteger) oVar2.f302843f).get();
            kotlin.jvm.internal.o.g(line, "line");
            sb7.append(sb7.length() == 0 ? "" : "\n");
            sb7.append(line);
            java.lang.String line2 = "threads: ".concat(kz5.n0.g0(((java.util.HashMap) c17.f445810b).entrySet(), ", ", null, null, 0, null, wh.i0.f445799d, 30, null));
            kotlin.jvm.internal.o.g(line2, "line");
            sb7.append(sb7.length() == 0 ? "" : "\n");
            sb7.append(line2);
            sb6 = sb7.toString();
            kotlin.jvm.internal.o.f(sb6, "printer.toString()");
        }
        a0Var.a(sb6);
        a0Var.a(r26.i0.s("=", 20));
        a0Var.a(s0Var.h(c17, f18, z18));
        a0Var.a("");
        java.lang.String i19 = s0Var.i(s0Var.c(tidFilter));
        if (i19 == null) {
            i19 = "null";
        }
        a0Var.a(i19);
        a0Var.a(r26.i0.s("*", 91));
        if (e != null) {
            a0Var.a("inspect failed: " + e.getMessage());
            a0Var.a(s0Var.d());
        }
        return a0Var.toString();
    }

    public void a() {
        synchronized (g()) {
            g().clear();
        }
        jz5.o oVar = (jz5.o) this.f445865c.getValue();
        java.util.concurrent.atomic.AtomicLong atomicLong = (java.util.concurrent.atomic.AtomicLong) oVar.f302841d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) oVar.f302842e;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = (java.util.concurrent.atomic.AtomicLong) oVar.f302843f;
        atomicLong.set(0L);
        atomicInteger.set(0);
        atomicLong2.set(0L);
    }

    public void b(java.lang.String threadName, int i17, java.lang.String status, java.lang.String callStack) {
        kotlin.jvm.internal.o.g(threadName, "threadName");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(callStack, "callStack");
        synchronized (g()) {
            java.util.Map g17 = g();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object obj = g17.get(valueOf);
            if (obj == null) {
                obj = new java.util.ArrayList();
                g17.put(valueOf, obj);
            }
            ((java.util.List) obj).add(new jz5.o(threadName, status, callStack));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wh.j0 c(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "tidFilter"
            kotlin.jvm.internal.o.g(r8, r0)
            wh.j0 r0 = new wh.j0
            r0.<init>()
            java.util.Map r1 = r7.g()
            monitor-enter(r1)
            java.util.Map r2 = r7.g()     // Catch: java.lang.Throwable -> L9d
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L9d
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L9b
            java.util.Map r2 = r7.g()     // Catch: java.lang.Throwable -> L9d
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L9d
            r4.<init>()     // Catch: java.lang.Throwable -> L9d
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9d
        L2d:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L9d
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L9d
            boolean r6 = r8.isEmpty()     // Catch: java.lang.Throwable -> L9d
            if (r6 != 0) goto L4c
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L9d
            boolean r6 = r8.contains(r6)     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L4a
            goto L4c
        L4a:
            r6 = 0
            goto L4d
        L4c:
            r6 = r3
        L4d:
            if (r6 == 0) goto L2d
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L9d
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L9d
            goto L2d
        L5b:
            java.util.Set r8 = r4.entrySet()     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L9d
        L63:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L9d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L9d
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L9d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L9d
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9d
        L83:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r4 == 0) goto L63
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L9d
            jz5.o r4 = (jz5.o) r4     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r5 = r4.f302841d     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r4 = r4.f302843f     // Catch: java.lang.Throwable -> L9d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L9d
            r0.a(r5, r3, r4)     // Catch: java.lang.Throwable -> L9d
            goto L83
        L9b:
            monitor-exit(r1)
            return r0
        L9d:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.s0.c(java.util.List):wh.j0");
    }

    public java.lang.String d() {
        java.util.Collection collection;
        wh.a0 a0Var = new wh.a0();
        a0Var.a(r26.i0.s("*", 37) + " CallStack(dump) " + r26.i0.s("*", 37));
        int i17 = 0;
        for (java.lang.Object obj : g().entrySet()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            java.util.List<jz5.o> list = (java.util.List) entry.getValue();
            a0Var.a("dump " + intValue + ':');
            for (jz5.o oVar : list) {
                java.lang.String str = (java.lang.String) oVar.f302841d;
                java.lang.String str2 = (java.lang.String) oVar.f302842e;
                java.lang.String str3 = (java.lang.String) oVar.f302843f;
                a0Var.a("\t" + str + '(' + str2 + "):");
                java.util.List g17 = new r26.t("\n").g(str3, 0);
                if (!g17.isEmpty()) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = kz5.p0.f313996d;
                java.lang.Object[] array = collection.toArray(new java.lang.String[0]);
                if (array == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (java.lang.String str4 : (java.lang.String[]) array) {
                    a0Var.a("\t\t-" + str4);
                }
            }
            if (i17 < g().size() - 1) {
                a0Var.a(r26.i0.s("=", 20));
            }
            i17 = i18;
        }
        a0Var.a(r26.i0.s("*", 91));
        return a0Var.toString();
    }

    public java.util.Map f(boolean z17) {
        java.util.LinkedHashMap linkedHashMap;
        boolean z18;
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String str2;
        synchronized (g()) {
            java.util.Set<java.util.Map.Entry> entrySet = g().entrySet();
            int d17 = kz5.b1.d(kz5.d0.q(entrySet, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            linkedHashMap = new java.util.LinkedHashMap(d17);
            for (java.util.Map.Entry entry : entrySet) {
                int intValue = ((java.lang.Number) entry.getKey()).intValue();
                java.util.List list = (java.util.List) entry.getValue();
                if (!z17) {
                    list = kz5.n0.x0(list);
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                java.util.Iterator it = list.iterator();
                while (true) {
                    z18 = true;
                    str = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (r26.i0.p("R", (java.lang.String) ((jz5.o) obj).f302842e, true)) {
                        break;
                    }
                }
                jz5.o oVar = (jz5.o) obj;
                if (oVar != null && (str2 = (java.lang.String) oVar.f302843f) != null) {
                    if (str2.length() <= 0) {
                        z18 = false;
                    }
                    if (z18) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("RUNNING(");
                        sb6.append(z17 ? "first" : "last");
                        sb6.append(')');
                        str2 = sb6.toString() + (this.f445869g.c(str2) ? " " : "\n") + str2;
                    }
                    str = str2;
                }
                linkedHashMap.put(valueOf, str);
            }
        }
        return linkedHashMap;
    }

    public final java.util.Map g() {
        return (java.util.Map) this.f445867e.getValue();
    }

    public java.lang.String h(wh.j0 analyzer, float f17, boolean z17) {
        java.lang.String a0Var;
        kotlin.jvm.internal.o.g(analyzer, "analyzer");
        if (f17 <= 0 || f17 >= 1) {
            throw new java.lang.IllegalArgumentException("err args: " + f17 + ", " + z17);
        }
        synchronized (analyzer) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(0);
            wh.a0 a0Var2 = new wh.a0();
            wh.f0 f0Var = new wh.f0(a0Var2, atomicInteger2, analyzer, f17, z17);
            java.util.Iterator it = kz5.n0.F0(analyzer.f445811c, new wh.v()).iterator();
            while (it.hasNext()) {
                f0Var.a((wh.z) it.next(), 0, analyzer.f445812d, 40);
            }
            java.lang.String a0Var3 = a0Var2.toString();
            wh.a0 a0Var4 = new wh.a0();
            atomicInteger.set(((java.util.ArrayList) analyzer.f(analyzer.f445811c)).size());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("samples=");
            sb6.append(analyzer.f445812d);
            sb6.append(", nodes=");
            sb6.append(atomicInteger.get());
            sb6.append(", skip=");
            sb6.append(atomicInteger2.get());
            sb6.append('(');
            sb6.append(atomicInteger.get() > 0 ? java.lang.String.valueOf(a06.d.b((atomicInteger2.get() * 100.0f) / atomicInteger.get())) : "_");
            sb6.append("%)");
            a0Var4.a(sb6.toString());
            a0Var4.a("");
            a0Var4.a(a0Var3);
            a0Var = a0Var4.toString();
        }
        return a0Var;
    }

    public java.lang.String i(wh.j0 analyzer) {
        java.lang.String str;
        java.lang.Object next;
        kotlin.jvm.internal.o.g(analyzer, "analyzer");
        synchronized (analyzer) {
            java.util.Iterator it = ((java.util.ArrayList) analyzer.e(analyzer.f445811c)).iterator();
            str = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int d17 = analyzer.d((wh.z) next);
                    do {
                        java.lang.Object next2 = it.next();
                        int d18 = analyzer.d((wh.z) next2);
                        if (d17 < d18) {
                            next = next2;
                            d17 = d18;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            wh.z zVar = (wh.z) next;
            if (zVar != null) {
                java.util.Iterator it6 = ((java.util.ArrayList) analyzer.f(analyzer.f445811c)).iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    i17 += ((wh.z) it6.next()).f445902a;
                }
                int d19 = analyzer.d(zVar);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("HOTTEST_PATH(");
                sb6.append(analyzer.f445812d);
                sb6.append('|');
                java.lang.Object[] objArr = new java.lang.Object[1];
                float f17 = d19 * 100.0f;
                if (i17 < 1) {
                    i17 = 1;
                }
                objArr[0] = java.lang.Float.valueOf(f17 / i17);
                java.lang.String format = java.lang.String.format("%.2f%%", java.util.Arrays.copyOf(objArr, 1));
                kotlin.jvm.internal.o.f(format, "java.lang.String.format(this, *args)");
                sb6.append(format);
                sb6.append(')');
                str = sb6.toString() + '\n' + analyzer.h(zVar);
            }
        }
        return str;
    }

    public java.lang.String j(int i17, boolean z17) {
        synchronized (g()) {
            java.util.List<jz5.o> list = (java.util.List) g().get(java.lang.Integer.valueOf(i17));
            if (list != null) {
                if (!z17) {
                    list = kz5.n0.x0(list);
                }
                for (jz5.o oVar : list) {
                    java.lang.String str = (java.lang.String) oVar.f302842e;
                    java.lang.String str2 = (java.lang.String) oVar.f302843f;
                    boolean z18 = true;
                    if (r26.i0.p("R", str, true)) {
                        if (str2.length() <= 0) {
                            z18 = false;
                        }
                        if (z18) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append("RUNNING(");
                            sb6.append(z17 ? "first" : "last");
                            sb6.append(')');
                            str2 = sb6.toString() + (this.f445869g.c(str2) ? " " : "\n") + str2;
                        }
                        return str2;
                    }
                }
            }
            return null;
        }
    }

    public boolean k() {
        boolean z17;
        synchronized (g()) {
            z17 = this.f445863a > 0;
        }
        return z17;
    }

    public void l(long j17, java.util.List tidList) {
        kotlin.jvm.internal.o.g(tidList, "tidList");
        if (!tidList.isEmpty()) {
            if (k()) {
                throw new java.lang.IllegalStateException("Already sampling!");
            }
            jz5.g gVar = f445862i;
            ((java.util.concurrent.atomic.AtomicInteger) gVar.getValue()).getAndIncrement();
            ((java.util.concurrent.atomic.AtomicLong) ((jz5.o) this.f445865c.getValue()).f302841d).set(java.lang.System.currentTimeMillis());
            oj.j.c("Matrix.CallStackSampler", "#sampling " + ((java.util.concurrent.atomic.AtomicInteger) gVar.getValue()).get() + ": intervalMs=" + j17 + ", threads=" + tidList, new java.lang.Object[0]);
            synchronized (g()) {
                ((java.util.List) this.f445864b.getValue()).clear();
                ((java.util.List) this.f445864b.getValue()).addAll(tidList);
                this.f445870h.postDelayed((java.lang.Runnable) this.f445866d.getValue(), j17);
                this.f445863a = j17;
            }
        }
    }

    public void m() {
        synchronized (g()) {
            if (!k()) {
                throw new java.lang.IllegalStateException("Already stopped!");
            }
            jz5.o oVar = (jz5.o) this.f445865c.getValue();
            java.util.concurrent.atomic.AtomicLong atomicLong = (java.util.concurrent.atomic.AtomicLong) oVar.f302841d;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) oVar.f302842e;
            java.util.concurrent.atomic.AtomicLong atomicLong2 = (java.util.concurrent.atomic.AtomicLong) oVar.f302843f;
            atomicLong2.set(java.lang.System.currentTimeMillis());
            oj.j.c("Matrix.CallStackSampler", "#stop " + ((java.util.concurrent.atomic.AtomicInteger) f445862i.getValue()).get() + ": duration=" + ((atomicLong2.get() - atomicLong.get()) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) + "min, count=" + atomicInteger.get() + ", stacks=" + g().size(), new java.lang.Object[0]);
            ((java.util.List) this.f445864b.getValue()).clear();
            this.f445870h.removeCallbacks((java.lang.Runnable) this.f445866d.getValue());
            this.f445863a = 0L;
        }
    }
}
