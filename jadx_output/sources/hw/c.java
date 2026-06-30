package hw;

/* loaded from: classes6.dex */
public class c implements java.lang.Iterable {
    public c(hw.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new hw.b(this, null);
    }
}
