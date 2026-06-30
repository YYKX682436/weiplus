package n0;

/* loaded from: classes14.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.l3 f333587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0.a f333589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(n0.l3 l3Var, int i17, o0.a aVar) {
        super(1);
        this.f333587d = l3Var;
        this.f333588e = i17;
        this.f333589f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o0.b bVar;
        o0.b bVar2;
        n0.f1 composition = (n0.f1) obj;
        kotlin.jvm.internal.o.g(composition, "composition");
        n0.l3 l3Var = this.f333587d;
        int i17 = l3Var.f333609e;
        int i18 = this.f333588e;
        if (i17 == i18) {
            o0.a aVar = l3Var.f333610f;
            o0.a aVar2 = this.f333589f;
            if (kotlin.jvm.internal.o.b(aVar2, aVar) && (composition instanceof n0.j1)) {
                int i19 = aVar2.f341830a;
                int i27 = 0;
                for (int i28 = 0; i28 < i19; i28++) {
                    java.lang.Object obj2 = aVar2.f341831b[i28];
                    if (obj2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    int i29 = aVar2.f341832c[i28];
                    boolean z17 = i29 != i18;
                    if (z17) {
                        ((n0.j1) composition).f333552m.c(obj2, l3Var);
                        n0.y1 y1Var = obj2 instanceof n0.y1 ? (n0.y1) obj2 : null;
                        if (y1Var != null && (bVar = l3Var.f333611g) != null) {
                            int a17 = bVar.a(y1Var);
                            if (a17 >= 0) {
                                int i37 = bVar.f341835c;
                                java.lang.Object[] objArr = bVar.f341833a;
                                java.lang.Object[] objArr2 = bVar.f341834b;
                                int i38 = a17 + 1;
                                kz5.v.k(objArr, objArr, a17, i38, i37);
                                kz5.v.k(objArr2, objArr2, a17, i38, i37);
                                int i39 = i37 - 1;
                                bVar2 = null;
                                objArr[i39] = null;
                                objArr2[i39] = null;
                                bVar.f341835c = i39;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar.f341835c == 0) {
                                l3Var.f333611g = bVar2;
                            }
                        }
                    }
                    if (!z17) {
                        if (i27 != i28) {
                            aVar2.f341831b[i27] = obj2;
                            aVar2.f341832c[i27] = i29;
                        }
                        i27++;
                    }
                }
                int i47 = aVar2.f341830a;
                for (int i48 = i27; i48 < i47; i48++) {
                    aVar2.f341831b[i48] = null;
                }
                aVar2.f341830a = i27;
                if (i27 == 0) {
                    l3Var.f333610f = null;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
