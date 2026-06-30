package ze5;

/* loaded from: classes9.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472238e;

    public v(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f472237d = dVar;
        this.f472238e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 f9Var = this.f472238e;
        com.tencent.mm.ui.chatting.viewitems.s1.b(this.f472237d, f9Var, g95.e0.f(f9Var));
    }
}
