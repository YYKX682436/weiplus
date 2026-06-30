package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ug extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f136135d;

    /* renamed from: e, reason: collision with root package name */
    public int f136136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f136138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(boolean z17, androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136137f = z17;
        this.f136138g = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.ug(this.f136137f, this.f136138g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ug) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f136136e
            androidx.appcompat.app.AppCompatActivity r2 = r6.f136138g
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            java.lang.Object r0 = r6.f136135d
            com.tencent.mm.protobuf.g r0 = (com.tencent.mm.protobuf.g) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L74
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.flow.j2 r7 = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133881e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r1 = com.tencent.mm.plugin.finder.viewmodel.component.ig.f134740e
            kotlinx.coroutines.flow.h3 r7 = (kotlinx.coroutines.flow.h3) r7
            r7.k(r1)
            boolean r7 = r6.f136137f
            r1 = 0
            if (r7 == 0) goto L5f
            kotlinx.coroutines.flow.j2 r7 = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133882f
            kotlinx.coroutines.flow.h3 r7 = (kotlinx.coroutines.flow.h3) r7
            java.lang.Object r7 = r7.getValue()
            bw5.ig r7 = (bw5.ig) r7
            if (r7 == 0) goto L41
            int r4 = r7.f28572e
            if (r4 == 0) goto L41
            com.tencent.mm.protobuf.g r7 = r7.getLastBuffer()
            goto L60
        L41:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestOftenReadAuthor loadMore refresh: old.continueFlag="
            r4.<init>(r5)
            if (r7 == 0) goto L52
            int r7 = r7.f28572e
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r7)
            goto L53
        L52:
            r5 = r1
        L53:
            r4.append(r5)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "Finder.FollowAggregationRepo"
            com.tencent.mars.xlog.Log.w(r4, r7)
        L5f:
            r7 = r1
        L60:
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310570c
            com.tencent.mm.plugin.finder.viewmodel.component.tg r5 = new com.tencent.mm.plugin.finder.viewmodel.component.tg
            r5.<init>(r2, r7, r1)
            r6.f136135d = r7
            r6.f136136e = r3
            java.lang.Object r1 = kotlinx.coroutines.l.g(r4, r5, r6)
            if (r1 != r0) goto L72
            return r0
        L72:
            r0 = r7
            r7 = r1
        L74:
            bw5.ig r7 = (bw5.ig) r7
            kotlinx.coroutines.flow.j2 r1 = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133881e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r3 = com.tencent.mm.plugin.finder.viewmodel.component.ig.f134741f
            kotlinx.coroutines.flow.h3 r1 = (kotlinx.coroutines.flow.h3) r1
            r1.k(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.bh r1 = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a
            com.tencent.mm.plugin.finder.viewmodel.component.bh.a(r1, r2, r7, r0)
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.ug.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
