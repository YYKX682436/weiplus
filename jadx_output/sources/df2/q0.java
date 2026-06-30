package df2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f231122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231123f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(df2.v0 v0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231122e = v0Var;
        this.f231123f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.q0(this.f231122e, this.f231123f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f231121d
            r3 = 1
            r4 = 0
            java.lang.String r5 = r0.f231123f
            df2.v0 r6 = r0.f231122e
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r18
            goto L3a
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            kotlin.ResultKt.throwOnFailure(r18)
            df2.v0.a7(r6)
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r5)
            if (r2 == 0) goto L3e
            r0.f231121d = r3
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310570c
            zl2.j r3 = new zl2.j
            r3.<init>(r5, r4)
            java.lang.Object r2 = kotlinx.coroutines.l.g(r2, r3, r0)
            if (r2 != r1) goto L3a
            return r1
        L3a:
            java.lang.String r2 = (java.lang.String) r2
            r9 = r2
            goto L47
        L3e:
            boolean r1 = com.tencent.mm.vfs.w6.j(r5)
            if (r1 == 0) goto L46
            r9 = r5
            goto L47
        L46:
            r9 = r4
        L47:
            com.tencent.mm.ui.widget.dialog.u3 r1 = r6.f231576q
            if (r1 == 0) goto L4e
            r1.dismiss()
        L4e:
            az2.j r1 = r6.f231575p
            if (r1 == 0) goto L55
            r1.j()
        L55:
            r6.f231576q = r4
            if (r9 == 0) goto L80
            r45.yg7 r1 = r45.yg7.FinderLiveImgSource_FinderAvatar
            r6.f231574o = r1
            com.tencent.mm.ui.MMActivity r8 = r6.N6()
            if (r8 == 0) goto L96
            zl2.k r7 = zl2.k.f473851a
            r10 = 100115(0x18713, float:1.40291E-40)
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r5)
            if (r1 == 0) goto L70
            r11 = r5
            goto L71
        L70:
            r11 = r4
        L71:
            boolean r12 = r6.c7()
            r45.bo1 r13 = r45.bo1.FinderLiveCoverImageEnhanceScene_ChangeCover
            r14 = 0
            r15 = 64
            r16 = 0
            zl2.k.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L96
        L80:
            com.tencent.mm.ui.MMActivity r1 = r6.N6()
            android.content.Context r2 = r6.O6()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131780989(0x7f10657d, float:1.9193579E38)
            java.lang.String r2 = r2.getString(r3)
            db5.t7.g(r1, r2)
        L96:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
