package eg2;

/* loaded from: classes6.dex */
public class c implements java.lang.Iterable {
    public c(eg2.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new eg2.b(this, null);
    }
}
