package cp3;

/* loaded from: classes.dex */
public class c implements java.lang.Iterable {
    public c(cp3.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new cp3.b(this, null);
    }
}
