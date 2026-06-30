package cp5;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f221144d;

    /* renamed from: e, reason: collision with root package name */
    public int f221145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f221146f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f221147g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f221148h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f221149i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f221150m;

    /* renamed from: n, reason: collision with root package name */
    public int f221151n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f221152o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ cp5.j f221153p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, cp5.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221152o = i17;
        this.f221153p = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cp5.h(this.f221152o, this.f221153p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cp5.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0073 -> B:5:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0088 -> B:6:0x008b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f221151n
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r1 = r12.f221145e
            int r3 = r12.f221144d
            java.lang.Object r4 = r12.f221150m
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r12.f221149i
            cp5.j r5 = (cp5.j) r5
            java.lang.Object r6 = r12.f221148h
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r12.f221147g
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r12.f221146f
            cp5.j r8 = (cp5.j) r8
            kotlin.ResultKt.throwOnFailure(r13)
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r12
            goto L7d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L36:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.List r13 = kz5.b0.b()
            int r1 = r12.f221152o
            cp5.j r3 = r12.f221153p
            r4 = 0
            r7 = r13
            r5 = r3
            r13 = r12
            r3 = r1
            r1 = r4
            r4 = r7
        L48:
            if (r1 >= r3) goto L98
            java.util.concurrent.ConcurrentLinkedQueue r6 = r5.f221160e
            java.lang.Object r6 = r6.poll()
            dp5.f r6 = (dp5.f) r6
            if (r6 != 0) goto L88
            r13.f221146f = r5
            r13.f221147g = r7
            r13.f221148h = r4
            r13.f221149i = r5
            r13.f221150m = r4
            r13.f221144d = r3
            r13.f221145e = r1
            r13.f221151n = r2
            cp5.g r6 = new cp5.g
            r8 = 0
            r6.<init>(r2, r5, r8)
            kotlinx.coroutines.p0 r8 = r5.f221159d
            java.lang.Object r6 = kotlinx.coroutines.l.g(r8, r6, r13)
            if (r6 != r0) goto L73
            return r0
        L73:
            r9 = r5
            r8 = r7
            r5 = r4
            r7 = r5
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r13
            r13 = r6
            r6 = r9
        L7d:
            dp5.f r13 = (dp5.f) r13
            r11 = r6
            r6 = r13
            r13 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r11
            goto L8b
        L88:
            r9 = r5
            r8 = r7
            r7 = r4
        L8b:
            cp5.f r10 = new cp5.f
            r10.<init>(r5, r6)
            r4.add(r10)
            int r1 = r1 + r2
            r4 = r7
            r7 = r8
            r5 = r9
            goto L48
        L98:
            java.util.List r13 = kz5.b0.a(r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cp5.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
