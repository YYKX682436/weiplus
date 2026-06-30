package im2;

/* loaded from: classes3.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(im2.z3 z3Var, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292603e = z3Var;
        this.f292604f = i17;
        this.f292605g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.x0(this.f292603e, this.f292604f, this.f292605g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r2.U6(r2.L1, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0079, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0082, code lost:
    
        if (r2.Z1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0084, code lost:
    
        r2.V6(r12, r3);
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f292602d
            im2.z3 r2 = r11.f292603e
            int r3 = r11.f292604f
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L77
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            kotlin.ResultKt.throwOnFailure(r12)
            android.app.Activity r12 = r2.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r12, r1)
            pf5.z r1 = pf5.z.f353948a
            boolean r5 = r12 instanceof androidx.appcompat.app.AppCompatActivity
            if (r5 == 0) goto L90
            androidx.appcompat.app.AppCompatActivity r12 = (androidx.appcompat.app.AppCompatActivity) r12
            pf5.v r12 = r1.a(r12)
            java.lang.Class<te2.s8> r1 = te2.s8.class
            androidx.lifecycle.c1 r12 = r12.a(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.o.f(r12, r1)
            te2.p8 r12 = (te2.p8) r12
            int r1 = r12.E1
            if (r1 != r4) goto L64
            te2.sc r0 = te2.sc.f418412a
            r45.s52 r0 = r0.b(r3)
            if (r0 != 0) goto L4f
            r45.s52 r0 = new r45.s52
            r0.<init>()
        L4f:
            r12.v7(r0)
            kotlinx.coroutines.y0 r5 = kotlinx.coroutines.z0.b()
            r6 = 0
            r7 = 0
            te2.b8 r8 = new te2.b8
            r0 = 0
            r8.<init>(r12, r4, r0)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            goto L8d
        L64:
            java.lang.String r12 = r11.f292605g
            boolean r1 = com.tencent.mm.vfs.w6.j(r12)
            if (r1 == 0) goto L7c
            zl2.o0 r1 = zl2.o0.f473907a
            r11.f292602d = r4
            java.lang.Object r12 = r1.b(r12, r11)
            if (r12 != r0) goto L77
            return r0
        L77:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L80
            goto L7e
        L7c:
            if (r12 != 0) goto L80
        L7e:
            java.lang.String r12 = ""
        L80:
            boolean r0 = r2.Z1
            if (r0 == 0) goto L88
            r2.V6(r12, r3)
            goto L8d
        L88:
            int r0 = r2.L1
            r2.U6(r0, r12, r3)
        L8d:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        L90:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
