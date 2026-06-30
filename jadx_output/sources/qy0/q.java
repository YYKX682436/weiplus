package qy0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367637d;

    /* renamed from: e, reason: collision with root package name */
    public int f367638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qy0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367639f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy0.q(this.f367639f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a A[LOOP:0: B:8:0x0094->B:10:0x009a, LOOP_END] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f367638e
            r2 = 2
            r3 = 1
            qy0.d0 r4 = r6.f367639f
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.f367637d
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L73
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L33
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            nz0.o r7 = nz0.o.f341530a
            r6.f367638e = r3
            r1 = 0
            java.lang.String r3 = "cache_key_finder_album"
            java.lang.Object r7 = r7.c(r1, r3, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto Lae
            jz5.g r1 = r4.f367577s
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L82
            android.app.Activity r1 = r4.getContext()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r1, r3)
            pf5.z r3 = pf5.z.f353948a
            boolean r5 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            if (r5 == 0) goto L76
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            pf5.v r1 = r3.a(r1)
            java.lang.Class<dz0.l> r3 = dz0.l.class
            pf5.c r1 = r1.c(r3)
            dz0.l r1 = (dz0.l) r1
            r6.f367637d = r7
            r6.f367638e = r2
            az0.i5 r1 = az0.i5.f15557a
            java.lang.Object r1 = r1.n(r7, r6)
            if (r1 != r0) goto L71
            return r0
        L71:
            r0 = r7
            r7 = r1
        L73:
            java.util.List r7 = (java.util.List) r7
            goto L83
        L76:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L82:
            r0 = r7
        L83:
            com.tencent.mm.mj_template.sns.compose.widget.m7 r1 = r4.f367583y
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kz5.d0.q(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L94:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto Laa
            java.lang.Object r3 = r7.next()
            r45.rz6 r3 = (r45.rz6) r3
            com.tencent.mm.mj_template.sns.compose.widget.j5 r4 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m
            com.tencent.mm.mj_template.sns.compose.widget.k5 r3 = r4.c(r3)
            r2.add(r3)
            goto L94
        Laa:
            r1.c(r2)
            r7 = r0
        Lae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "loadNoRecommendList: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            com.tencent.mars.xlog.Log.i(r0, r7)
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
