package ze5;

/* loaded from: classes9.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471997e;

    public i4(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f471996d = dVar;
        this.f471997e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 f9Var = this.f471997e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(this.f471996d, f9Var, g95.e0.f(f9Var));
    }
}
