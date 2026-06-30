package d0;

/* loaded from: classes14.dex */
public final class o0 extends d0.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0.c f225181a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(z0.c vertical) {
        super(null);
        kotlin.jvm.internal.o.g(vertical, "vertical");
        this.f225181a = vertical;
    }

    @Override // d0.p0
    public int a(int i17, p2.s layoutDirection, s1.o1 placeable, int i18) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(placeable, "placeable");
        return ((z0.f) this.f225181a).a(0, i17);
    }
}
