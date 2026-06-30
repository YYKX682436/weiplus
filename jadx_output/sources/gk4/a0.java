package gk4;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f272533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272534e;

    public a0(yz5.l lVar, gk4.h0 h0Var) {
        this.f272533d = lVar;
        this.f272534e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f272533d;
        if (lVar != null) {
            lVar.invoke(this.f272534e.f272570o);
        }
    }
}
