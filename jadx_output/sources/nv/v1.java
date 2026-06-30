package nv;

@j95.b
/* loaded from: classes5.dex */
public final class v1 extends i95.w implements mv.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.PriorityQueue f340401d = new java.util.PriorityQueue(20, nv.s1.f340388d);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f340402e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public boolean f340403f;

    public synchronized long Ai() {
        mv.e0 e0Var;
        synchronized (this.f340401d) {
            e0Var = (mv.e0) this.f340401d.peek();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.TaskStatusService", "[getIntentByInfo] topInfo=" + e0Var);
        if (e0Var == null) {
            return -1L;
        }
        return e0Var.f331494a;
    }

    public final void Bi(long j17, java.lang.String transferStats, int i17) {
        boolean z17;
        java.lang.Object obj;
        mv.e0 e0Var;
        kotlin.jvm.internal.o.g(transferStats, "transferStats");
        synchronized (this.f340401d) {
            java.util.Iterator it = this.f340401d.iterator();
            while (true) {
                z17 = true;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((mv.e0) obj).f331494a == j17) {
                        break;
                    }
                }
            }
            mv.e0 e0Var2 = (mv.e0) obj;
            if (e0Var2 == null) {
                return;
            }
            mv.f0 f0Var = e0Var2.f331496c;
            if (f0Var != mv.f0.f331504g && f0Var != mv.f0.f331506i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackup.TaskStatusService", "Denied to update progress for info=" + e0Var2);
                return;
            }
            e0Var2.f331498e = i17;
            if (this.f340403f) {
                transferStats = "";
            }
            e0Var2.f331499f = transferStats;
            synchronized (this) {
                synchronized (this.f340401d) {
                    e0Var = (mv.e0) this.f340401d.peek();
                }
                if (e0Var == null || e0Var.f331494a != j17) {
                    z17 = false;
                }
                if (z17) {
                    java.util.Iterator it6 = this.f340402e.iterator();
                    while (it6.hasNext()) {
                        ((mv.z) it6.next()).a(e0Var);
                    }
                }
            }
        }
    }

    public final void Di(long j17, mv.h0 taskType, mv.f0 status, java.lang.String summary) {
        mv.e0 e0Var;
        kotlin.jvm.internal.o.g(taskType, "taskType");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(summary, "summary");
        if (status == mv.f0.f331501d) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackup.TaskStatusService", "use removeStateByPkgId() instead push NORMAL info. pkgId=" + j17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.TaskStatusService", "setSettingsDisplay, " + j17 + ", " + taskType + ", " + status + ", " + summary);
        synchronized (this.f340401d) {
            mv.e0 e0Var2 = (mv.e0) fo1.f.a(this.f340401d, new nv.t1(j17));
            e0Var = new mv.e0(j17, taskType, status, summary, (nv.r1.f340387a[status.ordinal()] == 1 || e0Var2 == null) ? 0 : e0Var2.f331498e, "", java.lang.System.currentTimeMillis());
        }
        wi(e0Var);
    }

    public synchronized void Ni(mv.z listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f340402e.add(listener);
    }

    public synchronized void Ri(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.TaskStatusService", "Remove state by packageId=" + j17);
        synchronized (this.f340401d) {
            java.lang.Object a17 = fo1.f.a(this.f340401d, new nv.u1(j17));
            if (a17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.TaskStatusService", "Fail to find info by pkgId=" + j17);
                return;
            }
            mv.e0 e0Var = (mv.e0) this.f340401d.poll();
            if (e0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.TaskStatusService", "Remove state by packageId=" + j17 + ", topInfo=" + e0Var);
                wi(e0Var);
            } else {
                mv.h0 h0Var = ((mv.e0) a17).f331495b;
                if (h0Var == null) {
                    h0Var = mv.h0.f331511g;
                }
                mv.e0 e0Var2 = new mv.e0(j17, h0Var, mv.f0.f331501d, "", 0, "", 0L);
                java.util.Iterator it = this.f340402e.iterator();
                while (it.hasNext()) {
                    ((mv.z) it.next()).a(e0Var2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: all -> 0x0070, LOOP:0: B:18:0x005b->B:20:0x0061, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0005, B:8:0x001c, B:9:0x001d, B:11:0x0027, B:17:0x0032, B:18:0x005b, B:20:0x0061, B:28:0x006e, B:29:0x006f, B:7:0x0006), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void wi(mv.e0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "doStatusNotify, newTop="
            monitor-enter(r6)
            java.util.PriorityQueue r1 = r6.f340401d     // Catch: java.lang.Throwable -> L70
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L70
            java.util.PriorityQueue r2 = r6.f340401d     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.peek()     // Catch: java.lang.Throwable -> L6d
            mv.e0 r2 = (mv.e0) r2     // Catch: java.lang.Throwable -> L6d
            java.util.PriorityQueue r3 = r6.f340401d     // Catch: java.lang.Throwable -> L6d
            r3.offer(r7)     // Catch: java.lang.Throwable -> L6d
            java.util.PriorityQueue r7 = r6.f340401d     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = r7.peek()     // Catch: java.lang.Throwable -> L6d
            kotlin.jvm.internal.o.d(r7)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L70
            mv.e0 r7 = (mv.e0) r7     // Catch: java.lang.Throwable -> L70
            mv.f0 r1 = r7.f331496c     // Catch: java.lang.Throwable -> L70
            mv.f0 r3 = mv.f0.f331504g     // Catch: java.lang.Throwable -> L70
            r4 = 0
            r5 = 1
            if (r1 == r3) goto L2e
            mv.f0 r3 = mv.f0.f331506i     // Catch: java.lang.Throwable -> L70
            if (r1 != r3) goto L2c
            goto L2e
        L2c:
            r1 = r4
            goto L2f
        L2e:
            r1 = r5
        L2f:
            if (r1 != 0) goto L32
            r4 = r5
        L32:
            r6.f340403f = r4     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "MicroMsg.RoamBackup.TaskStatusService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L70
            r4.append(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = ", oldTop="
            r4.append(r0)     // Catch: java.lang.Throwable -> L70
            r4.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = ", showProgress="
            r4.append(r0)     // Catch: java.lang.Throwable -> L70
            r4.append(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L70
            com.tencent.mars.xlog.Log.i(r3, r0)     // Catch: java.lang.Throwable -> L70
            java.util.HashSet r0 = r6.f340402e     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L70
        L5b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L70
            mv.z r1 = (mv.z) r1     // Catch: java.lang.Throwable -> L70
            r1.a(r7)     // Catch: java.lang.Throwable -> L70
            goto L5b
        L6b:
            monitor-exit(r6)
            return
        L6d:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L70
            throw r7     // Catch: java.lang.Throwable -> L70
        L70:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nv.v1.wi(mv.e0):void");
    }
}
