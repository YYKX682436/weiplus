package cw1;

/* loaded from: classes12.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f222937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f222938e;

    public f6(kotlin.jvm.internal.c0 c0Var, cw1.l6 l6Var) {
        this.f222937d = c0Var;
        this.f222938e = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f222937d.f310112d) {
            return;
        }
        cw1.l6.b(this.f222938e);
    }
}
