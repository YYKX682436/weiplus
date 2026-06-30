package z;

/* loaded from: classes14.dex */
public final class f2 implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final z.w2 f468652d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f468653e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.v2 f468654f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.v2 f468655g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.v2 f468656h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.v2 f468657i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f468658m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f468659n;

    /* renamed from: o, reason: collision with root package name */
    public z.w f468660o;

    /* renamed from: p, reason: collision with root package name */
    public final z.k0 f468661p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468662q;

    public f2(z.l2 l2Var, java.lang.Object obj, z.w initialVelocityVector, z.w2 typeConverter, java.lang.String label) {
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(initialVelocityVector, "initialVelocityVector");
        kotlin.jvm.internal.o.g(typeConverter, "typeConverter");
        kotlin.jvm.internal.o.g(label, "label");
        this.f468662q = l2Var;
        this.f468652d = typeConverter;
        n0.v2 c17 = n0.s4.c(obj, null, 2, null);
        this.f468653e = c17;
        n0.v2 c18 = n0.s4.c(z.q.c(0.0f, 0.0f, null, 7, null), null, 2, null);
        this.f468654f = c18;
        this.f468655g = n0.s4.c(new z.a2((z.k0) ((n0.q4) c18).getValue(), typeConverter, obj, ((n0.q4) c17).getValue(), initialVelocityVector), null, 2, null);
        this.f468656h = n0.s4.c(java.lang.Boolean.TRUE, null, 2, null);
        this.f468657i = n0.s4.c(0L, null, 2, null);
        this.f468658m = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
        this.f468659n = n0.s4.c(obj, null, 2, null);
        this.f468660o = initialVelocityVector;
        java.lang.Float f17 = (java.lang.Float) z.f4.f468664a.get(typeConverter);
        if (f17 != null) {
            float floatValue = f17.floatValue();
            z.w wVar = (z.w) ((z.x2) typeConverter).f468873a.invoke(obj);
            int b17 = wVar.b();
            for (int i17 = 0; i17 < b17; i17++) {
                wVar.e(i17, floatValue);
            }
            obj2 = ((z.x2) this.f468652d).f468874b.invoke(wVar);
        } else {
            obj2 = null;
        }
        this.f468661p = z.q.c(0.0f, 0.0f, obj2, 3, null);
    }

    public static void c(z.f2 f2Var, java.lang.Object obj, boolean z17, int i17, java.lang.Object obj2) {
        if ((i17 & 1) != 0) {
            obj = f2Var.getValue();
        }
        java.lang.Object obj3 = obj;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        ((n0.q4) f2Var.f468655g).setValue(new z.a2(z17 ? ((z.k0) ((n0.q4) f2Var.f468654f).getValue()) instanceof z.p1 ? (z.k0) ((n0.q4) f2Var.f468654f).getValue() : f2Var.f468661p : (z.k0) ((n0.q4) f2Var.f468654f).getValue(), f2Var.f468652d, obj3, ((n0.q4) f2Var.f468653e).getValue(), f2Var.f468660o));
        z.l2 l2Var = f2Var.f468662q;
        ((n0.q4) l2Var.f468727g).setValue(java.lang.Boolean.TRUE);
        if (!l2Var.e()) {
            return;
        }
        java.util.ListIterator listIterator = l2Var.f468728h.listIterator();
        long j17 = 0;
        while (true) {
            x0.s0 s0Var = (x0.s0) listIterator;
            if (!s0Var.hasNext()) {
                ((n0.q4) l2Var.f468727g).setValue(java.lang.Boolean.FALSE);
                return;
            }
            z.f2 f2Var2 = (z.f2) s0Var.next();
            j17 = java.lang.Math.max(j17, f2Var2.b().f468577h);
            long j18 = l2Var.f468731k;
            ((n0.q4) f2Var2.f468659n).setValue(f2Var2.b().e(j18));
            f2Var2.f468660o = f2Var2.b().g(j18);
        }
    }

    public final z.a2 b() {
        return (z.a2) this.f468655g.getValue();
    }

    public final void d(java.lang.Object obj, java.lang.Object obj2, z.k0 animationSpec) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        ((n0.q4) this.f468653e).setValue(obj2);
        ((n0.q4) this.f468654f).setValue(animationSpec);
        if (kotlin.jvm.internal.o.b(b().f468572c, obj) && kotlin.jvm.internal.o.b(b().f468573d, obj2)) {
            return;
        }
        c(this, obj, false, 2, null);
    }

    public final void e(java.lang.Object obj, z.k0 animationSpec) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        n0.v2 v2Var = this.f468653e;
        boolean b17 = kotlin.jvm.internal.o.b(((n0.q4) v2Var).getValue(), obj);
        n0.v2 v2Var2 = this.f468658m;
        if (!b17 || ((java.lang.Boolean) ((n0.q4) v2Var2).getValue()).booleanValue()) {
            ((n0.q4) v2Var).setValue(obj);
            ((n0.q4) this.f468654f).setValue(animationSpec);
            n0.v2 v2Var3 = this.f468656h;
            c(this, null, !((java.lang.Boolean) ((n0.q4) v2Var3).getValue()).booleanValue(), 1, null);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ((n0.q4) v2Var3).setValue(bool);
            ((n0.q4) this.f468657i).setValue(java.lang.Long.valueOf(((java.lang.Number) ((n0.q4) this.f468662q.f468725e).getValue()).longValue()));
            ((n0.q4) v2Var2).setValue(bool);
        }
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        return this.f468659n.getValue();
    }
}
