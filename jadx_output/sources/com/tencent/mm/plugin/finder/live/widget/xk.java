package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120344e;

    /* renamed from: f, reason: collision with root package name */
    public int f120345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f120346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120347h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f120348i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120349m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120350n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120351o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120352p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f120353q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f120354r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120355s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f120356t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(com.tencent.mm.plugin.finder.live.widget.hl hlVar, java.lang.String str, boolean z17, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, java.lang.String str2, kotlin.jvm.internal.g0 g0Var, java.util.LinkedList linkedList, kotlin.jvm.internal.h0 h0Var4, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120346g = hlVar;
        this.f120347h = str;
        this.f120348i = z17;
        this.f120349m = h0Var;
        this.f120350n = h0Var2;
        this.f120351o = h0Var3;
        this.f120352p = str2;
        this.f120353q = g0Var;
        this.f120354r = linkedList;
        this.f120355s = h0Var4;
        this.f120356t = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.xk(this.f120346g, this.f120347h, this.f120348i, this.f120349m, this.f120350n, this.f120351o, this.f120352p, this.f120353q, this.f120354r, this.f120355s, this.f120356t, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.xk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[RETURN] */
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
            int r2 = r0.f120345f
            r3 = 2
            r4 = 0
            com.tencent.mm.plugin.finder.live.widget.hl r5 = r0.f120346g
            r6 = 1
            if (r2 == 0) goto L2a
            if (r2 == r6) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r18)
            goto Lc8
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1e:
            java.lang.Object r2 = r0.f120344e
            kotlin.jvm.internal.h0 r2 = (kotlin.jvm.internal.h0) r2
            java.lang.Object r7 = r0.f120343d
            xk2.c r7 = (xk2.c) r7
            kotlin.ResultKt.throwOnFailure(r18)
            goto L5a
        L2a:
            kotlin.ResultKt.throwOnFailure(r18)
            com.tencent.mm.view.MMPAGView r2 = r5.f118573a
            java.lang.String r7 = r0.f120347h
            r2.setComposition(r7)
            com.tencent.mm.view.MMPAGView r2 = r5.f118573a
            r2.d()
            boolean r2 = r0.f120348i
            if (r2 == 0) goto L5c
            xk2.c r7 = new xk2.c
            r7.<init>()
            kk4.c r2 = r7.f455018a
            kk4.f0 r2 = (kk4.f0) r2
            r2.setLoopback(r4)
            r0.f120343d = r7
            kotlin.jvm.internal.h0 r2 = r0.f120349m
            r0.f120344e = r2
            r0.f120345f = r6
            java.lang.String r8 = r0.f120352p
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2.f310123d = r7
        L5c:
            com.tencent.mm.view.MMPAGView r2 = r5.f118573a
            android.content.Context r2 = r2.getContext()
            java.lang.String r7 = "vibrator"
            java.lang.Object r15 = r2.getSystemService(r7)
            kotlin.jvm.internal.h0 r2 = r0.f120350n
            java.lang.Object r7 = r2.f310123d
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L7a
            int r7 = r7.length()
            if (r7 != 0) goto L78
            goto L7a
        L78:
            r7 = r4
            goto L7b
        L7a:
            r7 = r6
        L7b:
            if (r7 != 0) goto L9b
            kotlin.jvm.internal.h0 r7 = r0.f120351o
            java.lang.Object r8 = r7.f310123d
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L8b
            int r8 = r8.length()
            if (r8 != 0) goto L8c
        L8b:
            r4 = r6
        L8c:
            if (r4 != 0) goto L9b
            java.lang.Object r4 = r7.f310123d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.f310123d
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.mm.view.MMPAGView r5 = r5.f118573a
            r5.l(r4, r2)
        L9b:
            java.lang.String r2 = "FinderLiveGiftPlayPagWidget"
            java.lang.String r4 = "playFundingTaskAnim ready"
            com.tencent.mars.xlog.Log.i(r2, r4)
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r2 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.live.widget.wk r4 = new com.tencent.mm.plugin.finder.live.widget.wk
            com.tencent.mm.plugin.finder.live.widget.hl r9 = r0.f120346g
            kotlin.jvm.internal.g0 r10 = r0.f120353q
            kotlin.jvm.internal.h0 r11 = r0.f120349m
            java.util.LinkedList r12 = r0.f120354r
            kotlin.jvm.internal.h0 r13 = r0.f120355s
            kotlinx.coroutines.y0 r14 = r0.f120356t
            r16 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = 0
            r0.f120343d = r5
            r0.f120344e = r5
            r0.f120345f = r3
            java.lang.Object r2 = kotlinx.coroutines.l.g(r2, r4, r0)
            if (r2 != r1) goto Lc8
            return r1
        Lc8:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.xk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
