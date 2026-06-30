package zg2;

/* loaded from: classes3.dex */
public final class d extends androidx.lifecycle.j0 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.p f472822d;

    public d(yz5.p pVar, int i17, kotlin.jvm.internal.i iVar) {
        this.f472822d = (i17 & 1) != 0 ? null : pVar;
    }

    @Override // androidx.lifecycle.g0
    public void observe(androidx.lifecycle.y owner, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        super.observe(owner, new zg2.c(this, observer));
    }

    @Override // androidx.lifecycle.g0
    public void observeForever(androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        super.observeForever(new zg2.c(this, observer));
    }
}
