package p16;

/* loaded from: classes.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f351268d;

    public a0(java.util.Iterator it) {
        this.f351268d = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351268d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f351268d.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f351268d.remove();
    }
}
