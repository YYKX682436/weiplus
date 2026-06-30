package vd0;

/* loaded from: classes5.dex */
public final class q2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435493d;

    public q2(android.content.Context context) {
        this.f435493d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        if (r9.isShowing() == true) goto L17;
     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            java.lang.String r8 = "context"
            android.content.Context r9 = r7.f435493d
            kotlin.jvm.internal.o.g(r9, r8)
            pf5.z r8 = pf5.z.f353948a
            boolean r0 = r9 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto La2
            androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9
            pf5.v r8 = r8.a(r9)
            java.lang.Class<com.tencent.mm.plugin.setting.ui.setting.i0> r9 = com.tencent.mm.plugin.setting.ui.setting.i0.class
            androidx.lifecycle.c1 r8 = r8.a(r9)
            java.lang.String r9 = "get(...)"
            kotlin.jvm.internal.o.f(r8, r9)
            com.tencent.mm.plugin.setting.ui.setting.i0 r8 = (com.tencent.mm.plugin.setting.ui.setting.i0) r8
            int r9 = r8.V6()
            java.util.List r0 = com.tencent.mm.plugin.setting.ui.setting.i0.D
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r0 = r0.contains(r1)
            r1 = 2
            java.lang.Class<kd0.x2> r2 = kd0.x2.class
            if (r0 == 0) goto L5c
            jz5.g r0 = com.tencent.mm.plugin.setting.ui.setting.m.f161305e
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L44
            goto L5c
        L44:
            i95.m r9 = i95.n0.c(r2)
            kd0.x2 r9 = (kd0.x2) r9
            java.lang.String r0 = r8.f161131q
            jd0.q2 r9 = (jd0.q2) r9
            r9.getClass()
            g21.a r9 = new g21.a
            r2 = 994(0x3e2, float:1.393E-42)
            r9.<init>(r0, r2, r1)
            r8.S6(r9)
            goto L77
        L5c:
            i95.m r0 = i95.n0.c(r2)
            kd0.x2 r0 = (kd0.x2) r0
            java.lang.String r2 = r8.f161131q
            v24.v r3 = v24.v.f432957a
            java.lang.String r3 = r3.f(r9)
            jd0.q2 r0 = (jd0.q2) r0
            r0.getClass()
            g21.a r0 = new g21.a
            r0.<init>(r2, r9, r1, r3)
            r8.S6(r0)
        L77:
            com.tencent.mm.ui.widget.dialog.u3 r9 = r8.f161132r
            if (r9 == 0) goto L83
            boolean r9 = r9.isShowing()
            r0 = 1
            if (r9 != r0) goto L83
            goto L84
        L83:
            r0 = 0
        L84:
            if (r0 != 0) goto La1
            android.app.Activity r1 = r8.getContext()
            r9 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r2 = r8.getString(r9)
            r9 = 2131773388(0x7f1047cc, float:1.9178162E38)
            java.lang.String r3 = r8.getString(r9)
            r4 = 1
            r5 = 1
            r6 = 0
            com.tencent.mm.ui.widget.dialog.u3 r9 = db5.e1.Q(r1, r2, r3, r4, r5, r6)
            r8.f161132r = r9
        La1:
            return
        La2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vd0.q2.onClick(android.content.DialogInterface, int):void");
    }
}
