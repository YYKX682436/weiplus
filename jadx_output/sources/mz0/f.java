package mz0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332945f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mz0.b2 b2Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332944e = b2Var;
        this.f332945f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.f(this.f332944e, this.f332945f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097 A[LOOP:0: B:7:0x0091->B:9:0x0097, LOOP_END] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f332943d
            java.lang.String r2 = "MicroMsg.Template.TemplateControlUIC"
            r3 = 1
            java.util.List r4 = r7.f332945f
            mz0.b2 r5 = r7.f332944e
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r8)
            goto L51
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "show wecaht backend list"
            com.tencent.mars.xlog.Log.i(r2, r8)
            boolean r8 = r5.m7()
            if (r8 == 0) goto L82
            android.app.Activity r8 = r5.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r8, r1)
            pf5.z r1 = pf5.z.f353948a
            boolean r6 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r6 == 0) goto L76
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            pf5.v r8 = r1.a(r8)
            java.lang.Class<dz0.l> r1 = dz0.l.class
            pf5.c r8 = r8.c(r1)
            dz0.l r8 = (dz0.l) r8
            r7.f332943d = r3
            az0.i5 r8 = az0.i5.f15557a
            java.lang.Object r8 = r8.n(r4, r7)
            if (r8 != r0) goto L51
            return r0
        L51:
            java.util.List r8 = (java.util.List) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "template list filter before: "
            r0.<init>(r1)
            int r1 = r4.size()
            r0.append(r1)
            java.lang.String r1 = " after: "
            r0.append(r1)
            int r1 = r8.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            r4 = r8
            goto L82
        L76:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L82:
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = kz5.d0.q(r4, r0)
            r8.<init>(r0)
            java.util.Iterator r0 = r4.iterator()
        L91:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r0.next()
            r45.rz6 r1 = (r45.rz6) r1
            com.tencent.mm.mj_template.sns.compose.widget.j5 r2 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m
            com.tencent.mm.mj_template.sns.compose.widget.k5 r1 = r2.c(r1)
            r8.add(r1)
            goto L91
        La7:
            com.tencent.mm.mj_template.sns.compose.widget.m7 r0 = r5.o7()
            r0.c(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
