package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes5.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117294d;

    /* renamed from: e, reason: collision with root package name */
    public int f117295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.u3 f117296f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.finder.live.viewmodel.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117296f = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.o3(this.f117296f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c4, code lost:
    
        if ((r0.length() > 0) == true) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f117295e
            com.tencent.mm.plugin.finder.live.viewmodel.u3 r2 = r14.f117296f
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r14.f117294d
            com.tencent.mm.plugin.finder.live.viewmodel.u3 r0 = (com.tencent.mm.plugin.finder.live.viewmodel.u3) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto Lad
        L14:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1c:
            kotlin.ResultKt.throwOnFailure(r15)
            r45.v11 r15 = r2.f117452i
            r1 = 0
            if (r15 == 0) goto Lb1
            r4 = 5
            com.tencent.mm.protobuf.f r15 = r15.getCustom(r4)
            r45.gs2 r15 = (r45.gs2) r15
            if (r15 == 0) goto Lb1
            r4 = 7
            java.lang.String r15 = r15.getString(r4)
            if (r15 == 0) goto Lb1
            java.lang.Class<s40.b1> r4 = s40.b1.class
            i95.m r4 = i95.n0.c(r4)
            s40.b1 r4 = (s40.b1) r4
            androidx.appcompat.app.AppCompatActivity r11 = r2.getActivity()
            r14.f117294d = r2
            r14.f117295e = r3
            r7 = r4
            com.tencent.mm.feature.finder.live.t6 r7 = (com.tencent.mm.feature.finder.live.t6) r7
            r7.getClass()
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = pz5.f.b(r14)
            r4.<init>(r5, r3)
            r4.k()
            kotlin.jvm.internal.h0 r12 = new kotlin.jvm.internal.h0
            r12.<init>()
            v65.n r8 = new v65.n
            r8.<init>(r4)
            com.tencent.mm.feature.finder.live.s6 r13 = new com.tencent.mm.feature.finder.live.s6
            r6 = 40005(0x9c45, float:5.6059E-41)
            r5 = r13
            r9 = r11
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r12.f310123d = r13
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "open_custom_style_url"
            r5.putExtra(r6, r3)
            java.lang.String r6 = "forceHideShare"
            r5.putExtra(r6, r3)
            java.lang.String r6 = "show_native_web_view"
            r5.putExtra(r6, r3)
            java.lang.String r6 = "rawUrl"
            r5.putExtra(r6, r15)
            java.lang.String r15 = "screen_orientation"
            r5.putExtra(r15, r3)
            boolean r15 = r11 instanceof com.tencent.mm.ui.MMActivity
            if (r15 == 0) goto L92
            r1 = r11
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.mm.ui.MMActivity) r1
        L92:
            if (r1 == 0) goto L9b
            java.lang.Object r15 = r12.f310123d
            com.tencent.mm.ui.xc r15 = (com.tencent.mm.ui.xc) r15
            r1.registerMMOnFragmentActivityResult(r15)
        L9b:
            java.lang.String r15 = ".ui.tools.WebViewUI"
            r1 = 40005(0x9c45, float:5.6059E-41)
            java.lang.String r6 = "webview"
            j45.l.n(r11, r6, r15, r5, r1)
            java.lang.Object r15 = r4.j()
            if (r15 != r0) goto Lac
            return r0
        Lac:
            r0 = r2
        Lad:
            r1 = r15
            java.lang.String r1 = (java.lang.String) r1
            goto Lb2
        Lb1:
            r0 = r2
        Lb2:
            r0.f117448e = r1
            android.view.View r15 = r2.f117449f
            java.lang.String r0 = r2.f117448e
            r1 = 0
            if (r0 == 0) goto Lc7
            int r0 = r0.length()
            if (r0 <= 0) goto Lc3
            r0 = r3
            goto Lc4
        Lc3:
            r0 = r1
        Lc4:
            if (r0 != r3) goto Lc7
            goto Lc8
        Lc7:
            r3 = r1
        Lc8:
            r2.V6(r15, r3)
            r2.U6()
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.o3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
