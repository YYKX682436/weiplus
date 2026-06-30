package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes5.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117338d;

    /* renamed from: e, reason: collision with root package name */
    public int f117339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.u3 f117340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.tencent.mm.plugin.finder.live.viewmodel.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117340f = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.q3(this.f117340f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.q3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if ((r0.length() > 0) == true) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f117339e
            com.tencent.mm.plugin.finder.live.viewmodel.u3 r2 = r5.f117340f
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            java.lang.Object r0 = r5.f117338d
            com.tencent.mm.plugin.finder.live.viewmodel.u3 r0 = (com.tencent.mm.plugin.finder.live.viewmodel.u3) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3c
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            r45.v11 r6 = r2.f117452i
            if (r6 == 0) goto L3f
            java.lang.Class<s40.b1> r1 = s40.b1.class
            i95.m r1 = i95.n0.c(r1)
            s40.b1 r1 = (s40.b1) r1
            androidx.appcompat.app.AppCompatActivity r4 = r2.getActivity()
            r5.f117338d = r2
            r5.f117339e = r3
            com.tencent.mm.feature.finder.live.t6 r1 = (com.tencent.mm.feature.finder.live.t6) r1
            java.lang.Object r6 = r1.aj(r4, r6, r5)
            if (r6 != r0) goto L3b
            return r0
        L3b:
            r0 = r2
        L3c:
            java.lang.String r6 = (java.lang.String) r6
            goto L41
        L3f:
            r6 = 0
            r0 = r2
        L41:
            r0.f117447d = r6
            android.view.View r6 = r2.f117450g
            java.lang.String r0 = r2.f117447d
            r1 = 0
            if (r0 == 0) goto L56
            int r0 = r0.length()
            if (r0 <= 0) goto L52
            r0 = r3
            goto L53
        L52:
            r0 = r1
        L53:
            if (r0 != r3) goto L56
            goto L57
        L56:
            r3 = r1
        L57:
            r2.V6(r6, r3)
            r2.U6()
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.q3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
