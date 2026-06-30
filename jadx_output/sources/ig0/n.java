package ig0;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig0.o f291331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f291332e;

    public n(ig0.o oVar, com.tencent.mm.storage.f9 f9Var) {
        this.f291331d = oVar;
        this.f291332e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dg0.e eVar;
        c01.v8 v8Var;
        ig0.o oVar = this.f291331d;
        java.lang.ref.WeakReference weakReference = oVar.f291334n;
        com.tencent.mm.storage.f9 f9Var = this.f291332e;
        if (weakReference != null && (v8Var = (c01.v8) weakReference.get()) != null) {
            v8Var.a(f9Var);
        }
        java.lang.ref.WeakReference weakReference2 = oVar.f291335o;
        if (weakReference2 == null || (eVar = (dg0.e) weakReference2.get()) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.v0) eVar).p(f9Var);
    }
}
