package com.tencent.mm.sdk.coroutines.task.group;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/sdk/coroutines/task/group/WorkerPoolWeTaskGroup;", "Lx65/a;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onDestroy", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/y;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public abstract class WorkerPoolWeTaskGroup implements x65.a, androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f192357d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.PriorityBlockingQueue f192358e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f192359f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f192360g;

    /* renamed from: h, reason: collision with root package name */
    public final u26.w f192361h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f192362i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f192363m;

    public WorkerPoolWeTaskGroup(androidx.lifecycle.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f192357d = lifecycleOwner;
        this.f192358e = new java.util.concurrent.PriorityBlockingQueue();
        this.f192359f = new java.util.HashMap();
        this.f192360g = new java.util.HashMap();
        this.f192361h = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        lifecycleOwner.mo133getLifecycle().a(this);
        this.f192363m = jz5.h.b(new x65.m(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[EXC_TOP_SPLITTER, LOOP:1: B:13:0x007e->B:18:0x0091, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0077 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup r7, int r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r8 = r9 instanceof x65.r
            if (r8 == 0) goto L16
            r8 = r9
            x65.r r8 = (x65.r) r8
            int r0 = r8.f452397h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L16
            int r0 = r0 - r1
            r8.f452397h = r0
            goto L1b
        L16:
            x65.r r8 = new x65.r
            r8.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r8.f452395f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f452397h
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L4c
            if (r1 == r2) goto L40
            if (r1 != r3) goto L38
            java.lang.Object r7 = r8.f452394e
            u26.y r7 = (u26.y) r7
            java.lang.Object r1 = r8.f452393d
            com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup r1 = (com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup) r1
            kotlin.ResultKt.throwOnFailure(r9)
        L34:
            r6 = r1
            r1 = r7
            r7 = r6
            goto L7d
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r8.f452394e
            u26.y r7 = (u26.y) r7
            java.lang.Object r1 = r8.f452393d
            com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup r1 = (com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6f
        L4c:
            kotlin.ResultKt.throwOnFailure(r9)
            u26.w r9 = r7.f192361h
            u26.k r9 = (u26.k) r9
            r9.getClass()
            u26.a r1 = new u26.a
            r1.<init>(r9)
        L5b:
            r8.f452393d = r7
            r8.f452394e = r1
            r8.f452397h = r2
            r9 = r1
            u26.a r9 = (u26.a) r9
            java.lang.Object r1 = r9.a(r8)
            if (r1 != r0) goto L6b
            goto Lc3
        L6b:
            r6 = r1
            r1 = r7
            r7 = r9
            r9 = r6
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lc1
            u26.a r7 = (u26.a) r7
            r7.b()
            goto L34
        L7d:
            monitor-enter(r7)
        L7e:
            java.util.concurrent.PriorityBlockingQueue r9 = r7.f192358e     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r9 = r9.poll()     // Catch: java.lang.Throwable -> Lbe
            w65.m r9 = (w65.m) r9     // Catch: java.lang.Throwable -> Lbe
            if (r9 != 0) goto L8b
            monitor-exit(r7)
            r9 = 0
            goto Lae
        L8b:
            boolean r4 = r7.j(r9)     // Catch: java.lang.Throwable -> Lbe
            if (r4 == 0) goto L9b
            java.util.HashMap r4 = r7.f192360g     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r9 = r9.id()     // Catch: java.lang.Throwable -> Lbe
            r4.remove(r9)     // Catch: java.lang.Throwable -> Lbe
            goto L7e
        L9b:
            java.util.HashMap r4 = r7.f192360g     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r9.id()     // Catch: java.lang.Throwable -> Lbe
            r4.remove(r5)     // Catch: java.lang.Throwable -> Lbe
            java.util.HashMap r4 = r7.f192359f     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r9.id()     // Catch: java.lang.Throwable -> Lbe
            r4.put(r5, r9)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r7)
        Lae:
            if (r9 != 0) goto Lb1
            goto L5b
        Lb1:
            r8.f452393d = r7
            r8.f452394e = r1
            r8.f452397h = r3
            java.lang.Object r9 = r7.e(r9, r8)
            if (r9 != r0) goto L7d
            goto Lc3
        Lbe:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        Lc1:
            jz5.f0 r0 = jz5.f0.f302826a
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup.c(com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // x65.a
    public java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        d(str);
        return jz5.f0.f302826a;
    }

    @Override // x65.a
    public java.lang.Object b(w65.m mVar, kotlin.coroutines.Continuation continuation) {
        return k(mVar);
    }

    public final void d(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        synchronized (this) {
            w65.m mVar = (w65.m) this.f192360g.remove(id6);
            if (mVar != null) {
                mVar.x();
            }
            w65.m mVar2 = (w65.m) this.f192359f.get(id6);
            if (mVar2 != null) {
                mVar2.x();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(w65.m r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x65.o
            if (r0 == 0) goto L13
            r0 = r6
            x65.o r0 = (x65.o) r0
            int r1 = r0.f452386h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f452386h = r1
            goto L18
        L13:
            x65.o r0 = new x65.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f452384f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f452386h
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f452383e
            w65.m r5 = (w65.m) r5
            java.lang.Object r0 = r0.f452382d
            com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup r0 = (com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2f
            goto L4a
        L2f:
            r6 = move-exception
            goto L60
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f452382d = r4     // Catch: java.lang.Throwable -> L5e
            r0.f452383e = r5     // Catch: java.lang.Throwable -> L5e
            r0.f452386h = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r4.i(r5, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            monitor-enter(r0)
            java.util.HashMap r6 = r0.f192359f     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = r5.id()     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r6.remove(r5)     // Catch: java.lang.Throwable -> L5b
            w65.m r5 = (w65.m) r5     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        L5b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L5e:
            r6 = move-exception
            r0 = r4
        L60:
            monitor-enter(r0)
            java.util.HashMap r1 = r0.f192359f     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r5.id()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r1.remove(r5)     // Catch: java.lang.Throwable -> L6f
            w65.m r5 = (w65.m) r5     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)
            throw r6
        L6f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup.e(w65.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract java.lang.String f();

    public abstract com.tencent.mm.sdk.coroutines.LifecycleScope g();

    /* renamed from: h */
    public abstract int getF67112n();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(w65.m r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x65.p
            if (r0 == 0) goto L13
            r0 = r6
            x65.p r0 = (x65.p) r0
            int r1 = r0.f452390g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f452390g = r1
            goto L18
        L13:
            x65.p r0 = new x65.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f452388e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f452390g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f452387d
            w65.m r5 = (w65.m) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            x65.q r6 = new x65.q
            r2 = 0
            r6.<init>(r5, r2)
            r0.f452387d = r5
            r0.f452390g = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            w65.g r5 = (w65.g) r5
            r5.l()
            r5.f1()
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup.i(w65.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean j(w65.m mVar) {
        w65.q qVar = ((w65.g) mVar).f443356e;
        return qVar == w65.q.f443371i || qVar == w65.q.f443372m;
    }

    public final w65.m k(w65.m task) {
        kotlin.jvm.internal.o.g(task, "task");
        synchronized (this) {
            w65.m mVar = (w65.m) this.f192359f.get(task.id());
            if (mVar != null && !j(mVar)) {
                ((w65.g) task).k();
                return mVar;
            }
            w65.m mVar2 = (w65.m) this.f192360g.get(task.id());
            if (mVar2 != null && !j(mVar2)) {
                ((w65.g) task).k();
                return mVar2;
            }
            ((w65.g) task).f443357f = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
            this.f192360g.put(task.id(), task);
            this.f192358e.add(task);
            ((u26.o) this.f192361h).e(jz5.f0.f302826a);
            if (!this.f192362i) {
                synchronized (this) {
                    if (!this.f192362i) {
                        this.f192362i = true;
                        int f67112n = getF67112n();
                        for (int i17 = 0; i17 < f67112n; i17++) {
                            v65.i.b(g(), null, new x65.n(this, i17, null), 1, null);
                        }
                        com.tencent.mars.xlog.Log.i((java.lang.String) ((jz5.n) this.f192363m).getValue(), "started " + getF67112n() + " workers");
                    }
                }
            }
            return task;
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onDestroy() {
        u26.x0.a(this.f192361h, null, 1, null);
        synchronized (this) {
            java.util.Collection values = this.f192360g.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((w65.m) it.next()).x();
            }
            this.f192360g.clear();
            this.f192358e.clear();
        }
    }
}
