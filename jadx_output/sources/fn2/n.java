package fn2;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f264332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.s f264333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fn2.s sVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264333e = sVar;
        this.f264334f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fn2.n(this.f264333e, this.f264334f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f264332d
            java.lang.String r2 = r8.f264334f
            r3 = 2
            r4 = 1
            fn2.s r5 = r8.f264333e
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.throwOnFailure(r9)
            goto L39
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L2e
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f264332d = r4
            r6 = 600(0x258, double:2.964E-321)
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r6, r8)
            if (r9 != r0) goto L2e
            return r0
        L2e:
            sf2.d3 r9 = r5.f264370f
            r8.f264332d = r3
            java.lang.Object r9 = r9.u7(r2, r8)
            if (r9 != r0) goto L39
            return r0
        L39:
            r45.wx1 r9 = (r45.wx1) r9
            if (r9 == 0) goto L40
            java.util.LinkedList r9 = r9.f389552d
            goto L41
        L40:
            r9 = 0
        L41:
            if (r9 != 0) goto L45
            kz5.p0 r9 = kz5.p0.f313996d
        L45:
            bm2.n7 r0 = r5.f264376o
            r0.getClass()
            java.lang.String r1 = "searchKey"
            kotlin.jvm.internal.o.g(r2, r1)
            r0.f22166f = r2
            java.util.List r1 = r0.f22164d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            r1.addAll(r9)
            r0.notifyDataSetChanged()
            com.tencent.mm.plugin.finder.live.widget.dv r0 = r5.f264380s
            if (r0 == 0) goto L65
            r0.b()
        L65:
            com.tencent.mm.plugin.finder.live.widget.dv r0 = r5.f264379r
            if (r0 == 0) goto L81
            android.content.Context r1 = r5.c()
            java.lang.String r2 = "<get-context>(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r2 = 2131763030(0x7f101f56, float:1.9157154E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "getString(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r0.c(r9, r1)
        L81:
            fn2.s.b(r5)
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
