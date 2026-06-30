package z;

/* loaded from: classes14.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468844d;

    /* renamed from: e, reason: collision with root package name */
    public int f468845e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.w0 f468847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468847g = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z.u0 u0Var = new z.u0(this.f468847g, continuation);
        u0Var.f468846f = obj;
        return u0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0087 -> B:7:0x003f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f468845e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r8.f468844d
            kotlin.jvm.internal.e0 r1 = (kotlin.jvm.internal.e0) r1
            java.lang.Object r4 = r8.f468846f
            kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
            kotlin.ResultKt.throwOnFailure(r9)
            goto L3e
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.f468844d
            kotlin.jvm.internal.e0 r1 = (kotlin.jvm.internal.e0) r1
            java.lang.Object r4 = r8.f468846f
            kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            goto L62
        L2d:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f468846f
            r4 = r9
            kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
            kotlin.jvm.internal.e0 r1 = new kotlin.jvm.internal.e0
            r1.<init>()
            r9 = 1065353216(0x3f800000, float:1.0)
            r1.f310115d = r9
        L3e:
            r9 = r8
        L3f:
            z.r0 r5 = new z.r0
            z.w0 r6 = r9.f468847g
            r5.<init>(r6, r1, r4)
            r9.f468846f = r4
            r9.f468844d = r1
            r9.f468845e = r3
            oz5.l r6 = r9.getContext()
            int r7 = androidx.compose.ui.platform.b3.f10515c0
            androidx.compose.ui.platform.a3 r7 = androidx.compose.ui.platform.a3.f10509d
            oz5.i r6 = r6.get(r7)
            android.support.v4.media.f.a(r6)
            java.lang.Object r5 = n0.s2.b(r5, r9)
            if (r5 != r0) goto L62
            return r0
        L62:
            float r5 = r1.f310115d
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L6b
            r5 = r3
            goto L6c
        L6b:
            r5 = 0
        L6c:
            if (r5 == 0) goto L3f
            z.s0 r5 = new z.s0
            r5.<init>(r4)
            kotlinx.coroutines.flow.j r5 = n0.s4.f(r5)
            z.t0 r6 = new z.t0
            r7 = 0
            r6.<init>(r7)
            r9.f468846f = r4
            r9.f468844d = r1
            r9.f468845e = r2
            java.lang.Object r5 = kotlinx.coroutines.flow.l.l(r5, r6, r9)
            if (r5 != r0) goto L3f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
