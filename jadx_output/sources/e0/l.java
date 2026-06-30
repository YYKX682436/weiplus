package e0;

/* loaded from: classes14.dex */
public final class l implements t1.d, s1.f {

    /* renamed from: d, reason: collision with root package name */
    public final e0.f1 f245639d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.j f245640e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f245641f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.s f245642g;

    public l(e0.f1 state, e0.j beyondBoundsInfo, boolean z17, p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(beyondBoundsInfo, "beyondBoundsInfo");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        this.f245639d = state;
        this.f245640e = beyondBoundsInfo;
        this.f245641f = z17;
        this.f245642g = layoutDirection;
    }

    public static final boolean b(e0.i iVar, e0.l lVar) {
        return iVar.f245596b < lVar.f245639d.f().a() - 1;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final boolean a(e0.i iVar, int i17) {
        if (!(i17 == 1)) {
            if (i17 == 2) {
                return b(iVar, this);
            }
            boolean z17 = i17 == 5;
            boolean z18 = this.f245641f;
            if (!z17) {
                if (!(i17 == 6)) {
                    boolean z19 = i17 == 3;
                    p2.s sVar = this.f245642g;
                    if (z19) {
                        int ordinal = sVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new jz5.j();
                            }
                            if (!z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f245595a <= 0) {
                                return false;
                            }
                        } else {
                            if (z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f245595a <= 0) {
                                return false;
                            }
                        }
                    } else {
                        if (!(i17 == 4)) {
                            throw new java.lang.IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int ordinal2 = sVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new jz5.j();
                            }
                            if (z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f245595a <= 0) {
                                return false;
                            }
                        } else {
                            if (!z18) {
                                return b(iVar, this);
                            }
                            if (iVar.f245595a <= 0) {
                                return false;
                            }
                        }
                    }
                } else {
                    if (!z18) {
                        return b(iVar, this);
                    }
                    if (iVar.f245595a <= 0) {
                        return false;
                    }
                }
            } else {
                if (z18) {
                    return b(iVar, this);
                }
                if (iVar.f245595a <= 0) {
                    return false;
                }
            }
        } else if (iVar.f245595a <= 0) {
            return false;
        }
        return true;
    }

    @Override // t1.d
    public t1.f getKey() {
        return s1.h.f402012a;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
