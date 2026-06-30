package d0;

/* loaded from: classes14.dex */
public final class n0 extends d0.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0.b f225177a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(z0.b horizontal) {
        super(null);
        kotlin.jvm.internal.o.g(horizontal, "horizontal");
        this.f225177a = horizontal;
    }

    @Override // d0.p0
    public int a(int i17, p2.s layoutDirection, s1.o1 placeable, int i18) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(placeable, "placeable");
        return ((z0.e) this.f225177a).a(0, i17, layoutDirection);
    }
}
