package ze5;

/* loaded from: classes9.dex */
public final class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471820e;

    public a7(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f471819d = dVar;
        this.f471820e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 f9Var = this.f471820e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(this.f471819d, f9Var, g95.e0.f(f9Var));
    }
}
