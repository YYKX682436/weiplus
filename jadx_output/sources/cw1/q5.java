package cw1;

/* loaded from: classes12.dex */
public final class q5 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f223277c;

    public q5(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f223277c = items;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        return ((cw1.o5) this.f223277c.get(i17)).f223202b ? 2 : 1;
    }
}
