package vp;

/* loaded from: classes14.dex */
public final class l0 extends vp.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final wp.a f438811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(wp.a danmaku) {
        super(null);
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        this.f438811a = danmaku;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp.l0) && kotlin.jvm.internal.o.b(this.f438811a, ((vp.l0) obj).f438811a);
    }

    public int hashCode() {
        return this.f438811a.hashCode();
    }

    public java.lang.String toString() {
        return "AddFollowDanmaku(danmaku=" + this.f438811a + ')';
    }
}
