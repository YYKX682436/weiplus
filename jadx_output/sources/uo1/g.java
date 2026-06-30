package uo1;

/* loaded from: classes5.dex */
public final class g implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f429563a;

    public g(kotlin.jvm.internal.f0 f0Var) {
        this.f429563a = f0Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        kotlin.jvm.internal.f0 f0Var = this.f429563a;
        f0Var.f310116d = z17 ? f0Var.f310116d | 2 : f0Var.f310116d & (-3);
    }
}
