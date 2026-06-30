package qi2;

/* loaded from: classes3.dex */
public final class o0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f363596d;

    public o0(qi2.w0 w0Var) {
        this.f363596d = w0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        qi2.w0 w0Var = this.f363596d;
        vi2.f fVar = (vi2.f) kz5.n0.a0(w0Var.f363650n, i17);
        if (fVar != null) {
            w0Var.f363651o = fVar.f437545d;
        }
        w0Var.f363648i.invoke(w0Var.f363651o);
        w0Var.a();
    }
}
