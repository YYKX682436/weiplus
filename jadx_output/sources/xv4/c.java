package xv4;

/* loaded from: classes.dex */
public class c implements java.lang.Iterable {
    public c(xv4.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new xv4.b(this, null);
    }
}
