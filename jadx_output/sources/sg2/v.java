package sg2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407942d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407943e;

    /* renamed from: f, reason: collision with root package name */
    public int f407944f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f407946h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f407947i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.util.List list, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407946h = list;
        this.f407947i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sg2.v vVar = new sg2.v(this.f407946h, this.f407947i, continuation);
        vVar.f407945g = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00ae -> B:5:0x00b2). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f407944f
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r14.f407943e
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.Object r3 = r14.f407942d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r14.f407945g
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.ResultKt.throwOnFailure(r15)
            r5 = r3
            r3 = r1
            r1 = r0
            r0 = r14
            goto Lb2
        L1e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L26:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.f407945g
            kotlinx.coroutines.y0 r15 = (kotlinx.coroutines.y0) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r3 = r14.f407946h
            java.util.Iterator r9 = r3.iterator()
        L38:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r9.next()
            r10 = r3
            r45.ir1 r10 = (r45.ir1) r10
            r4 = 0
            r5 = 0
            sg2.r r6 = new sg2.r
            boolean r11 = r14.f407947i
            r12 = 0
            r6.<init>(r10, r11, r12)
            r7 = 3
            r8 = 0
            r3 = r15
            kotlinx.coroutines.f1 r3 = kotlinx.coroutines.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            sg2.s r6 = new sg2.s
            r6.<init>(r10, r11, r12)
            r3 = r15
            kotlinx.coroutines.f1 r3 = kotlinx.coroutines.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            sg2.t r6 = new sg2.t
            r6.<init>(r10, r12)
            r3 = r15
            kotlinx.coroutines.f1 r3 = kotlinx.coroutines.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            sg2.u r6 = new sg2.u
            r6.<init>(r10, r11, r12)
            r3 = r15
            kotlinx.coroutines.f1 r3 = kotlinx.coroutines.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            goto L38
        L81:
            java.util.Iterator r15 = r1.iterator()
            r4 = r15
            r15 = r14
        L87:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r4.next()
            kotlinx.coroutines.f1 r1 = (kotlinx.coroutines.f1) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "#refreshInner result:"
            r3.append(r5)
            r15.f407945g = r4
            java.lang.String r5 = "FinderGesturesFilesManager"
            r15.f407942d = r5
            r15.f407943e = r3
            r15.f407944f = r2
            java.lang.Object r1 = r1.k(r15)
            if (r1 != r0) goto Lae
            return r0
        Lae:
            r13 = r0
            r0 = r15
            r15 = r1
            r1 = r13
        Lb2:
            java.lang.String r15 = (java.lang.String) r15
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            com.tencent.mars.xlog.Log.i(r5, r15)
            r15 = r0
            r0 = r1
            goto L87
        Lc1:
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
