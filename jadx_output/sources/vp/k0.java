package vp;

/* loaded from: classes14.dex */
public final class k0 extends vp.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final wp.a f438810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wp.a danmaku) {
        super(null);
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        this.f438810a = danmaku;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp.k0) && kotlin.jvm.internal.o.b(this.f438810a, ((vp.k0) obj).f438810a);
    }

    public int hashCode() {
        return this.f438810a.hashCode();
    }

    public java.lang.String toString() {
        return "AddDanmaku(danmaku=" + this.f438810a + ')';
    }
}
