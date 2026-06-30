package kv;

/* loaded from: classes6.dex */
public class c implements java.lang.Iterable {
    public c(kv.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new kv.b(this, null);
    }
}
