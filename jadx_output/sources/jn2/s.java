package jn2;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.w f300692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300693f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jn2.w wVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300692e = wVar;
        this.f300693f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.s(this.f300692e, this.f300693f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0012, B:7:0x003d, B:9:0x0042, B:12:0x0049, B:14:0x004d, B:18:0x0068, B:19:0x006d, B:24:0x0032), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0012, B:7:0x003d, B:9:0x0042, B:12:0x0049, B:14:0x004d, B:18:0x0068, B:19:0x006d, B:24:0x0032), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0012, B:7:0x003d, B:9:0x0042, B:12:0x0049, B:14:0x004d, B:18:0x0068, B:19:0x006d, B:24:0x0032), top: B:2:0x000c }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f300691d
            java.lang.String r2 = r9.f300693f
            kz5.p0 r3 = kz5.p0.f313996d
            r4 = 2
            r5 = 1
            jn2.w r6 = r9.f300692e
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L16
            goto L3d
        L16:
            r10 = move-exception
            goto L6e
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L32
        L24:
            kotlin.ResultKt.throwOnFailure(r10)
            r9.f300691d = r5
            r7 = 600(0x258, double:2.964E-321)
            java.lang.Object r10 = kotlinx.coroutines.k1.b(r7, r9)
            if (r10 != r0) goto L32
            return r0
        L32:
            sf2.x r10 = r6.f300722f     // Catch: java.lang.Exception -> L16
            r9.f300691d = r4     // Catch: java.lang.Exception -> L16
            java.lang.Object r10 = r10.o7(r2, r9)     // Catch: java.lang.Exception -> L16
            if (r10 != r0) goto L3d
            return r0
        L3d:
            r45.wx1 r10 = (r45.wx1) r10     // Catch: java.lang.Exception -> L16
            r0 = 0
            if (r10 == 0) goto L45
            java.util.LinkedList r10 = r10.f389552d     // Catch: java.lang.Exception -> L16
            goto L46
        L45:
            r10 = r0
        L46:
            if (r10 != 0) goto L49
            r10 = r3
        L49:
            jn2.z r1 = r6.f300736w     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L68
            java.lang.String r0 = "searchKey"
            kotlin.jvm.internal.o.g(r2, r0)     // Catch: java.lang.Exception -> L16
            r1.f300762f = r2     // Catch: java.lang.Exception -> L16
            java.util.List r0 = r1.f300761e     // Catch: java.lang.Exception -> L16
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Exception -> L16
            r2.clear()     // Catch: java.lang.Exception -> L16
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L16
            r0.addAll(r10)     // Catch: java.lang.Exception -> L16
            r1.notifyDataSetChanged()     // Catch: java.lang.Exception -> L16
            jn2.w.b(r6, r10)     // Catch: java.lang.Exception -> L16
            goto L88
        L68:
            java.lang.String r10 = "smartBoxAdapter"
            kotlin.jvm.internal.o.o(r10)     // Catch: java.lang.Exception -> L16
            throw r0     // Catch: java.lang.Exception -> L16
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Search smart box failed: "
            r0.<init>(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "FinderLiveAnchorSingSongAddPanelSearchWidget"
            com.tencent.mars.xlog.Log.e(r0, r10)
            jn2.w.b(r6, r3)
        L88:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
