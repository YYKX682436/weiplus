package j06;

/* loaded from: classes16.dex */
public final class r0 implements j06.k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f297083a;

    /* renamed from: b, reason: collision with root package name */
    public final j06.k f297084b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Member f297085c;

    /* renamed from: d, reason: collision with root package name */
    public final j06.p0 f297086d;

    /* renamed from: e, reason: collision with root package name */
    public final e06.k[] f297087e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f297088f;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if ((r4 != null && l06.o.H(r4)) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0117, code lost:
    
        if ((r12 instanceof j06.i) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030e A[EDGE_INSN: B:71:0x030e->B:53:0x030e BREAK  A[LOOP:2: B:57:0x02ee->B:68:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba A[LOOP:3: B:94:0x01b4->B:96:0x01ba, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(o06.d r11, j06.k r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.r0.<init>(o06.d, j06.k, boolean):void");
    }

    @Override // j06.k
    public java.util.List a() {
        return this.f297084b.a();
    }

    @Override // j06.k
    public java.lang.reflect.Member b() {
        return this.f297085c;
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        java.lang.Object invoke;
        java.lang.Object obj;
        java.lang.Object e17;
        kotlin.jvm.internal.o.g(args, "args");
        j06.p0 p0Var = this.f297086d;
        e06.k kVar = p0Var.f297075a;
        java.util.List[] listArr = p0Var.f297076b;
        java.lang.reflect.Method method = p0Var.f297077c;
        if (!kVar.isEmpty()) {
            boolean z17 = this.f297088f;
            int i17 = kVar.f246210e;
            int i18 = kVar.f246209d;
            if (z17) {
                lz5.e eVar = new lz5.e(args.length);
                for (int i19 = 0; i19 < i18; i19++) {
                    eVar.add(args[i19]);
                }
                if (i18 <= i17) {
                    while (true) {
                        java.util.List<java.lang.reflect.Method> list = listArr[i18];
                        java.lang.Object obj2 = args[i18];
                        if (list != null) {
                            for (java.lang.reflect.Method method2 : list) {
                                if (obj2 != null) {
                                    e17 = method2.invoke(obj2, new java.lang.Object[0]);
                                } else {
                                    java.lang.Class<?> returnType = method2.getReturnType();
                                    kotlin.jvm.internal.o.f(returnType, "getReturnType(...)");
                                    e17 = i06.o4.e(returnType);
                                }
                                eVar.add(e17);
                            }
                        } else {
                            eVar.add(obj2);
                        }
                        if (i18 == i17) {
                            break;
                        }
                        i18++;
                    }
                }
                int i27 = i17 + 1;
                int length = args.length - 1;
                if (i27 <= length) {
                    while (true) {
                        eVar.add(args[i27]);
                        if (i27 == length) {
                            break;
                        }
                        i27++;
                    }
                }
                args = kz5.b0.a(eVar).toArray(new java.lang.Object[0]);
            } else {
                int length2 = args.length;
                java.lang.Object[] objArr = new java.lang.Object[length2];
                int i28 = 0;
                while (i28 < length2) {
                    if (i28 <= i17 && i18 <= i28) {
                        java.util.List list2 = listArr[i28];
                        java.lang.reflect.Method method3 = list2 != null ? (java.lang.reflect.Method) kz5.n0.z0(list2) : null;
                        obj = args[i28];
                        if (method3 != null) {
                            if (obj != null) {
                                obj = method3.invoke(obj, new java.lang.Object[0]);
                            } else {
                                java.lang.Class<?> returnType2 = method3.getReturnType();
                                kotlin.jvm.internal.o.f(returnType2, "getReturnType(...)");
                                obj = i06.o4.e(returnType2);
                            }
                        }
                    } else {
                        obj = args[i28];
                    }
                    objArr[i28] = obj;
                    i28++;
                }
                args = objArr;
            }
        }
        java.lang.Object call = this.f297084b.call(args);
        return (call == pz5.a.f359186d || method == null || (invoke = method.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // j06.k
    public java.lang.reflect.Type getReturnType() {
        return this.f297084b.getReturnType();
    }
}
