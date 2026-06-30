package z;

/* loaded from: classes14.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final z.e1 f468721a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f468722b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f468723c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f468724d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f468725e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f468726f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f468727g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.i0 f468728h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.i0 f468729i;

    /* renamed from: j, reason: collision with root package name */
    public final n0.v2 f468730j;

    /* renamed from: k, reason: collision with root package name */
    public long f468731k;

    /* renamed from: l, reason: collision with root package name */
    public final n0.e5 f468732l;

    public l2(z.e1 transitionState, java.lang.String str) {
        kotlin.jvm.internal.o.g(transitionState, "transitionState");
        this.f468721a = transitionState;
        this.f468722b = str;
        this.f468723c = n0.s4.c(b(), null, 2, null);
        this.f468724d = n0.s4.c(new z.e2(b(), b()), null, 2, null);
        this.f468725e = n0.s4.c(0L, null, 2, null);
        this.f468726f = n0.s4.c(Long.MIN_VALUE, null, 2, null);
        this.f468727g = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f468728h = new x0.i0();
        this.f468729i = new x0.i0();
        this.f468730j = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        this.f468732l = n0.s4.a(new z.j2(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (((java.lang.Boolean) ((n0.q4) r7.f468727g).getValue()).booleanValue() == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r8, n0.o r9, int r10) {
        /*
            r7 = this;
            java.lang.Object r0 = n0.e1.f333492a
            n0.y0 r9 = (n0.y0) r9
            r0 = -1493585151(0xffffffffa6f9b301, float:-1.7326365E-15)
            r9.V(r0)
            r0 = r10 & 14
            if (r0 != 0) goto L19
            boolean r0 = r9.e(r8)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r0 | r10
            goto L1a
        L19:
            r0 = r10
        L1a:
            r1 = r10 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L2a
            boolean r1 = r9.e(r7)
            if (r1 == 0) goto L27
            r1 = 32
            goto L29
        L27:
            r1 = 16
        L29:
            r0 = r0 | r1
        L2a:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L3b
            boolean r1 = r9.v()
            if (r1 != 0) goto L37
            goto L3b
        L37:
            r9.O()
            goto La6
        L3b:
            boolean r1 = r7.e()
            if (r1 != 0) goto La6
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r7.h(r8, r9, r1)
            java.lang.Object r1 = r7.b()
            boolean r1 = kotlin.jvm.internal.o.b(r8, r1)
            r2 = 0
            if (r1 == 0) goto L7d
            n0.v2 r1 = r7.f468726f
            n0.q4 r1 = (n0.q4) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            r5 = -9223372036854775808
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L6a
            r1 = 1
            goto L6b
        L6a:
            r1 = r2
        L6b:
            if (r1 != 0) goto L7d
            n0.v2 r1 = r7.f468727g
            n0.q4 r1 = (n0.q4) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La6
        L7d:
            int r0 = r0 >> 3
            r0 = r0 & 14
            r1 = 1157296644(0x44faf204, float:2007.563)
            r9.U(r1)
            boolean r1 = r9.e(r7)
            java.lang.Object r3 = r9.y()
            if (r1 != 0) goto L95
            java.lang.Object r1 = n0.n.f333620a
            if (r3 != r1) goto L9e
        L95:
            z.h2 r3 = new z.h2
            r1 = 0
            r3.<init>(r7, r1)
            r9.g0(r3)
        L9e:
            r9.o(r2)
            yz5.p r3 = (yz5.p) r3
            n0.d2.f(r7, r3, r9, r0)
        La6:
            n0.f4 r9 = r9.q()
            if (r9 != 0) goto Lad
            goto Lb6
        Lad:
            z.i2 r0 = new z.i2
            r0.<init>(r7, r8, r10)
            n0.l3 r9 = (n0.l3) r9
            r9.f333608d = r0
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.l2.a(java.lang.Object, n0.o, int):void");
    }

    public final java.lang.Object b() {
        return ((n0.q4) this.f468721a.f468642a).getValue();
    }

    public final z.d2 c() {
        return (z.d2) this.f468724d.getValue();
    }

    public final java.lang.Object d() {
        return this.f468723c.getValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) this.f468730j.getValue()).booleanValue();
    }

    public final void f(long j17, float f17) {
        n0.v2 v2Var = this.f468726f;
        long longValue = ((java.lang.Number) ((n0.q4) v2Var).getValue()).longValue();
        z.e1 e1Var = this.f468721a;
        if (longValue == Long.MIN_VALUE) {
            ((n0.q4) v2Var).setValue(java.lang.Long.valueOf(j17));
            ((n0.q4) e1Var.f468643b).setValue(java.lang.Boolean.TRUE);
        }
        ((n0.q4) this.f468727g).setValue(java.lang.Boolean.FALSE);
        long longValue2 = j17 - ((java.lang.Number) ((n0.q4) v2Var).getValue()).longValue();
        n0.v2 v2Var2 = this.f468725e;
        ((n0.q4) v2Var2).setValue(java.lang.Long.valueOf(longValue2));
        java.util.ListIterator listIterator = this.f468728h.listIterator();
        boolean z17 = true;
        while (true) {
            x0.s0 s0Var = (x0.s0) listIterator;
            if (!s0Var.hasNext()) {
                break;
            }
            z.f2 f2Var = (z.f2) s0Var.next();
            boolean booleanValue = ((java.lang.Boolean) ((n0.q4) f2Var.f468656h).getValue()).booleanValue();
            n0.v2 v2Var3 = f2Var.f468656h;
            if (!booleanValue) {
                long longValue3 = ((java.lang.Number) ((n0.q4) v2Var2).getValue()).longValue();
                boolean z18 = f17 == 0.0f;
                n0.v2 v2Var4 = f2Var.f468657i;
                long longValue4 = z18 ? f2Var.b().f468577h : ((float) (longValue3 - ((java.lang.Number) ((n0.q4) v2Var4).getValue()).longValue())) / f17;
                ((n0.q4) f2Var.f468659n).setValue(f2Var.b().e(longValue4));
                f2Var.f468660o = f2Var.b().g(longValue4);
                z.a2 b17 = f2Var.b();
                b17.getClass();
                if (z.k.a(b17, longValue4)) {
                    ((n0.q4) v2Var3).setValue(java.lang.Boolean.TRUE);
                    ((n0.q4) v2Var4).setValue(0L);
                }
            }
            if (!((java.lang.Boolean) ((n0.q4) v2Var3).getValue()).booleanValue()) {
                z17 = false;
            }
        }
        java.util.ListIterator listIterator2 = this.f468729i.listIterator();
        while (true) {
            x0.s0 s0Var2 = (x0.s0) listIterator2;
            if (!s0Var2.hasNext()) {
                break;
            }
            z.l2 l2Var = (z.l2) s0Var2.next();
            if (!kotlin.jvm.internal.o.b(l2Var.d(), l2Var.b())) {
                l2Var.f(((java.lang.Number) ((n0.q4) v2Var2).getValue()).longValue(), f17);
            }
            if (!kotlin.jvm.internal.o.b(l2Var.d(), l2Var.b())) {
                z17 = false;
            }
        }
        if (z17) {
            ((n0.q4) v2Var).setValue(Long.MIN_VALUE);
            ((n0.q4) e1Var.f468642a).setValue(d());
            ((n0.q4) v2Var2).setValue(0L);
            ((n0.q4) e1Var.f468643b).setValue(java.lang.Boolean.FALSE);
        }
    }

    public final void g(java.lang.Object obj, java.lang.Object obj2, long j17) {
        ((n0.q4) this.f468726f).setValue(Long.MIN_VALUE);
        z.e1 e1Var = this.f468721a;
        ((n0.q4) e1Var.f468643b).setValue(java.lang.Boolean.FALSE);
        if (!e() || !kotlin.jvm.internal.o.b(b(), obj) || !kotlin.jvm.internal.o.b(d(), obj2)) {
            ((n0.q4) e1Var.f468642a).setValue(obj);
            ((n0.q4) this.f468723c).setValue(obj2);
            ((n0.q4) this.f468730j).setValue(java.lang.Boolean.TRUE);
            ((n0.q4) this.f468724d).setValue(new z.e2(obj, obj2));
        }
        java.util.ListIterator listIterator = this.f468729i.listIterator();
        while (true) {
            x0.s0 s0Var = (x0.s0) listIterator;
            if (!s0Var.hasNext()) {
                break;
            }
            z.l2 l2Var = (z.l2) s0Var.next();
            if (l2Var.e()) {
                l2Var.g(l2Var.b(), l2Var.d(), j17);
            }
        }
        java.util.ListIterator listIterator2 = this.f468728h.listIterator();
        while (true) {
            x0.s0 s0Var2 = (x0.s0) listIterator2;
            if (!s0Var2.hasNext()) {
                this.f468731k = j17;
                return;
            }
            z.f2 f2Var = (z.f2) s0Var2.next();
            ((n0.q4) f2Var.f468659n).setValue(f2Var.b().e(j17));
            f2Var.f468660o = f2Var.b().g(j17);
        }
    }

    public final void h(java.lang.Object obj, n0.o oVar, int i17) {
        int i18;
        java.lang.Object obj2 = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-583974681);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(obj) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(this) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else if (!e() && !kotlin.jvm.internal.o.b(d(), obj)) {
            ((n0.q4) this.f468724d).setValue(new z.e2(d(), obj));
            ((n0.q4) this.f468721a.f468642a).setValue(d());
            ((n0.q4) this.f468723c).setValue(obj);
            if (!(((java.lang.Number) ((n0.q4) this.f468726f).getValue()).longValue() != Long.MIN_VALUE)) {
                ((n0.q4) this.f468727g).setValue(java.lang.Boolean.TRUE);
            }
            java.util.ListIterator listIterator = this.f468728h.listIterator();
            while (true) {
                x0.s0 s0Var = (x0.s0) listIterator;
                if (!s0Var.hasNext()) {
                    break;
                } else {
                    ((n0.q4) ((z.f2) s0Var.next()).f468658m).setValue(java.lang.Boolean.TRUE);
                }
            }
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f333608d = new z.k2(this, obj, i17);
        }
        java.lang.Object obj3 = n0.e1.f333492a;
    }
}
