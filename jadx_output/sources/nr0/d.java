package nr0;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339071e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.d(this.f339071e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f339070d
            r2 = 0
            r3 = 2
            r4 = 1
            jz5.f0 r5 = jz5.f0.f302826a
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8d
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4a
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            nr0.x r9 = r8.f339071e
            android.graphics.SurfaceTexture r9 = r9.f339119h
            if (r9 == 0) goto L2c
            r9.updateTexImage()
        L2c:
            nr0.x r9 = r8.f339071e
            boolean r1 = r9.f339127s
            if (r1 != 0) goto L8d
            boolean r1 = r9.f339129u
            if (r1 == 0) goto L8d
            boolean r1 = r9.f339128t
            if (r1 == 0) goto L3d
            r9.f339128t = r2
            return r5
        L3d:
            zr0.p r1 = r9.f339122n
            is0.c r9 = r9.f339118g
            r8.f339070d = r4
            java.lang.Object r9 = r1.k(r9, r8)
            if (r9 != r0) goto L4a
            return r0
        L4a:
            nr0.x r9 = r8.f339071e
            boolean r9 = r9.f339131w
            if (r9 == 0) goto L8d
            java.lang.String r9 = "MicroMsg.Camera.GLEnvBuilder"
            java.lang.String r1 = "isFirstFrame"
            com.tencent.mars.xlog.Log.i(r9, r1)
            nr0.x r9 = r8.f339071e
            r9.f339131w = r2
            kotlinx.coroutines.flow.j2 r9 = r9.f339132x
            if (r9 == 0) goto L8d
            bs0.g r1 = bs0.g.f23793m
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            nr0.x r4 = r8.f339071e
            xr0.k r6 = r4.f339121m
            xr0.j r6 = r6.f456177c
            int r6 = r6.f456173a
            java.lang.String r7 = "camera_int_1"
            r2.putInt(r7, r6)
            xr0.k r4 = r4.f339121m
            xr0.j r4 = r4.f456177c
            int r4 = r4.f456174b
            java.lang.String r6 = "camera_int_2"
            r2.putInt(r6, r4)
            jz5.l r4 = new jz5.l
            r4.<init>(r1, r2)
            r8.f339070d = r3
            kotlinx.coroutines.flow.h3 r9 = (kotlinx.coroutines.flow.h3) r9
            r9.emit(r4, r8)
            if (r5 != r0) goto L8d
            return r0
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nr0.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
