package n06;

/* loaded from: classes15.dex */
public final class b0 implements q06.b, q06.f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f333939i = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(n06.b0.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(n06.b0.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(n06.b0.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a, reason: collision with root package name */
    public final o06.v0 f333940a;

    /* renamed from: b, reason: collision with root package name */
    public final n06.e f333941b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f333942c;

    /* renamed from: d, reason: collision with root package name */
    public final f26.o0 f333943d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.x f333944e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.a f333945f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.x f333946g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.v f333947h;

    public b0(o06.v0 moduleDescriptor, e26.c0 storageManager, yz5.a settingsComputation) {
        kotlin.jvm.internal.o.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(settingsComputation, "settingsComputation");
        this.f333940a = moduleDescriptor;
        this.f333941b = n06.e.f333968a;
        e26.u uVar = (e26.u) storageManager;
        this.f333942c = uVar.b(settingsComputation);
        r06.t tVar = new r06.t(new n06.t(moduleDescriptor, new n16.c("java.io")), n16.g.k("Serializable"), o06.t0.f341988h, o06.h.f341961e, kz5.b0.c(new f26.u0(storageManager, new n06.u(this))), o06.x1.f342004a, false, storageManager);
        tVar.u0(y16.r.f458973b, kz5.r0.f314002d, null);
        f26.z0 k17 = tVar.k();
        kotlin.jvm.internal.o.f(k17, "getDefaultType(...)");
        this.f333943d = k17;
        this.f333944e = uVar.b(new n06.s(this, storageManager));
        this.f333945f = new e26.g(uVar, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), null);
        this.f333946g = uVar.b(new n06.a0(this));
        this.f333947h = uVar.c(new n06.v(this));
    }

    @Override // q06.b
    public java.util.Collection a(o06.g classDescriptor) {
        b16.r f17;
        java.util.Set a17;
        kotlin.jvm.internal.o.g(classDescriptor, "classDescriptor");
        boolean z17 = g().f333991b;
        kz5.r0 r0Var = kz5.r0.f314002d;
        return (!z17 || (f17 = f(classDescriptor)) == null || (a17 = f17.A().a()) == null) ? r0Var : a17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
    
        if (n06.e0.f333975g.contains(g16.v0.a(r8, r2, g16.w0.a(r13, false, false, 3, null))) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    @Override // q06.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection b(o06.g r17) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n06.b0.b(o06.g):java.util.Collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q06.f
    public boolean c(o06.g classDescriptor, o06.v1 functionDescriptor) {
        kotlin.jvm.internal.o.g(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.o.g(functionDescriptor, "functionDescriptor");
        b16.r f17 = f(classDescriptor);
        if (f17 == null || !((p06.b) functionDescriptor).getAnnotations().I(q06.g.f359480a)) {
            return true;
        }
        if (!g().f333991b) {
            return false;
        }
        java.lang.String a17 = g16.w0.a(functionDescriptor, false, false, 3, null);
        b16.e0 A = f17.A();
        n16.g name = ((r06.v) functionDescriptor).getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        java.util.Collection b17 = A.b(name, w06.d.f441946d);
        if (!(b17 instanceof java.util.Collection) || !b17.isEmpty()) {
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(g16.w0.a((o06.v1) it.next(), false, false, 3, null), a17)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x02cc, code lost:
    
        if (r6 != 4) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0246 A[SYNTHETIC] */
    @Override // q06.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection d(n16.g r20, o06.g r21) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n06.b0.d(n16.g, o06.g):java.util.Collection");
    }

    @Override // q06.b
    public java.util.Collection e(o06.g classDescriptor) {
        kotlin.jvm.internal.o.g(classDescriptor, "classDescriptor");
        n16.e h17 = v16.f.h(classDescriptor);
        n06.e0 e0Var = n06.e0.f333969a;
        boolean a17 = e0Var.a(h17);
        f26.o0 o0Var = this.f333943d;
        boolean z17 = true;
        if (a17) {
            f26.z0 z0Var = (f26.z0) e26.b0.a(this.f333944e, this, f333939i[1]);
            kotlin.jvm.internal.o.f(z0Var, "<get-cloneableType>(...)");
            return kz5.c0.i(z0Var, o0Var);
        }
        if (!e0Var.a(h17)) {
            n16.b g17 = n06.d.f333953a.g(h17);
            if (g17 != null) {
                try {
                    z17 = java.io.Serializable.class.isAssignableFrom(java.lang.Class.forName(g17.b().b()));
                } catch (java.lang.ClassNotFoundException unused) {
                    z17 = false;
                }
            }
            z17 = false;
        }
        return z17 ? kz5.b0.c(o0Var) : kz5.p0.f313996d;
    }

    public final b16.r f(o06.g gVar) {
        n16.b g17;
        n16.c b17;
        if (gVar == null) {
            l06.o.a(109);
            throw null;
        }
        n16.g gVar2 = l06.o.f314888e;
        if (l06.o.c(gVar, l06.w.f314918b) || !l06.o.L(gVar)) {
            return null;
        }
        n16.e h17 = v16.f.h(gVar);
        if (!h17.e() || (g17 = n06.d.f333953a.g(h17)) == null || (b17 = g17.b()) == null) {
            return null;
        }
        o06.g b18 = o06.s.b(g().f333990a, b17, w06.d.f441946d);
        if (b18 instanceof b16.r) {
            return (b16.r) b18;
        }
        return null;
    }

    public final n06.k g() {
        return (n06.k) e26.b0.a(this.f333942c, this, f333939i[0]);
    }
}
