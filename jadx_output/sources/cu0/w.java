package cu0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f222345d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f222346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f222348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f222349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f222350i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(cu0.x xVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222347f = xVar;
        this.f222348g = audioCacheInfo;
        this.f222349h = z17;
        this.f222350i = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        cu0.w wVar = new cu0.w(this.f222347f, this.f222348g, this.f222349h, this.f222350i, continuation);
        wVar.f222346e = obj;
        return wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cu0.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(1:(1:(1:(3:6|7|8)(2:10|11))(12:12|13|14|15|16|17|(1:19)(1:25)|(1:21)|22|(1:24)|7|8))(1:31))(2:37|(1:39))|32|33|34|(1:36)|16|17|(0)(0)|(0)|22|(0)|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f222345d
            cu0.x r3 = r0.f222347f
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L37
            if (r2 == r7) goto L2d
            if (r2 == r6) goto L22
            if (r2 != r5) goto L1a
            kotlin.ResultKt.throwOnFailure(r17)
            goto L9f
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.Object r2 = r0.f222346e
            com.tencent.mm.ui.widget.dialog.u3 r2 = (com.tencent.mm.ui.widget.dialog.u3) r2
            kotlin.ResultKt.throwOnFailure(r17)     // Catch: java.lang.Exception -> L73
            r7 = r2
            r2 = r17
            goto L6a
        L2d:
            java.lang.Object r2 = r0.f222346e
            kotlinx.coroutines.f1 r2 = (kotlinx.coroutines.f1) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r7 = r17
            goto L5d
        L37:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r0.f222346e
            r9 = r2
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            kotlinx.coroutines.p0 r10 = kotlinx.coroutines.q1.f310570c
            r11 = 0
            cu0.v r12 = new cu0.v
            r12.<init>(r3, r8)
            r13 = 2
            r14 = 0
            kotlinx.coroutines.f1 r2 = kotlinx.coroutines.l.b(r9, r10, r11, r12, r13, r14)
            cu0.u r9 = new cu0.u
            r9.<init>(r2)
            r0.f222346e = r2
            r0.f222345d = r7
            java.lang.Object r7 = cu0.x.a(r3, r9, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            com.tencent.mm.ui.widget.dialog.u3 r7 = (com.tencent.mm.ui.widget.dialog.u3) r7
            r0.f222346e = r7     // Catch: java.lang.Exception -> L72
            r0.f222345d = r6     // Catch: java.lang.Exception -> L72
            java.lang.Object r2 = r2.k(r0)     // Catch: java.lang.Exception -> L72
            if (r2 != r1) goto L6a
            return r1
        L6a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L72
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L72
            r10 = r7
            goto L75
        L72:
            r2 = r7
        L73:
            r10 = r2
            r2 = r4
        L75:
            if (r2 == 0) goto L7b
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r6 = r0.f222348g
            r12 = r6
            goto L7c
        L7b:
            r12 = r8
        L7c:
            if (r2 != 0) goto L83
            ev0.t r2 = r3.f222353c
            ev0.t.c(r2, r4, r8, r5, r8)
        L83:
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r2 = kotlinx.coroutines.internal.b0.f310484a
            cu0.t r3 = new cu0.t
            cu0.x r11 = r0.f222347f
            boolean r13 = r0.f222349h
            boolean r14 = r0.f222350i
            r15 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.f222346e = r8
            r0.f222345d = r5
            java.lang.Object r2 = kotlinx.coroutines.l.g(r2, r3, r0)
            if (r2 != r1) goto L9f
            return r1
        L9f:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cu0.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
