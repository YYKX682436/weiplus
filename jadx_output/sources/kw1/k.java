package kw1;

/* loaded from: classes14.dex */
public final class k implements hw1.c {

    /* renamed from: a, reason: collision with root package name */
    public final oz5.l f312851a;

    /* renamed from: b, reason: collision with root package name */
    public final mw1.e f312852b;

    /* renamed from: c, reason: collision with root package name */
    public final qw1.j f312853c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f312854d;

    /* renamed from: e, reason: collision with root package name */
    public final rw1.a f312855e;

    /* renamed from: f, reason: collision with root package name */
    public final pw1.d f312856f;

    /* renamed from: g, reason: collision with root package name */
    public final nw1.d f312857g;

    public k(oz5.l glCoroutineContext, mw1.e renderTargetHolder, qw1.j textureManager) {
        kotlin.jvm.internal.o.g(glCoroutineContext, "glCoroutineContext");
        kotlin.jvm.internal.o.g(renderTargetHolder, "renderTargetHolder");
        kotlin.jvm.internal.o.g(textureManager, "textureManager");
        this.f312851a = glCoroutineContext;
        this.f312852b = renderTargetHolder;
        this.f312853c = textureManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f312854d = arrayList;
        rw1.a aVar = new rw1.a();
        arrayList.add(aVar);
        this.f312855e = aVar;
        pw1.d dVar = new pw1.d();
        arrayList.add(dVar);
        this.f312856f = dVar;
        nw1.d dVar2 = new nw1.d();
        arrayList.add(dVar2);
        this.f312857g = dVar2;
        arrayList.add(new ow1.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // hw1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kw1.h
            if (r0 == 0) goto L13
            r0 = r7
            kw1.h r0 = (kw1.h) r0
            int r1 = r0.f312843g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312843g = r1
            goto L18
        L13:
            kw1.h r0 = new kw1.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f312841e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f312843g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r2 = r0.f312840d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L59
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f312840d
            kw1.k r2 = (kw1.k) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L52
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "init: "
            com.tencent.mars.xlog.Log.i(r7, r2)
            r0.f312840d = r6
            r0.f312843g = r5
            if (r3 != r1) goto L51
            return r1
        L51:
            r2 = r6
        L52:
            java.util.List r7 = r2.f312854d
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L59:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r2.next()
            hw1.c r7 = (hw1.c) r7
            r0.f312840d = r2
            r0.f312843g = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L59
            return r1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kw1.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // hw1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kw1.i
            if (r0 == 0) goto L13
            r0 = r7
            kw1.i r0 = (kw1.i) r0
            int r1 = r0.f312847g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312847g = r1
            goto L18
        L13:
            kw1.i r0 = new kw1.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f312845e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f312847g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r2 = r0.f312844d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5a
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f312844d
            kw1.k r2 = (kw1.k) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L53
        L40:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "release: "
            com.tencent.mars.xlog.Log.i(r7, r2)
            r0.f312844d = r6
            r0.f312847g = r5
            if (r3 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            java.util.List r7 = r2.f312854d
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L5a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L71
            java.lang.Object r7 = r2.next()
            hw1.c r7 = (hw1.c) r7
            r0.f312844d = r2
            r0.f312847g = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L5a
            return r1
        L71:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kw1.k.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // hw1.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kw1.o r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kw1.k.c(kw1.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object e(java.lang.String str, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        mw1.b a17 = this.f312852b.a(str);
        if (a17 == null) {
            return null;
        }
        lw1.l lVar = lw1.m.f321560e;
        return kotlinx.coroutines.l.g(this.f312851a.plus(new lw1.m(new lw1.i(a17))), new kw1.j(pVar, a17, null), continuation);
    }
}
