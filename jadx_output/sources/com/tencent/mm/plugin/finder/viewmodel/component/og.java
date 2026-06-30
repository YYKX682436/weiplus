package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class og extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f135473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135473e = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.og(this.f135473e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.og) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f135472d
            androidx.appcompat.app.AppCompatActivity r2 = r8.f135473e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r9)
            goto L44
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L36
        L1f:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.flow.j2 r9 = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133881e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r1 = com.tencent.mm.plugin.finder.viewmodel.component.ig.f134740e
            kotlinx.coroutines.flow.h3 r9 = (kotlinx.coroutines.flow.h3) r9
            r9.k(r1)
            r8.f135472d = r4
            r6 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r6, r8)
            if (r9 != r0) goto L36
            return r0
        L36:
            db2.b5 r9 = new db2.b5
            r9.<init>(r2, r5)
            r8.f135472d = r3
            java.lang.Object r9 = rm0.h.b(r9, r8)
            if (r9 != r0) goto L44
            return r0
        L44:
            r0 = r9
            com.tencent.mm.modelbase.f r0 = (com.tencent.mm.modelbase.f) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r9 = r5
        L4f:
            com.tencent.mm.modelbase.f r9 = (com.tencent.mm.modelbase.f) r9
            if (r9 == 0) goto L58
            com.tencent.mm.protobuf.f r9 = r9.f70618d
            bw5.ig r9 = (bw5.ig) r9
            goto L59
        L58:
            r9 = r5
        L59:
            com.tencent.mm.plugin.finder.viewmodel.component.i00.a(r9)
            kotlinx.coroutines.flow.j2 r0 = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133881e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r1 = com.tencent.mm.plugin.finder.viewmodel.component.ig.f134741f
            kotlinx.coroutines.flow.h3 r0 = (kotlinx.coroutines.flow.h3) r0
            r0.k(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.bh r0 = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a
            com.tencent.mm.plugin.finder.viewmodel.component.bh.a(r0, r2, r9, r5)
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.og.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
