package pw1;

/* loaded from: classes14.dex */
public final class d implements hw1.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f358672a = jz5.h.b(pw1.b.f358667d);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // hw1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pw1.c
            if (r0 == 0) goto L13
            r0 = r6
            pw1.c r0 = (pw1.c) r0
            int r1 = r0.f358671g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358671g = r1
            goto L18
        L13:
            pw1.c r0 = new pw1.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f358669e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f358671g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f358668d
            pw1.d r0 = (pw1.d) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f358668d = r5
            r0.f358671g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
        L40:
            jz5.g r6 = r0.f358672a
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            pw1.a r6 = (pw1.a) r6
            r6.n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pw1.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // hw1.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(pw1.e eVar, kotlin.coroutines.Continuation continuation) {
        if (eVar.f358675c.f367087e.isLocked()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLYuvRenderMTRTask", "execute: texture uploading, skip frame");
        } else {
            java.util.concurrent.locks.ReentrantLock reentrantLock = eVar.f358675c.f367087e;
            reentrantLock.lock();
            try {
                e(eVar);
            } finally {
                reentrantLock.unlock();
            }
        }
        return new pw1.f();
    }

    public final void e(pw1.e params) {
        jz5.g gVar = this.f358672a;
        pw1.a aVar = (pw1.a) ((jz5.n) gVar).getValue();
        aVar.getClass();
        kotlin.jvm.internal.o.g(params, "params");
        pw1.g gVar2 = params.f358673a;
        aVar.w(gVar2.f358676a, gVar2.f358677b);
        android.util.Size size = params.f358674b;
        aVar.u(size.getWidth(), size.getHeight());
        aVar.f348005n = gVar2.f358678c;
        int i17 = 1;
        int i18 = gVar2.f358680e;
        if (i18 != 0) {
            if (i18 == 1) {
                i17 = 6;
            } else if (i18 == 2) {
                i17 = 2;
            }
        }
        aVar.f347997f = i17;
        aVar.f358666J = params;
        ((pw1.a) ((jz5.n) gVar).getValue()).o();
    }
}
