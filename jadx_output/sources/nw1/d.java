package nw1;

/* loaded from: classes14.dex */
public final class d implements hw1.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f340779a = jz5.h.b(nw1.a.f340773d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f340780b = jz5.h.b(nw1.b.f340774d);

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
            boolean r0 = r6 instanceof nw1.c
            if (r0 == 0) goto L13
            r0 = r6
            nw1.c r0 = (nw1.c) r0
            int r1 = r0.f340778g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f340778g = r1
            goto L18
        L13:
            nw1.c r0 = new nw1.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f340776e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f340778g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f340775d
            nw1.d r0 = (nw1.d) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f340775d = r5
            r0.f340778g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
        L40:
            jz5.g r6 = r0.f340779a
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            os0.c r6 = (os0.c) r6
            r6.n()
            jz5.g r6 = r0.f340780b
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.getValue()
            os0.e r6 = (os0.e) r6
            r6.n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nw1.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r10 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        if (r10 != 2) goto L10;
     */
    @Override // hw1.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(nw1.e r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r11 = r10.f340784d
            r0 = 2
            r1 = 6
            r2 = 1
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 16640(0x4100, float:2.3318E-41)
            android.util.Size r6 = r10.f340782b
            pw1.g r7 = r10.f340781a
            int r10 = r10.f340783c
            if (r11 == 0) goto L51
            jz5.g r11 = r9.f340779a
            jz5.n r11 = (jz5.n) r11
            java.lang.Object r11 = r11.getValue()
            os0.c r11 = (os0.c) r11
            r11.H = r10
            int r10 = r7.f358676a
            int r8 = r7.f358677b
            r11.w(r10, r8)
            boolean r10 = r7.f358679d
            r11.f348007p = r10
            int r10 = r6.getWidth()
            int r6 = r6.getHeight()
            r11.u(r10, r6)
            int r10 = r7.f358678c
            r11.s(r10)
            int r10 = r7.f358680e
            if (r10 == 0) goto L44
            if (r10 == r2) goto L42
            if (r10 == r0) goto L45
            goto L44
        L42:
            r0 = r1
            goto L45
        L44:
            r0 = r2
        L45:
            r11.f347997f = r0
            android.opengl.GLES20.glClear(r5)
            android.opengl.GLES20.glClearColor(r3, r3, r3, r4)
            r11.o()
            goto L8f
        L51:
            jz5.g r11 = r9.f340780b
            jz5.n r11 = (jz5.n) r11
            java.lang.Object r11 = r11.getValue()
            os0.e r11 = (os0.e) r11
            r11.H = r10
            int r10 = r7.f358676a
            int r8 = r7.f358677b
            r11.w(r10, r8)
            boolean r10 = r7.f358679d
            r11.f348007p = r10
            int r10 = r6.getWidth()
            int r6 = r6.getHeight()
            r11.u(r10, r6)
            int r10 = r7.f358678c
            r11.s(r10)
            int r10 = r7.f358680e
            if (r10 == 0) goto L83
            if (r10 == r2) goto L81
            if (r10 == r0) goto L84
            goto L83
        L81:
            r0 = r1
            goto L84
        L83:
            r0 = r2
        L84:
            r11.f347997f = r0
            android.opengl.GLES20.glClear(r5)
            android.opengl.GLES20.glClearColor(r3, r3, r3, r4)
            r11.o()
        L8f:
            nw1.f r10 = new nw1.f
            r10.<init>()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nw1.d.c(nw1.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
