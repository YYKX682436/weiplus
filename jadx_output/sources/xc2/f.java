package xc2;

/* loaded from: classes2.dex */
public final class f extends xc2.j {
    @Override // xc2.j
    public void l() {
        xc2.p0 p0Var = this.f453162b;
        if (p0Var != null) {
            p0Var.f453262x = true;
            xc2.y2.f453343a.r0(p0Var);
        }
    }

    @Override // xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        xc2.y2 y2Var = xc2.y2.f453343a;
        int m17 = y2Var.m(0, infoEx.f453234a);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xc2.y2.W(y2Var, context, infoEx, holder, m17, false, false, 48, null);
    }

    @Override // xc2.j
    public boolean u() {
        return true;
    }
}
