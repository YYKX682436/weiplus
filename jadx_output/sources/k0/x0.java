package k0;

/* loaded from: classes14.dex */
public final class x0 implements j0.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f302971a;

    public x0(k0.y0 y0Var) {
        this.f302971a = y0Var;
    }

    @Override // j0.l3
    public void a(long j17) {
    }

    @Override // j0.l3
    public void b(long j17) {
        j0.d5 d5Var;
        k0.y0 y0Var = this.f302971a;
        if (y0Var.j().f267693a.f681d.length() == 0) {
            return;
        }
        long f17 = d1.e.f(y0Var.f302987m, j17);
        y0Var.f302987m = f17;
        j0.c5 c5Var = y0Var.f302978d;
        if (c5Var != null && (d5Var = c5Var.f296239g) != null) {
            d1.e eVar = new d1.e(d1.e.f(y0Var.f302985k, f17));
            n0.v2 v2Var = y0Var.f302989o;
            ((n0.q4) v2Var).setValue(eVar);
            java.lang.Integer num = y0Var.f302986l;
            int intValue = num != null ? num.intValue() : d5Var.b(y0Var.f302985k, false);
            d1.e eVar2 = (d1.e) ((n0.q4) v2Var).getValue();
            kotlin.jvm.internal.o.d(eVar2);
            k0.y0.c(y0Var, y0Var.j(), intValue, d5Var.b(eVar2.f225627a, false), false, k0.u.f302964c);
        }
        j0.c5 c5Var2 = y0Var.f302978d;
        if (c5Var2 == null) {
            return;
        }
        c5Var2.f296241i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    @Override // j0.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r10) {
        /*
            r9 = this;
            k0.y0 r6 = r9.f302971a
            n0.v2 r0 = r6.f302988n
            n0.q4 r0 = (n0.q4) r0
            java.lang.Object r0 = r0.getValue()
            j0.u1 r0 = (j0.u1) r0
            if (r0 == 0) goto Lf
            return
        Lf:
            j0.u1 r0 = j0.u1.SelectionEnd
            n0.v2 r1 = r6.f302988n
            n0.q4 r1 = (n0.q4) r1
            r1.setValue(r0)
            j0.c5 r0 = r6.f302978d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L53
            j0.d5 r0 = r0.f296239g
            if (r0 == 0) goto L53
            long r3 = r0.a(r10)
            long r3 = r0.c(r3)
            float r5 = d1.e.d(r3)
            a2.k1 r0 = r0.f296265a
            int r5 = r0.g(r5)
            float r7 = d1.e.c(r3)
            float r8 = r0.h(r5)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L4e
            float r3 = d1.e.c(r3)
            float r0 = r0.i(r5)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L4e
            r0 = r1
            goto L4f
        L4e:
            r0 = r2
        L4f:
            if (r0 != r1) goto L53
            r0 = r1
            goto L54
        L53:
            r0 = r2
        L54:
            if (r0 != 0) goto La6
            j0.c5 r0 = r6.f302978d
            if (r0 == 0) goto La6
            j0.d5 r0 = r0.f296239g
            if (r0 == 0) goto La6
            g2.v r1 = r6.f302976b
            float r10 = d1.e.d(r10)
            r11 = 0
            long r10 = d1.f.a(r11, r10)
            long r10 = r0.a(r10)
            long r10 = r0.c(r10)
            float r10 = d1.e.d(r10)
            a2.k1 r11 = r0.f296265a
            int r10 = r11.g(r10)
            int r10 = r11.e(r10, r2)
            g2.t r1 = (g2.t) r1
            r1.getClass()
            k1.a r11 = r6.f302982h
            if (r11 == 0) goto L8f
            r0 = 9
            k1.b r11 = (k1.b) r11
            r11.a(r0)
        L8f:
            g2.e0 r11 = r6.j()
            a2.d r11 = r11.f267693a
            long r0 = a2.n1.a(r10, r10)
            g2.e0 r10 = r6.e(r11, r0)
            r6.h()
            yz5.l r11 = r6.f302977c
            r11.invoke(r10)
            return
        La6:
            g2.e0 r0 = r6.j()
            a2.d r0 = r0.f267693a
            java.lang.String r0 = r0.f681d
            int r0 = r0.length()
            if (r0 != 0) goto Lb5
            r2 = r1
        Lb5:
            if (r2 == 0) goto Lb8
            return
        Lb8:
            r6.h()
            j0.c5 r0 = r6.f302978d
            if (r0 == 0) goto Lda
            j0.d5 r0 = r0.f296239g
            if (r0 == 0) goto Lda
            int r7 = r0.b(r10, r1)
            g2.e0 r1 = r6.j()
            r4 = 0
            k0.v r5 = k0.u.f302964c
            r0 = r6
            r2 = r7
            r3 = r7
            k0.y0.c(r0, r1, r2, r3, r4, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r6.f302986l = r0
        Lda:
            r6.f302985k = r10
            d1.e r0 = new d1.e
            r0.<init>(r10)
            n0.v2 r10 = r6.f302989o
            n0.q4 r10 = (n0.q4) r10
            r10.setValue(r0)
            long r10 = d1.e.f225623b
            r6.f302987m = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.x0.c(long):void");
    }

    @Override // j0.l3
    public void d() {
    }

    @Override // j0.l3
    public void onCancel() {
    }

    @Override // j0.l3
    public void onStop() {
        k0.y0 y0Var = this.f302971a;
        k0.y0.b(y0Var, null);
        k0.y0.a(y0Var, null);
        j0.c5 c5Var = y0Var.f302978d;
        if (c5Var != null) {
            c5Var.f296241i = true;
        }
        androidx.compose.ui.platform.c4 c4Var = y0Var.f302981g;
        if ((c4Var != null ? ((androidx.compose.ui.platform.c1) c4Var).f10530d : null) == androidx.compose.ui.platform.e4.Hidden) {
            y0Var.n();
        }
        y0Var.f302986l = null;
    }
}
