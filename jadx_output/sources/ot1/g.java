package ot1;

/* loaded from: classes12.dex */
public abstract class g implements java.lang.Iterable, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.Cursor f348836d;

    public g(android.database.Cursor cursor) {
        this.f348836d = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f348836d.close();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new ot1.f(this, null);
    }

    public abstract java.lang.Object j(android.database.Cursor cursor);
}
