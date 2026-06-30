package dr4;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dr4.c0 c0Var) {
        super(0);
        this.f242747d = c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if ((r2 != null && r2.isReleased()) != false) goto L45;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r6 = this;
            dr4.c0 r0 = r6.f242747d
            yz5.a r0 = r0.f242613p
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.invoke()
            jz5.f0 r0 = (jz5.f0) r0
        Lc:
            dr4.c0 r0 = r6.f242747d
            android.graphics.SurfaceTexture r1 = r0.f242603f
            if (r1 == 0) goto L7b
            boolean r2 = r0.f242608k
            if (r2 == 0) goto L18
            goto L7b
        L18:
            is0.c r2 = r0.f242606i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
            boolean r2 = r2.f294394d
            if (r2 != r3) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = r4
        L25:
            java.lang.String r5 = "MicroMsg.PboSurfaceRender"
            if (r2 != 0) goto L76
            r2 = 26
            boolean r2 = fp.h.c(r2)
            if (r2 == 0) goto L40
            android.graphics.SurfaceTexture r2 = r0.f242603f
            if (r2 == 0) goto L3c
            boolean r2 = r2.isReleased()
            if (r2 != r3) goto L3c
            goto L3d
        L3c:
            r3 = r4
        L3d:
            if (r3 == 0) goto L40
            goto L76
        L40:
            r1.updateTexImage()     // Catch: java.lang.Exception -> L44
            goto L4d
        L44:
            r1 = move-exception
            java.lang.String r2 = "updateTexImage error"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r1, r2, r3)
        L4d:
            dr4.q1 r1 = r0.f242602e
            if (r1 == 0) goto L54
            r1.o()
        L54:
            boolean r1 = r0.f242605h
            if (r1 == 0) goto L7b
            java.util.ArrayList r1 = r0.f242611n
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            yz5.l r2 = (yz5.l) r2
            dr4.q1 r3 = r0.f242602e
            if (r3 == 0) goto L71
            is0.c r3 = r3.E
            goto L72
        L71:
            r3 = 0
        L72:
            r2.invoke(r3)
            goto L5e
        L76:
            java.lang.String r0 = "render external texture is released"
            com.tencent.mars.xlog.Log.e(r5, r0)
        L7b:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dr4.u.invoke():java.lang.Object");
    }
}
