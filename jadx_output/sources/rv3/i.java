package rv3;

/* loaded from: classes5.dex */
public final class i extends rv3.e {

    /* renamed from: m, reason: collision with root package name */
    public final int f400400m;

    public i(yz5.p pVar, ev3.b bVar, boolean z17, boolean z18) {
        super(pVar, bVar, z17, z18);
        this.f400400m = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.FG_2);
    }

    @Override // rv3.e
    public void q(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        if (z17) {
            super.q(textView, true);
        } else {
            textView.setTextColor(this.f400400m);
        }
    }

    @Override // rv3.e
    public void r(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        if (z17) {
            super.r(textView, true);
        } else {
            textView.setTextColor(this.f400400m);
        }
    }

    @Override // rv3.e
    public void v(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        if (z17) {
            super.v(textView, true);
        } else {
            textView.setTextColor(this.f400400m);
        }
    }
}
