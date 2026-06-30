package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class p0 extends oz5.a implements oz5.f {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.o0 f310563d = new kotlinx.coroutines.o0(null);

    public p0() {
        super(oz5.e.f350327d);
    }

    public abstract void D(oz5.l lVar, java.lang.Runnable runnable);

    public void F(oz5.l lVar, java.lang.Runnable runnable) {
        D(lVar, runnable);
    }

    public boolean I(oz5.l lVar) {
        return !(this instanceof kotlinx.coroutines.b4);
    }

    public kotlinx.coroutines.p0 J(int i17) {
        kotlinx.coroutines.internal.l.a(i17);
        return new kotlinx.coroutines.internal.k(this, i17);
    }

    @Override // oz5.a, oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        if (key instanceof oz5.b) {
            oz5.b bVar = (oz5.b) key;
            oz5.j key2 = getKey();
            kotlin.jvm.internal.o.g(key2, "key");
            if (key2 == bVar || bVar.f350323e == key2) {
                oz5.i iVar = (oz5.i) bVar.f350322d.invoke(this);
                if (iVar instanceof oz5.i) {
                    return iVar;
                }
            }
        } else if (oz5.e.f350327d == key) {
            return this;
        }
        return null;
    }

    @Override // oz5.a, oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        boolean z17 = key instanceof oz5.b;
        oz5.m mVar = oz5.m.f350329d;
        if (z17) {
            oz5.b bVar = (oz5.b) key;
            oz5.j key2 = getKey();
            kotlin.jvm.internal.o.g(key2, "key");
            if ((key2 == bVar || bVar.f350323e == key2) && ((oz5.i) bVar.f350322d.invoke(this)) != null) {
                return mVar;
            }
        } else if (oz5.e.f350327d == key) {
            return mVar;
        }
        return this;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + kotlinx.coroutines.c1.a(this);
    }
}
