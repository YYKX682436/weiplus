package oz5;

/* loaded from: classes14.dex */
public final class d implements oz5.l, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f350325d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.i f350326e;

    public d(oz5.l left, oz5.i element) {
        kotlin.jvm.internal.o.g(left, "left");
        kotlin.jvm.internal.o.g(element, "element");
        this.f350325d = left;
        this.f350326e = element;
    }

    public boolean equals(java.lang.Object obj) {
        boolean z17;
        if (this != obj) {
            if (!(obj instanceof oz5.d)) {
                return false;
            }
            oz5.d dVar = (oz5.d) obj;
            dVar.getClass();
            int i17 = 2;
            oz5.d dVar2 = dVar;
            int i18 = 2;
            while (true) {
                oz5.l lVar = dVar2.f350325d;
                dVar2 = lVar instanceof oz5.d ? (oz5.d) lVar : null;
                if (dVar2 == null) {
                    break;
                }
                i18++;
            }
            oz5.d dVar3 = this;
            while (true) {
                oz5.l lVar2 = dVar3.f350325d;
                dVar3 = lVar2 instanceof oz5.d ? (oz5.d) lVar2 : null;
                if (dVar3 == null) {
                    break;
                }
                i17++;
            }
            if (i18 != i17) {
                return false;
            }
            oz5.d dVar4 = this;
            while (true) {
                oz5.i iVar = dVar4.f350326e;
                if (!kotlin.jvm.internal.o.b(dVar.get(iVar.getKey()), iVar)) {
                    z17 = false;
                    break;
                }
                oz5.l lVar3 = dVar4.f350325d;
                if (!(lVar3 instanceof oz5.d)) {
                    kotlin.jvm.internal.o.e(lVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    oz5.i iVar2 = (oz5.i) lVar3;
                    z17 = kotlin.jvm.internal.o.b(dVar.get(iVar2.getKey()), iVar2);
                    break;
                }
                dVar4 = (oz5.d) lVar3;
            }
            if (!z17) {
                return false;
            }
        }
        return true;
    }

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this.f350325d.fold(obj, operation), this.f350326e);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        oz5.d dVar = this;
        while (true) {
            oz5.i iVar = dVar.f350326e.get(key);
            if (iVar != null) {
                return iVar;
            }
            oz5.l lVar = dVar.f350325d;
            if (!(lVar instanceof oz5.d)) {
                return lVar.get(key);
            }
            dVar = (oz5.d) lVar;
        }
    }

    public int hashCode() {
        return this.f350325d.hashCode() + this.f350326e.hashCode();
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        oz5.i iVar = this.f350326e;
        oz5.i iVar2 = iVar.get(key);
        oz5.l lVar = this.f350325d;
        if (iVar2 != null) {
            return lVar;
        }
        oz5.l minusKey = lVar.minusKey(key);
        return minusKey == lVar ? this : minusKey == oz5.m.f350329d ? iVar : new oz5.d(minusKey, iVar);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l lVar) {
        return oz5.g.a(this, lVar);
    }

    public java.lang.String toString() {
        return "[" + ((java.lang.String) fold("", oz5.c.f350324d)) + ']';
    }
}
