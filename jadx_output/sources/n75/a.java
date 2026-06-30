package n75;

/* loaded from: classes4.dex */
public abstract class a extends androidx.lifecycle.c1 implements androidx.lifecycle.m1, n75.b {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.l1 f335457d = new androidx.lifecycle.l1();

    public abstract java.util.Set N6();

    @Override // androidx.lifecycle.m1
    public androidx.lifecycle.l1 getViewModelStore() {
        return this.f335457d;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f335457d.a();
    }
}
