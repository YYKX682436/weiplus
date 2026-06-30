package um2;

/* loaded from: classes13.dex */
public final class f6 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f428799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f428800f;

    public f6(um2.x5 x5Var, android.app.Activity activity, android.view.ViewGroup viewGroup) {
        this.f428798d = x5Var;
        this.f428799e = activity;
        this.f428800f = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            um2.x5 r13 = r11.f428798d
            java.lang.String r0 = r13.f429032f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "watchShoppingAvailable shoppingAvailableState "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            if (r12 == 0) goto Lc0
            java.lang.String r12 = "activity"
            android.app.Activity r0 = r11.f428799e
            kotlin.jvm.internal.o.g(r0, r12)
            jz5.g r12 = r13.K
            jz5.n r12 = (jz5.n) r12
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lc0
            com.tencent.mm.plugin.finder.live.plugin.ga0 r12 = r13.f429021J
            if (r12 != 0) goto Lc0
            fh5.e r12 = r13.L
            r1 = 1
            if (r12 == 0) goto L48
            fh5.b r12 = r12.f262724c
            kotlin.jvm.internal.o.d(r12)
            boolean r12 = r12.f262719e
            if (r12 != r1) goto L48
            r12 = r1
            goto L49
        L48:
            r12 = 0
        L49:
            if (r12 != 0) goto Lc0
            fh5.e r12 = r13.L
            if (r12 == 0) goto L59
            java.util.concurrent.Future r12 = r12.f262725d
            kotlin.jvm.internal.o.d(r12)
            xn5.d1 r12 = (xn5.d1) r12
            r12.cancel(r1)
        L59:
            android.view.ViewGroup r12 = r11.f428800f
            if (r12 != 0) goto L75
            xy2.b r1 = xy2.b.f458155b
            java.lang.String r2 = "liveInitContentViewError"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 124(0x7c, float:1.74E-43)
            r10 = 0
            pm0.z.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r12 = "asyncInflateShoppingPlugin root is empty!"
            java.lang.String r13 = r13.f429032f
            com.tencent.mars.xlog.Log.e(r13, r12)
            goto Lc0
        L75:
            fh5.e r1 = new fh5.e
            r1.<init>(r0)
            um2.d6 r2 = new um2.d6
            r2.<init>(r13, r12, r0)
            m3.g r0 = fh5.e.f262721f
            java.lang.Object r0 = r0.a()
            fh5.a r0 = (fh5.a) r0
            if (r0 != 0) goto L8e
            fh5.a r0 = new fh5.a
            r0.<init>()
        L8e:
            r0.f262712a = r1
            r3 = 2131496169(0x7f0c0ce9, float:1.8615895E38)
            r0.f262714c = r3
            r0.f262713b = r12
            r0.f262716e = r2
            r12 = 0
            r0.f262717f = r12
            fh5.b r12 = new fh5.b
            r12.<init>(r0)
            r1.f262724c = r12
            java.lang.Class<yn5.e> r0 = yn5.e.class
            i95.m r0 = i95.n0.c(r0)
            yn5.e r0 = (yn5.e) r0
            xn5.a r0 = (xn5.a) r0
            r0.getClass()
            xn5.e1 r0 = xn5.e1.f455663a
            xn5.d1 r0 = new xn5.d1
            r0.<init>(r12, r12)
            android.os.Handler r2 = xn5.e1.f455666d
            r2.post(r12)
            r1.f262725d = r0
            r13.L = r1
        Lc0:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: um2.f6.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
