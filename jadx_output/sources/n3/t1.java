package n3;

/* loaded from: classes3.dex */
public final class t1 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f334411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f334412e;

    public t1(android.view.ViewGroup viewGroup) {
        this.f334412e = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334411d < this.f334412e.getChildCount();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334411d;
        this.f334411d = i17 + 1;
        android.view.View childAt = this.f334412e.getChildAt(i17);
        if (childAt != null) {
            return childAt;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i17 = this.f334411d - 1;
        this.f334411d = i17;
        this.f334412e.removeViewAt(i17);
    }
}
