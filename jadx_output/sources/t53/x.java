package t53;

/* loaded from: classes8.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f415837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f415838e;

    public x(kotlin.jvm.internal.h0 h0Var, android.content.Context context) {
        this.f415837d = h0Var;
        this.f415838e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f415838e;
        this.f415837d.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getResources().getString(com.tencent.mm.R.string.f490604zq), false, 0, t53.w.f415836d);
    }
}
