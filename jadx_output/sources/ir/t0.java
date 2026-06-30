package ir;

/* loaded from: classes15.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f293901a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f293902b;

    /* renamed from: c, reason: collision with root package name */
    public ir.o0 f293903c;

    public abstract ir.k0 a();

    public abstract ir.k0 b();

    public androidx.recyclerview.widget.c0 c(java.util.List oldItemList, java.util.List newItemList) {
        kotlin.jvm.internal.o.g(oldItemList, "oldItemList");
        kotlin.jvm.internal.o.g(newItemList, "newItemList");
        return androidx.recyclerview.widget.h0.a(new ir.p0(oldItemList, newItemList), false);
    }

    public final void d(ir.k0 newData, androidx.recyclerview.widget.c0 diff) {
        kotlin.jvm.internal.o.g(newData, "newData");
        kotlin.jvm.internal.o.g(diff, "diff");
        pm0.v.X(new ir.r0(this, newData, diff));
    }

    public final synchronized void e() {
        if (this.f293902b) {
            this.f293901a = true;
        } else {
            if (this.f293903c == null) {
                return;
            }
            this.f293902b = true;
            pm0.v.L("PanelGroupModel_postUpdate", true, new ir.s0(this));
        }
    }

    public abstract void f(ir.k0 k0Var);

    public final void g(ir.o0 o0Var) {
        if (kotlin.jvm.internal.o.b(this.f293903c, o0Var)) {
            return;
        }
        this.f293903c = o0Var;
        if (o0Var != null) {
            e();
        }
    }

    public void h() {
        if (this.f293903c == null) {
            this.f293902b = false;
            this.f293901a = true;
        } else {
            ir.k0 a17 = a();
            androidx.recyclerview.widget.c0 c17 = c(b().b(), a17.b());
            f(a17);
            d(a17, c17);
        }
    }
}
