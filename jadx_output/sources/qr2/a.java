package qr2;

/* loaded from: classes2.dex */
public final class a extends in5.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f366063d;

    public a(java.util.ArrayList collection) {
        kotlin.jvm.internal.o.g(collection, "collection");
        this.f366063d = collection;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f366063d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return qr2.a.class.hashCode();
    }
}
