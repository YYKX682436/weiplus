package ru3;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f399754a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f399755b = ru3.d.f399752d;

    public final void a() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f399754a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f399754a = null;
    }

    public final void b(android.content.Context context, boolean z17, int i17, yz5.a cancel) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(cancel, "cancel");
        this.f399755b = cancel;
        if (this.f399754a == null) {
            this.f399754a = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(i17), z17, 0, new ru3.e(this));
        }
    }
}
