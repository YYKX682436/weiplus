package vz5;

/* loaded from: classes7.dex */
public final class r implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f441803d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz5.s f441805f;

    public r(vz5.s sVar) {
        this.f441805f = sVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f441803d == null && !this.f441804e) {
            java.lang.String readLine = this.f441805f.f441806a.readLine();
            this.f441803d = readLine;
            if (readLine == null) {
                this.f441804e = true;
            }
        }
        return this.f441803d != null;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.f441803d;
        this.f441803d = null;
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
