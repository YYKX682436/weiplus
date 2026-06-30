package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes5.dex */
public final class s3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117389d;

    /* renamed from: e, reason: collision with root package name */
    public int f117390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.u3 f117391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.plugin.finder.live.viewmodel.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117391f = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.s3(this.f117391f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.s3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r2 == null) goto L26;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f117390e
            r2 = 0
            r3 = 0
            r4 = 1
            com.tencent.mm.plugin.finder.live.viewmodel.u3 r5 = r9.f117391f
            if (r1 == 0) goto L1d
            if (r1 != r4) goto L15
            java.lang.Object r0 = r9.f117389d
            com.tencent.mm.ui.widget.dialog.u3 r0 = (com.tencent.mm.ui.widget.dialog.u3) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L56
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            kotlin.ResultKt.throwOnFailure(r10)
            android.app.Activity r10 = r5.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r5.getActivity()
            r6 = 2131770609(0x7f103cf1, float:1.9172526E38)
            java.lang.String r1 = r1.getString(r6)
            com.tencent.mm.ui.widget.dialog.u3 r10 = com.tencent.mm.ui.widget.dialog.u3.f(r10, r1, r4, r3, r2)
            java.lang.Class<s40.b1> r1 = s40.b1.class
            i95.m r1 = i95.n0.c(r1)
            s40.b1 r1 = (s40.b1) r1
            android.app.Activity r6 = r5.getContext()
            java.lang.String r7 = r5.f117448e
            if (r7 != 0) goto L45
            java.lang.String r7 = ""
        L45:
            java.lang.String r8 = r5.f117447d
            r9.f117389d = r10
            r9.f117390e = r4
            com.tencent.mm.feature.finder.live.t6 r1 = (com.tencent.mm.feature.finder.live.t6) r1
            java.lang.Object r1 = r1.Bi(r6, r7, r8, r9)
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = r10
            r10 = r1
        L56:
            com.tencent.mm.modelbase.f r10 = (com.tencent.mm.modelbase.f) r10
            r0.dismiss()
            boolean r0 = r10.b()
            if (r0 == 0) goto L7c
            androidx.appcompat.app.AppCompatActivity r10 = r5.getActivity()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "FinderLiveCashOutMultiAuthUIC.KEY_SUCCESS"
            android.content.Intent r0 = r0.putExtra(r1, r4)
            r1 = -1
            r10.setResult(r1, r0)
            androidx.appcompat.app.AppCompatActivity r10 = r5.getActivity()
            r10.finish()
            goto Lcb
        L7c:
            androidx.appcompat.app.AppCompatActivity r0 = r5.getActivity()
            com.tencent.mm.ui.widget.dialog.a r1 = new com.tencent.mm.ui.widget.dialog.a
            r1.<init>()
            java.lang.String r10 = r10.f70617c
            if (r10 == 0) goto L95
            int r6 = r10.length()
            if (r6 <= 0) goto L90
            r3 = r4
        L90:
            if (r3 == 0) goto L93
            r2 = r10
        L93:
            if (r2 != 0) goto La5
        L95:
            androidx.appcompat.app.AppCompatActivity r10 = r5.getActivity()
            r2 = 2131780989(0x7f10657d, float:1.9193579E38)
            java.lang.String r2 = r10.getString(r2)
            java.lang.String r10 = "getString(...)"
            kotlin.jvm.internal.o.f(r2, r10)
        La5:
            r1.f211729s = r2
            android.content.res.Resources r10 = of5.b.a(r0)
            r2 = 2131756151(0x7f100477, float:1.9143201E38)
            java.lang.String r10 = r10.getString(r2)
            r1.f211732v = r10
            com.tencent.mm.ui.widget.dialog.j0 r10 = new com.tencent.mm.ui.widget.dialog.j0
            r2 = 2131821911(0x7f110557, float:1.9276579E38)
            r10.<init>(r0, r2)
            r10.e(r1)
            com.tencent.mm.ui.widget.dialog.d0 r0 = r1.f211723m
            if (r0 == 0) goto Lc8
            android.widget.EditText r1 = r10.f211837r
            r0.a(r1)
        Lc8:
            r10.show()
        Lcb:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.s3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
