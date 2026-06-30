package xc2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.e f453111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f453112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.w0 f453113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f453114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453115h;

    public d(xc2.e eVar, android.view.View view, xc2.w0 w0Var, in5.s0 s0Var, java.lang.String str) {
        this.f453111d = eVar;
        this.f453112e = view;
        this.f453113f = w0Var;
        this.f453114g = s0Var;
        this.f453115h = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r27 = this;
            r0 = r27
            xc2.e r1 = r0.f453111d
            android.view.View r2 = r0.f453112e
            xc2.w0 r3 = r0.f453113f
            r1.B(r2, r3)
            in5.s0 r1 = r0.f453114g
            android.content.Context r2 = r1.f293121e
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            boolean r5 = r2 instanceof com.tencent.mm.ui.MMFragmentActivity
            if (r5 == 0) goto L29
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            pf5.z r5 = pf5.z.f353948a
            pf5.v r2 = r5.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r5 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r2 = r2.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r2
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L30
            java.lang.String r5 = r2.f135382p
            if (r5 != 0) goto L32
        L30:
            java.lang.String r5 = ""
        L32:
            r8 = r5
            android.content.Context r1 = r1.f293121e
            kotlin.jvm.internal.o.f(r1, r4)
            pf5.z r4 = pf5.z.f353948a
            boolean r5 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            if (r5 == 0) goto Lb6
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            pf5.v r1 = r4.a(r1)
            java.lang.Class<sc2.a8> r4 = sc2.a8.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            sc2.a8 r1 = (sc2.a8) r1
            long r4 = r1.f405766y
            java.lang.String r1 = "comment"
            java.lang.String r7 = r0.f453115h
            boolean r1 = kotlin.jvm.internal.o.b(r1, r7)
            if (r1 == 0) goto L5c
            r1 = 2
        L59:
            r22 = r1
            goto L72
        L5c:
            java.lang.String r1 = "TWO_FLOW"
            boolean r1 = kotlin.jvm.internal.o.b(r1, r7)
            if (r1 == 0) goto L66
            r1 = 4
            goto L59
        L66:
            java.lang.String r1 = "single_comment"
            boolean r1 = kotlin.jvm.internal.o.b(r1, r7)
            if (r1 == 0) goto L70
            r1 = 5
            goto L59
        L70:
            r22 = 1
        L72:
            boolean r1 = r3.f453320l
            if (r1 != 0) goto Lb5
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r1 = com.tencent.mm.plugin.finder.report.o3.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r7 = "getService(...)"
            kotlin.jvm.internal.o.f(r1, r7)
            r7 = r1
            com.tencent.mm.plugin.finder.report.o3 r7 = (com.tencent.mm.plugin.finder.report.o3) r7
            r9 = 0
            r10 = 0
            cl0.g r11 = r3.f453227f
            int r12 = r3.f453321m
            int r13 = r3.f453322n
            r1 = 0
            r16 = 0
            java.lang.String r6 = r3.f453231j
            long r14 = r3.f453230i
            r23 = 0
            if (r2 == 0) goto L9e
            r45.qt2 r2 = r2.V6()
            r24 = r2
            goto La0
        L9e:
            r24 = 0
        La0:
            r25 = 8640(0x21c0, float:1.2107E-41)
            r26 = 0
            r19 = r14
            r2 = 0
            r14 = r2
            r2 = 1
            r15 = r1
            r17 = r6
            r18 = r19
            r20 = r4
            com.tencent.mm.plugin.finder.report.o3.Pk(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            r3.f453320l = r2
        Lb5:
            return
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.d.run():void");
    }
}
