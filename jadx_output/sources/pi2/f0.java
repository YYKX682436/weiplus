package pi2;

/* loaded from: classes10.dex */
public final class f0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354775a;

    public f0(pi2.q0 q0Var) {
        this.f354775a = q0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (kotlin.jvm.internal.o.b(r6.f262157s.getText().toString(), "0") != false) goto L23;
     */
    @Override // al5.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStatusChange(boolean r6) {
        /*
            r5 = this;
            pi2.q0 r0 = r5.f354775a
            fg2.m1 r1 = r0.X
            r2 = 0
            java.lang.String r3 = "uiBinding"
            if (r1 == 0) goto L76
            r4 = 0
            if (r6 == 0) goto Lf
            r6 = r4
            goto L11
        Lf:
            r6 = 8
        L11:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.f262156r
            r1.setVisibility(r6)
            fg2.m1 r6 = r0.X
            if (r6 == 0) goto L72
            android.widget.TextView r6 = r6.f262157s
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L28
            int r6 = r6.length()
            if (r6 != 0) goto L29
        L28:
            r4 = 1
        L29:
            if (r4 != 0) goto L46
            fg2.m1 r6 = r0.X
            if (r6 == 0) goto L42
            android.widget.TextView r6 = r6.f262157s
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "0"
            boolean r6 = kotlin.jvm.internal.o.b(r6, r1)
            if (r6 == 0) goto L6e
            goto L46
        L42:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        L46:
            gk2.e r6 = r0.H
            java.lang.Class<mm2.g5> r1 = mm2.g5.class
            androidx.lifecycle.c1 r6 = r6.a(r1)
            mm2.g5 r6 = (mm2.g5) r6
            r45.p52 r6 = r6.f329090g
            if (r6 == 0) goto L6e
            r1 = 3
            java.util.LinkedList r6 = r6.getList(r1)
            if (r6 == 0) goto L6e
            java.lang.Object r6 = kz5.n0.Z(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L6e
            int r6 = r6.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0.i0(r6, r1)
        L6e:
            r0.e0()
            return
        L72:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        L76:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pi2.f0.onStatusChange(boolean):void");
    }
}
