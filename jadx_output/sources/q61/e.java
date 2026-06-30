package q61;

/* loaded from: classes11.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f360242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q61.k f360243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity appCompatActivity, q61.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360242e = appCompatActivity;
        this.f360243f = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q61.e(this.f360242e, this.f360243f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q61.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f360241d
            r2 = 0
            androidx.appcompat.app.AppCompatActivity r3 = r6.f360242e
            java.lang.String r4 = "PushLoginURLTAG3MainDeviceCGI"
            r5 = 1
            if (r1 == 0) goto L1a
            if (r1 != r5) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Class r7 = r3.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r1 = "checkLoginURLMainDevice1 "
            java.lang.String r7 = r1.concat(r7)
            com.tencent.mars.xlog.Log.i(r4, r7)
            kotlinx.coroutines.z r7 = q61.j.f360265e
            if (r7 == 0) goto L44
            r6.f360241d = r5
            kotlinx.coroutines.a0 r7 = (kotlinx.coroutines.a0) r7
            java.lang.Object r7 = r7.k(r6)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L45
        L44:
            r7 = r2
        L45:
            q61.j r0 = q61.j.f360261a
            boolean r1 = q61.j.f360262b
            if (r1 == 0) goto L52
            boolean r0 = r0.a()
            if (r0 == 0) goto L52
            r2 = r5
        L52:
            jz5.f0 r0 = jz5.f0.f302826a
            if (r2 == 0) goto L75
            if (r7 != 0) goto L59
            goto L75
        L59:
            q61.k r1 = r6.f360243f
            if (r1 != 0) goto L6e
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "callback == null "
            java.lang.String r2 = r3.concat(r2)
            com.tencent.mars.xlog.Log.i(r4, r2)
        L6e:
            if (r1 == 0) goto L75
            r45.nf5 r2 = q61.j.f360263c
            r1.a(r7, r2)
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q61.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
