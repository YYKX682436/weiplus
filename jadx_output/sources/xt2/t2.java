package xt2;

/* loaded from: classes2.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f457025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f457027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f457028g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(xt2.e3 e3Var, cm2.m0 m0Var, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457026e = e3Var;
        this.f457027f = m0Var;
        this.f457028g = linkedList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.t2(this.f457026e, this.f457027f, this.f457028g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x008f -> B:7:0x0026). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f457025d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.throwOnFailure(r9)
            goto L25
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            goto L70
        L1d:
            kotlin.ResultKt.throwOnFailure(r9)
            xt2.e3 r9 = r8.f457026e
            r1 = 0
            r9.E = r1
        L25:
            r9 = r8
        L26:
            xt2.e3 r1 = r9.f457026e
            int r4 = r1.E
            cm2.m0 r5 = r9.f457027f
            r1.f(r5, r4)
            r9.f457025d = r3
            r1.getClass()
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = pz5.f.b(r9)
            r4.<init>(r5, r3)
            r4.k()
            v65.n r5 = new v65.n
            r5.<init>(r4)
            float[] r6 = new float[r2]
            r6 = {x0092: FILL_ARRAY_DATA , data: [1058642330, 1065353216} // fill-array
            android.widget.LinearLayout r1 = r1.f456723z
            java.lang.String r7 = "alpha"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r7, r6)
            xt2.b2 r6 = new xt2.b2
            r6.<init>(r5)
            r1.addListener(r6)
            r5 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r5)
            r1.start()
            java.lang.Object r1 = r4.j()
            pz5.a r4 = pz5.a.f359186d
            if (r1 != r4) goto L6b
            goto L6d
        L6b:
            jz5.f0 r1 = jz5.f0.f302826a
        L6d:
            if (r1 != r0) goto L70
            return r0
        L70:
            xt2.e3 r1 = r9.f457026e
            int r4 = r1.E
            int r4 = r4 + r3
            java.util.LinkedList r5 = r9.f457028g
            int r5 = r5.size()
            int r4 = r4 % r5
            r1.E = r4
            cm2.m0 r1 = r9.f457027f
            r45.y23 r1 = r1.f43368v
            r4 = 55
            int r1 = r1.getInteger(r4)
            long r4 = (long) r1
            r9.f457025d = r2
            java.lang.Object r1 = kotlinx.coroutines.k1.b(r4, r9)
            if (r1 != r0) goto L26
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.t2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
