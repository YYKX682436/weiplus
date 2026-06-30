package kv4;

/* loaded from: classes12.dex */
public final class f0 implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.p f312698a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f312699b;

    public f0(rv4.p data, kv4.m delegate) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f312698a = data;
        this.f312699b = delegate;
    }

    @Override // jv4.n
    public void c(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kv4.d dVar = holder instanceof kv4.d ? (kv4.d) holder : null;
        if (dVar == null) {
            return;
        }
        rv4.p pVar = this.f312698a;
        pVar.f400538m = pVar.f400537l;
        android.view.View view = dVar.f312691d;
        view.getMeasuredHeight();
        pVar.getClass();
        com.tencent.mm.ui.kk.f(view, pVar.f400538m);
        java.lang.Object value = ((jz5.n) dVar.f312692e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.View) value).setOnClickListener(new kv4.d0(this));
    }

    @Override // jv4.n
    public jv4.m getType() {
        return jv4.m.f302253s;
    }

    @Override // nv4.g
    public java.lang.String v() {
        jv4.l lVar = jv4.m.f302242e;
        return "10-".concat(kz5.n0.g0(this.f312698a.f400528c, "-", null, null, 0, null, kv4.e0.f312696d, 30, null));
    }

    @Override // nv4.g
    public void w() {
        rv4.p pVar = this.f312698a;
        pVar.getClass();
        pVar.getClass();
        pVar.k(vu4.a.f440239f, vu4.b.B, "", pVar.f400531f, pVar.g(false, null, false));
    }
}
