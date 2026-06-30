package vm;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437974d = 0;

    public e(vm.f fVar, vm.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437974d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437974d;
        this.f437974d = i17 + 1;
        if (i17 == 0) {
            return vm.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
