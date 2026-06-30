package ze5;

/* loaded from: classes9.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472090e;

    public m5(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f472089d = dVar;
        this.f472090e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 f9Var = this.f472090e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(this.f472089d, f9Var, g95.e0.f(f9Var));
    }
}
