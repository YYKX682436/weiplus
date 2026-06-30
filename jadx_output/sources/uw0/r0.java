package uw0;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(uw0.t0 t0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431599e = t0Var;
        this.f431600f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new uw0.r0(this.f431599e, this.f431600f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (kotlin.jvm.internal.o.b(r2, r5) != false) goto L31;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f431598d
            uw0.t0 r2 = r7.f431599e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r8)
            goto L29
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.r2 r8 = r2.C
            if (r8 == 0) goto L29
            r7.f431598d = r3
            kotlinx.coroutines.c3 r8 = (kotlinx.coroutines.c3) r8
            java.lang.Object r8 = r8.C(r7)
            if (r8 != r0) goto L29
            return r0
        L29:
            jz5.g r8 = r2.f431610y
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.getValue()
            tw0.i r8 = (tw0.i) r8
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r2.f69240i
            uw0.x r0 = (uw0.x) r0
            r1 = 0
            java.lang.String r2 = r7.f431600f
            if (r0 == 0) goto L70
            java.lang.String r4 = "currentTitle"
            kotlin.jvm.internal.o.g(r2, r4)
            pw0.b r0 = r0.E1
            java.util.ArrayList r0 = r0.f275970d
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r0.next()
            r6 = r4
            sw0.a r6 = (sw0.a) r6
            boolean r6 = r6.f413413b
            if (r6 == 0) goto L49
            goto L5d
        L5c:
            r4 = r5
        L5d:
            sw0.a r4 = (sw0.a) r4
            if (r4 == 0) goto L69
            r45.ol5 r0 = r4.f413412a
            if (r0 == 0) goto L69
            java.lang.String r5 = r0.getString(r1)
        L69:
            boolean r0 = kotlin.jvm.internal.o.b(r2, r5)
            if (r0 == 0) goto L70
            goto L71
        L70:
            r3 = r1
        L71:
            r8.getClass()
            java.lang.String r0 = "text"
            kotlin.jvm.internal.o.g(r2, r0)
            boolean r0 = fy0.i.a()
            if (r0 != 0) goto L81
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
        L81:
            r8.f422443g = r2
            if (r3 == 0) goto L8b
            r8.f422442f = r2
            r8.b()
            goto Lc5
        L8b:
            int r0 = r2.length()
            r2 = 3
            if (r0 >= r2) goto Lab
            java.lang.String r0 = ""
            r8.f422442f = r0
            r8.b()
            tw0.b r0 = new tw0.b
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r0.<init>(r1, r2)
            tw0.a r8 = r8.f422438b
            uw0.j0 r8 = (uw0.j0) r8
            r8.a(r0)
            goto Lc5
        Lab:
            kotlinx.coroutines.y0 r0 = r8.f422444h
            if (r0 != 0) goto Lc5
            kotlinx.coroutines.p0 r0 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.internal.b0.f310484a
            kotlinx.coroutines.y0 r0 = kotlinx.coroutines.z0.a(r0)
            r8.f422444h = r0
            android.os.Handler r0 = r8.f422447k
            tw0.d r1 = new tw0.d
            r1.<init>(r8)
            r2 = 0
            r0.postDelayed(r1, r2)
        Lc5:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uw0.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
