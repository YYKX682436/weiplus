package df2;

/* loaded from: classes3.dex */
public final class c00 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229838d;

    /* renamed from: e, reason: collision with root package name */
    public int f229839e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f229841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f229842h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(java.util.List list, df2.m00 m00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229841g = list;
        this.f229842h = m00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.c00 c00Var = new df2.c00(this.f229841g, this.f229842h, continuation);
        c00Var.f229840f = obj;
        return c00Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.c00) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007b -> B:5:0x0081). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f229839e
            r2 = 1
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r11.f229838d
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r11.f229840f
            kotlin.jvm.internal.c0 r3 = (kotlin.jvm.internal.c0) r3
            kotlin.ResultKt.throwOnFailure(r12)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r11
            goto L81
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f229840f
            kotlinx.coroutines.y0 r12 = (kotlinx.coroutines.y0) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r3 = r11.f229841g
            java.util.Iterator r9 = r3.iterator()
        L34:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r9.next()
            r45.b35 r3 = (r45.b35) r3
            r4 = 0
            r5 = 0
            df2.b00 r6 = new df2.b00
            r7 = 0
            df2.m00 r8 = r11.f229842h
            r6.<init>(r3, r8, r7)
            r7 = 3
            r8 = 0
            r3 = r12
            kotlinx.coroutines.f1 r3 = kotlinx.coroutines.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            goto L34
        L55:
            kotlin.jvm.internal.c0 r12 = new kotlin.jvm.internal.c0
            r12.<init>()
            r12.f310112d = r2
            java.util.Iterator r1 = r1.iterator()
            r3 = r12
            r12 = r11
        L62:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r1.next()
            kotlinx.coroutines.f1 r4 = (kotlinx.coroutines.f1) r4
            r12.f229840f = r3
            r12.f229838d = r1
            r12.f229839e = r2
            java.lang.Object r4 = r4.k(r12)
            if (r4 != r0) goto L7b
            return r0
        L7b:
            r10 = r0
            r0 = r12
            r12 = r4
            r4 = r3
            r3 = r1
            r1 = r10
        L81:
            if (r12 != 0) goto L86
            r12 = 0
            r4.f310112d = r12
        L86:
            r12 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L62
        L8b:
            boolean r12 = r3.f310112d
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.c00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
