package mj3;

/* loaded from: classes14.dex */
public final class d implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f327046a = jz5.h.b(mj3.b.f327041d);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ej3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mj3.c
            if (r0 == 0) goto L13
            r0 = r6
            mj3.c r0 = (mj3.c) r0
            int r1 = r0.f327045g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f327045g = r1
            goto L18
        L13:
            mj3.c r0 = new mj3.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f327043e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f327045g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f327042d
            mj3.d r0 = (mj3.d) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f327042d = r5
            r0.f327045g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
        L40:
            mj3.a r6 = r0.e()
            r6.n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mj3.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(mj3.e eVar, kotlin.coroutines.Continuation continuation) {
        if (eVar.f327049c.f337901e.isLocked()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLYuvRenderMTRTask", "execute: texture uploading, skip frame");
        } else {
            java.util.concurrent.locks.ReentrantLock reentrantLock = eVar.f327049c.f337901e;
            reentrantLock.lock();
            try {
                f(eVar);
            } finally {
                reentrantLock.unlock();
            }
        }
        return new mj3.f();
    }

    public final mj3.a e() {
        return (mj3.a) ((jz5.n) this.f327046a).getValue();
    }

    public final void f(mj3.e params) {
        mj3.a e17 = e();
        e17.getClass();
        kotlin.jvm.internal.o.g(params, "params");
        mj3.g gVar = params.f327047a;
        e17.w(gVar.f327050a, gVar.f327051b);
        android.util.Size size = params.f327048b;
        e17.u(size.getWidth(), size.getHeight());
        e17.f348005n = gVar.f327052c;
        e17.f347997f = gVar.f327054e ? 2 : 6;
        e17.f327040J = params;
        if (params.f327047a.f327054e) {
            e().f347997f = 2;
        } else {
            e().f347997f = 6;
        }
        e().o();
    }
}
