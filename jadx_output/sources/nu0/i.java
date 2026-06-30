package nu0;

/* loaded from: classes5.dex */
public final class i extends du0.g {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f339958i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339958i = jz5.h.b(new nu0.h(this));
    }

    public final java.util.Map U6() {
        return (java.util.Map) ((jz5.n) this.f339958i).getValue();
    }

    public final void V6(java.lang.String str, java.lang.String str2, java.util.Map map) {
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Bj(str, str2, map, 1, false);
    }

    public final void W6(int i17) {
        V6("edit_material", "view_clk", kz5.c1.m(kz5.c1.l(new jz5.l("clk_way", java.lang.Integer.valueOf(i17))), U6()));
    }
}
