package kj3;

/* loaded from: classes14.dex */
public final class d implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f308445a = jz5.h.b(kj3.a.f308439d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f308446b = jz5.h.b(kj3.b.f308440d);

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
            boolean r0 = r6 instanceof kj3.c
            if (r0 == 0) goto L13
            r0 = r6
            kj3.c r0 = (kj3.c) r0
            int r1 = r0.f308444g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f308444g = r1
            goto L18
        L13:
            kj3.c r0 = new kj3.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f308442e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f308444g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f308441d
            kj3.d r0 = (kj3.d) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f308441d = r5
            r0.f308444g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
        L40:
            jz5.g r6 = r0.f308445a
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            os0.c r6 = (os0.c) r6
            r6.n()
            jz5.g r6 = r0.f308446b
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            os0.e r6 = (os0.e) r6
            r6.n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kj3.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(kj3.e eVar, kotlin.coroutines.Continuation continuation) {
        boolean z17 = eVar.f308450d;
        android.util.Size size = eVar.f308448b;
        mj3.g gVar = eVar.f308447a;
        int i17 = eVar.f308449c;
        if (z17) {
            os0.c cVar = (os0.c) ((jz5.n) this.f308445a).getValue();
            cVar.H = i17;
            cVar.w(gVar.f327050a, gVar.f327051b);
            cVar.f348007p = gVar.f327053d;
            cVar.u(size.getWidth(), size.getHeight());
            cVar.s(gVar.f327052c);
            cVar.o();
        } else {
            os0.e eVar2 = (os0.e) ((jz5.n) this.f308446b).getValue();
            eVar2.H = i17;
            eVar2.w(gVar.f327050a, gVar.f327051b);
            eVar2.f348007p = gVar.f327053d;
            eVar2.u(size.getWidth(), size.getHeight());
            eVar2.s(gVar.f327052c);
            eVar2.o();
        }
        return new kj3.f();
    }
}
