package va;

/* loaded from: classes16.dex */
public final class k extends va.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va.z f434192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(va.z zVar) {
        super(null);
        this.f434192d = zVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f434192d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f434192d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f434192d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new va.j(this.f434192d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        return this.f434192d.remove(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f434192d.size();
    }
}
