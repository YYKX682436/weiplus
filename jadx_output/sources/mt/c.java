package mt;

/* loaded from: classes.dex */
public class c implements java.lang.Iterable {
    public c(mt.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new mt.b(this, null);
    }
}
