package xr;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final xr.g f456145a;

    /* renamed from: b, reason: collision with root package name */
    public final xr.d f456146b;

    public f(xr.g callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f456145a = callback;
        this.f456146b = new xr.d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r5.f456143b.field_version < r7.field_version) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[Catch: all -> 0x00e6, TryCatch #0 {, blocks: (B:4:0x003a, B:6:0x0046, B:9:0x0056, B:14:0x0084, B:15:0x00a4, B:17:0x00b2, B:19:0x00b8, B:25:0x0060, B:27:0x0064, B:33:0x0075, B:36:0x0097), top: B:3:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r10, qk.h6 r11, as.a r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.f.a(int, qk.h6, as.a):void");
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xr.d dVar = this.f456146b;
        synchronized (dVar.f456141d) {
            boolean z17 = false;
            try {
                if (j62.e.g().c(new com.tencent.mm.repairer.config.chatbot.RepairerConfigFunctionMsgSerialize()) == 1) {
                    z17 = true;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FunctionMsg.FunctionMsgQueue", e17, "[isSerializeEnabled] config read failed", new java.lang.Object[0]);
            }
            com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgQueue", "[loop] size:" + dVar.f456138a.size() + " serialize:" + z17);
            java.util.ListIterator listIterator = dVar.f456138a.listIterator();
            kotlin.jvm.internal.o.f(listIterator, "listIterator(...)");
            if (!z17) {
                while (listIterator.hasNext()) {
                    java.lang.Object next = listIterator.next();
                    kotlin.jvm.internal.o.f(next, "next(...)");
                    xr.e eVar = (xr.e) next;
                    if (eVar.f456143b.field_actionTime <= c01.id.a() / 1000) {
                        listIterator.remove();
                        dVar.f456139b.remove(eVar.f456143b.field_functionmsgid);
                        dVar.f456140c.c(eVar);
                    }
                }
            } else if (listIterator.hasNext()) {
                java.lang.Object next2 = listIterator.next();
                kotlin.jvm.internal.o.f(next2, "next(...)");
                xr.e eVar2 = (xr.e) next2;
                if (eVar2.f456143b.field_actionTime <= c01.id.a() / 1000) {
                    listIterator.remove();
                    dVar.f456139b.remove(eVar2.f456143b.field_functionmsgid);
                    dVar.f456140c.c(eVar2);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgTimer", "[check] Cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void c(xr.e task) {
        kotlin.jvm.internal.o.g(task, "task");
        ((xr.a) this.f456145a).getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTaskExpired] id:");
        qk.h6 h6Var = task.f456143b;
        sb6.append(h6Var.field_functionmsgid);
        sb6.append(" op:");
        sb6.append(task.f456142a);
        sb6.append(" status:");
        sb6.append(h6Var.field_status);
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", sb6.toString());
        task.f456144c.b(xr.a.f456131e, xr.a.f456134h, task);
    }

    public final void d(xr.e task) {
        kotlin.jvm.internal.o.g(task, "task");
        qk.h6 h6Var = task.f456143b;
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgTimer", "[onTaskComplete] id:%s", h6Var.field_functionmsgid);
        ((xr.a) this.f456145a).getClass();
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[onTaskComplete] id:" + h6Var.field_functionmsgid + " status:" + h6Var.field_status);
        boolean z17 = false;
        try {
            if (j62.e.g().c(new com.tencent.mm.repairer.config.chatbot.RepairerConfigFunctionMsgSerialize()) == 1) {
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FunctionMsg.FunctionMsgQueue", e17, "[isSerializeEnabled] config read failed", new java.lang.Object[0]);
        }
        if (z17) {
            b();
        }
    }
}
