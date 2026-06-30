package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ce extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f117993d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.progress.RoundProgressBtn f117994e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f117995f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f117996g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f117997h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f117998i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f117999m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f118000n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f118001o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.fe f118002p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(com.tencent.mm.plugin.finder.live.widget.fe feVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f118002p = feVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.i9v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117993d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.i9w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f117994e = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.ex_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f117995f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.ex6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f117996g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.ex8);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f117997h = findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.ex9);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f117998i = findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.ex7);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f117999m = findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.f484621ex5);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f118000n = (android.widget.ImageView) findViewById8;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r23, boolean r24, java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.ce.i(java.lang.String, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r7, int r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.tencent.mm.plugin.finder.live.widget.ae
            if (r0 == 0) goto L13
            r0 = r10
            com.tencent.mm.plugin.finder.live.widget.ae r0 = (com.tencent.mm.plugin.finder.live.widget.ae) r0
            int r1 = r0.f117762i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117762i = r1
            goto L18
        L13:
            com.tencent.mm.plugin.finder.live.widget.ae r0 = new com.tencent.mm.plugin.finder.live.widget.ae
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f117760g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f117762i
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r7 = r0.f117759f
            int r8 = r0.f117758e
            java.lang.Object r9 = r0.f117757d
            com.tencent.mm.plugin.finder.live.widget.ce r9 = (com.tencent.mm.plugin.finder.live.widget.ce) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L3d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 == 0) goto L59
            r9 = r6
        L3d:
            if (r7 >= r8) goto L5e
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r10 = r9.f117994e
            int r2 = r7 + 1
            r10.setProgress(r7)
            r0.f117757d = r9
            r0.f117758e = r8
            r0.f117759f = r2
            r0.f117762i = r3
            r4 = 10
            java.lang.Object r7 = kotlinx.coroutines.k1.b(r4, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            r7 = r2
            goto L3d
        L59:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r7 = r6.f117994e
            r7.setProgress(r8)
        L5e:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.ce.j(int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
