package vu5;

/* loaded from: classes12.dex */
public abstract class b implements vu5.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f440345d = new java.util.concurrent.atomic.AtomicBoolean(false);

    public abstract vu5.a b();

    public wu5.c c(wu5.l lVar) {
        if (this.f440345d.get()) {
            ku5.o.f312597a.b(lVar.getKey(), lVar.f449858s, getName(), true);
            return null;
        }
        if (!lVar.isCancelled()) {
            b().a(lVar);
            return lVar;
        }
        ku5.o.f312599c.w(getName(), "[BasePool#input] task=%s pool=%s", lVar.getKey() + "#" + lVar.f449858s, getName());
        return null;
    }
}
