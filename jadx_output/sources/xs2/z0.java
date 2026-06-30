package xs2;

/* loaded from: classes3.dex */
public final class z0 extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f456397d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f456398e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f456399f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f456400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f456397d = itemView;
        this.f456398e = jz5.h.b(xs2.x0.f456394d);
        this.f456399f = jz5.h.b(new xs2.y0(this));
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483517b25);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456400g = (android.widget.TextView) findViewById;
    }

    @Override // yp.o
    public void e(int i17, int i18) {
        int intValue = ((java.lang.Number) ((jz5.n) this.f456399f).getValue()).intValue();
        if (i17 < intValue) {
            i17 = intValue;
        }
        super.e(i17, i18);
    }
}
